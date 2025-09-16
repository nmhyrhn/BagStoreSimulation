package src.BagStoreSimuiation;

import src.BagStoreSimuiation.Attributes.BagColor;
import src.BagStoreSimuiation.Attributes.BagMaterial;
import src.BagStoreSimuiation.Attributes.BagType;
import src.BagStoreSimuiation.Bag.Bag;
import src.BagStoreSimuiation.Bag.BagSize;
import src.BagStoreSimuiation.Order.OrderHistory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가방 종류 선택
        System.out.println("가방을 고르세요 (1-토트백, 2-크로스백, 3-백팩, 4-숄더백, 5-클러치): ");
        int typeChoice = sc.nextInt();
        String type = BagType.getType(typeChoice);
        int price = BagType.getPrice(type);

        // 재질 선택
        System.out.println("재질을 고르세요 (1-천, 2-인조가죽, 3-천연가죽, 4-나일론): ");
        int materialChoice = sc.nextInt();
        String material = BagMaterial.getMaterial(materialChoice);

        // 색상 선택
        System.out.println("색상을 고르세요 (1-브라운, 2-화이트, 3-블랙, 4-옐로우, 5-블루): ");
        int colorChoice = sc.nextInt();
        String color = BagColor.getColor(colorChoice).getColorName();

        // 사이즈 입력
        System.out.println("가로, 세로, 너비를 입력하세요: ");
        int w = sc.nextInt();
        int h = sc.nextInt();
        int d = sc.nextInt();
        BagSize size = new BagSize.CustomSize(w, h, d);

        // 가방 객체 생성
        Bag bag = new Bag(type, material, color, size, price);

        // 과정 실행
        bag.selectBag();
        bag.packBag();
        bag.sellBag();

        // 구매 내역 출력
        OrderHistory order = new OrderHistory(bag);
        order.printHistory();
    }
}