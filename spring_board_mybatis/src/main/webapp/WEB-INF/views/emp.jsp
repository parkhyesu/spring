<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<script src = "http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			$(document).ready(function(){
				
				$.ajax({
				
					url:"/emp/list",
					dataType : "json",
					success:function(data){
						
						$.each(data,function(key,value){
							
							var tag = "";
							tag = tag + value.empno;
							tag = tag + value.ename;
							tag = tag +value.job;
							tag = tag +value.mgr;
							tag = tag +value.date;
							tag = tag +value.sal;
							tag = tag +value.comm;
							tag = tag +value.deptno;
							
							$("#content").append(tag);
						});
					}

					
				});
				
				
			});
		
		
		</script>


	</head>
	<body>
		
		<div id = content>
		ddddd
		</div>
	
	</body>
</html>