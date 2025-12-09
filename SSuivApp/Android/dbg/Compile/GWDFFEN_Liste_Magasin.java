/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Liste_Magasin
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
import fr.pcsoft.wdjava.core.erreur.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Liste_Magasin extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Liste_Magasin
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Magasins
 */
class GWDZR_Magasins extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Magasin.ZR_Magasins
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_NomMagasin
 */
class GWDATT_NomMagasin extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Magasin.ZR_Magasins.ATT_NomMagasin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NomMagasin");

super.setChampAssocie(mWD_LIB_NomMagasin);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Magasin.ZR_Magasins.ATT_NomMagasin

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NomMagasin mWD_ATT_NomMagasin = new GWDATT_NomMagasin();

/**
 * ATT_Addresse
 */
class GWDATT_Addresse extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Magasin.ZR_Magasins.ATT_Addresse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Addresse");

super.setChampAssocie(mWD_LIB_Addresse);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Magasin.ZR_Magasins.ATT_Addresse

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Addresse mWD_ATT_Addresse = new GWDATT_Addresse();

/**
 * ATT_Phone
 */
class GWDATT_Phone extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste_Magasin.ZR_Magasins.ATT_Phone
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Phone");

super.setChampAssocie(mWD_LIB_Phone);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Magasin.ZR_Magasins.ATT_Phone

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Phone mWD_ATT_Phone = new GWDATT_Phone();

/**
 * LIB_NomMagasin
 */
class GWDLIB_NomMagasin extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste_Magasin.ZR_Magasins.LIB_NomMagasin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970261805560217908l);

super.setChecksum("730612716");

super.setNom("LIB_NomMagasin");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NomMagasin");

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
public GWDLIB_NomMagasin mWD_LIB_NomMagasin = new GWDLIB_NomMagasin();

/**
 * LIB_Addresse
 */
class GWDLIB_Addresse extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Liste_Magasin.ZR_Magasins.LIB_Addresse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970261805560283444l);

super.setChecksum("730678252");

super.setNom("LIB_Addresse");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Addresse");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-1, 30);

super.setTailleInitiale(322, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

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
public GWDLIB_Addresse mWD_LIB_Addresse = new GWDLIB_Addresse();

/**
 * LIB_Phone
 */
class GWDLIB_Phone extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Liste_Magasin.ZR_Magasins.LIB_Phone
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970263210020421978l);

super.setChecksum("736511321");

super.setNom("LIB_Phone");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Phone");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(185, 11);

