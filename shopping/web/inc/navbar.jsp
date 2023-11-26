<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="truonghh.utils.API"%>
<!-- navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href><img src="./assets/icon/logo.png" height="70" width="65" /></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin: 0 auto">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="margin: 0 auto">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="home">Home</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Category
                    </a>

                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <c:forEach items="${lstCategory}" var="category">
                            <li>
                                <a class="dropdown-item" href="./home?id_category=${category.id}">${category.name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>
                <c:if test="${user == null}">
                    <li class="nav-item">
                        <a class="nav-link" href="login">Login</a>
                    </li>
                </c:if>
                <c:if test="${user != null}">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Hi, 
                            <c:set var="s" value="${user.getName()}"></c:set>
                            <%
                                String name = (String)pageContext.getAttribute("s");
                                out.print(API.getName(name));
                            %>
                        </a>

                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li>
                                <a class="dropdown-item" href="./views/profile.jsp">Profile</a>
                                <a class="dropdown-item" href="./views/logout.jsp">Log out</a>
                            </li>
                        </ul>
                    </li>
                </c:if>
                <li class="nav-item">
                    <a href="./views/cart.jsp" target="_self" style="text-decoration: none">
                        <img src="./assets/icon/cart.png" height="25px" width="25px">
                        <i style="color: #000">0</i>
                    </a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<!-- navbar -->