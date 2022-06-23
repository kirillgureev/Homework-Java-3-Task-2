public class BmiService {
    public double calculate(double weight, double height) {
        double heightSquared = height * height;
        double bmi = weight / heightSquared;
        return bmi;
    }
}
