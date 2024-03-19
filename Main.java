import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static com.sun.tools.javac.util.Constants.format;


public class Main {
    public static void main(String[] args) {
       OffsetDateTime timeData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateString = dataTimeFormact(timeData);
        System.out.println(dateString);

    }

    public static String dataTimeFormact(OffsetDateTime timeData) {
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return timeData.format(dataFormatter);
    }
}
