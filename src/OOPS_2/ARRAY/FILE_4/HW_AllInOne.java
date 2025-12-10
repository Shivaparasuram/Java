package OOPS_2.ARRAY.FILE_4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class HW_AllInOne {
        public static void main(String[] args) {
            File file = new File("demo.txt");

            try {
                // 1️⃣ Create the file
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }

                // 2️⃣ Write to the file
                FileWriter writer = new FileWriter(file);
                writer.write("Hello, this is a test file.\n");
                writer.write("Second line of text.");
                writer.close();
                System.out.println("Data written to file.");

                // 3️⃣ Read from the file
                List<String> lines = Files.readAllLines(file.toPath());
                System.out.println("Reading file contents:");
                for (String line : lines) {
                    System.out.println(line);
                }

                // 4️⃣ Delete the file
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }

            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

