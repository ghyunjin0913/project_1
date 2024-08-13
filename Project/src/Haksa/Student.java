package Haksa;

public class Student implements Comparable<Student> {
	private String sub1;
	private String sub2;
	private String sub3;
	
	
	public Student() {}
	public Student(String sub1, String sub2, String sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public String getSub1() { return sub1; }
	public String getSub2() { return sub2; }
	public String getSub3() { return sub3; }

	@Override
	public String toString() {
		return "수강신청 목록: " + sub1 + ", " + sub2 + ", " + sub3;
	}
	@Override
	public int compareTo(Student o) {
		return sub1.compareTo(o.getSub1());
	}
}
