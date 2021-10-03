package pro.sky.java.course1.lesson8;

public class Launch {
    public static void main(String[] args) {
        Author author = new Author("Shahida", "Arabi");
        Book book = new Book("She who destroys the light: Fairy tales gone wrong", author, 2016);
        Author author1 = new Author("Roger", "Zelazny");
        Book book1 = new Book("The Chronicles of Amber", author1, 1998);
        book1.setPublicationYear(2019);
    }
}