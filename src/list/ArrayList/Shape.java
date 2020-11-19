package list.ArrayList;

import java.util.Comparator;

public class Shape  {

    String type;
    int area;

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", area=" + area +
                '}';
    }

    public Shape(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


}
