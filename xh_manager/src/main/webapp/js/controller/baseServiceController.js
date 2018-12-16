app.controller("baseServiceController",function($scope, baseServiceService , baseCodeService){
	
	$scope.findBaseServiceList = function(){
		baseServiceService.findBaseServiceList().success(function(response){
			
			$scope.baseServiceMap = response;
			
		});
	};
	
	$scope.findBaseCodeByTypeCode = function(typeCode){
		baseCodeService.findBaseCodeByTypeCode(typeCode).success(function(response){
			
			$scope.frequencyList = response;
			
		});
	};
	
});