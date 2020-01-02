package com.wry.principle.openclose.improve.type2;

public class OCP {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShap(new Circle());
        editor.drawShap(new Rectangle());
        editor.drawShap(new Triangle());
    }

}

class GraphicEditor {
    public void drawShap(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle(shape);
        } else if (shape.m_type == 2) {
            drawCircle(shape);
        } else if (shape.m_type == 3) {
            drawTriangle(shape);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }

    public void drawTriangle(Shape r) {
        System.out.println("三角形");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
