<%
    request.getSession().removeAttribute("user");
    response.sendRedirect(request.getContextPath() + "/home");
%>