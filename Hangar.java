
public class Hangar {

	public static void main(String[] args) {
		Car car1= new Car("Clio",25000);
		Boat boat1=new Boat("BB",25);
		System.out.println(car1.doStuff());
		System.out.println(boat1.doStuff());
	}
}
