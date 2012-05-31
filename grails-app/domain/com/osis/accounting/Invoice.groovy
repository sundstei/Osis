package com.osis.accounting

import com.osis.Customer

class Invoice
{
	int invoiceNo
	Customer customer

	static constraints = {
	}

	static hasMany = [invoiceItems: InvoiceItem]
}
