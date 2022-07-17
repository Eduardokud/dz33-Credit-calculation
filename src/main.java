public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесечный платеж = " + service.calculate(1_000_000, 9.99, 1));
        System.out.println();
        System.out.println("Ежемесечный платеж = " + service.calculate(1_000_000, 9.99, 2));
        System.out.println();
        System.out.println("Ежемесечный платеж = " + service.calculate(1_000_000, 9.99, 3));



    }
}
