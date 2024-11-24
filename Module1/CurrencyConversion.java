public class CurrencyConversion {
    public static void main(String args[]) {
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;
        System.out.println("Initial amount: " + amountInUSD);
        System.out.println(amountInUSD*=exchangeRateUSDToEUR);
        double deduction = 85.0 - 55.0;
        System.out.println("Balance: " + deduction);
        double exchangeRateEURToUSD = 1/0.85;
        double BUSD = deduction*=exchangeRateEURToUSD;
        System.out.printf("Balance in USD: $%.2f" , BUSD);
    }
}
