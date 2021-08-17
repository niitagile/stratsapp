package LambdaExamples;

interface Calc{
	public int perform(int a);
}
public class LamdaWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calc calc=(val)->{return val*val;};
		
		Calc calc= a->a*a;
			
		
		System.out.println(calc.perform(5));
	}

}
