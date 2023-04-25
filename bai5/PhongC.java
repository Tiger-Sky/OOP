package bai5;

public class PhongC extends Phong {
    public PhongC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "Phòng C " +
                "Loại phòng: '" + category + '\'' +
                ", Giá tiền: " + price ;
    }
}
