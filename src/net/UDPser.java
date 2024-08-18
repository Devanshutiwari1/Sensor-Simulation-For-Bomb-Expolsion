package net;

import Databasefiles.Databasehandler;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.sql.SQLException;
import serverfiles.Networkinfoserver;

public class UDPser {

    private static DatagramSocket ds = null;
    private static DatagramPacket dp = null;

    public static void main(String[] args) {
        int port = 11100;
        byte[] receive = new byte[1024];

        try {
            ds = new DatagramSocket(null);
            ds.setReuseAddress(true);  // Enable port reuse
            ds.bind(new java.net.InetSocketAddress(port));  // Bind to the specific port
            dp = new DatagramPacket(receive, receive.length);

            System.out.println("Server is running on port: " + port);

            Databasehandler dbHandler = new Databasehandler();
            Networkinfoserver nis = new Networkinfoserver();

            // Thread to handle the server running
            Thread serverThread = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        System.out.println("Waiting to receive data...");
                        ds.receive(dp);
                        String receivedData = new String(dp.getData(), 0, dp.getLength());
                        System.out.println("Received Data: " + receivedData);

                        String[] dataParts = receivedData.split(",");

                        String sensor_num = dataParts[0];
                        int num = Integer.parseInt(sensor_num);
                        String latitudeStr = dataParts[1];
                        double latitude = Double.parseDouble(latitudeStr);
                        String longitudeStr = dataParts[2];
                        double longitude = Double.parseDouble(longitudeStr);
                        String time = dataParts[3];
                        String date = dataParts[4];
                        String currentTime = dataParts[5];
                        String site_update = dataParts[6];
                        int site = Integer.parseInt(site_update.trim());
                        site_update = site == 0 ? "NOT-SAFE" : "SAFE";
                        String sen_health = dataParts[7];
                        String capa = dataParts[8];
                        int capacity = Integer.parseInt(capa.trim());

                        System.out.println("----------------------");
                        System.out.println();
                        System.out.println("-->> Receiving Data From Sensor " + num);
                        System.out.println("");
                        if (site == 0) {
                            System.out.println("--> !! ALERT !! SOMETHING DETECTED WRONG  ");
                            System.out.println("--> Capacity of Explosion :: " + capacity + " KT ");
                            System.out.println("");
                        } else {
                            System.out.println("--> Safe No Problem");
                            System.out.println("");
                        }
                        System.out.println("-->> Health :: " + sen_health );

                        System.out.println("-->> Date: " + date);
                        System.out.println("");
                        System.out.print("-->> Time format : " + time);
                        System.out.println("\t\t-->> Real Time At Loc.. : " + currentTime);
                        System.out.println("");
                        System.out.print("-->> Latitude: " + latitudeStr + "° N");
                        System.out.println("\t\t-->> Longitude: " + longitudeStr + "° E");
                        System.out.println("");
                        nis.disp_lattime(latitudeStr);
                        System.out.println("");
                        nis.disp_longtime(longitudeStr);

                        try {
                            dbHandler.insertSensorData(num, latitude, longitude, date, currentTime, site_update,
                                    sen_health, capacity);
                            System.out.println("Data inserted successfully");
                        } catch (SQLException e) {
                            System.out.println("Database error: " + e.getMessage());
                        }
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Error receiving data: " + e.getMessage());
                        e.printStackTrace();
                    }
                }
            });

            // Start the server thread
            serverThread.start();

            // Add shutdown hook to close socket and stop server on interrupt
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Shutdown hook triggered, stopping server...");
                serverThread.interrupt();
                if (ds != null && !ds.isClosed()) {
                    ds.close();
                    System.out.println("DatagramSocket closed, port is now free.");
                }
            }));

            // Main thread waits for the server thread to finish
            serverThread.join();

        } catch (SocketException e) {
            System.out.println("Error binding to port: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Server interrupted: " + e.getMessage());
        } finally {
            if (ds != null && !ds.isClosed()) {
                ds.close();
                System.out.println("DatagramSocket closed, port is now free.");
            }
        }
    }
}
