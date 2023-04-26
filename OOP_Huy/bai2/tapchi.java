package bai2;

public class tapchi extends tailieu{
	public int SoPhatHanh;
	public int ThangPhatHanh;
	public tapchi(String MaTaiLieu, String NXB, int SoBan, int SoPhatHanh, int ThangPhatHanh)
	{
		super(MaTaiLieu,NXB,SoBan);
		this.SoPhatHanh = SoPhatHanh;
		this.ThangPhatHanh = ThangPhatHanh;
	}
	public String toString()
	{
		return "Ma Tai Lieu: "+ MaTaiLieu +", Nha Xuat Ban: " +NXB +", So ban: " +SoBan +", So Phat Hanh: "+ SoPhatHanh +", Thang Phat Hanh: "+ ThangPhatHanh;
	}
}
