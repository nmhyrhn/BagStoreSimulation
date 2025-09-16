package src.BagStoreSimulation.Bag;

public class Bag {
    //필드
    private String type; //클러치, 토트백, 크로스백, 숄더백, 백팩 map+switch
    private String material; //천, 나일론, 인조가족, 천연가죽 map+switch
    private String color; //옐로우, 브라운, 블랙, 화이트, 블루 enum+switch
    private BagSize size; //BagSize 추상 클래스 기반, 사용자 정의 타입으로 입력받음
    private int price; //map으로 종류 가격 + 재질 가격 합산

    //생성자
    public Bag(String type, String material, String color, BagSize size, int price) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    //메소드
    public void selectBag() {
        System.out.println("상품을 준비했습니다. " + price + "원 결제도와드리겠습니다.");
    }

    public void packBag() {
        System.out.println("가방을 포장합니다.");
    }

    public void sellBag() {
        System.out.println("결제완료 되었습니다. 감사합니다.");
    }

    // getter
    public String getType() { return type; }
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public BagSize getSize() { return size; }
    public int getPrice() { return price; }
}
