package apurba;

public class MyGenericMath<T extends Number> {
	private T[] nums;
	
	public MyGenericMath(T[] nums) {
		this.nums = nums;
	}
	
	public double getAverage() {
		double sum = 0.0;
		for(T num : nums) {
			sum += num.doubleValue();
		}
		return sum/nums.length;
	
	}
	
}
