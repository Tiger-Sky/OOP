package baithicuoiki;

public class HinhTron {
    private float radius;
    public HinhTron(float radius)
    {
        this.radius = radius;
    }
    public  float getradius()
    {
        return radius;
    }
    public void setradius(float radius)
    {
        this.radius = radius;
    }
    public double tinhDienTich(float radius)
    {
        return radius * 2 *3.14;
    }
}
 