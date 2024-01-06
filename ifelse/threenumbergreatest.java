import java.util.Scanner;

public class threenumbergreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eter a number ");
        int a = sc.nextInt();
        System.out.println("eter a number ");
        int b = sc.nextInt();
        System.out.println("eter a number ");
        int c= sc.nextInt();
        if (a>b && a>c) {
            System.out.println("the greatest number is "+a);
        } else if(b>a && b>c){
            System.out.println("the greatest number is "+b);
        }

        else {
            System.out.println("the greatest number is "+c);

        }

    }
}
