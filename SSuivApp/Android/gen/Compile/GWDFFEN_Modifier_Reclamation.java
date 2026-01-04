/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Modifier_Reclamation
 * Date : 28/12/2025 21:52:53
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.erreur.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Modifier_Reclamation extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Modifier_Reclamation
////////////////////////////////////////////////////////////////////////////

/**
 * Modifier_Reclamation
 */
class GWDModifier_Reclamation extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Modifier_Reclamation.Modifier_Reclamation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975821353024814441l);

super.setChecksum("794640514");

super.setNom("Modifier_Reclamation");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Modifier Réclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 2);

super.setTailleInitiale(304, 44);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x696969, 0xEEEEEE, creerPolice_GEN("Roboto", -11.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xE1E1E1, 0x616161, 0xEEEEEE, 10.000000, 10.000000, 1, 1), 0, 0, 0, 0);


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
public GWDModifier_Reclamation mWD_Modifier_Reclamation;

/**
 * SAI_TexteInterne1
 */
class GWDSAI_TexteInterne1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Modifier_Reclamation.SAI_TexteInterne1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,293,22);
super.setRectCompPrincipal(76,22,214,40);
super.setQuid(2975821353024945513l);

super.setChecksum("794771130");

super.setNom("SAI_TexteInterne1");

super.setType(20001);

super.setBulle("");

super.setLibelle("N° facture");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 65);

super.setTailleInitiale(293, 65);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("reclamation", "num_facture");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 500, 0);

super.setEllipse(0);

super.setIndication("");

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

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0x969696, 0x161616, 0xFDFDFD, 2.000000, 2.000000, 1, 1));

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
public GWDSAI_TexteInterne1 mWD_SAI_TexteInterne1;

/**
 * SAI_Date1
 */
class GWDSAI_Date1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Modifier_Reclamation.SAI_Date1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,289,21);
super.setRectCompPrincipal(76,21,213,36);
super.setQuid(2975821353025142137l);

super.setChecksum("795060676");

super.setNom("SAI_Date1");

super.setType(20002);

super.setBulle("");

super.setLibelle("Date");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 210);

super.setTailleInitiale(289, 59);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setLiaisonFichier("reclamation", "date");

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("UseDatePickerDateMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 500, 0);

super.setEllipse(0);

super.setIndication("");

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

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0x969696, 0x161616, 0xFDFDFD, 2.000000, 2.000000, 1, 1));

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
public GWDSAI_Date1 mWD_SAI_Date1;

/**
 * COMBO_Problèmes
 */
class GWDCOMBO_Problemes extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Modifier_Reclamation.COMBO_Problèmes
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,304,19);
super.setRectCompPrincipal(73,19,231,42);
super.setQuid(2975821353025404297l);

super.setChecksum("804131394");

super.setNom("COMBO_Problèmes");

super.setType(10002);

super.setBulle("");

super.setLibelle("Problèmes");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 278);

super.setTailleInitiale(304, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setLiaisonFichier("reclamation", "probleme");

super.setContenuInitial("Cachet non apposé\r\nBon de commande non disponible\r\npré facture  non transmise au magasin \r\nabsence du responsable pour signature ");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 500, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -7.000000, 0), 2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0x969696, 0x161616, 0xFDFDFD, 2.000000, 2.000000, 1, 1));

super.setStyleElement(0x2D2D2D, 0xFDFDFD, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 48);

super.setStyleSelection(0x653D0C, 0xFBE1BD, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

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
public GWDCOMBO_Problemes mWD_COMBO_Problemes;

/**
 * Bouton2
 */
class GWDBouton2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Modifier_Reclamation.Bouton2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975821353025535369l);

super.setChecksum("795361898");

super.setNom("Bouton2");

super.setType(4);

super.setBulle("");

super.setLibelle("Enregistrer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(81, 410);

super.setTailleInitiale(185, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), 0, 0x7A6E6A);

super.setStyleLibelleSurvol(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), 0, 0x7A6E6A);

