import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;


public class Main {
    static Scanner scanner  = new Scanner(System.in);
    static List<Task> taskList = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static String date;
    private static Object Comparable;

    public static void main(String[] args) throws IOException, ParseException {
        Console.console();
    }
}
