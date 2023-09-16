package ra.model;

public class Animals {
    public final String color = "blue";
    private int soChan;
    private double chieuCao;
    private double canNang;

    public Animals() {

    }

    public Animals(int soChan, double chieuCao, double canNang) {
        this.soChan = soChan;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }
    public void keu(){
        System.out.println("gruuuuuuuuuu ...");
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "Số chân : "+soChan + " chân | Chiều cao : "+chieuCao+" cm | Cân nặng : "+ canNang +" kg";
    }


}
