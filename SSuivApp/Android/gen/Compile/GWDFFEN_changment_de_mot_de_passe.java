/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_changment_de_mot_de_passe
 * Date : 04/01/2026 21:15:57
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_changment_de_mot_de_passe extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_changment_de_mot_de_passe
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_ConfirmerMDP
 */
class GWDSAI_ConfirmerMDP extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_changment_de_mot_de_passe.SAI_ConfirmerMDP
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,40);
super.setRectCompPrincipal(2,2,302,40);
super.setQuid(2979894068628629730l);

super.setChecksum("776069799");

super.setNom("SAI_ConfirmerMDP");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(7, 439);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setIndication("Mot de passe");

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFDFDFD, 1, 5));

super.setStyleSaisie(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0x969696, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_ConfirmerMDP mWD_SAI_ConfirmerMDP;

/**
 * BTN_Se_connecter
 */
class GWDBTN_Se_connecter extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_changment_de_mot_de_passe.BTN_Se_connecter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979894068628695266l);

super.setChecksum("776136160");

super.setNom("BTN_Se_connecter");

super.setType(4);

super.setBulle("");

super.setLibelle("Enregistrer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(57, 510);

super.setTailleInitiale(201, 48);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Pict_ok_16_5.png?E5", 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Se_connecter
 */
public void clicSurBoutonGauche()
//  1️⃣ Rechercher l'utilisateur par ID
{
super.clicSurBoutonGauche();

// // 1️⃣ Rechercher l'utilisateur par ID
// SI PAS HReadSeekFirst(Utilisateur, IDutilisateur, CurrentUserID) ALORS
if((!WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),GWDPSSuivApp.getInstance().vWD_CurrentUserID).getBoolean()))
{
// 	Info("Utilisateur introuvable")
WDAPIDialogue.info("Utilisateur introuvable");

// 	RETOUR
return;

}

// SI Utilisateur.mot_De_passe <> SAI_AncienMDP ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mot_de_passe").opDiff(mWD_SAI_AncienMDP))
{
// 	Info("Mot de passe actuel incorrect")
WDAPIDialogue.info("Mot de passe actuel incorrect");

// 	RETOUR
return;

}

// SI SAI_NouveauMDP = "" ALORS
if(mWD_SAI_NouveauMDP.opEgal(""))
{
// 	Info("Le nouveau mot de passe ne peut pas être vide")
WDAPIDialogue.info("Le nouveau mot de passe ne peut pas être vide");

// 	RETOUR
return;

}

// SI SAI_NouveauMDP <> SAI_ConfirmerMDP ALORS
if(mWD_SAI_NouveauMDP.opDiff(mWD_SAI_ConfirmerMDP))
{
// 	Info("La confirmation du mot de passe est incorrecte")
WDAPIDialogue.info("La confirmation du mot de passe est incorrecte");

// 	RETOUR
return;

}

// Utilisateur.mot_De_passe = SAI_NouveauMDP
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mot_de_passe").setValeur(mWD_SAI_NouveauMDP);

// SI HModify(Utilisateur) ALORS
if(WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 	Info("Mot de passe modifié avec succès ✅")
WDAPIDialogue.info("Mot de passe modifié avec succès ✅");

// 	SAI_AncienMDP		= ""
mWD_SAI_AncienMDP.setValeur("");

// 	SAI_NouveauMDP		= ""
mWD_SAI_NouveauMDP.setValeur("");

// 	SAI_ConfirmerMDP	= ""
mWD_SAI_ConfirmerMDP.setValeur("");

// 	Si Utilisateur.Role = 1 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role").opEgal(1))
{
// 		OuvreFenêtreMobile('FEN_ Menu_Commercial')	
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Commercial);

}

// 	SI Utilisateur.Role = 2 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role").opEgal(2))
{
// 		OuvreFenêtreMobile(FEN_Menu_Chauffeur)	
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Chauffeur);

}

}
else
{
// 	Info("Erreur lors de la modification du mot de passe")
WDAPIDialogue.info("Erreur lors de la modification du mot de passe");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Se_connecter mWD_BTN_Se_connecter;

/**
 * LIB_Identification
 */
class GWDLIB_Identification extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_changment_de_mot_de_passe.LIB_Identification
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979894068628760802l);

super.setChecksum("776201240");

super.setNom("LIB_Identification");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ancien mot de passe");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(7, 227);

super.setTailleInitiale(304, 22);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Identification mWD_LIB_Identification;

/**
 * SAI_AncienMDP
 */
class GWDSAI_AncienMDP extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_changment_de_mot_de_passe.SAI_AncienMDP
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,40);
super.setRectCompPrincipal(2,2,302,40);
super.setQuid(2979894369308653756l);

super.setChecksum("808383175");

super.setNom("SAI_AncienMDP");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1, 265);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setIndication("Mot de passe");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFDFDFD, 1, 5));

