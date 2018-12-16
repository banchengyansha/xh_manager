app.controller("oldmanMentalityController",function($scope ,$location ,
			$controller, oldmanMentalityService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.save = function(){
		var id = $location.search()['id'];
		$scope.entity.id = id;
		
		oldmanMentalityService.add($scope.entity).success(function(response){
			if(response.success==true){
				var message = JSON.parse(response.message);
				alert(message.msg);
				window.location.href = "archive5.html#?id="+message.id;
			}else{
				alert(response.message);
			}
		});
	};
	
	
	
	
});