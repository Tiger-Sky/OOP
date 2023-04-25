package bai1;
public class KySu extends canbo {
    String nganh;
    public KySu(String name, int age, String sex, String address,String nganh)
    {
        super(name, age, sex, address);
        this.nganh = nganh;
    }
    
    @Override
    public String toString() {
        return "Ky Su["+
        " nganh: " + nganh + 
        ", name:'" + HoTen + '\'' +
        ", age: " + Tuoi +
        ", gender: '" + GT + '\'' +
        ", address: '" + diachi + '\'' +
        ']';
    }

    public String getNganhdaotao() {
        return nganh;
    }

    public void setNganhdaotao(String nganh) {
        this.nganh = nganh;
    }
}
