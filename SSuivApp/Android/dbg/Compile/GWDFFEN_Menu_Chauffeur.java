/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Menu_Chauffeur
 * Date : 10/12/2025 00:22:06
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.erreur.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Menu_Chauffeur extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Menu_Chauffeur
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1
 */
class GWDZM_ACTION1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Chauffeur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Chauffeur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Reclamation
 */
class GWDLIB_Reclamation extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Chauffeur.ZM_ACTION1.LIB_Reclamation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373228369305665l);

super.setChecksum("733428433");

super.setNom("LIB_Reclamation");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Mes réclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 115);

super.setTailleInitiale(86, 37);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(15, 1000, 1000, 0, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -7.000000, 1), 3, 0, 0x2D2D2D);

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
public GWDLIB_Reclamation mWD_LIB_Reclamation = new GWDLIB_Reclamation();

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Chauffeur.ZM_ACTION1.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373228369371201l);

super.setChecksum("733496249");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(20, -2);

super.setTailleInitiale(54, 101);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\appetite_11331394.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(15, 1000, 1000, 0, 1000, 0);

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
//MAP:293555380282e041:00000012:1:FEN_Menu_Chauffeur.ZM_ACTION1.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDZM_ACTION1$GWDZM_ACTION1_Ligne1$GWDIMG_SansNom1:Clic sur IMG_SansNom1
// OuvreFenêtreMobile(FEN_Liste_Reclamation_Chauffeur)
//MAP:293555380282e041:00000012:1:FEN_Menu_Chauffeur.ZM_ACTION1.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDZM_ACTION1$GWDZM_ACTION1_Ligne1$GWDIMG_SansNom1:Clic sur IMG_SansNom1
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
public GWDIMG_SansNom1 mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
class GWDZM_ACTION1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Chauffeur.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Chauffeur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Reclamation.initialiserObjet();
super.ajouterChamp(mWD_LIB_Reclamation);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouterChamp(mWD_IMG_SansNom1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION1_Ligne1 mWD_ZM_ACTION1_Ligne1 = new GWDZM_ACTION1_Ligne1();
/**
 * Initialise tous les champs de FEN_Menu_Chauffeur.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Chauffeur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION1_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION1_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2969373228369174593l);

super.setChecksum("733340225");

super.setNom("ZM_ACTION1");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(54, 190);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(1);

super.setAltitude(1);

super.setAncrageInitial(15, 1000, 1000, 0, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION1
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:29355538027fe041:00000021:1:FEN_Menu_Chauffeur.ZM_ACTION1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDZM_ACTION1:Sélection (clic) d'une ligne dans ZM_ACTION1
// OuvreFenêtreMobile(FEN_Liste_Reclamation_Chauffeur)
//MAP:29355538027fe041:00000021:2:FEN_Menu_Chauffeur.ZM_ACTION1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDZM_ACTION1:Sélection (clic) d'une ligne dans ZM_ACTION1
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Chauffeur);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION1 mWD_ZM_ACTION1;

/**
 * ZM_ACTION5
 */
class GWDZM_ACTION5 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Chauffeur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION5_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Chauffeur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction5
 */
class GWDLIB_TitreAction5 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Chauffeur.ZM_ACTION5.LIB_TitreAction5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373228369633345l);

super.setChecksum("733756113");

super.setNom("LIB_TitreAction5");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Paramètres");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 115);

super.setTailleInitiale(92, 29);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(15, 1000, 1000, 0, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -7.000000, 1), 3, 0, 0x2D2D2D);

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
public GWDLIB_TitreAction5 mWD_LIB_TitreAction5 = new GWDLIB_TitreAction5();

/**
 * IMG_Settings
 */
class GWDIMG_Settings extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Chauffeur.ZM_ACTION5.IMG_Settings
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969404186533551858l);

super.setChecksum("773414546");

super.setNom("IMG_Settings");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(20, 9);

