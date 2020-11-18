import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimedTask extends Task {

    LocalDate startDate;


    public TimedTask() {
    }

    public TimedTask(int id, String name, LocalDate dueDate, Status status, LocalDate startDate) {
        super(id, name, dueDate, status);
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "\nTimedTask : " +
                "\n\tid= " + id +
                "\n\tname= '" + name + '\'' +
                "\n\tdueDate= " + dueDate +
                "\n\tstatus= " + status +
                "\n\tstartDate= " + startDate;
    }
}
