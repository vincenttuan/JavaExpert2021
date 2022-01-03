package day10.zoo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 建立商品店
        GiftShop giftShop = new GiftShop();
        // 列印商品
        giftShop.print();
        // 待上架的商品
        Bird b1 = new Bird("白文鳥");
        Bird b2 = new Bird("鸚鵡");
        Ostrich o1 = new Ostrich("鴕鳥");
        Fish f1 = new Fish("金魚");
        Fish f2 = new Fish("鯉魚");
        // 商品上架
        giftShop.launch(b1);
        giftShop.launch(b2);
        giftShop.launch(o1);
        giftShop.launch(f1);
        giftShop.launch(f2);
        // 列印商品
        giftShop.print();
        // 請問 Bird 種類商品有哪些 ?
        ArrayList<Animal> animals = giftShop.getAnimals();
        // case 1:
        for(Animal animal : animals) {
            if(animal.getClass().getSimpleName().equals("Bird")) {
                System.out.println(animal);
            }
            if(animal.getClass().getSimpleName().equals("Ostrich")) {
                System.out.println(animal);
            }
        }
        // case 2 (判斷速度快):
        for(Animal animal : animals) {
            if(animal instanceof Bird) {
                System.out.println(animal);
            }
        }
        
    }
}
