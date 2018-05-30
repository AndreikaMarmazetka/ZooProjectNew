package VeiwModel.Sevices.user;

public class ReservationService {
    private static ReservationService ourInstance = new ReservationService();

    public static ReservationService getInstance() {
        return ourInstance;
    }

    private ReservationService() {
    }
}
