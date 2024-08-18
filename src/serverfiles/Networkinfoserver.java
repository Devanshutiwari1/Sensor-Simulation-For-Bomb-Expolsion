package serverfiles;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Networkinfoserver {
	 // Get time zone information
    public LocalDate today = LocalDate.now();

    public String timeZone = "Asia/Kolkata";
    public ZoneId zoneId = ZoneId.of(timeZone);

    public ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
    public String timeZoneOffset = zonedDateTime.getOffset().toString();


    //Currernt time
    LocalDateTime localDateTime = LocalDateTime.now();
    ZonedDateTime newzonedDateTime = localDateTime.atZone(zoneId);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public String formattedTime = newzonedDateTime.format(formatter);


//   // Time Format:
//   public void disp_time_format() {
//       System.out.println("UTC Offset: " + timeZoneOffset);
//   }

   // Current Time:
   public void disp_current_time() {

       System.out.println("Time::" + formattedTime);
   }

   // Time Format: Latitude and Longitude
   public void disp_lattime(String latit) {
       double latitude = Double.parseDouble(latit.trim());
       int latDegrees = (int) latitude;
       double latMinutes = (latitude - latDegrees) * 60;
       int latSeconds = (int) ((latMinutes - (int) latMinutes) * 60);
       char latHemisphere = latitude >= 0 ? 'N' : 'S';

       // Format and print the coordinates
       String formattedLatitude = String.format("%d° %.2f' %d\" %c", latDegrees, latMinutes, latSeconds, latHemisphere);
       System.out.println("-->> Formatted Latitude: " + formattedLatitude);
   }

   public void disp_longtime(String longi) {
	   double longitude= Double.parseDouble(longi.trim());
       int lonDegrees = (int) longitude;
       double lonMinutes = (longitude - lonDegrees) * 60;
       int lonSeconds = (int) ((lonMinutes - (int) lonMinutes) * 60);
       char lonHemisphere = longitude >= 0 ? 'E' : 'W';

       // Format and print the coordinates
       String formattedLongitude = String.format("%d° %.2f' %d\" %c", lonDegrees, lonMinutes, lonSeconds,lonHemisphere);
       System.out.println("-->> Formatted Longitude: " + formattedLongitude);
   }

}
