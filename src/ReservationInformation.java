import java.time.LocalDate;

public class ReservationInformation {
    private Room room;
    private  String clientName;
    private LocalDate reservatonStartDate;
    private LocalDate reservationEndDate;
    private double price;

    public ReservationInformation(Room room, String clientName, LocalDate reservatonStartDate, LocalDate reservationEndDate, double price) {
        this.room = room;
        this.clientName = clientName;
        this.reservatonStartDate = reservatonStartDate;
        this.reservationEndDate = reservationEndDate;
        this.price = price;
    }

    public Room getRoom() {
        return room;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getReservatonStartDate() {
        return reservatonStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public double getPrice() {
        return price;
    }
}

