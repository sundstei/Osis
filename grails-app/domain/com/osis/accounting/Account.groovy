package com.osis.accounting

import com.osis.User

class Account
{

	static constraints = {
	}

	int number
	String name
	Date createdDate
	Date changedDate
	User createdBy
	User changedBy

}
