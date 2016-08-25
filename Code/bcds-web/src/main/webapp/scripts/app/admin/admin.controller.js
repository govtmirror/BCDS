'use strict';

angular.module('bcdssApp').controller('AdminDashboardController', function($rootScope, $scope, $state, $stateParams, $http) {
	$scope.users = [];

	$http.get('http://localhost:8083/bcds-web-0.0.1-SNAPSHOT-tomcat/api/users').
		success(function(data) {
			$scope.users = data;
		});

});