super.setStyleLibelleEnfonce(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), 0, 0x7A6E6A);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xEEEEEE, 0x6E6E6E, 0xEEEEEE, 13.000000, 13.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xEEEEEE, 0x6E6E6E, 0xEEEEEE, 13.000000, 13.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xEEEEEE, 0x6E6E6E, 0xEEEEEE, 13.000000, 13.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBooking2_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Bouton2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_nIndex = new WDEntier4();

WDObjet vWD_IdMagasin = new WDEntier4();



// EcranVersFichier()
WDAPIFenetre.ecranVersFichier();

// SI CurrentUserID = 0 ALORS
if(GWDPSSuivApp.getInstance().vWD_CurrentUserID.opEgal(0))
{
// 	Info("Utilisateur non connecté")
WDAPIDialogue.info("Utilisateur non connecté");

// 	RETOUR
return;

}

// nIndex est un entier = COMBO_Magasins.Valeur

vWD_nIndex.setValeur(mWD_COMBO_Magasins.getProp(EWDPropriete.PROP_VALEUR));


// SI nIndex = 0 ALORS
if(vWD_nIndex.opEgal(0))
{
// 	Info("Veuillez choisir un magasin")
WDAPIDialogue.info("Veuillez choisir un magasin");

// 	RETOUR
return;

}

// Erreur sur l'objet: FEN_Modifier_Reclamation.Bouton2
// 	Traitement : Clic sur Bouton2 (18)
// 	Code: 301
// 	Message: L'élément 'TabMagasinID' est inconnu ou inaccessible.
// 	Ligne : 16, Colonne : 26
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Modifier_Reclamation.Bouton2\r\n\tTraitement : Clic sur Bouton2 (18)\r\n\tCode: 301\r\n\tMessage: L'élément 'TabMagasinID' est inconnu ou inaccessible.\r\n\tLigne : 16, Colonne : 26\r\n\r\n");


// // IdMagasin est un entier = TabMagasinID[nIndex]
// 
// vWD_IdMagasin.setValeur();
// 
// 

// // SI HReadSeekFirst(Magasin, "IDMagasin", IdMagasin) ALORS
// if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("magasin"),new WDChaineU("IDMagasin"),vWD_IdMagasin).getBoolean())
// {
// // 	Reclamation.IDMagasin = IdMagasin
// WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idmagasin").setValeur(vWD_IdMagasin);
// 
// // 	SI HAdd(Reclamation) = Faux ALORS
// if(WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("reclamation")).opEgal(false))
// {
// // 		Info("Erreur d'enregistrement : " + HErreurInfo())
// WDAPIDialogue.info(new WDChaineU("Erreur d'enregistrement : ").opPlus(WDAPIHF.hErreurInfo()).getString());
// 
// }
// else
// {
// // 		nIDReclamation est un entier = Reclamation.IDReclamation
// WDObjet vWD_nIDReclamation = new WDEntier4();
// 
// 
// vWD_nIDReclamation.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));
// 
// 
// // 		Affectation.IDUtilisateur	= CurrentUserID
// WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idutilisateur").setValeur(GWDPSSuivApp.getInstance().vWD_CurrentUserID);
// 
// // 		Affectation.IDReclamation	= nIDReclamation
// WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idreclamation").setValeur(vWD_nIDReclamation);
// 
// // 		SI HAdd(Affectation) = Faux ALORS
// if(WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("affectation")).opEgal(false))
// {
// // 			Info("Erreur lors de l'ajout dans Affectation : " + HErreurInfo())
// WDAPIDialogue.info(new WDChaineU("Erreur lors de l'ajout dans Affectation : ").opPlus(WDAPIHF.hErreurInfo()).getString());
// 
// }
// else
// {
// // 			Info("Réclamation et affectation ajoutées avec succès")
// WDAPIDialogue.info("Réclamation et affectation ajoutées avec succès");
// 
// // 			Ferme(FEN_Liste_Reclamation_Chauffeur)
// WDAPIFenetre.ferme(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Chauffeur);
// 
// // 			OuvreFenêtreMobile(FEN_Liste_Reclamation_Chauffeur)
// WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Chauffeur);
// 
// }
// 
// }
// 
// }
// else
// {
// // 	Info("Magasin invalide")
// WDAPIDialogue.info("Magasin invalide");
// 
// }
// 
// // EcranVersFichier()
// WDAPIFenetre.ecranVersFichier();
// 
// // HEnregistre(Reclamation)  
// WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("reclamation"));
// 
// // Ferme()
// WDAPIFenetre.ferme();
// 
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
public GWDBouton2 mWD_Bouton2;

