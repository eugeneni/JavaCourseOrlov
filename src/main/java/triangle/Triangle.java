package triangle;

class Triangle {
    Point a;
    Point b;
    Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    float perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    float square() {
        return Math.abs(((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) / 2);
    }

    String type() {
        float distanceAB = a.distance(b);
        float distanceBC = b.distance(c);
        float distanceCA = c.distance(a);

        if (Math.abs(distanceAB - distanceBC) < 0.01 && Math.abs(distanceBC - distanceCA) < 0.01) {
            return "равносторонний";
        } else if (isStraightCorner(distanceAB, distanceBC, distanceCA) ||
                isStraightCorner(distanceBC, distanceCA, distanceAB) ||
                isStraightCorner(distanceCA, distanceAB, distanceBC)) {
            return "прямоугольный";
        } else if (Math.abs(distanceAB - distanceBC) < 0.01 ||
                Math.abs(distanceBC - distanceCA) < 0.01||
                Math.abs(distanceCA - distanceAB) < 0.01) {
            return "равнобедренный";
        } else {
            return "произвольный";
        }
    }

    boolean isStraightCorner(float distanceAB, float distanceBC, float distanceCA) {
        return Math.abs((distanceAB * distanceAB + distanceBC * distanceBC - distanceCA * distanceCA) / (2 * distanceAB * distanceBC)) < 0.00001;
    }
}
