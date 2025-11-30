/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : nouveau utilisateur
 * Date : 30/11/2025 14:56:06
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.email.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFnouveau_utilisateur extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de nouveau utilisateur
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_EMail
 */
class GWDSAI_EMail extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de nouveau utilisateur.SAI_EMail
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,102,34);
super.setRectCompPrincipal(103,3,183,34);
super.setQuid(2961940495448031658l);

super.setChecksum("773927530");

super.setNom("SAI_EMail");

super.setType(20001);

super.setBulle("");

super.setLibelle("E-Mail");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 289);

super.setTailleInitiale(300, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "email");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x2D2D2D, 0x0, 0xFFFFFFFF, 157.000000, 157.000000, 1, 1), 0, 0, 0, 0);

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
public GWDSAI_EMail mWD_SAI_EMail;

/**
 * SAI_Nom_Prénom
 */
class GWDSAI_Nom_Prenom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de nouveau utilisateur.SAI_Nom_Prénom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,101,34);
super.setRectCompPrincipal(102,3,182,34);
super.setQuid(2961940495448097194l);

super.setChecksum("773993066");

super.setNom("SAI_Nom_Prénom");

super.setType(20001);

super.setBulle("");

super.setLibelle(" Nom prénom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(50);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 239);

super.setTailleInitiale(300, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "nom_prenom");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x603C0C, 0x0, 0xFFFFFFFF, 157.000000, 157.000000, 1, 1), 0, 0, 0, 0);

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
public int getModeSaisieAssistee()
{
return 1;
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Nom_Prenom mWD_SAI_Nom_Prenom;

/**
 * _2
 */
class GWD_2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de nouveau utilisateur._2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961940495448162730l);

super.setChecksum("774059058");

super.setNom("_2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 1);

super.setTailleInitiale(320, 188);

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFDE1C6, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xFDE1C6, new int[] {0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1}, new int[] {3, 5, 3, 5, 31, 28, 31, 29}), 0, 0, 0, 0);


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
// Déclaration des champs du fils n°4 de nouveau utilisateur.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961940495448228266l);

super.setChecksum("774126874");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-108, 50);

super.setTailleInitiale(387, 189);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\add-group.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(24, 21, 0);

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
 * Bouton2
 */
class GWDBouton2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de nouveau utilisateur.Bouton2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961940495448293802l);

super.setChecksum("774190586");

super.setNom("Bouton2");

super.setType(4);

super.setBulle("");

