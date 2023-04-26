package bai2;

import java.util.ArrayList;
import java.util.List;

public class QLTL {
    protected List<tailieu> tailieus;
    public QLTL()
    {
        this.tailieus = new ArrayList<>();
    }
    public void themtailieu(tailieu tailieu)
    {
        this.tailieus.add(tailieu);
    }
    public boolean xoatailieu(String matl)
    {
        tailieu tailieu = this.tailieus.stream().filter(o -> o.getMaTaiLieu().equals(matl)).findFirst().orElse(null);
        if(tailieu == null)
        {
            return false;
        }
        this.tailieus.remove(tailieu);
        return true;
    }
    public void hienthi()
    {
        this.tailieus.stream().forEach(o -> System.out.println(o.toString()));
    }
    public void timtheosach()
    {
        this.tailieus.stream().filter(o -> o instanceof sach).forEach(o -> System.out.println(o.toString()));
    }
    public void timtheobao()
    {
        this.tailieus.stream().filter(o -> o instanceof bao).forEach(o -> System.out.println(o.toString()));
    }
    public void timtheotapchi()
    {
        this.tailieus.stream().filter(o -> o instanceof tapchi).forEach(o -> System.out.println(o.toString()));
    }
}
