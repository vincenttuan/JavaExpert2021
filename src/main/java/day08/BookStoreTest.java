package day08;

import java.util.List;

public class BookStoreTest {
    public static void main(String[] args) {
        // 書店
        BookStore bookStore = new BookStore();
        
        // 書籍新增(上架)
        bookStore.addBook("Java", 200);
        bookStore.addBook("Python", 150);
        bookStore.addBook("C++", 100);
        
        // 查詢所有書籍
        List<Book> books = bookStore.findAllBooks();
        // 印出所有書籍
        System.out.println(books);
        // 該書店的書籍共有幾本
        System.out.println("書籍數量: " + books.size());
        
        // 該書店的書籍總價 case 1
        /*
        int total = 0;
        for(Book b : books) {
            total += b.getPrice();
        }
        System.out.println("書籍總價: " + total);
        */
        // 該書店的書籍總價 case 2
        System.out.println("書籍總價: " + bookStore.getTotalPrice());
        
        // 修改 Java 的價格為 500 元
        bookStore.updateBookPriceByName("Java", 500);
        // 重新找到並印出目前所有書籍
        System.out.println(bookStore.findAllBooks());
        
        // 刪除 Python 這一本書
        bookStore.removeBookByName("Python");
        // 重新找到並印出目前所有書籍
        System.out.println(bookStore.findAllBooks());
    }
}
