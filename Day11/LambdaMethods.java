package LambdaExamples;
@FunctionalInterface
interface Sayable{
	void say();
}
interface Messanger{
	MethodRef getMessage(String msg);
	
}

class MethodRef{
	
	MethodRef(){
		System.out.println("Constructor");
	}
	MethodRef(String str){
		System.out.println(str);
	}
	public static void display(){
		System.out.println("Hello Everyone");
	}
}
public class LambdaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable= MethodRef::display;
		sayable.say();
		Sayable s1=MethodRef::new;//Sayable s1=new MethodRef();
		s1.say();
		Messanger msg=MethodRef::new;
		msg.getMessage("Meassanger");//parameterized constructor
		
	}

}
