var app = angular.module('serviceApp',[]);

app.factory('AddService',function(){
	return {
		add:function(a,b){
			return a+b;
		}
	}
});
