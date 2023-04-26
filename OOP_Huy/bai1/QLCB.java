package bai1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class QLCB {
    protected List<canbo> canbos;
    public QLCB()
    {
        this.canbos = new ArrayList<>();
    }
    public void themcanbo(canbo canbo){
        this.canbos.add(canbo);
    }
    public List<canbo> timkiem(String HoTen)
    {
        return this.canbos.stream().filter(o -> o.getHoTen().contains(HoTen)).collect(Collectors.toList());
    } 
    public void Hienthi()
    {
        this.canbos.forEach(o -> System.out.println(o.toString()));
    }
}
