package com.osis

class LoginController
{
  def index = { }
  def login = { redirect(controller:"login",action:"index")}
}
