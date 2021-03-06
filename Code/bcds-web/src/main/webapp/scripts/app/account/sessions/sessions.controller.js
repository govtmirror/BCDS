'use strict';

angular.module('bcdssApp')
    .controller('SessionsController', function ($rootScope, $scope, Sessions, Principal) {
        Principal.identity().then(function(account) {
            $scope.account = account;
            $rootScope.userName = account.firstName;
        });

        $scope.success = null;
        $scope.error = null;
        $scope.sessions = Sessions.getAll();
        $scope.invalidate = function (series) {
            Sessions.delete({series: encodeURIComponent(series)},
                function () {
                    $scope.error = null;
                    $scope.success = 'OK';
                    $scope.sessions = Sessions.getAll();
                },
                function () {
                    $scope.success = null;
                    $scope.error = 'ERROR';
                });
        };
    });
