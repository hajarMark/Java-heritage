
public class Boat extends Vehicle{
	
	public Boat(String brand, int kilometrs) {  
    	super(brand, kilometrs);  
    }
	
	@Override  
    public String doStuff() {  
        return "Je suis "+getbrand()+" et je fais glou glou";  
    }

}
