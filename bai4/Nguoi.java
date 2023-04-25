package bai4;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String cmnd;
    
    public Nguoi() {
        super();
    }

    public Nguoi(String hoTen, int tuoi, String cmnd) {
        super();
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", tuoi: " + tuoi + ", CMND: " + cmnd;
    }
}
