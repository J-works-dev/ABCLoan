package at2act1abcloan;
/**
 * @author 30024165 Sang Joon Lee
 * AT2 – Practical - Activity 1
 * 03/11/2020
 */
import myloan.PersonalLoan;
import myloan.BusinessLoan;
import myloan.Loan;
import java.util.Scanner;
import java.util.ArrayList;

public class CreateLoans {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Loan> loans = new ArrayList<>();
    static int type;
    static double primeRate;
    
    public static void main(String[] args) {
//        System.out.print("What is Prime Interest Rate? : ");
//        primeRate = sc.nextDouble();
        
        creatLoan();
        displayLoans();
        closeLoan();
    }
    public static void creatLoan() {
        for (int i = 0; i < 5; i++) {
            String name;
            String sname;
            int amount;
            int term;
            int loanNum = (i + 1) * 1000;
            
            while (true) {
                System.out.print("Business Loan(1) or Individual(2)?");
                try {
                    type = sc.nextInt();
                    if (type == 1 || type == 2) {
                        break;
                    } else {
                        System.out.println("Wrong input. Please try again.");
                    }
                } catch(Exception ex) {
                    System.out.println("Invalid input. Please try again.");
                }
                sc.nextLine();
            }
            switch (type) {
                case 1 ->  {
                    try{
                        System.out.print("What is Your Business Name? ");
                        name = sc.next();
                        System.out.print("How much do you loan? ");
                        amount = sc.nextInt();
                        System.out.print("How long will you use? ");
                        term = sc.nextInt();
                        BusinessLoan tempLoan = new BusinessLoan(loanNum, name, amount, term);
                        if (!(tempLoan.isErr())) {
                            loans.add(tempLoan);
                        } else {
                            i--;
                        }
                    } catch(Exception ex) {
                        System.out.println("Invalid input. Please try again.");
                        i--;
                    }
                    sc.nextLine();
                }
                case 2 ->  {
                    try {
                        System.out.print("What is Your First Name? ");
                        name = sc.next();
                        System.out.print("What is Your Last Name? ");
                        sname = sc.next();
                        System.out.print("How much do you loan? ");
                        amount = sc.nextInt();
                        System.out.print("How long will you use? ");
                        term = sc.nextInt();
                        PersonalLoan tempLoan = new PersonalLoan(loanNum, name, sname, amount, term);
                        if (!(tempLoan.isErr())) {
                            loans.add(tempLoan);
                        } else {
                            i--;
                        }
                    } catch(Exception ex) {
                        System.out.println("Invalid input. Please try again.");
                        i--;
                    }
                    sc.nextLine();
                }
            }
        }
    }
    public static void displayLoans() {
        System.out.println();
//        System.out.println("the Prime Interest Rate: " + primeRate + "%");
        for (int j = 0; j < loans.size(); j++) {
            System.out.println(loans.get(j).toString());
            System.out.println();
        }
    }
    public static void calculateTotal() {
        System.out.println();
        System.out.println("Your Total Loan amount is : Something");
    }
    public static void closeLoan() {
        int loanNum;
        int yesNo = 0;
        boolean pass = false;
        System.out.println();
        while (true) {
            System.out.print("Do you want to close Loan? Yes(1)/No(2) ");
            try {
                yesNo = sc.nextInt();
            } catch(Exception ex) {
                System.out.println("Invalid input. Please try again.");
            }

            if (yesNo == 1) {
                System.out.print("Enter Loan number to close loan: ");
                loanNum = sc.nextInt();
                for (int i = 0; i < loans.size(); i++) {
                    if ((int)loans.get(i).getLoanNum() == loanNum) {
                        loans.remove(i);
                        pass = true;
                    } else {
                        pass = false;
                    }
                }
                if (pass) {
                    System.out.println("Loan number " + loanNum + " is closed.");
                        displayLoans();
                } else {
                    System.out.println("Loan number " + loanNum + " is not found.");
                }
            } else if (yesNo == 2) {
                System.out.println("G'day!");
                break;
            } else {
                System.out.println("Wrong Input. Please try again");
            }
            sc.nextLine();
        }
        
    }
}
