'use strict'
var module = angular.module('demo.controllers', []);

module.controller("Controlador", ["$scope", "Servicios",
    function($scope, Servicios) {
		// Declaramos el usuario y lo inicializamos
        $scope.usuario = {
            id		: null,
            nombre	: null,
        };

        // Ejecutamos el servicio de buscar
        Servicios.buscaUsuarioPorId(1).then(function(respuesta) {
            console.log(respuesta.data);
        }, function(reason) {
            console.log("Ocurrio algún error!! No es posible buscar!!");
        }, function(respuesta) {
            console.log("No hay respuesta!! No es posible buscar!!");
        });
        
        //Definimos la funcion "guardar" que sera invocada al hacer click sobre el boton
        $scope.guardar = function() {
        	Servicios.guardaUsuario($scope.usuario).then(function(respuesta) {
                console.log("Usuario guardado!");
                
                // Si recibimos la respuesta adecuada ejecutamos el servicio de listar
                Servicios.listaUsuarios().then(function(respuesta) {
                    $scope.usuarios = respuesta.data;
                }, function(reason) {
                    console.log("Ocurrio algún error!! No es posible listar!!");
                }, function(respuesta) {
                    console.log("No hay respuesta!! No es posible listar!!");
                });
                
                // Reiniciamos el objeto usuario para la siguiente inserccion
                $scope.usuario = {
                    id		: null,
                    nombre	: null,
                };
            }, function(reason) {
            	console.log("Ocurrio algún error!! No es posible guardar!!");
            }, function(respuesta) {
            	console.log("No hay respuesta!! No es posible guardar!!");
            });
        }
    }
]);