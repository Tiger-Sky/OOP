package bai5;

public class PhongB extends Phong {
    public PhongB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "Phòng B " +
                "Loại phòng: " + category + '\'' +
                ", Giá tiền: " + price ;
    }
}