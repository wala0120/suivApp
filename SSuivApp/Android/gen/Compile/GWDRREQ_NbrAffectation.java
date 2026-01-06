/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_NbrAffectation
 * Date : 04/01/2026 21:15:58
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_NbrAffectation extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_NbrAffectation";
}
public String getCodeSQLOriginal()
{
return "SELECT\r\n\tSUM(CASE WHEN HasRole1 = 1 THEN 1 ELSE 0 END) AS NbAffected,\r\n\tSUM(CASE WHEN HasRole1 = 0 THEN 1 ELSE 0 END) AS NbNonAffected\r\nFROM\r\n\t( SELECT\r\n\t\tR.IDRéclamation, -- HasRole1 = 1 if at least one assigned user has Role = 1\r\n\t\tMAX(CASE WHEN U.Role = 1 THEN 1 ELSE 0 END) AS HasRole1\r\n\tFROM\r\n\t\tReclamation R\r\n\t\tLEFT JOIN\r\n\t\tAffectation A\r\n\t\tON R.IDRéclamation = A.IDRéclamation\r\n\t\tLEFT JOIN\r\n\t\tUtilisateur U\r\n\t\tON A.IDutilisateur = U.IDutilisateur\r\n\tGROUP BY\r\n\t\tR.IDRéclamation\r\n\t) AS Sub\r\n;\r\n";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Expression varExprAgregat = new Expression(28, "SUM", "SUM(CASE WHEN HasRole1 = 1 THEN 1 ELSE 0 END)");
varExprAgregat.ajouterOption(EWDOptionRequete.SELECT, "1");
Expression expr_CASE = new Expression(107, "CASE", "CASE WHEN HasRole1 = 1 THEN 1 ELSE 0 END");
Expression expr__ = new Expression(9, "=", "HasRole1 = 1");
Rubrique rub_HasRole1 = new Rubrique();
rub_HasRole1.setNom("Sub.HasRole1");
rub_HasRole1.setAlias("HasRole1");
rub_HasRole1.setNomFichier("Sub");
rub_HasRole1.setAliasFichier("Sub");
expr__.ajouterElement(rub_HasRole1);
Literal varLiteral = new Literal();
varLiteral.setValeur("1");
varLiteral.setTypeWL(8);
expr__.ajouterElement(varLiteral);
expr_CASE.ajouterElement(expr__);
Literal varLiteral_1 = new Literal();
varLiteral_1.setValeur("1");
varLiteral_1.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_1);
Literal varLiteral_2 = new Literal();
varLiteral_2.setValeur("0");
varLiteral_2.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_2);
varExprAgregat.setAlias("NbAffected");
varExprAgregat.ajouterElement(expr_CASE);
varSelect.ajouterElement(varExprAgregat);
Expression varExprAgregat_1 = new Expression(28, "SUM", "SUM(CASE WHEN HasRole1 = 0 THEN 1 ELSE 0 END)");
varExprAgregat_1.ajouterOption(EWDOptionRequete.SELECT, "1");
Expression expr_CASE_1 = new Expression(107, "CASE", "CASE WHEN HasRole1 = 0 THEN 1 ELSE 0 END");
Expression expr___1 = new Expression(9, "=", "HasRole1 = 0");
Rubrique rub_HasRole1_1 = new Rubrique();
rub_HasRole1_1.setNom("Sub.HasRole1");
rub_HasRole1_1.setAlias("HasRole1");
rub_HasRole1_1.setNomFichier("Sub");
rub_HasRole1_1.setAliasFichier("Sub");
expr___1.ajouterElement(rub_HasRole1_1);
Literal varLiteral_3 = new Literal();
varLiteral_3.setValeur("0");
varLiteral_3.setTypeWL(8);
expr___1.ajouterElement(varLiteral_3);
expr_CASE_1.ajouterElement(expr___1);
Literal varLiteral_4 = new Literal();
varLiteral_4.setValeur("1");
varLiteral_4.setTypeWL(8);
expr_CASE_1.ajouterElement(varLiteral_4);
Literal varLiteral_5 = new Literal();
varLiteral_5.setValeur("0");
varLiteral_5.setTypeWL(8);
expr_CASE_1.ajouterElement(varLiteral_5);
varExprAgregat_1.setAlias("NbNonAffected");
varExprAgregat_1.ajouterElement(expr_CASE_1);
varSelect.ajouterElement(varExprAgregat_1);
From varFrom = new From();
Select varSelect_1 = new Select();
varSelect_1.setType(1);
Rubrique rub_IDReclamation = new Rubrique();
rub_IDReclamation.setNom("IDRéclamation");
rub_IDReclamation.setAlias("IDRéclamation");
rub_IDReclamation.setNomFichier("Reclamation");
rub_IDReclamation.setAliasFichier("R");
varSelect_1.ajouterElement(rub_IDReclamation);
Expression varExprAgregat_2 = new Expression(30, "MAX", "MAX(CASE WHEN U.Role = 1 THEN 1 ELSE 0 END)");
varExprAgregat_2.ajouterOption(EWDOptionRequete.SELECT, "1");
Expression expr_CASE_2 = new Expression(107, "CASE", "CASE WHEN U.Role = 1 THEN 1 ELSE 0 END");
Expression expr___2 = new Expression(9, "=", "U.Role = 1");
Rubrique rub_Role = new Rubrique();
rub_Role.setNom("Utilisateur.Role");
rub_Role.setAlias("Role");
rub_Role.setNomFichier("Utilisateur");
rub_Role.setAliasFichier("U");
expr___2.ajouterElement(rub_Role);
Literal varLiteral_6 = new Literal();
varLiteral_6.setValeur("1");
varLiteral_6.setTypeWL(8);
expr___2.ajouterElement(varLiteral_6);
expr_CASE_2.ajouterElement(expr___2);
Literal varLiteral_7 = new Literal();
varLiteral_7.setValeur("1");
varLiteral_7.setTypeWL(8);
expr_CASE_2.ajouterElement(varLiteral_7);
Literal varLiteral_8 = new Literal();
varLiteral_8.setValeur("0");
varLiteral_8.setTypeWL(8);
expr_CASE_2.ajouterElement(varLiteral_8);
varExprAgregat_2.setAlias("HasRole1");
varExprAgregat_2.ajouterElement(expr_CASE_2);
varSelect_1.ajouterElement(varExprAgregat_2);
From varFrom_1 = new From();
Jointure varJointure = new Jointure();
varJointure.setType(3);
Jointure varJointure_1 = new Jointure();
varJointure_1.setType(3);
Fichier fic_R = new Fichier();
fic_R.setNom("Reclamation");
fic_R.setAlias("R");
Fichier fic_A = new Fichier();
fic_A.setNom("Affectation");
fic_A.setAlias("A");
varJointure_1.setPartieGauche(fic_R, true);
varJointure_1.setPartieDroite(fic_A, true);
Expression expr___3 = new Expression(9, "=", "R.IDRéclamation = A.IDRéclamation");
Rubrique rub_IDReclamation_1 = new Rubrique();
rub_IDReclamation_1.setNom("Reclamation.IDRéclamation");
rub_IDReclamation_1.setAlias("IDRéclamation");
rub_IDReclamation_1.setNomFichier("Reclamation");
rub_IDReclamation_1.setAliasFichier("R");
expr___3.ajouterElement(rub_IDReclamation_1);
Rubrique rub_IDReclamation_2 = new Rubrique();
rub_IDReclamation_2.setNom("Affectation.IDRéclamation");
rub_IDReclamation_2.setAlias("IDRéclamation");
rub_IDReclamation_2.setNomFichier("Affectation");
rub_IDReclamation_2.setAliasFichier("A");
expr___3.ajouterElement(rub_IDReclamation_2);
varJointure_1.setConditionON(expr___3);
Fichier fic_U = new Fichier();
fic_U.setNom("Utilisateur");
fic_U.setAlias("U");
varJointure.setPartieGauche(varJointure_1, false);
varJointure.setPartieDroite(fic_U, true);
Expression expr___4 = new Expression(9, "=", "A.IDutilisateur = U.IDutilisateur");
Rubrique rub_IDutilisateur = new Rubrique();
rub_IDutilisateur.setNom("Affectation.IDutilisateur");
rub_IDutilisateur.setAlias("IDutilisateur");
rub_IDutilisateur.setNomFichier("Affectation");
rub_IDutilisateur.setAliasFichier("A");
expr___4.ajouterElement(rub_IDutilisateur);
Rubrique rub_IDutilisateur_1 = new Rubrique();
rub_IDutilisateur_1.setNom("Utilisateur.IDutilisateur");
rub_IDutilisateur_1.setAlias("IDutilisateur");
rub_IDutilisateur_1.setNomFichier("Utilisateur");
rub_IDutilisateur_1.setAliasFichier("U");
expr___4.ajouterElement(rub_IDutilisateur_1);
varJointure.setConditionON(expr___4);
varFrom_1.ajouterElement(varJointure);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect_1);
varReqSelect.ajouterClause(varFrom_1);
GroupBy varGroupeBy = new GroupBy();
Rubrique rub_IDReclamation_3 = new Rubrique();
rub_IDReclamation_3.setNom("IDRéclamation");
rub_IDReclamation_3.setAlias("IDRéclamation");
rub_IDReclamation_3.setNomFichier("Reclamation");
rub_IDReclamation_3.setAliasFichier("R");
varGroupeBy.ajouterElement(rub_IDReclamation_3);
varReqSelect.ajouterClause(varGroupeBy);
Limit varLimit = new Limit();
varLimit.setType(0);
varLimit.setNbEnregs(0);
varLimit.setOffset(0);
varReqSelect.ajouterClause(varLimit);
varReqSelect.setAlias("Sub");
varFrom.ajouterElement(varReqSelect);
Requete varReqSelect_1 = new Requete(1);
varReqSelect_1.ajouterClause(varSelect);
varReqSelect_1.ajouterClause(varFrom);
Limit varLimit_1 = new Limit();
varLimit_1.setType(0);
varLimit_1.setNbEnregs(0);
varLimit_1.setOffset(0);
varReqSelect_1.ajouterClause(varLimit_1);
return varReqSelect_1;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Reclamation";
case 1 : return "Affectation";
case 2 : return "Utilisateur";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "R";
case 1 : return "A";
case 2 : return "U";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.tracklet.R.raw.req_nbraffectation;
}
public String getNomFichierWDR()
{
return "req_nbraffectation";
}
}
