# ABCLoan
Assessment for Java in TAFE

Function requirements

• ABC Loan Co. makes loans for construction projects. There are two categories of Loans—those to
businesses and those to individual applicants.
  o Write an application that tracks all new construction loans. The application must also calculate
  the total amount owed at the due date (original loan amount + loan fee). The application
  should include the following classes:
        ▪ LoanConstants — A public interface. LoanConstants includes constant values for
        short-term (1 year), medium-term (3 years), and long-term (5 years) loans. It also
        contains constants for the company name and the maximum each loan amount
        ($250,000). Save your file as LoanConstants.java.
        ▪ Loan — A public abstract class that implements the LoanConstants interface. A
        Loan includes a loan number, customer last name, amount of loan, interest rate, and
        term. The constructor requires data for each of the fields except interest rate. Do not
        allow a loan amounts over the maximum specified in the LoanConatants interface.
        Force any loan term that is not one of the three defined in the LoanConstants class to
        a short-term, one-year loan. Override the toString() method to display the loan data.
        Save your file as Loan.java.
        ▪ BusinessLoan — A public class that extends Loan. The BusinessLoan constructor
        sets the interest rate to 1% over the current prime interest rate. Save your file as
        BusinessLoan.java.
        ▪ PersonalLoan — A public class that extends Loan. The PersonalLoan constructor
        sets the interest rate to 2% over the current prime interest rate. Save your file as
        PersonalLoan.java.
        ▪ CreateLoans — An application that creates an ArrayList object that contains five
        Loans. Prompt the user for the current prime interest rate. Then, in a loop, prompt the
        user for a loan type and all relevant information for that loan. Store the created Loan
        objects in the array. When data entry is complete, store the ArrayList object in a
        binary file and display all the loans. Save your file as CreateLoans.java.
        
  o The four java files – Loan. LoanConstants, BusinessLoan. PersonalLoan – must be in the
  package myloan. The test application will be CreateLoans in the default package (top
  folder).
  
  o Review your program against the program requirements and identify possible runtime errors,
  and improve program stability by using exception-handling techniques
  
  o Create program API documentation for the classes used in this program.
        ▪ Use JavaDoc utility.
        
  o Save your files correctly as specified above.
  
  o Include screenshots of demonstration.
  
