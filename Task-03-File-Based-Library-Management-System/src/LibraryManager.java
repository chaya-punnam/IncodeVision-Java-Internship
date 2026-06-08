import java.io.*;
import java.util.*;
public class LibraryManager 
{
    private static final String FILE_NAME = "../data/books.txt";
    public void addBook(int id, String title) 
    {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(id + "," + title + ",false");
            bw.newLine();
            System.out.println("Book Added Successfully!");
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void viewBooks() 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
                {
                String[] data = line.split(",");
                System.out.println(
                        "ID: " + data[0]
                                + " | Title: " + data[1]
                                + " | Issued: " + data[2]);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("No books found.");
        }
    }
    public void searchBook(int id) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] data = line.split(",");
                if (Integer.parseInt(data[0]) == id) 
                {
                    System.out.println(
                            "Book Found -> ID: "
                                    + data[0]
                                    + ", Title: "
                                    + data[1]
                                    + ", Issued: "
                                    + data[2]);

                    return;
                }
            }
            System.out.println("Book Not Found.");

        } 
        catch (IOException e) 
        {
            System.out.println("Error.");
        }
    }
    public void updateBookStatus(int id, boolean issue) 
    {
        List<String> books = new ArrayList<>();
        try (BufferedReader br =
                     new BufferedReader(new FileReader(FILE_NAME))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {

                String[] data = line.split(",");
                if (Integer.parseInt(data[0]) == id) 
                {
                    data[2] = String.valueOf(issue);
                }
                books.add(data[0] + "," + data[1] + "," + data[2]);
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error.");
        }
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(FILE_NAME))) 
        {

            for (String book : books) 
            {
                bw.write(book);
                bw.newLine();
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error.");
        }
        if (issue)
        {
            System.out.println("Book Issued Successfully!");
        } 
        else 
        {
            System.out.println("Book Returned Successfully!");
        }
    }
}