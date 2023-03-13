public class Main {
    public static void main(String[] args) {

        int year = 1;

        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("1000000 / 1");
        System.out.println(service.calculate(1000000, 1));

        System.out.println();
        System.out.println("1000000 / 2");
        System.out.println(service.calculate(1000000, 2));

        System.out.println();
        System.out.println("1000000 / 3");
        System.out.println(service.calculate(1000000, 3));




    }
}