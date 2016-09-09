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
    
    var cedula= document.getElementById("cedula");
    var contraseña= document.getElementById("contrasenia");
    
    ajax = nuevoAjax();
    parametros = "cedula=" + cedula.value + "&contrasenia=" + contraseña.value;
    url = "procesar/iniciar.jsp";
    ajax.open("POST",url,true);
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
                     window.location = "perfil.jsp";
            } 
                
                else {
                    
                    document.getElementById("campo").innerHTML = "Datos incorrectos";
                    $("#iniciarSesion")[0].reset(); 
                }
            }
            else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                    /** document.getElementById(campo).innerHTML = "Asignacion exitosa";
                    $("#formAsignarEstudiante")[0].reset(); **/
                    window.location = "perfil.jsp";
                }
                else {
                    
                    document.getElementById("campo").innerHTML = "Datos incorrectos";
                    $("#iniciarSesion")[0].reset(); 
                }
            }
        }
        else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }
    
    
}