package ra.model;

public class Chicken extends Animals {
    private boolean gen;

    public Chicken() {

    }

    public Chicken(boolean gen, int soChan, double chieuCao, double canNang) {

        // cách gọi đến các phương thức hay thuộc tính của lớp cha
        // gọi đến thuộc tính mà phương thức
//        super.setSoChan(soChan);
//        super.setChieuCao(chieuCao);
//        super.setCanNang(canNang);
        // gọi đến constructor của lớp cha
        super(soChan, chieuCao, canNang);
        this.gen = gen;
    }

    // ghi đè phương thức
    @Override
    public void keu() {
        System.out.println(" Ồ ó o ....");
    }

    public String keu(int chan) {
        return null;
    }

    public String keu(int chan, String age) {
        return null;
    }

    public int keu(String chan) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Giới tính : " + (gen ? "Đực" : "Cái");
    }
}
