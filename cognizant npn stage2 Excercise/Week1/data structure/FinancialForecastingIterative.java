public class FinancialForecastingIterative {
    
   
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        double futureValue = currentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; 
        double annualGrowthRate = 0.05; 
        int years = 10; 

        double futureValue = predictFutureValue(currentValue, annualGrowthRate, years);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}