super.setTailleInitiale(125, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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
public GWDLIB_Phone mWD_LIB_Phone = new GWDLIB_Phone();
/**
 * Initialise tous les champs de FEN_Liste_Magasin.ZR_Magasins
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste_Magasin.ZR_Magasins
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_NomMagasin.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NomMagasin);
mWD_ATT_Addresse.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Addresse);
mWD_ATT_Phone.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Phone);
mWD_LIB_NomMagasin.initialiserObjet();
super.ajouterChamp("LIB_NomMagasin",mWD_LIB_NomMagasin);
mWD_LIB_Addresse.initialiserObjet();
super.ajouterChamp("LIB_Addresse",mWD_LIB_Addresse);
mWD_LIB_Phone.initialiserObjet();
super.ajouterChamp("LIB_Phone",mWD_LIB_Phone);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,318,64);
super.setQuid(2970261805559890228l);

super.setChecksum("730297348");

super.setNom("ZR_Magasins");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1, -2);

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
 * Traitement: Sélection d'une ligne de ZR_Magasins
 */
public void selectionLigne()
{
super.selectionLigne();

// gnIDUtilisateurModifier=  ATT_IdUtilisateur 
//MAP:29387d60024ec134:00000021:1:FEN_Liste_Magasin.ZR_Magasins:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDZR_Magasins:Sélection d'une ligne de ZR_Magasins
// Erreur sur l'objet: FEN_Liste_Magasin.ZR_Magasins
// 	Traitement : Sélection d'une ligne de ZR_Magasins (33)
// 	Code: 301
// 	Message: L'élément 'ATT_IdUtilisateur' est inconnu ou inaccessible.
// 	Ligne : 0, Colonne : 26
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Liste_Magasin.ZR_Magasins\r\n\tTraitement : Sélection d'une ligne de ZR_Magasins (33)\r\n\tCode: 301\r\n\tMessage: L'élément 'ATT_IdUtilisateur' est inconnu ou inaccessible.\r\n\tLigne : 0, Colonne : 26\r\n\r\n");


// // gnIDUtilisateurModifier=  ATT_IdUtilisateur 
// //MAP:29387d60024ec134:00000021:1:FEN_Liste_Magasin.ZR_Magasins:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDZR_Magasins:Sélection d'une ligne de ZR_Magasins
// GWDPSSuivApp.getInstance().vWD_gnIDUtilisateurModifier.setValeur();
// 

// // OuvreFenêtreMobile(FEN_Modifier_Utilisateur)
// //MAP:29387d60024ec134:00000021:2:FEN_Liste_Magasin.ZR_Magasins:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDZR_Magasins:Sélection d'une ligne de ZR_Magasins
// WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Modifier_Utilisateur);
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
public GWDZR_Magasins mWD_ZR_Magasins;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Magasin.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970261805560545603l);

super.setChecksum("730942691");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(148, 459);

super.setTailleInitiale(28, 34);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\add (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

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
//MAP:29387d600258c143:00000012:1:FEN_Liste_Magasin.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// OuvreFenêtreMobile('FEN_Ajout_utilisateur')
//MAP:29387d600258c143:00000012:2:FEN_Liste_Magasin.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDIMG_SansNom2:Clic sur IMG_SansNom2
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

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste_Magasin.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970261805560807747l);

super.setChecksum("731204835");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(14, 457);

super.setTailleInitiale(33, 38);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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
//MAP:29387d60025cc143:00000012:1:FEN_Liste_Magasin.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDIMG_SansNom1:Clic sur IMG_SansNom1
// OuvreFenêtreMobile(FEN_Menu_Administrateur)
//MAP:29387d60025cc143:00000012:1:FEN_Liste_Magasin.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin$GWDIMG_SansNom1:Clic sur IMG_SansNom1
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
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Magasin.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x7A582D, false);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_Liste_Magasin
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:29387d31023808f0:00000000:1:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Déclarations globales de FEN_Liste_Magasin
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Liste_Magasin
 */
public void init()
{
super.init();

// 
//MAP:29387d31023808f0:00000022:1:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
// ZR_Magasins.SupprimeTout()
//MAP:29387d31023808f0:00000022:2:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Magasins);

// SI HReadFirst(Magasin) ALORS
//MAP:29387d31023808f0:00000022:4:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("magasin")).getBoolean())
{
// 	TANTQUE PAS HOut(Magasin)
//MAP:29387d31023808f0:00000022:6:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
while((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("magasin")).getBoolean()))
{
// 		ZR_Magasins.AjouteLigne(Magasin.NomMagasin,Magasin.Adresse,Magasin.Num_tel)
//MAP:29387d31023808f0:00000022:8:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Magasins,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("nommagasin"),WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("adresse"),WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("num_tel")} );

// 		HReadNext(Magasin)
//MAP:29387d31023808f0:00000022:a:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("magasin"));

}

}

// ZR_Magasins.Affiche()
//MAP:29387d31023808f0:00000022:10:FEN_Liste_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Magasin:Fin d'initialisation de FEN_Liste_Magasin
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Magasins);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Liste_Magasin
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Magasins = new GWDZR_Magasins();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Liste_Magasin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2970261603694938352l);

super.setChecksum("734064666");

super.setNom("FEN_Liste_Magasin");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("Liste Magasin");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste_Magasin
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Magasins.initialiserObjet();
super.ajouter("ZR_Magasins", mWD_ZR_Magasins);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

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
return 1;
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
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
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
return GWDPSSuivApp.getInstance().mWD_FEN_Liste_Magasin;
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
