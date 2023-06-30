package Abstrak;

class Trapesium extends DuaDimensi {
    private float tinggi;
    private float a;
    private float b;
    public Trapesium(String color, float tinggi, float a, float b) {
        super(color);
        this.tinggi = tinggi;
        this.a = a;
        this.b = b;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return (float) 0.5 * (this.a+this.b) * this.tinggi;
    }
    void display(){
        System.out.println("Warna Trapesium: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
    
}
