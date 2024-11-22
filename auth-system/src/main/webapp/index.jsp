<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<!DOCTYPE html>
<html>

<head>
    <title>FocusFlow - Your Personal Productivity Assistant</title>
    <link rel="stylesheet" href="/demo/css/style.css">
</head>

<body>

<%-- 
    <style>
        /* General Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        header {
            background-color: rgba(0, 0, 0, 0.726);
            color: greenyellow;
            font-size: 1.5rem;
            padding: 10px;
            text-align: center;
        }

        .btns ul {
            display: flex;
            gap: 1.7rem;
            justify-content: center;
            margin-top: 1.5rem;
            color: green;

            & .login {
                color: white !important;
                background-color: green;
            }
        }

        .btns ul li {
            border: 2px solid green;
            padding: .5rem 1.2rem;
            border-radius: 8px;
            list-style: none;




        }

        .btns ul li a {
            color: green;
            text-decoration: none;
        }

        main {
            text-align: center;
            height: 86vh;
            position: relative;
            /* margin: auto; */
        }

        .welcome-container {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            width: 100%;

            & h1 {
                font-size: 3rem;
            }
        }

        footer {
            background-color: greenyellow;
            bottom: 0;
            padding: .48rem;
            text-align: center;
        }
    </style> --%>

    <header>
        Login-Signup Portal
    </header>

    <main>
        <div class="container">
            <h1>You are most Welcome</h1>
            <p>Your portal to a personalized experience. Please log in or sign up to continue.</p>
            <div class="btns">
                <ul>
                    <li class="login"><a href="login.html" class="login">Login</a></li>
                    <li><a href="signup.html">Sign Up</a></li>
                </ul>
            </div>
        </div>
    </main>

    <footer>
        <p>&copy; 2024 Dharmander Yadav</p>
    </footer>
</body>

</html>