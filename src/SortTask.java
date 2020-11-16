import java.util.Comparator;

public class SortTask {
    public static void sortByName() {
        Main.taskList.sort((Task t1, Task t2) -> t1.getName().compareTo(t2.getName()));

    }

    public static void sortTasksbyDueDate() {
        Main.taskList.sort(Comparator.comparing(Task::getDueDate));
    }
}
