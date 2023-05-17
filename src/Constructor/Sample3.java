package Constructor;

public class Sample3 {
int a;
int b;

public Sample3() {
	a=10;
	b=20;
}
public Sample3(int c,int d) {
	a=c;
	b=d;
}
public void add() {
	System.out.println(a+b);
}
public void multi() {
	System.out.println(a*b);
}
public static void main(String[] args) {
	Sample3 s=new Sample3();
	
	s.add();
	s.multi();
	
	Sample3 ss=new Sample3(50,100);
	ss.add();
	ss.multi();
	
	
}

}
