public class Book {
    private final Author author;
    private final String bookName;
    private final String publisher;
    private int publishingYear;

    public Book (Author author, String bookName, String publisher, int publishingYear){
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
