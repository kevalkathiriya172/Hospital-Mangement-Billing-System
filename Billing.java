import java.util.*;
public class Billing {
    public static double[] computePaymentAmount(Patient patient, double amount) {
      double[] payments = new double[2];
      
      HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
      double paymentByInsurance = 0.0;
      
      if (patientInsurancePlan != null) {             
         paymentByInsurance = amount * patientInsurancePlan.getCoverage();
         payments[0] = paymentByInsurance;
      }
         
      if (patientInsurancePlan instanceof PlatinumPlan) {
         payments[1] = amount - paymentByInsurance - 50;
      } else if (patientInsurancePlan instanceof GoldPlan) {
         payments[1] = amount - paymentByInsurance - 40;
      } else if (patientInsurancePlan instanceof SilverPlan) {
         payments[1] = amount - paymentByInsurance - 30;
      } else if (patientInsurancePlan instanceof BronzePlan) {
         payments[1] = amount - paymentByInsurance - 25;
      } else {
         payments[1] = amount - 20;
      }     
      
      return payments;
   }

   public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);
         System.out.println("1 for PlatinumPlan:");
         System.out.println("2 for GoldPlan:");
         System.out.println("3 for SilverPlan:");
         System.out.println("4 for BronzePlan:");
         System.out.println("5 for no any Plan:");
         int plan = sc.nextInt();

         switch(plan){
            case 1:
                  HealthInsurancePlan insurancePlan = new PlatinumPlan();
                  Patient patient = new Patient();
                  patient.setInsurancePlan(insurancePlan);
                  System.out.println("Enter the amount:");
                  int amt = sc.nextInt();
                  double[] payments = Billing.computePaymentAmount(patient, amt);

                  System.out.println(payments[0]+ " " +payments[1]);
                   break;

            case 2:
                  HealthInsurancePlan insurancePlan2 = new GoldPlan();
                  Patient patient2 = new Patient();
                  patient2.setInsurancePlan(insurancePlan2);

                  System.out.println("Enter the amount:");
                  int amt2 = sc.nextInt();
                  double[] payments2 = Billing.computePaymentAmount(patient2, amt2);

                  System.out.println(payments2[0]+ " " +payments2[1]);
                   break;
            case 3:
                    HealthInsurancePlan insurancePlan3 = new SilverPlan();
                  Patient patient3 = new Patient();
                  patient3.setInsurancePlan(insurancePlan3);
                  System.out.println("Enter the amount:");
                  int amt3 = sc.nextInt();

                  double[] payments3 = Billing.computePaymentAmount(patient3, amt3);

                  System.out.println(payments3[0]+ " " +payments3[1]);
                   break;


            case 4:
                    HealthInsurancePlan insurancePlan4 = new BronzePlan();
                  Patient patient4 = new Patient();
                  patient4.setInsurancePlan(insurancePlan4);
                   System.out.println("Enter the amount:");
                  int amt4 = sc.nextInt();

                  double[] payments4= Billing.computePaymentAmount(patient4, amt4);

                  System.out.println(payments4[0]+ " " +payments4[1]);
                   break;

            default:
                    HealthInsurancePlan insurancePlan5 = new PlatinumPlan();
                  Patient patient5 = new Patient();
                  patient5.setInsurancePlan(insurancePlan5);
                   System.out.println("Enter the amount:");
                  int amt5 = sc.nextInt();

                  double[] payments5 = Billing.computePaymentAmount(patient5, amt5);

                  System.out.println(payments5[0]+ " " +payments5[1]);
                   break;
            
         }


   		
   }        
}