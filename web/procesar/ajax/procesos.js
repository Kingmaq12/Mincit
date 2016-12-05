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
    ajax.onreadystatechange = function()
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

function guardarDatos() {

    var entidad_adscrita = "";
    var i = 0;
    for (i = 1; i < 13; i++) {
        var x = i + ".1";
        var ii = document.getElementById(x).checked;
        if (ii == true) {
            entidad_adscrita += i + ",";
        }
    }


    var sector_economico = "";
    var j = 0;
    for (j = 1; j < 11; j++) {
        var k = j + ".2";
        var oo = document.getElementById(k).checked;
        if (oo == true) {
            sector_economico += j + ",";
        }
    }

    var logros = "";
    var s = 0;
    for (s = 1; s < 16; s++) {
        var z = s + ".3";
        var pipi = document.getElementById(z).checked;
        if (pipi == true) {
            logros += s + ",";
        }
    }

    ajax = nuevoAjax();
    parametros = "nombre=" + document.getElementById("nombre").value + "&fecha=" + document.getElementById("fecha").value + "&hora=" + document.getElementById("hora").value + "&lugar=" + document.getElementById("lugar").value + "&entidad_adscrita=" + entidad_adscrita + "&continente=" + document.getElementById("continente").value + "&pais=" + document.getElementById("pais").value + "&ciudad=" + document.getElementById("ciudad").value + "&participantes=" + document.getElementById("participantes").value + "&tipo_evento=" + document.getElementById("tipo_evento").value + "&sector_economico=" + sector_economico + "&url=" + document.getElementById("url").value + "&logros=" + logros + "&descripcion=" + document.getElementById("descripcion").value;

    url = "procesar/guardarDatos.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function() {

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

function cambiarContrasenia() {

    ajax = nuevoAjax();
    parametros = "antigua=" + document.getElementById("antigua").value + "&nueva=" + document.getElementById("nueva").value + "&nueva2=" + document.getElementById("nueva2").value;
    url = "procesar/cambiarContrasenia.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function()
    {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Contraseña cambiada";
                    $("#cambiarContrasenia")[0].reset();
                } else {
                    document.getElementById("campo").innerHTML = "Datos incorrectos";

                }
            } else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                    document.getElementById("campo").innerHTML = "Contraseña cambiada";
                    $("#cambiarContrasenia")[0].reset();
                } else {
                    document.getElementById("campo").innerHTML = "Datos incorrectos";
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }


}

function guardarDatos2() {

    var entidad_adscrita = "";
    var i = 0;
    for (i = 1; i < 13; i++) {
        var x = i + ".1";
        var ii = document.getElementById(x).checked;
        if (ii == true) {
            entidad_adscrita += i + ",";
        }
    }


    var sector_economico = "";
    var j = 0;
    for (j = 1; j < 11; j++) {
        var k = j + ".2";
        var oo = document.getElementById(k).checked;
        if (oo == true) {
            sector_economico += j + ",";
        }
    }

    var logros = "";
    var s = 0;
    for (s = 1; s < 16; s++) {
        var z = s + ".3";
        var pipi = document.getElementById(z).checked;
        if (pipi == true) {
            logros += s + ",";
        }
    }

    ajax = nuevoAjax();
    parametros = "nombre=" + document.getElementById("nombre").value + "&fecha=" + document.getElementById("fecha").value + "&hora=" + document.getElementById("hora").value + "&lugar=" + document.getElementById("lugar").value + "&entidad_adscrita=" + entidad_adscrita + "&continente=" + document.getElementById("continente").value + "&pais=" + document.getElementById("pais").value + "&ciudad=" + document.getElementById("ciudad").value + "&participantes=" + document.getElementById("participantes").value + "&tipo_evento=" + document.getElementById("tipo_evento").value + "&sector_economico=" + sector_economico + "&url=" + document.getElementById("url").value + "&logros=" + logros + "&descripcion=" + document.getElementById("descripcion").value;

    url = "procesar/actualizarDatos.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function() {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {

                    window.location = "8.busquedaAd.jsp";
                    $("#registrarManual")[0].reset();

                } else {

                    document.getElementById("campo").innerHTML = "Ha ocurrido un error.";
                    $("#registrarManual")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {

                    window.location = "8.busquedaAd.jsp";
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

function validate() {

    var valor = 0;

    var a = 0, rdbtn = document.getElementsByName("1");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 1");


    }
    

    a = 0;
    rdbtn = document.getElementsByName("2");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 2");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("3");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 3");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("4");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 4");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("5");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 5");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("6");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 6");


    }
    
    
    a = 0;
    rdbtn = document.getElementsByName("7");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 7");


    }
    
    
    a = 0;
    rdbtn = document.getElementsByName("8");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 8");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("9");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 9");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("10");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 10");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("11");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 11");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("12");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 12");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("13");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 13");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("14");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 14");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("15");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 15");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("16");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 16");


    }
    
    
    a = 0;
    rdbtn = document.getElementsByName("17");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 17");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("18");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 18");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("19");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 19");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("20");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 20");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("21");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 21");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("22");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 22");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("23");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 23");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("24");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 24");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("25");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 25");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("26");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 26");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("27");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 27");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("28");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 28");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("29");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 29");


    }
    
    a = 0;
    rdbtn = document.getElementsByName("30");
    for (i = 0; i < rdbtn.length; i++) {
        if (rdbtn.item(i).checked === false) {
            a++;
        }else{
            valor += rdbtn[i].value;
        }
    }
    if (a === rdbtn.length) {
        alert("No ha seleccionado la pregunta 30");


    }
    
    if(valor === 30){
    
    ajax = nuevoAjax();
    parametros = "valor=" + valor + "&nombre=" + document.getElementById("nombre").value + "&cedula=" + document.getElementById("cedula").value + "&email=" + document.getElementById("email").value;
    url = "procesar/registrarEmprendedor.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function()
    {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                    window.location = "11.1.respuestaCuestionario.jsp";
                } else {
                   
                }
            } else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                    window.location = "11.1.respuestaCuestionario.jsp";
                } else {
                    
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando registro";
        }
    }
    
    
    }
    
}

