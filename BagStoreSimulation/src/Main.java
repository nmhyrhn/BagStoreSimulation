package MiniProjectBag;

import MiniProjectBag.Bag.Bag;
import MiniProjectBag.Bag.BagSize;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====가방 구매 시스템=====");
        Bag myBag = new Bag();

        //가방 선택문구 출력
        System.out.println("가방을 선택해 주세요.");
        System.out.println("1.도트백, 2.크로스백, 3.백팩, 4.숄더백, 5.클러치");
        switch (new Scanner(System.in).nextInt()) {
            case 1: "도트백" = new Bag(); break;

        }

        System.out.println("재질을 골라주세요.");
        //??map을 하나더 추가해야하는데 +sum price

        System.out.println("색상을 골라주세요.");
        switch (new Scanner(System.in).nextInt()) {
            case 1: String 브라운 = "브라운"; break;
            case 2: String 화이트 = "화이트"; break;
        }
        //가방 선택 완료 문구 출력
        myBag.selectBag();
        //가방 사이즈 기재 문구 출력
        System.out.println("가방 사이즈를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double dept = sc.nextDouble();
        sc.close();

        BagSize size = new BagSize(width, height, dept) {
            @Override
            public void printsize(){
                System.out.println("가방 사이즈: 가로 " + width + "cm, 세로 " + height + "cm, 너비 " + dept + "cm 입니다.");
            }
        };


        //가방 사이즈 확정 문구 출력
        size.printsize();

        //가방 포장 문구 출력
        myBag.packBag();
        //가방 판매 완료 문구 출력
        myBag.sellBag();


    }
}
