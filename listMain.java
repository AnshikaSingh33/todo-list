import java.util.ArrayList;

public class listMain
//Super class from which most of the properties can be inherited
{

    private  ArrayList<ArrayList<String>> MainList;
    private  ArrayList<String> listNames;

    public listMain() {
        MainList = new ArrayList<>();
        listNames = new ArrayList<>();
    }
    public int isToDoListPresent(String listName) {
        int i=0;
        for (int j = 0; j < listNames.size(); j++)
        {
            if (listNames.get(j).equals(listName))
            {
                i++;

            }
        }
        return(i);
    }
    public void addToDoList(String listName) {
        //int index = listName.indexOf(listName);
        if (isToDoListPresent(listName)>=1) {
            System.out.println("List already exists");
            int i=listNames.indexOf(listName);
            System.out.println("To-Do List: " + listNames.get(i));
            ArrayList<String> tasks = MainList.get(i);
            for (int j = 0; j < tasks.size(); j++) {
                System.out.println("  Task " + (j + 1) + ": " + tasks.get(j));
            }
        }

        else {
            listNames.add(listName);
            MainList.add(new ArrayList<>());
        }
    }

    public void addTask(String listName, String task) {
        int index = listNames.indexOf(listName);
        if (index != -1) {
            MainList.get(index).add(task);
        } else {
            System.out.println("To-Do list with name " + listName + " not found.");
        }
    }
    public  void displayCompleteTask(String name)
    {
        //for (int i = 0; i < listNames.size(); i++) {
        System.out.println("To-Do List:"+name);
        int i=listNames.indexOf(name);
        ArrayList<String> tasks = MainList.get(i);
        for (int j = 0; j < tasks.size(); j++) {
            System.out.println("  Task " + (j + 1) + ": " + tasks.get(j));
        }
    }

    public void displayListOfLists()
    {
        int i;
        for(i=0;i<listNames.size();i++)
        {
            System.out.println((i+1)+"."+listNames.get(i));
        }
    }
    public void removeTask(String listName, int pos)
    {
        MainList.get(listNames.indexOf(listName)).remove(pos-1);
    }
    public void markTask(String listName, int n)
    {
        int i=n-1;
        String tick="✓";
        MainList.get(listNames.indexOf(listName)).set(i,( MainList.get(listNames.indexOf(listName)).get(i)).concat(tick));
    }
    public void removeList(int n)
    {
        listNames.remove(n-1);
        System.out.println("After removal:-");
        displayListOfLists();
    }


}

