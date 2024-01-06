import java.util.Scanner;

public class agegreastestandleast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of Shyam");
        int s = sc.nextInt();
        
        System.out.println("enter age of Ajay");
        int a = sc.nextInt();
        System.out.println("enter age of Ram");
        int r = sc.nextInt();
            // the code of elder among them 
         if (s>a && s>r) {
            System.out.println("the elder person is  Shyam his age is "+s);
            
         }
         else if(a>s && a>r){
            System.out.println("the elder person is  Ajay his age is "+a);
         }else
         {
            System.out.println("the elder person is  Ram his age is "+r);
         }
           // code of youngest among them 
           if (s<a && s<r) {
            System.out.println("the youngest person is  Shyam his age is "+s);
            
         }
         else if(a<s && a<r){
            System.out.println("the youngest person is  Ajay his age is "+a);
         }else
         {
            System.out.println("the youngest person is  Ram his age is "+r);
         }


        }
    }