import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Reservation> reservations;

    public ReservationManager() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(String guestName, int roomNumber, LocalDate checkIn, LocalDate checkOut) {
        reservations.add(new Reservation(guestName, roomNumber, checkIn, checkOut));
    }

    public boolean removeReservation(int roomNumber) {
        return reservations.removeIf(reservation -> reservation.getRoomNumber() == roomNumber);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
