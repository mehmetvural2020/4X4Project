import java.time.LocalDateTime;

public class AssignedTask extends Task{
    String assignedTo;

    public AssignedTask(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public AssignedTask() {
    }

    public AssignedTask(int id, String name, String dueDate, Status status, String assignedTo) {
        super(id, name, dueDate, status);
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "AssignedTask{" +
                "assignedTo='" + assignedTo + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}
