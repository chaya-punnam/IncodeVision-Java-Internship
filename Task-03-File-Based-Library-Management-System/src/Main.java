import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    manager.addBook(id, title);

                    break;

                case 2:

                    manager.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    manager.searchBook(searchId);

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();

                    manager.updateBookStatus(issueId, true);

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();

                    manager.updateBookStatus(returnId, false);

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}