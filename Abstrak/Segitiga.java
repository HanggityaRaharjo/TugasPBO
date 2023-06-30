package Abstrak;

class Segitiga extends DuaDimensi {
    private float alas;
    private float tinggi;
    public Segitiga(String color, float alas, float tinggi) {
        super(color);
        this.alas = alas;
        this.tinggi = tinggi;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return this.alas * this.tinggi / 2;
    }
    void display(){
        System.out.println("Warna Segitiga: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
    
}
