package day08;

/*
書 Book
---------------------------------
書名: name
價格: price
---------------------------------
取得書名的方法: getName()
設定書名的方法: setName(String name)
取得價格的方法: getPrice()
設定價格的方法: setPrice(int price)
*/
public class Book {
    private String name;
    private int price;
    // 建構子封裝
    public Book() {
    }
    public Book(String name, int price) {
        setName(name);
        setPrice(price);
    }
    // 方法封裝
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        if(price >= 0) {
            this.price = price;
        } 
    }
}
