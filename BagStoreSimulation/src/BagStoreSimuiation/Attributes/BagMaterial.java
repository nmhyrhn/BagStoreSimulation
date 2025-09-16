package src.BagStoreSimuiation.Attributes;

import java.util.HashMap;
import java.util.Map;

public class BagMaterial {
    private static final Map<Integer, String> materialMap = new HashMap<>();

    static {
        materialMap.put(1, "천");
        materialMap.put(2, "인조가죽");
        materialMap.put(3, "천연가죽");
        materialMap.put(4, "나일론");
    }

    public static String getMaterial(int choice) {
        return materialMap.get(choice);
    }
}