<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Heroes</title>
    <style type="text/css">
    	#table1 {
    	    border: 1px solid black;
   			border-collapse: collapse;
  			background-color: #ffc;
   		}  		
    </style>
</head>
<body>
    <h2>Heroes</h2>
    <table id="table1">
	<tr>
		<th>Name</th>
		<th>Power</th>
		<th>Skill</th>
		<th>Vitality</th>
	</tr>
	<#list heroes as hero>
	<tbody>
	<tr>
		<td>${hero.name}</td>
		<td>${hero.power}</td>
		<td>${hero.skill}</td>
		<td>${hero.vitality}</td>
	</tr>
	</tbody>
	</#list>
</table>	

</body>
</html>