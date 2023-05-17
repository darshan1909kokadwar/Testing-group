package Constructor;

public class WithConstructor {

	int sr;
	String name;
	float percentage;
	char grade;
	
	public  WithConstructor() {
		sr=1;
		name="Ayesha khan";
		percentage=90.10f;
		grade='A';
		
	}
	public static void main(String[] args) {
		WithConstructor s=new WithConstructor();
		System.out.println(s.sr);
		System.out.println(s.name);
		System.out.println(s.percentage);
		System.out.println(s.grade);
	}
}
