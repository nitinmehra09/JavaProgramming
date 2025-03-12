class Pen{
    String brand;
    String type;
    String color;
    void printInfo(){
        System.out.println("   brand :- " +this.brand);
        System.out.println("   Color :- "+this.color);
        System.out.println("   type :- "+this.type);
    }
}
public class Oops {
    public static void main(String[] args) {
        System.out.println("pen 1 :");
        Pen p1 = new Pen();
        p1.brand = "Doms";
        p1.type = "bollpen";
        p1.color = "blue";
        p1.printInfo();
        System.out.println("pen 2 :");
        Pen p2 = new Pen();
        p2.brand = "dabur";
        p2.color = "blue";
        p2.type = "gel";
        p2.printInfo();

    }
}
