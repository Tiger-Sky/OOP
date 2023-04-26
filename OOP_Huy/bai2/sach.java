package bai2;

public class sach extends tailieu{
	public String TenTG;
	public int SoTrang;
	public sach(String MaTaiLieu, String NXB, int SoBan, String TenTG, int SoTrang)
	{
		super(MaTaiLieu,NXB,SoBan);
		this.TenTG = TenTG;
		this.SoTrang = SoTrang;
	}
	public String toString()
	{
		return "Ma Tai Lieu: "+ MaTaiLieu +", Nha Xuat Ban: " +NXB +", So ban: " +SoBan +", Ten Tac Gia: "+TenTG +", So Trang: "+ SoTrang;
	}
}
