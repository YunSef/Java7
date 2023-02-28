class Hangar {

	public static void main(String[] args) {
		
		//creating new instance of Car and Boat Classes
		Car car1 = new Car ("Clio");
		Boat boat1 = new Boat ("Symphony of the Seas");

		//using method
		System.out.println(car1.doStuff());
		System.out.println(boat1.doStuff());
	}
}
