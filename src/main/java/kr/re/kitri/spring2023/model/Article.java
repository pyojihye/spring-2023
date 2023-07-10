package kr.re.kitri.spring2023.model;

public class Article {
    private int id;
    private String title;
    private String body;
    private String author;

    //마우스 오른쪽 > generator > Constructor
    public Article() {}

    public Article(int id, String title, String body, String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    //마우스 오른쪽 > Generator > Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    //마우스 오른쪽 > Generator > Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //마우스 오른쪽 > generator > toString()
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
