import java.util.Scanner;

public class proifloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a cost price ");
        int cp = sc.nextInt();
        System.out.println("enter a selling price ");
        int sp = sc.nextInt();

        if(cp>sp)
        {
           int loss=cp-sp;
             System.out.println("sorry! you have got loss in your bussien of  "+loss);
        }else if  (cp==sp) {
            int either = cp-sp;
              System.out.println(" nither you  have gain a proif or a loss  in your bussien   "+either+ " proit ");
        }
                 else 
        {
            int gain = sp-cp;
            System.out.println(" congrulation you gain a proif of   "+gain);
        }
    }
    
}
