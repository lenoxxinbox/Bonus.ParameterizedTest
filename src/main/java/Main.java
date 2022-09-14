import ru.netology.bonus.services.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int a = service.calculate(1_000, false);
        System.out.println(a);
    }

}
