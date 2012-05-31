package com.osis.job

import com.osis.accounting.Invoice
import com.osis.accounting.Payment
import com.osis.photos.Photo
import com.osis.photos.Selection
import com.osis.*

class Job
{
	static constraints = {
	}

	String name
	Customer customer
	CustomerContact contact
	Date dateCreated
	Date dateUpdated
	Date startDate
	Date endDate
	JobStatus status
	Location location

	static hasMany = [
			resources: Resource,
			costs: Cost,
			invoices: Invoice,
			payments: Payment,
			photos: Photo,
			deliveries: Delivery,
			selections: Selection,
			shoots: Shoot,
			locations: Location]

	static belongsTo = [Customer]
}
