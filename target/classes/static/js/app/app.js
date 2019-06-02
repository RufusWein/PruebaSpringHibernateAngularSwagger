'use strict'
var demoApp = angular.module('demo', ['ui.bootstrap', 'demo.controllers','demo.services']);

demoApp.constant("CONSTANTE", {
    buscaUsuarioPorId	: "/usuarios/usuario/",
    listaUsuarios		: "/usuarios/list",
    guardaUsuario		: "/usuarios/nuevo"
});