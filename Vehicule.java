public abstract class Vehicule {
	//attributes
	private String brand;
	private int kilometers;
	//constructor
	public Vehicule (String brand) {
	
		this.brand = brand;
		this.kilometers = 0;
	}
	//getters
	public String getBrand(){
		return this.brand;
	}

	public int getKilometers() {
		return this.kilometers;
	}
	//setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void SetKilometers(int km){
		this.kilometers = km;
	}
	//method
	public abstract String doStuff();
}
