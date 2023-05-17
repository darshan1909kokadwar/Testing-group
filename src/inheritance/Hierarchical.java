package inheritance;
class India
{
	public void state() {
		System.out.println("maharashtra is state of india");
	}
}
class Mumbai extends India{
	public void city() {
		System.out.println("mumbai is capital of maharashtra");
	}
}
public class Hierarchical extends India{
	
	public void village(){
		System.out.println("pune is city of maharashtra");	
	}
	
	public static void main(String[] args) {
		Hierarchical h =new Hierarchical();
		h.state();h.village();
		
		Mumbai m =new  Mumbai();
	    h.state();m.city();	
	                                                                                                                                                  
	}
}
