<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<h3>Registro de Nuevos Creyentes</h3>
    <form:form action="saveBeliever.htm" method="POST" modelAttribute="believer">
	    <table border="0" style="width=90%;">
	    	<tr>
	    		<td>
	    			Nombres
	    		</td>
	    		<td colspan="3">
	    			<form:input path="txtName"/>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Apellido Paterno
	    		</td>
	    		<td>
	    			<form:input path="txtFatherName"/>
	    		</td>
	    		<td>
	    			Apellido Materno
	    		</td>
	    		<td>
	    			<form:input path="txtMotherName"/>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Tipo
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Nuevo Creyente</option>
						<option value="1">Discípulo</option> 
	    			</select>
	    		</td>
	    		<td>
	    			Estado Civil
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Soltero</option>
						<option value="1">Casado</option> 
	    			</select>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Fecha Nacimiento
	    		</td>
	    		<td>
	    			<input type="text" name="txtFechaNac"/>
	    		</td>
	    		<td>
	    			Hijos
	    		</td>
	    		<td>
	    			<form:input path="txtChildrenInfo"/>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Celular
	    		</td>
	    		<td>
	    			<input type="text" name="txtFechaNac"/>
	    		</td>
	    		<td>
	    			Correo Electrónico
	    		</td>
	    		<td>
	    			<input type="text" name="txtHijos"/>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Modo de Ingreso
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Recibe a Cristo</option>
						<option value="1">Reconciliación</option> 
	    			</select>
	    		</td>
	    		<td>
	    			Invitado por
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Luis Escobar</option>
						<option value="1">Daniel Celestino</option> 
	    			</select>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Información Importante
	    		</td>
	    		<td colspan="3">
	    			<textarea>
	    			</textarea>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Consejero
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Diego Hurtado</option>
						<option value="1">Andrés Salazar</option> 
	    			</select>
	    		</td>
	    		<td>
	    			Consolidador
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Daniel Celestino</option>
						<option value="1">José Rivera</option> 
	    			</select>
	    		</td>
	    	</tr>
	    	
	    	<tr>
	    		<td>
	    			Líder
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Luis Escobar</option>
						<option value="1">Gonzalo Bustos</option> 
	    			</select>
	    		</td>
	    		<td>
	    			Red
	    		</td>
	    		<td>
	    			<select>
						<option value="0">Red José Leal</option>
						<option value="1">Red Luis Escobar</option> 
	    			</select>
	    		</td>
	    	</tr>	
	    	
	    	<tr>
	    		<td colspan="4">
	    			<input type="submit" value="Guardar"/>
	    		</td>
	    	</tr>	
	    	
	    </table>
	</form:form>