'use strict'

angular.module('demo.services', []).factory('Servicios', ["$http", "CONSTANTE", 
	function($http, CONSTANTE) {
	    var servicios = {};
	    
	    // Desplegamos los servicios disponibles
	    servicios.buscaUsuarioPorId 	= function(id) {
	        var url = CONSTANTE.buscaUsuarioPorId + id;
	        return $http.get(url); // Hacemos peticion GET
	    }
	    
	    servicios.listaUsuarios 		= function() {
	        return $http.get(CONSTANTE.listaUsuarios);
	    }
	    
	    servicios.guardaUsuario 		= function(usuario) {
	        return $http.post(CONSTANTE.guardaUsuario, usuario); // Hacemos una peticion POST (sincrona)
	    }
	    
	    return servicios;
}]);