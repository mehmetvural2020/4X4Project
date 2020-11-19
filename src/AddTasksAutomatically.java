import java.time.LocalDate;

public class AddTasksAutomatically {
    public static void addTask() {
        var task1 = new TimedTask(101, "Task1", LocalDate.parse("2020-01-05", Main.formatter), Task.Status.CREATED, LocalDate.parse("2020-01-01", Main.formatter));
        var task2 = new TimedTask(102, "Task2", LocalDate.parse("2020-01-15", Main.formatter), Task.Status.CREATED, LocalDate.parse("2020-01-01", Main.formatter));
        var task3 = new AssignedTask(203, "Task3", LocalDate.parse("2020-01-25", Main.formatter), Task.Status.CREATED, "Brown");
        var task4 = new AssignedTask(204, "Task4", LocalDate.parse("2020-01-20", Main.formatter), Task.Status.CREATED, "John");
        var task5 = new AssignedTimedTask(303, "Task5", LocalDate.parse("2020-01-10", Main.formatter), Task.Status.CREATED, LocalDate.parse("2020-01-10", Main.formatter), "Brown");
        var task6 = new AssignedTimedTask(304, "Task6", LocalDate.parse("2020-01-09", Main.formatter), Task.Status.CREATED, LocalDate.parse("2020-01-10", Main.formatter), "John");
        Main.taskList.add(task1);
        Main.taskList.add(task2);
        Main.taskList.add(task3);
        Main.taskList.add(task4);
        Main.taskList.add(task5);
        Main.taskList.add(task6);

    }
}
