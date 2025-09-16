package src.BagStoreSimuiation.Bag;

import java.util.*;

public class Bag {
    private String type;
    private String material;
    private String color;
    private BagSize size;
    private int price;

    public Bag(String type, String material, String color, BagSize size, int price) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void selectBag() {
        System.out.println("상품을 선택했습니다. " + price + "원 입니다.");
    }

    public void packBag() {
        System.out.println("가방을 포장합니다.");
    }

    public void sellBag() {
        System.out.println("가방을 구매했습니다. 감사합니다.");
    }

    // getter
    public String getType() { return type; }
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public BagSize getSize() { return size; }
    public int getPrice() { return price; }
}
