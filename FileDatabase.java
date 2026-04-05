import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDatabase {

    private static final String FILE_NAME = "snippets.txt";

    public void saveSnippet(Snippet snippet){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))){

            writer.write(snippet.getTitle() + "|" +
                    snippet.getLanguage() + "|" +
                    snippet.getCode());

            writer.newLine();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<Snippet> loadSnippets(){

        List<Snippet> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){

            String line;

            while((line = reader.readLine()) != null){

                String[] parts = line.split("\\|");

                if(parts.length == 3){
                    list.add(new Snippet(parts[0], parts[1], parts[2]));
                }
            }

        }catch(IOException e){
            System.out.println("No previous snippets found.");
        }

        return list;
    }
}
