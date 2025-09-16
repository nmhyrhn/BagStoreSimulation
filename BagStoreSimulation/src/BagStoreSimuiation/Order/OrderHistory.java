package src.BagStoreSimuiation.Order;

import src.BagStoreSimuiation.Bag.Bag;

import java.util.*;

public class OrderHistory {
    private Bag bag;

    public OrderHistory(Bag bag) {
        this.bag = bag;
    }

    public void printHistory() {
        System.out.println("==== 구매내역 ====");
        System.out.println("종류: " + bag.getType());
        System.out.println("재질: " + bag.getMaterial());
        System.out.println("색상: " + bag.getColor());
        System.out.println("사이즈: " + bag.getSize().getSizeInfo());
        System.out.println("결제 금액: " + bag.getPrice() + "원");
        System.out.println("=== 감사합니다 ===");
    }
}