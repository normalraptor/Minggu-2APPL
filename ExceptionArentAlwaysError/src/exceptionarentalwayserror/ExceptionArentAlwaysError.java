/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionarentalwayserror;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ExceptionArentAlwaysError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        //get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        //convert to all upper case
        word = word.toUpperCase();
        //count frequency of each letter in string
        int z=0;
        try{
        for (z=0; z < word.length(); z++)
        counts[word.charAt(z)-'A']++;
        }
        catch(ArrayIndexOutOfBoundsException err){
        System.out.println("Array out of bounds!");
        System.out.println("'" + word.charAt(z) + "' " + "is not a letter");
        }
        //print frequencies
        System.out.println();
        for (int i=0; i < counts.length; i++)
        if (counts [i] != 0)
        System.out.println((char)(i +'A') + ": " + counts[i]);
    }
    
}
