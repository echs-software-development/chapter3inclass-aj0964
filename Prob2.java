import java.util.Scanner;

public class Prob2  {
  public static void main(String[] args){
    Scanner Scan = new Scanner(System.in);
    System.out.print("Enter First number: ");
    double num1 = Scan.nextDouble();
    System.out.print("Enter Second number: ");
    double num2 = Scan.nextDouble();
    System.out.print("Enter Third number: ");
    double num3 = Scan.nextDouble();
    System.out.print("Enter Fourth number: ");
    double num4 = Scan.nextDouble();
    double avg = (num1 + num2 + num3 + num4);
    avg = (avg / 4);
    if (avg >= 89.5)
    System.out.println("Above average");

    
  }
}
