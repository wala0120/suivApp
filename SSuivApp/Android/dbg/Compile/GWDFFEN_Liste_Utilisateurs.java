/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Liste_Utilisateurs
 * Date : 09/12/2025 23:56:10
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Liste_Utilisateurs extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Liste_Utilisateurs
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Utilisateurs
 */
class GWDZR_Utilisateurs extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Utilisateurs.ZR_Utilisateurs
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_NomPrenom
 */
class GWDATT_NomPrenom extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_NomPrenom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NomPrenom");

super.setChampAssocie(mWD_LIB_NomPrenom);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_NomPrenom

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NomPrenom mWD_ATT_NomPrenom = new GWDATT_NomPrenom();

/**
 * ATT_Email
 */
class GWDATT_Email extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_Email
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Email");

super.setLiaisonFichier("utilisateur", "email");

super.setChampAssocie(mWD_LIB_Email);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_Email

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Email mWD_ATT_Email = new GWDATT_Email();

/**
 * ATT_Role
 */
class GWDATT_Role extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_Role
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Role");

super.setLiaisonFichier("utilisateur", "role");

super.setChampAssocie(mWD_LIB_Role);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_Role

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Role mWD_ATT_Role = new GWDATT_Role();

/**
 * ATT_IdUtilisateur
 */
class GWDATT_IdUtilisateur extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_IdUtilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IdUtilisateur");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Utilisateurs.ZR_Utilisateurs.ATT_IdUtilisateur

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_IdUtilisateur mWD_ATT_IdUtilisateur = new GWDATT_IdUtilisateur();

/**
 * LIB_NomPrenom
 */
class GWDLIB_NomPrenom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.LIB_NomPrenom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969410448642743905l);

super.setChecksum("820288203");

super.setNom("LIB_NomPrenom");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NomPrenom");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-1, 8);

super.setTailleInitiale(189, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_NomPrenom mWD_LIB_NomPrenom = new GWDLIB_NomPrenom();

/**
 * LIB_Email
 */
class GWDLIB_Email extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.LIB_Email
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969410448642809441l);

super.setChecksum("820353739");

super.setNom("LIB_Email");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Email");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-1, 30);

super.setTailleInitiale(322, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setLiaisonFichier("utilisateur", "email");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_Email mWD_LIB_Email = new GWDLIB_Email();

/**
 * LIB_Role
 */
class GWDLIB_Role extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Liste_Utilisateurs.ZR_Utilisateurs.LIB_Role
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969410448642874977l);

super.setChecksum("820419275");

super.setNom("LIB_Role");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Role");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(196, 8);

super.setTailleInitiale(125, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setLiaisonFichier("utilisateur", "role");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_Role mWD_LIB_Role = new GWDLIB_Role();
/**
 * Initialise tous les champs de FEN_Liste_Utilisateurs.ZR_Utilisateurs
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste_Utilisateurs.ZR_Utilisateurs
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_NomPrenom.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NomPrenom);
mWD_ATT_Email.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Email);
mWD_ATT_Role.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Role);
mWD_ATT_IdUtilisateur.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_IdUtilisateur);
mWD_LIB_NomPrenom.initialiserObjet();
super.ajouterChamp("LIB_NomPrenom",mWD_LIB_NomPrenom);
mWD_LIB_Email.initialiserObjet();
super.ajouterChamp("LIB_Email",mWD_LIB_Email);
mWD_LIB_Role.initialiserObjet();
super.ajouterChamp("LIB_Role",mWD_LIB_Role);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,318,64);
super.setQuid(2969410448642481761l);

super.setChecksum("820038371");

super.setNom("ZR_Utilisateurs");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 55);

super.setTailleInitiale(320, 451);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 318, 64);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(true, 0x603C0C);

super.setStyleSeparateurHorizontaux(3, 0x603C0C);

super.setDessinerLigneVide(false);

super.setCadreCelluleSelection(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Select.png?E5_3NP_4_4_4_4", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 0xFBE1BD, 1, 5));

super.setCouleurCellule(0xEAEAEA, 0xFDFDFD, 0x653D0C, 0xFBE1BD, 0xEAEAEA);

super.setCadreFondLigne(WDCadreFactory.creerCadre_GEN("", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 0xFFFFFFFF, 0, 5));

super.setImagePlusMoins("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Break_Pict.png?E2_4O");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de ZR_Utilisateurs
 */
public void selectionLigne()
{
super.selectionLigne();

// gnIDUtilisateurModifier=  ATT_IdUtilisateur 
//MAP:2935771207ab1e61:00000021:1:FEN_Liste_Utilisateurs.ZR_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDZR_Utilisateurs:Sélection d'une ligne de ZR_Utilisateurs
// gnIDUtilisateurModifier=  ATT_IdUtilisateur 
//MAP:2935771207ab1e61:00000021:1:FEN_Liste_Utilisateurs.ZR_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDZR_Utilisateurs:Sélection d'une ligne de ZR_Utilisateurs
GWDPSSuivApp.getInstance().vWD_gnIDUtilisateurModifier.setValeur(mWD_ATT_IdUtilisateur);

// OuvreFenêtreMobile(FEN_Modifier_Utilisateur)
//MAP:2935771207ab1e61:00000021:2:FEN_Liste_Utilisateurs.ZR_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDZR_Utilisateurs:Sélection d'une ligne de ZR_Utilisateurs
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Modifier_Utilisateur);

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
public GWDZR_Utilisateurs mWD_ZR_Utilisateurs;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Utilisateurs.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969410448642940513l);

