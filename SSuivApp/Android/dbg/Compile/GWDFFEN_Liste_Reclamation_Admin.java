/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Liste_Reclamation_Admin
 * Date : 10/12/2025 00:34:24
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
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Liste_Reclamation_Admin extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Liste_Reclamation_Admin
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Reclamation
 */
class GWDZR_Reclamation extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Reclamation_Admin.ZR_Reclamation
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_NumFacture
 */
class GWDATT_NumFacture extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NumFacture
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NumFacture");

super.setChampAssocie(mWD_LIB_NumFacture);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NumFacture

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NumFacture mWD_ATT_NumFacture = new GWDATT_NumFacture();

/**
 * ATT_NomMagasin
 */
class GWDATT_NomMagasin extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NomMagasin
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
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NomMagasin

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NomMagasin mWD_ATT_NomMagasin = new GWDATT_NomMagasin();

/**
 * ATT_Probleme
 */
class GWDATT_Probleme extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_Probleme
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Probleme");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_Probleme

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Probleme mWD_ATT_Probleme = new GWDATT_Probleme();

/**
 * ATT_Date
 */
class GWDATT_Date extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Date");

super.setChampAssocie(mWD_LIB_Date);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_Date

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Date mWD_ATT_Date = new GWDATT_Date();

/**
 * ATT_NomChauffeur
 */
class GWDATT_NomChauffeur extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NomChauffeur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NomChauffeur");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NomChauffeur

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NomChauffeur mWD_ATT_NomChauffeur = new GWDATT_NomChauffeur();

/**
 * ATT_NomComerciale
 */
class GWDATT_NomComerciale extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NomComerciale
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NomComerciale");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_NomComerciale

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_NomComerciale mWD_ATT_NomComerciale = new GWDATT_NomComerciale();

/**
 * ATT_Etat
 */
class GWDATT_Etat extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_Etat
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Etat");

super.setChampAssocie(mWD_LIB_Etat);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_Etat

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Etat mWD_ATT_Etat = new GWDATT_Etat();

/**
 * ATT_IdReclamation
 */
class GWDATT_IdReclamation extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_IdReclamation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IdReclamation");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_IdReclamation

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_IdReclamation mWD_ATT_IdReclamation = new GWDATT_IdReclamation();

/**
 * ATT_IdComerciale
 */
class GWDATT_IdComerciale extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_IdComerciale
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IdComerciale");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Admin.ZR_Reclamation.ATT_IdComerciale

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_IdComerciale mWD_ATT_IdComerciale = new GWDATT_IdComerciale();

/**
 * LIB_NumFacture
 */
class GWDLIB_NumFacture extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.LIB_NumFacture
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969423110221863128l);

super.setChecksum("835821766");

super.setNom("LIB_NumFacture");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NumFacture");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(7, 2);

super.setTailleInitiale(120, 19);

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
public GWDLIB_NumFacture mWD_LIB_NumFacture = new GWDLIB_NumFacture();

/**
 * LIB_NomMagasin
 */
class GWDLIB_NomMagasin extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.LIB_NomMagasin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969423148876774775l);

super.setChecksum("836027758");

super.setNom("LIB_NomMagasin");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NomMagasin");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(183, 5);

super.setTailleInitiale(120, 19);

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

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -7.000000, 0), 3, 0, 0x2D2D2D);

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
 * LIB_Date
 */
class GWDLIB_Date extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.LIB_Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969424965663502580l);

super.setChecksum("851589778");

super.setNom("LIB_Date");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("JJ/MM/AAAA"));

super.setLibelle("20190715");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 21);

super.setTailleInitiale(90, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x969696, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -5.000000, 0), 3, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x603C0C, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de LIB_Date ( ZR_Reclamation )
 */
public void init()
//  Version 1
//  Description 
//  Texte simple affichant la date du jour à l'initialisation
{
super.init();

// // Version 1
//MAP:29358446098cb0f4:0000000e:1:FEN_Liste_Reclamation_Admin.ZR_Reclamation.LIB_Date:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation$GWDLIB_Date:Initialisation de LIB_Date ( ZR_Reclamation )
// moimeme=datesys()
//MAP:29358446098cb0f4:0000000e:5:FEN_Liste_Reclamation_Admin.ZR_Reclamation.LIB_Date:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation$GWDLIB_Date:Initialisation de LIB_Date ( ZR_Reclamation )
WDContexte.getMoiMeme().setValeur(WDAPIDate.dateSys());

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Date mWD_LIB_Date = new GWDLIB_Date();

/**
 * LIB_Etat
 */
class GWDLIB_Etat extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.LIB_Etat
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969445040389817403l);

