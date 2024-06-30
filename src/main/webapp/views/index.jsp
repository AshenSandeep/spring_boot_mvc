<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="addAlien" method="post">
        Enter Alien id: <input type="text" name="id"><br>
        Enter Alien name: <input type="text" name ="name"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getAlien" method="get">
        Enter the Alien id: <input type="text" name="id"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getAlienByName" method="get">
        Enter the Alien Name: <input type="text" name="name"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getAlienNameByOrder" method="get">
        Enter the Alien Name to get order: <input type="text" name="name"><br>
        <input type="submit">
    </form>
</body>
</html>