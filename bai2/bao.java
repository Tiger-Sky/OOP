package bai2;



public class bao extends thongtinchung{
    protected int date;

    public bao(String id, String nxb, int num, int date) {
        super(id, nxb, num);
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "bao [ngay phat hanh=" + date +  ", ma so sach = " + id + " nha phat hanh = "+ nxb + "so= " + num +"]";
    }
}
