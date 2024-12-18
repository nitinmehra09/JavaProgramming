class Myclass_3{
    static int count=0;
    Myclass_3(){
        count+=1;
    }

    static void show(){
        System.out.println(count);
    }
}

public class CountObjOfClass {
    static int a=20 ;
    public static void main(String[] args) {
        int a =10;
        Myclass_3 t1 = new Myclass_3();
        Myclass_3 t2 = new Myclass_3();
        Myclass_3 t3 = new Myclass_3();
        Myclass_3 t4 = new Myclass_3();
        Myclass_3 t5 = new Myclass_3();
        Myclass_3 t6 = new Myclass_3();
        Myclass_3.show();
        System.out.println(a);

        kicks();
    }

    public static void kicks(){
        System.out.println(a);
    }
}
