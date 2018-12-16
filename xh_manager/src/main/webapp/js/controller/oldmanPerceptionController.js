app.controller("oldmanPerceptionController",function($scope ,$location ,
			$controller, oldmanPerceptionService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.save = function(){
		var id = $location.search()['id'];
		$scope.entity.id = id;
		
		oldmanPerceptionService.add($scope.entity).success(function(response){
			if(response.success==true){
				var message = JSON.parse(response.message);
				alert(message.msg);
				window.location.href = "archive6.html#?id="+message.id;
			}else{
				alert(response.message);
			}
		});
	};
	
	
	
	
});