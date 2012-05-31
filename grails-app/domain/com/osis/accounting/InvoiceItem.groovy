package com.osis.accounting

import com.osis.Resource
import com.osis.User

class InvoiceItem
{

	static constraints = {
	}

	User addedBy
	Date createDate
	Date updatedDate
	Resource resource
	Date addedDate
	Invoice invoice

	static belongsTo = [Invoice]

}
