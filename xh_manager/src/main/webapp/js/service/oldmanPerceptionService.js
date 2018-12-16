app.service("oldmanPerceptionService",function($http){
	
	//添加
	this.add = function(entity){
		return $http.post('../oldmanPerception/add.action',entity);
	};
	
	//查询
	this.search = function(page,rows,searchEntity){
		return $http.post('../oldmanPerception/search.action?pageNum='+page+"&pageSize="+rows , searchEntity);
	};
	
	//根据ID查询
	this.findOne=function(id){
		return $http.get("../oldmanPerception/findOne.action?id="+id);
	};
	
	//删除
	this.dele = function(ids){
		return $http.get('../oldmanPerception/delete.action?ids='+ids);
	};
	
	
});