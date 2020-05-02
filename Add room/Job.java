package HotelEntity;

public class Job {
	private int jid;
	private String jname;
	private int lsal;
	private int hsal;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(int jid, String jname, int lsal, int hsal) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.lsal = lsal;
		this.hsal = hsal;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public int getLsal() {
		return lsal;
	}
	public void setLsal(int lsal) {
		this.lsal = lsal;
	}
	public int getHsal() {
		return hsal;
	}
	public void setHsal(int hsal) {
		this.hsal = hsal;
	}


}
