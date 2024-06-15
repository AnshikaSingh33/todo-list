import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Create extends listMain {
    String name;
    String task;
    int n;


    public void input() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of to-do list:");
        this.name = reader.readLine();

        int x = isToDoListPresent(name);
        //System.out.println(x);
        if (isToDoListPresent(name) <= 0) {
            addToDoList(name);
            System.out.print("Enter the number of tasks to be added:");
            int i = sc.nextInt();
            System.out.println("Enter the tasks:-");

            for (int j = 1; j <= i; j++) {
                System.out.print(j + ".");
                this.task = reader.readLine();
                addTask(name, task);

            }
        } else {
            addToDoList(name);
            //System.out.println("Already present");
        }

        choice();
    }
    public void choice () throws IOException
    {
        while (true)
        {
            Scanner sc=new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("CHOICE:\n1.Add task\n2.Remove task\n3.Mark as complete\n4.Quit");
            System.out.print("Enter your Choice:");
            n = sc.nextInt();

            if (n == 1) {
                System.out.print("Enter the task to be added:");
                String Task = reader.readLine();
                addTask(name, Task);
                displayCompleteTask(name);
            } else if (n == 2) {
                System.out.print("Enter the task to be removed:");
                int n = sc.nextInt();
                removeTask(name, n);
                displayCompleteTask(name);
            } else if (n == 3) {
                System.out.print("Enter the task to be marked done:");
                int n = sc.nextInt();
                markTask(name, n);
                displayCompleteTask(name);
            } else if (n == 4) {
                return;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

}


