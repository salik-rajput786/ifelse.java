import java.util.Scanner;

/**
 * leastnumberwhitoutusingelseif
 */
public class leastnumberwhitoutusingelseif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = sc.nextInt();
        System.out.println("enter a number ");
        int b = sc.nextInt();
        System.out.println("enter a number ");
        int c = sc.nextInt();

        if (a<b) {
            if (a<c) {
                System.out.println("least number is "+a);
                
            }
            else System.out.println("lest number is "+c);
            
        }
        else{
            if (b<a) {
                if (b<c) {
                    System.out.println("least number is "+b);
                }
                else System.out.println("least number is "+c);
            }
        }

    }
}