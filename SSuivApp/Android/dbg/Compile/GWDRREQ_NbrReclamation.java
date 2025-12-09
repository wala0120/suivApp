/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_NbrReclamation
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



public class GWDRREQ_NbrReclamation extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_NbrReclamation";
}
public String getCodeSQLOriginal()
{
return "SELECT\r\n\tCOUNT(*) AS NbRec\r\nFROM\r\n\tReclamation\r\n\tJOIN\r\n\tAffectation\r\n\tON Reclamation.IDRéclamation = Affectation.IDRéclamation\r\nWHERE\r\n\tAffectation.IDutilisateur = {IDutilisateur#0}\r\n\tAND\r\n\tReclamation.Etat = 2\r\n;\r\n";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Expression varExprAgregat = new Expression(31, "COUNT", "COUNT(*)");
varExprAgregat.ajouterOption(EWDOptionRequete.SELECT, "1");
varExprAgregat.setAlias("NbRec");
varSelect.ajouterElement(varExprAgregat);
From varFrom = new From();
Jointure varJointure = new Jointure();
varJointure.setType(0);
Fichier fic_Reclamation = new Fichier();
fic_Reclamation.setNom("Reclamation");
fic_Reclamation.setAlias("Reclamation");
Fichier fic_Affectation = new Fichier();
fic_Affectation.setNom("Affectation");
fic_Affectation.setAlias("Affectation");
varJointure.setPartieGauche(fic_Reclamation, true);
varJointure.setPartieDroite(fic_Affectation, true);
Expression expr__ = new Expression(9, "=", "Reclamation.IDRéclamation = Affectation.IDRéclamation");
Rubrique rub_IDReclamation = new Rubrique();
rub_IDReclamation.setNom("Reclamation.IDRéclamation");
rub_IDReclamation.setAlias("IDRéclamation");
rub_IDReclamation.setNomFichier("Reclamation");
rub_IDReclamation.setAliasFichier("Reclamation");
expr__.ajouterElement(rub_IDReclamation);
Rubrique rub_IDReclamation_1 = new Rubrique();
rub_IDReclamation_1.setNom("Affectation.IDRéclamation");
rub_IDReclamation_1.setAlias("IDRéclamation");
rub_IDReclamation_1.setNomFichier("Affectation");
rub_IDReclamation_1.setAliasFichier("Affectation");
expr__.ajouterElement(rub_IDReclamation_1);
varJointure.setConditionON(expr__);
varFrom.ajouterElement(varJointure);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr_AND = new Expression(24, "AND", "Affectation.IDutilisateur = {IDutilisateur}\r\n\tAND\r\n\tReclamation.Etat = 2");
Expression expr___1 = new Expression(9, "=", "Affectation.IDutilisateur = {IDutilisateur}");
Rubrique rub_IDutilisateur = new Rubrique();
rub_IDutilisateur.setNom("Affectation.IDutilisateur");
rub_IDutilisateur.setAlias("IDutilisateur");
rub_IDutilisateur.setNomFichier("Affectation");
rub_IDutilisateur.setAliasFichier("Affectation");
expr___1.ajouterElement(rub_IDutilisateur);
Parametre param_IDutilisateur = new Parametre();
param_IDutilisateur.setNom("IDutilisateur");
expr___1.ajouterElement(param_IDutilisateur);
expr_AND.ajouterElement(expr___1);
Expression expr___2 = new Expression(9, "=", "Reclamation.Etat = 2");
Rubrique rub_Etat = new Rubrique();
rub_Etat.setNom("Reclamation.Etat");
rub_Etat.setAlias("Etat");
rub_Etat.setNomFichier("Reclamation");
rub_Etat.setAliasFichier("Reclamation");
expr___2.ajouterElement(rub_Etat);
Literal varLiteral = new Literal();
varLiteral.setValeur("2");
varLiteral.setTypeWL(8);
expr___2.ajouterElement(varLiteral);
expr_AND.ajouterElement(expr___2);
Where varWhere = new Where();
varWhere.ajouterElement(expr_AND);
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
case 1 : return "Affectation";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Reclamation";
case 1 : return "Affectation";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.tracklet.R.raw.req_nbrreclamation;
}
public String getNomFichierWDR()
{
return "req_nbrreclamation";
}
}
