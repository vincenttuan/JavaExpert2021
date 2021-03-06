package day08;

import java.util.ArrayList;

public class BookStore {
    private ArrayList<Book> books = new ArrayList<>();
    // 新增書籍
    public void addBook(String name, int price) {
        Book book = new Book(name, price);
        books.add(book);
    }
    // 單筆查詢
    public Book getBookByName(String name) {
        Book book = null;
        for(Book b : books) {
            if(b.getName().equals(name)) {
                book = b;
                break;
            }
        }
        return book;
    }
    // 多筆查詢
    public ArrayList<Book> findAllBooks() {
        return books;
    }
    // 刪除書籍
    public void removeBookByName(String name) {
        Book book = getBookByName(name);
        if(book != null) {
            books.remove(book);
        }
    }
    // 修改價格
    public void updateBookPriceByName(String name, int newPrice) {
        Book book = getBookByName(name);
        if(book != null) {
            book.setPrice(newPrice); // 修改價格
        }
    }
    
    // 取得書籍總價
    public int getTotalPrice() {
        int total = 0;
        for(Book book : books) {
            total += book.getPrice();
        }
        return total;
    }
}
