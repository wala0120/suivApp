/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Liste_Reclamation_Admin
 * Date : 06/01/2026 19:01:59
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
import fr.pcsoft.wdjava.ui.champs.onglet.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
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

super.setPositionInitiale(175, 4);

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
// moimeme=datesys()
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

super.setPositionInitiale(184, 71);

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
 * Traitement: Initialisation de BTN_Affecter ( ZR_Reclamation )
 */
public void init()
{
super.init();

// IF gnCurrentAffectationTab = 1 THEN
// IF gnCurrentAffectationTab = 1 THEN
if(GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab.opEgal(1))
{
// 	BTN_Affecter..Visible = False
this.setProp(EWDPropriete.PROP_VISIBLE,false);

}
else
{
// 	BTN_Affecter..Visible = True
this.setProp(EWDPropriete.PROP_VISIBLE,true);

}

}




/**
 * Traitement: Clic sur BTN_Affecter ( ZR_Reclamation )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// IDReclamationGlobal =  ZR_Reclamation[ZR_Reclamation..Occurrence].ATT_IdReclamation
// IDReclamationGlobal =  ZR_Reclamation[ZR_Reclamation..Occurrence].ATT_IdReclamation
GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal.setValeur(mWD_ZR_Reclamation.get(mWD_ZR_Reclamation.getProp(EWDPropriete.PROP_OCCURRENCE)).get("ATT_IdReclamation"));

// OuvreFenêtreMobile(FEN_Ajout_affectation)
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
super.setRectCompPrincipal(1,1,318,97);
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

super.setPositionInitiale(0, 137);

super.setTailleInitiale(320, 385);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 318, 97);

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
// IDReclamationGlobal = ATT_IdReclamation
GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal.setValeur(mWD_ATT_IdReclamation);

// IDCommerciale = ATT_IdComerciale
GWDPSSuivApp.getInstance().vWD_IDCommerciale.setValeur(mWD_ATT_IdComerciale);

// OuvreFenêtreMobile(FEN_Ajout_affectation)
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
super.setRectCompPrincipal(1,3,229,25);
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

super.setTailleInitiale(287, 31);

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

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0xF2000000, 0xF3000000, 0xFDFDFD, 2.000000, 2.000000, 1, 1));

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
// SAI_Recherche..Indication = "Rechercher"
this.setProp(EWDPropriete.PROP_INDICATION,"Rechercher");

}




/**
 * Traitement: A chaque modification de SAI_Recherche
 */
public void modification()
{
super.modification();

// FillLooper()
// FillLooper()
fWD_fillLooper();

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
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
// OuvreFenêtreMobile(FEN_Menu_Administrateur)
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
 * ONG_Affectation
 */
class GWDONG_Affectation extends WDOnglet
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Liste_Reclamation_Admin.ONG_Affectation
////////////////////////////////////////////////////////////////////////////

/**
 * ONG_Affectation_Volet1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Reclamation_Admin.ONG_Affectation
////////////////////////////////////////////////////////////////////////////
class GWDONG_Affectation_Volet1 extends WDVoletOnglet
{
public  void initialiserObjet()
{
super.initialiserObjet();
super.setOnglet(getWDOngletThis());
super.setLibelle("Affecter");

super.setEtatInitial(0);

super.setVisibleInitial(true);

super.setImage("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDONG_Affectation_Volet1 mWD_ONG_Affectation_Volet1 = new GWDONG_Affectation_Volet1();

/**
 * ONG_Affectation_Volet2
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Reclamation_Admin.ONG_Affectation
////////////////////////////////////////////////////////////////////////////
class GWDONG_Affectation_Volet2 extends WDVoletOnglet
{
public  void initialiserObjet()
{
super.initialiserObjet();
super.setOnglet(getWDOngletThis());
super.setLibelle("Non Affecter");

super.setEtatInitial(0);

super.setVisibleInitial(true);

super.setImage("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDONG_Affectation_Volet2 mWD_ONG_Affectation_Volet2 = new GWDONG_Affectation_Volet2();
/**
 * Initialise tous les champs de FEN_Liste_Reclamation_Admin.ONG_Affectation
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste_Reclamation_Admin.ONG_Affectation
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ONG_Affectation_Volet1.initialiserObjet();
super.ajouterVolet(mWD_ONG_Affectation_Volet1);
mWD_ONG_Affectation_Volet2.initialiserObjet();
super.ajouterVolet(mWD_ONG_Affectation_Volet2);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2975809662087230524l);

super.setChecksum("758039515");

super.setNom("ONG_Affectation");

super.setType(16);

super.setBulle("");

super.setLibelle("Onglet");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setCouleurFond(0xFFFFFFFF);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 101);

super.setTailleInitiale(320, 22);

super.setValeurInitiale(1);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setScrollAuDoigt(true);

super.setParamTabs(24, 0, 1);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleVoletActif(0xF5A250, 0xF4800000, creerPolice_GEN("MS Shell Dlg", -8.000000, 5), 1, 2, 0);

super.setStyleVoletInactif(0xF4000000, 0xF1000000, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 1, 2, 0);

super.setImage("", false);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF2000000, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Modification du volet affiché de ONG_Affectation
 */
public void modification()
//  This code runs every time a user clicks a tab
{
super.modification();

// // This code runs every time a user clicks a tab
// SWITCH ONG_Affectation
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SWITCH ONG_Affectation
WDObjet _WDExpSelon0 = this;
if(_WDExpSelon0.opEgal(1))
{
// 		gnCurrentAffectationTab = 1
GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab.setValeur(1);

// 		OuvreFenêtreMobile(FEN_Liste_Reclamation_Admin)
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Admin);

}
else if(_WDExpSelon0.opEgal(2))
{
// 		gnCurrentAffectationTab = 2
GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab.setValeur(2);

// 		OuvreFenêtreMobile(FEN_Liste_Reclamation_Admin)
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Admin);

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDONG_Affectation mWD_ONG_Affectation;

/**
 * IMG_SansNom3
 */
class GWDIMG_SansNom3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Liste_Reclamation_Admin.IMG_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2977267799222803279l);

