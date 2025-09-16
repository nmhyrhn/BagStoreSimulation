package src.BagStoreSimulation.Attributes;

import java.util.*;

public class BagType {
    // 제품명 매핑, hashmap은 중복제거
    private static final Map<Integer, String> typeMap = new HashMap<>();
    // 제품 가격 매핑
    private static final Map<String, Integer> priceMap = new HashMap<>();

    static {
        typeMap.put(1, "토트백");
        typeMap.put(2, "크로스백");
        typeMap.put(3, "백팩");
        typeMap.put(4, "숄더백");
        typeMap.put(5, "클러치");
        //switch로 선택할거기에 키값을 숫자로 줌

        priceMap.put("토트백", 15000);
        priceMap.put("크로스백", 20000);
        priceMap.put("백팩", 20000);
        priceMap.put("숄더백", 25000);
        priceMap.put("클러치", 30000);
    }

    //getter
    //선택 번호에 상품 이름 반환
    public static String getType(int choice) {
        //choice는 입력받은 정수값 -> 가방 문자열로 변환
        return typeMap.get(choice);
    }

    //상품에 해당하는 가격 반환
    public static int getPrice(String type) {
        //type는 입력받은 가방이름 -> 가방 가격으로로 변환
        return priceMap.get(type);
    }
}
