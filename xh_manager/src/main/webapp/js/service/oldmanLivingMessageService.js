app.service("oldmanLivingMessageService",function($http){
	
	//添加
	this.add = function(entity){
		return $http.post('../oldmanLivingMessage/add.action',entity);
	};
	
	//查询
	this.search = function(page,rows,searchEntity){
		return $http.post('../oldmanLivingMessage/search.action?pageNum='+page+"&pageSize="+rows , searchEntity);
	};
	
	//根据ID查询
	this.findOne=function(id){
		return $http.get("../oldmanLivingMessage/findOne.action?id="+id);
	};
	
	//删除
	this.dele = function(ids){
		return $http.get('../oldmanLivingMessage/delete.action?ids='+ids);
	};
	
	
});