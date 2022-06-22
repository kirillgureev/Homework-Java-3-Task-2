public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80.7;
        double heightSquared = 3.24;
        double result = service.calculate(weight, heightSquared);
        System.out.println(result);
    }
}