package com.anz.assessment.accountTransactions.model;

public class AccountTransactions {
	private String AccountTransactionsID;
	private Long AccountNumber;
	private String ValueDate;
	private Long DebitAmount;
	private Long CreditAmount;
	private String CreditOrDebit;
	private String TransactionNarrative;

	public String getAccountTransactionsID() {
		return AccountTransactionsID;
	}

	public void setAccountTransactionsID(String accountTransactionsID) {
		AccountTransactionsID = accountTransactionsID;
	}

	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getValueDate() {
		return ValueDate;
	}

	public void setValueDate(String valueDate) {
		ValueDate = valueDate;
	}

	public Long getDebitAmount() {
		return DebitAmount;
	}

	public void setDebitAmount(Long debitAmount) {
		DebitAmount = debitAmount;
	}

	public Long getCreditAmount() {
		return CreditAmount;
	}

	public void setCreditAmount(Long creditAmount) {
		CreditAmount = creditAmount;
	}

	public String getCreditOrDebit() {
		return CreditOrDebit;
	}

	public void setCreditOrDebit(String creditOrDebit) {
		CreditOrDebit = creditOrDebit;
	}

	public String getTransactionNarrative() {
		return TransactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		TransactionNarrative = transactionNarrative;
	}

}
