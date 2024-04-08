public class AutomobileInventory {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    
    // constructor
	public AutomobileInventory(String make, String model, String color, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
	}
	
	// getters
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	// setters/mutators
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}