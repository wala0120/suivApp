/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Menu_Administrateur
 * Date : 30/11/2025 14:56:06
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
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Menu_Administrateur extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Menu_Administrateur
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1
 */
class GWDZM_ACTION1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION1.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778135909683l);

super.setChecksum("707413266");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Utilisateurs");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 116);

super.setTailleInitiale(92, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION1.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2966818276884330405l);

super.setChecksum("738199398");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("Utilisateurs");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(7, -42);

super.setTailleInitiale(78, 200);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\add-user.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDIMG_SansNom1 mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
class GWDZM_ACTION1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
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
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION1
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

super.setQuid(2964171778135713075l);

super.setChecksum("707259522");

super.setNom("ZM_ACTION1");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 240);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(1);

super.setAltitude(1);

super.setAncrageInitial(9, 330, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

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
//MAP:2922da8701046533:00000021:1:FEN_Menu_Administrateur.ZM_ACTION1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION1:Sélection (clic) d'une ligne dans ZM_ACTION1
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION1
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION1 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION1' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION1
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION1 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION1' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION1\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION1 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION1' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n\r\nErreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION1\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION1 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION1' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n");


// // ExécuteTraitement(BTN_ACTION1, trtclic)
// //MAP:2922da8701046533:00000021:2:FEN_Menu_Administrateur.ZM_ACTION1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION1:Sélection (clic) d'une ligne dans ZM_ACTION1
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
public GWDZM_ACTION1 mWD_ZM_ACTION1;

/**
 * ZM_ACTION2
 */
class GWDZM_ACTION2 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION2_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction2
 */
class GWDLIB_TitreAction2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION2.LIB_TitreAction2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778136237363l);

super.setChecksum("707740946");

super.setNom("LIB_TitreAction2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Reclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 116);

super.setTailleInitiale(92, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_TitreAction2 mWD_LIB_TitreAction2 = new GWDLIB_TitreAction2();

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION2.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2966819118702441094l);

super.setChecksum("742720267");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(7, -46);

super.setTailleInitiale(78, 200);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\appetite_11331394.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDIMG_SansNom2 mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
class GWDZM_ACTION2_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction2.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction2);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouterChamp(mWD_IMG_SansNom2);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION2_Ligne1 mWD_ZM_ACTION2_Ligne1 = new GWDZM_ACTION2_Ligne1();
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION2_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION2_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2964171778136040755l);

super.setChecksum("707587202");

super.setNom("ZM_ACTION2");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(111, 240);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(2);

super.setAltitude(2);

super.setAncrageInitial(13, 330, 1000, 330, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION2
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:2922da8701096533:00000021:1:FEN_Menu_Administrateur.ZM_ACTION2:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION2:Sélection (clic) d'une ligne dans ZM_ACTION2
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION2
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION2 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION2' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION2
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION2 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION2' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION2\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION2 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION2' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n\r\nErreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION2\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION2 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION2' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n");


// // ExécuteTraitement(BTN_ACTION2, trtClic)
// //MAP:2922da8701096533:00000021:2:FEN_Menu_Administrateur.ZM_ACTION2:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION2:Sélection (clic) d'une ligne dans ZM_ACTION2
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
public GWDZM_ACTION2 mWD_ZM_ACTION2;

/**
 * ZM_ACTION3
 */
class GWDZM_ACTION3 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Menu_Administrateur.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION3_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION3
 */
class GWDBTN_ACTION3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION3.BTN_ACTION3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778136499507l);

super.setChecksum("708003546");

super.setNom("BTN_ACTION3");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(13, 21);

super.setTailleInitiale(68, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Usine_B_32_5@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0x7A582D, 0x0, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0x7A582D, 0x0, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0x7A582D, 0x0, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION3
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
//MAP:2922da8701106533:00000012:1:FEN_Menu_Administrateur.ZM_ACTION3.BTN_ACTION3:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION3$GWDZM_ACTION3_Ligne1$GWDBTN_ACTION3:Clic sur BTN_ACTION3
// Info("clic sur "+MoiMême..Nom)
//MAP:2922da8701106533:00000012:3:FEN_Menu_Administrateur.ZM_ACTION3.BTN_ACTION3:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION3$GWDZM_ACTION3_Ligne1$GWDBTN_ACTION3:Clic sur BTN_ACTION3
WDAPIDialogue.info(new WDChaineU("clic sur ").opPlus(WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_NOM)).getString());

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
public GWDBTN_ACTION3 mWD_BTN_ACTION3 = new GWDBTN_ACTION3();

