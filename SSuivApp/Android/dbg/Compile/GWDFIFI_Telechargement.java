/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FI_Téléchargement
 * Date : 30/11/2025 14:56:06
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.jauge.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.erreur.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.application.executor.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFIFI_Telechargement extends WDFenetreInterne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FI_Téléchargement
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Info
 */
class GWDLIB_Info extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FI_Téléchargement.FI_Téléchargement.LIB_Info
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setQuid(3278809023707269995l);

super.setChecksum("-1779729358");

super.setNom("LIB_Info");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Téléchargement...");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(250, 35);

super.setPlan(2);

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

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -13.000000, 0), 3, 0, 0x2D2D2D);

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
public GWDLIB_Info mWD_LIB_Info;

/**
 * LIB_Progression
 */
class GWDLIB_Progression extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FI_Téléchargement.FI_Téléchargement.LIB_Progression
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setQuid(3278809023707401083l);

super.setChecksum("-1779598270");

super.setNom("LIB_Progression");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Progression");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 34);

super.setTailleInitiale(250, 25);

super.setPlan(2);

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
public GWDLIB_Progression mWD_LIB_Progression;

/**
 * BTN_Télécharger
 */
class GWDBTN_Telecharger extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FI_Téléchargement.FI_Téléchargement.BTN_Télécharger
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setQuid(3278809040887536286l);

super.setChecksum("-1779331791");

super.setNom("BTN_Télécharger");

super.setType(4);

super.setBulle("");

super.setLibelle("Télécharger");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1, 1);

super.setTailleInitiale(247, 69);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -11.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -11.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -11.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0xFBE1BD, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Télécharger
 */
public void clicSurBoutonGauche()
//  Lance le téléchargement
{
super.clicSurBoutonGauche();

// 
//MAP:2d80ab736870da9e:00000012:1:FI_Téléchargement.FI_Téléchargement.BTN_Télécharger:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement$GWDBTN_Telecharger:Clic sur BTN_Télécharger
// TéléchargementDémarre()
//MAP:2d80ab736870da9e:00000012:3:FI_Téléchargement.FI_Téléchargement.BTN_Télécharger:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement$GWDBTN_Telecharger:Clic sur BTN_Télécharger
fWD_telechargementDemarre();

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
public GWDBTN_Telecharger mWD_BTN_Telecharger;

/**
 * JAUGE_Progression
 */
class GWDJAUGE_Progression extends WDJauge
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FI_Téléchargement.FI_Téléchargement.JAUGE_Progression
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setRectCompPrincipal(0,0,250,4);
super.setQuid(3278860961551504545l);

super.setChecksum("1319977245");

super.setNom("JAUGE_Progression");

super.setType(10);

super.setBulle("");

super.setLibelle("Jauge");

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 68);

super.setTailleInitiale(250, 4);

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(-1);

super.setParamJauge(0, 100, 0, false, false);

super.setImage("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_PROGBAR_Activ.png?_3NP_4_4_4_4", 3, 0, 1);

super.setImageFond("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_PROGBAR_Bg.png?_3NP_4_4_4_4", 3, 0, 1);

super.setStyleJauge(0x0, 0xC650288, 0xFBE1BD, 0xFFFFFFFF, true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setParamAnimationChamp(21, 1202, 300);

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
public GWDJAUGE_Progression mWD_JAUGE_Progression;

/**
 * LIB_Fin
 */
class GWDLIB_Fin extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FI_Téléchargement.FI_Téléchargement.LIB_Fin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetreInterne( getWDFenetreInterneThis() );
super.setQuid(3294488171335331601l);

super.setChecksum("-1629252622");

super.setNom("LIB_Fin");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Téléchargement terminé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 25);

super.setTailleInitiale(250, 27);

