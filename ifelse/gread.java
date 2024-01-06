import java.util.Scanner;

public class gread {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the maths marks  obtain by student  ");
    int m= sc.nextInt();
    System.out.println("Enter the chemistry marks  obtain by student  ");
    int c= sc.nextInt();
    System.out.println("Enter the physics marks  obtain by student  ");
    int p= sc.nextInt();
    System.out.println("Enter the  English marks  obtain by student  ");
    int e= sc.nextInt();
    System.out.println("Enter the DLD marks  obtain by student ");
    int d= sc.nextInt();
    System.out.println("Enter the dbms marks  obtain by student  ");
    int db= sc.nextInt();

     int totalmarks = m+c+p+e+d+db;
     System.out.println("the totalmarks is "+totalmarks);
     double percentage= totalmarks/6;
     System.out.println("the percentage is "+percentage);
     if (percentage>=81) {
        System.out.println("very good ");
     }
     else if (percentage>=61){
        System.out.println("good");
     }
     else if(percentage>=41)
     {
        System.out.println("average");
     }
     else{
        System.out.println("fail");
     }
     


  }
}
