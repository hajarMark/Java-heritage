
public class Car extends Vehicle {
	
	    public Car(String brand, int kilometrs) {  
	    	super(brand, kilometrs);  
        }
	    
	    @Override  
	    public String doStuff() {  
	        return "Je suis "+getbrand()+" et je fais vroum vroum";  
	    }
	
}