/**
 * LIB_TitreAction3
 */
class GWDLIB_TitreAction3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION3.LIB_TitreAction3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778136565043l);

super.setChecksum("708068626");

super.setNom("LIB_TitreAction3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Affecter Reclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(4, 96);

super.setTailleInitiale(92, 46);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_TitreAction3 mWD_LIB_TitreAction3 = new GWDLIB_TitreAction3();
class GWDZM_ACTION3_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION3.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION3);
mWD_LIB_TitreAction3.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction3);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION3_Ligne1 mWD_ZM_ACTION3_Ligne1 = new GWDZM_ACTION3_Ligne1();
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION3_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION3_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2964171778136368435l);

super.setChecksum("707914882");

super.setNom("ZM_ACTION3");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(216, 240);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(3);

super.setAltitude(3);

super.setAncrageInitial(13, 330, 1000, 660, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION3
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:2922da87010e6533:00000021:1:FEN_Menu_Administrateur.ZM_ACTION3:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION3:Sélection (clic) d'une ligne dans ZM_ACTION3
// ExécuteTraitement(BTN_ACTION3, trtClic)
//MAP:2922da87010e6533:00000021:2:FEN_Menu_Administrateur.ZM_ACTION3:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION3:Sélection (clic) d'une ligne dans ZM_ACTION3
WDAPIVM.executeTraitement(mWD_BTN_ACTION3,18);

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
public GWDZM_ACTION3 mWD_ZM_ACTION3;

/**
 * ZM_ACTION6
 */
class GWDZM_ACTION6 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Menu_Administrateur.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION6_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION6
 */
class GWDBTN_ACTION6 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION6.BTN_ACTION6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778136827187l);

super.setChecksum("708331226");

super.setNom("BTN_ACTION6");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(13, 37);

super.setTailleInitiale(68, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\info_B_32_5@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0x7A582D, 0x0, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0x7A582D, 0x0, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0x7A582D, 0x0, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION6
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
//MAP:2922da8701156533:00000012:1:FEN_Menu_Administrateur.ZM_ACTION6.BTN_ACTION6:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION6$GWDZM_ACTION6_Ligne1$GWDBTN_ACTION6:Clic sur BTN_ACTION6
// Info("clic sur "+MoiMême..Nom)
//MAP:2922da8701156533:00000012:3:FEN_Menu_Administrateur.ZM_ACTION6.BTN_ACTION6:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION6$GWDZM_ACTION6_Ligne1$GWDBTN_ACTION6:Clic sur BTN_ACTION6
WDAPIDialogue.info(new WDChaineU("clic sur ").opPlus(WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_NOM)).getString());

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
public GWDBTN_ACTION6 mWD_BTN_ACTION6 = new GWDBTN_ACTION6();

/**
 * LIB_TitreAction6
 */
class GWDLIB_TitreAction6 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION6.LIB_TitreAction6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778136892723l);

super.setChecksum("708396306");

super.setNom("LIB_TitreAction6");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("A propos");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(6, 115);

super.setTailleInitiale(92, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_TitreAction6 mWD_LIB_TitreAction6 = new GWDLIB_TitreAction6();
class GWDZM_ACTION6_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION6
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION6.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION6);
mWD_LIB_TitreAction6.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction6);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION6_Ligne1 mWD_ZM_ACTION6_Ligne1 = new GWDZM_ACTION6_Ligne1();
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION6
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION6
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION6_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION6_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2964171778136696115l);

super.setChecksum("708242562");

super.setNom("ZM_ACTION6");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(220, 398);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(4);

super.setAltitude(4);

super.setAncrageInitial(13, 330, 1000, 660, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION6
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:2922da8701136533:00000021:1:FEN_Menu_Administrateur.ZM_ACTION6:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION6:Sélection (clic) d'une ligne dans ZM_ACTION6
// ExécuteTraitement(BTN_ACTION6, trtClic)
//MAP:2922da8701136533:00000021:2:FEN_Menu_Administrateur.ZM_ACTION6:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION6:Sélection (clic) d'une ligne dans ZM_ACTION6
WDAPIVM.executeTraitement(mWD_BTN_ACTION6,18);

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
public GWDZM_ACTION6 mWD_ZM_ACTION6;

/**
 * ZM_ACTION5
 */
class GWDZM_ACTION5 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Menu_Administrateur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION5_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction5
 */
class GWDLIB_TitreAction5 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION5.LIB_TitreAction5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778137220403l);

