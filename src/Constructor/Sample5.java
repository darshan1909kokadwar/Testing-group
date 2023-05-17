package Constructor;

public class Sample5 {
int a;
int b;

public Sample5() {
	a=10;
	b=20;
}
public Sample5(int c,int d){
	a=c;
	b=d;
}
public void add() {
	System.out.println(a+b);
}
public void mult() {
	System.out.println(a*b);
}
public static void main(String[] args) {
	Sample5 s=new Sample5 ();
	s.add();s.mult();
	
	Sample5 ss=new Sample5 (50,50);
	ss.add();ss.mult();
}
}
