package Abstrak;

class Persegi extends DuaDimensi {
    private float sisi;
    public Persegi(String color, float sisi) {
        super(color);
        this.sisi = sisi;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return this.sisi * this.sisi ;
    }
    void display(){
        System.out.println("Warna Persegi: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
    
}
