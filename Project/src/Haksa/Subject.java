package Haksa;

public class Subject {
	private String subName;
	private int fullPers;
	private int nowPers;
	
	public Subject() {}
	public Subject(String subName, int fullPers, int nowPers) {
		super();
		this.subName = subName;
		this.fullPers = fullPers;
		this.nowPers = nowPers;
	}
	public String getSubName() { return subName; }
	public int getFullPers() { return fullPers; }
	public int getNowPers() { return nowPers; }	
	public void setNowPers(int nowPers) {
		this.nowPers = nowPers;
	}
	@Override
	public String toString() {
		return subName + "[" + fullPers + "] 현재신청 수: " + nowPers;
	}
}
