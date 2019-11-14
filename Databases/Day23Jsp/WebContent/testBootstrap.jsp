<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" 
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

<!-- jQuery library -->
<script 
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script 
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.css"></script>

<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
	<div class="container">
		<h1>Bootstrap Demo</h1>
		<ul class="nav nav-tabs" id="myTab" role="tablist">
			<li class="nav-item">
	    	<a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Home</a>
	  		</li>
	  		<li class="nav-item">
	   		<a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Profile</a>
	 		</li>
	  		<li class="nav-item">
	    	<a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Contact</a>
	  		</li>
		</ul>
	<div class="tab-content" id="myTabContent">
	  <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">Content for Home</div>
	  <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">...</div>
	  <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">...</div>
	</div>
	
	</div>
</body>
</html>