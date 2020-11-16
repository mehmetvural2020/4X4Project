public class ShowTaskList {
    public static void showList() {
        //Option 1 :
//        for (int i = 0; i < taskList.size(); i++){
//            System.out.println(taskList.get(i));
//        }

        //Option 2 :
        Main.taskList.forEach((task) -> System.out.println(task));
    }
}
