import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AssignedTimedTask extends Task {
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
//    String time2;
//    LocalDateTime startDate  = LocalDateTime.parse(time2,formatter);
    LocalDate startDate;
    String assignedTo;

    public AssignedTimedTask() {
    }

    public AssignedTimedTask(int id, String name, LocalDate dueDate, Status status, LocalDate startDate, String assignedTo) {
        super(id, name, dueDate, status);
        this.startDate = startDate;
        this.assignedTo = assignedTo;
    }

//    @Override
//    public String toString() {
//        return "\n{AssignedTimedTask : " +
//                "\n\tid= " + id +
//                "\n\tname= '" + name + '\'' +
//                "\n\tdueDate= " + dueDate +
//                "\n\tstatus= " + status +
//                "\n\tstartDate= " + startDate +
//                "\n\tassignedTo= '" + assignedTo + '\'';
//    }
    @Override
    public String toString() {
        return "\n\t{\"id\"" + ": " + id + "," +
                "\n\t\"name\"" + ": \""  + name  + "\","  +
                "\n\t\"dueDate\"" + ": \""  + dueDate + "\","  +
                "\n\t\"status\"" + ": \""  + status + "\","  +
                "\n\t\"startDate\"" + ": \""  + startDate + "\","  +
                "\n\t\"assignedTo\"" + ": \""  + assignedTo + "\"\n\t}";
    }

}
