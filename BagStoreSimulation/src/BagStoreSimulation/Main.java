package src.BagStoreSimulation;

import src.BagStoreSimulation.Attributes.BagColor;
import src.BagStoreSimulation.Attributes.BagMaterial;
import src.BagStoreSimulation.Attributes.BagType;
import src.BagStoreSimulation.Bag.Bag;
import src.BagStoreSimulation.Bag.BagSize;
import src.BagStoreSimulation.Order.OrderHistory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====가방 구매 시뮬레이터=====");
        System.out.println("");

        // 가방 종류 선택
        System.out.println("===가방을 골라주세요.===");
        System.out.println("1-토트백 2-크로스백 3-백팩 4-숄더백 5-클러치 ");
        int typeChoice = sc.nextInt();
        //정수 입력 받음, 가방 종류 선택 번호
        String type = BagType.getType(typeChoice);
        //선택 번호를 문자열로 변환
        //bagType의 getType호출
        int typePrice = BagType.getPrice(type);
        //선택 가방을 가격으로 변환
        //BagType의 getPrice 호출

        System.out.println(type + "은 " + typePrice + "원 입니다.");
        System.out.println("");


        // 재질 선택
        System.out.println("===재질을 골라주세요.===");
        System.out.println("1-천 2-인조가죽 3-천연가죽 4-나일론");
        int materialChoice = sc.nextInt();
        String material = BagMaterial.getMaterial(materialChoice);
        int materialPrice = BagMaterial.getPrice(material);

        System.out.println(material + " 재질은 " + materialPrice + "원 입니다.");
        System.out.println("");

        // 총 가격 합산
        int totalPrice = typePrice + materialPrice;

        System.out.println(material+"인 "+type + "은 " + totalPrice + "원 입니다.");
        System.out.println("");

        // 색상 선택
        System.out.println("===색상을 골라주세요.===");
        System.out.println("1-브라운 2-화이트 3-블랙 4-옐로우 5-블루 ");
        int colorChoice = sc.nextInt();
        String color = BagColor.getColor(colorChoice).getColorName();

        System.out.println(color+" 색상을 고르셨습니다.");
        System.out.println("");

        // 사이즈 입력
        System.out.println("===가로, 세로, 너비를 입력해주세요.===");
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        BagSize size = new BagSize.CustomSize(w, h, d);

        System.out.println("입력하신 가방 사이즈로 준비해드리겠습니다.");
        System.out.println("");

        // 가방 객체 생성 (가격은 합산된 totalPrice로!)
        Bag bag = new Bag(type, material, color, size, totalPrice);

        // 과정 실행
        bag.selectBag();
        System.out.println("");
        bag.packBag();
        System.out.println("");
        bag.sellBag();
        System.out.println("");

        // 구매 내역 출력
        OrderHistory order = new OrderHistory(bag);
        order.printHistory();
    }
}
