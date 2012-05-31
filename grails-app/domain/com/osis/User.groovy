package com.osis

import com.osis.job.Job

class User
{
	static constraints = {
	}

	String userName
	String firstName
	String lastName
	String password

	static hasMany = [jobs: Job, customers: Customer]
}
