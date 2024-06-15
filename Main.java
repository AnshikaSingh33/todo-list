import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int n;

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOICE:\n1.Create todo list\n2.Use todo list\n3.remove\n4.Quit");
        System.out.print("Enter your choice:");
        n = sc.nextInt();
    }

    public static void main(String[] args) throws IOException {

        Main obj = new Main();
        obj.displayMenu();
        Create obj1 = new Create();
        Use obj2 = new Use();
        Remove obj3 = new Remove();
        while (true) {

            if (n == 1) {
                while (true) {
                    obj1.input();
                    obj.displayMenu();
                    if (n != 1)
                        break;
                }
            } else if (n == 2) {
                obj1.displayListOfLists();
                while (true) {
                    obj2.init();
                    obj1.displayCompleteTask(obj2.name);
                    obj1.choice();
                    obj.displayMenu();


                }
            } else if (n == 3) {
                obj1.displayListOfLists();
                obj3.init();
                obj1.removeList(obj3.n);
                obj.displayMenu();

            } else if (n == 4) {
                System.exit(0);
            } else {
                System.out.println("Invalid Input!!");
                System.exit(0);
            }
        }
    }
}



