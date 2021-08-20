import java.util.Scanner;

public class Duke {

    static final String EXIT_PROGRAM = "bye";
    static final String LIST_TASK = "list";
    static final String MARK_DONE = "done";

    public static void printSeparatingLine() {
        System.out.println("---------------------------------");
    }

    public static void greet() {
        printSeparatingLine();
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?\n");
    }

    public static void goodbye() {
        printSeparatingLine();
        System.out.println("Bye. Hope to see you again soon!\n");
        printSeparatingLine();
    }

    public static void interact() {
        String line;
        Scanner in = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        while (true) {
            line = in.nextLine();
            String[] words = line.trim().split(" ");
            if (line.equals(EXIT_PROGRAM)) {
                break;
            } else if (line.equals(LIST_TASK)) {
                taskManager.listTask();
            } else if (words[0].equals(MARK_DONE)) {
                int taskNumber = Integer.parseInt(words[1]) - 1;
                taskManager.markTaskAsCompleted(taskNumber);
            } else {
                taskManager.addTask(line);
            }
        }
    }

    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        greet();
        interact();
        goodbye();
    }
}