super.setChecksum("820487091");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(13, 514);

super.setTailleInitiale(33, 38);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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

// OuvreFenêtreMobile(FEN_Menu_Administrateur)
//MAP:2935771207b21e61:00000012:1:FEN_Liste_Utilisateurs.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDIMG_SansNom1:Clic sur IMG_SansNom1
// OuvreFenêtreMobile(FEN_Menu_Administrateur)
//MAP:2935771207b21e61:00000012:1:FEN_Liste_Utilisateurs.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDIMG_SansNom1:Clic sur IMG_SansNom1
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Administrateur);

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
 * LIB_Liste_Utilisateur
 */
class GWDLIB_Liste_Utilisateur extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste_Utilisateurs.LIB_Liste_Utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969410448643006049l);

super.setChecksum("820550347");

super.setNom("LIB_Liste_Utilisateur");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Liste Utilisateur");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 9);

super.setTailleInitiale(320, 28);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x333333, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -11.000000, 1), 3, 0, 0x2D2D2D);

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
public GWDLIB_Liste_Utilisateur mWD_LIB_Liste_Utilisateur;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste_Utilisateurs.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969410448643071585l);

super.setChecksum("820618163");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(147, 516);

super.setTailleInitiale(28, 34);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\add (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

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
//MAP:2935771207b41e61:00000012:1:FEN_Liste_Utilisateurs.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// OuvreFenêtreMobile('FEN_Ajout_utilisateur')
//MAP:2935771207b41e61:00000012:2:FEN_Liste_Utilisateurs.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs$GWDIMG_SansNom2:Clic sur IMG_SansNom2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Ajout_utilisateur);

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


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Liste_Utilisateurs
////////////////////////////////////////////////////////////////////////////
public WDObjet fWD_libelleRole( WDObjet vWD_nRole )
{
// PROCÉDURE LibelleRole(nRole est un entier)
//MAP:1935771200b51e61:00070000:1:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
initExecProcLocale("LibelleRole");

try
{
vWD_nRole = WDParametre.traiterParametre(vWD_nRole, 1, false, 8);


// SELON nRole
//MAP:1935771200b51e61:00070000:2:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nRole
//MAP:1935771200b51e61:00070000:2:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
WDObjet _WDExpSelon0 = vWD_nRole;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Commerciale"
//MAP:1935771200b51e61:00070000:3:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
return new WDChaineU("Commerciale");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Chauffeur"
//MAP:1935771200b51e61:00070000:4:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
return new WDChaineU("Chauffeur");

}
else if(_WDExpSelon0.opEgal(3))
{
// 	CAS 3 : RENVOYER "Administrateur"
//MAP:1935771200b51e61:00070000:5:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
return new WDChaineU("Administrateur");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
//MAP:1935771200b51e61:00070000:6:FEN_Liste_Utilisateurs.PROCEDURE.LibelleRole:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:LibelleRole
return new WDChaineU("Inconnu");

}

}

}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_Liste_Utilisateurs
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:2935771207aa1e61:00000000:1:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Déclarations globales de FEN_Liste_Utilisateurs
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Liste_Utilisateurs
 */
public void init()
{
super.init();

// ZR_Utilisateurs.SupprimeTout()
//MAP:2935771207aa1e61:00000022:1:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
// ZR_Utilisateurs.SupprimeTout()
//MAP:2935771207aa1e61:00000022:1:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Utilisateurs);

// SI HReadFirst(Utilisateur) ALORS
//MAP:2935771207aa1e61:00000022:3:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 	TANTQUE PAS HOut(Utilisateur)
//MAP:2935771207aa1e61:00000022:5:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
while((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean()))
{
// 		nRole est un entier = Utilisateur.Role
//MAP:2935771207aa1e61:00000022:7:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
WDObjet vWD_nRole = new WDEntier4();


vWD_nRole.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role"));


// 		ZR_Utilisateurs.AjouteLigne(Utilisateur.Nom_Prenom,Utilisateur.Email,LibelleRole(nRole),Utilisateur.IDutilisateur)
//MAP:2935771207aa1e61:00000022:9:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Utilisateurs,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"),WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email"),fWD_libelleRole(vWD_nRole),WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("idutilisateur")} );

// 		HReadNext(Utilisateur)
//MAP:2935771207aa1e61:00000022:b:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

}

}

// ZR_Utilisateurs.Affiche()
//MAP:2935771207aa1e61:00000022:11:FEN_Liste_Utilisateurs:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Utilisateurs:Fin d'initialisation de FEN_Liste_Utilisateurs
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Utilisateurs);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Liste_Utilisateurs
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Utilisateurs = new GWDZR_Utilisateurs();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_LIB_Liste_Utilisateur = new GWDLIB_Liste_Utilisateur();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Liste_Utilisateurs
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969410448642416225l);

super.setChecksum("825959164");

super.setNom("FEN_Liste_Utilisateurs");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Liste Utilisateurs");

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
// Initialisation des champs de FEN_Liste_Utilisateurs
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Utilisateurs.initialiserObjet();
super.ajouter("ZR_Utilisateurs", mWD_ZR_Utilisateurs);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_LIB_Liste_Utilisateur.initialiserObjet();
super.ajouter("LIB_Liste_Utilisateur", mWD_LIB_Liste_Utilisateur);
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
return GWDPSSuivApp.getInstance().mWD_FEN_Liste_Utilisateurs;
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