function modificarAlerta() {

    ajax = nuevoAjax();
    parametros = "numero=" + document.getElementById("alerta1").value + "&alerta="+1;
    url = "procesar/modificarAlerta.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function()
    {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                     document.getElementById("campo").innerHTML = "Alerta modificada";
                     $("#alerta1")[0].reset();
                } else {
                    document.getElementById("campo").innerHTML = "Error al modificar";
                    $("#alerta1")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                     document.getElementById("campo").innerHTML = "Alerta modificada";
                     $("#alerta1")[0].reset();
                } else {
                    document.getElementById("campo").innerHTML = "Error al modificar";
                    $("#alerta1")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando modificación";
        }
    }


}

function modificarAlerta2() {

    ajax = nuevoAjax();
    parametros = "numero=" + document.getElementById("alerta2").value + "&alerta="+2;
    url = "procesar/modificarAlerta.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function()
    {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                     document.getElementById("campo2").innerHTML = "Alerta modificada";
                     $("#alerta2")[0].reset();
                } else {
                    document.getElementById("campo2").innerHTML = "Error al modificar";
                    $("#alerta2")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                     document.getElementById("campo2").innerHTML = "Alerta modificada";
                     $("#alerta2")[0].reset();
                } else {
                    document.getElementById("campo2").innerHTML = "Error al modificar";
                    $("#alerta2")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando modificación";
        }
    }


}

function modificarAlerta3() {

    ajax = nuevoAjax();
    parametros = "numero=" + document.getElementById("alerta3").value + "&alerta="+2;
    url = "procesar/modificarAlerta.jsp";
    ajax.open("POST", url, true);
    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    ajax.send(parametros);
    ajax.onreadystatechange = function()
    {

        if (ajax.readyState == 4)
        {
            if (ajax.status == 200)
            {
                var rta = ajax.responseText;
                if (rta.indexOf("S") > 0) {
                     document.getElementById("campo3").innerHTML = "Alerta modificada";
                     $("#alerta3")[0].reset();
                } else {
                    document.getElementById("campo3").innerHTML = "Error al modificar";
                    $("#alerta3")[0].reset();
                }
            } else
            {

                var rta = ajax.responseText;

                if (rta.indexOf("S") > 0) {
                     document.getElementById("campo3").innerHTML = "Alerta modificada";
                     $("#alerta3")[0].reset();
                } else {
                    document.getElementById("campo3").innerHTML = "Error al modificar";
                    $("#alerta3")[0].reset();
                }
            }
        } else
        {
            document.getElementById(campo).value = "Procesando modificación";
        }
    }


}

function consultar() {

    ajax = nuevoAjax();
    parametros = "fechaI=" + document.getElementById("fechaI").value +"&fechaF=" + document.getElementById("fechaF").value + "&entidad=" + document.getElementById("entidad").value + "&pais=" + document.getElementById("pais").value + "&ciudad=" + document.getElementById("ciudad").value + "&continente=" + document.getElementById("continente").value + "&sector=" + document.getElementById("sector").value + "&logro=" + document.getElementById("logro").value;
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

function consultar2() {

    ajax = nuevoAjax();
    parametros = "fechaI=" + document.getElementById("fechaI").value +"&fechaF=" + document.getElementById("fechaF").value + "&entidad=" + document.getElementById("entidad").value + "&pais=" + document.getElementById("pais").value + "&ciudad=" + document.getElementById("ciudad").value + "&continente=" + document.getElementById("continente").value + "&sector=" + document.getElementById("sector").value + "&logro=" + document.getElementById("logro").value;
    var tabla = "tabla";
    url = "procesar/Consultar2.jsp";
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