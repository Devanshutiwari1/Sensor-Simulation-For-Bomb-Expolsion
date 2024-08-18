package net;

import files.Networkdetail;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

public class UDPcli {

    public static void main(String[] args) throws Exception {
        int port =  11100;
    	Random random = new Random();
        Networkdetail sen = new Networkdetail();
        try (DatagramSocket ds = new DatagramSocket()) {
            InetAddress ia = InetAddress.getLocalHost();
            
            System.out.println(".... Client 1st Code Is Running ....");
            System.out.println("");
            System.out.println("-->> Client 1st is sending packet...");
            System.out.println("");
            
            long startTime = System.currentTimeMillis();
            long duration = 10000; // 10 seconds
            
            while (System.currentTimeMillis() - startTime < duration) {
                
                // random number
                int randomint = random.nextInt(101);
                System.out.println("Random Integer (0 to 99): " + randomint);
                
                int sensor_num = 1;
                String sensor_health;
                int capacity = 0;
                int site_on_going = (randomint % 10); // 0 for ALert & else for Safe !!
                if(site_on_going == 0) {
                    sensor_health = "CRITICAL";
                    capacity = 80 ;
                }
                else {
                    sensor_health = "BEST";
                }
                
                // Update time-related information
                sen.updateTimeInfo();
                
                sen.disp_lat(sen.latitude);
                System.out.println();
                
                sen.disp_long(sen.longitude);
                System.out.println();
                
                sen.disp_time_format();
                System.out.println();
                
                sen.disp_date();
                System.out.println();
                
                sen.disp_current_time();
                System.out.println();
                
                sen.disp_lattime(sen.latitude);
                System.out.println();
                
                sen.disp_longtime(sen.longitude);
                System.out.println();
                
                StringBuilder dataToSend = new StringBuilder();
                
                // Gather and format the data
                dataToSend.append(sensor_num).append(",");
                dataToSend.append(sen.latitude).append(",");
                dataToSend.append(sen.longitude).append(",");
                dataToSend.append(sen.timeZoneOffset).append(",");
                dataToSend.append(sen.today).append(",");
                dataToSend.append(sen.formattedTime).append(",");
                dataToSend.append(site_on_going).append(",");
                dataToSend.append(sensor_health).append(",");
                dataToSend.append(capacity).append(",");
                
                // Convert the formatted data to a byte array
                byte[] b = dataToSend.toString().getBytes();
                
                DatagramPacket dp = new DatagramPacket(b, b.length, ia,port);
                ds.send(dp);
                System.out.println("");
                
                // Sleep for a while before sending the next packet
                Thread.sleep(500); // 1 second
                System.out.println("--------------------");
            }
            System.out.println("-->> Packet of 1st client is sent -->> Executed::::");
        }
        System.out.println("Client stopped sending packets.");
    }
}