/**
 * Image4
 */
class GWDImage4 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Modifier_Reclamation.Image4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975821353025666441l);

super.setChecksum("795494794");

super.setNom("Image4");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(33, 410);

super.setTailleInitiale(28, 47);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\diskette.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

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

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), -1, 0, 0x7A6E6A);

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
public GWDImage4 mWD_Image4;

/**
 * COMBO_Etat
 */
class GWDCOMBO_Etat extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Modifier_Reclamation.COMBO_Etat
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,304,21);
super.setRectCompPrincipal(76,21,213,40);
super.setQuid(2975821353026059657l);

super.setChecksum("800338754");

super.setNom("COMBO_Etat");

super.setType(10002);

super.setBulle("");

super.setLibelle("Etat");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 139);

super.setTailleInitiale(304, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setLiaisonFichier("reclamation", "etat");

super.setContenuInitial("Récupéré\r\nnon récupéré");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 500, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0x969696, 0x161616, 0xFDFDFD, 2.000000, 2.000000, 1, 1));

super.setStyleElement(0x2D2D2D, 0xFDFDFD, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 48);

super.setStyleSelection(0x653D0C, 0xFBE1BD, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

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
public GWDCOMBO_Etat mWD_COMBO_Etat;

/**
 * COMBO_Magasins
 */
class GWDCOMBO_Magasins extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Modifier_Reclamation.COMBO_Magasins
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,306,21);
super.setRectCompPrincipal(73,21,233,33);
super.setQuid(2975821353026321801l);

super.setChecksum("807256898");

super.setNom("COMBO_Magasins");

super.setType(10002);

super.setBulle("");

super.setLibelle("Magasins");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 347);

super.setTailleInitiale(306, 56);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setLiaisonFichier("magasin", "nommagasin");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(8, 1000, 1000, 1000, 500, 0);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Combo.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFDFDFD, 1, 5));

super.setStyleElement(0x2D2D2D, 0xFDFDFD, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 48);

super.setStyleSelection(0x653D0C, 0xFBE1BD, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Entrée dans COMBO_Magasins
 */
public void entreeChamp()
//  Clear combo
{
super.entreeChamp();

// 
// COMBO_Magasins..Valeur = ""
this.setProp(EWDPropriete.PROP_VALEUR,"");

// COMBO_Magasins.SupprimeTout()
WDAPIListe.listeSupprimeTout(this);

// SI HLitPremier(Magasin) ALORS
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("magasin")).getBoolean())
{
// 	TANTQUE PAS HOut(Magasin)
while((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("magasin")).getBoolean()))
{
// 		COMBO_Magasins.Ajoute(Magasin.NomMagasin + " - " + Magasin.Adresse)		
WDAPIListe.listeAjoute(this,WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("nommagasin").opPlus(" - ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("adresse")).getString());

// 		HReadNext(Magasin)
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("magasin"));

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurFocus();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_Magasins mWD_COMBO_Magasins;

/**
 * _2
 */
class GWD_2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Modifier_Reclamation._2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975821353026452888l);

super.setChecksum("796278961");

super.setNom("_2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 468);

super.setTailleInitiale(315, 55);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xE1E1E1, 0x616161, 0xFFFFFF, 50.000000, 50.000000, 1, 1), 0, 0, 0, 0);


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
public GWD_2 mWD__2;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Modifier_Reclamation.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975821353026583960l);

super.setChecksum("796412313");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(19, 467);

