package com.anz.assessment.accountTransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anz.assessment.accountTransaction.exceptions.ResourceNotFoundException;
import com.anz.assessment.accountTransaction.repository.JdbcTransactions;
import com.anz.assessment.accountTransactions.model.AccountTransactions;
import com.anz.assessment.accountTransactions.model.Accounts;

@RestController
@RequestMapping("/v1/application/")
public class TransactionController {
	@Autowired
	private JdbcTransactions transaction;

	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public List<Accounts> getAccountsInformation() {
		return transaction.getAllAccounts();
	}

	@RequestMapping(value = "/transactions/{accountNumber}", method = RequestMethod.GET)
	public List<AccountTransactions> getAccountTransactions(@PathVariable(value = "accountNumber") Long accountNumber)
			throws ResourceNotFoundException {

		return transaction.getAccountsTransactionByAccountNumber(accountNumber);
	}
}