super.setChecksum("900767771");

super.setNom("LIB_Etat");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Etat");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 32);

super.setTailleInitiale(123, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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
public GWDLIB_Etat mWD_LIB_Etat = new GWDLIB_Etat();

/**
 * BTN_Affecter
 */
class GWDBTN_Affecter extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_Liste_Reclamation_Admin.ZR_Reclamation.BTN_Affecter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970249805457728111l);

super.setChecksum("766745605");

super.setNom("BTN_Affecter");

super.setType(4);

super.setBulle("");

super.setLibelle("Affecter");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(197, 42);

super.setTailleInitiale(54, 18);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -5.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -5.000000, 0), 0, 0x2D2D2D);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -5.000000, 0), 0, 0x2D2D2D);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\Gabarits\\WM\\180 AquaBlue\\AquaBlue_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Affecter ( ZR_Reclamation )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// IDReclamationGlobal = ATT_IdReclamation
//MAP:29387276047b226f:00000012:1:FEN_Liste_Reclamation_Admin.ZR_Reclamation.BTN_Affecter:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation$GWDBTN_Affecter:Clic sur BTN_Affecter ( ZR_Reclamation )
// IDReclamationGlobal = ATT_IdReclamation
//MAP:29387276047b226f:00000012:1:FEN_Liste_Reclamation_Admin.ZR_Reclamation.BTN_Affecter:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation$GWDBTN_Affecter:Clic sur BTN_Affecter ( ZR_Reclamation )
GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal.setValeur(mWD_ATT_IdReclamation);

// OuvreFenêtreMobile(FEN_Ajout_affectation)
//MAP:29387276047b226f:00000012:3:FEN_Liste_Reclamation_Admin.ZR_Reclamation.BTN_Affecter:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation$GWDBTN_Affecter:Clic sur BTN_Affecter ( ZR_Reclamation )
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Ajout_affectation);

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
public GWDBTN_Affecter mWD_BTN_Affecter = new GWDBTN_Affecter();
/**
 * Initialise tous les champs de FEN_Liste_Reclamation_Admin.ZR_Reclamation
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste_Reclamation_Admin.ZR_Reclamation
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_NumFacture.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NumFacture);
mWD_ATT_NomMagasin.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NomMagasin);
mWD_ATT_Probleme.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Probleme);
mWD_ATT_Date.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Date);
mWD_ATT_NomChauffeur.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NomChauffeur);
mWD_ATT_NomComerciale.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_NomComerciale);
mWD_ATT_Etat.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Etat);
mWD_ATT_IdReclamation.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_IdReclamation);
mWD_ATT_IdComerciale.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_IdComerciale);
mWD_LIB_NumFacture.initialiserObjet();
super.ajouterChamp("LIB_NumFacture",mWD_LIB_NumFacture);
mWD_LIB_NomMagasin.initialiserObjet();
super.ajouterChamp("LIB_NomMagasin",mWD_LIB_NomMagasin);
mWD_LIB_Date.initialiserObjet();
super.ajouterChamp("LIB_Date",mWD_LIB_Date);
mWD_LIB_Etat.initialiserObjet();
super.ajouterChamp("LIB_Etat",mWD_LIB_Etat);
mWD_BTN_Affecter.initialiserObjet();
super.ajouterChamp("BTN_Affecter",mWD_BTN_Affecter);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,318,58);
super.setQuid(2969423110221797592l);

super.setChecksum("835768542");

super.setNom("ZR_Reclamation");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 108);

super.setTailleInitiale(320, 416);

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

super.setParamAffichage(0, 0, 1, 318, 58);

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
 * Traitement: Sélection d'une ligne de ZR_Reclamation
 */
public void selectionLigne()
{
super.selectionLigne();

// IDReclamationGlobal = ATT_IdReclamation
//MAP:29358296089b18d8:00000021:1:FEN_Liste_Reclamation_Admin.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
// IDReclamationGlobal = ATT_IdReclamation
//MAP:29358296089b18d8:00000021:1:FEN_Liste_Reclamation_Admin.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal.setValeur(mWD_ATT_IdReclamation);

// IDCommerciale = ATT_IdComerciale
//MAP:29358296089b18d8:00000021:2:FEN_Liste_Reclamation_Admin.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
GWDPSSuivApp.getInstance().vWD_IDCommerciale.setValeur(mWD_ATT_IdComerciale);

// OuvreFenêtreMobile(FEN_Ajout_affectation)
//MAP:29358296089b18d8:00000021:3:FEN_Liste_Reclamation_Admin.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Ajout_affectation);

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
public GWDZR_Reclamation mWD_ZR_Reclamation;

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Reclamation_Admin.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970240700203452641l);

