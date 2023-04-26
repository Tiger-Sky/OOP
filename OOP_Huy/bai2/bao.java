package bai2;

public class bao extends tailieu{
	public int NgayPhatHanh;
	public bao(String MaTaiLieu, String NXB, int SoBan, int NgayPhatHanh)
	{
		super(MaTaiLieu,NXB,SoBan);
		this.NgayPhatHanh = NgayPhatHanh;
	}
	public String toString()
	{
		return "Ma Tai Lieu: "+ MaTaiLieu +", Nha Xuat Ban: " +NXB +", So ban: " +SoBan +", Ngay Phat Hanh: "+ NgayPhatHanh ;
	}
}
