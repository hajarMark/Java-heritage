
public class Vehicle {
    
		//attributes
		private String brand;
		private int kilometrs;
		
		//constructor
		
		
		public Vehicle(String brand,int kilometrs) {  
			this.brand=brand;
			this.kilometrs=kilometrs;	
	    }  
		
	    //getters
		public String getbrand() {
			return this.brand;
		}
		public int getkilometrs() {
			return this.kilometrs;
		}
		
		//setters
		public void setbrand(String brand) {
			this.brand=brand;
		}
		public  void setkilometrs(int kilometrs) {
			 this.kilometrs=kilometrs;
		}
		
		public String doStuff() {
			return "un truc";
		}
		
	}
