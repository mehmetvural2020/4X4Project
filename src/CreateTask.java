import java.time.LocalDate;

public class CreateTask {
    public static Task createTask() {
        String taskType = TaskType.typeTask();
        while (taskType != null) {
            System.out.print("\tEnter the Task id : ");
            int id = Integer.parseInt(Main.scanner.nextLine());

            System.out.print("\tEnter the Task name : ");
            String name = Main.scanner.nextLine();

            System.out.print("\tEnter the Due Date in the following format (yyyy-MM-dd) : ");
            Main.date = Main.scanner.nextLine();
            LocalDate dueDate = LocalDate.parse(Main.date, Main.formatter);

            Task.Status status = Task.Status.CREATED;

            if (taskType == "Timed Task") {
                System.out.print("\tEnter the Start Date in the following format (yyyy-MM-dd) : ");
                Main.date = Main.scanner.nextLine();
                LocalDate startDate = LocalDate.parse(Main.date, Main.formatter);

                return new TimedTask(id, name, dueDate, status, startDate);
            } else if (taskType == "Assigned Task") {
                System.out.print("\tEnter the person name to assign Task : ");
                String assignedTo = Main.scanner.nextLine();

                return new AssignedTask(id, name, dueDate, status, assignedTo);
            } else if (taskType == "Assigned Timed Task") {
                System.out.print("\tEnter the Start Date in the following format (yyyy-MM-dd) : ");
                Main.date = Main.scanner.nextLine();
                LocalDate startDate = LocalDate.parse(Main.date, Main.formatter);

                System.out.print("\tEnter the person name to assign Task : ");
                String assignedTo = Main.scanner.nextLine();
                return new AssignedTimedTask(id, name, dueDate, status, startDate, assignedTo);
            }

        }
        System.out.print("You entered more than 4 times wrong Task Type!!! or you canceled to enter task type.");
        return null;
    }
}
