package MiniProjectBag.Bag;

abstract class BagSize {

    //필드
    protected double width;
    protected double height;
    protected double dept;

    //생성자
    public  BagSize(double width, double height, double dept) {
        this.width = width;
        this.height = height;
        this.dept = dept;
    }

    //메소드
    public abstract String getSizeInfo();



}
