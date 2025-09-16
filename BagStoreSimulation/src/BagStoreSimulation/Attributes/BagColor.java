package src.BagStoreSimulation.Attributes;

public enum BagColor {
    //필드
    //가방 색상을 나타내는 enum
    //enum :
    BROWN("브라운"),
    WHITE("화이트"),
    BLACK("블랙"),
    YELLOW("옐로우"),
    BLUE("블루");

    //색상 이름을 문자열로 저장
    private final String colorName;

    //생성자 : enum값 생성 시 값 이름 초기화
    BagColor(String colorName) {
        this.colorName = colorName;
    }

    //색상 이름 반환
    public String getColorName() {
        return colorName;
    }

    //선택 번호에 해당 값 enum 반환
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