import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    private ArrayList<Task> taskList = new ArrayList<>();
    private Scanner userIn = new Scanner(System.in);
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        String sentinel = "";
        String newName;
        while (!sentinel.equals("sigma")) {
          System.out.print("What would you like to do(New, List, Mark As Done or Remove)");
          sentinel = toDoList.userIn.nextLine();
          if (sentinel.equals("New")) {
            System.out.print("What would you like to name the task: ");
            newName = toDoList.userIn.nextLine(); // Use the Scanner from the ToDoList instance
            toDoList.createNewTask(newName); // Create task with user input
          } else if(sentinel.equals("List")) {
            toDoList.listTasks();
          } else if(sentinel.equals("Mark As Done")){
            toDoList.listTasks();
            System.out.println("Which task would you like to mark as done (number)");
            toDoList.markDone(toDoList.userIn.nextInt());
          } else if(sentinel.equals("Remove")){
            toDoList.listTasks();
            System.out.println("Which task would you like to remove (number)");
            toDoList.removeTask(toDoList.userIn.nextInt());
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
    public void listTasks(){
      if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
      } else {
        for (int i = 0; i < taskList.size(); i++) {
                Task task = taskList.get(i);
                if (task.complete) {
                  System.out.println((i + 1) + ". "+ task.name + " - Done!");
                }else {
                  System.out.println((i + 1) + ". "+ task.name + " - Not Done");
                }
            }
      }
    }
    public void markDone(int doneTask) {
      if (doneTask <= taskList.size()){
      taskList.get(doneTask - 1).didIt();
    }
    public void removeTask(int removedTask){
      taskList.remove(removedTask - 1);
    }
}
class Task {
    public String name;
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
    public void didIt(){
        complete= true;
    }
}