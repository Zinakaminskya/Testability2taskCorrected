public class BmiService {
    public double calculate(double weightInKilo, double heightInMeters) {
        double bmiIndex = (weightInKilo / (heightInMeters * heightInMeters));
        return (int) bmiIndex;
    }
}
