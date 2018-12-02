import java.util.ArrayList;


public class EmployeeDetail {
	public static void main(String[] args) {
	
	ArrayList<EmployeeTable> array = new ArrayList<EmployeeTable>();
	ArrayList<MyDate> date=new ArrayList<MyDate>();
	MyDate d1=new MyDate(01,12,2011);
	MyDate d2=new MyDate(02,11,2012);
	MyDate d3=new MyDate(11,10,2011);
	MyDate d4=new MyDate(12,9,2015);
	MyDate d5=new MyDate(13,8,2016);
	MyDate d6=new MyDate(14,7,2017);
	MyDate d7=new MyDate(14,7,2018);
	MyDate d8=new MyDate(14,7,2019);
	MyDate d9=new MyDate(14,8,2017);
	MyDate d10=new MyDate(14,9,2017);
	MyDate d11=new MyDate(14,10,2017);
	MyDate d12=new MyDate(14,11,2017);
	MyDate d13=new MyDate(14,12,2017);
	MyDate d14=new MyDate(14,7,2018);

	
	array.add(new EmployeeTable(7369, "smith", "clerk", 7902, 800, 0, 20,d1));
	array.add(new EmployeeTable(7499, "allen", "salesman", 7698, 1600, 300, 30,d2));
	array.add(new EmployeeTable(7521, "ward", "salesman", 7698, 1250, 500, 30,d3));
	array.add(new EmployeeTable(7566, "jones", "manager", 7839, 2975, 0, 20,d4));
	array.add(new EmployeeTable(7654, "martin", "salesman", 7698, 1250, 1400, 30,d5));
	array.add(new EmployeeTable(7698, "blake", "manager", 7839, 2850, 0, 30,d6));
	array.add(new EmployeeTable(7782, "clark", "manager", 7839, 2450, 0, 10,d7));
	array.add(new EmployeeTable(7788, "scott", "analyst", 7566, 3000, 0, 20,d8));
	array.add(new EmployeeTable(7839, "king", "president", 0, 5000, 0, 10,d9));
	array.add(new EmployeeTable(7844, "turner", "salesman", 7698, 1500, 0, 30,d10));
	array.add(new EmployeeTable(7876, "adams", "clerk", 7788, 1100, 0, 20,d11));
	array.add(new EmployeeTable(7900, "james", "clerk", 7698, 950, 0, 30,d12));
	array.add(new EmployeeTable(7902, "ford", "analyst", 7566, 3000, 0, 20,d13));
	array.add(new EmployeeTable(7934, "miller", "clerk", 7782, 1300, 0, 10,d14));
	System.out.println("2-------------------------------");
	array.stream().map(t->t.ename+" "+t.empNo).forEach(a->System.out.println(a));
	System.out.println("3-------------------------------");
	array.stream()
	.filter(t->t.deptNo==30)
	.map(t->t.getEname()+" "+t.getDeptNo())
	.forEach(a->System.out.println(a));
	System.out.println("4-------------------------------");
	array.stream()
	.filter(t->t.getJob()=="clerk")
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("6-------------------------------");
	array.stream()
	.filter(t->t.getComm()>t.getSal())
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("5-------------------------------");
	array.stream()
	.filter(t->t.getDeptNo()>=20)
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("7-------------------------------");
	array.stream()
	.filter(t->t.getComm()>t.getSal()*0.6)
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("8-------------------------------");
	array.stream()
	.filter(t->t.getComm()>t.getSal()*0.5)
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("9-------------------------------");
	array.stream()
	.filter(t->t.getDeptNo()==20 && t.getSal()>2000)
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("10-------------------------------");
	array.stream()
	.filter(t->t.getDeptNo()==30 && t.getSal()==1500 && t.getJob()=="salesman")
	.map(t->t.getEname()+" "+t.getJob()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("11-------------------------------");
	array.stream()
	.filter(t->t.getJob()=="manager" || t.getJob()=="president")
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("12-------------------------------");
	array.stream()
	.filter(t->t.getJob()=="manager" && t.getDeptNo()!=30)
	.map(t->t.getEname()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("13-------------------------------");
	array.stream()
	.filter(t->(t.getJob()=="manager" || t.getJob()=="clerk") && t.getDeptNo()==10)
	.forEach(a->System.out.println(a));
	System.out.println("14-------------------------------");
	array.stream()
	.filter(t->(t.getJob()=="manager" )||( t.getJob()=="clerk" && t.getDeptNo()==10))
	.forEach(a->System.out.println(a));
	System.out.println("15-------------------------------");
	array.stream()
	.filter(t->(t.getJob()=="manager" && t.getDeptNo()==10 )||( t.getJob()=="clerk" && t.getDeptNo()==20))
	.forEach(a->System.out.println(a));
	System.out.println("16-------------------------------");
	array.stream()
	.filter(t->t.getJob()!="manager"&& t.getJob()!="clerk" && t.getSal()>=2000)
	.map(t->t.getEname()+" "+t.getJob()+" "+t.getSal())
	.forEach(a->System.out.println(a));
	System.out.println("17-------------------------------");
	array.stream()
	.filter(t->t.getSal()>1200 && t.getSal()<1400)
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo())
	.forEach(a->System.out.println(a));
	System.out.println("18-------------------------------");
	array.stream()
	.filter(t->t.getJob()=="clerk" || t.getJob()=="analyst" || t.getJob()=="salesman")
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("19-------------------------------");
	array.stream()
	.filter(t->t.getJob()!="clerk" && t.getJob()!="analyst" && t.getJob()!="salesman")
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("20-------------------------------");
	array.stream()
	.filter(t->t.getComm()==0)
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("21-------------------------------");
	array.stream()
	.filter(t->t.getComm()==0)
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("22-------------------------------");
	array.stream()
	.filter(t->t.getComm()!=0)
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	System.out.println("23-------------------------------");
	array.stream()
	.filter(t->t.getComm()==0 || t.getComm()<100)
	.map(t->t.getEname()+" "+t.getSal()+" "+t.getEmpNo()+" "+t.getJob())
	.forEach(a->System.out.println(a));
	
	
	
	}

	
	
}

