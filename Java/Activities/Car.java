package Activity1;

public class Car {
	String color;
    int make;
    String transmission;
    int tyres;
    int doors;
    int rooftop;
	
    Car() {
	tyres = 4;
	doors = 4;
	rooftop = 2;
    }

    public void displayCharacterstics(){
	System.out.println("Color of the Car: " + color);
	System.out.println("Make of the Car: " + make);
	System.out.println("Transmission of the Car: " + transmission);
	System.out.println("Number of doors on the car: " + doors);
    System.out.println("Number of tyres on the car: " + tyres);
    System.out.println("Number of rooftop on the car: " +rooftop);
    }

    public void accelerate() {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() {
	System.out.println("Car has stopped.");
    }

	}


