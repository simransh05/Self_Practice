package practice;
import java.util.Scanner;
public class Switch{
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter the value: ");
//        int month = sc.nextInt();
        System.out.print("enter the first value");
        int num1 = sc.nextInt();
        System.out.print("Enter the second value: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation");
        String operation = sc.next();
        
//        myMonth(month);
        
        int result = switch(operation) {
        case "+" -> num1+num2;
        case "-" -> num1-num2;
        case "*" -> num1 *num2;
        case "/" -> num1/num2;
        default -> 0;
        };
        
       System.out.println("your output is "+ result); 
	}
	
        
    public static void myMonth(int month){
        String output = switch(month){
           case 1 -> "jan";
           case 2 -> "feb";
           case 3 -> "mar";
           case 4 -> "april";
           case 5 -> "may";
           case 6 -> "june";
           case 7 -> "july";
           case 8 -> "aug";
           case 9 -> "sept";
           case 10 -> "oct";
           case 11 -> "nov";
           case 12 -> "dec";
           default -> "Invalid month";
        };
         System.out.println(output);
    }
}