package day10.zoo;

import java.util.ArrayList;
import java.util.Random;

// 禮品店
public class GiftShop {
    // 動物商品s
    private ArrayList<Animal> animals = new ArrayList<>();
    
    // 商品上架
    public void launch(Animal animal) {
        animals.add(animal);
    }
    
    // 隨機抽獎
    public Animal getRandom() {
        // 例如: nextInt(10) 表示會取 0~9 的任意整數
        int n = new Random().nextInt(animals.size());
        return animals.get(n);
    }
    
    // 列出所有商品
    public void print() {
        System.out.println(animals);
    }
    
    // 得到所有商品
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    
}
