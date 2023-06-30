package Abstrak;

class PersegiPanjang extends DuaDimensi {
    private float length;
    private float width;
    public PersegiPanjang(String color, float length, float width) {
        super(color);
        this.length = length;
        this.width = width;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return this.length * this.width;
    }
    void display(){
        System.out.println("Warna Persegi Panjang: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
    
}
