package ra.baitap;

public class Square extends Shape{
    public Square(double a) {
        super(a);
    }

    @Override
    public void tinhChuvi() {
        System.out.printf("Chu vi hình vuông cạnh : %.2f là : %.2f \n",super.getA(),4*super.getA());
    }

    @Override
    public void tinhDientich() {
        System.out.printf("Diện tích hình vuông cạnh : %.2f là : %.2f \n",super.getA(),Math.pow(super.getA(),2));
    }
}
