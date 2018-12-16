app.service("baseCodeService",function($http){
	
	//查询所有的基础选项数据
	this.findBaseCodeList = function(){
		return $http.get('../baseCode/findAllBaseCodeList.action');
	};
	
	//查询所有的基础选项数据
	this.findBaseCodeByTypeCode = function(typeCode){
		return $http.get('../baseCode/findBaseCodeByTypeCode.action?typeCode='+typeCode);
	};
	
	//查询所有
	this.findAll = function(){
		return $http.get('../baseCode/findAll.action');
	};
	
});