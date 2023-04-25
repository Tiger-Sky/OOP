package bai2;

public class tapchi extends thongtinchung{
    protected int SoPhatHanh;
    protected int month;
    public tapchi(String id, String nxb, int num, int soPhatHanh, int month) {
        super(id, nxb, num);
        SoPhatHanh = soPhatHanh;
        this.month = month;
    }
    public int getSoPhatHanh() {
        return SoPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh) {
        SoPhatHanh = soPhatHanh;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    @Override
    public String toString() {
        return "tapchi [SoPhatHanh=" + SoPhatHanh + ", month=" + month + ", ma so sach = " + id + " nha phat hanh = "+ nxb + "so= " + num +"]";
    }
    
}
