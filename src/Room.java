public class Room {
    private int roomNuber;
    private String type;
    private double prise;

    public Room(int roomNuber, String type, double prise) {
        this.roomNuber = roomNuber;
        this.type = type;
        this.prise = prise;
    }

    public int getRoomNuber() {
        return roomNuber;
    }

    public String getType() {
        return type;
    }

    public double getPrise() {
        return prise;
    }

    public void setRoomNuber(int roomNuber) {
        this.roomNuber = roomNuber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}
