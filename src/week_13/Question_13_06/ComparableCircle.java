package week_13.Question_13_06;

import week_13.Question_13_05.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    private double radius;

    public ComparableCircle(){

    }
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (super.getArea() < o.getArea()) {
            return -1;
        } else if (super.getArea() > o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
