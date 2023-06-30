package Abstrak;

class JajarGenjang extends DuaDimensi {
    private float alas;
    private float tinggi;
    public JajarGenjang(String color, float alas, float tinggi) {
        super(color);
        this.alas = alas;
        this.tinggi = tinggi;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return this.alas * this.tinggi;
    }
    void display(){
        System.out.println("Warna Jajar Genjang: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
    
}
