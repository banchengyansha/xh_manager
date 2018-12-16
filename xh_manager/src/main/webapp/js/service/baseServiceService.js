app.service("baseServiceService",function($http){
	
	//查询所有的基础选项数据
	this.findBaseServiceList = function(){
		return $http.get('../baseService/findAllBaseService.action');
	};
	
	
});