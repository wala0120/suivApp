/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Modifier_Utilisateur
 * Date : 09/12/2025 23:56:10
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
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Modifier_Utilisateur extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Modifier_Utilisateur
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_EMail
 */
class GWDSAI_EMail extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Modifier_Utilisateur.SAI_EMail
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,102,34);
super.setRectCompPrincipal(103,3,183,34);
super.setQuid(2970225710650460224l);

super.setChecksum("726001756");

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

super.setPositionInitiale(8, 288);

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
// Déclaration des champs du fils n°2 de FEN_Modifier_Utilisateur.SAI_Nom_Prénom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,101,34);
super.setRectCompPrincipal(102,3,182,34);
super.setQuid(2970225710650591296l);

super.setChecksum("726132828");

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

super.setPositionInitiale(8, 238);

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
// Déclaration des champs du fils n°3 de FEN_Modifier_Utilisateur._2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970225710650722368l);

super.setChecksum("726264356");

super.setNom("_2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

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
// Déclaration des champs du fils n°4 de FEN_Modifier_Utilisateur.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970225710650853440l);

super.setChecksum("726397708");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-108, 49);

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
// Déclaration des champs du fils n°5 de FEN_Modifier_Utilisateur.Bouton2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970225710651115584l);

super.setChecksum("726658028");

super.setNom("Bouton2");

super.setType(4);

super.setBulle("");

