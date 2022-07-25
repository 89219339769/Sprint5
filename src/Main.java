import manager.InMemoryHistoryManager;
import manager.TaskManager;
import tasks.Epic;
import tasks.SubTask;
import tasks.Task;
import tasks.TaskStatus;
import manager.InMemoryTaskManager;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new InMemoryTaskManager();
        InMemoryHistoryManager inMemoryHistoryManager = new InMemoryHistoryManager();
        // Создаем задачи всех типов
        Task task0 = new Task("Задача", "просто первая  задача в память", TaskStatus.NEW);
        Task task1 = new Task("Задача1", "просто задача1", TaskStatus.NEW);
        Task task2 = new Task("Задача2", "просто задача2", TaskStatus.NEW);

        Epic task3 = new Epic("Эпик", " Подготовка к празднику", TaskStatus.NEW);
        Epic task4 = new Epic("Эпик1", " Подготовка к празднику 1", TaskStatus.NEW);

        SubTask task5 = new SubTask(" Подзадача", " составить список продуктов", TaskStatus.DONE, 78);
        SubTask task6 = new SubTask(" Подзадача 1", " составить список продуктов 1", TaskStatus.NEW, 3);
        SubTask task7 = new SubTask(" Подзадача 2", " составить список продуктов 2", TaskStatus.DONE, 4);
        SubTask task18 = new SubTask(" Подзадача 3", " составить список продуктов 3", TaskStatus.DONE, 4);
        SubTask task19 = new SubTask(" Подзадача 4", " составить список продуктов 4", TaskStatus.DONE, 4);
        taskManager.addTask(task0);
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addEpic(task3);
        taskManager.addEpic(task4);
        taskManager.addSubTask(task5);
        taskManager.addSubTask(task6);
        taskManager.addSubTask(task7);
        taskManager.addSubTask(task18);
        taskManager.addSubTask(task19);
        // Получили списки задач всех типов

        //проверили что разные типы задач сохраняются в списке истории и нет повторений
        taskManager.getTask(2);
        taskManager.getTask(0);
        taskManager.getTask(2);
        taskManager.getTask(1);

        taskManager.getEpic(3);
        taskManager.getEpic(4);
        taskManager.getEpic(3);

        taskManager.getSubTask(5);
        taskManager.getSubTask(7);
        System.out.println(inMemoryHistoryManager.getHistory());

        //обновили задачу статус задачи поменялся на DONE
        taskManager.updateStatusOfTask(task0);
        taskManager.getTask(0);

        // обновили все типы задач
        Task task8 = new Task("Новая Задача", "просто новая задача задача", TaskStatus.NEW);
        taskManager.updateTask(task8);
        taskManager.getTask(0);

        Epic task9 = new Epic("Новый Эпик", " Подготовка к празднику", TaskStatus.NEW);
        taskManager.apdateEpic(task9);
        taskManager.getEpic(0);

        SubTask task10 = new SubTask("Новая подзадача", " новая Подготовка к празднику", TaskStatus.DONE, 3);
        taskManager.updateSubTask(task10);
        taskManager.getSubTask(0);

        // статус эпика меняется в зависимости от статуса подзадач
        taskManager.deleteSubTask(6);
        taskManager.printOllSubTasks();
        taskManager.printOllEpics();

        // удалили  по номеру разные типы задач и проверили что в истории просмотров они удалились

        taskManager.deleteTask(0);
        taskManager.deleteSubTask(5);
        taskManager.deleteEpic(4);
        System.out.println(inMemoryHistoryManager.getHistory());
    }
}
