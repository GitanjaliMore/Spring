package springlifecycle;

public class Samosa {
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
// also we have create no argu constructor,tostring method,with argu constructor 
	public void init() {
		System.out.println("Inside init method");
	}


	public void destroy() {
		System.out.println("inside destroy method");
	}

}
