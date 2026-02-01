public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int seatHeight, int speed) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
