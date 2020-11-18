import java.time.LocalDate;

public class UpdateTask {
    public static void deleteTasksById() {
        System.out.print("Please enter the Task id to remove from the Task list : ");
        int id = Integer.parseInt(Main.scanner.nextLine());

        Main.taskList.removeIf(t -> (t.id == id));

    }

    public static void updateTaskNameById() {
        System.out.print("Please enter the Task id to update the Task name : ");
        int id = Integer.parseInt(Main.scanner.nextLine());
        System.out.print("Please enter the new Task name to replace with previous name : ");
        String newTaskName = Main.scanner.nextLine();

        int checkId = -1;
        for (int i = 0; i < Main.taskList.size(); i++){
            if(Main.taskList.get(i).id == id){
                Main.taskList.get(i).setName(newTaskName);
                Main.taskList.set(i,Main.taskList.get(i));
                checkId = 1;
            }
        }
        if(checkId == -1) System.out.println("There is no this Task id in the Task list.");
    }

    public static void updateTaskDescriptionById() {
    }

    public static void updateTaskDueDateById() {
        System.out.print("Please enter the Task id to update the Task Due Date : ");
        int id = Integer.parseInt(Main.scanner.nextLine());

        System.out.print("\tEnter the new Task Due Date in the following format (yyyy-MM-dd) : ");
        String newDate = Main.scanner.nextLine();
        LocalDate newDueDate = LocalDate.parse(newDate, Main.formatter);

        int checkId = -1;
        for (int i = 0; i < Main.taskList.size(); i++){
            if(Main.taskList.get(i).id == id){
                Main.taskList.get(i).setDueDate(newDueDate);
                Main.taskList.set(i,Main.taskList.get(i));
                checkId = 1;
            }
        }
        if(checkId == -1) System.out.println("There is no this Task id in the Task list.");
    }

    public static void updateTask() {

    }
}