super.setLibelle("Enregistrer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(70, 485);

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
//MAP:29385c8c02178840:00000012:1:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sEmail = new WDChaineU();

WDObjet vWD_pos = new WDEntier4();

WDObjet vWD_domaine = new WDChaineU();



// Utilisateur.Email = SAI_Email..Valeur
//MAP:29385c8c02178840:00000012:2:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email").setValeur(mWD_SAI_EMail.getProp(EWDPropriete.PROP_VALEUR));

// sEmail est une chaîne = Utilisateur.Email
//MAP:29385c8c02178840:00000012:5:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2

vWD_sEmail.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email"));


// SI PAS VerifieEmail(sEmail) ALORS
//MAP:29385c8c02178840:00000012:6:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
if((!fWD_verifieEmail(vWD_sEmail).getBoolean()))
{
// 	Erreur("Email invalide. Exemple : nom@gmail.com")
//MAP:29385c8c02178840:00000012:7:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Email invalide. Exemple : nom@gmail.com");

// 	RETOUR
//MAP:29385c8c02178840:00000012:8:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

// pos		est un entier	= Position(sEmail, "@")
//MAP:29385c8c02178840:00000012:b:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2

vWD_pos.setValeur(WDAPIChaine.position(vWD_sEmail,new WDChaineU("@")));


// domaine	est une chaîne	= Milieu(sEmail, pos + 1)
//MAP:29385c8c02178840:00000012:c:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2

vWD_domaine.setValeur(WDAPIChaine.milieu(vWD_sEmail,vWD_pos.opPlus(1).getInt()));


// SI Position(domaine, ".") = 0 ALORS
//MAP:29385c8c02178840:00000012:d:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIChaine.position(vWD_domaine,new WDChaineU(".")).opEgal(0))
{
// 	Erreur("Email invalide. Exemple : nom@gmail.com")
//MAP:29385c8c02178840:00000012:e:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Email invalide. Exemple : nom@gmail.com");

// 	RETOUR
//MAP:29385c8c02178840:00000012:f:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

// SI PAS HLitRecherchePremier(Utilisateur, IDUtilisateur, gnIDUtilisateurModifier) ALORS
//MAP:29385c8c02178840:00000012:13:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
if((!WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),GWDPSSuivApp.getInstance().vWD_gnIDUtilisateurModifier).getBoolean()))
{
// 	Erreur("Utilisateur introuvable !")
//MAP:29385c8c02178840:00000012:14:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Utilisateur introuvable !");

// 	RETOUR
//MAP:29385c8c02178840:00000012:15:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

// SI HLitRecherche(Utilisateur, Email, Utilisateur.Email) ALORS
//MAP:29385c8c02178840:00000012:19:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("email"),WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email")).getBoolean())
{
// 	SI Utilisateur.IDUtilisateur <> gnIDUtilisateurModifier ALORS
//MAP:29385c8c02178840:00000012:1a:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("idutilisateur").opDiff(GWDPSSuivApp.getInstance().vWD_gnIDUtilisateurModifier))
{
// 		Erreur("Cet email est déjà utilisé par un autre compte.")
//MAP:29385c8c02178840:00000012:1b:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur("Cet email est déjà utilisé par un autre compte.");

// 		RETOUR
//MAP:29385c8c02178840:00000012:1c:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
return;

}

}

// Utilisateur.Nom_Prenom			= SAI_Nom_Prénom..Valeur
//MAP:29385c8c02178840:00000012:21:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom").setValeur(mWD_SAI_Nom_Prenom.getProp(EWDPropriete.PROP_VALEUR));

// Utilisateur.IDutilisateur			= gnIDUtilisateurModifier
//MAP:29385c8c02178840:00000012:22:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("idutilisateur").setValeur(GWDPSSuivApp.getInstance().vWD_gnIDUtilisateurModifier);

// Utilisateur.Email		= SAI_Email..Valeur
//MAP:29385c8c02178840:00000012:23:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email").setValeur(mWD_SAI_EMail.getProp(EWDPropriete.PROP_VALEUR));

// Utilisateur.Role = COMBO_Role
//MAP:29385c8c02178840:00000012:24:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role").setValeur(mWD_COMBO_Role);

// SI HModifie(Utilisateur) ALORS
//MAP:29385c8c02178840:00000012:28:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
if(WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 	Info("Utilisateur modifié avec succès !")
//MAP:29385c8c02178840:00000012:29:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.info("Utilisateur modifié avec succès !");

// 	OuvreFenêtreMobile(FEN_Liste_Utilisateurs)
//MAP:29385c8c02178840:00000012:2a:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Utilisateurs);

}
else
{
// 	Erreur("Erreur lors de la modification : " + ErreurInfo())
//MAP:29385c8c02178840:00000012:2c:FEN_Modifier_Utilisateur.Bouton2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDBouton2:Clic sur Bouton2
WDAPIDialogue.erreur(new WDChaineU("Erreur lors de la modification : ").opPlus(WDAPIVM.erreurInfo()).getString());

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
// Déclaration des champs du fils n°6 de FEN_Modifier_Utilisateur.Image4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970225710651246672l);

super.setChecksum("726790940");

super.setNom("Image4");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(77, 478);

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
// Déclaration des champs du fils n°7 de FEN_Modifier_Utilisateur.LIB_Ajout_Utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970225710651508816l);

super.setChecksum("727050804");

super.setNom("LIB_Ajout_Utilisateur");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Modifier Utilisateur");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, 56);

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
// Déclaration des champs du fils n°8 de FEN_Modifier_Utilisateur.COMBO_Role
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,98,34);
super.setRectCompPrincipal(99,3,187,34);
super.setQuid(2970225710651770960l);

super.setChecksum("738485972");

super.setNom("COMBO_Role");

super.setType(10002);

super.setBulle("");

super.setLibelle("Role");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 349);

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

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Modifier_Utilisateur.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970228244693354314l);

super.setChecksum("738194532");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(12, 522);

super.setTailleInitiale(33, 38);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

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

// OuvreFenêtreMobile(FEN_Liste_Utilisateurs)
//MAP:29385eda02c7874a:00000012:1:FEN_Modifier_Utilisateur.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// OuvreFenêtreMobile(FEN_Liste_Utilisateurs)
//MAP:29385eda02c7874a:00000012:1:FEN_Modifier_Utilisateur.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur$GWDIMG_SansNom2:Clic sur IMG_SansNom2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Utilisateurs);

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
// Procédures utilisateur de FEN_Modifier_Utilisateur
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
// [ <Résultat> = ] VerifieEmail (<sEmail> est chaîne)
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
// PROCÉDURE VerifieEmail(sEmail est une chaîne) : booléen
//MAP:19386042001a074f:00070000:d:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
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
//MAP:19386042001a074f:00070000:e:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
if(vWD_sEmail.opEgal(""))
{
// 	RENVOYER Faux
//MAP:19386042001a074f:00070000:f:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
return new WDBooleen(false);

}

// posArobase est un entier = Position(sEmail, "@")
//MAP:19386042001a074f:00070000:13:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail

