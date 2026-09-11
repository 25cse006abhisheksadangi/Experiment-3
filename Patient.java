class Patient {

    String name;
    double height;
    double weight;

    Patient(String n, double h, double w) {

        name = n;
        height = h;
        weight = w;
    }

    public void show() {

        System.out.println("Name = " + name);
        System.out.println("Height = " + height);
        System.out.println("Weight = " + weight);
    }

    public double computeBMI() {

        return weight / (height * height);
    }

    public static void main(String args[]) {

        Patient ob = new Patient(
            "Abhishek",
            5.6,
            60.0
        );

        ob.show();

        System.out.println(
            "BMI of patient = " + ob.computeBMI()
        );
    }
}