super.setLibelle("Enregistrer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(70, 486);

super.setTailleInitiale(160, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

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

super.setImageFond("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\ProjetBandDeReception\\TrackIt\\FBooking2_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur Bouton2
 */
public void clicSurBoutonGauche()
//  --- Récupérer l'email ---
{
super.clicSurBoutonGauche();

// // --- Récupérer l'email ---
//MAP:291aed30050a41aa:00000012:1:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sEmail = new WDChaineU();

WDObjet vWD_pos = new WDEntier4();

WDObjet vWD_domaine = new WDChaineU();

WDObjet vWD_LongueurMDP = new WDEntier4();

WDObjet vWD_CaracteresMDP = new WDChaineU();

WDObjet vWD_MotDePasse = new WDChaineU();



// utilisateur.Email = SAI_EMail..Valeur
//MAP:291aed30050a41aa:00000012:2:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email").setValeur(mWD_SAI_EMail.getProp(EWDPropriete.PROP_VALEUR));

// SI HLitRecherche(utilisateur, Email, utilisateur.Email) ALORS
//MAP:291aed30050a41aa:00000012:5:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("email"),WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email")).getBoolean())
{
// 	Erreur("Cet email existe déjà ! Veuillez en choisir un autre.")
//MAP:291aed30050a41aa:00000012:6:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Cet email existe déjà ! Veuillez en choisir un autre.");

// 	RETOUR
//MAP:291aed30050a41aa:00000012:7:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

// sEmail est une chaîne = utilisateur.Email
//MAP:291aed30050a41aa:00000012:b:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

vWD_sEmail.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email"));


// SI PAS VerifieEmail(sEmail) ALORS
//MAP:291aed30050a41aa:00000012:c:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
if((!fWD_verifieEmail(vWD_sEmail).getBoolean()))
{
// 	Erreur("Email invalide. Exemple : nom@gmail.com")
//MAP:291aed30050a41aa:00000012:d:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Email invalide. Exemple : nom@gmail.com");

// 	RETOUR
//MAP:291aed30050a41aa:00000012:e:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

// pos		est un entier	= Position(sEmail, "@")
//MAP:291aed30050a41aa:00000012:11:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

vWD_pos.setValeur(WDAPIChaine.position(vWD_sEmail,new WDChaineU("@")));


// domaine	est une chaîne	= Milieu(sEmail, pos + 1)
//MAP:291aed30050a41aa:00000012:12:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

vWD_domaine.setValeur(WDAPIChaine.milieu(vWD_sEmail,vWD_pos.opPlus(1).getInt()));


// SI Position(domaine, ".") = 0 ALORS
//MAP:291aed30050a41aa:00000012:13:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIChaine.position(vWD_domaine,new WDChaineU(".")).opEgal(0))
{
// 	Erreur("Email invalide. Exemple : nom@gmail.com")
//MAP:291aed30050a41aa:00000012:14:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Email invalide. Exemple : nom@gmail.com");

// 	RETOUR
//MAP:291aed30050a41aa:00000012:15:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

// InitHasard()
//MAP:291aed30050a41aa:00000012:19:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDiversSTD.initHasard();

// LongueurMDP		est un entier	= 8
//MAP:291aed30050a41aa:00000012:1d:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

vWD_LongueurMDP.setValeur(8);


// CaractèresMDP	est une chaîne	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*"
//MAP:291aed30050a41aa:00000012:1e:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

vWD_CaracteresMDP.setValeur("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*");


// MotDePasse		est une chaîne	= ""
//MAP:291aed30050a41aa:00000012:1f:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2

vWD_MotDePasse.setValeur("");


// POUR i = 1 À LongueurMDP
//MAP:291aed30050a41aa:00000012:21:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
// POUR i = 1 À LongueurMDP
//MAP:291aed30050a41aa:00000012:21:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(vWD_LongueurMDP);vWD_i.opInc())
{
// 	index est un entier = Hasard(1, Taille(CaractèresMDP))
//MAP:291aed30050a41aa:00000012:22:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDObjet vWD_index = new WDEntier4();


vWD_index.setValeur(WDAPIDiversSTD.hasard(1,WDAPIChaine.taille(vWD_CaracteresMDP).getInt()));


// 	MotDePasse += Milieu(CaractèresMDP, index, 1)
//MAP:291aed30050a41aa:00000012:23:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
vWD_MotDePasse.setValeur(vWD_MotDePasse.opPlus(WDAPIChaine.milieu(vWD_CaracteresMDP,vWD_index.getInt(),1)));

}

// utilisateur.mot_De_passe = MotDePasse
//MAP:291aed30050a41aa:00000012:26:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mot_de_passe").setValeur(vWD_MotDePasse);

// utilisateur.mot_De_passe = MotDePasse
//MAP:291aed30050a41aa:00000012:29:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mot_de_passe").setValeur(vWD_MotDePasse);

// EcranVersFichier()
//MAP:291aed30050a41aa:00000012:2c:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIFenetre.ecranVersFichier();

// SI HAjoute(utilisateur) ALORS
//MAP:291aed30050a41aa:00000012:2f:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 	EnvoyerEmail(utilisateur.Email,"Votre nouveau compte","Bonjour," + RC + "Votre mot de passe est : " + MotDePasse)
//MAP:291aed30050a41aa:00000012:32:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
fWD_envoyerEmail(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email"),new WDChaineU("Votre nouveau compte"),new WDChaineU("Bonjour,\r\nVotre mot de passe est : ").opPlus(vWD_MotDePasse));

// 	Info("Utilisateur ajouté avec succès !")
//MAP:291aed30050a41aa:00000012:35:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.info("Utilisateur ajouté avec succès !");

}
else
{
// 	Erreur("Erreur lors de l'enregistrement : " + ErreurInfo())
//MAP:291aed30050a41aa:00000012:38:nouveau utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur(new WDChaineU("Erreur lors de l'enregistrement : ").opPlus(WDAPIVM.erreurInfo()).getString());

}

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
// Déclaration des champs du fils n°6 de nouveau utilisateur.Image4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961940495448359338l);

super.setChecksum("774257946");

super.setNom("Image4");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(77, 479);

super.setTailleInitiale(30, 67);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\diskette.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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
public GWDImage4 mWD_Image4;

/**
 * LIB_Ajout_Utilisateur
 */
class GWDLIB_Ajout_Utilisateur extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de nouveau utilisateur.LIB_Ajout_Utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2961940495448424874l);

super.setChecksum("774321202");

super.setNom("LIB_Ajout_Utilisateur");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ajout Utilisateur");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, 57);

super.setTailleInitiale(320, 83);

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x7A6E6A, 0xFFFFFFFF, creerPolice_GEN("Roboto", -15.000000, 1), 3, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);


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
public GWDLIB_Ajout_Utilisateur mWD_LIB_Ajout_Utilisateur;

/**
 * COMBO_Role
 */
class GWDCOMBO_Role extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de nouveau utilisateur.COMBO_Role
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,98,34);
super.setRectCompPrincipal(99,3,187,34);
super.setQuid(2961946577144569285l);

super.setChecksum("807980917");

super.setNom("COMBO_Role");

super.setType(10002);

super.setBulle("");

super.setLibelle("Role");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 350);

super.setTailleInitiale(300, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setLiaisonFichier("utilisateur", "role");

super.setContenuInitial("commercial\r\nchauffeur\r\nAdministrateur");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x2D2D2D, 0x0, 0xFFFFFFFF, 157.000000, 157.000000, 1, 1), 0, 0, 0, 0);

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
public GWDCOMBO_Role mWD_COMBO_Role;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de nouveau utilisateur
////////////////////////////////////////////////////////////////////////////
public void fWD_envoyerEmail( WDObjet vWD_sDest , WDObjet vWD_sSujet , WDObjet vWD_sTexte )
{
// PROCEDURE EnvoyerEmail(sDest, sSujet, sTexte)
//MAP:19233b0100a645d9:00070000:1:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
initExecProcLocale("EnvoyerEmail");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_MaSession = WDVarNonAllouee.ref;
WDObjet vWD_MonMessage = WDVarNonAllouee.ref;


// MaSession est une emailSessionSMTP
//MAP:19233b0100a645d9:00070000:4:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MaSession = new WDInstance( new WDEmailSessionSMTP() );


// MaSession.AdresseServeur	= "smtp.gmail.com"
//MAP:19233b0100a645d9:00070000:5:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MaSession.setProp(EWDPropriete.PROP_ADRESSESERVEUR,"smtp.gmail.com");

// MaSession.Port				= 587                // Change si ton serveur utilise 25 ou 465
//MAP:19233b0100a645d9:00070000:6:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MaSession.setProp(EWDPropriete.PROP_PORT,587);

// MaSession.Nom		= "ssuivapp@gmail.com"
//MAP:19233b0100a645d9:00070000:7:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MaSession.setProp(EWDPropriete.PROP_NOM,"ssuivapp@gmail.com");

// MaSession.MotDePasse		= "rbwt qzrb gfxe sptd" 
//MAP:19233b0100a645d9:00070000:8:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MaSession.setProp(EWDPropriete.PROP_MOTDEPASSE,"rbwt qzrb gfxe sptd");

// MaSession.Option			= emailOptionSécuriséTLS  // TLS (le plus utilisé)
//MAP:19233b0100a645d9:00070000:9:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MaSession.setProp(EWDPropriete.PROP_OPTION,2);

// SI PAS EmailOuvreSession(MaSession) ALORS
//MAP:19233b0100a645d9:00070000:b:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
if((!WDAPIEmail.emailOuvreSession(vWD_MaSession).getBoolean()))
{
// 	Erreur("Échec ouverture session SMTP : " + ErreurInfo())
//MAP:19233b0100a645d9:00070000:c:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
WDAPIDialogue.erreur(new WDChaineU("Échec ouverture session SMTP : ").opPlus(WDAPIVM.erreurInfo()).getString());

// 	RETOUR
//MAP:19233b0100a645d9:00070000:d:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
return;

}

// MonMessage est un Email
//MAP:19233b0100a645d9:00070000:11:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MonMessage = new WDInstance( new WDEmail() );


// MonMessage.Expediteur = "service_commande@masociete.fr"
//MAP:19233b0100a645d9:00070000:12:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MonMessage.setProp(EWDPropriete.PROP_EXPEDITEUR,"service_commande@masociete.fr");

// Ajoute(MonMessage.Destinataire, sDest)
//MAP:19233b0100a645d9:00070000:13:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
WDAPICollection.ajoute(vWD_MonMessage.getProp(EWDPropriete.PROP_DESTINATAIRE),vWD_sDest);

// MonMessage.Sujet	= sSujet
//MAP:19233b0100a645d9:00070000:14:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MonMessage.setProp(EWDPropriete.PROP_SUJET,vWD_sSujet);

// MonMessage.Message	= sTexte
//MAP:19233b0100a645d9:00070000:15:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
vWD_MonMessage.setProp(EWDPropriete.PROP_MESSAGE,vWD_sTexte);

// SI EmailEnvoieMessage(MaSession, MonMessage) ALORS
//MAP:19233b0100a645d9:00070000:18:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
if(WDAPIEmail.emailEnvoieMessage(vWD_MaSession,vWD_MonMessage).getBoolean())
{
// 	Info("Email de mot de passe  envoyé avec succès !")
//MAP:19233b0100a645d9:00070000:19:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
WDAPIDialogue.info("Email de mot de passe  envoyé avec succès !");

// 	ToastAffiche("Email de mot de passe envoyé avec succès !", 2000)
//MAP:19233b0100a645d9:00070000:1a:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
WDAPIToast.toastAffiche("Email de mot de passe envoyé avec succès !",2000);

}
else
{
// 	Erreur("Échec d'envoi : " + ErreurInfo(),2000)
//MAP:19233b0100a645d9:00070000:1d:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
WDAPIDialogue.erreur(new WDChaineU("Échec d'envoi : ").opPlus(WDAPIVM.erreurInfo()).getString(),new String[] {new WDEntier4(2000).getString()} );

}

// EmailFermeSession(MaSession)
//MAP:19233b0100a645d9:00070000:21:nouveau utilisateur.PROCEDURE.EnvoyerEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:EnvoyerEmail
WDAPIEmail.emailFermeSession(vWD_MaSession);

}
finally
{
finExecProcLocale();
}

}



//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  [ <Résultat> = ] VerifieEmail (<sEmail> est chaîne)
// 
//  Paramètres :
// 	sEmail (chaîne UNICODE) : <indiquez ici le rôle de sEmail>
//  Valeur de retour :
//  	booléen : <indiquez ici les valeurs possibles ainsi que leur interprétation>
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public WDObjet fWD_verifieEmail( WDObjet vWD_sEmail )
{
// PROCEDURE VerifieEmail(sEmail est une chaîne) : booléen
//MAP:19232ace00a3fdc7:00070000:d:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
initExecProcLocale("VerifieEmail");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_posArobase = new WDEntier4();

WDObjet vWD_domaine = new WDChaineU();



vWD_sEmail = WDParametre.traiterParametre(vWD_sEmail, 1, false, 16);


// SI sEmail = "" ALORS
//MAP:19232ace00a3fdc7:00070000:e:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
if(vWD_sEmail.opEgal(""))
{
// 	Renvoyer Faux
//MAP:19232ace00a3fdc7:00070000:f:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
return new WDBooleen(false);

}

// posArobase est un entier = Position(sEmail, "@")
//MAP:19232ace00a3fdc7:00070000:13:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail

vWD_posArobase.setValeur(WDAPIChaine.position(vWD_sEmail,new WDChaineU("@")));


// SI posArobase = 0 ALORS
//MAP:19232ace00a3fdc7:00070000:14:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
if(vWD_posArobase.opEgal(0))
{
// 	RENVOYER Faux
//MAP:19232ace00a3fdc7:00070000:15:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
return new WDBooleen(false);

}

// domaine est une chaîne = Milieu(sEmail, posArobase + 1, Taille(sEmail) - posArobase)
//MAP:19232ace00a3fdc7:00070000:19:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail

vWD_domaine.setValeur(WDAPIChaine.milieu(vWD_sEmail,vWD_posArobase.opPlus(1).getInt(),WDAPIChaine.taille(vWD_sEmail).opMoins(vWD_posArobase).getInt()));


// SI Position(domaine, ".") = 0 ALORS
//MAP:19232ace00a3fdc7:00070000:1a:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
if(WDAPIChaine.position(vWD_domaine,new WDChaineU(".")).opEgal(0))
{
// 	RENVOYER Faux
//MAP:19232ace00a3fdc7:00070000:1b:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
return new WDBooleen(false);

}

// SI Position(sEmail, " ") <> 0 ALORS
//MAP:19232ace00a3fdc7:00070000:1f:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
if(WDAPIChaine.position(vWD_sEmail,new WDChaineU(" ")).opDiff(0))
{
// 	RENVOYER Faux
//MAP:19232ace00a3fdc7:00070000:20:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
return new WDBooleen(false);

}

// SI Gauche(sEmail,1) = "." OU Droite(sEmail,1) = "." ALORS
//MAP:19232ace00a3fdc7:00070000:24:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
if((WDAPIChaine.gauche(vWD_sEmail,1).opEgal(".") | WDAPIChaine.droite(vWD_sEmail,1).opEgal(".")))
{
// 	RENVOYER Faux
//MAP:19232ace00a3fdc7:00070000:25:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
return new WDBooleen(false);

}

// RENVOYER Vrai
//MAP:19232ace00a3fdc7:00070000:29:nouveau utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:VerifieEmail
return new WDBooleen(true);

}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de nouveau utilisateur
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:291aed30050341aa:00000000:1:nouveau utilisateur:com.masociete.tracklet.wdgen.GWDFnouveau_utilisateur:Déclarations globales de nouveau utilisateur
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
// Création des champs de la fenêtre nouveau utilisateur
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_EMail = new GWDSAI_EMail();
mWD_SAI_Nom_Prenom = new GWDSAI_Nom_Prenom();
mWD__2 = new GWD_2();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_Bouton2 = new GWDBouton2();
mWD_Image4 = new GWDImage4();
mWD_LIB_Ajout_Utilisateur = new GWDLIB_Ajout_Utilisateur();
mWD_COMBO_Role = new GWDCOMBO_Role();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre nouveau utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2961940495447835050l);

super.setChecksum("779730019");

super.setNom("nouveau utilisateur");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xEAEAEA);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("nouveau utilisateur");

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
// Initialisation des champs de nouveau utilisateur
////////////////////////////////////////////////////////////////////////////
mWD_SAI_EMail.initialiserObjet();
super.ajouter("SAI_EMail", mWD_SAI_EMail);
mWD_SAI_Nom_Prenom.initialiserObjet();
super.ajouter("SAI_Nom_Prénom", mWD_SAI_Nom_Prenom);
mWD__2.initialiserObjet();
super.ajouter("_2", mWD__2);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_Bouton2.initialiserObjet();
super.ajouter("Bouton2", mWD_Bouton2);
mWD_Image4.initialiserObjet();
super.ajouter("Image4", mWD_Image4);
mWD_LIB_Ajout_Utilisateur.initialiserObjet();
super.ajouter("LIB_Ajout_Utilisateur", mWD_LIB_Ajout_Utilisateur);
mWD_COMBO_Role.initialiserObjet();
super.ajouter("COMBO_Role", mWD_COMBO_Role);

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
return GWDPSSuivApp.getInstance().mWD_nouveau_utilisateur;
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
