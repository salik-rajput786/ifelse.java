import java.util.Scanner;

/**
 * tirangle
 */
public class tirangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("enter a number ");
        int a = sc.nextInt();
        System.out.println("enter a number ");
        int b = sc.nextInt();
        System.out.println("enter a number ");
        int c= sc.nextInt();

        if (a==b && b==c&& c==a) {
            System.out.println("it is an  equilateral triangle");
            
        }
        else if(a==b||b==c ||c==a ){
             System.out.println("it is an isosceles triangle");
        }
        else{
             System.out.println("it is scalene triangle");
        }

    }
}
