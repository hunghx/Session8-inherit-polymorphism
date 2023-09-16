package ra.baitap;

public class Triangle extends Shape{
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public void tinhChuvi() {
        System.out.printf("Chu vi hình tam giác cạnh : %.2f, %.2f và %.2f là : %.2f \n",super.getA(),b,c,super.getA()+b+c);
    }

    @Override
    public void tinhDientich() {
        // tinhs diện tích theo heron
        double nuaChuVi = (super.getA()+b+c)/2;
        double dienTich = Math.sqrt(nuaChuVi*(nuaChuVi-super.getA())*(nuaChuVi-b)*(nuaChuVi-c));
        System.out.printf("Diện tích hình tam giác cạnh : %.2f, %.2f và %.2f là : %.2f \n",super.getA(),b,c,dienTich);
    }
}
