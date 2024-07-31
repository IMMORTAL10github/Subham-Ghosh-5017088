public class FinancialForecastingRecursion {
    
    
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        
        if (years == 0) {
            return currentValue;
        }
        
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; 
        double annualGrowthRate = 0.05; 
        int years = 10; 

        double futureValue = predictFutureValue(currentValue, annualGrowthRate, years);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}