package com.TransactionObject;

public class TransactionObject {
	
	 int customerId;
	 int transactionAmount;
	 int debit;
	 int credit;
	public TransactionObject(int customerId, int transactionAmount, int debit, int credit) {
		super();
		this.customerId = customerId;
		this.transactionAmount = transactionAmount;
		this.debit = debit;
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "TransactinObject [customerId=" + customerId + ", transactionAmount=" + transactionAmount + ", debit="
				+ debit + ", credit=" + credit + "]";
	}
	  

}
