public class ShowTaskList {
    public static void showList() {
        //Option 1 :
//        for (int i = 0; i < taskList.size(); i++){
//            System.out.println(taskList.get(i));
//        }

        //Option 2 :
        if(Main.taskList.isEmpty()) System.out.println("!!!There is no Task...");
        Main.taskList.forEach((task) -> System.out.println(task));
    }
}
