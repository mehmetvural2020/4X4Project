import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class readFromJSONFile {
    public static void readFromJSONFile() throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(".//taskJSON1.json")) {

            Object obj = jsonParser.parse(reader);
            JSONArray readTaskList = (JSONArray) obj;
//            if(readTaskList.isEmpty()) System.out.println("!!!There is no Task...");

            readTaskList.forEach(task -> parseEmpObj((JSONObject) task));

//            Main.taskList = readTaskList;
//            readTaskList.forEach(task -> Main.taskList.add(task));

//            ArrayList read = (ArrayList) obj;
//            read.forEach(task -> Main.taskList.add((Task) task));

//            JSONObject taskJsonObj = (JSONObject) obj;

//            int id = (int) taskJsonObj.get("id");
//            String name = (String) taskJsonObj.get("name");
//            String dueDate = (String) taskJsonObj.get("dueDate");
//            Task.Status status = (Task.Status) taskJsonObj.get("status");


//            var task7 = new AssignedTimedTask(id, name, LocalDate.parse(dueDate, Main.formatter), status, LocalDate.parse("2020-01-10", Main.formatter), "John");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

//        JSONArray jsonArray = taskJsonObj.get(tasks);

//        for (int i = 0; i < jsonArray.size(); i++){
//
//        }
    }

    public static void parseEmpObj(JSONObject emp) {
        JSONObject empObj = (JSONObject) emp.get("tasks");
        //get emp firstname, lastname, website
//        String fname = (String) empObj.get("firstname");
//        String lname = (String) empObj.get("lastname");
//        String website = (String) empObj.get("website");
//        System.out.println("First Name: " + fname);
//        System.out.println("Last Name: " + lname);
//        System.out.println("Website: " + website);

        int id = Integer.parseInt(empObj.get("id").toString());
        String name = (String) empObj.get("name");
        LocalDate dueDate = LocalDate.parse(empObj.get("dueDate").toString(), Main.formatter);
        Task.Status status = Task.Status.CREATED; //(Task.Status) empObj.get("status").toString();

        if (id < 200) {
            LocalDate startDate = LocalDate.parse(empObj.get("startDate").toString(), Main.formatter);
            var task = new TimedTask(id, name, dueDate, status, startDate);
            Main.taskList.add(task);
        } else if (id < 300) {
            String assignedTo = empObj.get("assignedTo").toString();
            var task = new AssignedTask(id, name, dueDate, status, assignedTo);
            Main.taskList.add(task);
        } else if (id < 400) {
            LocalDate startDate = LocalDate.parse(empObj.get("startDate").toString(), Main.formatter);
            String assignedTo = empObj.get("assignedTo").toString();
            var task = new AssignedTimedTask(id, name, dueDate, status, startDate, assignedTo);
            Main.taskList.add(task);
        }


    }
}
