package Abstrak;

class BelahKetupat extends DuaDimensi {
    private float d1;
    private float d2;
    public BelahKetupat(String color, float d1, float d2) {
        super(color);
        this.d1 = d1;
        this.d2 = d2;
        //TODO Auto-generated constructor stub
    }
    public float calculateArea(){
        return this.d1 * this.d2 /2;
    }
    void display(){
        System.out.println("Warna Belah ketupat: "+this.color+"\nLuas Permukaan: "+this.calculateArea());
    }
   
}
