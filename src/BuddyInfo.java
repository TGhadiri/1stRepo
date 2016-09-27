
public class BuddyInfo {

	private String name;
	private String homeaddress;
	private int phonenumber;
	
	public BuddyInfo(String name, String homeaddress, int phonenumber) {
		super();
		this.name = name;
		this.homeaddress = homeaddress;
		this.phonenumber = phonenumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public static void main(String[] args) {
		Systme.out.println("Hello Wrold!");
	}

}
