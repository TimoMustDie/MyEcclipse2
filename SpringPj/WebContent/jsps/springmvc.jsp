<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
 <%@ taglib prefix="c" uri=http://java.sun.com/jsp/jstl/core %>
<%@ taglib prefix="fmt" uri=http://java.sun.com/jsp/jstl/fmt %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>
	<form action="/query.action"
	method="post">
	��ѯ����:
	<table width="100%" border=1>
		<tr>
			<td><input type="submit" value="��ѯ"/>
		</tr>
	</table>
	��Ʒ�б�:
	<table width="100%" border=1>
		<tr>
			<td>��Ʒ����</td>
			<td>��Ʒ�۸�</td>
			<td>��������</td>
			<td>��Ʒ����</td>
			<td>����</td>
		</tr>
		
	</table>
	<c:forEach items="${itemsList }" var="item">
                <tr>
                    <td>${item.name }</td>
                    <td>${item.price }</td>
                    <td><fmt:formatDate value="${item.createtime}"
                            pattern="yyyy-MM-dd HH:mm:ss" /></td>
                    <td>${item.detail }</td>

                    <td><a
                        href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">�޸�</a></td>

                </tr>
            </c:forEach>

	
	</form>
</body>
</html>