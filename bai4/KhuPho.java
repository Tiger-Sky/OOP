package bai4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HoGiaDinh> families;

    public KhuPho() {
        this.families = new ArrayList<>();
    }

    public List<HoGiaDinh> getFamilies() {
        return families;
    }

    public void setFamilies(List<HoGiaDinh> families) {
        this.families = families;
    }

    public void addFamily(HoGiaDinh HoGiaDinh) {
        this.families.add(HoGiaDinh);
    }
}