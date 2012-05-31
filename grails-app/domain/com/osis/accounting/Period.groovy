package com.osis.accounting

import com.osis.User

class Period
{

	static constraints = {
	}

	String periodName
	int year
	int month
	Date createdDate
	Date modifiedDate
	User createdBy
	User modifiedBy

}
