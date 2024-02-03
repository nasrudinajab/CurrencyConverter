import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Welcome to NasBank - Canadian Owned\nPlease Select one of the options(ex. 4)");
    System.out.println("(1) CAD -> USD");
    System.out.println("(2) CAD -> EUR");
    System.out.println("(3) CAD -> JPY");
    System.out.println("(4) CAD -> GBP");
    System.out.println("(5) CAD -> CHF");

    int currencytype = myObj.nextInt();  // Read user input
     switch (currencytype) {
            case 1:
                                    System.out.println("How much $ would you like to convert to USD");
                                    double money_usd = myObj.nextDouble();
                                    double result_usd = cadtoUSD(money_usd);  
                                    System.out.println("Your " + money_usd + " CAD has now been converted to " + result_usd + " USD");
                break;
            case 2:
                                    System.out.println("How much $ would you like to convert to EUR");
                                    double money_eur = myObj.nextDouble();
                                    double result_eur = cadtoEUR(money_eur);  
                                    System.out.println("Your " + money_eur + " CAD has now been converted to " + result_eur + " EUR");

                break;
            case 3:
                                    System.out.println("How much $ would you like to convert to JPY");
                                    double money_jpy = myObj.nextDouble();
                                    double result_jpy = cadtoJPY(money_jpy);  
                                    System.out.println("Your " + money_jpy + " CAD has now been converted to " + result_jpy + " JPY");

                 break;
            case 4:
                                    System.out.println("How much $ would you like to convert to GBP");
                                    double money_gbp = myObj.nextDouble();
                                    double result_gbp = cadtoGBP(money_gbp);  
                                    System.out.println("Your " + money_gbp + " CAD has now been converted to " + result_gbp + " GBP");

                break;
            case 5:
                                    System.out.println("How much $ would you like to convert to CHF");
                                    double money_chf = myObj.nextDouble();
                                    double result_chf = cadtoCHF(money_chf);  
                                    System.out.println("Your " + money_chf + " CAD has now been converted to " + result_chf + " CHF");

                break;
  }
  
 

    }
    
    public static double cadtoUSD(double a) {
        return a * 0.74;
}

   public static double cadtoEUR(double b) {
        return b * 0.69;
} 

   public static double cadtoJPY(double c) {
        return c * 110.11;
} 

   public static double cadtoGBP(double d) {
        return d * 0.59;
} 

   public static double cadtoCHF(double e) {
        return e * 0.64;
} 


    

}
