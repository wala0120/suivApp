/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Ajout_affectation
 * Date : 09/12/2025 23:56:10
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Ajout_affectation extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Ajout_affectation
////////////////////////////////////////////////////////////////////////////

/**
 * Bon_de_réception
 */
class GWDBon_de_reception extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Ajout_affectation.Bon_de_réception
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969475225504268198l);

super.setChecksum("985069306");

super.setNom("Bon_de_réception");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ajout affectation ");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(314, 44);

super.setPlan(0);

super.setCadrageHorizontal(0);

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
public GWDBon_de_reception mWD_Bon_de_reception;

/**
 * Bouton4
 */
class GWDBouton4 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Ajout_affectation.Bouton4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969475225504399270l);

super.setChecksum("985200834");

super.setNom("Bouton4");

super.setType(4);

super.setBulle("");

super.setLibelle("Enregistrer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(68, 394);

super.setTailleInitiale(185, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

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
 * Traitement: Initialisation de Bouton4
 */
public void init()
{
super.init();

// HLitRecherchePremier(Reclamation, IDRéclamation, SAI_NumFacture)
//MAP:2935b1fc11833fa6:0000000e:1:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Initialisation de Bouton4
// HLitRecherchePremier(Reclamation, IDRéclamation, SAI_NumFacture)
//MAP:2935b1fc11833fa6:0000000e:1:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Initialisation de Bouton4
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("reclamation"),WDAPIHF.getRubriqueSansCasseNiAccent("idreclamation"),mWD_SAI_NumFacture);

}




/**
 * Traitement: Clic sur Bouton4
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:2935b1fc11833fa6:00000012:1:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Clic sur Bouton4
// EcranVersFichier()
//MAP:2935b1fc11833fa6:00000012:2:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Clic sur Bouton4
WDAPIFenetre.ecranVersFichier();

// Affectation.IDRéclamation = IDReclamationGlobal
//MAP:2935b1fc11833fa6:00000012:3:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Clic sur Bouton4
WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idreclamation").setValeur(GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal);

// Affectation.IDutilisateur =  TabChauffeurID[1]
//MAP:2935b1fc11833fa6:00000012:4:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Clic sur Bouton4
WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idutilisateur").setValeur(vWD_TabChauffeurID.get(1));

// HAjoute(Affectation)  
//MAP:2935b1fc11833fa6:00000012:5:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Clic sur Bouton4
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("affectation"));

// Ferme()
//MAP:2935b1fc11833fa6:00000012:6:FEN_Ajout_affectation.Bouton4:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDBouton4:Clic sur Bouton4
WDAPIFenetre.ferme();

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
public GWDBouton4 mWD_Bouton4;

/**
 * Image5
 */
class GWDImage5 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Ajout_affectation.Image5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969475225504464806l);

super.setChecksum("985268194");

super.setNom("Image5");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(25, 378);

super.setTailleInitiale(35, 72);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\diskette.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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
public GWDImage5 mWD_Image5;

/**
 * COMBO_NomComerciale
 */
class GWDCOMBO_NomComerciale extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Ajout_affectation.COMBO_NomComerciale
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,306,19);
super.setRectCompPrincipal(125,19,181,47);
super.setQuid(2969475225504530342l);

super.setChecksum("992376473");

super.setNom("COMBO_NomComerciale");

super.setType(10002);

super.setBulle("");

super.setLibelle("Nom de commerciale");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(7, 220);

super.setTailleInitiale(306, 68);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -7.000000, 0), 2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Combo.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFDFDFD, 1, 5));

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
public GWDCOMBO_NomComerciale mWD_COMBO_NomComerciale;

/**
 * SAI_NumFacture
 */
class GWDSAI_NumFacture extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Ajout_affectation.SAI_NumFacture
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,304,19);
super.setRectCompPrincipal(123,19,181,40);
super.setQuid(2970266521447924448l);

super.setChecksum("744228890");

super.setNom("SAI_NumFacture");

super.setType(20001);

super.setBulle("");

super.setLibelle("Num Facture");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(9, 285);

super.setTailleInitiale(304, 61);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

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

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -7.000000, 0), 2, 0, 0x2D2D2D);

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
public GWDSAI_NumFacture mWD_SAI_NumFacture;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Ajout_affectation.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970278182269219216l);

super.setChecksum("729320469");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(15, 522);

super.setTailleInitiale(33, 38);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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

// OuvreFenêtreMobile(FEN_Liste_Reclamation_Admin)
//MAP:29388c45023ff190:00000012:1:FEN_Ajout_affectation.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDIMG_SansNom1:Clic sur IMG_SansNom1
// OuvreFenêtreMobile(FEN_Liste_Reclamation_Admin)
//MAP:29388c45023ff190:00000012:1:FEN_Ajout_affectation.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation$GWDIMG_SansNom1:Clic sur IMG_SansNom1
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Admin);

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
 * Traitement: Déclarations globales de FEN_Ajout_affectation
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
//MAP:2935b1fc11803fa6:00000000:1:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Déclarations globales de FEN_Ajout_affectation
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// TabReclamationID est un tableau d’entiers
//MAP:2935b1fc11803fa6:00000000:2:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Déclarations globales de FEN_Ajout_affectation
vWD_TabReclamationID = new WDTableauSimple(1, new int[]{0}, 0, 8);
super.ajouterVariableGlobale("TabReclamationID",vWD_TabReclamationID);



