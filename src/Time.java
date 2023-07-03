/* Interface */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface Clock {
    void dt();
}
public class Time implements Clock {

    public void dt() {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

            String formattedDate = myDateObj.format(myFormat);
            System.out.println("Date and Time: " + formattedDate);

    }
}

