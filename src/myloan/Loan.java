package myloan;

import java.util.Date;

public abstract class Loan implements LoanConstants {
    private int id;
    private int loanNum;
    private String customerName;
    private int amountOfLoan;
    private double interestRate;
    private int term;
    private Date dueDate;
    
//    public Loan(int loanNum, String name, int amount, int term){
//        this.setLoanNum(loanNum);
//        this.setCustomerName(name);
//        if (amount > MAX_AMOUNT) {
//            System.out.println("Loan amount is over the maximum amount($250,000)");
//        }
//        else {
//            this.setAmountOfLoan(amount);
//        }
//        if (term == MID_TERM || term == LONG_TERM) {
//            this.setTerm(term);
//        } else {
//            this.setTerm(SHORT_TERM);
//        }
//    }
    
    @Override
    public abstract String toString();
//    public String toString(){
//        if (getTerm() == 1) {
//            return "Loan Number: " + getLoanNum() + ", Name: " + getCustomerName() + "\n" + "Amount: $" + getAmountOfLoan() + ", Term: " + getTerm() + " year, Interest Rate: " + getInterestRate() + "%";
//        } else {
//            return "Loan Number: " + getLoanNum() + ", Name: " + getCustomerName() + "\n" + "Amount: $" + getAmountOfLoan() + ", Term: " + getTerm() + " years, Interest Rate: " + getInterestRate() + "%";
//        }
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(int loanNum) {
        this.loanNum = loanNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAmountOfLoan() {
        return amountOfLoan;
    }

    public void setAmountOfLoan(int amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
