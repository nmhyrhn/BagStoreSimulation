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

    // 사용자가 직접 입력할 때 쓰는 구현
    public static class CustomSize extends BagSize {
        public CustomSize(int width, int height, int depth) {
            super(width, height, depth);
        }

        @Override
        public String getSizeInfo() {
            return width + "x" + height + "x" + depth + " cm";
        }
    }
}