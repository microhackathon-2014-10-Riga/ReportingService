'use strict';

/**
 * @ngdoc function
 * # MainCtrl
 */
angular.module('BootstrapApplication.controllers')
        .controller('MainCtrl', ['$scope', 'ClientsService', function ($scope, ClientsService) {
            $scope.awesomeThings = [
                'HTML5 Boilerplate',
                'AngularJS',
                'Karma'
            ];

            $scope.clients = [];
            $scope.alerts = [];


            $scope.getClients = function() {
                ClientsService.getClients(function(data) {
                    $scope.clients = data;
                });
            };

        }]);