super.setTailleInitiale(42, 56);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

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
 * Traitement: Clic sur IMG_SansNom1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Liste_Reclamation_Chauffeur)
// OuvreFenêtreMobile(FEN_Liste_Reclamation_Chauffeur)
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Chauffeur);

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
public GWDIMG_SansNom1 mWD_IMG_SansNom1;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Modifier_Reclamation.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975821353026846104l);

super.setChecksum("796674457");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(142, 472);

super.setTailleInitiale(45, 42);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\list.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

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
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile('FEN_menu réclamation')
// Erreur sur l'objet: FEN_Modifier_Reclamation.IMG_SansNom2
// 	Traitement : Clic sur IMG_SansNom2 (18)
// 	Code: 301
// 	Message: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.
// 	Ligne : 0, Colonne : 19
// 
// 
// Erreur sur l'objet: FEN_Modifier_Reclamation.IMG_SansNom2
// 	Traitement : Clic sur IMG_SansNom2 (18)
// 	Code: 301
// 	Message: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.
// 	Ligne : 0, Colonne : 19
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Modifier_Reclamation.IMG_SansNom2\r\n\tTraitement : Clic sur IMG_SansNom2 (18)\r\n\tCode: 301\r\n\tMessage: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.\r\n\tLigne : 0, Colonne : 19\r\n\r\n\r\nErreur sur l'objet: FEN_Modifier_Reclamation.IMG_SansNom2\r\n\tTraitement : Clic sur IMG_SansNom2 (18)\r\n\tCode: 301\r\n\tMessage: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.\r\n\tLigne : 0, Colonne : 19\r\n\r\n");


// // OuvreFenêtreMobile('FEN_menu réclamation')
// WDAPIFenetre.ouvreFille();
// 

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
 * Traitement: Déclarations globales de FEN_Modifier_Reclamation
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
// Création des champs de la fenêtre FEN_Modifier_Reclamation
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_Modifier_Reclamation = new GWDModifier_Reclamation();
mWD_SAI_TexteInterne1 = new GWDSAI_TexteInterne1();
mWD_SAI_Date1 = new GWDSAI_Date1();
mWD_COMBO_Problemes = new GWDCOMBO_Problemes();
mWD_Bouton2 = new GWDBouton2();
mWD_Image4 = new GWDImage4();
mWD_COMBO_Etat = new GWDCOMBO_Etat();
mWD_COMBO_Magasins = new GWDCOMBO_Magasins();
mWD__2 = new GWD_2();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Modifier_Reclamation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2975821082441155715l);

super.setChecksum("799920014");

super.setNom("FEN_Modifier_Reclamation");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xEAEAEA);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Modifier Reclamation");

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
// Initialisation des champs de FEN_Modifier_Reclamation
////////////////////////////////////////////////////////////////////////////
mWD_Modifier_Reclamation.initialiserObjet();
super.ajouter("Modifier_Reclamation", mWD_Modifier_Reclamation);
mWD_SAI_TexteInterne1.initialiserObjet();
super.ajouter("SAI_TexteInterne1", mWD_SAI_TexteInterne1);
mWD_SAI_Date1.initialiserObjet();
super.ajouter("SAI_Date1", mWD_SAI_Date1);
mWD_COMBO_Problemes.initialiserObjet();
super.ajouter("COMBO_Problèmes", mWD_COMBO_Problemes);
mWD_Bouton2.initialiserObjet();
super.ajouter("Bouton2", mWD_Bouton2);
mWD_Image4.initialiserObjet();
super.ajouter("Image4", mWD_Image4);
mWD_COMBO_Etat.initialiserObjet();
super.ajouter("COMBO_Etat", mWD_COMBO_Etat);
mWD_COMBO_Magasins.initialiserObjet();
super.ajouter("COMBO_Magasins", mWD_COMBO_Magasins);
mWD__2.initialiserObjet();
super.ajouter("_2", mWD__2);
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
return GWDPSSuivApp.getInstance().mWD_FEN_Modifier_Reclamation;
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
