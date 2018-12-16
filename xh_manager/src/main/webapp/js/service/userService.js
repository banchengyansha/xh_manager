app.service("userService",function($http){
	
	//添加用户
	this.addUser = function(entity){
		return $http.post('../user/addUser.action',entity);
	};
	
	//查询用户列表
	this.search = function(page,rows,searchEntity){
		return $http.post('../user/search.action?pageNum='+page+"&pageSize="+rows , searchEntity);
	};
	
	//根据ID查询用户
	this.findOne=function(id){
		return $http.get("../user/findOne.action?id="+id);
	};
	
	
	//修改用户
	this.updateUser = function(entity){
		return $http.post('../user/updateUser.action',entity);
	};
	
	//删除用户
	this.dele = function(ids){
		return $http.get('../user/delete.action?ids='+ids);
	};
	
	this.updatePassword = function(oldpassword , newpassword){
		return $http.get('../user/updatePassword.action?oldpassword='+oldpassword+"&newpassword="+newpassword);
	};
	
});