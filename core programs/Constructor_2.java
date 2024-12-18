class MyClass {
    int a,b;
    MyClass(){
        a= 100;
        b= 200;
    }
    MyClass(int p){
        a=p;
        b=p;
    }
    MyClass(int p , int q){
        a=p;
        b=q;
    }
    void show(){
        System.out.println(a + " " + b);
    }   
}
public class Constructor_2 {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(10);
        MyClass t3 = new MyClass(20, 30);
        t1.show();
        t2.show();
        t3.show();
    }
    
}
