<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Teacher Submission Success</title>
</head>
<style>
    .button {
        display: inline-block;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        text-align: center;
        text-decoration: none;
        outline: none;
        color: #fff;
        background-color: #4CAF50;
        border: none;
        border-radius: 5px;
        box-shadow: 0 4px #999;
    }
    .button:hover {background-color: #45a049}
    .button:active {
        background-color: #3e8e41;
        box-shadow: 0 2px #666;
        transform: translateY(2px);
    }
</style>

<body>
    <h2>Teacher Information Submitted Successfully!</h2>
    
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Subject</th>
        </tr>
            <tr>
                <td>${teacher.name}</td>
                <td>${teacher.email}</td>
                <td>${teacher.subject}</td>
            </tr>

    </table>

     <!-- Back to Home button -->
     <a href="${pageContext.request.contextPath}/home" class="button">Back to Home</a>
     
</body>
</html>
