package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSorting {
    class Point{
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    class myComparator implements Comparator<Point>{
        @Override
        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;
        }
    }

    public void customComparator(){
        Point[] points = {new Point(10,20), new Point(3,12), new Point(5,7)};
        Arrays.sort(points, new myComparator());
        for(int i=0; i<points.length; i++) {
            System.out.println(points[i].x + " " + points[i].y);
        }
    }
}
