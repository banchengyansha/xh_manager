app.controller("indexController",function($scope, indexService , $interval){
	
	$scope.login = function(){
		indexService.login($scope.entity).success(function(response){
			if(response.success){
				window.location.href="admin/index.html";
			}else{
				alert(response.message);
			}
		});
	};
	
	$scope.showName = function(){
		indexService.showName().success(function(response){
			$scope.loginName = response.username;
		});
	};
	
});