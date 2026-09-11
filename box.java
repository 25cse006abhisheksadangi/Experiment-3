class box {

    double length;
    double breadth;
    double height;
    double volume;

    box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    void cal() {
        volume = length * breadth * height;

        System.out.println("Volume of box = " + volume);
    }

    public static void main(String[] args) {

        box ob = new box(12.5, 4.0, 5.5);

        ob.cal();
    }
}