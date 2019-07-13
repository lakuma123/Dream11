<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST"
          action="/deviceRegister" modelAttribute="device"  >
             <table>
                <tr>
                   <td>Name:</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                   <td>Owner:</td>
                    <td><form:input path="owner"/></td>
                </tr>
           <%--      <tr>
                    <td><form:label path="contactNumber">
                      Contact Number</form:label></td>
                    <td><form:input path="contactNumber"/></td>
                </tr>
                <tr> --%>
                
              <tr>
                    <td>Device Types:</td>
                    <td><form:select multiple="true" path="deviceType" items="${deviceTypes.name}" /></td>
                </tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>