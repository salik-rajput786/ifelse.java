import java.util.Scanner;

public class threenumbergreatestnumberwithouelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a munber ");
        int a = sc.nextInt();
        System.out.println("enter a munber ");
        int b = sc.nextInt();
        System.out.println("enter a munber ");
        int c = sc.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("the greatest number ic "+a);
            }
            else System.out.println("the greatest number is "+c);

        }
        
        if (b>a) {
            if (b>c) {
                System.out.println("the greatest number is "+b);
                
            }
            else System.out.println("the greatest number is "+c);
            
        }
        

    }
    
}
