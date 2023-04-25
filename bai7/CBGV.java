package bai7;

import java.util.ArrayList;
import java.util.List;

public class CBGV {
    private List<Nguoi> nguoi;
    public CBGV()
    {
        this.nguoi = new ArrayList<>();
    }
    public void addNguoi(Nguoi nguoi)
    {
        this.nguoi.add(nguoi);
    }
    public boolean deleteById(int maso) {
        Nguoi nguoi = this.nguoi.stream().filter(t -> t.getMaSo() == maso ).findFirst().orElse(null);
        if (nguoi == null) {
            return false;
        }
        this.nguoi.remove(nguoi);
        return true;
    }
    public int getLuong(int maso)
    {
        Nguoi nguoi = this.nguoi.stream().filter(t -> t.getMaSo() == maso ).findFirst().orElse(null);
        if (nguoi == null) {
            return 0;
        }
        return nguoi.getLuongCung() + nguoi.getLuongThuong() - nguoi.getTienPhat();
    }
}