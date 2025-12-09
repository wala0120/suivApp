/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Magasin
 * Date : 10/12/2025 00:22:06
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.erreur.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Magasin extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Magasin
////////////////////////////////////////////////////////////////////////////

/**
 * _2
 */
class GWD_2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Magasin._2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643281434524l);

super.setChecksum("800002192");

super.setNom("_2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-22, -1);

super.setTailleInitiale(397, 176);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFDE1C6, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xE1E1E1, 0x616161, 0xFDE1C6, 50.000000, 50.000000, 1, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(34, 31, 30);

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
// Déclaration des champs du fils n°2 de FEN_Magasin.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643281500060l);

super.setChecksum("800070008");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(84, 51);

super.setTailleInitiale(280, 199);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\express-delivery.png");

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

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 52.000000, 52.000000, 1, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(24, 21, 15);

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
 * Nom_de_magasin3
 */
class GWDNom_de_magasin3 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Magasin.Nom_de_magasin3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,289,20);
super.setRectCompPrincipal(77,20,205,46);
super.setQuid(2969406643281565596l);

super.setChecksum("800132808");

super.setNom("Nom_de_magasin3");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom de magasin ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(50);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(18, 234);

super.setTailleInitiale(289, 69);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("magasin", "nommagasin");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

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

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -7.000000, 0), 2, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0x969696, 0x161616, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setStyleSaisie(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0));

super.setStyleTexteIndication(0x999999, creerPolice_GEN("Verdana", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF9F8F8, 0x797878, 0xEAEAEA, 4.000000, 4.000000, 1, 1), 0x7A6E6A, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
public int getModeSaisieAssistee()
{
return 1;
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDNom_de_magasin3 mWD_Nom_de_magasin3;

/**
 * adresse1
 */
class GWDadresse1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Magasin.adresse1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,273,20);
super.setRectCompPrincipal(70,20,188,47);
super.setQuid(2969406643281631132l);

super.setChecksum("800198344");

super.setNom("adresse1");

super.setType(20001);

super.setBulle("");

super.setLibelle("adresse");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(50);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(34, 312);

super.setTailleInitiale(273, 70);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("magasin", "adresse");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 500, 0);

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

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -7.000000, 0), 2, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBooking2_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0));

super.setStyleTexteIndication(0x999999, creerPolice_GEN("Verdana", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF9F8F8, 0x797878, 0xEAEAEA, 4.000000, 4.000000, 1, 1), 0x7A6E6A, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
public int getModeSaisieAssistee()
{
return 1;
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDadresse1 mWD_adresse1;

/**
 * Nom_de_magasin4
 */
class GWDNom_de_magasin4 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Magasin.Nom_de_magasin4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,272,20);
super.setRectCompPrincipal(73,20,188,47);
super.setQuid(2969406643281696668l);

super.setChecksum("800310341");

super.setNom("Nom_de_magasin4");

super.setType(20004);

super.setBulle("");

super.setLibelle("n°tel");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(27, 394);

super.setTailleInitiale(272, 70);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setLiaisonFichier("magasin", "num_tel");

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

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

super.setMasqueAffichage(new WDChaineU("99 999 999"));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -7.000000, 0), 2, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBooking2_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0));

super.setStyleTexteIndication(0x999999, creerPolice_GEN("Verdana", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF9F8F8, 0x797878, 0xEAEAEA, 4.000000, 4.000000, 1, 1), 0x7A6E6A, 0xFF000001, "", 1);

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
public GWDNom_de_magasin4 mWD_Nom_de_magasin4;

/**
 * Image4
 */
class GWDImage4 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Magasin.Image4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643281762204l);

super.setChecksum("800332152");

super.setNom("Image4");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(38, 483);

super.setTailleInitiale(35, 72);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\diskette.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(1, 1000, 1000, 500, 500, 0);

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
 * IMG_SansNom6
 */
class GWDIMG_SansNom6 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Magasin.IMG_SansNom6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643281827740l);

super.setChecksum("800397688");

super.setNom("IMG_SansNom6");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(41, 234);

super.setTailleInitiale(35, 78);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\profile.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 500, 0);

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

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_SansNom6 mWD_IMG_SansNom6;

/**
 * IMG_SansNom7
 */
class GWDIMG_SansNom7 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Magasin.IMG_SansNom7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643281893276l);

