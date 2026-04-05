import java.util.List;

public class SearchEngine {

    public static void search(List<Snippet> snippets, String language){

        boolean found = false;

        for(Snippet s : snippets){

            if(s.getLanguage().equalsIgnoreCase(language)){
                System.out.println(s);
                found = true;
            }
        }

        if(!found){
            System.out.println("No snippets found for language: " + language);
        }
    }
}
