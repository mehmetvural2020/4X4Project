//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    static Scanner scanner  = new Scanner(System.in);
//
//    //creating a method that accepts only child class of Shape
//    public static void main(String[] args){
//
//        int toDo = 0;
//        TimedTask task = new TimedTask();
//
//        List<Task> taskList = new ArrayList<>();
//
////        ArrayList<TimedTask> task;
////        task = new ArrayList<TimedTask>();
//        while(toDo != 6){
//            System.out.println();
//            System.out.print("What would you like to do?\n" +
//                    "1- Create a Task\n" +
//                    "2- Update a Task\n" +
//                    "3- Show all Tasks\n" +
//                    "4- Assign the Task\n" +
//                    "5- Remove the Task\n" +
//                    "6- Exit\n" +
//                    "\nPlease enter number from 1 to 6 :");
//            toDo = scanner.nextInt();
//            if (toDo < 1 || toDo > 6) {
//                System.out.println("!!!You entered wrong number.");
//            }
//            else {
//                System.out.println(toDo);
//                switch (toDo) {
//                    case 1:
//                        createTask(task);
//                        taskList.add(task);
//                        break;
//                    case 2:
//                        updateTask();
//                        break;
//                    case 3:
//                        showList(taskList);
//                        break;
//                    case 4:
//                        AssignTask();
//                        break;
//                    case 5:
//                        removeTask();
//                        break;
//                    case 6:
//                        break;
//                }
//            }
//        }
//    }
//
//    public static void showList(List list) {
////        System.out.println(Arrays.toString(list.toArray()));
//        for (Object l : list) {
//            System.out.println(l);
//        }
//    }
//
//     private static void createTask(Task task){
//
//        System.out.println("\n\tEnter the Task id : ");
//        task.id = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("\n\tEnter the Task name : ");
//        task.name = scanner.nextLine();
//
//        //System.out.println("\n\tEnter the Task\'s due date : (MM-DD-YYYY)");
//        System.out.println(" Enter in  following format : dd-mm-yyyy");
//        task.dueDate = scanner.nextLine();
//        task.status = Task.Status.CREATED;
//
//    }
//
//    private static void updateTask() {
//        System.out.println("Please ");
//
//    }
//
//
//
//    private static void AssignTask() {
//    }
//
//    private static void removeTask() {
//    }
//}
