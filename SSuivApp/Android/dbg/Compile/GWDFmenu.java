/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : menu
 * Date : 30/11/2025 14:56:06
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFmenu extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de menu
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION2
 */
class GWDZM_ACTION2 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION2_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION2
 */
class GWDBTN_ACTION2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de menu.ZM_ACTION2.BTN_ACTION2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367336360391l);

super.setChecksum("783896290");

super.setNom("BTN_ACTION2");

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

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Client_B_32_5@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xA0A0A0, 0x202020, 0xF3000000, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xA0A0A0, 0x202020, 0xF3000000, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xA0A0A0, 0x202020, 0xF3000000, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION2
 */
public void clicSurBoutonGauche()
//  le clic dans la ZML exécutera le code de clic de ce bouton
//  A Faire : Ajoutez le code sur le clic de ce bouton
{
super.clicSurBoutonGauche();

// // le clic dans la ZML exécutera le code de clic de ce bouton
//MAP:291aedfb059e59c7:00000012:1:menu.ZM_ACTION2.BTN_ACTION2:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION2$GWDZM_ACTION2_Ligne1$GWDBTN_ACTION2:Clic sur BTN_ACTION2
// OuvreFenêtreMobile('nouveau utilisateur')
//MAP:291aedfb059e59c7:00000012:3:menu.ZM_ACTION2.BTN_ACTION2:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION2$GWDZM_ACTION2_Ligne1$GWDBTN_ACTION2:Clic sur BTN_ACTION2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_nouveau_utilisateur);

// ThreadPause(30)
//MAP:291aedfb059e59c7:00000012:5:menu.ZM_ACTION2.BTN_ACTION2:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION2$GWDZM_ACTION2_Ligne1$GWDBTN_ACTION2:Clic sur BTN_ACTION2
WDAPIThread.threadPause(new WDEntier4(30));

// Info("bienvenue😄") 
//MAP:291aedfb059e59c7:00000012:6:menu.ZM_ACTION2.BTN_ACTION2:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION2$GWDZM_ACTION2_Ligne1$GWDBTN_ACTION2:Clic sur BTN_ACTION2
WDAPIDialogue.info("bienvenue😄");

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
public GWDBTN_ACTION2 mWD_BTN_ACTION2 = new GWDBTN_ACTION2();

/**
 * utilisateur
 */
class GWDutilisateur extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de menu.ZM_ACTION2.utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367336425927l);

super.setChecksum("783961370");

super.setNom("utilisateur");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("utilisateur");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 70);

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
public GWDutilisateur mWD_utilisateur = new GWDutilisateur();

/**
 * Liste_des_utilisateurs
 */
class GWDListe_des_utilisateurs extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de menu.ZM_ACTION2.Liste_des_utilisateurs
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367336491463l);

super.setChecksum("784026906");

super.setNom("Liste_des_utilisateurs");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Liste des utilisateurs ");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 95);

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
public GWDListe_des_utilisateurs mWD_Liste_des_utilisateurs = new GWDListe_des_utilisateurs();
class GWDZM_ACTION2_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de menu.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de menu.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION2.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION2);
mWD_utilisateur.initialiserObjet();
super.ajouterChamp(mWD_utilisateur);
mWD_Liste_des_utilisateurs.initialiserObjet();
super.ajouterChamp(mWD_Liste_des_utilisateurs);
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
 * Initialise tous les champs de menu.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de menu.ZM_ACTION2
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

super.setQuid(2961941367336229319l);

super.setChecksum("783807626");

super.setNom("ZM_ACTION2");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(17, 318);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(2);

super.setAltitude(1);

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
//MAP:291aedfb059c59c7:00000021:1:menu.ZM_ACTION2:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION2:Sélection (clic) d'une ligne dans ZM_ACTION2
// ExécuteTraitement(BTN_ACTION2, trtClic)
//MAP:291aedfb059c59c7:00000021:2:menu.ZM_ACTION2:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION2:Sélection (clic) d'une ligne dans ZM_ACTION2
WDAPIVM.executeTraitement(mWD_BTN_ACTION2,18);

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
// Déclaration des champs du fils n°2 de menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION3_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_ACTION3
 */
class GWDBTN_ACTION3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de menu.ZM_ACTION3.BTN_ACTION3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367336688071l);

super.setChecksum("784223970");

super.setNom("BTN_ACTION3");

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

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Usine_B_32_5@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xA0A0A0, 0x202020, 0xA0A0A0, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xA0A0A0, 0x202020, 0xA0A0A0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xA0A0A0, 0x202020, 0xA0A0A0, 2.000000, 2.000000, 1, 1));

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
//MAP:291aedfb05a359c7:00000012:1:menu.ZM_ACTION3.BTN_ACTION3:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION3$GWDZM_ACTION3_Ligne1$GWDBTN_ACTION3:Clic sur BTN_ACTION3
// OuvreFenêtreMobile(login) 
//MAP:291aedfb05a359c7:00000012:3:menu.ZM_ACTION3.BTN_ACTION3:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION3$GWDZM_ACTION3_Ligne1$GWDBTN_ACTION3:Clic sur BTN_ACTION3
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_login);

// ThreadPause(30)
//MAP:291aedfb05a359c7:00000012:5:menu.ZM_ACTION3.BTN_ACTION3:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION3$GWDZM_ACTION3_Ligne1$GWDBTN_ACTION3:Clic sur BTN_ACTION3
WDAPIThread.threadPause(new WDEntier4(30));

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
 * login
 */
