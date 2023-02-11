package Articles2;

public class Articles2 {
    private String title;
    private String content;
    private String author;

    public Articles2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void edit (String newContent){
        this.content = newContent;
    }
    public void changeAuthor (String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newAuthor){
        this.title = newAuthor;
    }
    public String toString (){
        return this.title +" - " + this.content + ": " + this.author;
    }
}
