import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDo = new ToDoList();
    public static void main(String[] args) {
        boolean exit = false;
        int choice = 0;
        printOptions();
        while(!exit) {
            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    toDo.printToDo();
                    break;
                case 2:
                    addTask();
                    break;
                case 3:
                    modifyTask();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    exit = true;
                    break;           
            }
        }  
    }

    public static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the Task List.");
        System.out.println("\t 2 - To add a Task in the List.");
        System.out.println("\t 3 - To modify a Task in the List.");
        System.out.println("\t 4 - To remove a Task from the List.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addTask() {
        System.out.print("Enter the Task you want to add: ");
        String task = scanner.nextLine();
        if(task != toDo.findTask(task)) {
            toDo.addToDo(task);
        }
        else {
            System.out.println("Task Already Exists.");
        }
    }

    public static void modifyTask() {
        System.out.print("Enter Task Number: ");
        int tn = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Task to replace: ");
        String newTask = scanner.nextLine();
        toDo.modifyToDo(tn - 1, newTask);
    }

    public static void removeTask() {
        System.out.print("Enter Task No: ");
        int tn = scanner.nextInt();
        scanner.nextLine();
        toDo.removeToDo(tn - 1);
    }
}
