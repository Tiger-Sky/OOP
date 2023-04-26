package bai3;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    List <thisinh>  thisinhs;
    public TuyenSinh()
    {
        this.thisinhs = new ArrayList<>();
    }
    public void themthisinh(thisinh thisinh)
    {
        this.thisinhs.add(thisinh);
    }
    public void hienthi()
    {
        this.thisinhs.stream().forEach(o -> System.out.println(o));
    }
    public void timkiem(int sbd)
    {
        this.thisinhs.stream().filter(o -> o.getSDB()==(sbd)).findFirst().orElse(null);
    } 
} 
