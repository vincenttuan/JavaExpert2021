package day09_2;

public class Drink extends Product {
    private int capacity; // 容量

    public Drink() {
    }

    public Drink(int capacity, String name, Integer price) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%s{capacity=%d, name=%s, price=%d}", 
                            getClass().getSimpleName(),
                            getCapacity(),
                            getName(),
                            getPrice());
    }

}
