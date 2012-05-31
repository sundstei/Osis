<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Testing pages</title>
    <gui:resources components="richEditor, dialog, tabView, autoComplete, toolTip" mode="debug"/>
    <meta name="layout" content="main">
</head>

<body class="yui-skin-sam">

<script>
    var yesHandler = function(o) {
        alert('You clicked "Yes"');
        this.cancel();
    }
</script>

<gui:tabView>
    <gui:tab label="Customer Details" active="true">
        <h1>Customer Details</h1>

        <p/>Here is some more things you can fill out:<br/>
        <gui:toolTip text="This text shows in a tool tip.">
            <gui:autoComplete id="localData" options="['red','blue','yellow','orange','purple']"/>
        </gui:toolTip>

    </gui:tab>
    <gui:tab label="Contacts">
        <h1>Contacts</h2>
        <gui:richEditor id='editor' value="You can use gui components within tabs, too!"/>
    </gui:tab>
</gui:tabView>

</body>

</html>