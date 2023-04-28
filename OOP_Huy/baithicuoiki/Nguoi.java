package baithicuoiki;

public class Nguoi {
    protected String name;
    protected int age;
    protected String addr;
    public Nguoi(String name,int age,String addr)
    {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void displayInfo()
    {
        System.out.println("Ten: " + this.name); 
        System.out.println("Tuoi: " + this.age); 
        System.out.println("Dia chi: " + addr);
    }    
}
