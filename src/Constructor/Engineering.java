package Constructor;

public class Engineering {

 String name;
 int id;
 float percentage;
 static String collagename;
 static String principle;

 public Engineering(String n,int i,float prc,String clgn,String prin) {
	 name=n;
	 id=i;
	 percentage=prc;
	 collagename=clgn;
	 principle=prin;
 }
public void Comp() {
	System.out.println("Comp data");
	System.out.println(name+" "+id+" "+percentage+" "+collagename+" "+principle);
}	
public void Mech() {
	System.out.println("Mech data");
	System.out.println(name+" "+id+" "+percentage+" "+collagename+" "+principle);	
}
public void Entc() {
	System.out.println("Entc data");
	System.out.println(name+" "+id+" "+percentage+" "+collagename+" "+principle);
}

public static void main(String[] args) {
	Engineering e = new Engineering("sayali",1,90,"sscclg","abc");
	e.Comp();
	Engineering e1 = new Engineering("sita",2,80,"sscclg","abc");
	e1.Mech();
	Engineering e2 = new Engineering("priya",3,70,"sscclg","abc");
	e2.Entc();
}
}
