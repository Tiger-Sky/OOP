package bai1;
// tao  1 class can bo chua ten, tuoi ,gt,diachi
public class canbo 
{
    //khai bao
    protected String HoTen;
    protected int Tuoi;
    protected String GT;
    protected String diachi;
    //tao 1 method
    
    public canbo(String name, int age, String sex, String address)
    {
        this.HoTen = name;
        this.Tuoi = age;
        this.GT = sex;
        this.diachi = address;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        this.Tuoi = tuoi;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String gT) {
        this.GT = gT;
    }

    public String getDiachi() 
    {
        return diachi;
    }

    public void setDiachi(String diachi)
    {
        this.diachi = diachi;
    }
}
