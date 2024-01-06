import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        
    
  Scanner sc = new Scanner(System.in);
        System.out.println("enter a length recangle "); 
        int l = sc.nextInt();
        System.out.println("enter a breadth of rectangle  ");
        int b  = sc.nextInt();
        int are = l*b;
        System.out.println("the area od rectangle is "+are );
        int per =2*l+b;
        System.out.println("the  perimeter of rectangle is "+per);
        if (per<are) {
            System.out.println("the  perimeter is smaller than area ");
            
        } else if(per==are){
            System.out.println("not  perimeter is smaller than area and  perimeter is greather than area ");

        }
        
        else {
            System.out.println("the  perimeter is greather than area ");
        }

}
}
