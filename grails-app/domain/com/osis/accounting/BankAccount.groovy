package com.osis.accounting

import com.osis.User

class BankAccount
{
	static constraints = {
	}

	Bank bank
	String accountNumber
	Date createdDate
	Date updatedDate
	User createdBy
}