super.setChecksum("708723986");

super.setNom("LIB_TitreAction5");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Paramètres");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(5, 111);

super.setTailleInitiale(92, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
 * IMG_SansNom4
 */
class GWDIMG_SansNom4 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION5.IMG_SansNom4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2966819608330662408l);

super.setChecksum("744669951");

super.setNom("IMG_SansNom4");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(4, -46);

super.setTailleInitiale(78, 200);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\settings.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDIMG_SansNom4 mWD_IMG_SansNom4 = new GWDIMG_SansNom4();
class GWDZM_ACTION5_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION5
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction5.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction5);
mWD_IMG_SansNom4.initialiserObjet();
super.ajouterChamp(mWD_IMG_SansNom4);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

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
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION5
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION5
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

super.setQuid(2964171778137023795l);

super.setChecksum("708570242");

super.setNom("ZM_ACTION5");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(115, 402);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(6);

super.setAltitude(5);

super.setAncrageInitial(13, 330, 1000, 330, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

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
//MAP:2922da8701186533:00000021:1:FEN_Menu_Administrateur.ZM_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION5:Sélection (clic) d'une ligne dans ZM_ACTION5
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION5
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION5
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION5\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n\r\nErreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION5\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION5 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION5' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n");


// // ExécuteTraitement(BTN_ACTION5, trtClic)
// //MAP:2922da8701186533:00000021:2:FEN_Menu_Administrateur.ZM_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION5:Sélection (clic) d'une ligne dans ZM_ACTION5
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
 * ZM_ACTION4
 */
class GWDZM_ACTION4 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Menu_Administrateur.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION4_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction4
 */
class GWDLIB_TitreAction4 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Menu_Administrateur.ZM_ACTION4.LIB_TitreAction4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2964171778137548083l);

super.setChecksum("709051666");

super.setNom("LIB_TitreAction4");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Magasin");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(2, 111);

super.setTailleInitiale(92, 25);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -7.000000, 1), 3, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDLIB_TitreAction4 mWD_LIB_TitreAction4 = new GWDLIB_TitreAction4();

/**
 * IMG_SansNom3
 */
class GWDIMG_SansNom3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Menu_Administrateur.ZM_ACTION4.IMG_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2966819419351140083l);

super.setChecksum("743708606");

super.setNom("IMG_SansNom3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(7, -34);

super.setTailleInitiale(78, 200);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\entrepreneur.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
public GWDIMG_SansNom3 mWD_IMG_SansNom3 = new GWDIMG_SansNom3();
class GWDZM_ACTION4_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction4.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction4);
mWD_IMG_SansNom3.initialiserObjet();
super.ajouterChamp(mWD_IMG_SansNom3);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(150);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION4_Ligne1 mWD_ZM_ACTION4_Ligne1 = new GWDZM_ACTION4_Ligne1();
/**
 * Initialise tous les champs de FEN_Menu_Administrateur.ZM_ACTION4
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Menu_Administrateur.ZM_ACTION4
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION4_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION4_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2964171778137351475l);

super.setChecksum("708897922");

super.setNom("ZM_ACTION4");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(9, 402);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(5);

super.setAltitude(6);

super.setAncrageInitial(9, 330, 1000, 1000, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION4
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:2922da87011d6533:00000021:1:FEN_Menu_Administrateur.ZM_ACTION4:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION4:Sélection (clic) d'une ligne dans ZM_ACTION4
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION4
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION4 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION4' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
// Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION4
// 	Traitement : Sélection (clic) d'une ligne dans ZM_ACTION4 (33)
// 	Code: 301
// 	Message: L'élément 'BTN_ACTION4' est inconnu ou inaccessible.
// 	Ligne : 1, Colonne : 18
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION4\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION4 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION4' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n\r\nErreur sur l'objet: FEN_Menu_Administrateur.ZM_ACTION4\r\n\tTraitement : Sélection (clic) d'une ligne dans ZM_ACTION4 (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'BTN_ACTION4' est inconnu ou inaccessible.\r\n\tLigne : 1, Colonne : 18\r\n\r\n");


// // ExécuteTraitement(BTN_ACTION4, trtClic)
// //MAP:2922da87011d6533:00000021:2:FEN_Menu_Administrateur.ZM_ACTION4:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur$GWDZM_ACTION4:Sélection (clic) d'une ligne dans ZM_ACTION4
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
public GWDZM_ACTION4 mWD_ZM_ACTION4;

/**
 * IMG_SansNom5
 */
