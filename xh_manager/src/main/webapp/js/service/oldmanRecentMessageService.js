app.service("oldmanRecentMessageService",function($http){
	
	//添加
	this.add = function(entity){
		return $http.post('../oldmanRecentMessage/add.action',entity);
	};
	
	//查询
	this.search = function(page,rows,searchEntity){
		return $http.post('../oldmanRecentMessage/search.action?pageNum='+page+"&pageSize="+rows , searchEntity);
	};
	
	//根据ID查询
	this.findOne=function(id){
		return $http.get("../oldmanRecentMessage/findOne.action?id="+id);
	};
	
	//删除
	this.dele = function(ids){
		return $http.get('../oldmanRecentMessage/delete.action?ids='+ids);
	};
	
	
});