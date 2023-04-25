package bai2;

public class thongtinchung {
    protected String id;
    protected String nxb;
    protected int num;
    public thongtinchung(String id, String nxb, int num) {
        this.id = id;
        this.nxb = nxb;
        this.num = num;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNxb() {
        return nxb;
    }
    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
