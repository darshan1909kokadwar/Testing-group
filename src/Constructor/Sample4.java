package Constructor;

public class Sample4 {
int a;
int b;

public Sample4() {
	a=10;
	b=20;
}
public Sample4(int c,int d) {
	a=c;
	b=d;
}
public void addition() {
	System.out.println(a+b);
}
public void multiplication() {
	System.out.println(a*b);
}
public static void main(String[] args) {
	Sample4 s=new Sample4();
	s.addition();
	s.multiplication();
	
	Sample4 ss=new Sample4(30,40);
	ss.addition();
	ss.multiplication();
	
}
}