super.setStyleSaisie(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0x969696, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_AncienMDP mWD_SAI_AncienMDP;

/**
 * LIB_Identification1
 */
class GWDLIB_Identification1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_changment_de_mot_de_passe.LIB_Identification1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979895374331629001l);

super.setChecksum("809011759");

super.setNom("LIB_Identification1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nouveau mot de passe");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 317);

super.setTailleInitiale(304, 22);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Identification1 mWD_LIB_Identification1;

/**
 * SAI_NouveauMDP
 */
class GWDSAI_NouveauMDP extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_changment_de_mot_de_passe.SAI_NouveauMDP
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,40);
super.setRectCompPrincipal(2,2,302,40);
super.setQuid(2979895503181267705l);

super.setChecksum("809631244");

super.setNom("SAI_NouveauMDP");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(7, 351);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setIndication("Mot de passe");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFDFDFD, 1, 5));

super.setStyleSaisie(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0x969696, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_NouveauMDP mWD_SAI_NouveauMDP;

/**
 * LIB_Identification2
 */
class GWDLIB_Identification2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_changment_de_mot_de_passe.LIB_Identification2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979895533246438712l);

super.setChecksum("810031555");

super.setNom("LIB_Identification2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Confirmer le nouveau mot de passe");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 411);

super.setTailleInitiale(304, 22);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(12, 400, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Identification2 mWD_LIB_Identification2;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_changment_de_mot_de_passe.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979896293457989526l);

super.setChecksum("812373434");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-17, -1);

super.setTailleInitiale(358, 213);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Capture d’écran 2026-01-04 195615.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_SansNom1 mWD_IMG_SansNom1;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_changment_de_mot_de_passe.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979904299292721195l);

super.setChecksum("828067223");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(7, 502);

super.setTailleInitiale(42, 56);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(1, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_SansNom2
 */
public void clicSurBoutonGauche()
//  1️⃣ Rechercher l'utilisateur par ID
{
super.clicSurBoutonGauche();

// // 1️⃣ Rechercher l'utilisateur par ID
// SI PAS HReadSeekFirst(Utilisateur, IDutilisateur, CurrentUserID) ALORS
if((!WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),GWDPSSuivApp.getInstance().vWD_CurrentUserID).getBoolean()))
{
// 	Info("Utilisateur introuvable")
WDAPIDialogue.info("Utilisateur introuvable");

// 	RETOUR
return;

}

// SI Utilisateur.Role  = 1 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role").opEgal(1))
{
// 	OuvreFenêtreMobile('FEN_ Menu_Commercial')
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Commercial);

}

// SI Utilisateur.Role  = 2 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role").opEgal(2))
{
// 	OuvreFenêtreMobile(FEN_Menu_Chauffeur)
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Chauffeur);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_SansNom2 mWD_IMG_SansNom2;

/**
 * Traitement: Déclarations globales de FEN_changment_de_mot_de_passe
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_changment_de_mot_de_passe
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_ConfirmerMDP = new GWDSAI_ConfirmerMDP();
mWD_BTN_Se_connecter = new GWDBTN_Se_connecter();
mWD_LIB_Identification = new GWDLIB_Identification();
mWD_SAI_AncienMDP = new GWDSAI_AncienMDP();
mWD_LIB_Identification1 = new GWDLIB_Identification1();
mWD_SAI_NouveauMDP = new GWDSAI_NouveauMDP();
mWD_LIB_Identification2 = new GWDLIB_Identification2();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_changment_de_mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2979894068628498658l);

super.setChecksum("781917737");

super.setNom("FEN_changment_de_mot_de_passe");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xEAEAEA);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 566);

super.setTitre("changment de mot de passe");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(3);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_changment_de_mot_de_passe
////////////////////////////////////////////////////////////////////////////
mWD_SAI_ConfirmerMDP.initialiserObjet();
super.ajouter("SAI_ConfirmerMDP", mWD_SAI_ConfirmerMDP);
mWD_BTN_Se_connecter.initialiserObjet();
super.ajouter("BTN_Se_connecter", mWD_BTN_Se_connecter);
mWD_LIB_Identification.initialiserObjet();
super.ajouter("LIB_Identification", mWD_LIB_Identification);
mWD_SAI_AncienMDP.initialiserObjet();
super.ajouter("SAI_AncienMDP", mWD_SAI_AncienMDP);
mWD_LIB_Identification1.initialiserObjet();
super.ajouter("LIB_Identification1", mWD_LIB_Identification1);
mWD_SAI_NouveauMDP.initialiserObjet();
super.ajouter("SAI_NouveauMDP", mWD_SAI_NouveauMDP);
mWD_LIB_Identification2.initialiserObjet();
super.ajouter("LIB_Identification2", mWD_LIB_Identification2);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPSSuivApp.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPSSuivApp.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPSSuivApp.getInstance().mWD_FEN_changment_de_mot_de_passe;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "180 AQUABLUE#WM";
}
}
