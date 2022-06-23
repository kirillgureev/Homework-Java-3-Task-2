public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75.1;
        double height = 1.85;
        double result = service.calculate(weight, height);
        System.out.println(result);
    }
}