package Constructor;

public class EmplyeeData {
String Ename;
int Eid;
String Cmpname;

public void disp() {
	System.out.println(Ename);
	System.out.println(Eid);
	System.out.println(Cmpname);
}
public static void main(String[] args) {
	EmplyeeData e=new EmplyeeData();
	e.Ename="ayesha";
	e.Eid=123;
	e.Cmpname="xyz";
	e.disp();
}

}
