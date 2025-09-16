package src.BagStoreSimulation.Order;

import src.BagStoreSimulation.Bag.Bag;

public class OrderHistory {
    //구매내역 관리
    //필드 > 구매한 가방을 저장
    private Bag bag;

    //생성자
    public OrderHistory(Bag bag) {
        this.bag = bag;
    }

    //메소드 : 구매내역 출력!
    public void printHistory() {
        System.out.println("==== 구매 내역 ====");
        System.out.println("종류 : " + bag.getType());
        System.out.println("재질 : " + bag.getMaterial());
        System.out.println("색상 : " + bag.getColor());
        System.out.println("사이즈 : " + bag.getSize().getSizeInfo());
        System.out.println("결제 금액 : " + bag.getPrice() + "원");
        System.out.println("=== 감사합니다 ===");
    }
}