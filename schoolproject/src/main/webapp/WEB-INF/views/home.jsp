<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>
    <head>
        <title>Students List</title>
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

            .button:hover {
                background-color: #45a049
            }

            .button:active {
                background-color: #3e8e41;
                box-shadow: 0 2px #666;
                transform: translateY(2px);
            }
        </style>
    </head>

    <body>
        <h1>${message}</h1>

        <!-- Button 1 - Redirect to URL 1 -->
        <a href="${pageContext.request.contextPath}/studentForm" class="button">Student Form</a>

        <!-- Button 2 - Redirect to URL 2 -->
        <a href="${pageContext.request.contextPath}/teacherForm" class="button">Teacher Form</a>

        
         <a href="${pageContext.request.contextPath}/student-list" class="button">Students List</a>

         <a href="${pageContext.request.contextPath}/teacher-list" class="button">Teachers List</a>

    </body>
    </html>