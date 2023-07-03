import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Time {
    public static void datetime() {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

            String formattedDate = myDateObj.format(myFormat);
            System.out.println("Date and Time: " + formattedDate);
    }
}

