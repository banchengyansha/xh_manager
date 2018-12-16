app.service("oldmanMessageService",function($http){
	
	//添加
	this.add = function(entity){
		return $http.post('../oldmanMessage/add.action',entity);
	};
	
	//添加
	this.update = function(entity){
		return $http.post('../oldmanMessage/update.action',entity);
	};
	
	//查询
	this.search = function(page,rows,searchEntity){
		return $http.post('../oldmanMessage/search.action?pageNum='+page+"&pageSize="+rows , searchEntity);
	};
	
	//根据ID查询
	this.findOne=function(id){
		return $http.get("../oldmanMessage/findOne.action?id="+id);
	};
	
	//删除
	this.dele = function(ids){
		return $http.get('../oldmanMessage/delete.action?ids='+ids);
	};
	
	
	//确认结果
	this.confirmResult = function(id){
		return $http.get('../oldmanMessage/confirmResult.action?id='+id);
	}
	
	//下载结果
	this.downloadResult = function(id){
		return window.location.href = '../oldmanMessage/downloadResult.action?id='+id;
	}
	
	
	//导出数据
	this.exportData = function(searchEntity){
		var param = "";
		for(var key in searchEntity){
			param +="&"+key+"="+searchEntity[key];
		}
		param = param.substr(1,param.length);
		return window.location.href = '../oldmanMessage/exportDataList.action?'+param;	
	}
	
	//导出评估详细数据
	this.downloadDetailResult = function(id){
		return window.location.href = '../oldmanMessage/downloadDetailResult.action?id='+id;
	}
	
	
	//进入评估结果页面 , 下载评估结果
	this.downloadMessageResult = function(id){
		window.location.href="result_confirm.html#?id="+id;
	}
	
	
	
	//导出评估详情的模板Excel
	this.exportTemplate = function(id){
		return window.location.href = '../oldmanMessage/downloadTemplate.action';
	}
	
	this.findOneBaseMessage = function(id){
		return $http.get('../oldmanMessage/findOneBaseMessage.action?id='+id);
	}
	
	
});