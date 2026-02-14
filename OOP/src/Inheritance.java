public class Inheritance {
    public static void main(String[] args) {
        // Box box1 = new Box();
        // System.out.println(box1.h + " " + box1.l);

        // Box box2 = new Box(3.4, 5.7, 27.5);
        // System.out.println(box2.l + " " + box2.w);

        BoxWeight box3 = new Box(2.7,3.5,6.3);
        System.out.println(box3.h + " " + box3.weight);
    }
}
class Box {
    private double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box oldBox){
        this.l = oldBox.l;
        this.h = oldBox.h;
        this.w = oldBox.w;
    }

    // Cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    
    public void information() {
        System.out.println("Running the Box");
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
    
}