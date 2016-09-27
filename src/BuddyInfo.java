
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
	
	public boolean isEven(int phonenumber) {
		if( phonenumber%2 == 0)
			return true;
		else
			return false;		
	}

	public static void main(String[] args) {
		System.out.println("Hello Wrold!");
	}

}
