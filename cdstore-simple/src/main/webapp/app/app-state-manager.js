"use strict";

(function () {

    angular.module('cdStore').config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/CD");

        $stateProvider.state("CD", {
            url: "/CD",
            templateUrl: "app/feature/CD/CDs.html"
        }).state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard.html"
        })
    });
}());