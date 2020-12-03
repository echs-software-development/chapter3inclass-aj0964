import java.util.Scanner;

public class Prob3  {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Give a number, 0-4:");
    int grade = scan.nextInt();
    if (grade == 4)
      System.out.println("A");
    else if(grade == 3)
      System.out.println("B");
    else if(grade == 2)
      System.out.println("C");
    else (grade == 1);
      System.out.println("F");


    
  }
}
