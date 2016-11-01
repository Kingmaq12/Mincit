<%-- 
    Document   : registrarEventoExcel
    Created on : 29-oct-2016, 17:08:41
    Author     : ALEJANDRA
--%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="javax.naming.SizeLimitExceededException"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    response.setContentType("text/html;charset-UTF-8");
    request.setCharacterEncoding("UTF-8");
 
        String respuesta = "N";
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	double areaEquivalente=0;
	String mensaje="";
	String estado= request.getParameter("hdEstado");
	String directory="";
	String nombreImagen="";
	String datos="";
        if (estado==null) estado="";
	
	if(estado.equals("")){
		try{
			if (isMultipart) {
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
				servletFileUpload.setSizeMax(100000*1012);		
				String  fileName="";	  			  			  		
		  		directory =getServletContext().getRealPath("/archivos/").replace("./","/");
		  		if(directory==null){
		  			if(directory.equals("")){
		  				mensaje="Error al obtener el directorio";
		  				throw new Exception("Error al obtener el directorio");
		  			}
		  		}
		  		List items = servletFileUpload.parseRequest(request);	  		
		  		Iterator iter = items.iterator();
		  		while (iter.hasNext()) {
		  			
		  		FileItem item = (FileItem) iter.next();
		  	    	String name = item.getFieldName();
	  	        	fileName = name;
	  	        	if (name.equalsIgnoreCase("directory")) { directory = item.getString(); }
	  	        	File file=null;
		  	    	if (!item.isFormField()) {
                                                file = new File(directory+"/excel/"+fileName);
                                                session.setAttribute("imagen",directory+"/imagenes/"+fileName);
                                                nombreImagen= fileName;
                                                File parentFile = file.getParentFile();
			  		
			  	      	if (parentFile != null) { parentFile.mkdirs();  }
			  	      	file.deleteOnExit();
			  	      	item.write(file);
			  	      	Negocio neg = new Negocio();
                                        respuesta=neg.registrarEventoExcel(file); 
				  		
		  	      	} 
		  	      	
                                
		  	    }
			} else mensaje="No es multipart";
		} catch(SizeLimitExceededException e) {
			e.printStackTrace();
			mensaje="El tamaño del archivo supera los " + 10+ " MB permitidos.";
			
			
		} catch (Exception e){
			e.printStackTrace();
			mensaje+="Error processing file";
			
		}
	}

    session.setAttribute("evento_registrado", respuesta);
    response.sendRedirect("../7.registrar_evento.jsp");  
        

%>
