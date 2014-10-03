'use strict';

angular.module('BootstrapApplication.services')
    .factory('ClientsService', ['$http', function($http) {
        var clientsService = {};
        clientsService.getClients = function (successFn) {
            $http({
                url: '/api/clients',
                dataType: 'json',
                method: 'get',
                data: ''
            }).success(function (data) {
                successFn(data);
            });
        };

        return clientsService;
    }
]);
