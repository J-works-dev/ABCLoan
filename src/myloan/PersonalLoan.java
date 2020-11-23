package myloan;

public class PersonalLoan extends Loan {
    private int pId;
    private String firstName;
    private String lastName;
    private boolean err;
    
    public PersonalLoan(int loanNum, String fname, String lname, int amount, int term) {
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
        this.setCustomerName(fname + lname);
        this.firstName = fname;
        this.lastName = lname;
        this.setInterestRate(2.0);
    }
    
    @Override
    public String toString(){
        return "Loan Number: " + getLoanNum() + ", Name: " + getCustomerName() + "\n" + 
                "Amount: $" + getAmountOfLoan() + ", Term: " + getTerm() + " year, Interest Rate: " + getInterestRate() + "%\n" +
                "Total amount at the due date: $" + (getAmountOfLoan() + (getTerm() * getAmountOfLoan() * getInterestRate() / 100));
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int id) {
        this.pId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isErr() {
        return err;
    }
}
