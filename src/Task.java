import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class Task {
    enum Status {
        DONE, STARTED, UNDERPROCESS, CREATED
    }
    int id;
    String name;
    String dueDate  = "MM-DD-YYYY";
    Status status;
    public Task() {
    }

    public Task(int id, String name, String dueDate, Status status) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }

    

}

