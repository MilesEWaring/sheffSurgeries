<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Sheffield Surgeries | Home Page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<style>
		html {
		 	height: 100%;
		}
		body {
			height: 100%;
		  	width: 100%;
		}
		.Header{
			background-color: #0085c3;
			height: 140px;

		}

	    body #WelcomeMessage{
			text-align: left;
			margin-left: 3.5%;
			padding-top: 35px;
			color: white;
		}

		#AddressAndTel{
			text-align: left;
			margin-left: 3.5%;
			color: white;
		}
		.Header #LogoutButton{
			position: absolute; 
			right: 15%; 
			border: 0;
			top:25px;
		}
		#bannerRightImg{
			position: absolute; 
			top: 0; 
			right: 0; 
			border: 0;
			width: 10%;
			height: 140px;
		}
		.nav{
			background-color: black;			
		}
		.nav.nav a{

			color: white;
		}
		.nav.nav a:hover{
			background-color: white;
			color:black;
		}
		.carousel-inner .carousel-item {
		  height: 175px;
		}

		.item img {
		    position: absolute;
		    top: 0;
		    left: 0;
		    height: 175px;
		}
		.AboutUs h3{
			padding-top: 1%;
			text-align: center;

		}

		.AboutUs{
			margin-left: 25%;
			margin-right: 25%;
			text-align: center;
			font-size: 12px;
		}
	</style>

</head>
<body>
	<div class = "Header">
		<h1 id="WelcomeMessage">Welcome To Sheffield Surgeries</h1>
		<h6 id = "AddressAndTel">Sheffield Surgeries, 5 Lawson Rd, Sheffield S10 5BU<br>Tel: 01212 82258225 </h6>
		<a id="LogoutButton" href="Login.html"><img src="img/Logout.png" width="100"></a>
		<asset:image src="img/BannerRight.png" id="bannerRightImg"/>
	</div>
	<nav class="nav nav-pills flex-column flex-sm-row">
	  <a class="flex-sm-fill text-sm-center nav-link active" href="#">Home</a>
	  <a class="flex-sm-fill text-sm-center nav-link" g:link controller="surgery" action="create"> Add Surgeries</a>
	  <a class="flex-sm-fill text-sm-center nav-link" href="#"> Doctors</a>
	  <a class="flex-sm-fill text-sm-center nav-link" href="#"> Nurses</a>
	  <a class="flex-sm-fill text-sm-center nav-link" href="#"> Patients</a>
	  <a class="flex-sm-fill text-sm-center nav-link" href="#"> Prescriptions</a>
	  <a class="flex-sm-fill text-sm-center nav-link" href="#"> Appointments</a>
	  <a class="flex-sm-fill text-sm-center nav-link" href="#"> Receptionists</a>
	</nav>
	<div class="BannerCarousel">
		<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <asset:image src="img/slide1.jpg"/> class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <asset:image src="img/slide2.jpg"/> class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <asset:image src="img/slide3.jpg"/> class="d-block w-100" alt="...">
		    </div>
		  </div>
			<a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<div class="MainBody">
		<div class="AboutUs">
			<h3 class = "display-3">About Us</h3>
			<p id="AboutUSparagraph">
				<em>Our aim is to provide a comprehensive, friendly and professional service for all our patients.<br><br>

				In addition to our regular doctors and three practice nurses, we are able to offer the services of a practice based Counsellor, Health Visitor and District Nursing Team. In addition, a physiotherapist can be seen privately.<br><br>

				The surgery is located in the heart of Yatton Keynell next to the school, housed in a single storey building with wheelchair access and car parking.

				You are welcome to register with us if you live within Yatton Keynell or the surrounding villages. Generally we do not accept patients living within Chippenham or Corsham. <br><br>

				Please contact us if you are unsure about your eligibility to register and we will be happy to advise. If you are a temporary resident within the area and wish to register, please contact reception.</em></p>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>

<asset:image src="SHEFFSURGERIESBANNER.jpg"/>









