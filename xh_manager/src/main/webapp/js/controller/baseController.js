app.controller("baseController",function($scope,baseCodeService,abilityItemService){
	
	$scope.paginationConf = {
		 currentPage: 1, // 当前页数
		 totalItems: 10, // 总记录数
		 itemsPerPage: 10, // 每页显示多少条记录
		 perPageOptions: [10, 20, 30, 40, 50],// 显示多少条下拉列表
		 onChange: function(){ // 当页码、每页显示多少条下拉列表发生变化的时候，自动触发了
			$scope.reloadList();// 重新加载列表
		 }
	}; 
	
	$scope.reloadList = function(){
		$scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
	};
	
	$scope.selectIds = [];
	
	$scope.updateSelection = function($event,id){
		if($event.target.checked){
			$scope.selectIds.push(id);
		}else{
			var idx = $scope.selectIds.indexOf(id);
			$scope.selectIds.splice(idx,1);
		}
		
	};
	
	$scope.searchEntity = {};
	
	
	
	//定义一个对象, 用来记录基础选项数据信息
	$scope.codeTypeMap = {};

	$scope.findBaseCodeList = function(){
		baseCodeService.findBaseCodeList().success(function(response){
			for(var key in response){
				$scope.codeTypeMap[key] = response[key];
			}
		});
	};
	
	$scope.baseCodeList = [];
	
	//查询所有的数据信息
	$scope.findAllBaseCode = function(){
		baseCodeService.findAll().success(function(response){
			for (var i = 0; i < response.length; i++) {
				var bc = response[i];
				$scope.baseCodeList[bc.id] = bc.itemName;
			};
		});
	};
	
	
	
	//定义一个数组存储能力项目数据
	$scope.abilityItemList = [];
	
	$scope.findAbilityItem = function(part){
		abilityItemService.findAllAbilityItemListByPart(part).success(function(response){
			
			$scope.abilityItemList[part] = response;
			
		});
	};
	
	
	$scope.abilityItemOptionList = [];
	$scope.findAllOption = function(){
		abilityItemService.findAllOption().success(function(response){
			for (var i = 0; i < response.length; i++) {
				var option = response[i];
				$scope.abilityItemOptionList[option.id] = option.optionName;
			};
		})
	}
	
	
	
	
	
	
});