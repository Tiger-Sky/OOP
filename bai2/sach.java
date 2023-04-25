package bai2;

public class sach  extends thongtinchung{
    protected String tentg;
    protected int sotrang;
    public sach(String id, String nxb, int num, String tentg, int sotrang) {
        super(id, nxb, num);
        this.tentg = tentg;
        this.sotrang = sotrang;
    }
    public String getTentg() {
        return tentg;
    }
    public void setTentg(String tentg) {
        this.tentg = tentg;
    }
    public int getSotrang() {
        return sotrang;
    }
    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    @Override
    public String toString() {
        return "sach [ten tac gia =" + tentg + ", so trang=" + sotrang + ", ma so sach = " + id + " nha phat hanh = "+ nxb + "so= " + num +"]";
    }
    
}
