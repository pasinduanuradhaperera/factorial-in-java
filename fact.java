import java.util.Scanner;

public class fact
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number : ");
            int  number = scanner.nextInt();
            int fact = 1;
            int i = 0;
            int neNum = number;
            while(i < number){

                fact *= neNum--;                
                i++;

            }
            System.out.println("The factorial of "+ number + " is "+ fact);

    }
}