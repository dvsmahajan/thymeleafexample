/**
 * 
 */

function getData(){
	alert("hi...............");
	$.ajax({
		url : 'getData',
		dataType : 'json',
		contentType : "application/json",
		type : 'get',
		statusCode : {
			200 : function(data) {
				console.log(data);
				alert(data.responseText);
				$('.data').html(data.responseText);
			}
		}
});
}