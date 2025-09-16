package src.BagStoreSimuiation.Attributes;

import java.util.*;

public class BagType {
    private static final Map<Integer, String> typeMap = new HashMap<>();
    private static final Map<String, Integer> priceMap = new HashMap<>();

    static {
        typeMap.put(1, "토트백");
        typeMap.put(2, "크로스백");
        typeMap.put(3, "백팩");
        typeMap.put(4, "숄더백");
        typeMap.put(5, "클러치");

        priceMap.put("토트백", 15000);
        priceMap.put("크로스백", 20000);
        priceMap.put("백팩", 20000);
        priceMap.put("숄더백", 25000);
        priceMap.put("클러치", 30000);
    }

    public static String getType(int choice) {
        return typeMap.get(choice);
    }

    public static int getPrice(String type) {
        return priceMap.get(type);
    }
}