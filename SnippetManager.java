import java.util.ArrayList;
import java.util.List;

public class SnippetManager {

    private List<Snippet> snippets;
    private FileDatabase database;

    public SnippetManager() {
        snippets = new ArrayList<>();
        database = new FileDatabase();
        snippets = database.loadSnippets();
    }

    public void addSnippet(String title, String language, String code){

        Snippet snippet = new Snippet(title, language, code);
        snippets.add(snippet);

        database.saveSnippet(snippet);

        System.out.println("Snippet saved successfully!");
    }

    public void viewSnippets(){

        if(snippets.isEmpty()){
            System.out.println("No snippets found.");
            return;
        }

        for(Snippet s : snippets){
            System.out.println(s);
        }
    }

    public void searchByLanguage(String language){

        SearchEngine.search(snippets, language);
    }
}
