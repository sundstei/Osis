package com.osis

class CustomerContact
{

	static constraints = {
		firstName(nullable: false)
		email(nullable: true, email: true)
	}

	String firstName
	String lastName
	PersonSalutation salutation
	String email

	Login logon

	Address address

	static hasMany = [numbers: String]

	static mapping = { address lazy: false }
}
