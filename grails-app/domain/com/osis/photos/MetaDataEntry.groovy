package com.osis.photos

class MetaDataEntry
{

	static constraints = {
	}

	Date createdDate
	Date updatedDate

	String fieldName
	String fieldValue

	static belongsTo = [MetaData]

}
