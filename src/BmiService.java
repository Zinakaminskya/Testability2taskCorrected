public class BmiService {
    public int calculate(double weightInKilo, double heightInMeters) {
        double bmiIndex = (weightInKilo / (heightInMeters * heightInMeters));
        return (int) bmiIndex;
    }
}
