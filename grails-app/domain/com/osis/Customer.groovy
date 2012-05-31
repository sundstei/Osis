package com.osis

class Customer
{
	static constraints = {
		name(nullable: false, maxSize: 140)
		address(nullable: true)
	}

	String name
	String phoneNumber
	Date dateCreated
	Date lastUpdated
	Address address
	CustomerStatus status

	static hasMany = [customerContacts: CustomerContact, addresses: Address, discounts: Discount]
	static mapping = {
		address(lazy: false)
	}
}
