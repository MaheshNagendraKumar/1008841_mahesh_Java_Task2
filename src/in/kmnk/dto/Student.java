package in.kmnk.dto;

public class Student {
	
	private int sid;
	private String snmae;
	private int rollno;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnmae() {
		return snmae;
	}
	public void setSnmae(String snmae) {
		this.snmae = snmae;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", snmae=" + snmae + ", rollno=" + rollno + "]";
	}
	
	
	
	
}
