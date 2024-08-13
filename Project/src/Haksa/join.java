package Haksa;

public class join implements Comparable<join>{
	private String id;
	private String pw;
	private String name;
	private String major;
	private int No;
	
	public join() {}
	public join(String id, String pw, String name, String major, int No) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.major = major;
		this.No = No;
	}
	
	public String getId() { return id; }
	public String getPw() { return pw; }	
	public String getName() { return name; }
	public String getMajor() { return major; }
	public int getNo() { return No; }

	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setNo(int no) {
		No = no;
	}
	
	@Override
	public String toString() {
		return "\n학번: " + No + "\n전공: " + major + "\n이름: " + name
				+ "\nID: " + id + "\nPW: " + pw;
	}
	@Override
	public int compareTo(join o) {
		return id.compareTo(o.getId());
	}	
}
