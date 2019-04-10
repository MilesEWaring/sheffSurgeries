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
	</style>

</head>
<body>
	
	<div class = "Header">
		<h1 id="WelcomeMessage">Welcome To Sheffield Surgeries</h1>
		<h6 id = "AddressAndTel">Sheffield Surgeries, 5 Lawson Rd, Sheffield S10 5BU<br>Tel: 01212 82258225 </h6>
	</div>
	<nav class="nav nav-pills flex-column flex-sm-row">
	  <a class="flex-sm-fill text-sm-center nav-link active" href="#">Home</a>
	  <a class="flex-sm-fill text-sm-center nav-link"><g:link controller="Prescription" action="create">Create Prescription</g:link></a>
	  <a class="flex-sm-fill text-sm-center nav-link"><g:link controller="Prescription" action="show">Show Prescription</g:link></a>
	  <a class="flex-sm-fill text-sm-center nav-link"><g:link controller="Patient" action="show">Show Patient</g:link></a>
	  <a class="flex-sm-fill text-sm-center nav-link"><g:link controller="Appointment" action="show">Show Appointment</g:link> </a>
	</nav>
	<div class="BannerCarousel">
		<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <asset:image src="img/slide1.jpg" class="d-block w-100" alt="..."/>
		    </div>
		    <div class="carousel-item">
		      <asset:image src="img/slide2.jpg" class="d-block w-100" alt="..."/>
		    </div>
		    <div class="carousel-item">
		      <asset:image src="img/slide3.jpg" class="d-block w-100" alt="..."/>
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
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</body>
</html>











