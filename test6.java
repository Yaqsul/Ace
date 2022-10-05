import java.util.Scanner;
public class Main{
    public static void main(String[] args){
         Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = Scan.nextInt();
         System.out.println("Enter a number");
        int b = Scan.nextInt();
        System.out.println("Enter a number");
        int c = Scan.nextInt();
        System.out.println("Enter a number");
        int d = Scan.nextInt();
        System.out.println("Enter a number");
        int e = Scan.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("sum is:" + sum);
        int average= sum/5;
        System.out.println("Average is :"+ average);
        


    }
}