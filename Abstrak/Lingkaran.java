package Abstrak;

class Lingkaran extends DuaDimensi {
    private float radius;
    public Lingkaran(String color, float radius) {
        super(color);
        this.radius = radius;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return (float) 3.14 *this.radius * this.radius ;
    }
    void display(){
        System.out.println("Warna Lingkaran: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
    
}
