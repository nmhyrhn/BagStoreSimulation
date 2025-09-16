package MiniProjectBag.Bag;

import java.util.*;

class Bag {
    //필드
    private String type; //도트백, 크로스백, 백팩, 숄더백, 클러치
    private String material; //천, 인조가죽, 천연가죽, 나일론
    private String color; //브라운, 화이트, 블랙, 옐로우, 블루
    private String Size; // 추상화인데 연결해야하나
    private int price; // 가격은 맵으로 지정


    //생성자
    public Bag(String type, String material, String color, String Size, int price) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.Size = Size;
        this.price = price;
    }

    //메소드

    //가방 선택
    public void selectBag(){
        System.out.println("상품을 선택했습니다." + price + "원 입니다.");
    }

    //가방 포장
    public void packBag(){
        System.out.println("가방을 포장합니다.");
    }

    //가방 판매
    public void sellBag(){
        System.out.println("가방을 구매했습니다. 감사합니다.");
    }

    // getter
    public String getType() { return type; }
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public BagSize getSize() { return size; }
    public int getPrice() { return price; }
}


