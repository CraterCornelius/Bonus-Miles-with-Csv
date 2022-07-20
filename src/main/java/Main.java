import org.example.BonusService.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 10_000;
        boolean registered = true;

        long summary = service.calculate(amount, registered);
        System.out.println(summary);
    }
}