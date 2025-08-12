package com.vinay;

public class BookService {
    private final BookDAO dao = new BookDAO();

    public void addBook(String title, String author) {
        dao.save(new Book(title, author));
    }

    public Book getBook(int id) {
        return dao.get(id);
    }

    public void updateBook(int id, String newAuthor) {
        Book book = dao.get(id);
        if (book != null) {
            book.setAuthor(newAuthor);
            dao.update(book);
        }
    }

    public void deleteBook(int id) {
        dao.delete(id);
    }
}
