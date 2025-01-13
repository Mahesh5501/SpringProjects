<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>
    <head>
        <title>Error</title>
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
        <h1>${message}</h1>
 <!-- Back to Home button -->
 <a href="${pageContext.request.contextPath}/home" class="button">Back to Home</a>
    </body>
    </html>