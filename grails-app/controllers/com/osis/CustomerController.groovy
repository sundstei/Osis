package com.osis

class CustomerController
{
  def index = { }
  def save = {

    def customer = new Customer(params)

    if (!customer.hasErrors() && customer.save()) {
      flash.toUser = "Customer [${customer.name}] has been added."
      //redirect(action: 'create')
      render(view: 'create', model: [customer: customer])
    } else {
      flash.toUser = "Error!!! " + customer.errors.getFieldError().field
      render(view: 'create', model: [customer: customer])
    }
  }

  def create = {
    return [customer: new Customer()]
  }
}
