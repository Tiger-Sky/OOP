package baithicuoiki;

public class TaiKhoanNganHang
{
    private String aN;
    private int bal;
    public TaiKhoanNganHang(String aN, int bal)
    {
        this.aN = aN;
        this.bal = bal;
    }
    public String getaN() {
        return aN;
    }
    public void setaN(String aN) {
        this.aN = aN;
    }
    public int getBal() {
        return bal;
    }
    public void setBal(int bal) {
        this.bal = bal;
    }
    public boolean withdraw(int withdrawrate)
    {
        int tempbal = bal - withdrawrate;
        if (tempbal < 0)
        {
            System.out.println("khong du tien");
            return false;
        }
        bal  = tempbal;
        return true;
    }
    public void deposit(int inM)
    {
        this.bal = bal + inM;
    }
}