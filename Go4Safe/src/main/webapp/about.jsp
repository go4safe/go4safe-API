<!DOCTYPE html>
<html lang="en">
<head>
 
  <title>Go4Safe</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;     
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
    
/* Three columns side by side */
.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

/* Display the columns below each other instead of side by side on small screens */
@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}

/* Add some shadows to create a card effect */
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
}

/* Some left and right padding inside the container */
.container {
  padding: 0 16px;
}

/* Clear floats */
.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 50%;
}

.button:hover {
  background-color: #555;
}
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><img src="images/logo.png"  height="42" width="42" style="width: 42px;height: 33;height: 32px;"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar" >
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="about.jsp">About</a></li>        
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Report an Incident</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="row">
  <div class="column">
    <div class="card">
      <img src="vivek.png" alt="Jane" style="width:50%">
      <div class="container">
        <h2>Vivek Kumar</h2>
        <p class="title">CEO &amp; Founder &amp; Designer</p>
        <p>He is working in JAVA since 2016.</p>
        <p>Vivek.Kumar@go4safe.com</p>
        <!-- <p><button class="button">Contact</button></p> --> 
      </div>
    </div>
  </div>  

  <div class="column">
    <div class="card">
      <img src="abdul.png" alt="John" style="width:50%">
      <div class="container">
        <h2>Abdul Badi</h2>
        <p class="title">Tester</p>
        <p>He is working as lead tester since 2014.</p>
        <p>Abdul.Badi@go4safe.com</p>
        <!--  <p><button class="button">Contact</button></p> -->
      </div>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Go4Safe</p>
   <p>Design and developed by Vivek Kumar</p>
   <p>Tested by Abdul Badi</p>
</footer>

</body>
</html>

