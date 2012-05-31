<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
  <gui:resources components="richEditor, dialog, tabView, autoComplete, toolTip, datePicker" mode="debug"/>
  <title>Create a Customer </title></head>

<body class="yui-skin-sam">Customer Details :<br/><br/>

<g:form action="save" class="inputform">
  <fieldset>
    Customer ID : <g:textField name="id" value="${customer.id}" size="10"/><br/>
    Customer Name : <g:textField name="name" value="${customer.name}" size=10></g:textField><br/>
    Phone number : <g:textField name="phoneNumber" value="${customer.phoneNumber}" size=20></g:textField><br/>
    Date Created : <gui:datePicker id='simpleDatePicker' name="dateCreated" value="${customer.dateCreated}"/><br/>
    <br/><code>${customer.errors.toString()}</code><br/>

    <g:submitButton name="Save" value="Save"/>
  </fieldset>
</g:form>

</body>

</html>