super.setChecksum("791923417");

super.setNom("IMG_SansNom3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(260, 60);

super.setTailleInitiale(20, 41);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\search.png");

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

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

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
public GWDIMG_SansNom3 mWD_IMG_SansNom3;

/**
 * IMG_Bell
 */
class GWDIMG_Bell extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Liste_Reclamation_Admin.IMG_Bell
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979909337294334178l);

super.setChecksum("833043171");

super.setNom("IMG_Bell");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(280, 38);

super.setTailleInitiale(26, 30);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\bell.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

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
 * Traitement: Initialisation de IMG_Bell
 */
public void init()
//  Exécuter la requête
{
super.init();

// // Exécuter la requête
// SI HExécuteRequête(REQ_NbrAffectation) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_nbraffectation")).getBoolean())
{
// 	HLitPremier(REQ_NbrAffectation)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_nbraffectation"));

// 	Si gnCurrentAffectationTab ALORS
if(GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab.getBoolean())
{
// 		LIB_Badge..Valeur = REQ_NbrAffectation.NbAffected
mWD_LIB_Badge.setProp(EWDPropriete.PROP_VALEUR,WDAPIHF.getFichierSansCasseNiAccent("req_nbraffectation").getRubriqueSansCasseNiAccent("nbaffected"));

}

// 	Si gnCurrentAffectationTab = 2 ALORS
if(GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab.opEgal(2))
{
// 		LIB_Badge..Valeur = REQ_NbrAffectation.NbNonAffected
mWD_LIB_Badge.setProp(EWDPropriete.PROP_VALEUR,WDAPIHF.getFichierSansCasseNiAccent("req_nbraffectation").getRubriqueSansCasseNiAccent("nbnonaffected"));

}

}
else
{
// 	Info("Erreur lors de l'exécution de la requête")
WDAPIDialogue.info("Erreur lors de l'exécution de la requête");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Bell mWD_IMG_Bell;

/**
 * LIB_Badge
 */
class GWDLIB_Badge extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Liste_Reclamation_Admin.LIB_Badge
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2979909736728482858l);

super.setChecksum("835231136");

super.setNom("LIB_Badge");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(274, 60);

super.setTailleInitiale(22, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x394AE1, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x2D2D2D);

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
public GWDLIB_Badge mWD_LIB_Badge;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Liste_Reclamation_Admin
////////////////////////////////////////////////////////////////////////////
public WDObjet fWD_libelleProbleme( WDObjet vWD_nProbleme )
{
// PROCÉDURE LibelleProbleme(nProbleme est un entier)
initExecProcLocale("LibelleProbleme");

try
{
vWD_nProbleme = WDParametre.traiterParametre(vWD_nProbleme, 1, false, 8);


// SELON nProbleme
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nProbleme
WDObjet _WDExpSelon0 = vWD_nProbleme;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Cachet Non apposé"
return new WDChaineU("Cachet Non apposé");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Bon de commande Non disponible"
return new WDChaineU("Bon de commande Non disponible");

}
else if(_WDExpSelon0.opEgal(3))
{
// 	CAS 3 : RENVOYER "pré facture  Non transmise au Magasin"
return new WDChaineU("pré facture  Non transmise au Magasin");

}
else if(_WDExpSelon0.opEgal(4))
{
// 	CAS 4 : RENVOYER "absence du responsable POUR signature "
return new WDChaineU("absence du responsable POUR signature ");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
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
initExecProcLocale("LibelleEtatFacture");

try
{
vWD_nEtat = WDParametre.traiterParametre(vWD_nEtat, 1, false, 8);


// SELON nEtat
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nEtat
WDObjet _WDExpSelon0 = vWD_nEtat;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Récupéré"
return new WDChaineU("Récupéré");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Non récupéré"
return new WDChaineU("Non récupéré");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
return new WDChaineU("Inconnu");

}

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  FillLooper ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_fillLooper()
{
// PROCÉDURE FillLooper()
initExecProcLocale("FillLooper");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sSearchString = new WDChaineU();



// ZR_Reclamation.SupprimeTout()
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Reclamation);

// ONG_Affectation			= gnCurrentAffectationTab
mWD_ONG_Affectation.setValeur(GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab);

// BTN_Affecter..Visible	= (ONG_Affectation = 2)
mWD_ZR_Reclamation.mWD_BTN_Affecter.setProp(EWDPropriete.PROP_VISIBLE,mWD_ONG_Affectation.opEgal(2));

// sSearchString is string = Upper(SAI_Recherche)

vWD_sSearchString.setValeur(WDAPIChaine.majuscule(mWD_SAI_Recherche));


// FOR EACH Reclamation 
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("reclamation"), null, true);
while(parcours1.testParcours())
{
// 	nEtat			est un entier	= Reclamation.Etat
WDObjet vWD_nEtat = new WDEntier4();


vWD_nEtat.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("etat"));


// 	nProbleme		est un entier	= Reclamation.Probleme
WDObjet vWD_nProbleme = new WDEntier4();


vWD_nProbleme.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("probleme"));


// 	nomComercial	est une chaîne	= ""
WDObjet vWD_nomComercial = new WDChaineU();


vWD_nomComercial.setValeur("");


// 	nomChauffeur	est une chaîne	= ""
WDObjet vWD_nomChauffeur = new WDChaineU();


vWD_nomChauffeur.setValeur("");


// 	sNomMagasin		est une chaîne	= ""
WDObjet vWD_sNomMagasin = new WDChaineU();


vWD_sNomMagasin.setValeur("");


// 	IF HLitRecherchePremier(Magasin, IDmagasin, Reclamation.IDmagasin) THEN
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("magasin"),WDAPIHF.getRubriqueSansCasseNiAccent("idmagasin"),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idmagasin")).getBoolean())
{
// 		sNomMagasin = Magasin.NomMagasin
vWD_sNomMagasin.setValeur(WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("nommagasin"));

// 		IF sSearchString <> "" THEN
if(vWD_sSearchString.opDiff(""))
{
// 			IF Position(Upper(Reclamation.Num_facture), sSearchString) = 0 AND ...
if((WDAPIChaine.position(WDAPIChaine.majuscule(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture")),vWD_sSearchString).opEgal(0) & WDAPIChaine.position(WDAPIChaine.majuscule(vWD_sNomMagasin),vWD_sSearchString).opEgal(0)))
{
// 				CONTINUE // This record doesn't match the search, skip to next Reclamation
continue;

}

}

// 		FOR EACH Affectation where IDRéclamation = Reclamation.IDRéclamation
IWDParcours parcours2 = null;
try
{
parcours2 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("affectation"), WDAPIHF.getRubriqueSansCasseNiAccent("idreclamation"), WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"), 1, true);
while(parcours2.testParcours())
{
// 			IF HLitRecherchePremier(Utilisateur, IDutilisateur, Affectation.IDutilisateur) THEN
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idutilisateur")).getBoolean())
{
// 				SWITCH Utilisateur.Role
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 				SWITCH Utilisateur.Role
WDObjet _WDExpSelon0 = WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role");
if(_WDExpSelon0.opEgal(1))
{
// 						nomComercial += (nomComercial = "" ? "" ELSE ", ") + Utilisateur.Nom_Prenom
vWD_nomComercial.setValeur(vWD_nomComercial.opPlus((vWD_nomComercial.opEgal("") ? (WDObjet)new WDChaineU("") : (WDObjet)new WDChaineU(", ")).opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"))));

}
else if(_WDExpSelon0.opEgal(2))
{
// 						nomChauffeur += (nomChauffeur = "" ? "" ELSE ", ") + Utilisateur.Nom_Prenom
vWD_nomChauffeur.setValeur(vWD_nomChauffeur.opPlus((vWD_nomChauffeur.opEgal("") ? (WDObjet)new WDChaineU("") : (WDObjet)new WDChaineU(", ")).opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"))));

}

}

}

}
}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


// 		bShouldAdd is boolean = False
WDObjet vWD_bShouldAdd = new WDBooleen();


vWD_bShouldAdd.setValeur(false);


// 		IF ONG_Affectation = 1 THEN
if(mWD_ONG_Affectation.opEgal(1))
{
// 			IF nomComercial <> "" THEN bShouldAdd = True
if(vWD_nomComercial.opDiff(""))
{
// 			IF nomComercial <> "" THEN bShouldAdd = True
vWD_bShouldAdd.setValeur(true);

}

}
else
{
// 			IF nomComercial = "" THEN bShouldAdd = True
if(vWD_nomComercial.opEgal(""))
{
// 			IF nomComercial = "" THEN bShouldAdd = True
vWD_bShouldAdd.setValeur(true);

}

}

// 		IF bShouldAdd = True THEN
if(vWD_bShouldAdd.opEgal(true))
{
// 			nLine is int = ZR_Reclamation.AjouteLigne(Reclamation.Num_facture, ...
WDObjet vWD_nLine = new WDEntier4();


vWD_nLine.setValeur(WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Reclamation,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture"),vWD_sNomMagasin,fWD_libelleProbleme(vWD_nProbleme),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("date"),vWD_nomComercial,vWD_nomChauffeur,fWD_libelleEtatFacture(vWD_nEtat),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation")} ));


// 			ZR_Reclamation[nLine].ATT_IdReclamation = Reclamation.IDRéclamation
mWD_ZR_Reclamation.get(vWD_nLine).get("ATT_IdReclamation").setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));

}

}

}
}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// ZR_Reclamation.Affiche()
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_Reclamation);

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
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Liste_Reclamation_Admin
 */
