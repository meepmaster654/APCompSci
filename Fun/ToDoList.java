import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    private ArrayList<Task> taskList = new ArrayList<>();
    private Scanner userIn = new Scanner(System.in);
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        String sentinel = "";
        
        while (!sentinel.equals("sigma")) {
            System.out.print("What would you like to name the task: ");
            sentinel = toDoList.userIn.nextLine(); // Use the Scanner from the ToDoList instance
            if (!sentinel.equals("sigma")) {
                toDoList.createNewTask(sentinel); // Create task with user input
            }
        }
        toDoList.userIn.close();
    }
    public void createNewTask(String nameIn) {
        String taskName = nameIn; // Read user input for the task name

        Task newTask = new Task(taskName);   // Create a new task with the given name
        taskList.add(newTask);                  // Add the task to the list

        System.out.println("Task added: " + taskName);
        newTask.getTask(); 
        
    }
}
class Task {
    private String name;
    public boolean complete = false;
    public Task(String nameIn) {
        name = nameIn;
    }
    public void getTask(){
        if (complete) {
            System.out.println("The task " + name +" is done");
        } else {
            System.out.println("The task " + name +" is not done");
        }
       
    }
    public void changeName(String newName){
        name = newName;
    }
}