import java.util.*;

public class Demo {
    static Scanner scanner  = new Scanner(System.in);

    //creating a method that accepts only child class of Shape
    public static void main(String[] args){

        int toDo = 0;
//        TimedTask task = new TimedTask();

        List<Task> taskList = new ArrayList<>();

//        ArrayList<TimedTask> task;
//        task = new ArrayList<TimedTask>();
        while(toDo != 6){
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
                        showList(taskList);
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

        public static void showList(List list) {
//        System.out.println(Arrays.toString(list.toArray()));
        for (Object l : list) {
            System.out.println(l);
        }
    }

    public static Task createTask(){
        String taskType = typeTask();
        System.out.println("\n\tEnter the Task id : ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("\n\tEnter the Task name : ");
        String name = scanner.nextLine();

        //System.out.println("\n\tEnter the Task\'s due date : (MM-DD-YYYY)");
        System.out.println(" Enter the Due Date in the following format : dd-mm-yyyy");
        String dueDate = scanner.nextLine();
        Task.Status status = Task.Status.CREATED;

        if (taskType =="Timed Task") {
            System.out.println(" Enter the Start Date in the following format : dd-mm-yyyy");
            String startDate = scanner.nextLine();

            System.out.println(" Enter the End date in the following format : dd-mm-yyyy");
            String endDate = scanner.nextLine();
            return new TimedTask(id, name, dueDate, status, startDate, endDate);
        }
        else if (taskType =="Assigned Task") {
            System.out.println("\n\tEnter the person name to assign Task : ");
            String assignedTo = scanner.nextLine();
            return new AssignedTask(id, name, dueDate, status, assignedTo);
        }
        else if (taskType =="Assigned Timed Task") {
            System.out.println(" Enter the Start Date in the following format : dd-mm-yyyy");
            String startDate = scanner.nextLine();

            System.out.println(" Enter the End date in the following format : dd-mm-yyyy");
            String endDate = scanner.nextLine();

            System.out.println("\n\tEnter the person name to assign Task : ");
            String assignedTo = scanner.nextLine();
            return new AssignedTimedTask(id, name, dueDate, status, startDate, endDate, assignedTo);
        }
        System.out.println("You entered more than 4 times wrong Task Type!!! or you canceled to enter task type.");
        return null;
    }

    private static void updateTask() {
        System.out.println("Please ");

    }

    private static void sortByName() {
    }

    private static void sortTasksbyDueDate() {
    }
}
