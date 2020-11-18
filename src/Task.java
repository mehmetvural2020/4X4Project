import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Task {
    enum Status {
        DONE, STARTED, UNDERPROCESS, CREATED
    }
    int id;
    String name;
    LocalDate dueDate;
    Status status;

    public Task() {
    }

    public Task(int id, String name, LocalDate dueDate, Status status) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Status getStatus() {
        return status;
    }
}

