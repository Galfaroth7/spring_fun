function Hello($scope, $http) {
    $http.get('http://localhost:8080/sample').
        success(function(data) {
            $scope.greeting = data;
        });
}