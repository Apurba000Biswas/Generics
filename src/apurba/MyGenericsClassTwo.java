package apurba;

public class MyGenericsClassTwo<X, Y> {
	private X x;
	private Y y;
	
	
	public MyGenericsClassTwo(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void setObjectOne(X x) {
		this.x = x;
	}
	
	
	public void setObjectTwo(Y y) {
		this.y = y;
	}
	
	
	public X getObjectOne(){
		return this.x;
	}
	
	public Y getObjectTwo() {
		return this.y;
	}
	
	
	public void printObject() {
		System.out.println("My Object One is : " + x.getClass().getSimpleName());
		System.out.println("My Object Two is : " + y.getClass().getSimpleName());
		
	}
	
	public void printValue() {
		System.out.println("Object one : " + x);
		System.out.println("Object two : " + y);
	}
	
}
