package testextend;

public class Manger extends Employee {
	private long bonus;
	
	  public Manger ( int empno,String name,long salary,long bonus) {
		  super(empno, name, salary);

		this.bonus =bonus;
		
	}
  @Override
public long getSalary() {
	// TODO Auto-generated method stub
	return super.getSalary();
}
	  
 @Override
 public String desc() {
	String fromSuperDesc = super.desc();
	String d =fromSuperDesc +"分紅"+bonus;		
	return d;
}

	  
}
