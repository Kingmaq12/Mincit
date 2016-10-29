/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function nuevoAjax() {
    var xmlhttp = false;
    try {
        // Creacion del objeto AJAX para navegadores no IE Ejemplo:Mozilla, Safari 
        xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
    } catch (e) {
        try {
            // Creacion del objet AJAX para IE
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (E) {
            if (!xmlhttp && typeof XMLHttpRequest != 'undefined')
                xmlhttp = new XMLHttpRequest();
        }
    }
    return xmlhttp;
}

function iniciarSesion() {

    ajax = nuevoAjax();
    parametros = "cedula=" + document.getElementById("cedula").value + "&contrasenia=" + document.getElementById("contrasenia").value;
    url = "procesar/iniciar.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function ()
    {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    window.location = "6.perfil.jsp";
                } else if (rta.indexOf("A") > 0) {
                    window.location = "7.perfil.jsp";
                } else {
                    document.getElementById("campo").innerHTML = "Datos incorrectos";
                    $("#iniciarSesion")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                    /** document.getElementById(campo).innerHTML = "Asignacion exitosa";
                     $("#formAsignarEstudiante")[0].reset(); **/
                    window.location = "6.perfil.jsp";
                } else if (rta.indexOf("A") > 0) {
                    window.location = "7.perfil.jsp";
                } else {
                    document.getElementById("campo").innerHTML = "Datos incorrectos";
                    $("#iniciarSesion")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }


}

function contactar() {

    ajax = nuevoAjax();
    parametros = "nombre_empresa=" + document.getElementById("nombre_empresa").value + "&nombre_empleado=" + document.getElementById("nombre_empleado").value + "&email=" + document.getElementById("email").value + "&asunto=" + document.getElementById("asunto").value + "&mensaje=" + document.getElementById("mensaje").value;
    url = "procesar/contactar.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function () {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Mensaje Enviado Exitosamente.";
                    $("#contactar")[0].reset();
                } else {

                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#contactar")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Mensaje Enviado Exitosamente.";
                    $("#contactar")[0].reset();
                } else {

                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#contactar")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }

}

function guardarDatos() {
    
    var entidad_adscrita = "";
    var i=0;
    for (i = 1; i < 13; i++) {
        var x = i + ".1" ;
        var ii = document.getElementById(x).checked;
        if (ii==true){
            entidad_adscrita += i + ",";
        }
    }
    

    var sector_economico = "";
    var j=0;
    for (j = 1; j < 11; j++) {
        var k = j + ".2" ;
        var oo = document.getElementById(k).checked;
        if (oo==true){
            sector_economico += j + ",";
        }
    }
    
    var logros = "";
    var s=0;
    for (s = 1; s < 16; s++) {
        var z = s + ".3" ;
        var pipi = document.getElementById(z).checked;
        if (pipi==true) {
            logros += s + ",";
        }
    }
    
    ajax = nuevoAjax();
    parametros = "nombre=" + document.getElementById("nombre").value + "&fecha=" + document.getElementById("fecha").value +"&hora=" + document.getElementById("hora").value + "&lugar=" + document.getElementById("lugar").value + "&entidad_adscrita=" + entidad_adscrita + "&continente=" + document.getElementById("continente").value + "&pais=" + document.getElementById("pais").value +"&ciudad="+document.getElementById("ciudad").value + "&participantes=" + document.getElementById("participantes").value + "&tipo_evento=" + document.getElementById("tipo_evento").value + "&sector_economico=" + sector_economico + "&url=" + document.getElementById("url").value + "&logros=" + logros + "&descripcion=" + document.getElementById("descripcion").value;
    
    url = "procesar/guardarDatos.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function () {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Datos Guardados, puede hacer Paso 2.";
                    $("#resetear").load("procesar/divImagen.jsp");
                    $("#registrarManual")[0].reset();
                    
                } else {
                     
                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#registrarManual")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Datos Guardados, puede hacer Paso 2.";
                    //SE RECARGA ES EL DIV
                    $("#resetear").load("procesar/divImagen.jsp");
                    $("#registrarManual")[0].reset();
                    

                } else {

                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#registrarManual")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }

}

function consultar() {

    ajax = nuevoAjax();
    parametros = "fecha=" + document.getElementById("fecha").value + "&entidad=" + document.getElementById("entidad").value + "&pais=" + document.getElementById("pais").value + "&ciudad=" + document.getElementById("ciudad").value + "&continente=" + document.getElementById("continente").value + "&sector=" + document.getElementById("sector").value + "&logro=" + document.getElementById("logro").value;
    var tabla = "tabla";
    url = "procesar/Consultar.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function() {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                    document.getElementById(tabla).innerHTML = ajax.responseText;
            }
                document.getElementById(tabla).innerHTML = ajax.responseText;

        } else
        {
            document.getElementById(tabla).value = "Cargando ";
        }
    }

}