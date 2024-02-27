import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program18 {
    public static void main(String[] args) throws IOException{
        String filePath = "your_file.csv"; // Replace "your_file.csv" with the path to your CSV file


            long rowCount = Files.lines(Paths.get(filePath))
                    .skip(1) // Skip header row if present
                    .count();
            System.out.println("Number of rows in the CSV file: " + rowCount);

    }
}
