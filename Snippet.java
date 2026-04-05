public class Snippet {

    private String title;
    private String language;
    private String code;

    public Snippet(String title, String language, String code) {
        this.title = title;
        this.language = language;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               "\nLanguage: " + language +
               "\nCode:\n" + code +
               "\n--------------------";
    }
}
