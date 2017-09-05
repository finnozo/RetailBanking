var app = angular.module('crudApp', ['ui.router', 'ngStorage']);

app.constant('urls', {
    BASE: 'http://b4c55c2b.ngrok.io',
    USER_SERVICE_API: 'http://b4c55c2b.ngrok.io/api/branches/'
});

app.config(['$stateProvider', '$urlRouterProvider',
    function ($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'angularCall/list-branches',
                controller: 'UserController',
                controllerAs: 'ctrl',
                resolve: {
                    users: function ($q, UserService) {
                        console.log('Load all users');
                        var deferred = $q.defer();
                        UserService.loadAllUsers().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            });
        $urlRouterProvider.otherwise('/');
    }]);

