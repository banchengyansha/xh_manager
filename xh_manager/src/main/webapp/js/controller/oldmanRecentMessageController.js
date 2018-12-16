app.controller("oldmanRecentMessageController",function($scope ,$location ,
			$controller, oldmanRecentMessageService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.save = function(){
		var id = $location.search()['id'];
		$scope.entity.id = id;
		
		var validation = validateForm();
		if(!validation){
			return ;
		}
		
		oldmanRecentMessageService.add($scope.entity).success(function(response){
			if(response.success==true){
				alert("操作成功,请进行下一步");
				window.location.href = "archive7.html#?id="+response.message;
			}else{
				alert(response.message);
			}
		});
	};
	
	
	function validateForm(){
		if(!$scope.entity.senileDementia){
			alert("请选择老年痴呆情况");
			return false;
		}
		if(!$scope.entity.mentalIllness){
			alert("请选择精神疾病情况");
			return false;
		}
		if(!$scope.entity.fallRecently){
			alert("请选择近30天跌倒情况");
			return false;
		}
		if(!$scope.entity.chokingRecently){
			alert("请选择近30天噎食情况");
			return false;
		}
		if(!$scope.entity.lostRecently){
			alert("请选择近30天走失情况");
			return false;
		}
		if(!$scope.entity.commitSuicideRecently){
			alert("请选择近30天自杀情况");
			return false;
		}
		return true;
	}
	
	
	
	
});