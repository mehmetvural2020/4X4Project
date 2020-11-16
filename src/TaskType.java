public class TaskType {
    public static String typeTask() {
        int typeTask = 0;
        while (typeTask != 4) {
            System.out.println("What kind of Task do you want to create? Please enter number from 1 to 4 : \n" +
                    "1- Timed Task\n" +
                    "2- Assigned Task\n" +
                    "3- Assigned Timed Task\n" +
                    "4- Previous menu");
            typeTask = Integer.parseInt(Main.scanner.nextLine());
            if (typeTask == 1) {
                return "Timed Task";
            } else if (typeTask == 2) {
                return "Assigned Task";
            } else if (typeTask == 3) {
                return "Assigned Timed Task";
            } else if (typeTask == 4) {
                return null;
            } else
                typeTask++;
        }
        return null;

    }
}
