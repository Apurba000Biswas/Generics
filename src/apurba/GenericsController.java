package apurba;

public class GenericsController {

	public static void main(String[] args) {
		
		MyGenericsClass<ClassOfDemoOne> genOne = new MyGenericsClass<>(null);
		genOne.printOject();
		
		genOne.setObject(new ClassOfDemoOne("Apurba", 20, 30.00));
		genOne.printOject();
		
		ClassOfDemoOne myObjec = genOne.getObject();
		System.out.println("My Object Value : " + myObjec.getName() + " " + myObjec.getNumber() + " " + myObjec.getValue() );
		
		
		
		MyGenericsClass<ClassOfDemoTwo> genTwo =   new MyGenericsClass<>(null);
		genTwo.setObject(new ClassOfDemoTwo("Apurba", 18, 34.0));
		
		genTwo.printOject();
		
		
		System.out.println(" ********************************************");
		
		
		MyGenericsClassTwo<String, Integer> genDoubleOne = new MyGenericsClassTwo<>("Apurba", 43);
		genDoubleOne.printObject();
		
		MyGenericsClassTwo<ClassOfDemoOne, ClassOfDemoTwo> genDoubleTwo = 
				new MyGenericsClassTwo<>(new ClassOfDemoOne("Biswas", 100, 20.3), new ClassOfDemoTwo("World", 56, 45.0));
		
		genDoubleTwo.printObject();
		
		MyGenericsClassTwo<ClassOfDemoOne, MyGenericsClassTwo<String, String>> genDoubleThree = new MyGenericsClassTwo<>(null, null);
		
		genDoubleThree.setObjectOne(new ClassOfDemoOne("APP", 23, 34.0));
		genDoubleThree.setObjectTwo(new MyGenericsClassTwo<>("TEST", "OBS"));
		
		genDoubleThree.printObject();
		
		genDoubleThree.printValue();
		genDoubleThree.getObjectTwo().printValue();
		
		
		System.out.println("  **********************************************  ");
		
		Integer[] integerArray = new Integer[4];
		integerArray[0] = 12;
		integerArray[1] = 12;
		integerArray[2] = 12;
		integerArray[3] = 12;

		
		MyGenericMath<Integer> genMath = new MyGenericMath<>(integerArray);
		System.out.println("Average : " + genMath.getAverage());
		
		
	}
}
