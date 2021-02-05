package apurba;

public class MyGenericsClass<T>{
	
	private T myObject;
	
	
	
	public MyGenericsClass(T obj) {
		this.myObject = obj;
	}
	
	
	public T getObject() {
		return myObject;
	}
	
	public void setObject(T object) {
		this.myObject = object;
	}
	
	
	
	public void printOject() {
		if(myObject == null) {
			System.out.println("My Object is NuLL####");
			return;
		}
		System.out.println("** My Object is : " + myObject.getClass().getSimpleName());
	}
	
	
	
	
	
}
