package constructor;

public class maincollegedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    collegedata darshan=new collegedata();
    darshan.studentname="Darshan kokadwar";
    darshan.mono=8766590710l;
    darshan.email="darshankokadwar1997@gmail.com";
    collegedata.principalname="abc";
    collegedata.collegename="gghsd";
    System.out.println("method call using darshan object");
    darshan.studentinfo();
   
    
    collegedata dars=new collegedata();
    dars.studentname="Darshan";
    dars.mono=8766590711l;
    dars.email="darshankokadwar1998@gmail.com";
    dars.studentinfo();
    
	}

}
