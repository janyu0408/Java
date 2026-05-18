import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        books = new ArrayList<Book>();
    }

    public Book getBook(int index) {
        if (index < books.size()) {
            Book book = new Book(books.get(index));

            return book;
        }
        return null;
    }

    public void setBook(int index, Book book) {
        if (index < books.size()) {
            Book copy = new Book(book);
            this.books.set(index, copy);

        }

    }

    public void addBook(Book book) {
        Book copy = new Book(book);
        this.books.add(copy);
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }
    public void sellBook(String name)
    {
        for(int i =0; i < books.size(); i++)
        {
            if(this.books.get(i).getTitle().equals(name))
            {
                this.books.remove(i);
            }
        }
    }

}
