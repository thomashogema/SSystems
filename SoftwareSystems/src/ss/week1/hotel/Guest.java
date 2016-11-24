package ss.week1.hotel;
import ss.week1.hotel.Room;

/**
 * @author Maarten Looijenga
 * @version 1.0.0.3
 */

public class Guest {
	private String guestName;
	private Room room;


	public Guest(String n){
		this.guestName = n;
	}

	public boolean checkin(Room r){
		if (r.getGuest() == null) {
			r.setGuest(this);
			room = r;
			return true;
		}
		else {
			System.err.println("Inschecken is mislukt");
			return false;
		}	
	}
	
	public boolean checkout(){
		if(this.getRoom() == null){
			System.err.println("Ruimte is al leeg");
			return false;
		} else {
			this.getRoom().setGuest(null);
			this.room = null;
			return true;
		}
		
	}
	
	public String getName(){
		return this.guestName;
	}
	
	public Room getRoom(){
		return room;
	}
	
	public String toString(){
		return this.getName();
	}
}
