<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Heroes</title>
    <style type="text/css">
    	#tabela {
    	    border: 1px solid black;
   			border-collapse: collapse;
  			background-color: #ffc;
   		}  		
    </style>
</head>
<body>
    <h2>Heroes</h2>
    <table id="tabela">
	<tr>
		<td>Name</td>
		<td>Power</td>
		<td>Skill</td>
		<td>Vitality</td>
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