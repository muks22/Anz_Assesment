package com.anz.assessment.accountTransactions.model;

import java.util.List;

public class Accounts {
	private Long AccountNumber;
	private String AccountName;
	private String AccountType;
	private String BalanceDate;
	private String Currency;
	private String OpeningAvaialbleBalance;
	private List<AccountTransactions> transactions;

	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getBalanceDate() {
		return BalanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		BalanceDate = balanceDate;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getOpeningAvaialbleBalance() {
		return OpeningAvaialbleBalance;
	}

	public void setOpeningAvaialbleBalance(String openingAvaialbleBalance) {
		OpeningAvaialbleBalance = openingAvaialbleBalance;
	}

	public List<AccountTransactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<AccountTransactions> transactions) {
		this.transactions = transactions;
	}
}
