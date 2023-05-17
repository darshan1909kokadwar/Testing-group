package Constructor;

public class Demo1
{
 int a;
 String s;
 public Demo1()
 {
	 
 }
 public Demo1(int x, String y)
 
 {
	 a=x;
	 s=y;
	 
 }
 public void method()
 {
	 System.out.println("parameter data");
 }
public static void main(String[] args) {
	Demo1 object=new Demo1();
	object.method();
}
}
