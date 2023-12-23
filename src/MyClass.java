
//public class MyClass {
//
//    public static void main(String[] args) {
//       
//    	Vehicle v1 = new Vehicle("Red");
//        System.out.println(v1);
//        Vehicle v2 = new Vehicle();
//        System.out.println(v2);
//        
//    }
//}
	
	public class MyClass {

		    public static void main(String[] args) {
		        Vehicle v1 = new Vehicle(); // Using default color "Blue"
		        Vehicle v2 = new Vehicle("Red"); // Setting color to "Red"
		        
		        System.out.println("Vehicle color: " + v1); // Prints "Vehicle color: Blue"
		        System.out.println("Vehicle color: " + v2); // Prints "Vehicle color: Red"
		    }
	}