super.setChecksum("800463224");

super.setNom("IMG_SansNom7");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(41, 339);

super.setTailleInitiale(36, 47);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\location (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 500, 0);

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

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_SansNom7 mWD_IMG_SansNom7;

/**
 * IMG_SansNom9
 */
class GWDIMG_SansNom9 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Magasin.IMG_SansNom9
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643281958812l);

super.setChecksum("800528760");

super.setNom("IMG_SansNom9");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(45, 401);

super.setTailleInitiale(32, 63);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\phone-call.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(4, 1000, 1000, 500, 500, 0);

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

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

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
public GWDIMG_SansNom9 mWD_IMG_SansNom9;

/**
 * Bouton3
 */
class GWDBouton3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Magasin.Bouton3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643282024348l);

super.setChecksum("800592472");

super.setNom("Bouton3");

super.setType(4);

super.setBulle("");

super.setLibelle("Enregistrer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(95, 497);

super.setTailleInitiale(185, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setNumTab(4);

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
 * Traitement: Clic sur Bouton3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:2935739c0682979c:00000012:1:FEN_Magasin.Bouton3:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDBouton3:Clic sur Bouton3
// EcranVersFichier()
//MAP:2935739c0682979c:00000012:2:FEN_Magasin.Bouton3:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDBouton3:Clic sur Bouton3
WDAPIFenetre.ecranVersFichier();

// HEnregistre(magasin)  
//MAP:2935739c0682979c:00000012:3:FEN_Magasin.Bouton3:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDBouton3:Clic sur Bouton3
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("magasin"));

// ferme()
//MAP:2935739c0682979c:00000012:4:FEN_Magasin.Bouton3:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDBouton3:Clic sur Bouton3
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
public GWDBouton3 mWD_Bouton3;

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Magasin.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643282089884l);

super.setChecksum("800657552");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Informations du Magasin");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 20);

super.setTailleInitiale(314, 78);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x7A6E6A, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -15.000000, 0), 3, 0, 0x2D2D2D);

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
public GWDLIB_SansNom1 mWD_LIB_SansNom1;

/**
 * _3
 */
class GWD_3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Magasin._3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643282155420l);

super.setChecksum("800723088");

super.setNom("_3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 602);

super.setTailleInitiale(315, 55);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

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
public GWD_3 mWD__3;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Magasin.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643282220956l);

super.setChecksum("800790904");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(18, 601);

super.setTailleInitiale(42, 56);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(13);

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

// OuvreFenêtreMobile(FEN_Liste_Magasin)
//MAP:2935739c0685979c:00000012:1:FEN_Magasin.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// OuvreFenêtreMobile(FEN_Liste_Magasin)
//MAP:2935739c0685979c:00000012:1:FEN_Magasin.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDIMG_SansNom2:Clic sur IMG_SansNom2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Magasin);

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
 * IMG_SansNom3
 */
class GWDIMG_SansNom3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_Magasin.IMG_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643282286492l);

super.setChecksum("800856440");

super.setNom("IMG_SansNom3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(136, 608);

super.setTailleInitiale(45, 42);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\list.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

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
 * Traitement: Clic sur IMG_SansNom3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile('FEN_menu réclamation')
//MAP:2935739c0686979c:00000012:1:FEN_Magasin.IMG_SansNom3:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDIMG_SansNom3:Clic sur IMG_SansNom3
// Erreur sur l'objet: FEN_Magasin.IMG_SansNom3
// 	Traitement : Clic sur IMG_SansNom3 (18)
// 	Code: 301
// 	Message: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.
// 	Ligne : 0, Colonne : 19
// 
// 
// Erreur sur l'objet: FEN_Magasin.IMG_SansNom3
// 	Traitement : Clic sur IMG_SansNom3 (18)
// 	Code: 301
// 	Message: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.
// 	Ligne : 0, Colonne : 19
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FEN_Magasin.IMG_SansNom3\r\n\tTraitement : Clic sur IMG_SansNom3 (18)\r\n\tCode: 301\r\n\tMessage: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.\r\n\tLigne : 0, Colonne : 19\r\n\r\n\r\nErreur sur l'objet: FEN_Magasin.IMG_SansNom3\r\n\tTraitement : Clic sur IMG_SansNom3 (18)\r\n\tCode: 301\r\n\tMessage: L'élément 'FEN_menu réclamation' est inconnu ou inaccessible.\r\n\tLigne : 0, Colonne : 19\r\n\r\n");


// // OuvreFenêtreMobile('FEN_menu réclamation')
// //MAP:2935739c0686979c:00000012:1:FEN_Magasin.IMG_SansNom3:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDIMG_SansNom3:Clic sur IMG_SansNom3
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
public GWDIMG_SansNom3 mWD_IMG_SansNom3;

/**
 * IMG_SansNom8
 */
class GWDIMG_SansNom8 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_Magasin.IMG_SansNom8
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406643282352028l);

