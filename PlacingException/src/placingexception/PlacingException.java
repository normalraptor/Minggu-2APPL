/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placingexception;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PlacingException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        try{
        while (scanLine.hasNext())
        {
        val = Integer.parseInt(scanLine.next());
        sum += val;
        }}catch(NumberFormatException e){}
        System.out.println("The sum of the integers on this line is " + sum);
    }
    
}
