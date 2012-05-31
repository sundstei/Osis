package com.osis.job

import com.osis.Cost
import com.osis.Resource
import com.osis.User

class JobTemplate
{
	static constraints = {
	}

	String name
	Date dateCreated
	Date dateUpdated
	User createdBy

	static hasMany = [resources: Resource, costs: Cost]

	static belongsTo = [User]

}
