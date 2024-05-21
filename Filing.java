// import java.io.*;
// import java.util.Scanner;

// public class Filing {
//     public static void main(String[] args) {
//         try{ 
//         FileOutputStream fs = new FileOutputStream( "E://JAVA//Testfile.txt");
//         }
//         catch (IOException e){
//             System.out.println("Cannot create this file");
//         }

//         // Define the file path
//         String filePath = "E://JAVA//Testfile.txt";

//         // Demonstrate creating and writing to a file
//         createAndWriteToFile(filePath);

//         // Demonstrate reading from a file
//         readFromFile(filePath);

//         // Demonstrate appending to an existing file
//         appendToFile(filePath);

//         // Demonstrate deleting a file
//         deleteFile(filePath);
     
//     }

//     // Create and write to a file
//     public static void createAndWriteToFile(String filePath) {
//         try {
//             FileWriter writer = new FileWriter(filePath);
//             writer.write("Hello, File Handling in Java!");
//             writer.close();
//             System.out.println("File created and written successfully.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while creating/writing to the file: " + e.getMessage());
//         }
//     }

//     // Read from a file
//     public static void readFromFile(String filePath) {
//         try {
//             FileReader reader = new FileReader(filePath);
//             Scanner scanner = new Scanner(reader);

//             System.out.println("Contents of the file:");
//             while (scanner.hasNextLine()) {
//                 String line = scanner.nextLine();
//                 System.out.println(line);
//             }

//             reader.close();
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading from the file: " + e.getMessage());
//         }
//     }

//     // Append to an existing file
//     public static void appendToFile(String filePath) {
//         try {
//             FileWriter writer = new FileWriter(filePath, true); // true for appending
//             writer.write("\nAppending additional content.");
//             writer.close();
//             System.out.println("File appended successfully.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while appending to the file: " + e.getMessage());
//         }
//     }

//     // Delete a file
//     public static void deleteFile(String filePath) {
//         File file = new File(filePath);
//         if (file.delete()) {
//             System.out.println("File deleted successfully.");
//         } else {
//             System.out.println("Failed to delete the file.");
//         }
//     }
// }

import java.io.FileReader;
import java.io.FileWriter;

public class Filing{
    public static void main(String[] args) {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        String data;
        while (true) {
            if(fr.hasNextLine()){
               data =  fr.read();
            }
        }
        fw.write(data);
    }
}