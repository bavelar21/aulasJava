
public class Voo {
	private int places[];
	
	public Voo() {
		places = new int[100];
		initiation();
	}
	
	public Voo(int [] places) {
		this.places = places;
	}
	
	private void initiation() {
		for(int i = 0; i < 100; i++) {
			places[i] = -1;
		}
	}
	
	public int[] getPlaces() {
		return places;
	}
	
	public void setPlaces(int [] places) {
		this.places = places;
	}
	
	public int nextFree() {
		int position = -1;
		for(int i = 0; i < 100; i++) {
			if(places[i] == -1) {
				return i;
			}
		}
		return -1;
	}
	
	public void verifySeat(int seat) {
		if(places[seat] == -1) {
			System.out.println("Seat available!");
		}
		else {
			System.out.println("Seat unavailable!");
		}
	}
	
	public int seatReservation() {
		int seat = nextFree();
		if(seat != -1) {
			places[seat] = 0;
		}
		return seat;
	}
	
	public int availableSeats() {
		int cont = 0;
		for(int i = 0; i < 100; i++) {
			if(places[i] == -1) {
				cont++;
			}
		}
		return cont;
	}
	
	public int unavailableSeats() {
		int cont = 0;
		for(int i = 0; i < 100; i++) {
			if(places[i] == 0) {
				cont++;
			}
		}
		return cont;
	}
}
