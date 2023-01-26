package duke.task;

import duke.TaskType;

public abstract class Task {
    private TaskType taskType;
    private String description;
    private boolean isDone;

    public Task(TaskType taskType, String description) {
        this.taskType = taskType;
        this.description = description;
        this.isDone = false;
    }

    public abstract String taskToSavedForm();

    public static Task makeTask(String str) {
        if (str.startsWith("todo ")) {
            return ToDo.to(str.substring(5));
        } else if (str.startsWith("deadline ")) {
            return Deadline.to(str.substring(9));
        } else {
            return Event.to(str.substring(6));
        }
    }

    public String getStatusIcon() {
        return (this.isDone ? "X" : " ");
    }

    public void mark() {
        this.isDone = true;
    }

    public void unMark() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        String str = "[" + this.taskType + "]";
        str += "[" + this.getStatusIcon() + "] ";
        str += this.description;
        return str;
    }
}
