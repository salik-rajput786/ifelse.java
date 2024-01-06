import java.util.Scanner;

public class absoulte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = sc.nextInt();
        if (a<0) {
            System.out.println("the number is not absoulte ");
            System.out.println("the absoulte number is "+a*-1);
            
        } else {
             System.out.println("the number is  absoulte ");
        }
    }
    
}
