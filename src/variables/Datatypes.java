package variables;

public class Datatypes {
int g=30;

static int e =50;

public static void addition() {
	int a=10;
	int b=20;
	int add=a+b+e;
	System.out.println(add);
}
public void multiplication() {
	int c=10;
	int d=20;
	int multi=c*d*g;
	System.out.println(multi);
}
public static void main(String[] args) {
	System.out.println("static mrthod answer");
	addition();
	System.out.println("instance mrthod answer");
	Datatypes d=new Datatypes();
	d.multiplication();
}
}
