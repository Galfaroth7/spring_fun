function Cheese($scope, $http) {
    $http.get('http://localhost:8080/displayfirst').
        success(function(data) {
            console.log(data);
            $scope.cheese = data;
        });
}