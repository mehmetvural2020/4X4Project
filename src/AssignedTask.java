import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AssignedTask extends Task{
    String assignedTo;

    public AssignedTask() {
    }

    public AssignedTask(int id, String name, LocalDate dueDate, Status status, String assignedTo) {
        super(id, name, dueDate, status);
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "AssignedTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", assignedTo='" + assignedTo + '\'' +
                '}';
    }
}