// TabChauffeurID est un tableau d’entiers
//MAP:2935b1fc11803fa6:00000000:3:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Déclarations globales de FEN_Ajout_affectation
vWD_TabChauffeurID = new WDTableauSimple(1, new int[]{0}, 0, 8);
super.ajouterVariableGlobale("TabChauffeurID",vWD_TabChauffeurID);



}




/**
 * Traitement: Fin d'initialisation de FEN_Ajout_affectation
 */
public void init()
{
super.init();

// COMBO_NomComerciale.SupprimeTout()
//MAP:2935b1fc11803fa6:00000022:1:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
// COMBO_NomComerciale.SupprimeTout()
//MAP:2935b1fc11803fa6:00000022:1:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPIListe.listeSupprimeTout(mWD_COMBO_NomComerciale);

// IF IDReclamationGlobal <> 0 THEN
//MAP:2935b1fc11803fa6:00000022:2:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
if(GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal.opDiff(0))
{
// 	IF HLitRecherchePremier(Reclamation, IDRéclamation, IDReclamationGlobal) THEN
//MAP:2935b1fc11803fa6:00000022:4:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("reclamation"),WDAPIHF.getRubriqueSansCasseNiAccent("idreclamation"),GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal).getBoolean())
{
// 		SAI_NumFacture = Reclamation.Num_facture
//MAP:2935b1fc11803fa6:00000022:7:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
mWD_SAI_NumFacture.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture"));

}

}

// HReadFirst(Utilisateur)
//MAP:2935b1fc11803fa6:00000022:c:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// WHILE NOT HOut()
//MAP:2935b1fc11803fa6:00000022:d:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 	SI Utilisateur.Role = 1 ALORS
//MAP:2935b1fc11803fa6:00000022:f:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role").opEgal(1))
{
// 		COMBO_NomComerciale.Ajoute(Utilisateur.Nom_Prenom)
//MAP:2935b1fc11803fa6:00000022:10:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPIListe.listeAjoute(mWD_COMBO_NomComerciale,WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom").getString());

// 		TabChauffeurID.Ajoute(Utilisateur.IDUtilisateur)
//MAP:2935b1fc11803fa6:00000022:11:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPITableau.tableauAjoute(vWD_TabChauffeurID,WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("idutilisateur"));

}

// 	HReadNext(Utilisateur)
//MAP:2935b1fc11803fa6:00000022:13:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

}

// HReadFirst(Reclamation)
//MAP:2935b1fc11803fa6:00000022:16:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("reclamation"));

// WHILE NOT HOut()
//MAP:2935b1fc11803fa6:00000022:17:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 	SI réclamation.Etat = 2 ALORS
//MAP:2935b1fc11803fa6:00000022:18:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
if(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("etat").opEgal(2))
{
// 	SAI_NumFacture=Reclamation.Num_facture
//MAP:2935b1fc11803fa6:00000022:1a:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
mWD_SAI_NumFacture.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture"));

// 	TabReclamationID.Ajoute(Reclamation.IDRéclamation) // On stocke l'ID dans le tableau
//MAP:2935b1fc11803fa6:00000022:1b:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPITableau.tableauAjoute(vWD_TabReclamationID,WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));

}

// 	HReadNext(réclamation)
//MAP:2935b1fc11803fa6:00000022:1d:FEN_Ajout_affectation:com.masociete.tracklet.wdgen.GWDFFEN_Ajout_affectation:Fin d'initialisation de FEN_Ajout_affectation
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("reclamation"));

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_TabReclamationID = WDVarNonAllouee.ref;
 public WDObjet vWD_TabChauffeurID = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Ajout_affectation
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_Bon_de_reception = new GWDBon_de_reception();
mWD_Bouton4 = new GWDBouton4();
mWD_Image5 = new GWDImage5();
mWD_COMBO_NomComerciale = new GWDCOMBO_NomComerciale();
mWD_SAI_NumFacture = new GWDSAI_NumFacture();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Ajout_affectation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969475225504202662l);

super.setChecksum("991002411");

super.setNom("FEN_Ajout_affectation");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Ajout affectation ");

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
// Initialisation des champs de FEN_Ajout_affectation
////////////////////////////////////////////////////////////////////////////
mWD_Bon_de_reception.initialiserObjet();
super.ajouter("Bon_de_réception", mWD_Bon_de_reception);
mWD_Bouton4.initialiserObjet();
super.ajouter("Bouton4", mWD_Bouton4);
mWD_Image5.initialiserObjet();
super.ajouter("Image5", mWD_Image5);
mWD_COMBO_NomComerciale.initialiserObjet();
super.ajouter("COMBO_NomComerciale", mWD_COMBO_NomComerciale);
mWD_SAI_NumFacture.initialiserObjet();
super.ajouter("SAI_NumFacture", mWD_SAI_NumFacture);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);

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
return GWDPSSuivApp.getInstance().mWD_FEN_Ajout_affectation;
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
