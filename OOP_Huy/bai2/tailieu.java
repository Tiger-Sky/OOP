package bai2;

public class tailieu {
	protected String MaTaiLieu;
	protected String NXB;
	protected int SoBan;
	public tailieu(String MaTaiLieu, String NXB, int SoBan)
	{
		this.MaTaiLieu = MaTaiLieu;
		this.NXB = NXB;
		this.SoBan = SoBan;
	}
	public String getMaTaiLieu() {
		return MaTaiLieu;
	}
}
