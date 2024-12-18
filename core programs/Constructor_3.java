class One {
    int a,b;
    void show(){
        System.out.println(a + " " + b);
    }
}
class Two {
    One ox;
    Two(){
        ox=new One ();
    }
    Two(One op){
        ox = op;
    }
    void set(){
        ox.a=1000;
        ox.b=2000;
    }
    void get(){
        ox.show();
    }
}
public class Constructor_3 {
    public static void main(String[] args) {
        One o1 = new One();
        o1.a=27;
        o1.b=28;
        o1.show();
        Two t1 = new Two();
        t1.set();
        t1.get();
        Two t2 = new Two(o1);
        t2.get();
        t2.set();
        t2.get();
    }
}
