package triangle;

class Point {
    public float x;
    public float y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float distance(Point pointTo) {
        float disX = x - pointTo.x;
        float disY = y - pointTo.y;

        return (float) Math.sqrt(disX * disX + disY * disY);
    }


}
