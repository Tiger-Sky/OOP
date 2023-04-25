package bai6;

import java.util.*;
import java.util.stream.Collectors;
public class QLHS {
    private List<HocSinh> hocsinh;
    public QLHS()
    {
        this.hocsinh = new ArrayList<>();
    } 
    public static void add(HocSinh hocSinh) {
        this.hocsinh.add(hocSinh);
    }

    public List<HocSinh> getStudent20YearOld() {
        return this.hocsinh.stream().filter(student -> student.getTuoi() == 20).collect(Collectors.toList());
    }

    public long countStudent23YearOldInDN() {
        return this.hocsinh.stream().filter(student -> student.getTuoi() == 23 && student.getQuenQuan().equals("DN")).count();
    }
}
