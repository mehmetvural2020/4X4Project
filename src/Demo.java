import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Demo {
    static Scanner scanner  = new Scanner(System.in);
    static List<Task> taskList = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static String date;
//    static LocalDateTime startDate  = LocalDateTime.parse(time,formatter);
    public static void main(String[] args){
        int toDo = 0;
        while(toDo != 10){
            System.out.println();
            System.out.print("What would you like to do?\n" +
                    "1- Create a Task\n" +
                    "2- Update a Task\n" +
                    "3- Show all Tasks\n" +
                    "4- Sort tasks by name\n" +
                    "5- Sort tasks by due date\n" +
                    "6- Delete a task by id\n" +
                    "7- Update a task name get by id\n" +
                    "8-Update task description get by id\n" +
                    "9-Update task due date get by id\n" +
                    "10- Exit\n" +
                    "\nPlease enter number from 1 to 10 :");
            toDo = Integer.parseInt(scanner.nextLine());

            if (toDo < 1 || toDo > 10) {
                System.out.println("!!!You entered wrong number.");
            }
            else {
                System.out.println(toDo);
                switch (toDo) {
                    case 1:
                        taskList.add(createTask());
                        break;
                    case 2:
                        updateTask();
                        break;
                    case 3:
                        showList();
                        break;
                    case 4:sortByName();
                        break;
                    case 5:
                        sortTasksbyDueDate();
                        break;
                    case 6:
                        deleteTasksById();
                        break;
                    case 7:
                        updateTaskNameById();
                        break;
                    case 8:
                        updateTaskDescriptionById();
                        break;
                    case 9:
                        updateTaskDueDateById();
                        break;
                    case 10:
                        break;
                }
            }
        }
    }

    private static void updateTask() {
    }

    private static void sortByName() {
        taskList.sort((Task t1, Task t2)->t1.getName().compareTo(t2.getName()));
    }

    private static void sortTasksbyDueDate() {
        taskList.sort(Comparator.comparing(Task::getDueDate));
    }

    private static void updateTaskDueDateById() {
    }

    private static void updateTaskDescriptionById() {
    }

    private static void updateTaskNameById() {
    }

    private static void deleteTasksById() {
    }

    public static String typeTask() {
        int typeTask = 0;
        while (typeTask != 4) {
            System.out.println("What kind of Task do you want to create? Please enter number from 1 to 4 : \n" +
                    "1- Timed Task\n" +
                    "2- Assigned Task\n" +
                    "3- Assigned Timed Task\n" +
                    "4- Previous menu");
            typeTask = Integer.parseInt(scanner.nextLine());
            if (typeTask == 1) {
                return "Timed Task";
            } else if (typeTask == 2) {
                return "Assigned Task";
            } else if (typeTask == 3) {
                return "Assigned Timed Task";
            }
            else if (typeTask == 4) {
                return null;
            }
            else
            typeTask++;
        }
        return null;

    }

        public static void showList() {
            for (int i = 0; i < taskList.size(); i++){
                System.out.println(taskList.get(i));
            }
    }

    public static Task createTask(){
        String taskType = typeTask();
        System.out.print("\n\tEnter the Task id : ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("\n\tEnter the Task name : ");
        String name = scanner.nextLine();

        System.out.print("\n\tEnter the Due Date in the following format (yyyy-MM-dd) : ");
        date = scanner.nextLine();
        LocalDate dueDate  = LocalDate.parse(date,formatter);

        Task.Status status = Task.Status.CREATED;

        if (taskType =="Timed Task") {
            System.out.print("\n\tEnter the Start Date in the following format (yyyy-MM-dd) : ");
            date = scanner.nextLine();
            LocalDate startDate  = LocalDate.parse(date,formatter);

            return new TimedTask(id, name, dueDate, status, startDate);
        }
        else if (taskType =="Assigned Task") {
            System.out.print("\n\tEnter the person name to assign Task : ");
            String assignedTo = scanner.nextLine();

            return new AssignedTask(id, name, dueDate, status, assignedTo);
        }
        else if (taskType =="Assigned Timed Task") {
            System.out.print("\n\tEnter the Start Date in the following format (yyyy-MM-dd) : ");
            date = scanner.nextLine();
            LocalDate startDate  = LocalDate.parse(date,formatter);

            System.out.print("\n\tEnter the person name to assign Task : ");
            String assignedTo = scanner.nextLine();
            return new AssignedTimedTask(id, name, dueDate, status, startDate, assignedTo);
        }
        System.out.print("You entered more than 4 times wrong Task Type!!! or you canceled to enter task type.");
        return null;
    }


}
