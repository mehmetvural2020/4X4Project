import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class TimedTask extends Task {
    String startDate = "MM-DD-YYYY";
    String endDate = "MM-DD-YYYY";


    public TimedTask() {
    }

    public TimedTask(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public TimedTask(int id, String name, String dueDate, Status status, String startDate, String endDate) {
        super(id, name, dueDate, status);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TimedTask{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}
