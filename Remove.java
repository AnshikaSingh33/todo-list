import java.util.Scanner;

public class Remove extends Create {
    int n;
    public void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the list to be removed:");
        n=sc.nextInt();
    }
}