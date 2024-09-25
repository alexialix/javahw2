public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 23_547;
        int miles = service.calculate(ticketPrice);

        System.out.println("Начисленно бонусных миль: " + miles);
    }
}
