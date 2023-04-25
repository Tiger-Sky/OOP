package bai5;

public class PhongA extends Phong {

    public PhongA() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "Phòng A" +
                "Loại Phòng'" + category + '\'' +
                ", Giá tiền" + price ;
    }
}