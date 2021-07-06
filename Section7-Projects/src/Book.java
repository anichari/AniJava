public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;
    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public String getGenre() {
        return this.genre;
    }
    public int getNumPages() {
        return this.numPages;
    }
    public void printData() {
        System.out.println(this.getAuthor() + " wrote a " +
                this.getNumPages() + " page " +
                this.getGenre() +
                " book called " + this.getTitle());
    }
}
