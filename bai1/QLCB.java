package bai1;
import java.util.*;
import java.util.stream.Collectors;
public class QLCB 
{
    protected List<canbo> canbos;
    public QLCB()
    {
        this.canbos = new ArrayList<>();
    }
    public void themcanbo(canbo canbo) // chung ta them can bo vao list
    {
        this.canbos.add(canbo); //.add them vao
    }
    public List<canbo> timcacbo(String name)
    {
        return this.canbos.stream().filter(o -> o.getHoTen().contains(name)).collect(Collectors.toList());
    } 
    public void hienthi()
    {
        this.canbos.forEach(o -> System.out.println(o.toString()));
    }
}
