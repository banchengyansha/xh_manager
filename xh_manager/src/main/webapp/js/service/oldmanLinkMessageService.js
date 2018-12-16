app.service("oldmanLinkMessageService",function($http){
	
	//添加
	this.add = function(entity){
		return $http.post('../oldmanLinkMessage/add.action',entity);
	};
	
	//查询
	this.search = function(page,rows,searchEntity){
		return $http.post('../oldmanLinkMessage/search.action?pageNum='+page+"&pageSize="+rows , searchEntity);
	};
	
	//根据ID查询
	this.findOne=function(id){
		return $http.get("../oldmanLinkMessage/findOne.action?id="+id);
	};
	
	//删除
	this.dele = function(ids){
		return $http.get('../oldmanLinkMessage/delete.action?ids='+ids);
	};
	
	
});