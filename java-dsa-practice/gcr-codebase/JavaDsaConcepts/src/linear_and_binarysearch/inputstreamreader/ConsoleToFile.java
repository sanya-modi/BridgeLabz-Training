package linear_and_binarysearch.inputstreamreader;

import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) throws IOException {

    	 String fileName = "output.txt";

         try (
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(fileName)
         ) {
             String line;

             System.out.println("Enter text (type 'exit' to stop):");

             while (true) {
                 line = br.readLine();

                 if (line.equalsIgnoreCase("exit")) {
                     break;
                 }

                 fw.write(line + System.lineSeparator());
             }

             System.out.println("Input saved to file successfully.");

         } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         }
         
    }
}
