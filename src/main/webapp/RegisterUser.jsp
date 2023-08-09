<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <style>
        body 
        {
            font-family: 'Arial', sans-serif;
            background-color: #f2f2f2;
            margin: 0;

            display: flex;

            justify-content: center;

            align-items: center;
            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.4)), url("https://img.freepik.com/free-vector/registration-form-template-with-flat-design_23-2147971970.jpg?w=2000");
            background-size: cover;
            min-height: 100vh;
        }
        .intro {

            background-color:rgba(255, 255, 255, 0.2);
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 40px;
            width: 800px;
            text-align: center;

        }

 .container
 {
	 background-color: rgba(255, 255, 255, 0.4);

            border-radius: 10px;

            box-shadow: 0 4px 8px rgb(0, 0, 0);

            padding: 30px;

            width: 93%;

            text-align: center;
 }

        h1 {
              
            color: #333333;

            font-size: 24px;

            margin-bottom: 20px;

        }

 

        form {

            text-align: left;

        }

 

        label {

            font-weight: bold;

            display: block;

            margin-bottom: 5px;

            color: #555555;

        }

 

        input[type="text"] {

            width: 100%;

            padding: 10px;

            margin-bottom: 15px;

            border: 1px solid rgba(255, 255, 255, 0.4);

            border-radius: 5px;
           
            font-size: 16px;

            color: #333333;

        }
        input[type="password"] {

            width: 100%;

            padding: 10px;

            margin-bottom: 15px;

            border: 1px solid rgba(255, 255, 255, 0.4);

            border-radius: 5px;
           
            font-size: 16px;

            color: #333333;

        }

 

        input[type="submit"] {

            background-color: #007bff;

            color: #ffffff;

            border: none;

            padding: 10px 20px;

            border-radius: 5px;

            cursor: pointer;

            font-size: 16px;

            transition: background-color 0.3s ease;

        }

 

        input[type="submit"]:hover {

            background-color: #0056b3;

        }

    </style>

</head>

<body>

    <div class="intro">

        <h1 class="container">Registration Page</h1>

        <form action="Reg" method="post">

            <label for="uid">User ID</label>

            <input type="text" id="uid" name="uid">

            <label for="name">User Name</label>

            <input type="text" id="uname" name="uname">

            <label for="pwd">Password</label>

            <input type="password" id="pwd" name="pwd">

            <label for="addr">Address</label>

            <input type="text" id="addr" name="addr">

            <label for="phone">Phone</label>

            <input type="text" id="phone" name="phone">

            

            <label for="email">Email</label>

            <input type="text" id="email" name="email">

           

           

            <input type="submit" value="Register">

        </form>

    </div>

</body>

</html>