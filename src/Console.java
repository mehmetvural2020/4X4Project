import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Console {
    public static void console() throws IOException, ParseException {
        int toDo = 0;
        while(toDo != 10){
            System.out.println();
            System.out.print("What would you like to do?\n" +
                    "1- Create a Task\n" +
                    "2- Add Task from JSON file\n" +
                    "3- Show all Tasks\n" +
                    "4- Sort tasks by name\n" +
                    "5- Sort tasks by due date\n" +
                    "6- Delete a task by id\n" +
                    "7- Update a task name get by id\n" +
                    "8-Update task Due Date get by id\n" +
                    "9-Export task JSON file\n" +
                    "10- Exit\n" +
                    "Please enter number from 1 to 10 : ");
            toDo = Integer.parseInt(Main.scanner.nextLine());

            if (toDo < 1 || toDo > 10) {
                System.out.println("!!!You entered wrong number.");
            }
            else {
                switch (toDo) {
                    case 1:
                        Main.taskList.add(CreateTask.createTask());
                        break;
                    case 2:
                        readFromJSONFile.readFromJSONFile();
                        break;
                    case 3:
                        ShowTaskList.showList();
                        break;
                    case 4:
                        SortTask.sortByName();
                        break;
                    case 5:
                        SortTask.sortTasksbyDueDate();
                        break;
                    case 6:
                        UpdateTask.deleteTasksById();
                        break;
                    case 7:
                        UpdateTask.updateTaskNameById();
                        break;
                    case 8:
                        UpdateTask.updateTaskDueDateById();
                        break;
                    case 9:
                        WriteToJSONFormat.writeJSONFile();
                        break;
                    case 10:
                        break;
                }
            }
        }
    }
}
