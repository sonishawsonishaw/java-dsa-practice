import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter you name : ");
       String name = sc.nextLine();
        System.out.print("Enter you age : ");
        int age=sc.nextInt();
         System.out.print("Enter you height : ");
         float height =sc.nextFloat();
          System.out.print("Enter you grade : ");
          char grade=sc.next().charAt(0);
          System.out.println(name);
          System.out.println(age);
          System.out.println(height);
          System.out.println(grade);

    }
}