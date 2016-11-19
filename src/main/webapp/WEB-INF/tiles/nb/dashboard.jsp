<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

<h3>Consulta de Nuevos Creyentes</h3>
<form action="findBelievers.htm" method="POST">
	<table border="0" style="">
		<tr>
			<td>Nombres/Apellidos</td>
			<td colspan="3"><input type="text" name="txtName" /></td>
		</tr>

		<tr>
			<td>Red</td>
			<td><select>
					<option value="0">Todas</option>
					<option value="1">Red Luis Escobar</option>
					<option value="2">Red José Leal</option>
			</select></td>
			<td>Consolidador</td>
			<td><select>
					<option value="0">Todas</option>
					<option value="1">Daniel Celestino</option>
					<option value="2">Aaron Leal</option>
			</select></td>
		</tr>

		<tr>
			<td>Fecha</td>
			<td colspan="3">Desde <input type="text" name="txtDateFrom" />
				Hasta <input type="text" name="txtDateTo" />
			</td>
		</tr>

		<tr>
			<td colspan="4"><input type="submit" value="Buscar" /></td>
		</tr>
		<tr>
			<td colspan="4">
				<input type="button" value="Nuevo" onclick="location.href='addBeliever.htm'"/>
			</td>
		</tr>
	</table>

	<display:table name="believerList">
		<display:column property="names" title="Nombres" />
		<display:column property="fatherName" title="Apellido Paterno" />
		<display:column property="motherName" title="Apellido Materno" />
		<display:column property="address" title="Dirección" />
		<display:column property="network.name" title="Red" />
		<display:column property="leader.names" title="Líder" />
		<display:column property="leader.names" title="Consolidador" />
		<display:column property="leader.names" title="Consejero" />
		<display:column property="idBeliever" title="Acciones" paramId="idBeliever"  > 
        	<a href="details.htm?${row.idBeliever}">Ver m&aacute;s</a>
        	<a href="edit.htm?${row.idBeliever}">Editar</a>
        	<a href="delete.htm?${row.idBeliever}">Eliminar</a>
    	</display:column>
	</display:table>

</form>