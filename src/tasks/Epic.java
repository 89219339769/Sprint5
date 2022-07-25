package tasks;

import java.util.ArrayList;

public class Epic extends Task {

    public ArrayList<SubTask> subTasks = new ArrayList<>();


    public Epic(String title, String description, TaskStatus status) {
        super(title, description, status);
    }

    public void addSubTask(SubTask subTask) {
        subTasks.add(subTask);
    }

    public ArrayList<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(ArrayList<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public void delSubTask(SubTask subTask) {

        subTasks.remove(subTask);
    }

    public void clearSubTask() {
        subTasks.clear();
    }
}
