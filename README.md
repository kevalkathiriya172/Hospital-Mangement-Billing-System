# Hospital Management Billing System

The Hospital Management Billing System is a software application that facilitates the calculation of billing amounts for patients after treatment, taking into account their insurance coverage. This project employs a simple insurance policy structure and provides an efficient solution for healthcare institutions to manage billing processes effectively.

## Insurance Plans

The system offers four different insurance plans, each providing varying degrees of coverage for medical expenses. These plans are:

- PlatinumPlan: This plan offers the highest coverage percentage of 85%, meaning it covers 85% of the total medical expenses.
- GoldPlan: The GoldPlan provides coverage of 80% of the total medical expenses.
- SilverPlan: With a coverage percentage of 70%, the SilverPlan covers 70% of the total medical expenses.
- BronzePlan: The BronzePlan offers a coverage percentage of 60%, covering 60% of the total medical expenses.

All four insurance plan classes extend the HealthInsurancePlan class, which contains a 'coverage' field indicating the coverage percentage provided by the plan.

## Billing Logic

The billing logic is implemented in the Billing.java class, which contains a static method called `computePaymentAmount`. This method takes a Patient object and an 'amount' parameter, representing the total amount billed before applying insurance. The method returns a double array with two elements: the amount to be paid by the insurance company and the amount to be paid by the patient.

If the patient has an insurance plan, the `computePaymentAmount` method calculates the insurance coverage based on the plan's coverage percentage. Then, it applies a discount to the patient's portion based on their insurance plan. The discount amounts for each plan are as follows:

- PlatinumPlan: $50 discount
- GoldPlan: $40 discount
- SilverPlan: $30 discount
- BronzePlan: $25 discount

If the patient does not have any insurance plan, a discount of $20 is applied. The final amount to be paid by the patient is calculated by subtracting the discount from their portion.

## Insurance Brands

The HealthInsurancePlan class contains a field called 'offeredBy', which represents the insurance brand offering the plan. This field is of type InsuranceBrand, allowing the system to associate each insurance plan with a specific insurance company.

## Getting Started

To use this project, follow these steps:

1. Clone the repository to your local machine using the following command:
2. ```bash
   git clone https://github.com/kevalkathiriya172/Hospital-Mangement-Billing-System.git
   ```

2. Import the project into your preferred Java development environment.

3. Explore the project files to understand the structure and implementation details.

4. Use the provided classes and methods, such as `Billing.computePaymentAmount`, to integrate the billing system into your hospital management software.

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please submit an issue on the project's GitHub repository. Additionally, you can fork the repository, make your changes, and submit a pull request for review.



