import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SnippetManager manager = new SnippetManager();

        while(true){

            System.out.println("\n===== CODE SNIPPET MANAGER =====");
            System.out.println("1. Add Snippet");
            System.out.println("2. View All Snippets");
            System.out.println("3. Search By Language");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter language: ");
                    String language = scanner.nextLine();

                    System.out.println("Enter code:");
                    String code = scanner.nextLine();

                    manager.addSnippet(title, language, code);
                    break;

                case 2:
                    manager.viewSnippets();
                    break;

                case 3:
                    System.out.print("Enter language: ");
                    String searchLang = scanner.nextLine();
                    manager.searchByLanguage(searchLang);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
