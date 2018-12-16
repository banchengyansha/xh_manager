app.controller("abilityItemController",function($scope, abilityItemService){

	//定义一个数组存储能力项目数据
	$scope.abilityItemList = [];
	
	$scope.findAbilityItem = function(part){
		abilityItemService.findAllAbilityItemListByPart(part).success(function(response){
			
			$scope.abilityItemList[part] = response;
			
		});
	};
});