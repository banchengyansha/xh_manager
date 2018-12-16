app.controller("oldmanSocialParticipationController",function($scope ,$location ,
			$controller, oldmanSocialParticipationService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.save = function(){
		var id = $location.search()['id'];
		$scope.entity.id = id;
		
		oldmanSocialParticipationService.add($scope.entity).success(function(response){
			if(response.success==true){
				var message = JSON.parse(response.message);
				alert(message.msg);
				window.location.href = "archive2.html#?id="+message.id;
			}else{
				alert(response.message);
			}
		});
	};
	
	
	
	
});