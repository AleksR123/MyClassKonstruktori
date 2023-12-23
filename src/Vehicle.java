
//public class Vehicle {
//    private String color;
//
//    Vehicle(String a) {
//        color = a;
//    }
//    Vehicle() {
//        color = "Blue";
//    }
//
//    public String toString() {
//        return color;
//    }
//}

public class Vehicle {
    private String color;

    // Constructor with a default color
    Vehicle() {
        color = "Blue"; // Set a default color, e.g., "Blue"
    }

    // Constructor with a parameter to set the color
    Vehicle(String a) {
        color = a;
    }
}
