import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception 
    {
            int retire = 1;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter shift - 1 , 2 , or 3");
            int shift = input.nextInt();

            System.out.println("Enter the number of hours you worked: ");
            double hours = input.nextDouble();
     
            if(shift == 2 || shift == 3) {
                System.out.println("Would you like to participate in our retirenment plan? Select 1 or 2. 1 meaning yes and 2 meaning no: ");
                retire = input.nextInt();
   }

            double rate = payRate(shift);
            double gross = grossPay(rate, hours);
            
            System.out.println("Hours worked is " + hours);
            System.out.println("Hourly pay rate is $" + rate);
            hoursBreakdown(rate, hours);
            retirementPay(shift, retire, gross);
        }
    

    public static double payRate(int shift)
    {
        double rate = 0;
        if(shift == 1) {
            rate = 17;
        } 
        else if(shift == 2) {
            rate = 18.50;
        }
        else if(shift == 3) {
            rate = 22;
        }
          
    return rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        double regularp = 0;
        double overtimep = 0;
        if(hours <= 40) {
            regularp = hours * rate;
        }
        else if(hours > 40) {
            regularp = 40 * rate;
            overtimep = (hours - 40) * 1.5 * rate;
        }
        System.out.println("Your Regular Pay is: $" + regularp);
        System.out.println("OverTime Pay is: $" + overtimep);
    }

    public static double grossPay(double rate, double hours)
    {
        double pay = 0;
        double regularp = 0;
        double overtimep = 0;
        if(hours <= 40) {
            pay = hours * rate;
        }
        else if(hours > 40) {
            regularp  = 40 * rate;
            overtimep = (hours - 40) * 1.5 * rate;
            pay = regularp + overtimep;
        } 
        return pay;
    }

    public static void retirementPay(int shift ,int choice, double gross)
    {
        //fill in details
        double net = 0; 
        double retirementd = 0;
        if(choice == 1 && shift != 1) {
            retirementd = 0.03 * gross;
            net = gross * .97;
         }
         else if(shift == 1 || choice == 2) {
            net = gross;
         }

        System.out.println("Retirment Deduction is $" + retirementd);
        System.out.println("Net Pay is $" + net);
    }
}
