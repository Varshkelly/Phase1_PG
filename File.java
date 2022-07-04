//FILE HANDLING --> get a input from the user and write it in the file also read it.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.lang.model.element.Name;
public class File {
    public static void main(String[] args)
        throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.println("Enter data: ");;
        // Reading data using readLine
        String data = reader.readLine();
 
            // Printing the read line
            System.out.println("Data in the File:" + data);

    try{
        FileWriter Output = new FileWriter("//Users//kailashvarma//Documents//Varsha//weekend.txt");
            Output.write(data);
            System.out.println("data written");
            Output.close();

            char[] array = new char[40];
            FileReader input = new FileReader("//Users//kailashvarma//Documents//Varsha//weekend.txt");
            input.read(array);    
            System.out.println("data in the file ---->");
            System.out.println(array);
            input.close();
            
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}

