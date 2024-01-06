import java.util.Scanner;

public class leastnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = sc.nextInt();  
        System.out.println("enter a number ");
        int b= sc.nextInt();
        System.out.println("enter a number ");
        int c = sc.nextInt();

        if (a<b && a<c) {
            System.out.println("least number is "+a);
            
        }else if(b<a && b<c){
            System.out.println("least number is "+b);
        }
         else {
            System.out.println("least number is "+c);
        }


    }
}
