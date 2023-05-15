package constructor;

public class withconstructor {
    int sr;               //declre variable
    String studentname;
    float percentage;
     char grade;
      public withconstructor()   //user definned value
      {
    	  sr=10;
    	  studentname="darshan";
    	  percentage=90.00f;
    	  grade='A';
      }
      
      public void result()
      {
    System.out.println(sr+" "+studentname+""+percentage+""+grade);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withconstructor obj=new withconstructor();
		obj.result();

	}

}
