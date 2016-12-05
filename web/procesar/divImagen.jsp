<%-- 
    Document   : divImagen
    Created on : 20-oct-2016, 16:53:22
    Author     : ALEJANDRA
--%>

<%      
        String nombre = (String) session.getAttribute("nombre");
%>
<div class="col-sm-4 col-sm-offset-1">

    <div class="form-group">
        <label>Imagen </label> <br>
        <input type="file" class="file" name="<%=nombre%>" id="<%=nombre%>" data-icon="false" required="required">
    </div>
</div>
<br>
<div class="col-sm-12">
    <br>
    <button type="submit" name="submit" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-ok-circle"></span> Registrar Evento</button>
    <br>
    <label id="campo" name="campo"></label>
</div>

