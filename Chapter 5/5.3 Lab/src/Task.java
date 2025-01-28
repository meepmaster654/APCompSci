public class Task implements Priority, Comparable {
    private String name, desc;
    private int priority;
    static int numTasks;

    public Task(String name, String desc, int priority) {
        this.name = name;
        this.desc = desc;
        this.priority = priority;
    }

    public static int getNumTasks() {
        return numTasks;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Object o) {
        return this.priority - ((Priority) o).getPriority();
    }

}