super.setTailleInitiale(57, 80);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\gear (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(15, 1000, 1000, 0, 1000, 0);

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
public GWDIMG_Settings mWD_IMG_Settings = new GWDIMG_Settings();
class GWDZM_ACTION5_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Chauffeur.ZM_ACTION5
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Chauffeur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction5.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction5);
mWD_IMG_Settings.initialiserObjet();
super.ajouterChamp(mWD_IMG_Settings);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(152);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION5_Ligne1 mWD_ZM_ACTION5_Ligne1 = new GWDZM_ACTION5_Ligne1();
/**
 * Initialise tous les champs de FEN_Menu_Chauffeur.ZM_ACTION5
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Chauffeur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION5_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION5_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2969373228369436737l);

super.setChecksum("733602369");

super.setNom("ZM_ACTION5");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(174, 190);

super.setTailleInitiale(94, 152);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(2);

super.setAltitude(2);

super.setAncrageInitial(15, 1000, 1000, 0, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION5
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:293555380283e041:00000021:1:FEN_Menu_Chauffeur.ZM_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDZM_ACTION5:Sélection (clic) d'une ligne dans ZM_ACTION5
// Erreur sur l'objet: FEN_Menu_Chauffeur.ZM_ACTION5
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
// Erreur sur l'objet: FEN_Menu_Chauffeur.ZM_ACTION5
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Menu_Chauffeur.ZM_ACTION5\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n\r\nErreur sur l'objet: FEN_Menu_Chauffeur.ZM_ACTION5\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n");


// // ExécuteTraitement(BTN_ACTION5, trtClic)
// //MAP:293555380283e041:00000021:2:FEN_Menu_Chauffeur.ZM_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDZM_ACTION5:Sélection (clic) d'une ligne dans ZM_ACTION5
// WDAPIVM.executeTraitement(,18);
// 

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION5 mWD_ZM_ACTION5;

/**
 * IMG_Visuel
 */
class GWDIMG_Visuel extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Menu_Chauffeur.IMG_Visuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373228369764417l);

super.setChecksum("733889465");

super.setNom("IMG_Visuel");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 152);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\49e559ba-1b88-4aed-81d5-446c990e42bd.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2359304, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(500, 500);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de IMG_Visuel
 */
public void init()
{
super.init();

// moimeme..Opacité=80
//MAP:293555380288e041:0000000e:1:FEN_Menu_Chauffeur.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDIMG_Visuel:Initialisation de IMG_Visuel
// moimeme..Opacité=80
//MAP:293555380288e041:0000000e:1:FEN_Menu_Chauffeur.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur$GWDIMG_Visuel:Initialisation de IMG_Visuel
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_OPACITE,80);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Visuel mWD_IMG_Visuel;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Menu_Chauffeur
////////////////////////////////////////////////////////////////////////////
public void fWD_executeBouton( WDObjet vWD_pChampZML )
{
// PROCEDURE ExecuteBouton(pChampZML)
//MAP:19355538003de041:00070000:1:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
initExecProcLocale("ExecuteBouton");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_i = new WDEntier4();



// i est un entier = 1
//MAP:19355538003de041:00070000:3:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton

vWD_i.setValeur(1);


// BOUCLE
//MAP:19355538003de041:00070000:4:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
while(true)
{
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
//MAP:19355538003de041:00070000:5:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
WDObjet vWD_sResChamp = new WDChaineU();


vWD_sResChamp.setValeur(WDAPIDivers.enumereChamp(vWD_pChampZML.getProp(EWDPropriete.PROP_NOMCOMPLET),vWD_i.getInt()));


// 	si sResChamp="" alors sortir
//MAP:19355538003de041:00070000:6:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
if(vWD_sResChamp.opEgal(""))
{
// 	si sResChamp="" alors sortir
//MAP:19355538003de041:00070000:6:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 	si {sResChamp, indChamp}..type=typBouton alors
//MAP:19355538003de041:00070000:7:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
if(WDIndirection.get(vWD_sResChamp.getString(),4).getProp(EWDPropriete.PROP_TYPE).opEgal(4))
{
// 		ExécuteTraitement(sResChamp, trtclic)
//MAP:19355538003de041:00070000:8:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
WDAPIVM.executeTraitement(vWD_sResChamp,18);

// 		retour
//MAP:19355538003de041:00070000:9:FEN_Menu_Chauffeur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Chauffeur:ExecuteBouton
return;

}

}


}
finally
{
finExecProcLocale();
}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Menu_Chauffeur
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_ACTION1 = new GWDZM_ACTION1();
mWD_ZM_ACTION5 = new GWDZM_ACTION5();
mWD_IMG_Visuel = new GWDIMG_Visuel();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Menu_Chauffeur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969373228369109057l);

super.setChecksum("739230466");

super.setNom("FEN_Menu_Chauffeur");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("^chauffeur");

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
// Initialisation des champs de FEN_Menu_Chauffeur
////////////////////////////////////////////////////////////////////////////
mWD_ZM_ACTION1.initialiserObjet();
super.ajouter("ZM_ACTION1", mWD_ZM_ACTION1);
mWD_ZM_ACTION5.initialiserObjet();
super.ajouter("ZM_ACTION5", mWD_ZM_ACTION5);
mWD_IMG_Visuel.initialiserObjet();
super.ajouter("IMG_Visuel", mWD_IMG_Visuel);

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
return false;
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
return GWDPSSuivApp.getInstance().mWD_FEN_Menu_Chauffeur;
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
