/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_ Menu_Commercial
 * Date : 10/12/2025 00:22:05
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
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Menu_Commercial extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_ Menu_Commercial
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1
 */
class GWDZM_ACTION1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ Menu_Commercial.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ Menu_Commercial.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ Menu_Commercial.ZM_ACTION1.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373541903891754l);

super.setChecksum("735401987");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Mes Reclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 117);

super.setTailleInitiale(85, 36);

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
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_ Menu_Commercial.ZM_ACTION1.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970225263969103994l);

super.setChecksum("721246942");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(8, -33);

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

/**
 * Traitement: Clic sur IMG_SansNom2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:29385c2401c4f07a:00000012:1:FEN_ Menu_Commercial.ZM_ACTION1.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION1$GWDZM_ACTION1_Ligne1$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// OuvreFenêtreMobile(FEN_Liste_Reclamation_Commercial)
//MAP:29385c2401c4f07a:00000012:2:FEN_ Menu_Commercial.ZM_ACTION1.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION1$GWDZM_ACTION1_Ligne1$GWDIMG_SansNom2:Clic sur IMG_SansNom2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Commercial);

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
public GWDIMG_SansNom2 mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
class GWDZM_ACTION1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_ Menu_Commercial.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ Menu_Commercial.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouterChamp(mWD_IMG_SansNom2);
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
 * Initialise tous les champs de FEN_ Menu_Commercial.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ Menu_Commercial.ZM_ACTION1
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

super.setQuid(2969373541903760682l);

super.setChecksum("735313779");

super.setNom("ZM_ACTION1");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(66, 256);

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

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xEAEAEA, 0x6A6A6A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xEAEAEA, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION1
 */
public void selectionLigne()
{
super.selectionLigne();

// OuvreFenêtreMobile(FEN_Liste_Reclamation_Commercial)
//MAP:29355581029dfd2a:00000021:1:FEN_ Menu_Commercial.ZM_ACTION1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION1:Sélection (clic) d'une ligne dans ZM_ACTION1
// OuvreFenêtreMobile(FEN_Liste_Reclamation_Commercial)
//MAP:29355581029dfd2a:00000021:1:FEN_ Menu_Commercial.ZM_ACTION1:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION1:Sélection (clic) d'une ligne dans ZM_ACTION1
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Commercial);

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
// Déclaration des champs du fils n°2 de FEN_ Menu_Commercial.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION5_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ Menu_Commercial.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION5
 */
class GWDBTN_ACTION5 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ Menu_Commercial.ZM_ACTION5.BTN_ACTION5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373541904153898l);

super.setChecksum("735664587");

super.setNom("BTN_ACTION5");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(13, 8);

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

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\paramètre_B_32_5@dpi1x.png?E5", 0, 2, 5, null, null, null);

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
 * Traitement: Clic sur BTN_ACTION5
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
//MAP:2935558102a3fd2a:00000012:1:FEN_ Menu_Commercial.ZM_ACTION5.BTN_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION5$GWDZM_ACTION5_Ligne1$GWDBTN_ACTION5:Clic sur BTN_ACTION5
// Info("clic sur "+MoiMême..Nom)
//MAP:2935558102a3fd2a:00000012:3:FEN_ Menu_Commercial.ZM_ACTION5.BTN_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION5$GWDZM_ACTION5_Ligne1$GWDBTN_ACTION5:Clic sur BTN_ACTION5
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
public GWDBTN_ACTION5 mWD_BTN_ACTION5 = new GWDBTN_ACTION5();

/**
 * LIB_TitreAction5
 */
class GWDLIB_TitreAction5 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_ Menu_Commercial.ZM_ACTION5.LIB_TitreAction5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373541904219434l);

super.setChecksum("735729667");

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
public GWDLIB_TitreAction5 mWD_LIB_TitreAction5 = new GWDLIB_TitreAction5();

/**
 * LIB_SousTitreAction5
 */
class GWDLIB_SousTitreAction5 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_ Menu_Commercial.ZM_ACTION5.LIB_SousTitreAction5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373541904284970l);

super.setChecksum("735795203");

super.setNom("LIB_SousTitreAction5");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(2, 105);

