$(function(){
	if($(".pageRegister").height() < $(window).height()){
		$(".pageRegister").height($(window).height());
	}
	$("#registerBtn").click(function(){
		var j_phone  = $("#j_phone").val();
		var j_pwd = $("#j_pwd").val();
		var j_r_pwd = $("#j_r_pwd").val();
		var img = $("#img").val();
		var provinceCode=$("#provinceCode").val();
		var cityCode=$("#cityCode").val();
		if(!j_phone  || !j_pwd || !j_r_pwd ){
			$("#regMsg").html("用户名或密码不能为空");
			return false;
		}
		if(j_phone.length!=11){
			$("#regMsg").html("手机号码不正确");
			return false;
		}
		if(j_pwd != j_r_pwd ){
			$("#regMsg").html("两次密码不一致");
			$("#j_pwd").val("");
			$("#j_r_pwd").val("");
			return false;
		}
		var myreg = /^(((13[0-9]{1})|(14[0-9]{1})|(15[0-9]{1})|(14[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
		if (!myreg.test(j_phone)) {
			$("#regMsg").html("手机号码不正确");
			return false;
		}
		$("#makeUpFrm").submit();
	
	});
	
	$("#provinceSelect").change(function(){
		var provinceCode = $("#provinceSelect").val();
		if(provinceCode){
			$.ajax({
				method:"post",
				url:"/getByProvinceCode",
				data:{"provinceCode":provinceCode},
				success:function(data){
					if(data){
						var len=data.length;
						$("#citySelect").empty();
						for(var i=0;i<len;i++){
							$("#citySelect").append('<option value="'+data[i].code+'">' + data[i].cname+ '</option>');
						}
					}
					
				}
			});
		}
	});
	
	
});
