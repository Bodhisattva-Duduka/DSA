public class RuntimePolymorphism {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
    }
}

class Shape {
    void area(){
        System.out.println("Area of Shape");
    }
}

class Square extends Shape {
    @Override
    void area(){
        System.out.println("Area is side * side");
    }
}

class Triangle extends Shape {
    @Override
    void area(){
        System.out.println("Area is 0.5 * base * height");
    }
}

class Circle extends Shape {
    @Override
    void area(){
        System.out.println("Area is pie * r * r");
    }
}