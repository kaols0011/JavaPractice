package testextend;
public class Employee {
    private int empno;
    private String name;
    private long salary;
    
    
    public Employee(int empno,String name,long salary) {
    	this.empno =empno;
    	this.name =name;
    	this.salary =salary;
    }
    
	public int getEmpno() {
		return empno;
	}
    public String desc() {
    	return "empno "+ getEmpno() +" name "+getName() +" salary "+ getSalary();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
    
}