class GWDlogin extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de menu.ZM_ACTION3.login
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367336753607l);

super.setChecksum("784289050");

super.setNom("login");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("login ");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 70);

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
public GWDlogin mWD_login = new GWDlogin();

/**
 * LIB_SousTitreAction3
 */
class GWDLIB_SousTitreAction3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de menu.ZM_ACTION3.LIB_SousTitreAction3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367336819143l);

super.setChecksum("784354586");

super.setNom("LIB_SousTitreAction3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Liste des fournisseurs");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 95);

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
public GWDLIB_SousTitreAction3 mWD_LIB_SousTitreAction3 = new GWDLIB_SousTitreAction3();
class GWDZM_ACTION3_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de menu.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de menu.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_ACTION3.initialiserObjet();
super.ajouterChamp(mWD_BTN_ACTION3);
mWD_login.initialiserObjet();
super.ajouterChamp(mWD_login);
mWD_LIB_SousTitreAction3.initialiserObjet();
super.ajouterChamp(mWD_LIB_SousTitreAction3);
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
 * Initialise tous les champs de menu.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de menu.ZM_ACTION3
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

super.setQuid(2961941367336556999l);

super.setChecksum("784135306");

super.setNom("ZM_ACTION3");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(180, 314);

super.setTailleInitiale(94, 150);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(1);

super.setAltitude(2);

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
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION3
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
//MAP:291aedfb05a159c7:00000021:1:menu.ZM_ACTION3:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION3:Sélection (clic) d'une ligne dans ZM_ACTION3
// ExécuteTraitement(BTN_ACTION3, trtClic)
//MAP:291aedfb05a159c7:00000021:2:menu.ZM_ACTION3:com.masociete.tracklet.wdgen.GWDFmenu$GWDZM_ACTION3:Sélection (clic) d'une ligne dans ZM_ACTION3
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
 * IMG_Visuel
 */
class GWDIMG_Visuel extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de menu.IMG_Visuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961941367337540039l);

super.setChecksum("785077762");

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

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\ChatGPT Image 17 nov. 2025, 10_52_07.png");

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
//MAP:291aedfb05b059c7:0000000e:1:menu.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFmenu$GWDIMG_Visuel:Initialisation de IMG_Visuel
// moimeme..Opacité=80
//MAP:291aedfb05b059c7:0000000e:1:menu.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFmenu$GWDIMG_Visuel:Initialisation de IMG_Visuel
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
// Procédures utilisateur de menu
////////////////////////////////////////////////////////////////////////////
public void fWD_executeBouton( WDObjet vWD_pChampZML )
{
// PROCEDURE ExecuteBouton(pChampZML)
//MAP:191aedfb001159c7:00070000:1:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
initExecProcLocale("ExecuteBouton");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_i = new WDEntier4();



// i est un entier = 1
//MAP:191aedfb001159c7:00070000:3:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton

vWD_i.setValeur(1);


// BOUCLE
//MAP:191aedfb001159c7:00070000:4:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
while(true)
{
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
//MAP:191aedfb001159c7:00070000:5:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
WDObjet vWD_sResChamp = new WDChaineU();


vWD_sResChamp.setValeur(WDAPIDivers.enumereChamp(vWD_pChampZML.getProp(EWDPropriete.PROP_NOMCOMPLET),vWD_i.getInt()));


// 	si sResChamp="" alors sortir
//MAP:191aedfb001159c7:00070000:6:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
if(vWD_sResChamp.opEgal(""))
{
// 	si sResChamp="" alors sortir
//MAP:191aedfb001159c7:00070000:6:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
break;

//////////////////////////////////////////////////////////
// Code Inaccessible
// 
}

// 	si {sResChamp, indChamp}..type=typBouton alors
//MAP:191aedfb001159c7:00070000:7:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
if(WDIndirection.get(vWD_sResChamp.getString(),4).getProp(EWDPropriete.PROP_TYPE).opEgal(4))
{
// 		ExécuteTraitement(sResChamp, trtclic)
//MAP:191aedfb001159c7:00070000:8:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
WDAPIVM.executeTraitement(vWD_sResChamp,18);

// 		retour
//MAP:191aedfb001159c7:00070000:9:menu.PROCEDURE.ExecuteBouton:com.masociete.tracklet.wdgen.GWDFmenu:ExecuteBouton
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
 * Traitement: Déclarations globales de menu
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
//MAP:291aedfb059b59c7:00000000:1:menu:com.masociete.tracklet.wdgen.GWDFmenu:Déclarations globales de menu
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// ZM_ACTION3..etat=Grisé
//MAP:291aedfb059b59c7:00000000:3:menu:com.masociete.tracklet.wdgen.GWDFmenu:Déclarations globales de menu
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
// Création des champs de la fenêtre menu
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZM_ACTION2 = new GWDZM_ACTION2();
mWD_ZM_ACTION3 = new GWDZM_ACTION3();
mWD_IMG_Visuel = new GWDIMG_Visuel();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre menu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2961941367336163783l);

super.setChecksum("789697867");

super.setNom("menu");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xEAEAEA);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("menu");

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
// Initialisation des champs de menu
////////////////////////////////////////////////////////////////////////////
mWD_ZM_ACTION2.initialiserObjet();
super.ajouter("ZM_ACTION2", mWD_ZM_ACTION2);
mWD_ZM_ACTION3.initialiserObjet();
super.ajouter("ZM_ACTION3", mWD_ZM_ACTION3);
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
return GWDPSSuivApp.getInstance().mWD_menu;
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
