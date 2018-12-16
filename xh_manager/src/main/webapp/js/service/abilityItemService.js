app.service("abilityItemService",function($http){
	
	//根据传递的模块儿id , 查询所有的基础选项数据
	this.findAllAbilityItemListByPart = function(part){
		return $http.get('../abilityItem/findAllAbilityItemListByPart.action?part='+part);
	};
	
	
	
	//查询所有的基础选项数据
	this.findAllOption = function(){
		return $http.get('../abilityItem/findAllOption.action');
	};
	
});