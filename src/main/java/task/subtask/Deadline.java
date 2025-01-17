package task.subtask;

import task.Task;
import ui.Display;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a 'deadline' type task.
 */
public class Deadline extends Task {

    public final String DATE_TIME_REGEX = "MMM dd yyyy HH:mm";
    private LocalDateTime datetime;

    /**
     * Creates a new 'deadline' type task.
     *
     * @param taskName Task name provided by user.
     * @param deadlineDate Date of deadline provided by user.
     * @param deadlineTime Time of deadline provided by user.
     */
    public Deadline(String taskName, LocalDate deadlineDate, LocalTime deadlineTime) {
        super(taskName);
        datetime = LocalDateTime.of(deadlineDate, deadlineTime);
    }

    /**
     * Returns a formatted string of the dateTime to be displayed to user.
     *
     * @return Formatted string of the dateTime detail.
     */
    public String getDatetime() {
        return datetime.format(DateTimeFormatter.ofPattern(DATE_TIME_REGEX));
    }

    /**
     * Displays to the user the status, name and time of the 'deadline' type task.
     *
     * @return String representation of 'event' type task to be displayed to user.
     */
    @Override
    public String toString() {
        return Display.getTwoCheckboxDisplay(Display.CHECKBOX_DEADLINE_TASK_TYPE, getIsCompleted())
                + Display.SPACE + getTask() + Display.OPEN_DATE_BRACKET + getDatetime() + Display.CLOSE_DATE_BRACKET;
    }
}
