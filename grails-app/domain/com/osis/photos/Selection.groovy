package com.osis.photos

import com.osis.CustomerContact
import com.osis.User

class Selection
{
	static constraints = {
	}

	String name
	Date createdDate
	Date updatedDate
	CustomerContact contact
	User doneBy
	String source // Web or manual etc

}
