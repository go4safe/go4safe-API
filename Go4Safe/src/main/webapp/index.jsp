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
        <li class="active"><a href="#">Home</a></li>
        <li><a href="about.jsp">About</a></li>        
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Report an Incident</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
     <!--  <p><a href="#">Report an Incident</a></p> -->
     
    </div> 
    <div class="col-sm-8 text-left"> 
      <h1 align="center">Welcome</h1>
      <p align="center">To make the world more safer by helping other.</p>
      <p>Report an incident if you lost something like your loved once, Dog, Car, Bike or Mobile to this portal. And provide your contact details and if founded by someone they inform you.</p>
      <p>You may announce some reward to get your things back.</p>
      <hr>
      
    </div>
   <div class="col-sm-2 sidenav">
      <div class="well">
        <!-- <p>ADS</p> -->
      </div>
      <div class="well">
        <!-- <p>ADS</p> -->
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

