package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() { //매개변수가 필요 없는 이유는 자기거 쓰면 되니까 (4, 5)
        return  width * height;
    }
    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this. width == this.height;
    }

}
