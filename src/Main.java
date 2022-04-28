public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 50;
        int h = 160;
        float bmi = service.calculate(m, h);
        System.out.println("Индекс Массы Тела: " + bmi);
    }
}
