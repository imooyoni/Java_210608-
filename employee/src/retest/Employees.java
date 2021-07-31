package retest;

public class Employees {
	
	private String name;
	private String part;
	private String addr;
	private String tel;
	
	public Employees( ) {}
	
	public Employees(String name, String part, String addr, String tel) {
		this.name=name;
		this.part=part;
		this.addr=addr;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
