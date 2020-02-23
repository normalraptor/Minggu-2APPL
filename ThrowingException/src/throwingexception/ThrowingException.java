/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingexception;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ThrowingException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
        System.out.print("Enter an integer: ");
        int val = scan.nextInt();
        try{
        System.out.println("Factorial(" + val + ") = "
        + MathUtils.factorial(val));
        }catch(IllegalArgumentException e){
        System.out.println("Illegal argument, cannot be negative or above 16");
        }
        System.out.print("Another factorial? (y/n) ");
        keepGoing = scan.next();
        }
    }
    
}
