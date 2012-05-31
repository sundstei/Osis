package com.osis

import grails.test.*

class CustomerTests extends GrailsUnitTestCase
{
  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  void saveCustomerToDb() {

    def customer = new Customer();
    customer.id = 100;
    customer.first

  }
}