super.setChecksum("800921976");

super.setNom("IMG_SansNom8");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(261, 606);

super.setTailleInitiale(42, 46);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\right.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(5, 0, 1000, 1000, 1000, 0);

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

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_SansNom8
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(réclamation)
//MAP:2935739c0687979c:00000012:1:FEN_Magasin.IMG_SansNom8:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDIMG_SansNom8:Clic sur IMG_SansNom8
// OuvreFenêtreMobile(réclamation)
//MAP:2935739c0687979c:00000012:1:FEN_Magasin.IMG_SansNom8:com.masociete.tracklet.wdgen.GWDFFEN_Magasin$GWDIMG_SansNom8:Clic sur IMG_SansNom8
WDAPIFenetre.ouvreFille(WDAPIHF.getFichierSansCasseNiAccent("reclamation"));

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
public GWDIMG_SansNom8 mWD_IMG_SansNom8;

/**
 * Traitement: Déclarations globales de FEN_Magasin
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
//MAP:2935739c0678978c:00000000:1:FEN_Magasin:com.masociete.tracklet.wdgen.GWDFFEN_Magasin:Déclarations globales de FEN_Magasin
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
// Création des champs de la fenêtre FEN_Magasin
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD__2 = new GWD_2();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_Nom_de_magasin3 = new GWDNom_de_magasin3();
mWD_adresse1 = new GWDadresse1();
mWD_Nom_de_magasin4 = new GWDNom_de_magasin4();
mWD_Image4 = new GWDImage4();
mWD_IMG_SansNom6 = new GWDIMG_SansNom6();
mWD_IMG_SansNom7 = new GWDIMG_SansNom7();
mWD_IMG_SansNom9 = new GWDIMG_SansNom9();
mWD_Bouton3 = new GWDBouton3();
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD__3 = new GWD_3();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
mWD_IMG_SansNom3 = new GWDIMG_SansNom3();
mWD_IMG_SansNom8 = new GWDIMG_SansNom8();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Magasin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969406643281368972l);

super.setChecksum("806895281");

super.setNom("FEN_Magasin");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(350, 661);

super.setTitre("Magasin ");

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
// Initialisation des champs de FEN_Magasin
////////////////////////////////////////////////////////////////////////////
mWD__2.initialiserObjet();
super.ajouter("_2", mWD__2);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_Nom_de_magasin3.initialiserObjet();
super.ajouter("Nom_de_magasin3", mWD_Nom_de_magasin3);
mWD_adresse1.initialiserObjet();
super.ajouter("adresse1", mWD_adresse1);
mWD_Nom_de_magasin4.initialiserObjet();
super.ajouter("Nom_de_magasin4", mWD_Nom_de_magasin4);
mWD_Image4.initialiserObjet();
super.ajouter("Image4", mWD_Image4);
mWD_IMG_SansNom6.initialiserObjet();
super.ajouter("IMG_SansNom6", mWD_IMG_SansNom6);
mWD_IMG_SansNom7.initialiserObjet();
super.ajouter("IMG_SansNom7", mWD_IMG_SansNom7);
mWD_IMG_SansNom9.initialiserObjet();
super.ajouter("IMG_SansNom9", mWD_IMG_SansNom9);
mWD_Bouton3.initialiserObjet();
super.ajouter("Bouton3", mWD_Bouton3);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD__3.initialiserObjet();
super.ajouter("_3", mWD__3);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);
mWD_IMG_SansNom3.initialiserObjet();
super.ajouter("IMG_SansNom3", mWD_IMG_SansNom3);
mWD_IMG_SansNom8.initialiserObjet();
super.ajouter("IMG_SansNom8", mWD_IMG_SansNom8);

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
return GWDPSSuivApp.getInstance().mWD_FEN_Magasin;
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
