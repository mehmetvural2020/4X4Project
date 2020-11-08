import java.time.LocalDateTime;

public class AssignedTimedTask extends Task {
    String startDate;
    String endDate;
    String assignedTo;

    public AssignedTimedTask() {
    }

    public AssignedTimedTask(String startDate, String endDate, String assignedTo) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.assignedTo = assignedTo;
    }

    public AssignedTimedTask(int id, String name, String dueDate, Status status, String startDate, String endDate, String assignedTo) {
        super(id, name, dueDate, status);
        this.startDate = startDate;
        this.endDate = endDate;
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "AssignedTimedTask{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}
