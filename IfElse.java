// Github : Muhia1
// Control Statements : if_else
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse1{
    public static void main(String []args) throws IOException{
        BufferedReader stdln = new BufferedReader(new InputStreamReader(System.in));
        // Declare Variables
        String input;
        int salary;

        // Prompt user input
    System.out.println("Enter Your Salary");
    input = stdln.readLine();
    salary = Integer.parseInt(input);
    
    // Checks whether salary is > or < than 10,000
    if(salary>10000){
    System.out.println("A salary of " + salary + " is greater than 10000");
        }else {
            System.out.println("A Salary of "+ salary + " is less than 10000");
        }
    }
}