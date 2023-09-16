package ra.baitap;

public class Main {
    public static void main(String[] args) {
        Shape hinhtron = new Circle(1);
        hinhtron.tinhChuvi();
        hinhtron.tinhDientich();
        Shape hinhvuong = new Square(2);
        hinhvuong.tinhChuvi();
        hinhvuong.tinhDientich();
        Shape hinhChuNhat = new Rectangle(3,4);
        hinhChuNhat.tinhDientich();
        hinhChuNhat.tinhChuvi();
        Shape hinhTamGiac = new Triangle(3,4,5);
        hinhTamGiac.tinhChuvi();
        hinhTamGiac.tinhDientich();
    }
}