vWD_posArobase.setValeur(WDAPIChaine.position(vWD_sEmail,new WDChaineU("@")));


// SI posArobase = 0 ALORS
//MAP:19386042001a074f:00070000:14:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
if(vWD_posArobase.opEgal(0))
{
// 	RENVOYER Faux
//MAP:19386042001a074f:00070000:15:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
return new WDBooleen(false);

}

// domaine est une chaîne = Milieu(sEmail, posArobase + 1, Taille(sEmail) - posArobase)
//MAP:19386042001a074f:00070000:19:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail

vWD_domaine.setValeur(WDAPIChaine.milieu(vWD_sEmail,vWD_posArobase.opPlus(1).getInt(),WDAPIChaine.taille(vWD_sEmail).opMoins(vWD_posArobase).getInt()));


// SI Position(domaine, ".") = 0 ALORS
//MAP:19386042001a074f:00070000:1a:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
if(WDAPIChaine.position(vWD_domaine,new WDChaineU(".")).opEgal(0))
{
// 	RENVOYER Faux
//MAP:19386042001a074f:00070000:1b:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
return new WDBooleen(false);

}

// SI Position(sEmail, " ") <> 0 ALORS
//MAP:19386042001a074f:00070000:1f:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
if(WDAPIChaine.position(vWD_sEmail,new WDChaineU(" ")).opDiff(0))
{
// 	RENVOYER Faux
//MAP:19386042001a074f:00070000:20:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
return new WDBooleen(false);

}

// SI Gauche(sEmail,1) = "." OU Droite(sEmail,1) = "." ALORS
//MAP:19386042001a074f:00070000:24:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
if((WDAPIChaine.gauche(vWD_sEmail,1).opEgal(".") | WDAPIChaine.droite(vWD_sEmail,1).opEgal(".")))
{
// 	RENVOYER Faux
//MAP:19386042001a074f:00070000:25:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
return new WDBooleen(false);

}

// RENVOYER Vrai
//MAP:19386042001a074f:00070000:29:FEN_Modifier_Utilisateur.PROCEDURE.VerifieEmail:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:VerifieEmail
return new WDBooleen(true);

}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_Modifier_Utilisateur
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:29385c5301dba850:00000000:1:FEN_Modifier_Utilisateur:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:Déclarations globales de FEN_Modifier_Utilisateur
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Modifier_Utilisateur
 */
public void init()
{
super.init();

// 
//MAP:29385c5301dba850:00000022:1:FEN_Modifier_Utilisateur:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:Fin d'initialisation de FEN_Modifier_Utilisateur
// HLitRecherchePremier(Utilisateur, IDutilisateur, gnIDUtilisateurModifier)
//MAP:29385c5301dba850:00000022:2:FEN_Modifier_Utilisateur:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:Fin d'initialisation de FEN_Modifier_Utilisateur
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),GWDPSSuivApp.getInstance().vWD_gnIDUtilisateurModifier);

// SAI_Nom_Prénom = Utilisateur.Nom_Prenom
//MAP:29385c5301dba850:00000022:3:FEN_Modifier_Utilisateur:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:Fin d'initialisation de FEN_Modifier_Utilisateur
mWD_SAI_Nom_Prenom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"));

// SAI_EMail = Utilisateur.Email
//MAP:29385c5301dba850:00000022:4:FEN_Modifier_Utilisateur:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:Fin d'initialisation de FEN_Modifier_Utilisateur
mWD_SAI_EMail.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email"));

// COMBO_Role = Utilisateur.Role
//MAP:29385c5301dba850:00000022:5:FEN_Modifier_Utilisateur:com.masociete.tracklet.wdgen.GWDFFEN_Modifier_Utilisateur:Fin d'initialisation de FEN_Modifier_Utilisateur
mWD_COMBO_Role.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role"));

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Modifier_Utilisateur
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
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Modifier_Utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2970225465834055760l);

super.setChecksum("728732204");

super.setNom("FEN_Modifier_Utilisateur");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Modifier Utilisateur");

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
// Initialisation des champs de FEN_Modifier_Utilisateur
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
return GWDPSSuivApp.getInstance().mWD_FEN_Modifier_Utilisateur;
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
