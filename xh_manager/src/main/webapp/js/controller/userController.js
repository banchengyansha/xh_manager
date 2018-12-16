app.controller("userController",function($scope , $controller, userService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.clear = function(){
		$scope.entity={};
	};
	
	$scope.save = function(){
		var object;
		if($scope.entity.id != null){
			object = userService.updateUser($scope.entity);
		}else{
			var flag = validateData();
			if(!flag){
				return ;
			}
			object = userService.addUser($scope.entity);
		}
		object.success(function(response){
			if(response.success==true){
				alert(response.message);
				$scope.reloadList();
			}else{
				alert(response.message);
			}
		});
	};
	
	
	function validateData(){
		if($scope.entity.password != $scope.entity.confirmpassword){
			alert('两次密码输入不一致');
			return false;
		}
		delete $scope.entity.confirmpassword;
		return true;
	}
	
	
	$scope.search = function(page,rows){
		userService.search(page,rows,$scope.searchEntity).success(function(response){
			$scope.paginationConf.totalItems = response.total;
			$scope.list = response.rows;
		});
	};
	
	
	$scope.genderView = ['','男','女'];
	
	$scope.findOne = function(id){
		userService.findOne(id).success(function(response){
			$scope.entity = response;
		});
	};
	
	$scope.dele = function(){
		if(confirm("确认删除该数据吗 ?")){
			userService.dele($scope.selectIds).success(function(response){
				if(response.success==true){
					$scope.reloadList();
					$scope.selectIds = [];
				}else{
					alert(response.message);
				}
			});
		}
	};
	
	
	$scope.updatePassword = function(){
		//oldpassword , newpassword , repassword
		if($scope.newpassword != $scope.repassword){
			alert('两次密码输入不一致 , 请重新输入');
			return ;
		}
		
		userService.updatePassword($scope.oldpassword , $scope.newpassword).success(function(response){
			if(response.success==true){
				alert(response.message);
				$scope.oldpassword = '';
				$scope.newpassword = '';
				$scope.repassword = '';
			}else{
				alert(response.message);
			}
		});
	};
	
});