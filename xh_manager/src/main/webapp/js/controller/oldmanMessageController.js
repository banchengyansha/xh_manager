app.controller("oldmanMessageController",function($scope ,$location ,  $controller, oldmanMessageService , baseCodeService){
	
	$controller('baseController',{$scope:$scope});
	
	
	$scope.save = function(){
		var validation = validateForm();
		if(!validation){
			return ;
		}
		
		var operateObj = null;
		var id = $location.search()['id'];
		
		//如果ID 有值, 说明执行的是修改操作 ; 如果ID 没值, 则说明执行的是添加操作.
		if(id){
			operateObj = oldmanMessageService.update($scope.entity);
		}else{
			operateObj = oldmanMessageService.add($scope.entity);
		}
		
		operateObj.success(function(response){
			if(response.success==true){
				if(id){
					alert("操作成功");
					window.location.href = "messagelist.html";
				}else{
					alert("操作成功,请进行下一步");
					window.location.href = "archive1.html#?id="+response.message;
				}
			}else{
				alert(response.message);
			}
		});
	};
	
	function validateForm(){
		if(!$scope.entity.name){
			alert("请输入姓名");
			return false;
		}
		if(!$scope.entity.idCart){
			alert("请输入合法有效的身份证号");
			return false;
		}
		if(!$scope.entity.gender){
			alert("请输入性别");
			return false;
		}
		if(!$scope.entity.birthday){
			alert("请输入出生日期");
			return false;
		}
		if(!$scope.entity.nation){
			alert("请输入民族");
			return false;
		}
		if(!$scope.entity.livingAddress){
			alert("请输入居住地址");
			return false;
		}
		if(!$scope.entity.maritalStatus){
			alert("请选择婚姻状况");
			return false;
		}
		if(!$scope.entity.cultureDegree){
			alert("请选择文化程度");
			return false;
		}
		if(!$scope.entity.belief){
			alert("请选择宗教信仰");
			return false;
		}
		if(!$scope.entity.livingCondition){
			alert("请选择居住情况");
			return false;
		}
		if(!$scope.entity.economicSource){
			alert("请选择经济来源");
			return false;
		}
		if(!$scope.entity.paymentType){
			alert("请选择医疗费用支付方式");
			return false;
		}
		if(!$scope.entity.assessmentReason){
			alert("请选择评估原因");
			return false;
		}
		return true;
	}
	
	
	$scope.confirmResult = function(){
		var id = $location.search()['id'];
		oldmanMessageService.confirmResult(id).success(function(response){
			if(response.success==true){
				window.location.href = "result_confirm.html#?id="+id;
			}else{
				alert(response.message);
			}
		});
	}
	
	
	$scope.findOne = function(id){
		if(!id){
			var id = $location.search()['id'];
		}
		oldmanMessageService.findOne(id).success(function(response){
				$scope.entity = response;
		});
	}
	
	
	$scope.genderView = ['','男','女'];
	
	$scope.abilityGrade = ['能力完好','轻度受损','中度受损','重度受损'];
	
	$scope.abilityLevel = ['能力完好','轻度失能','中度失能','重度失能'];
	
	
	
	//搜索
	$scope.search=function(page,rows){			
		oldmanMessageService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	
	//删除
	$scope.dele = function(){
		if(!$scope.selectIds || $scope.selectIds.length==0){
			alert('请选择需要删除的记录');
			return ;
		}
		if(confirm('确定要删除吗？')){
			oldmanMessageService.dele($scope.selectIds).success(function(response){
				if(response.success==true){
					$scope.reloadList();
					$scope.selectIds = [];
				}else{
					alert(response.message);
				}
			});
		}
	}
	
	
	
	
	
	$scope.formatDate = function(dateString){
		if(!dateString){
			return "";
		}
		
		var date = new Date(dateString);
		
	    var mat={};
	    mat.M=date.getMonth()+1;//月份记得加1
	    mat.Y=date.getFullYear();
	    mat.D=date.getDate();
	    
	    mat.M=check(mat.M);
	    mat.D=check(mat.D);
	    
	    return mat.Y+"-"+mat.M+"-"+mat.D;
	}
	
	
	//检查是不是两位数字，不足补全
	function check(str){
	    str=str.toString();
	    if(str.length<2){
	        str='0'+ str;
	    }
	    return str;
	}
	
	
	
	
	
	//下载评估结果确认word
	$scope.downloadResult = function(){
		var id = $location.search()['id'];
		
		oldmanMessageService.downloadResult(id);
	}

	
	//根据条件导出数据列表
	$scope.exportData = function(){
		oldmanMessageService.exportData($scope.searchEntity);
	}
	
	//导出Excel模板
	$scope.exportTemplate = function(){
		oldmanMessageService.exportTemplate();
	}
	
	
	//由身份证号计算生日
	$scope.calculateBirthday = function(){
		if($scope.entity.idCart.length == 18){
			var bir = $scope.entity.idCart.substr(6,8) ;
			var year = bir.substr(0,4);
			var month = bir.substr(4,2);
			var day = bir.substr(6,2);
			$scope.entity.birthday = year+"-"+month+"-"+day;
		}else{
//			alert("身份证号码不合法  ");
			$scope.entity.birthday = '';
		}
	}
	
	
	$scope.downloadDetailResult = function(id){
		oldmanMessageService.downloadDetailResult(id);
	}
	
	
	$scope.downloadMessageResult = function(id){
		oldmanMessageService.downloadMessageResult(id);
	}
	
	
	
	
	
	$scope.updateStatus=false;
	$scope.findOneBaseMessage = function(){
		var id = $location.search()['id'];
		if(id){
			
			$scope.updateStatus=true;
			
			oldmanMessageService.findOneBaseMessage(id).success(function(response){
				$scope.entity = response;
			});
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
});