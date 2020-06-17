package com.anz.assessment.accountTransaction.testing;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.anz.assessment.accountTransaction.repository.JdbcTransactions;
import com.anz.assessment.accountTransactions.model.Accounts;

@RunWith(SpringRunner.class)
public class AccountsTest {
	@Autowired
	JdbcTransactions transactions;

	@Test
	public void getAccountsTest() {
		List<Accounts> list = transactions.getAllAccounts();
		Assert.assertTrue(list.size() == 3);
	}
}
