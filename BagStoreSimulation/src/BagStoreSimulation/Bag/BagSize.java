package src.BagStoreSimulation.Bag;

public abstract class BagSize {
    protected int width;
    protected int height;
    protected int depth;

    public BagSize(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public abstract String getSizeInfo();

    // 추상클래스의 구현 클래스
    public static class CustomSize extends BagSize {
        //생성자를 이용해 상위 클래스 호출
        public CustomSize(int width, int height, int depth) {
            super(width, height, depth);
        }

        //추상 메소드
        @Override
        public String getSizeInfo() {
            return width + "x" + height + "x" + depth + " cm";
        }
    }
}