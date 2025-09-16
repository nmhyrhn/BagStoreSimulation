package src.BagStoreSimuiation.Attributes;

public enum BagColor {
    BROWN("브라운"),
    WHITE("화이트"),
    BLACK("블랙"),
    YELLOW("옐로우"),
    BLUE("블루");

    private final String colorName;

    BagColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public static BagColor getColor(int choice) {
        switch (choice) {
            case 1: return BROWN;
            case 2: return WHITE;
            case 3: return BLACK;
            case 4: return YELLOW;
            case 5: return BLUE;
            default: return null;
        }
    }
}