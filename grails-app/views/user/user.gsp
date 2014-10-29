<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>USER</title>
</head>
<body>

<br/><br/>

  <g:form url="[controller:'user', action:'changeStatus']" name="changeStatus" >
  
    <lable for="Status">  Status:   </lable>    <g:textField    name="status"/>   <br/>
    <g:submitButton name="changeStatus" value="Change Status"/>
    
  </g:form>
</body>
</html>