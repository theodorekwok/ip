import java.util.Scanner;

public class Duke {

    public static final String COMMAND_EXIT_PROGRAM = "bye";
    public static final String COMMAND_MARK_DONE = "done";
    public static final String COMMAND_LIST_TASK = "list";
    public static final String COMMAND_ADD_TODO_TASK = "todo";
    public static final String COMMAND_ADD_DEADLINE_TASK = "deadline";
    public static final String COMMAND_ADD_EVENT_TASK = "event";
    public static final int COMMAND_INDEX = 0;

    public static void greet() {
        Display.printSeparatingLine();
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?\n");
    }

    public static void goodbye() {
        Display.printSeparatingLine();
        System.out.println("Bye. Hope to see you again soon!\n");
        Display.printSeparatingLine();
    }

    public static void interact() {
        Scanner in = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean isStillInteracting = true;
        while (isStillInteracting) {
            String[] commandComponents = InputParser.getCommandComponents(in);

            switch (commandComponents[COMMAND_INDEX]) {
            case COMMAND_LIST_TASK:
                taskManager.listTask();
                break;
            case COMMAND_MARK_DONE:
                taskManager.markTaskAsCompleted(commandComponents);
                break;
            case COMMAND_ADD_TODO_TASK:
                taskManager.addTodoTask(InputParser.getTaskDetails(commandComponents));
                break;
            case COMMAND_ADD_DEADLINE_TASK:
                taskManager.addDeadlineTask(InputParser.getTaskDetails(commandComponents));
                break;
            case COMMAND_ADD_EVENT_TASK:
                taskManager.addEventTask(InputParser.getTaskDetails(commandComponents));
                break;
            case COMMAND_EXIT_PROGRAM:
                isStillInteracting = false;
                break;
            default:
                Error.displayInvalidCommandError();
                break;
            }
        }
    }

    public static void main(String[] args) {
        String logo = " ____        _\n"
                + "|  _ \\ _   _| | _____\n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        greet();
        interact();
        goodbye();
    }
}
