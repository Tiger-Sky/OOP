package bai4;

import java.util.List;

public class HoGiaDinh {
    private List<Nguoi> presons;
    private String address;

    public HoGiaDinh(List<Nguoi> presons, String address) {
        this.presons = presons;
        this.address = address;
    }

    public List<Nguoi> getPresons() {
        return presons;
    }

    public void setPresons(List<Nguoi> presons) {
        this.presons = presons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hộ Gia Đình: " +
                "Người: " + presons +
                ", Địa Chỉ: '" + address + '\'' ;
                
    }
}