// var myApp = angular.module("myApp", ['ui.router']);
// myApp.config(function ($stateProvider, $urlRouterProvider) {
//   $urlRouterProvider.when("", "/PageTab");
//
//   $stateProvider
//     .state("PageTab", {
//       url: "/PageTab",
//       templateUrl: "PageTab.html"
//     })
//     .state("PageTab.Page1", {
//       url: "/Page1",
//       templateUrl: "Page-1.html"
//     })
//     .state("PageTab.Page2", {
//       url: "/Page2",
//       templateUrl: "Page-2.html"
//     })
//     .state("PageTab.Page3", {
//       url: "/Page3",
//       templateUrl: "Page-3.html"
//     });
// });

var myApp = angular.module("myApp", ['ui.router']);
console.log('test');
myApp.controller('myController', function($scope) {
    $scope.carname = "Volvo";
});





myApp.config(function ($stateProvider, $urlRouterProvider) {

     $urlRouterProvider.when("", "/PageTab");
     console.log('url===', $urlRouterProvider);
     console.log('url===', $urlRouterProvider.when("/", "/PageTab"));
     $stateProvider
        .state("PageTab", {
            url: "/PageTab",
            templateUrl: "PageTab.html"
        })
        .state("PageTab.Page1", {
            url:"/Page1",
            templateUrl: "Page1.html"
        })
        .state("PageTab.Page2", {
            url:"/Page2",
            templateUrl: "Page2.html"
        })
        .state("PageTab.Page3", {
            url:"/Page3",
            templateUrl: "Page3.html"
        });
});








//myApp.config(function ($stateProvider, $urlRouterProvider) {
//
//     $urlRouterProvider.when("", "/PageTab");
//     console.log('url===', $urlRouterProvider);
//     console.log('url===', $urlRouterProvider.when("/", "/PageTab"));
//     $stateProvider
//        .state("PageTab", {
//            url: "/PageTab",
//            templateUrl: "PageTab.html"
//        })
//        .state("PageTab.Page1", {
//            url:"/Page1",
//            templateUrl: "Page1.html"
//        })
//        .state("PageTab.Page2", {
//            url:"/Page2",
//            templateUrl: "Page2.html"
//        })
//        .state("PageTab.Page3", {
//            url:"/Page3",
//            templateUrl: "Page3.html"
//        });
//});
