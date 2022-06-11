import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDo = new ArrayList<>();

    public void addToDo(String task) {
        toDo.add(task);
    }

    public void printToDo() {
        for(int i = 0; i < toDo.size(); i++) {
            System.out.println("Task " + (i + 1) + ". " +
            toDo.get(i));
        }
    }

    public void removeToDo(int pos) {
        toDo.remove(pos);
    }

    public void modifyToDo(int pos, String task) {
        toDo.set(pos, task);
        System.out.println("Task " + (pos + 1) + " modified.");
    }

    public String findTask(String searchTask) {
        int pos = toDo.indexOf(searchTask);
        if(pos >= 0) {
            return toDo.get(pos);
        }
        return null;
    }
}
