package Book;

import Book.Book;

import java.util.Iterator;

public class Library implements Iterable<Book> {

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements  Iterator<Book>{

        int index = 0;

        @Override
        public boolean hasNext() {
             return  index < books.length;
                    }

        @Override
        public Book next() {
          return books[index++];
        }
    }
    private Book[] books;

    public Library(Book ... books) {
        this.books = books;
    }


}