super.setChecksum("843135079");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Liste réclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(54, 17);

super.setTailleInitiale(207, 43);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x2D2D2D, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -13.000000, 1), 3, 0, 0x2D2D2D);

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
 * SAI_Recherche
 */
class GWDSAI_Recherche extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Liste_Reclamation_Admin.SAI_Recherche
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,3,242,25);
super.setQuid(2970240983676340695l);

super.setChecksum("848181207");

super.setNom("SAI_Recherche");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(9, 65);

super.setTailleInitiale(246, 31);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(-1);

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

super.setPresenceLibelle(false);

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xF2000000, 0xF3000000, 0xFDFDFD, 50.000000, 50.000000, 1, 1));

super.setStyleSaisie(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0x969696, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 1);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7573182A, 0x330000, 0x7A582D, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de SAI_Recherche
 */
public void init()
//  Version 1
//  Description 
//  Saisie de texte
{
super.init();

// // Version 1
//MAP:29386a700955c9d7:0000000e:1:FEN_Liste_Reclamation_Admin.SAI_Recherche:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDSAI_Recherche:Initialisation de SAI_Recherche
// SAI_Recherche..Indication = "Rechercher"
//MAP:29386a700955c9d7:0000000e:4:FEN_Liste_Reclamation_Admin.SAI_Recherche:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDSAI_Recherche:Initialisation de SAI_Recherche
this.setProp(EWDPropriete.PROP_INDICATION,"Rechercher");

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Recherche mWD_SAI_Recherche;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste_Reclamation_Admin.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970269351836881317l);

super.setChecksum("749741090");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(13, 530);

super.setTailleInitiale(33, 38);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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
//MAP:2938843d037791a5:00000012:1:FEN_Liste_Reclamation_Admin.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDIMG_SansNom1:Clic sur IMG_SansNom1
// OuvreFenêtreMobile(FEN_Menu_Administrateur)
//MAP:2938843d037791a5:00000012:1:FEN_Liste_Reclamation_Admin.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin$GWDIMG_SansNom1:Clic sur IMG_SansNom1
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


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Liste_Reclamation_Admin
////////////////////////////////////////////////////////////////////////////
public WDObjet fWD_libelleProbleme( WDObjet vWD_nProbleme )
{
// PROCÉDURE LibelleProbleme(nProbleme est un entier)
//MAP:1935875200d29851:00070000:1:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
initExecProcLocale("LibelleProbleme");

try
{
vWD_nProbleme = WDParametre.traiterParametre(vWD_nProbleme, 1, false, 8);


// SELON nProbleme
//MAP:1935875200d29851:00070000:2:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nProbleme
//MAP:1935875200d29851:00070000:2:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
WDObjet _WDExpSelon0 = vWD_nProbleme;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Cachet Non apposé"
//MAP:1935875200d29851:00070000:3:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
return new WDChaineU("Cachet Non apposé");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Bon de commande Non disponible"
//MAP:1935875200d29851:00070000:4:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
return new WDChaineU("Bon de commande Non disponible");

}
else if(_WDExpSelon0.opEgal(3))
{
// 	CAS 3 : RENVOYER "pré facture  Non transmise au Magasin"
//MAP:1935875200d29851:00070000:5:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
return new WDChaineU("pré facture  Non transmise au Magasin");

}
else if(_WDExpSelon0.opEgal(4))
{
// 	CAS 4 : RENVOYER "absence du responsable POUR signature "
//MAP:1935875200d29851:00070000:6:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
return new WDChaineU("absence du responsable POUR signature ");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
//MAP:1935875200d29851:00070000:7:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleProbleme
return new WDChaineU("Inconnu");

}

}

}
finally
{
finExecProcLocale();
}

}



public WDObjet fWD_libelleEtatFacture( WDObjet vWD_nEtat )
{
// PROCÉDURE LibelleEtatFacture(nEtat est un entier)
//MAP:1935884800d35ad7:00070000:1:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleEtatFacture
initExecProcLocale("LibelleEtatFacture");

try
{
vWD_nEtat = WDParametre.traiterParametre(vWD_nEtat, 1, false, 8);


// SELON nEtat
//MAP:1935884800d35ad7:00070000:2:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleEtatFacture
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nEtat
//MAP:1935884800d35ad7:00070000:2:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleEtatFacture
WDObjet _WDExpSelon0 = vWD_nEtat;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Récupéré"
//MAP:1935884800d35ad7:00070000:3:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleEtatFacture
return new WDChaineU("Récupéré");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Non récupéré"
//MAP:1935884800d35ad7:00070000:4:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleEtatFacture
return new WDChaineU("Non récupéré");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
//MAP:1935884800d35ad7:00070000:5:FEN_Liste_Reclamation_Admin.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:LibelleEtatFacture
return new WDChaineU("Inconnu");

}

}

}
finally
{
finExecProcLocale();
}

}




