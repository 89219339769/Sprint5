package manager;

import tasks.Epic;
import tasks.SubTask;
import tasks.Task;

import java.util.HashMap;
import java.util.Map;

public interface TaskManager {

    Map<Integer, Task> taskMap = new HashMap<>();
    Map<Integer, Epic> epicMap = new HashMap<>();
    Map<Integer, SubTask> subTaskMap = new HashMap<>();


    void addTask(Task task);

    void addEpic(Epic task);

    void addSubTask(SubTask subTask);

    //2 методы для получение списка  задач типов
    void printOllTasks();

    void printOllEpics();

    void printOllSubTasks();

    //3 обновили задачу статус задачи поменялся на DONE
    void updateStatusOfTask(Task task);

    //4 метод управляет статусом эпика в зависимости от подзадач
    void updateStatusOfEpic(int epicId);

    //5 Обнвление  задач всех типов
    void updateTask(Task task);

    void updateSubTask(SubTask subTask);

    void apdateEpic(Epic epic);

    // 6 Удаление всех задач.
    void deleteTasks();

    void deleteSubTasks();


    //7 методы получения всех типов задач по идентификатору.
    void getTask(int id);

    void getSubTask(int id);

    void getEpic(int id);

    //Удаление  задач всех типов по индификатору
    void deleteTask(int id);

    void deleteEpic(int id);

    void deleteSubTask(int id);
}
