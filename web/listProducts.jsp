<%-- 
    Document   : listproducts
    Created on : Mar 8, 2020, 10:40:52 PM
    Author     : amt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css" type="text/css"/>
        <title>products</title>
    </head>
    <body>
        <h1>Products</h1>
        <table>
            <tr>
                <th>ProductId</th>
                <th>Product Code</th>
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Product Price</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td><c:out value="${product.productId}"/></td>
                    <td><c:out value="${product.code}"/></td>
                    <td><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.description}"/></td>
                    <td><c:out value="${product.price}"/></td>
                    <td><form action="cart" method="post">
                            <input type="hidden" name="productCode" value="${product.code}">
                            <input type="submit" value="Add To Cart">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

