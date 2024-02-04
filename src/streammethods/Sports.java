package streammethods;

public class Sports implements Comparable<Sports>{

	int sid;
	String sName;
	public Sports(int sid, String sName) {
		
		this.sid = sid;
		this.sName = sName;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "sid=" + sid +", sName=" + sName+" \n" ;
	}
	@Override
	public int compareTo(Sports o) {
		return this.sName.compareToIgnoreCase(o.sName);
	}
	
	
}
