package practice;

public class Constructors66 {

	int id;
	int age;
	String name;
	
	Constructors66(int i,String n){
	
	id=i;
	name=n;
	}
	Constructors66(int i,int a,String n)
	{
		id=i;
		name=n;
		age=a;
	
	}
	void display()
	{
		System.out.println(id+" "+age+" "+name );
	}
	
	
	public static void main(String[] args) {

		Constructors66 xyz=new Constructors66(10,20,"sham");
		Constructors66 pqr=new Constructors66(11,30,"sam");

		xyz.display();
		pqr.display();
		
	}

}
