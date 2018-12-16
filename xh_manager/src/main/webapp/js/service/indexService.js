app.service("indexService",function($http){
	
	this.login = function(entity){
		return $http.post("../user/login.action",entity);
	};
	
	
	this.showName = function(){
		return $http.get("../user/showName.action");
	};
	
});