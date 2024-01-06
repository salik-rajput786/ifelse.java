import java.util.Scanner;

public class youngestwithoutusingandand {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of Shyam");
        int s = sc.nextInt();
        
        System.out.println("enter age of Ajay");
        int a = sc.nextInt();
        System.out.println("enter age of Ram");
        int r = sc.nextInt();
            // the code of elder among them 
        
            if (s<a) {
                if (s<r) {
                    System.out.println("the youngest person is  Shyam his age is "+s);
                    
                }
                else System.out.println("the youngest person is  Ram his age is "+r);
                
            }
            else{
                if (a<s) {
                    if(a<r){
                    
                        System.out.println("the youngest person is  Ajay his age is "+a);
                }
                    else System.out.println("the youngest person is  Ram his age is "+r);
                }
            }

        }
    }

