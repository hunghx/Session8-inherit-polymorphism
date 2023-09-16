package ra.baitap;

public class Rectangle extends Shape{
    public double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }
    @Override
    public void tinhChuvi() {
        System.out.printf("Chu vi hình chữ nhật cạnh : %.2f và %.2f là : %.2f \n",super.getA(),b,2*(super.getA()+b));
    }

    @Override
    public void tinhDientich() {
        System.out.printf("Diện tích hình chữ nhật cạnh : %.2f và %.2f là : %.2f \n",super.getA(),b,super.getA()*b);
    }
}