class GWDMMENU_SansNom1 extends WDMenuContextuel
{
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970241902804340104l);

super.setNom("MENU_SansNom1");

super.setType(40001);

super.setTitreMenu("Menu");

super.setStyleOptionRepos(0xFF000001, 0xFF000001, creerPolice_GEN("Segoe UI", -12.000000, 0));

super.setStyleOptionSurvol(0xFF000001, 0xFF000001, creerPolice_GEN("Segoe UI", -12.000000, 0));

activerEcoute();
}
public boolean isModeActionBar()
{
return true;
}
}
public GWDMMENU_SansNom1 mWD_MENU_SansNom1;



class GWDMMENU_SansNom2 extends WDMenuContextuel
{

class GWDMOPT_Affectation extends WDOptionMenu
{
public GWDMOPT_Affectation(boolean b)
{
super(b);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDMMENU_SansNom2.this);
super.setQuid(2970246404145220049l);

super.setNom("OPT_Affectation");

super.setType(40001);

super.setLibelle("Affectation");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(4);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}
}
public GWDMOPT_Affectation mWD_OPT_Affectation = new GWDMOPT_Affectation(true);

public void initialiserSousObjets()
{
mWD_OPT_Affectation.initialiserObjet();
super.ajouterMenu(mWD_OPT_Affectation);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970246404145154513l);

super.setNom("MENU_SansNom2");

super.setType(40001);

super.setTitreMenu("Menu");

super.setStyleOptionRepos(0xFF000001, 0xFF000001, creerPolice_GEN("Segoe UI", -12.000000, 0));

super.setStyleOptionSurvol(0xFF000001, 0xFF000001, creerPolice_GEN("Segoe UI", -12.000000, 0));

activerEcoute();
initialiserSousObjets();
}
public boolean isModeActionBar()
{
return true;
}
}
public GWDMMENU_SansNom2 mWD_MENU_SansNom2;



/**
 * Traitement: Déclarations globales de FEN_Liste_Reclamation_Admin
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:29358296089918c8:00000000:1:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Déclarations globales de FEN_Liste_Reclamation_Admin
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Liste_Reclamation_Admin
 */
public void init()
//  Vider la zone répétée
{
super.init();

// // Vider la zone répétée
//MAP:29358296089918c8:00000022:1:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
// ZR_Reclamation.SupprimeTout()
//MAP:29358296089918c8:00000022:2:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Reclamation);

// SI HReadFirst(Reclamation) ALORS
//MAP:29358296089918c8:00000022:4:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("reclamation")).getBoolean())
{
// 	TANTQUE PAS HOut(Reclamation)
//MAP:29358296089918c8:00000022:5:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
while((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("reclamation")).getBoolean()))
{
// 		nEtat			est un entier	= Reclamation.Etat
//MAP:29358296089918c8:00000022:7:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDObjet vWD_nEtat = new WDEntier4();


vWD_nEtat.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("etat"));


// 		nProbleme		est un entier	= Reclamation.Probleme
//MAP:29358296089918c8:00000022:8:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDObjet vWD_nProbleme = new WDEntier4();


vWD_nProbleme.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("probleme"));


// 		nomComercial	est une chaîne	= ""
//MAP:29358296089918c8:00000022:b:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDObjet vWD_nomComercial = new WDChaineU();


vWD_nomComercial.setValeur("");


// 		nomChauffeur	est une chaîne	= ""
//MAP:29358296089918c8:00000022:c:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDObjet vWD_nomChauffeur = new WDChaineU();


vWD_nomChauffeur.setValeur("");


