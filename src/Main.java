import ra.model.Animals;
import ra.model.Cat;
import ra.model.Chicken;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.color);
        Chicken chicken = new Chicken(true,2,30,5);
//        System.out.println(chicken.getSoChan());
//        System.out.println(chicken.getChieuCao());
//        System.out.println(chicken.getCanNang());
        System.out.println(chicken);

        // đa hình trong kế thừa
        // có thể tạo đối tượng cha từ phương thức khởi tạo của lớp con kế thừa nó

        Animals animals = new Chicken();
        Animals animals1 = new Cat();
        // tính đa hình còn thể hiện trong phương thức
        animals.keu();
        animals1.keu();
        Object o  = new Animals();
        System.out.println(o);
        Animals animals2 = chicken; // ép kiẻu ngầm định
        Chicken chicken1 = (Chicken) animals; // ép kiểu tường minh , có thể phát sinh lỗi
        // phát sinh lỗi khi nào ? - khi kiểu thực tế của đội tượng khác kiểu khai báo .
        System.out.println(animals instanceof Cat);

        if(animals1 instanceof Chicken){
            Chicken chicken2 = (Chicken) animals1;
        }


        // bài tập : ứng dụng kế thừa và đa hình tính toán chu vi diện tích của 4 loại hình :
        // Vuông (1 cạnh,a), tròn(ban kính,a), hình tam giác(a,b,c) , hình chữ nhật (a,b)
    }
}