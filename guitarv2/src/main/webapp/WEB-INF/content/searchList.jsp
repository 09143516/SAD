<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>查询结果</title>
</head>
<body>
    <table border="0">
        <thead>
            <tr>
                <td>serialNumber</td>
                <td>price</td>
                <td>builder</td>
                <td>model</td>
                <td>type</td>
                <td>backWood</td>
                <td>topWood</td>
            </tr>
        </thead>
        <tbody>
        	<tr>
	            <td>${application.guitar.serialNumber}</td>
	            <td>${application.guitar.price}</td>
	            <td>${application.guitar.builder}</td>
	            <td>${application.guitar.model}</td>
	            <td>${application.guitar.type}</td>
	            <td>${application.guitar.backWood}</td>
	            <td>${application.guitar.topWood}</td>
            </tr>
        </tbody>
    </table>
</body>