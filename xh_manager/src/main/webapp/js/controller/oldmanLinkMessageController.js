app.controller("oldmanLinkMessageController",function($scope ,$location , $controller, oldmanLinkMessageService , baseCodeService){
	
	$controller('baseController',{$scope:$scope});
	
	$scope.save = function(){
		var id = $location.search()['id'];
		$scope.entity.id = id;
		
		var validation = validateForm();
		if(!validation){
			return ;
		}
		
		oldmanLinkMessageService.add($scope.entity).success(function(response){
			if(response.success==true){
				alert("操作成功,请进行下一步");
				window.location.href = "archive3.html#?id="+response.message;
			}else{
				alert(response.message);
			}
		});
	};
	
	
	
	
	
	function validateForm(){
		if(!$scope.entity.providerName){
			alert("请输入信息提供者姓名");
			return false;
		}
		if(!$scope.entity.providerRelation){
			alert("请输入信息提供者与老人关系");
			return false;
		}
		if(!$scope.entity.linkman1Name){
			alert("请输入第一联系人姓名");
			return false;
		}
		if(!$scope.entity.linkman1Phone){
			alert("请输入第一联系人手机");
			return false;
		}
		
		if(!$scope.entity.evaluateName){
			alert("请输入评估员姓名");
			return false;
		}
		/*if(!$scope.entity.evaluateGroup){
			alert("请输入评估员所属机构");
			return false;
		}*/
		if(!$scope.entity.evaluatePhone){
			alert("请输入评估员电话");
			return false;
		}
		return true;
	}
	
	
	
});