class GWDIMG_SansNom5 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Menu_Administrateur.IMG_SansNom5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2966820729328921500l);

super.setChecksum("756465048");

super.setNom("IMG_SansNom5");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-30, 1);

super.setTailleInitiale(388, 202);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\49e559ba-1b88-4aed-81d5-446c990e42bd.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

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
public GWDIMG_SansNom5 mWD_IMG_SansNom5;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Menu_Administrateur
////////////////////////////////////////////////////////////////////////////
public void fWD_executeBouton( WDObjet vWD_pChampZML )
{
// PROCEDURE ExecuteBouton(pChampZML)
//MAP:1922da8700096533:00070000:1:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
initExecProcLocale("ExecuteBouton");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_i = new WDEntier4();



// i est un entier = 1
//MAP:1922da8700096533:00070000:3:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton

vWD_i.setValeur(1);


// BOUCLE
//MAP:1922da8700096533:00070000:4:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
while(true)
{
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
//MAP:1922da8700096533:00070000:5:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
WDObjet vWD_sResChamp = new WDChaineU();


vWD_sResChamp.setValeur(WDAPIDivers.enumereChamp(vWD_pChampZML.getProp(EWDPropriete.PROP_NOMCOMPLET),vWD_i.getInt()));


// 	si sResChamp="" alors sortir
//MAP:1922da8700096533:00070000:6:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
if(vWD_sResChamp.opEgal(""))
{
// 	si sResChamp="" alors sortir
//MAP:1922da8700096533:00070000:6:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 	si {sResChamp, indChamp}..type=typBouton alors
//MAP:1922da8700096533:00070000:7:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
if(WDIndirection.get(vWD_sResChamp.getString(),4).getProp(EWDPropriete.PROP_TYPE).opEgal(4))
{
// 		ExécuteTraitement(sResChamp, trtclic)
//MAP:1922da8700096533:00070000:8:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
WDAPIVM.executeTraitement(vWD_sResChamp,18);

// 		retour
//MAP:1922da8700096533:00070000:9:FEN_Menu_Administrateur.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:ExecuteBouton
return;

}

}


}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_Menu_Administrateur
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
//MAP:2922da8701036533:00000000:1:FEN_Menu_Administrateur:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:Déclarations globales de FEN_Menu_Administrateur
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// ZM_ACTION3..etat=Grisé
//MAP:2922da8701036533:00000000:3:FEN_Menu_Administrateur:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Administrateur:Déclarations globales de FEN_Menu_Administrateur
mWD_ZM_ACTION3.setProp(EWDPropriete.PROP_ETAT,4);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Menu_Administrateur
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_ACTION1 = new GWDZM_ACTION1();
mWD_ZM_ACTION2 = new GWDZM_ACTION2();
mWD_ZM_ACTION3 = new GWDZM_ACTION3();
mWD_ZM_ACTION6 = new GWDZM_ACTION6();
mWD_ZM_ACTION5 = new GWDZM_ACTION5();
mWD_ZM_ACTION4 = new GWDZM_ACTION4();
mWD_IMG_SansNom5 = new GWDIMG_SansNom5();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Menu_Administrateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2964171778135647539l);

super.setChecksum("713149763");

super.setNom("FEN_Menu_Administrateur");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xEAEAEA);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Menu_Administrateur");

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
// Initialisation des champs de FEN_Menu_Administrateur
////////////////////////////////////////////////////////////////////////////
mWD_ZM_ACTION1.initialiserObjet();
super.ajouter("ZM_ACTION1", mWD_ZM_ACTION1);
mWD_ZM_ACTION2.initialiserObjet();
super.ajouter("ZM_ACTION2", mWD_ZM_ACTION2);
mWD_ZM_ACTION3.initialiserObjet();
super.ajouter("ZM_ACTION3", mWD_ZM_ACTION3);
mWD_ZM_ACTION6.initialiserObjet();
super.ajouter("ZM_ACTION6", mWD_ZM_ACTION6);
mWD_ZM_ACTION5.initialiserObjet();
super.ajouter("ZM_ACTION5", mWD_ZM_ACTION5);
mWD_ZM_ACTION4.initialiserObjet();
super.ajouter("ZM_ACTION4", mWD_ZM_ACTION4);
mWD_IMG_SansNom5.initialiserObjet();
super.ajouter("IMG_SansNom5", mWD_IMG_SansNom5);

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
return GWDPSSuivApp.getInstance().mWD_FEN_Menu_Administrateur;
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
