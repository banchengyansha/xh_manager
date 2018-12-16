function buildTable(data, categoryContent ,tableId){
	
	var gradeLevel = ['能力完好', '轻度失能', '中度失能','重度失能'];
	
	
	//计算总计
	var countArr = new Array(categoryContent.length);
	for(var j = 0 ; j < countArr.length ; j++){
		countArr[j] = 0;
	}
	
	for(var i in data){ 
		//{"level_3":[42,709,636,285,86],"level_0":[28,36,0,0,0],"level_2":[37,406,158,28,8],"level_1":[105,569,131,25,11]}
		var levelData = data[i];
		
		for(var j = 0 ; j < levelData.length ; j++){
			countArr[j] += levelData[j];
		}
	}
	
	
	//表头信息
 	var tableContent = "<tr>";
 	tableContent += "<th>失能等级</th>";
 	
 	for (var i = 0; i < categoryContent.length; i++) {
 		tableContent += "<th>"+categoryContent[i]+"</th>";
	}
 	tableContent += "</tr>";
 	
 	
 	
 	// 每行内容 
 	for(var i = 0 ; i < gradeLevel.length; i++){
	 	tableContent += "<tr>";
	 	tableContent += "<th>"+gradeLevel[i]+"</th>";
	 	
	 	var lev = 'level_'+i;
		for(var j = 0 ; j < data[lev].length; j++){
    	 	tableContent += "<td>"+data[lev][j]+"</td>";
		}
	 	
	 	tableContent += "</tr>";
 	}
 	
 	
 		//总计行
	 	tableContent += "<tr>";
	 	tableContent += "<th>总计</th>";
	 	
	 	for(var i = 0 ; i < countArr.length; i++){
	 		tableContent += "<th>"+countArr[i]+"</th>";
	 	}
	 	
	 	tableContent += "</tr>";
 	
 	
	
 	
 	
 	$("#"+tableId).append(tableContent);
	
}