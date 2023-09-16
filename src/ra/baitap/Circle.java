package ra.baitap;

public class Circle extends Shape{
    public Circle(double a) {
        super(a);
    }

    @Override
    public void tinhChuvi() {
        System.out.printf("Chu vi hình tròn bán kính : %.2f là : %.2f \n",super.getA(),2*PI*super.getA());
    }

    @Override
    public void tinhDientich() {
        System.out.printf("Diện tích hình tròn bán kính : %.2f là : %.2f \n",super.getA(),PI*Math.pow(super.getA(),2));
    }

}
