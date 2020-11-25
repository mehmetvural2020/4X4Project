import org.json.simple.JSONArray;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToJSONFormat {
    public static void writeJSONFile() {
        JSONArray taskJSON = new JSONArray();

        if (Main.taskList.isEmpty()) System.out.println("!!!There is no Task...");

        //Option 1 :
//        for (int i = 0; i < Main.taskList.size(); i++){
//            System.out.println(Main.taskList.get(i));
//            taskJSON.add(Main.taskList.get(i));
//        }

        //Option 2 :
//        Main.taskList.forEach((task) -> System.out.println(task));
        Main.taskList.forEach((task) -> taskJSON.add(task));

        try (FileWriter file = new FileWriter("taskJSON2.json")) {
            file.write(taskJSON.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
