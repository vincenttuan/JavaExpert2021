package day08;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setName("Java");
        b1.setPrice(200);
        
        Book b2 = new Book("Python", 150);
        
        //System.out.println(b1.getName() + " $" + b1.getPrice());
        //System.out.println(b2.getName() + " $" + b2.getPrice());
        
        System.out.println(b1);
        System.out.println(b2);
        
        //System.out.println(b1.toString());
        //System.out.println(b2.toString());
    }
}
