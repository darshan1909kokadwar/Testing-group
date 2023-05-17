package Constructor;

public class CollageData {

	String Sname;
	long phone;
	String Eid;
	static String Clgname;
	static String Priname;
	
	public void Sinfo() {
		System.out.println(Sname);
		System.out.println(phone);
		System.out.println(Eid);
		System.out.println(Clgname);
		System.out.println(Priname);
	}
	public static void main(String[] args) {                                                                                                                                                                                                                                                                                  
		CollageData s=new CollageData();
		s.Sname="Rudraksh";
		s.phone=9999999;
		s.Eid="ask@99";
		s.Clgname="ssc clg junnar";
		s.Priname="khan";
		
		s.Sinfo();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		
		CollageData ss=new CollageData();
		ss.Sname="Aayat";
		ss.phone=123456;
		ss.Eid="asb@2399";
		
		ss.Sinfo();
	}
}
