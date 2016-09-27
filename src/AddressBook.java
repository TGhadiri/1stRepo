import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddyInfo;
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}

	private void addBuddy(BuddyInfo aBuddyInfo) {
		if(aBuddyInfo != null) {
			buddyInfo.add(aBuddyInfo);
		}
	}
	
	private BuddyInfo removeBuddy(int index) {
		if(index >= 0 && index < buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}	
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 1234); 
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}
