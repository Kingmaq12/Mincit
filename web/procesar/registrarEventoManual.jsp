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
<!DOCTYPE html>

<%
    
    response.setContentType("text/html;charset-UTF-8");
    request.setCharacterEncoding("UTF-8");
 
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
		  		int i=0;
		  		while (iter.hasNext()) {
		  			
		  		FileItem item = (FileItem) iter.next();
		  	    	String name = item.getFieldName();
	  	        	fileName = name;
	  	        	if (name.equalsIgnoreCase("directory")) { directory = item.getString(); }
	  	        	File file=null;
		  	    	if (!item.isFormField()) {
			  	    	if(i==0){
			  	    		file = new File(directory+"/imagenes/"+fileName);
                                                session.setAttribute("imagen",directory+"/imagenes/"+fileName);
                                                nombreImagen= fileName;
			  	      	}
			  	    	if (i==1){
			  	    		file = new File(directory+"/"+fileName);
			  	    	}		  	      	 	  	      
				  	  	File parentFile = file.getParentFile();
			  		
			  	      	if (parentFile != null) { parentFile.mkdirs();  }
			  	      	file.deleteOnExit();
			  	      	item.write(file);
			  	      	
				  		
		  	      	} 
		  	      	i=i+1;
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
        
    //AQUI LE PIDO LO DE SESSION Y LO MANDO PA NEGOCIO PA HACER EL REGISTRO EN LA BASE DE DATOS    
    
            String nombre= (String)session.getAttribute("nombre");
            String fecha= (String)session.getAttribute("fecha");
            String hora= (String)session.getAttribute("hora");
            String lugar= (String)session.getAttribute("lugar");
            String entidad_adscrita= (String)session.getAttribute("entidad_adscrita");
            String continente= (String)session.getAttribute("continente");
            String pais= (String)session.getAttribute("pais");
            String ciudad= (String)session.getAttribute("ciudad");
            String participantes= (String)session.getAttribute("participantes");
            String tipo_evento= (String)session.getAttribute("tipo_evento");
            String sector_economico= (String)session.getAttribute("sector_economico");
            String url= (String)session.getAttribute("url");
            String logros= (String)session.getAttribute("logros");
            String descripcion= (String) session.getAttribute("descripcion");
            String imagen = (String) session.getAttribute("imagen");
        
    Negocio nego = new Negocio();
    
    String respuesta = nego.registrarEvento(nombre, fecha, hora, lugar, entidad_adscrita, continente, pais, ciudad, participantes, tipo_evento, sector_economico, url,imagen, logros, descripcion);
    
    session.setAttribute("evento_registrado", respuesta);
    response.sendRedirect("../7.registrar_evento.jsp");
    
%>    
