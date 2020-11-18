public class UpdateTask {
    public static void deleteTasksById() {
        System.out.print("Please enter the Task id to remove from the Task list : ");
        int id = Integer.parseInt(Main.scanner.nextLine());

        Main.taskList.removeIf(t -> (t.id == id));

    }

    public static void updateTaskNameById() {


    }

    public static void updateTaskDescriptionById() {
    }

    public static void updateTaskDueDateById() {
    }

    public static void updateTask() {

    }
}
