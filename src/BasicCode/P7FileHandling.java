package BasicCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Scanner;

//Find the no of occurrence of  specific string in e.g. "India" in a file e.g. "test.txt"
public class P7FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        //Open & Write to file
        try {
            FileWriter file = new FileWriter("test.txt");
            file.write("Indian culture and traditions are something which has now become renowned all across the world.  We all refer to customs and traditions of India as something very diverse and unique. But seldom do we give a thought to why things are done in certain specific ways. Indian culture is full of several unique customs and traditions, which outsiders might find intriguing. Most of these originate from the Ancient Indian scriptures and texts, which have dictated the way of life in India for thousands of years.");
            file.close();
        } catch (Exception e) {
            System.out.println("Some error occured : " + e.getMessage());
        }

        //Open & read from file
        File fileObj = new File("test.txt");
        Scanner scanFile = new Scanner(fileObj);
        while (scanFile.hasNextLine()) {
            String data = scanFile.nextLine();
            data = data.replace('.', ' ');
            String[] arr = data.split("\\s");
            System.out.println(Arrays.toString(arr));
            int count = 0;
            String word = "India";
            for (String s : arr) {
                if (s.equals(word)) {
                    count++;
                }
            }
            System.out.println("No of occurrence of '" + word + "' are " + count);
        }
        scanFile.close();

    }
}
