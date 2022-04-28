public class BmiService {
    public float calculate (int m, float h) {
        float h2 = h / 100 * h / 100;
        float bmi = m / h2;
        return bmi;
    }
}
