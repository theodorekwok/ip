package error;

public class Error {

    public static final String ERROR_MESSAGE_INVALID_COMMAND = "☹ OOPS!!! I don't know what that means :-(";
    public static final String ERROR_MESSAGE_NOT_A_NUMBER = "☹ OOPS!!! Task number provided is not a number :-(";
    public static final String ERROR_MESSAGE_TASK_NONEXISTENT = "☹ OOPS!!! Task does not exist :-(";
    public static final String ERROR_MESSAGE_TASK_FORMAT = "☹ OOPS!!! Task detail provided is in the wrong format :-(";
    public static final String ERROR_MESSAGE_TASK_NAME_NONEXISTENT = "☹ OOPS!!! Task name cannot be empty :-(";

    public static final String ERROR_MESSAGE_FILE_LOAD_FAIL = "☹ OOPS!!! File failed to load data :-(";
    public static final String ERROR_MESSAGE_FILE_UPDATE_FAIL = "☹ OOPS!!! File failed to update :-(";
    public static final String ERROR_MESSAGE_FILE_ADD_TASK_FAIL = "☹ OOPS!!! Failed to add saved task :-( " +
            "Please check the savedTask.txt file";
    public static final String ERROR_MESSAGE_FILE_TASK_NAME_NONEXISTENT = "☹ OOPS!!! Saved Task has no name :-(";
    public static final String ERROR_MESSAGE_FILE_TASK_FORMAT = "☹ OOPS!!! Saved Task is in the wrong format :-( " +
            "Please check the savedTask.txt file";
    public static final String ERROR_MESSAGE_FILE_DATE_FORMAT = "☹ OOPS!!! Saved Task has the wrong date format :-( " +
            "Please check the savedTask.txt file";

    public static final String ERROR_MESSAGE_DATE_FORMAT = "☹ OOPS!!! Date time format given is wrong :-( " +
            "Please provide it in YYYY-MM-DD HH:MM format.";

    public static void displayInvalidCommandError() {
        System.out.println(ERROR_MESSAGE_INVALID_COMMAND);
    }

    public static void displayNotANumberError() {
        System.out.println(ERROR_MESSAGE_NOT_A_NUMBER);
    }

    public static void displayTaskNonExistentError() {
        System.out.println(ERROR_MESSAGE_TASK_NONEXISTENT);
    }

    public static void displayTaskFormatError() {
        System.out.println(ERROR_MESSAGE_TASK_FORMAT);
    }

    public static void displayTaskNameEmptyError() {
        System.out.println(ERROR_MESSAGE_TASK_NAME_NONEXISTENT);
    }

    public static void displayFileLoadError() {
        System.out.println(ERROR_MESSAGE_FILE_LOAD_FAIL);
    }

    public static void displayFileUpdateError() {
        System.out.println(ERROR_MESSAGE_FILE_UPDATE_FAIL);
    }

    public static void displayFileAddTaskError() {
        System.out.println(ERROR_MESSAGE_FILE_ADD_TASK_FAIL);
    }

    public static void displayFileSavedTaskNameEmptyError() {
        System.out.println(ERROR_MESSAGE_FILE_TASK_NAME_NONEXISTENT);
    }

    public static void displayFileSavedTaskFormatError() {
        System.out.println(ERROR_MESSAGE_FILE_TASK_FORMAT);
    }

    public static void displayFileSavedDateFormatError() {
        System.out.println(ERROR_MESSAGE_FILE_DATE_FORMAT);
    }

    public static void displayDateFormatError() {
        System.out.println(ERROR_MESSAGE_DATE_FORMAT);
    }
}
