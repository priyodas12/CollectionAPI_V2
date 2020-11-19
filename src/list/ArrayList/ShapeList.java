package list.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShapeList {
    public static void main(String[] args) {
        List<Shape> shapeList=new ArrayList<>();

        shapeList.add(new Shape("Triangle",90));
        shapeList.add(new Shape("Square",120));
        shapeList.add(new Shape("Trapezium",60));
        shapeList.add(new Shape("Trapezium",90));
        shapeList.add(new Shape("Trapezium",90));
        shapeList.add(new Shape("Circle",90));
        shapeList.add(new Shape("Circle",40));
        shapeList.add(new Shape("Circle",70));

        //multiple sorting
        shapeList.stream().sorted(Comparator.comparing(Shape::getType).thenComparing(Shape::getArea)).forEach(System.out::println);

        //reverse order

        System.out.println("-------------------------");
        shapeList.stream().sorted(Comparator.comparing(Shape::getArea,(o1, o2) -> - o1.compareTo(o2))).forEach(System.out::println);
    }

}
