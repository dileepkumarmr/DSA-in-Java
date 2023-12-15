public class Reservation {
    int guestcount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

public Reservation(int count, int capacity, boolean open) {
    if(count < 1 || count > 8) {
        System.out.println("Invalid reservation");
    }
    guestcount = count;
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
    
}
public void confirmReservation() {
    if(restaurantCapacity >= guestcount && isRestaurantOpen ) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
    } else {
        System.out.println("Reservation denied");
        isConfirmed = false;
    }
}

public void informUser() {

if(!isConfirmed) {
System.out.println("Unnable to confirm reservation, please contact restaurant");

} else {
    System.out.println("Please, enjoy ur meal");
    
}
}
public static void main(String[] args) {
    Reservation Three = new Reservation(15, 12, true);
    Reservation Four = new Reservation(4,  3, true);
    Three.confirmReservation();
    Three.informUser();
    Four.confirmReservation();
    Four.informUser();
    
}    
}