public void init()
{
super.init();

// PROCÉDURE FillLooper()

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sSearchString = new WDChaineU();



// ZR_Reclamation.SupprimeTout()
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Reclamation);

// ONG_Affectation			= gnCurrentAffectationTab
mWD_ONG_Affectation.setValeur(GWDPSSuivApp.getInstance().vWD_gnCurrentAffectationTab);

// BTN_Affecter..Visible	= (ONG_Affectation = 2)
mWD_ZR_Reclamation.mWD_BTN_Affecter.setProp(EWDPropriete.PROP_VISIBLE,mWD_ONG_Affectation.opEgal(2));

// sSearchString is string = Upper(SAI_Recherche)

vWD_sSearchString.setValeur(WDAPIChaine.majuscule(mWD_SAI_Recherche));


// FOR EACH Reclamation 
IWDParcours parcours3 = null;
try
{
parcours3 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("reclamation"), null, true);
while(parcours3.testParcours())
{
// 	nEtat			est un entier	= Reclamation.Etat
WDObjet vWD_nEtat = new WDEntier4();


vWD_nEtat.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("etat"));


// 	nProbleme		est un entier	= Reclamation.Probleme
WDObjet vWD_nProbleme = new WDEntier4();


vWD_nProbleme.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("probleme"));


// 	nomComercial	est une chaîne	= ""
WDObjet vWD_nomComercial = new WDChaineU();


