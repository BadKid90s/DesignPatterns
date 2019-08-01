package com.wry.principle.openclose.improve;

public class OCP {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShap(new Circle());
        editor.drawShap(new Rectangle());
        editor.drawShap(new Triangle());
        editor.drawShap(new OtherGraphic());
    }

}

class GraphicEditor {
    public void drawShap(Shape shape) {
        shape.draw();
    }

}

abstract class  Shape {
   abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("圆形");
    }
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("三角形");
    }
}

class OtherGraphic extends Shape{

    @Override
    void draw() {
        System.out.println("其他图像");
    }
}