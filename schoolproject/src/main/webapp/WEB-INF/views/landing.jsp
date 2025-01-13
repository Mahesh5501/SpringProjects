<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Landing Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .container h2 {
            margin: 0 0 20px;
        }
        .container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .container button {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 4px;
            background-color: #007bff;
            color: white;
            font-size: 16px;
        }
        .container button:hover {
            background-color: #0056b3;
        }
        .container a {
            display: block;
            text-align: center;
            margin-top: 10px;
            color: #007bff;
            text-decoration: none;
        }
        .container a:hover {
            text-decoration: underline;
        }
        .error-message {
            color: red;
            margin-bottom: 10px;
        }
        .form-section {
            display: none;
        }
        .form-section.active {
            display: block;
        }
    </style>
    <script>
        function showSection(sectionId) {
            document.querySelectorAll('.form-section').forEach(function(section) {
                section.classList.remove('active');
            });
            document.getElementById(sectionId).classList.add('active');
        }
    </script>
</head>
<body>
    <div class="container">
        <h2>Welcome</h2>
        
        <!-- Error message -->
        <c:if test="${not empty errorMessage}">
            <div class="error-message">${errorMessage}</div>
        </c:if>

        <!-- Navigation Links -->
        <button onclick="showSection('login-form')">Login</button>
        <button onclick="showSection('register-form')">Register</button>
        <button onclick="showSection('forgot-password-form')">Forgot Password</button>

        <!-- Login Form -->
        <div id="login-form" class="form-section active">
            <h2>Login</h2>
            <form action="${pageContext.request.contextPath}/login" method="post">
                <input type="text" name="username" placeholder="Username" required>
                <input type="text" name="password" placeholder="Password" required>
                <button type="submit">Login</button>
            </form>
        </div>

        <!-- Register Form -->
        <div id="register-form" class="form-section">
            <h2>Register</h2>
            <form action="${pageContext.request.contextPath}/register" method="post">
                <input type="text" name="username" placeholder="Username" required>
                <input type="text" name="password" placeholder="Password" required>
                <input type="text" name="confirmPassword" placeholder="Confirm Password" required>
                <button type="submit">Register</button>
            </form>
        </div>

        <!-- Forgot Password Form -->
        <div id="forgot-password-form" class="form-section">
            <h2>Forgot Password</h2>
            <form action="${pageContext.request.contextPath}/forgot-password" method="post">
                <input type="text" name="email" placeholder="Email" required>
                <button type="submit">Submit</button>
            </form>
        </div>
    </div>

     <!-- Back to Home button -->
     <a href="${pageContext.request.contextPath}/home" class="button">Go to Home</a>
</body>
</html>
