package variablesdatatypes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(Globalandlocalvariables.d);
      Globalandlocalvariables.staticmethod();
      
      Globalandlocalvariables obj=new  Globalandlocalvariables();
      System.out.println(obj.c);
      obj.nonstaticmethod();
      
	}

}
