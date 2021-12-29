package day09_2;

public class Dessert extends Product {
    private String size; // 尺寸(大、中、小)

    public Dessert() {
    }

    public Dessert(String size, String name, Integer price) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("%s{size=%s, name=%s, price=%d\n}", 
                            getClass().getSimpleName(),
                            getSize(),
                            getName(),
                            getPrice());
    }
    
}
