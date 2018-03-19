<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<section class="tables">   
            <div class="container-fluid">
              <div class="row">
                <div class="col-lg-12">
 
  <c:if test="${ !empty fichier }"><p><c:out value="Le fichier ${ fichier }  a été uploadé !" /></p></c:if>
  <c:if test="${ !empty message }"><p><c:out value="Message: ${ message } " /></p></c:if>

<form method="post" action="import" enctype="multipart/form-data">
            <div class="form-group row">
            <label for="inputFile" class="col-sm-2 col-form-label">Parcourir un fichier:</label>
				<input type="file" id="file" name="fichier">
			
			</label>
			</div>
			<div class="form-group row">
			 <label for="inputSelect" class="col-sm-2 col-form-label">Importation de données</label>
            <select class="custom-select" name="type_import">
				<option selected>Choisir le type de données</option>
				<option value="1">Résultat Bac</option>
				<option value="2">Données pré-inscription</option>
				
			</select>
            </div>
            
            <div class="form-group row">
			 <label for="inputSelect" class="col-sm-2 col-form-label">Année</label>
            <select class="custom-select" name="annee">
				<option value="2017">2017</option>
				<option value="2016">2016</option>
				<option value="2015">2015</option>
			</select>
            </div>
            
            <div class="form-group row">
            <label for="inputSubmit" class="col-sm-2 col-form-label"></label>
            <input type="submit" value="Envoyer" class="btn btn-primary"/>
            </div>
</form>
  



</div>
</div>
</div>