// 		SI HLitRecherchePremier(Magasin, IDmagasin, Reclamation.IDmagasin) ALORS
//MAP:29358296089918c8:00000022:f:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("magasin"),WDAPIHF.getRubriqueSansCasseNiAccent("idmagasin"),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idmagasin")).getBoolean())
{
// 			HFiltre(Affectation, Affectation.IDRéclamation, Reclamation.IDRéclamation)
//MAP:29358296089918c8:00000022:12:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDAPIHF.hFiltre(WDAPIHF.getFichierSansCasseNiAccent("affectation"),WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idreclamation"),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));

// 			SI HReadFirst(Affectation) ALORS
//MAP:29358296089918c8:00000022:14:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("affectation")).getBoolean())
{
// 				TANTQUE PAS HOut(Affectation)
//MAP:29358296089918c8:00000022:15:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
while((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("affectation")).getBoolean()))
{
// 					SI HLitRecherchePremier(Utilisateur, IDutilisateur, Affectation.IDutilisateur) ALORS
//MAP:29358296089918c8:00000022:18:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idutilisateur")).getBoolean())
{
// 						SELON Utilisateur.Role
//MAP:29358296089918c8:00000022:19:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 						SELON Utilisateur.Role
//MAP:29358296089918c8:00000022:19:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDObjet _WDExpSelon0 = WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role");
if(_WDExpSelon0.opEgal(1))
{
// 								ZR_Reclamation.ATT_IdComerciale = Utilisateur.IDutilisateur
//MAP:29358296089918c8:00000022:1c:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
mWD_ZR_Reclamation.mWD_ATT_IdComerciale.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("idutilisateur"));

// 								SI nomComercial = "" ALORS
//MAP:29358296089918c8:00000022:1d:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
if(vWD_nomComercial.opEgal(""))
{
// 									nomComercial = Utilisateur.Nom_Prenom
//MAP:29358296089918c8:00000022:1e:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
vWD_nomComercial.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"));

}
else
{
// 									nomComercial += ", " + Utilisateur.Nom_Prenom
//MAP:29358296089918c8:00000022:20:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
vWD_nomComercial.setValeur(vWD_nomComercial.opPlus(new WDChaineU(", ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"))));

}

}
else if(_WDExpSelon0.opEgal(2))
{
// 								SI nomChauffeur = "" ALORS
//MAP:29358296089918c8:00000022:24:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
if(vWD_nomChauffeur.opEgal(""))
{
// 									nomChauffeur = Utilisateur.Nom_Prenom
//MAP:29358296089918c8:00000022:25:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
vWD_nomChauffeur.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"));

}
else
{
// 									nomChauffeur += ", " + Utilisateur.Nom_Prenom
//MAP:29358296089918c8:00000022:27:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
vWD_nomChauffeur.setValeur(vWD_nomChauffeur.opPlus(new WDChaineU(", ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"))));

}

}

}

}

// 					HReadNext(Affectation)
//MAP:29358296089918c8:00000022:2c:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("affectation"));

}

}

// 			ZR_Reclamation.AjouteLigne(Reclamation.Num_facture,Magasin.NomMagasin,LibelleProbleme(nProbleme),Reclamation.Date,nomComercial,nomChauffeur,LibelleEtatFacture(nEtat),Reclamation.IDRéclamation)
//MAP:29358296089918c8:00000022:31:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Reclamation,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture"),WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("nommagasin"),fWD_libelleProbleme(vWD_nProbleme),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("date"),vWD_nomComercial,vWD_nomChauffeur,fWD_libelleEtatFacture(vWD_nEtat),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation")} );

// 			ZR_Reclamation.ATT_IdReclamation =Reclamation.IDRéclamation
//MAP:29358296089918c8:00000022:32:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
mWD_ZR_Reclamation.mWD_ATT_IdReclamation.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));

}

// 		HReadNext(Reclamation)
//MAP:29358296089918c8:00000022:35:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("reclamation"));

}

}

// ZR_Reclamation.Affiche()
//MAP:29358296089918c8:00000022:39:FEN_Liste_Reclamation_Admin:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Admin:Fin d'initialisation de FEN_Liste_Reclamation_Admin
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Reclamation);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Liste_Reclamation_Admin
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Reclamation = new GWDZR_Reclamation();
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD_SAI_Recherche = new GWDSAI_Recherche();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_MENU_SansNom1 = new GWDMMENU_SansNom1();
mWD_MENU_SansNom2 = new GWDMMENU_SansNom2();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Liste_Reclamation_Admin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969423110221666504l);

super.setChecksum("841623783");

super.setNom("FEN_Liste_Reclamation_Admin");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Liste Réclamation ");

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
// Initialisation des champs de FEN_Liste_Reclamation_Admin
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Reclamation.initialiserObjet();
super.ajouter("ZR_Reclamation", mWD_ZR_Reclamation);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_SAI_Recherche.initialiserObjet();
super.ajouter("SAI_Recherche", mWD_SAI_Recherche);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_MENU_SansNom1.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_SansNom1);
mWD_MENU_SansNom2.initialiserObjet();
ajouterMenuContextuel(mWD_MENU_SansNom2);

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
return GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Admin;
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
