/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingafile;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ASUS
 */
public class CopyingAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean loop=true;
        String judul;
        Scanner strscan = new Scanner(System.in);
        File theFile = null;
        while(loop){
            System.out.println("Input file directory ex. C:/Users/User/Desktop/file.txt :");
            judul = strscan.nextLine();
            theFile = new File(judul);
            if(theFile.exists()){
            loop = false;
            System.out.println("File found");
            }else{
            System.out.println("File/directory couldn't be found");
            }
        }
        try{
        Scanner filescan = new Scanner(theFile);
        FileWriter copypaste = new FileWriter("C:/Users/ASUS/Desktop/copyoftext.txt");
        while(filescan.hasNextLine()){
            String read = filescan.nextLine();
            copypaste.write(read);
            copypaste.write("\n");
        }
        copypaste.close();
        filescan.close();
        System.out.println("Successfully copied txt file");
        }
        catch(FileNotFoundException err){
        System.out.println("File not found");
        }
        catch(IOException e){
        System.out.println("IO error");
        }
    }
    
}
