app.controller("oldmanLivingMessageController",function($scope ,$location ,
			$controller, oldmanLivingMessageService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.save = function(){
		var id = $location.search()['id'];
		$scope.entity.id = id;
		
		oldmanLivingMessageService.add($scope.entity).success(function(response){
			if(response.success==true){
				var message = JSON.parse(response.message);
				alert(message.msg);
				window.location.href = "archive4.html#?id="+message.id;
			}else{
				alert(response.message);
			}
		});
	};
	
	
	
	
});