vWD_nomComercial.setValeur("");


// 	nomChauffeur	est une chaîne	= ""
WDObjet vWD_nomChauffeur = new WDChaineU();


vWD_nomChauffeur.setValeur("");


// 	sNomMagasin		est une chaîne	= ""
WDObjet vWD_sNomMagasin = new WDChaineU();


vWD_sNomMagasin.setValeur("");


// 	IF HLitRecherchePremier(Magasin, IDmagasin, Reclamation.IDmagasin) THEN
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("magasin"),WDAPIHF.getRubriqueSansCasseNiAccent("idmagasin"),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idmagasin")).getBoolean())
{
// 		sNomMagasin = Magasin.NomMagasin + " " + Magasin.Adresse
vWD_sNomMagasin.setValeur(WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("nommagasin").opPlus(" ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("adresse")));

// 		IF sSearchString <> "" THEN
if(vWD_sSearchString.opDiff(""))
{
// 			IF Position(Upper(Reclamation.Num_facture), sSearchString) = 0 AND ...
if((WDAPIChaine.position(WDAPIChaine.majuscule(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture")),vWD_sSearchString).opEgal(0) & WDAPIChaine.position(WDAPIChaine.majuscule(vWD_sNomMagasin),vWD_sSearchString).opEgal(0)))
{
// 				CONTINUE // This record doesn't match the search, skip to next Reclamation
continue;

}

}

// 		FOR EACH Affectation WHERE IDRéclamation = Reclamation.IDRéclamation
IWDParcours parcours4 = null;
try
{
parcours4 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("affectation"), WDAPIHF.getRubriqueSansCasseNiAccent("idreclamation"), WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"), 1, true);
while(parcours4.testParcours())
{
// 			IF HLitRecherchePremier(Utilisateur, IDutilisateur, Affectation.IDutilisateur) THEN
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("idutilisateur"),WDAPIHF.getFichierSansCasseNiAccent("affectation").getRubriqueSansCasseNiAccent("idutilisateur")).getBoolean())
{
// 				SWITCH Utilisateur.Role
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 				SWITCH Utilisateur.Role
WDObjet _WDExpSelon0 = WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("role");
if(_WDExpSelon0.opEgal(1))
{
// 						nomComercial += (nomComercial = "" ? "" ELSE ", ") + Utilisateur.Nom_Prenom
vWD_nomComercial.setValeur(vWD_nomComercial.opPlus((vWD_nomComercial.opEgal("") ? (WDObjet)new WDChaineU("") : (WDObjet)new WDChaineU(", ")).opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"))));

}
else if(_WDExpSelon0.opEgal(2))
{
// 						nomChauffeur += (nomChauffeur = "" ? "" ELSE ", ") + Utilisateur.Nom_Prenom
vWD_nomChauffeur.setValeur(vWD_nomChauffeur.opPlus((vWD_nomChauffeur.opEgal("") ? (WDObjet)new WDChaineU("") : (WDObjet)new WDChaineU(", ")).opPlus(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nom_prenom"))));

}

}

}

}
}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// 		bShouldAdd is boolean = False
WDObjet vWD_bShouldAdd = new WDBooleen();


vWD_bShouldAdd.setValeur(false);


// 		IF ONG_Affectation = 1 THEN
if(mWD_ONG_Affectation.opEgal(1))
{
// 			IF nomComercial <> "" THEN bShouldAdd = True
if(vWD_nomComercial.opDiff(""))
{
// 			IF nomComercial <> "" THEN bShouldAdd = True
vWD_bShouldAdd.setValeur(true);

}

}
else
{
// 			IF nomComercial = "" THEN bShouldAdd = True
if(vWD_nomComercial.opEgal(""))
{
// 			IF nomComercial = "" THEN bShouldAdd = True
vWD_bShouldAdd.setValeur(true);

}

}

// 		IF bShouldAdd = True THEN
if(vWD_bShouldAdd.opEgal(true))
{
// 			nLine is int = ZR_Reclamation.AjouteLigne(Reclamation.Num_facture, ...
WDObjet vWD_nLine = new WDEntier4();


vWD_nLine.setValeur(WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Reclamation,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture"),vWD_sNomMagasin,fWD_libelleProbleme(vWD_nProbleme),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("date"),vWD_nomComercial,vWD_nomChauffeur,fWD_libelleEtatFacture(vWD_nEtat),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation")} ));


// 			ZR_Reclamation[nLine].ATT_IdReclamation = Reclamation.IDRéclamation
mWD_ZR_Reclamation.get(vWD_nLine).get("ATT_IdReclamation").setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));

}

}

}
}
finally
{
if(parcours3 != null)
{
parcours3.finParcours();
}
}


// ZR_Reclamation.Affiche()
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
mWD_ONG_Affectation = new GWDONG_Affectation();
mWD_IMG_SansNom3 = new GWDIMG_SansNom3();
mWD_IMG_Bell = new GWDIMG_Bell();
mWD_LIB_Badge = new GWDLIB_Badge();
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
mWD_ONG_Affectation.initialiserObjet();
super.ajouter("ONG_Affectation", mWD_ONG_Affectation);
mWD_IMG_SansNom3.initialiserObjet();
super.ajouter("IMG_SansNom3", mWD_IMG_SansNom3);
mWD_IMG_Bell.initialiserObjet();
super.ajouter("IMG_Bell", mWD_IMG_Bell);
mWD_LIB_Badge.initialiserObjet();
super.ajouter("LIB_Badge", mWD_LIB_Badge);
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
