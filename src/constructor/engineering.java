package constructor;

public class engineering {

	int id;
	String studentname;
	float percentage;
	static String collegename;
	static String principalname;
	
	
	public engineering(int i,String n,float per,String a,String b)
	{
		id=i;
		studentname=n;
		percentage=per;
		collegename=a;
		principalname=b;
		
	}
	 public void computer()
	 {
		 System.out.println(id+""+studentname+""+percentage+""+collegename+""+principalname);
		 
	 }
	 public void mechanical()
	 {
		 System.out.println(id+""+studentname+""+percentage+""+collegename+""+principalname);
		 
	 }
	 public void entc()
	 {
		 System.out.println(id+""+studentname+""+percentage+""+collegename+""+principalname);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     engineering comp = new engineering(1,"darshan",88.09f,"gjgjy","tuty");
     comp.computer();
     engineering mech = new engineering(2,"dars",89.09f,"ghhjy","tutiiy");
     mech.computer();
	}

}