super.setTailleInitiale(92, 45);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x969696, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -7.000000, 0), 3, 0, 0x2D2D2D);

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
public GWDLIB_SousTitreAction5 mWD_LIB_SousTitreAction5 = new GWDLIB_SousTitreAction5();
class GWDZM_ACTION5_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_ Menu_Commercial.ZM_ACTION5
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ Menu_Commercial.ZM_ACTION5
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION5.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION5);
mWD_LIB_TitreAction5.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction5);
mWD_LIB_SousTitreAction5.initialiserObjet();
super.ajouterChamp(mWD_LIB_SousTitreAction5);
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
 * Initialise tous les champs de FEN_ Menu_Commercial.ZM_ACTION5
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ Menu_Commercial.ZM_ACTION5
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

super.setQuid(2969373541904022826l);

super.setChecksum("735575923");

super.setNom("ZM_ACTION5");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(183, 256);

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
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION5
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:2935558102a1fd2a:00000021:1:FEN_ Menu_Commercial.ZM_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION5:Sélection (clic) d'une ligne dans ZM_ACTION5
// ExécuteTraitement(BTN_ACTION5, trtClic)
//MAP:2935558102a1fd2a:00000021:2:FEN_ Menu_Commercial.ZM_ACTION5:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDZM_ACTION5:Sélection (clic) d'une ligne dans ZM_ACTION5
WDAPIVM.executeTraitement(mWD_BTN_ACTION5,18);

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
// Déclaration des champs du fils n°3 de FEN_ Menu_Commercial.IMG_Visuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969373541904350506l);

super.setChecksum("735863019");

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

super.setTailleInitiale(320, 244);

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
//MAP:2935558102a6fd2a:0000000e:1:FEN_ Menu_Commercial.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDIMG_Visuel:Initialisation de IMG_Visuel
// moimeme..Opacité=80
//MAP:2935558102a6fd2a:0000000e:1:FEN_ Menu_Commercial.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial$GWDIMG_Visuel:Initialisation de IMG_Visuel
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
// Procédures utilisateur de FEN_ Menu_Commercial
////////////////////////////////////////////////////////////////////////////
public void fWD_executeBouton( WDObjet vWD_pChampZML )
{
// PROCEDURE ExecuteBouton(pChampZML)
//MAP:193555810046fd2a:00070000:1:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
initExecProcLocale("ExecuteBouton");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_i = new WDEntier4();



// i est un entier = 1
//MAP:193555810046fd2a:00070000:3:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton

vWD_i.setValeur(1);


// BOUCLE
//MAP:193555810046fd2a:00070000:4:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
while(true)
{
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
//MAP:193555810046fd2a:00070000:5:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
WDObjet vWD_sResChamp = new WDChaineU();


vWD_sResChamp.setValeur(WDAPIDivers.enumereChamp(vWD_pChampZML.getProp(EWDPropriete.PROP_NOMCOMPLET),vWD_i.getInt()));


// 	si sResChamp="" alors sortir
//MAP:193555810046fd2a:00070000:6:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
if(vWD_sResChamp.opEgal(""))
{
// 	si sResChamp="" alors sortir
//MAP:193555810046fd2a:00070000:6:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 	si {sResChamp, indChamp}..type=typBouton alors
//MAP:193555810046fd2a:00070000:7:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
if(WDIndirection.get(vWD_sResChamp.getString(),4).getProp(EWDPropriete.PROP_TYPE).opEgal(4))
{
// 		ExécuteTraitement(sResChamp, trtclic)
//MAP:193555810046fd2a:00070000:8:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
WDAPIVM.executeTraitement(vWD_sResChamp,18);

// 		retour
//MAP:193555810046fd2a:00070000:9:FEN_ Menu_Commercial.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:ExecuteBouton
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
 * Traitement: Déclarations globales de FEN_ Menu_Commercial
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
//MAP:29355581029cfd2a:00000000:1:FEN_ Menu_Commercial:com.masociete.tracklet.wdgen.GWDFFEN_Menu_Commercial:Déclarations globales de FEN_ Menu_Commercial
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
// Création des champs de la fenêtre FEN_ Menu_Commercial
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_ACTION1 = new GWDZM_ACTION1();
mWD_ZM_ACTION5 = new GWDZM_ACTION5();
mWD_IMG_Visuel = new GWDIMG_Visuel();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_ Menu_Commercial
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969373541903695146l);

super.setChecksum("741204020");

super.setNom("FEN_ Menu_Commercial");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xEAEAEA);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Commercial");

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
// Initialisation des champs de FEN_ Menu_Commercial
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
return GWDPSSuivApp.getInstance().mWD_FEN_Menu_Commercial;
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
