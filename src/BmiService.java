public class BmiService {
    public double calculate(double weight, double heightSquared) {
        double bmi = weight / heightSquared;
        return bmi;
    }
}
