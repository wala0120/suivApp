/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_login
 * Date : 09/12/2025 23:56:11
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_login extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_login
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Identification
 */
class GWDLIB_Identification extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_login.LIB_Identification
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406514428126101l);

super.setChecksum("795712619");

super.setNom("LIB_Identification");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, 0);

super.setTailleInitiale(324, 238);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xE4C2A7, 0xFFFFFFFF, creerPolice_GEN("Verdana", -8.000000, 0), 4, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xD9D9D9, 0x595959, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDLIB_Identification mWD_LIB_Identification;

/**
 * Libellé1
 */
class GWDLibelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_login.Libellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406514428191637l);

super.setChecksum("795778155");

super.setNom("Libellé1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("login");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 198);

super.setTailleInitiale(140, 61);

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

super.setStyleLibelle(0x7A6E6A, 0xFFFFFFFF, creerPolice_GEN("Roboto Light", -24.000000, 0), 3, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xD9D9D9, 0x595959, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDLibelle1 mWD_Libelle1;

/**
 * SAI_Email
 */
class GWDSAI_Email extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_login.SAI_Email
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,40);
super.setRectCompPrincipal(2,2,302,40);
super.setQuid(2969406514428257173l);

super.setChecksum("795843235");

super.setNom("SAI_Email");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 259);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "email");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setIndication("E-mail ou téléphone");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(false);

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

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), -2, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xD9D9D9, 0x595959, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDSAI_Email mWD_SAI_Email;

/**
 * SAI_Mot_de_passe
 */
class GWDSAI_Mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_login.SAI_Mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,2,40);
super.setRectCompPrincipal(2,2,302,40);
super.setQuid(2969406514428322709l);

super.setChecksum("795908858");

super.setNom("SAI_Mot_de_passe");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 330);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setLiaisonFichier("utilisateur", "mot_de_passe");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 300, 1000, 0);

super.setEllipse(0);

super.setIndication("Mot de passe");

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

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), -2, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xD9D9D9, 0x595959, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDSAI_Mot_de_passe mWD_SAI_Mot_de_passe;

/**
 * INT_Interrupteur
 */
class GWDINT_Interrupteur extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_login.INT_Interrupteur
////////////////////////////////////////////////////////////////////////////

/**
 * INT_Interrupteur_Option_0
 */
class GWDINT_Interrupteur_Option_0 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_login.INT_Interrupteur.INT_Interrupteur_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Se souvenir de moi");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_Interrupteur_Option_0 mWD_INT_Interrupteur_Option_0 = new GWDINT_Interrupteur_Option_0();
/**
 * Initialise tous les champs de FEN_login.INT_Interrupteur
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_login.INT_Interrupteur
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_INT_Interrupteur_Option_0);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,304,42);
super.setQuid(2969406514428388245l);

super.setChecksum("795975675");

super.setNom("INT_Interrupteur");

super.setType(5);

super.setBulle("");

super.setLibelle("&Interrupteur");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 415);

super.setTailleInitiale(304, 42);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(8, 1000, 1000, 300, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x7A6E6A, creerPolice_GEN("Verdana", -8.000000, 0), -1, 0, 0x7A6E6A);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xD9D9D9, 0x595959, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xD9D9D9, 0x595959, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));


super.setImageCoche("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBooking2_CBox.png?E12_A1A6A1A6A1A6A1A6A1A6A1A6_8O", 6);

activerEcoute();
initialiserSousObjets();
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
public GWDINT_Interrupteur mWD_INT_Interrupteur;

/**
 * BTN_Se_connecter
 */
class GWDBTN_Se_connecter extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_login.BTN_Se_connecter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406514428519317l);

super.setChecksum("796106291");

super.setNom("BTN_Se_connecter");

super.setType(4);

super.setBulle("");

super.setLibelle("Se connecter");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 499);

