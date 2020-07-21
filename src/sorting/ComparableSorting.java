package sorting;

import java.util.Arrays;

public class ComparableSorting{
    class Point implements Comparable<Point>{
        int x,y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point point) {
            return this.x - point.x;
        }
    }

    public void sortingUsingComparable() {
        Point points[] = {new Point(10,20), new Point(5,7), new Point(3,12)};
        Arrays.sort(points);
        for(int i=0; i<points.length; i++) {
            System.out.println(points[i].x + " " + points[i].y);
        }
    }

}