super.setPlan(3);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
public GWDLIB_Fin mWD_LIB_Fin;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FI_Téléchargement
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
// Initialise (<sURLFichierATelecharger> est chaîne, <sFichierDestination> est chaîne)
// 
//  Paramètres :
// 	sURLFichierATelecharger (chaîne UNICODE) : L'URL du fichier à télécharger
// 	sFichierDestination (chaîne UNICODE) : Le chemin de destination
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Initialise("https://pcsoft.fr/img/accueil/logo-pcsoft-informatique-2016.gif",fRepDonnées+[fSep]+"tmp.gif")
// 
public void fWD_initialise( WDObjet vWD_sURLFichierATelecharger , WDObjet vWD_sFichierDestination )
{
// PROCEDURE Initialise(sURLFichierATelecharger est une chaine, sFichierDestination est un chaine)
//MAP:1d80ab3c065205e9:00070000:e:FI_Téléchargement.PROCEDURE.Initialise:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Initialise
initExecProcLocale("Initialise");

try
{
vWD_sURLFichierATelecharger = WDParametre.traiterParametre(vWD_sURLFichierATelecharger, 1, false, 16);

vWD_sFichierDestination = WDParametre.traiterParametre(vWD_sFichierDestination, 2, false, 16);


// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : Initialise (0)
// 	Code: 301
// 	Message: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.
// 	Ligne : 16, Colonne : 0
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : Initialise (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.\r\n\tLigne : 16, Colonne : 0\r\n\r\n");


// // gsURLFichierATelecharger = sURLFichierATelecharger
// //MAP:1d80ab3c065205e9:00070000:11:FI_Téléchargement.PROCEDURE.Initialise:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Initialise
// 

// // Erreur sur l'objet: FI_Téléchargement
// // 	Traitement : Initialise (0)
// // 	Code: 301
// // 	Message: L'élément 'gsFichierDestination' est inconnu ou inaccessible.
// // 	Ligne : 17, Colonne : 0
// // 
// // 
// WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : Initialise (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsFichierDestination' est inconnu ou inaccessible.\r\n\tLigne : 17, Colonne : 0\r\n\r\n");
// 
// 
// // // gsFichierDestination = sFichierDestination
// // //MAP:1d80ab3c065205e9:00070000:12:FI_Téléchargement.PROCEDURE.Initialise:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Initialise
// // 
// 
// // MaFenêtreInterne..plan = 1
// //MAP:1d80ab3c065205e9:00070000:14:FI_Téléchargement.PROCEDURE.Initialise:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Initialise
// WDContexte.getMaFenetreInterne().setProp(EWDPropriete.PROP_PLAN,1);
// 
}
finally
{
finExecProcLocale();
}

}



//  Résumé : Lance le téléchargement
//  Syntaxe :
//  TéléchargementDémarre ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_telechargementDemarre()
{
// PROCEDURE TéléchargementDémarre()
//MAP:1d80ac290653a3ff:00070000:d:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
initExecProcLocale("TéléchargementDémarre");

try
{
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : TéléchargementDémarre (0)
// 	Code: 301
// 	Message: L'élément 'gsFichierDestination' est inconnu ou inaccessible.
// 	Ligne : 15, Colonne : 3
// 
// 
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : TéléchargementDémarre (0)
// 	Code: 301
// 	Message: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.
// 	Ligne : 15, Colonne : 35
// 
// 
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : TéléchargementDémarre (0)
// 	Code: 301
// 	Message: L'élément 'gsFichierDestination' est inconnu ou inaccessible.
// 	Ligne : 15, Colonne : 3
// 
// 
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : TéléchargementDémarre (0)
// 	Code: 301
// 	Message: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.
// 	Ligne : 15, Colonne : 35
// 
// 
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : TéléchargementDémarre (0)
// 	Code: 301
// 	Message: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.
// 	Ligne : 15, Colonne : 35
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : TéléchargementDémarre (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsFichierDestination' est inconnu ou inaccessible.\r\n\tLigne : 15, Colonne : 3\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : TéléchargementDémarre (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.\r\n\tLigne : 15, Colonne : 35\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : TéléchargementDémarre (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsFichierDestination' est inconnu ou inaccessible.\r\n\tLigne : 15, Colonne : 3\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : TéléchargementDémarre (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.\r\n\tLigne : 15, Colonne : 35\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : TéléchargementDémarre (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.\r\n\tLigne : 15, Colonne : 35\r\n\r\n");


// // si gsFichierDestination ~= "" _ou_ gsURLFichierATelecharger ~= "" ALORS
// //MAP:1d80ac290653a3ff:00070000:10:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// if((.opEgalSouple("") || .opEgalSouple("")))
// {
// // 	Erreur("Veuillez initialiser le bouton en appelant la fonction ""Initialise"" de la fenêtre interne FI_Téléchargement.")
// //MAP:1d80ac290653a3ff:00070000:11:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// WDAPIDialogue.erreur("Veuillez initialiser le bouton en appelant la fonction \"Initialise\" de la fenêtre interne FI_Téléchargement."
// );
// 
// // 	retour
// //MAP:1d80ac290653a3ff:00070000:12:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// return;
// 
// }
// 

// // lib_Progression = ""
// //MAP:1d80ac290653a3ff:00070000:16:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// mWD_LIB_Progression.setValeur("");
// 
// // JAUGE_Progression = 0
// //MAP:1d80ac290653a3ff:00070000:17:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// mWD_JAUGE_Progression.setValeur(0);
// 
// // MaFenêtreInterne..plan = 2
// //MAP:1d80ac290653a3ff:00070000:18:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// WDContexte.getMaFenetreInterne().setProp(EWDPropriete.PROP_PLAN,2);
// 
// // ThreadTéléchargement()
// //MAP:1d80ac290653a3ff:00070000:1b:FI_Téléchargement.PROCEDURE.TéléchargementDémarre:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:TéléchargementDémarre
// fWD_threadTelechargement();
// 
}
finally
{
finExecProcLocale();
}

}



//  Résumé : Callback appelée par HTTPRequête pour indiquer la progression du téléchargement
//  Syntaxe :
// CB_Progression (<nTotalOctets> est entier sur 8 octets, <nOctetsReçus> est entier sur 8 octets)
// 
//  Paramètres :
// 	nTotalOctets (entier sur 8 octets) : la quantité d'octets à recevoir
// 	nOctetsReçus (entier sur 8 octets) : la quantité d'octets déjà reçu
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_cB_Progression( WDObjet vWD_nTotalOctets , WDObjet vWD_nOctetsRecus )
{
// PROCEDURE CB_Progression(nTotalOctets est un entier sur 8, nOctetsReçus est un entier sur 8)
//MAP:1d80d4fe06992407:00070000:e:FI_Téléchargement.PROCEDURE.CB_Progression:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:CB_Progression
initExecProcLocale("CB_Progression");

try
{
vWD_nTotalOctets = WDParametre.traiterParametre(vWD_nTotalOctets, 1, false, 9);

vWD_nOctetsRecus = WDParametre.traiterParametre(vWD_nOctetsRecus, 2, false, 9);


// LIB_Progression = TailleVersChaîne(nOctetsReçus) + "/" + TailleVersChaîne(nTotalOctets)
//MAP:1d80d4fe06992407:00070000:11:FI_Téléchargement.PROCEDURE.CB_Progression:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:CB_Progression
mWD_LIB_Progression.setValeur(WDAPIChaine.tailleVersChaine(vWD_nOctetsRecus.getLong()).opPlus("/").opPlus(WDAPIChaine.tailleVersChaine(vWD_nTotalOctets.getLong())));

// JAUGE_Progression..BorneMax = nTotalOctets
//MAP:1d80d4fe06992407:00070000:14:FI_Téléchargement.PROCEDURE.CB_Progression:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:CB_Progression
mWD_JAUGE_Progression.setProp(EWDPropriete.PROP_BORNEMAX,vWD_nTotalOctets);

// JAUGE_Progression = nOctetsReçus
//MAP:1d80d4fe06992407:00070000:15:FI_Téléchargement.PROCEDURE.CB_Progression:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:CB_Progression
mWD_JAUGE_Progression.setValeur(vWD_nOctetsRecus);

}
finally
{
finExecProcLocale();
}

}



//  Résumé : Thread de téléchargement
//  Syntaxe :
// ThreadTéléchargement ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// // Procédure automatique :
//  La procédure est exécutée manuellement, lors d'un appel dans le code
//  Elle s'exécutera dans un thread (sans avoir besoin d'appeler la fonction ThreadExecute), sans utilisation de HFSQL
//  
public void fWD_threadTelechargement_autoWX()
{
// PROCEDURE ThreadTéléchargement()
//MAP:1d80d597069a78b5:00070000:11:FI_Téléchargement.PROCEDURE.ThreadTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:ThreadTéléchargement
initExecProcLocale("ThreadTéléchargement");

try
{
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : ThreadTéléchargement (0)
// 	Code: 301
// 	Message: L'élément 'gsFichierDestination' est inconnu ou inaccessible.
// 	Ligne : 19, Colonne : 16
// 
// 
// Erreur sur l'objet: FI_Téléchargement
// 	Traitement : ThreadTéléchargement (0)
// 	Code: 301
// 	Message: L'élément 'gsFichierDestination' est inconnu ou inaccessible.
// 	Ligne : 19, Colonne : 16
// 
// 
WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsFichierDestination' est inconnu ou inaccessible.\r\n\tLigne : 19, Colonne : 16\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsFichierDestination' est inconnu ou inaccessible.\r\n\tLigne : 19, Colonne : 16\r\n\r\n");


// // HTTPDestination(gsFichierDestination)
// //MAP:1d80d597069a78b5:00070000:14:FI_Téléchargement.PROCEDURE.ThreadTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:ThreadTéléchargement
// WDAPIHttp.HTTPDestination(.getString());
// 

// // HTTPJauge(CB_Progression)
// //MAP:1d80d597069a78b5:00070000:17:FI_Téléchargement.PROCEDURE.ThreadTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:ThreadTéléchargement
// WDAPIHttp.HTTPJauge((new WDChaineU("FI_Téléchargement.CB_Progression")));
// 
// // Erreur sur l'objet: FI_Téléchargement
// // 	Traitement : ThreadTéléchargement (0)
// // 	Code: 301
// // 	Message: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.
// // 	Ligne : 25, Colonne : 15
// // 
// // 
// // Erreur sur l'objet: FI_Téléchargement
// // 	Traitement : ThreadTéléchargement (0)
// // 	Code: 301
// // 	Message: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.
// // 	Ligne : 25, Colonne : 15
// // 
// // 
// WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.\r\n\tLigne : 25, Colonne : 15\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 301\r\n\tMessage: L'élément 'gsURLFichierATelecharger' est inconnu ou inaccessible.\r\n\tLigne : 25, Colonne : 15\r\n\r\n");
// 
// 
// // // SI HTTPRequête(gsURLFichierATelecharger) ALORS
// // //MAP:1d80d597069a78b5:00070000:1a:FI_Téléchargement.PROCEDURE.ThreadTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:ThreadTéléchargement
// // if(WDAPIHttp.HTTPRequete(.getString()).getBoolean())
// // {
// // // Erreur sur l'objet: FI_Téléchargement
// // // 	Traitement : ThreadTéléchargement (0)
// // // 	Code: 815
// // // 	Message: Le traitement 'FinTéléchargement' attend au plus 0 paramètres et vous en passez 2.
// // // 	Ligne : 26, Colonne : 1
// // // 
// // // 
// // // Erreur sur l'objet: FI_Téléchargement
// // // 	Traitement : ThreadTéléchargement (0)
// // // 	Code: 1000083
// // // 	Message: Procédure multisyntaxe : FinTéléchargement. Les procédures multisyntaxes ne sont pas disponibles en Android dans cette version.
// // // 	Ligne : 26, Colonne : 1
// // // 
// // // 
// // WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 815\r\n\tMessage: Le traitement 'FinTéléchargement' attend au plus 0 paramètres et vous en passez 2.\r\n\tLigne : 26, Colonne : 1\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 1000083\r\n\tMessage: Procédure multisyntaxe : FinTéléchargement. Les procédures multisyntaxes ne sont pas disponibles en Android dans cette version.\r\n\tLigne : 26, Colonne : 1\r\n\r\n");
// // 
// // 
// // // // 	FinTéléchargement(Vrai,"")
// // // //MAP:1d80d597069a78b5:00070000:1b:FI_Téléchargement.PROCEDURE.ThreadTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:ThreadTéléchargement
// // // 
// // 
// // }
// // else
// // {
// // // Erreur sur l'objet: FI_Téléchargement
// // // 	Traitement : ThreadTéléchargement (0)
// // // 	Code: 815
// // // 	Message: Le traitement 'FinTéléchargement' attend au plus 0 paramètres et vous en passez 2.
// // // 	Ligne : 28, Colonne : 1
// // // 
// // // 
// // // Erreur sur l'objet: FI_Téléchargement
// // // 	Traitement : ThreadTéléchargement (0)
// // // 	Code: 1000083
// // // 	Message: Procédure multisyntaxe : FinTéléchargement. Les procédures multisyntaxes ne sont pas disponibles en Android dans cette version.
// // // 	Ligne : 28, Colonne : 1
// // // 
// // // 
// // WDErreurManager.erreurGeneration("Erreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 815\r\n\tMessage: Le traitement 'FinTéléchargement' attend au plus 0 paramètres et vous en passez 2.\r\n\tLigne : 28, Colonne : 1\r\n\r\n\r\nErreur sur l'objet: FI_Téléchargement\r\n\tTraitement : ThreadTéléchargement (0)\r\n\tCode: 1000083\r\n\tMessage: Procédure multisyntaxe : FinTéléchargement. Les procédures multisyntaxes ne sont pas disponibles en Android dans cette version.\r\n\tLigne : 28, Colonne : 1\r\n\r\n");
// // 
// // 
// // // // 	FinTéléchargement(faux,ErreurInfo)
// // // //MAP:1d80d597069a78b5:00070000:1d:FI_Téléchargement.PROCEDURE.ThreadTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:ThreadTéléchargement
// // // 
// // 
// // }
// // 
// 
}
finally
{
finExecProcLocale();
}

}

public void fWD_threadTelechargement()
{
WDProcExecutorThread.getInstance().initExecAutoProcedure_GEN("ThreadTéléchargement", 1, 100l, 0, 0);
}


//  Résumé : Appelé à la fin du téléchargement
//  Syntaxe :
// FinTéléchargement (<bSuccès> est booléen, <sErreur> est chaîne)
// 
//  Paramètres :
// 	bSuccès (booléen) : Vrai en cas de succès
// 	sErreur (chaîne UNICODE) : La potentielle erreur
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_finTelechargement_autoWX( WDObjet vWD_bSucces , WDObjet vWD_sErreur )
{
// PROCEDURE FinTéléchargement(bSuccès est un booléen, sErreur est une chaine)
//MAP:1d80d5ad069bcd0f:00070000:e:FI_Téléchargement.PROCEDURE.FinTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:FinTéléchargement
initExecProcLocale("FinTéléchargement");

try
{
vWD_bSucces = WDParametre.traiterParametre(vWD_bSucces, 1, false, 1);

vWD_sErreur = WDParametre.traiterParametre(vWD_sErreur, 2, false, 16);


// si bSuccès ALORS
//MAP:1d80d5ad069bcd0f:00070000:10:FI_Téléchargement.PROCEDURE.FinTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:FinTéléchargement
if(vWD_bSucces.getBoolean())
{
// 	ToastAffiche("Fichier téléchargé avec succès")
//MAP:1d80d5ad069bcd0f:00070000:11:FI_Téléchargement.PROCEDURE.FinTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:FinTéléchargement
WDAPIToast.toastAffiche("Fichier téléchargé avec succès"
);

}
else
{
// 	Erreur("Erreur lors du téléchargement du fichier.",sErreur)	
//MAP:1d80d5ad069bcd0f:00070000:13:FI_Téléchargement.PROCEDURE.FinTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:FinTéléchargement
WDAPIDialogue.erreur("Erreur lors du téléchargement du fichier."
,new String[] {vWD_sErreur.getString()} );

}

// MaFenêtreInterne..plan = 3
//MAP:1d80d5ad069bcd0f:00070000:17:FI_Téléchargement.PROCEDURE.FinTéléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:FinTéléchargement
WDContexte.getMaFenetreInterne().setProp(EWDPropriete.PROP_PLAN,3);

}
finally
{
finExecProcLocale();
}

}

public void fWD_finTelechargement(WDObjet vWD_bSucces, WDObjet vWD_sErreur)
{
WDProcExecutorUIThread.getInstance().initExecAutoProcedure_GEN("FinTéléchargement", 1, 0l, 0, 1, vWD_bSucces, vWD_sErreur);
}



/**
 * Traitement: Déclarations globales de FI_Téléchargement
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:2d80ab08684238e4:00000000:1:FI_Téléchargement.FI_Téléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Déclarations globales de FI_Téléchargement
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// gsURLFichierATelecharger est une chaîne
//MAP:2d80ab08684238e4:00000000:4:FI_Téléchargement.FI_Téléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Déclarations globales de FI_Téléchargement
vWD_gsURLFichierATelecharger = new WDChaineU();

super.ajouterVariableGlobale("gsURLFichierATelecharger",vWD_gsURLFichierATelecharger);



// gsFichierDestination est une chaîne
//MAP:2d80ab08684238e4:00000000:5:FI_Téléchargement.FI_Téléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Déclarations globales de FI_Téléchargement
vWD_gsFichierDestination = new WDChaineU();

super.ajouterVariableGlobale("gsFichierDestination",vWD_gsFichierDestination);



}




/**
 * Traitement: Fin d'initialisation de FI_Téléchargement
 */
public void init()
{
super.init();

// 
//MAP:2d80ab08684238e4:0000000e:1:FI_Téléchargement.FI_Téléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Fin d'initialisation de FI_Téléchargement
// MaFenêtreInterne..Plan = 1
//MAP:2d80ab08684238e4:0000000e:2:FI_Téléchargement.FI_Téléchargement:com.masociete.tracklet.wdgen.GWDFIFI_Telechargement:Fin d'initialisation de FI_Téléchargement
WDContexte.getMaFenetreInterne().setProp(EWDPropriete.PROP_PLAN,1);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gsURLFichierATelecharger = WDVarNonAllouee.ref;
 public WDObjet vWD_gsFichierDestination = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FI_Téléchargement
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Info = new GWDLIB_Info();
mWD_LIB_Progression = new GWDLIB_Progression();
mWD_BTN_Telecharger = new GWDBTN_Telecharger();
mWD_JAUGE_Progression = new GWDJAUGE_Progression();
mWD_LIB_Fin = new GWDLIB_Fin();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FI_Téléchargement
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setQuid(3278808581322979556l);

super.setChecksum("-1782375188");

super.setNom("FI_Téléchargement");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setTailleInitiale(250, 72);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setCouleurFond(0xFFFFFFFF);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FI_Téléchargement
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Info.initialiserObjet();
super.ajouter("LIB_Info", mWD_LIB_Info);
mWD_LIB_Progression.initialiserObjet();
super.ajouter("LIB_Progression", mWD_LIB_Progression);
mWD_BTN_Telecharger.initialiserObjet();
super.ajouter("BTN_Télécharger", mWD_BTN_Telecharger);
mWD_JAUGE_Progression.initialiserObjet();
super.ajouter("JAUGE_Progression", mWD_JAUGE_Progression);
mWD_LIB_Fin.initialiserObjet();
super.ajouter("LIB_Fin", mWD_LIB_Fin);

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
}