super.setTailleInitiale(320, 48);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(8, 1000, 1000, 300, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0x7A6E6A, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0x7A6E6A, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0x7A6E6A, creerPolice_GEN("MS Shell Dlg", -11.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xD9D9D9, 0x595959, 0xF2000000, 5.000000, 5.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xD9D9D9, 0x595959, 0xF2000000, 5.000000, 5.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xD9D9D9, 0x595959, 0x0, 5.000000, 5.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Se_connecter
 */
public void clicSurBoutonGauche()
//  --- Vérifier que les champs ne sont pas vides ---
{
super.clicSurBoutonGauche();

// // --- Vérifier que les champs ne sont pas vides ---
//MAP:2935737e063e2395:00000012:1:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
// SI SAI_Email..Valeur = "" OU SAI_Mot_de_passe..Valeur = "" ALORS
//MAP:2935737e063e2395:00000012:2:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
if((mWD_SAI_Email.getProp(EWDPropriete.PROP_VALEUR).opEgal("") | mWD_SAI_Mot_de_passe.getProp(EWDPropriete.PROP_VALEUR).opEgal("")))
{
// 	Info("Veuillez entrer l'email et le mot de passe.")
//MAP:2935737e063e2395:00000012:3:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIDialogue.info("Veuillez entrer l'email et le mot de passe.");

// 	RETOUR
//MAP:2935737e063e2395:00000012:4:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
return;

}

// HLitRecherchePremier(Utilisateur, Email, SAI_Email)
//MAP:2935737e063e2395:00000012:8:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("email"),mWD_SAI_Email);

// SI PAS HTrouve(Utilisateur) ALORS
//MAP:2935737e063e2395:00000012:b:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean()))
{
// 	Info("Adresse e-mail incorrecte.")
//MAP:2935737e063e2395:00000012:c:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIDialogue.info("Adresse e-mail incorrecte.");

// 	RETOUR
//MAP:2935737e063e2395:00000012:d:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
return;

}

// SI Utilisateur.mot_De_passe <> SAI_Mot_de_passe..Valeur ALORS
//MAP:2935737e063e2395:00000012:11:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mot_de_passe").opDiff(mWD_SAI_Mot_de_passe.getProp(EWDPropriete.PROP_VALEUR)))
{
// 	Info("Mot de passe incorrect.")
//MAP:2935737e063e2395:00000012:12:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIDialogue.info("Mot de passe incorrect.");

// 	RETOUR
//MAP:2935737e063e2395:00000012:13:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
return;

}

// CurrentUserID = Utilisateur.IDutilisateur
//MAP:2935737e063e2395:00000012:15:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
GWDPSSuivApp.getInstance().vWD_CurrentUserID.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("idutilisateur"));

// Info("Bienvenue " + Utilisateur.Email + " (" + Utilisateur.Role + ")")
//MAP:2935737e063e2395:00000012:18:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIDialogue.info(new WDChaineU("Bienvenue ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("email")).opPlus(" (").opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role")).opPlus(")").getString());

// SELON Utilisateur.Role
//MAP:2935737e063e2395:00000012:1b:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON Utilisateur.Role
//MAP:2935737e063e2395:00000012:1b:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDObjet _WDExpSelon0 = WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role");
if(_WDExpSelon0.opEgal(1))
{
// 		Ouvre('FEN_ Menu_Commercial')  
//MAP:2935737e063e2395:00000012:1d:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIFenetre.ouvre(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Commercial);

}
else if(_WDExpSelon0.opEgal(2))
{
// 		Ouvre('FEN_Menu_Chauffeur')  
//MAP:2935737e063e2395:00000012:1f:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIFenetre.ouvre(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Chauffeur);

}
else if(_WDExpSelon0.opEgal(3))
{
// 		Ouvre(FEN_Menu_Administrateur) 
//MAP:2935737e063e2395:00000012:21:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIFenetre.ouvre(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Administrateur);

}
else {
// 		Info("Rôle inconnu.")
//MAP:2935737e063e2395:00000012:24:FEN_login.BTN_Se_connecter:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDBTN_Se_connecter:Clic sur BTN_Se_connecter
WDAPIDialogue.info("Rôle inconnu.");

}

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
public GWDBTN_Se_connecter mWD_BTN_Se_connecter;

/**
 * IMG_Visuel
 */
class GWDIMG_Visuel extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_login.IMG_Visuel
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969406514428584853l);

super.setChecksum("796173651");

super.setNom("IMG_Visuel");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-2, 0);

super.setTailleInitiale(324, 190);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\49e559ba-1b88-4aed-81d5-446c990e42bd.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 0, 0);

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
//MAP:2935737e063f2395:0000000e:1:FEN_login.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDIMG_Visuel:Initialisation de IMG_Visuel
// moimeme..Opacité=80
//MAP:2935737e063f2395:0000000e:1:FEN_login.IMG_Visuel:com.masociete.tracklet.wdgen.GWDFFEN_login$GWDIMG_Visuel:Initialisation de IMG_Visuel
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

/**
 * Traitement: Déclarations globales de FEN_login
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:2935737e06372395:00000000:1:FEN_login:com.masociete.tracklet.wdgen.GWDFFEN_login:Déclarations globales de FEN_login
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
// Création des champs de la fenêtre FEN_login
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Identification = new GWDLIB_Identification();
mWD_Libelle1 = new GWDLibelle1();
mWD_SAI_Email = new GWDSAI_Email();
mWD_SAI_Mot_de_passe = new GWDSAI_Mot_de_passe();
mWD_INT_Interrupteur = new GWDINT_Interrupteur();
mWD_BTN_Se_connecter = new GWDBTN_Se_connecter();
mWD_IMG_Visuel = new GWDIMG_Visuel();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_login
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969406514428060565l);

super.setChecksum("801645724");

super.setNom("FEN_login");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Login");

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
// Initialisation des champs de FEN_login
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Identification.initialiserObjet();
super.ajouter("LIB_Identification", mWD_LIB_Identification);
mWD_Libelle1.initialiserObjet();
super.ajouter("Libellé1", mWD_Libelle1);
mWD_SAI_Email.initialiserObjet();
super.ajouter("SAI_Email", mWD_SAI_Email);
mWD_SAI_Mot_de_passe.initialiserObjet();
super.ajouter("SAI_Mot_de_passe", mWD_SAI_Mot_de_passe);
mWD_INT_Interrupteur.initialiserObjet();
super.ajouter("INT_Interrupteur", mWD_INT_Interrupteur);
mWD_BTN_Se_connecter.initialiserObjet();
super.ajouter("BTN_Se_connecter", mWD_BTN_Se_connecter);
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
return GWDPSSuivApp.getInstance().mWD_FEN_login;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN BLUE#WM";
}
}
