package TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    private static ArrayList<Task> tasks = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("---To-Do List---");
            System.out.println("1. Add Task");
            System.out.println("2. View List");
            System.out.println("3. Mark Task is Done");
            System.out.println("4. Delete Task");
            System.out.println("0. Exit Program");
            System.out.println("Enter your choise: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addTask(scanner);
                case 2 -> viewTask();
                case 3 -> markTaskDone(scanner);
                case 4 -> deleteTask(scanner);
                case 0 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid choise");
            }
        }while (choice != 0);
    }

    public static void addTask(Scanner scanner) {
        System.out.println("Enter description");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added");
    }

    public static void viewTask() {
        if (tasks.isEmpty()){
            System.out.println("No tasks found");
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }

    public static void markTaskDone(Scanner scanner) {
        viewTask();
        if (tasks.isEmpty()) return;

        System.out.println("Enter task number to mark done: ");
        int taskNumber = scanner.nextInt();

        if (taskNumber > 0 && taskNumber <= tasks.size()){
            tasks.get(taskNumber-1).isDone = true;
            System.out.println("Task marked successfully");
        }else {
            System.out.println("Invalid task number!!!");
        }
    }

    public static void deleteTask(Scanner scanner) {
        viewTask();
        if (tasks.isEmpty()) return;

        System.out.println("Enter task number to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if (taskNumber > 0 && taskNumber <= tasks.size()){
            tasks.remove(taskNumber-1);
            System.out.println("Task delete successfully");
        }else{
            System.out.println("Invalid task number!!!");
        }

    }
}
