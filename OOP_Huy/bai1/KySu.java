package bai1;

public class KySu extends canbo {
    String NganhDaoTao;
    
    public KySu(String HoTen,int Tuoi,String GT,String DiaChi,String NganhDaoTao)
    {
        super(HoTen,Tuoi,GT,DiaChi);
        this.NganhDaoTao = NganhDaoTao;
    }
    @Override
    public String toString()
    {
        return "Ky su: " + HoTen + ", Tuoi: " + Tuoi + ", Gioi Tinh: " + GT + ", Dia Chi: " + DiaChi + ", Nganh dao tao: " + NganhDaoTao ;
    }
    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.NganhDaoTao = nganhDaoTao;
    }

    


}
