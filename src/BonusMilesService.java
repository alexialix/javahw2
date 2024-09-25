public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPerRuble = 20;
        int miles = ticketPrice / milesPerRuble;
        return miles;
    }
}
