import java.util.Scanner;



public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value of x-ais ");
        int x = sc.nextInt();
        
        System.out.println("enter a value of y-ais ");
        int y= sc.nextInt();
          
         if (x > 0 && y > 0) 
            System.out.println("lies in First quadrant"); 
  
        else if (x < 0 && y > 0) 
            System.out.println("lies in Second quadrant"); 
  
        else if (x < 0 && y < 0) 
            System.out.println("lies in Third quadrant"); 
  
        else if (x > 0 && y < 0) 
            System.out.println("lies in Fourth quadrant"); 
        else if(y==0 && x!=0){
            System.out.println("it lies on x-axis");
        }
        else if (x==0 && y!=0){
            System.out.println("it lies on y-axis");
        }
             else {
            System.out.println("it lies on orign");
        }
      
        }
    }

