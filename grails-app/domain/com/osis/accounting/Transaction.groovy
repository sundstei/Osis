package com.osis.accounting

import com.osis.User

class Transaction
{
	Account creditAccount
	Account debitAccount
	double amount
	Date createdDate
	User createdBy

	static constraints = {
	}
}
