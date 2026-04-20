package com.day6.LoanBuddy;

abstract class AutoLoan extends LoanApplication implements IApprovable{ 

	AutoLoan(Applicant applicant, int term) {
		// TODO Auto-generated constructor stub
		super(applicant, term, 9.5);
		this.loanType = "AutoLoan";
	}
    
	public boolean approveLoan() {
        if(applicant.getCreditScore() >=650 && applicant.getIncome() >= applicant.getLoanAmount()/5){

            setApproved(true);
            return true;
        }
        setApproved(false);
        return false;
    }

}
