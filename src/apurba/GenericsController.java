package apurba;

public class GenericsController {

	public static void main(String[] args) {
		
		MyGenericsClass<ClassOfDemoOne> genOne = new MyGenericsClass<>(null);;
		genOne.printOject();
		
		genOne.setObject(new ClassOfDemoOne("Apurba", 20, 30.00));
		genOne.printOject();
		
		ClassOfDemoOne myObjec = genOne.getObject();
		System.out.print("My Object Value : " + myObjec.getName() + " " + myObjec.getNumber() + " " + myObjec.getValue() );
		
	}

}
