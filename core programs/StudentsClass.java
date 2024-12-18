//write a program students class show
//WAP to show record of emploiye
//WAP to impliment atm trasiction (culculate,interst , ,,, etc)

// for statis property astatic memory block 
// depends on time a static method is only use or call static of a class
// A static property can be call with the help
//static keyword : property (data and method) are commen for all objects of a class
class Myclass_1{
    int a , b ;
    static int c;
    void show(){
        System.out.println(a+" " + b + " "+ c);
    }
    static void display(){
        // System.out.println(a);
        System.out.println(c);
    }
}
public class StudentsClass {
    public static void main(String[] args) {
        Myclass_1 d1 = new Myclass_1();
        Myclass_1 d2 = new Myclass_1();
        Myclass_1 d3 = new Myclass_1();
        d1.a=10;
        d1.b=20;
        d1.c=30;
        d2.a=100;
        d2.b=200;
        d2.c=300;
        d3.a=1000;
        d3.b=2000;
        d3.c=3000;
        d1.show();
        d2.show();
        d3.show();
        d1.display();
        d2.display();
        d3.display();

    }

}
