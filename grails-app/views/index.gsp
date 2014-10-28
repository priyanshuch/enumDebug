<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
  <g:form url="[controller:'user', action:'changeStatus']" name="changeStatus" >
    <h2>Status</h2>
    <input type="radio" name="status" value="REGISTERED">registered<br>
    <input type="radio" name="status" value=NONREGISTERD>nonregistered<br>
    <input type="radio" name="status" value="DUMMY">dummy<br>
    <g:submitButton name="changeStatus" value="Change Status"/>
  </g:form>
</body>
</html>