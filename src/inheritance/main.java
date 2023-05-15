package inheritance;   //multilevel inheritance main method from parent child grandchild

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Parent data");
      parent p=new parent();
      System.out.println(p.a);
      System.out.println(p.b);
      p.shop();
      p.gold();
      
      
      System.out.println("child data from parents");
      child c=new child();
      System.out.println(c.a);
      System.out.println(c.b);
      c.shop();
      c.gold();
      
      
      System.out.println("grandchild car");
      grandchild g=new grandchild();
      g.shop();
      g.gold();
      g.car();
      
	}

}
