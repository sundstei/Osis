package com.osis

import com.osis.job.Job

class Delivery
{

	Date createdDate
	Date updatedDate

	static belongsTo = [Job]

	static constraints = {
	}
}
