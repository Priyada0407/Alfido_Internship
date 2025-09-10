import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name (with path if not in the same folder): ");
        String fileName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("\nContents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}
