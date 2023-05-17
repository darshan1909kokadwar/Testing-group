package inheritance;
class parent{
	public void house() {
		System.out.println("house property for parent class");
	}
}
public class Singlelevel extends parent{
	public void phone() {
		System.out.println("phone property for child class");
	}
	
	public static void main(String[] args) {
		Singlelevel s=new Singlelevel();
		s.house();
		s.phone();
	}
}
