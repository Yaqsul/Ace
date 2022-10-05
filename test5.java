import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
     Scanner Scan = new Scanner(System.in);
         System.out.println("Farenheit value");
        int a = Scan.nextInt();
        int b =(a-32)*5/9;
        System.out.println("Degree celsius:" + b );
    }
}