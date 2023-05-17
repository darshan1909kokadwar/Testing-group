package inheritance;
class parent1{
	public void farm() {
		System.out.println("farm proerty for parent class");
	}
}
class child extends parent1{
	public void car() {
		System.out.println("car property for child class");
	}
}
public class Multilevel extends child{
	public void bike() {
		System.out.println("bike property for child class");
	}
	
	public static void main(String[] args) {
		Multilevel s=new Multilevel();
		s.farm();
		s.car();
		s.bike();
	}
}
