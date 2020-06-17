package com.anz.assessment.accountTransaction.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.anz.assessment.accountTransaction.exceptions.ResourceNotFoundException;
import com.anz.assessment.accountTransactions.model.AccountTransactions;
import com.anz.assessment.accountTransactions.model.Accounts;

@Repository
public class JdbcTransactions {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Accounts> getAllAccounts() {
		return jdbcTemplate.query("select * from Accounts", new BeanPropertyRowMapper<Accounts>(Accounts.class));

	}

	public List<AccountTransactions> getAccountsTransactionByAccountNumber(Long accountNumber) {

		List<AccountTransactions> transList = jdbcTemplate.query(
				"select * from AccountTransactions where AccountNumber=" + accountNumber,
				new BeanPropertyRowMapper<AccountTransactions>(AccountTransactions.class));
		if (transList.size() == 0) {
			throw new ResourceNotFoundException(accountNumber);
		}
		return transList;
	}

}
