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


function iniciarSesion(){
        
    ajax = nuevoAjax();
    parametros = "cedula=" + document.getElementById("cedula").value + "&contrasenia=" + document.getElementById("contrasenia").value ;
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
                } else if(rta.indexOf("A") > 0) {
                    window.location = "6.perfil2.jsp";
                } else{
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
                }  else if(rta.indexOf("A") > 0) {
                    window.location = "6.perfil2.jsp";
                } else{
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
    parametros = "nombre_empresa=" + document.getElementById("nombre_empresa").value +"&nombre_empleado=" +document.getElementById("nombre_empleado").value +"&email=" + document.getElementById("email").value + "&asunto=" + document.getElementById("asunto").value + "&mensaje=" + document.getElementById("mensaje").value;
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

function registrarEvento(){
    
    
    alert("entro a registrar Evento");
    
    ajax = nuevoAjax();
    parametros = "nombre=" + document.getElementById("nombre").value +"&fecha=" +document.getElementById("fecha").value + "&hora=" + document.getElementById("hora").value + "&lugar=" + document.getElementById("lugar").value + "&patrocinadores=" + document.getElementById("patrocinadores").value + "&continente=" + document.getElementById("continente").value + "&pais=" + document.getElementById("pais").value + "&ciudad=" + document.getElementById("ciudad").value + "&participantes=" + document.getElementById("participanetes").value + "&tipo_evento=" + document.getElementById("tipo_evento").value + "&sector_economico=" + document.getElementById("sector_economico").value + "&url=" + document.getElementById("url").value + "&imagen=" + document.getElementById("imagen").value + "&logros=" + document.getElementById("logros").value + "&descripcion=" + document.getElementById("descripcion").value;
    url = "procesar/registrar.jsp";
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
                    document.getElementById("campo").innerHTML = "Evento Registrado Exitosamente.";
                    $("#registrar")[0].reset();
                } else {

                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#registrar")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Evento Registrado Exitosamente.";
                    $("#registrar")[0].reset();
                } else {

                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#registrar")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }
    
}
