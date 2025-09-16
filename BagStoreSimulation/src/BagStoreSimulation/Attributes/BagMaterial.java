package src.BagStoreSimulation.Attributes;

import java.util.*;

public class BagMaterial {
    // 재질 매핑, hashmap은 중복제거
    private static final Map<Integer, String> materialMap = new HashMap<>();
    // 재질 가격 매핑
    private static final Map<String, Integer> priceMap = new HashMap<>();

    static {
        materialMap.put(1, "천");
        materialMap.put(2, "인조가죽");
        materialMap.put(3, "천연가죽");
        materialMap.put(4, "나일론");
        //switch로 선택할거기에 키값을 숫자로 줌

        priceMap.put("천", 5000);
        priceMap.put("인조가죽", 7000);
        priceMap.put("천연가죽", 12000);
        priceMap.put("나일론", 8000);
    }

    //getter
    //선택 번호에 재질 이름 반환
    public static String getMaterial(int choice) {
        return materialMap.get(choice);
    }

    //재질에 해당하는 가격 반환
    public static int getPrice(String material) {
        return priceMap.get(material);
    }
}