// it is special method of the class which is use to insitilize objecty of the class
// 1. constructor name shoud be same as a class name 
// 2. contructor does not return any value (even void)
// 3. constructor is automaticly call when object is create
// 4. types of contuctor 
// (a) defult 
// (b) parametize
// (c) copy
// (d) dynamic
// #inplicite constructor: when tere is no constructor in class then then complilor automatic create and call a construtor
// #Explicite constructor: all user define constructor is know is explicite constuctor
//
public class Main_1 {
    int a,b;
    // Main_1(){
    //     a=10;
    //     b=20;
    // }
    void show(){
        System.out.println(a + " " + b);
    }
}
class Main_2{
    public static void main(String[] args) {
        Main_1 t1 = new Main_1();
        t1.show();

    }
}
