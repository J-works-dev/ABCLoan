package myloan;

public class BusinessLoan extends Loan {
    private int bId;
    private String businessName;
    private boolean err;
    
    
    public BusinessLoan(int loanNum, String name, int amount, int term) {
        if (amount > MAX_AMOUNT) {
            System.out.println("Loan amount is over the maximum amount($250,000)");
            err = true;
            return;
        }
        else {
            this.setAmountOfLoan(amount);
        }
        if (term == MID_TERM || term == LONG_TERM) {
            this.setTerm(term);
        } else {
            this.setTerm(SHORT_TERM);
        }
        this.setLoanNum(loanNum);
        this.setCustomerName(name);
        this.setInterestRate(1.0);
    }
    
    @Override
    public String toString(){
        return "Loan Number: " + getLoanNum() + ", Company Name: " + getCustomerName() + "\n" + 
                "Amount: $" + getAmountOfLoan() + ", Term: " + getTerm() + " year, Interest Rate: " + getInterestRate() + "%\n" +
                "Total amount at the due date: $" + (getAmountOfLoan() + (getTerm() * getAmountOfLoan() * getInterestRate() / 100));
    }

    public int getBId() {
        return bId;
    }

    public void setBId(int id) {
        this.bId = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    
    public boolean isErr() {
        return err;
    }
}
