/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_Reclamation
 * Date : 09/12/2025 23:56:11
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_Reclamation extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_Reclamation";
}
public String getCodeSQLOriginal()
{
return " SELECT  Reclamation.IDRéclamation AS IDRéclamation,\t Reclamation.Num_facture AS Num_facture,\t Reclamation.Etat AS Etat,\t Reclamation.Date AS Date,\t Reclamation.Probleme AS Probleme,\t Reclamation.IDmagasin AS IDmagasin  FROM  Reclamation  WHERE   Reclamation.Num_facture = {ParamNum_facture#0}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_IDReclamation = new Rubrique();
rub_IDReclamation.setNom("IDRéclamation");
rub_IDReclamation.setAlias("IDRéclamation");
rub_IDReclamation.setNomFichier("Reclamation");
rub_IDReclamation.setAliasFichier("Reclamation");
varSelect.ajouterElement(rub_IDReclamation);
Rubrique rub_Num_facture = new Rubrique();
rub_Num_facture.setNom("Num_facture");
rub_Num_facture.setAlias("Num_facture");
rub_Num_facture.setNomFichier("Reclamation");
rub_Num_facture.setAliasFichier("Reclamation");
varSelect.ajouterElement(rub_Num_facture);
Rubrique rub_Etat = new Rubrique();
rub_Etat.setNom("Etat");
rub_Etat.setAlias("Etat");
rub_Etat.setNomFichier("Reclamation");
rub_Etat.setAliasFichier("Reclamation");
varSelect.ajouterElement(rub_Etat);
Rubrique rub_DATE = new Rubrique();
rub_DATE.setNom("DATE");
rub_DATE.setAlias("DATE");
rub_DATE.setNomFichier("Reclamation");
rub_DATE.setAliasFichier("Reclamation");
varSelect.ajouterElement(rub_DATE);
Rubrique rub_Probleme = new Rubrique();
rub_Probleme.setNom("Probleme");
rub_Probleme.setAlias("Probleme");
rub_Probleme.setNomFichier("Reclamation");
rub_Probleme.setAliasFichier("Reclamation");
varSelect.ajouterElement(rub_Probleme);
Rubrique rub_IDmagasin = new Rubrique();
rub_IDmagasin.setNom("IDmagasin");
rub_IDmagasin.setAlias("IDmagasin");
rub_IDmagasin.setNomFichier("Reclamation");
rub_IDmagasin.setAliasFichier("Reclamation");
varSelect.ajouterElement(rub_IDmagasin);
From varFrom = new From();
Fichier fic_Reclamation = new Fichier();
fic_Reclamation.setNom("Reclamation");
fic_Reclamation.setAlias("Reclamation");
varFrom.ajouterElement(fic_Reclamation);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "Reclamation.Num_facture = {ParamNum_facture}");
Rubrique rub_Num_facture_1 = new Rubrique();
rub_Num_facture_1.setNom("Reclamation.Num_facture");
rub_Num_facture_1.setAlias("Num_facture");
rub_Num_facture_1.setNomFichier("Reclamation");
rub_Num_facture_1.setAliasFichier("Reclamation");
expr__.ajouterElement(rub_Num_facture_1);
Parametre param_ParamNum_facture = new Parametre();
param_ParamNum_facture.setNom("ParamNum_facture");
expr__.ajouterElement(param_ParamNum_facture);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
Limit varLimit = new Limit();
varLimit.setType(0);
varLimit.setNbEnregs(0);
varLimit.setOffset(0);
varReqSelect.ajouterClause(varLimit);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Reclamation";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Reclamation";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.tracklet.R.raw.req_reclamation;
}
public String getNomFichierWDR()
{
return "req_reclamation";
}
}
