package gui;

public class Counter {
	private double storedValue;
	private double incrementer;
	
	public Counter(double incrementer) {
		this.storedValue = 0;
		this.incrementer = incrementer;
	}
	
	public double getVal() {
		return this.storedValue;
	}
	
	public void incVal(){
		this.storedValue += this.incrementer;
	}
}
