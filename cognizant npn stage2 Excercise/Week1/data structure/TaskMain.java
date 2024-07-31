public class TaskMain {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task task1 = new Task(1, "Designing model", "In Progress");
        Task task2 = new Task(2, "Developing model", "Not Started");
        Task task3 = new Task(3, "Testing model", "Completed");

        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task task = tms.searchTask(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 2:");
        tms.deleteTask(2);
        tms.traverseTasks();
    }
}