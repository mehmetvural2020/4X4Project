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

            readTaskList.forEach(task -> parseEmpObj((JSONObject) task));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void parseEmpObj(JSONObject jtask) {
        JSONObject taskObj = (JSONObject) jtask.get("tasks");

        int id = Integer.parseInt(taskObj.get("id").toString());
        String name = (String) taskObj.get("name");
        LocalDate dueDate = LocalDate.parse(taskObj.get("dueDate").toString(), Main.formatter);
        Task.Status status = Task.Status.CREATED;

        if (id < 200) {
            LocalDate startDate = LocalDate.parse(taskObj.get("startDate").toString(), Main.formatter);
            var task = new TimedTask(id, name, dueDate, status, startDate);
            Main.taskList.add(task);
        } else if (id < 300) {
            String assignedTo = taskObj.get("assignedTo").toString();
            var task = new AssignedTask(id, name, dueDate, status, assignedTo);
            Main.taskList.add(task);
        } else if (id < 400) {
            LocalDate startDate = LocalDate.parse(taskObj.get("startDate").toString(), Main.formatter);
            String assignedTo = taskObj.get("assignedTo").toString();
            var task = new AssignedTimedTask(id, name, dueDate, status, startDate, assignedTo);
            Main.taskList.add(task);
        }


    }
}
