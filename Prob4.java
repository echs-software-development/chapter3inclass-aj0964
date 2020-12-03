import java.util.Scanner;

public class Prob4  {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.print("What is the temperature?: ");    
  double temp = scan.nextDouble();
  if (temp >= 102 || <= 99)
   System.out.println("WARNING");
  
  else 
   System.out.println("Temperature is ok.");  
  

    
  }
}
