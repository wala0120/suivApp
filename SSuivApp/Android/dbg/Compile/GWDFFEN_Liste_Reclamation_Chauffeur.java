/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Liste_Reclamation_Chauffeur
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
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Liste_Reclamation_Chauffeur extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Liste_Reclamation_Chauffeur
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Reclamation
 */
class GWDZR_Reclamation extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_NumFacture
 */
class GWDATT_NumFacture extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NumFacture
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
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NumFacture

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
// Déclaration des champs du fils n°2 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NomMagasin
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
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NomMagasin

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
// Déclaration des champs du fils n°3 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_Probleme
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Probleme");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_Probleme

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
// Déclaration des champs du fils n°4 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_Date
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
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_Date

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
// Déclaration des champs du fils n°5 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NomChauffeur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NomChauffeur");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NomChauffeur

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
// Déclaration des champs du fils n°6 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NomComerciale
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_NomComerciale");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_NomComerciale

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
// Déclaration des champs du fils n°7 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_Etat
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
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_Etat

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
// Déclaration des champs du fils n°8 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_IdReclamation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IdReclamation");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_IdReclamation

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
// Déclaration des champs du fils n°9 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_IdComerciale
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IdComerciale");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.ATT_IdComerciale

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
// Déclaration des champs du fils n°10 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.LIB_NumFacture
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969887975898850056l);

super.setChecksum("727634369");

super.setNom("LIB_NumFacture");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NumFacture");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(7, 8);

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
// Déclaration des champs du fils n°11 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.LIB_NomMagasin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969887975898915592l);

super.setChecksum("727699905");

super.setNom("LIB_NomMagasin");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NomMagasin");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(191, 11);

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
// Déclaration des champs du fils n°12 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.LIB_Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969887975899112200l);

super.setChecksum("727896513");

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

super.setPositionInitiale(7, 29);

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
//MAP:29372961022ba308:0000000e:1:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.LIB_Date:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation$GWDLIB_Date:Initialisation de LIB_Date ( ZR_Reclamation )
// moimeme=datesys()
//MAP:29372961022ba308:0000000e:5:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.LIB_Date:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation$GWDLIB_Date:Initialisation de LIB_Date ( ZR_Reclamation )
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
// Déclaration des champs du fils n°13 de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation.LIB_Etat
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969887975899177736l);

super.setChecksum("727962049");

super.setNom("LIB_Etat");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Etat");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 43);

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
public GWDLIB_Etat mWD_LIB_Etat = new GWDLIB_Etat();
/**
 * Initialise tous les champs de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation
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
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,318,71);
super.setQuid(2969887975898194696l);

super.setChecksum("726991321");

super.setNom("ZR_Reclamation");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 99);

super.setTailleInitiale(320, 427);

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

super.setParamAffichage(0, 0, 1, 318, 71);

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
 * Traitement: Affichage d'une ligne de ZR_Reclamation
 */
public void affichageLigne()
//  Coloration selon état
{
super.affichageLigne();

// // Coloration selon état
//MAP:29372961021da308:00000015:1:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Affichage d'une ligne de ZR_Reclamation
// SELON ATT_Etat
//MAP:29372961021da308:00000015:2:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Affichage d'une ligne de ZR_Reclamation
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON ATT_Etat
//MAP:29372961021da308:00000015:2:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Affichage d'une ligne de ZR_Reclamation
WDObjet _WDExpSelon0 = mWD_ATT_Etat;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : LIB_Etat..Couleur =VertPastel
//MAP:29372961021da308:00000015:3:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Affichage d'une ligne de ZR_Reclamation
mWD_LIB_Etat.setProp(EWDPropriete.PROP_COULEUR,10092441);

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : LIB_Etat..Couleur =RougePastel
//MAP:29372961021da308:00000015:4:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Affichage d'une ligne de ZR_Reclamation
mWD_LIB_Etat.setProp(EWDPropriete.PROP_COULEUR,10066431);

}
else {
// 	AUTRE CAS : LIB_Etat..Couleur =Noir 
//MAP:29372961021da308:00000015:5:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Affichage d'une ligne de ZR_Reclamation
mWD_LIB_Etat.setProp(EWDPropriete.PROP_COULEUR,0);

}

}

}




/**
 * Traitement: Sélection d'une ligne de ZR_Reclamation
 */
public void selectionLigne()
{
super.selectionLigne();

// IDReclamationGlobal = ATT_IdReclamation
//MAP:29372961021da308:00000021:1:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
// IDReclamationGlobal = ATT_IdReclamation
//MAP:29372961021da308:00000021:1:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
GWDPSSuivApp.getInstance().vWD_IDReclamationGlobal.setValeur(mWD_ATT_IdReclamation);

// IDCommerciale = ATT_IdComerciale
//MAP:29372961021da308:00000021:2:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
GWDPSSuivApp.getInstance().vWD_IDCommerciale.setValeur(mWD_ATT_IdComerciale);

// OuvreFenêtreMobile(FEN_Ajout_affectation)
//MAP:29372961021da308:00000021:3:FEN_Liste_Reclamation_Chauffeur.ZR_Reclamation:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDZR_Reclamation:Sélection d'une ligne de ZR_Reclamation
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Ajout_affectation);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
super.activerEcouteurAffichageLigne();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_Reclamation mWD_ZR_Reclamation;

/**
 * IMG_Bell
 */
class GWDIMG_Bell extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Liste_Reclamation_Chauffeur.IMG_Bell
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969892610177375188l);

super.setChecksum("736450476");

super.setNom("IMG_Bell");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(268, 54);

super.setTailleInitiale(39, 31);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\bell.png");

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

super.setStyleLibelle(0x2D2D2D, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x2D2D2D);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de IMG_Bell
 */
public void init()
{
super.init();

// 
//MAP:29372d9802ae1bd4:0000000e:1:FEN_Liste_Reclamation_Chauffeur.IMG_Bell:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_Bell:Initialisation de IMG_Bell
// SI HExécuteRequête(REQ_NbrReclamation,hQueryDefault,CurrentUserID)	 ALORS
//MAP:29372d9802ae1bd4:0000000e:3:FEN_Liste_Reclamation_Chauffeur.IMG_Bell:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_Bell:Initialisation de IMG_Bell
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_nbrreclamation"),new WDEntier4(0),new WDObjet[] {GWDPSSuivApp.getInstance().vWD_CurrentUserID} ).getBoolean())
{
// 	HLitPremier(REQ_NbrReclamation)
//MAP:29372d9802ae1bd4:0000000e:6:FEN_Liste_Reclamation_Chauffeur.IMG_Bell:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_Bell:Initialisation de IMG_Bell
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_nbrreclamation"));

// 	LIB_Badge..Valeur = REQ_NbrReclamation.NbRec
//MAP:29372d9802ae1bd4:0000000e:9:FEN_Liste_Reclamation_Chauffeur.IMG_Bell:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_Bell:Initialisation de IMG_Bell
mWD_LIB_Badge.setProp(EWDPropriete.PROP_VALEUR,WDAPIHF.getFichierSansCasseNiAccent("req_nbrreclamation").getRubriqueSansCasseNiAccent("nbrec"));

}
else
{
// 	Info("Erreur lors de l'exécution de la requête")
//MAP:29372d9802ae1bd4:0000000e:c:FEN_Liste_Reclamation_Chauffeur.IMG_Bell:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_Bell:Initialisation de IMG_Bell
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
// Déclaration des champs du fils n°3 de FEN_Liste_Reclamation_Chauffeur.LIB_Badge
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2969897635291919955l);

super.setChecksum("739257813");

super.setNom("LIB_Badge");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(276, 80);

super.setTailleInitiale(22, 21);

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

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Liste_Reclamation_Chauffeur.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970236349345583824l);

super.setChecksum("787136097");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Liste réclamation");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(65, 17);

super.setTailleInitiale(207, 43);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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
// Déclaration des champs du fils n°5 de FEN_Liste_Reclamation_Chauffeur.SAI_Recherche
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,3,242,25);
super.setQuid(2970237105297556032l);

super.setChecksum("824863929");

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

super.setPositionInitiale(8, 60);

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

super.setAltitude(5);

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

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 10.000000, 10.000000, 1, 1), 0, 0, 0, 0);

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
//MAP:293866e907f20240:0000000e:1:FEN_Liste_Reclamation_Chauffeur.SAI_Recherche:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDSAI_Recherche:Initialisation de SAI_Recherche
// SAI_Recherche..Indication = "Rechercher"
//MAP:293866e907f20240:0000000e:4:FEN_Liste_Reclamation_Chauffeur.SAI_Recherche:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDSAI_Recherche:Initialisation de SAI_Recherche
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
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Liste_Reclamation_Chauffeur.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970255079692033637l);

super.setChecksum("781214695");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(150, 533);

super.setTailleInitiale(28, 34);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\add (1).png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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
//MAP:293877420557de65:00000012:1:FEN_Liste_Reclamation_Chauffeur.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// OuvreFenêtreMobile(FEN_Ajout_Reclamation)
//MAP:293877420557de65:00000012:2:FEN_Liste_Reclamation_Chauffeur.IMG_SansNom2:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_SansNom2:Clic sur IMG_SansNom2
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Ajout_Reclamation);

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
// Déclaration des champs du fils n°7 de FEN_Liste_Reclamation_Chauffeur.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2970255285851953793l);

super.setChecksum("782704691");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(9, 526);

super.setTailleInitiale(33, 38);

super.setValeurInitiale("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\left.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

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

// OuvreFenêtreMobile(FEN_Menu_Chauffeur)
//MAP:29387772056e9a81:00000012:1:FEN_Liste_Reclamation_Chauffeur.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_SansNom1:Clic sur IMG_SansNom1
// OuvreFenêtreMobile(FEN_Menu_Chauffeur)
//MAP:29387772056e9a81:00000012:1:FEN_Liste_Reclamation_Chauffeur.IMG_SansNom1:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur$GWDIMG_SansNom1:Clic sur IMG_SansNom1
WDAPIFenetre.ouvreFille(GWDPSSuivApp.getInstance().mWD_FEN_Menu_Chauffeur);

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
// Procédures utilisateur de FEN_Liste_Reclamation_Chauffeur
////////////////////////////////////////////////////////////////////////////
public WDObjet fWD_libelleProbleme( WDObjet vWD_nProbleme )
{
// PROCÉDURE LibelleProbleme(nProbleme est un entier)
//MAP:19372af8001fda77:00070000:1:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
initExecProcLocale("LibelleProbleme");

try
{
vWD_nProbleme = WDParametre.traiterParametre(vWD_nProbleme, 1, false, 8);


// SELON nProbleme
//MAP:19372af8001fda77:00070000:2:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nProbleme
//MAP:19372af8001fda77:00070000:2:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
WDObjet _WDExpSelon0 = vWD_nProbleme;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Cachet Non apposé"
//MAP:19372af8001fda77:00070000:3:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
return new WDChaineU("Cachet Non apposé");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Bon de commande Non disponible"
//MAP:19372af8001fda77:00070000:4:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
return new WDChaineU("Bon de commande Non disponible");

}
else if(_WDExpSelon0.opEgal(3))
{
// 	CAS 3 : RENVOYER "pré facture  Non transmise au Magasin"
//MAP:19372af8001fda77:00070000:5:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
return new WDChaineU("pré facture  Non transmise au Magasin");

}
else if(_WDExpSelon0.opEgal(4))
{
// 	CAS 4 : RENVOYER "absence du responsable POUR signature "
//MAP:19372af8001fda77:00070000:6:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
return new WDChaineU("absence du responsable POUR signature ");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
//MAP:19372af8001fda77:00070000:7:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleProbleme:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleProbleme
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
//MAP:19372b0e00202fea:00070000:1:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleEtatFacture
initExecProcLocale("LibelleEtatFacture");

try
{
vWD_nEtat = WDParametre.traiterParametre(vWD_nEtat, 1, false, 8);


// SELON nEtat
//MAP:19372b0e00202fea:00070000:2:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleEtatFacture
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON nEtat
//MAP:19372b0e00202fea:00070000:2:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleEtatFacture
WDObjet _WDExpSelon0 = vWD_nEtat;
if(_WDExpSelon0.opEgal(1))
{
// 	CAS 1 : RENVOYER "Récupéré"
//MAP:19372b0e00202fea:00070000:3:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleEtatFacture
return new WDChaineU("Récupéré");

}
else if(_WDExpSelon0.opEgal(2))
{
// 	CAS 2 : RENVOYER "Non récupéré"
//MAP:19372b0e00202fea:00070000:4:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleEtatFacture
return new WDChaineU("Non récupéré");

}
else {
// 	AUTRE CAS : RENVOYER "Inconnu"
//MAP:19372b0e00202fea:00070000:5:FEN_Liste_Reclamation_Chauffeur.PROCEDURE.LibelleEtatFacture:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:LibelleEtatFacture
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
 * Traitement: Déclarations globales de FEN_Liste_Reclamation_Chauffeur
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:293728fe01e7212b:00000000:1:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Déclarations globales de FEN_Liste_Reclamation_Chauffeur
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
 */
public void init()
//  --- Vider la zone répétée ---
{
super.init();

// // --- Vider la zone répétée ---
//MAP:293728fe01e7212b:00000022:1:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
// ZR_Reclamation.SupprimeTout()
//MAP:293728fe01e7212b:00000022:2:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_Reclamation);

// SI HReadFirst(Reclamation) ALORS
//MAP:293728fe01e7212b:00000022:5:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("reclamation")).getBoolean())
{
// 	TANTQUE PAS HOut(Reclamation)
//MAP:293728fe01e7212b:00000022:6:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
while((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("reclamation")).getBoolean()))
{
// 		nEtat			est un entier	= Reclamation.Etat
//MAP:293728fe01e7212b:00000022:8:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDObjet vWD_nEtat = new WDEntier4();


vWD_nEtat.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("etat"));


// 		nProbleme		est un entier	= Reclamation.Probleme
//MAP:293728fe01e7212b:00000022:9:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDObjet vWD_nProbleme = new WDEntier4();


vWD_nProbleme.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("probleme"));


// 		nomChauffeur	est une chaîne	= ""	// à remplir si nécessaire
//MAP:293728fe01e7212b:00000022:a:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDObjet vWD_nomChauffeur = new WDChaineU();


vWD_nomChauffeur.setValeur("");


// 		nomComercial	est une chaîne	= ""	// à remplir si nécessaire
//MAP:293728fe01e7212b:00000022:b:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDObjet vWD_nomComercial = new WDChaineU();


vWD_nomComercial.setValeur("");


// 		SI HLitRecherchePremier(Magasin, IDmagasin, Reclamation.IDmagasin) ALORS
//MAP:293728fe01e7212b:00000022:e:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
if(WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("magasin"),WDAPIHF.getRubriqueSansCasseNiAccent("idmagasin"),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idmagasin")).getBoolean())
{
// 			HFiltre(Affectation, "IDRéclamation = " + Reclamation.IDRéclamation + " AND IDutilisateur = " + CurrentUserID)
//MAP:293728fe01e7212b:00000022:11:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDAPIHF.hFiltre(WDAPIHF.getFichierSansCasseNiAccent("affectation"),new WDChaineU("IDRéclamation = ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation")).opPlus(" AND IDutilisateur = ").opPlus(GWDPSSuivApp.getInstance().vWD_CurrentUserID).getString());

// 			SI HReadFirst(Affectation) ALORS
//MAP:293728fe01e7212b:00000022:14:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
if(WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("affectation")).getBoolean())
{
// 	ZR_Reclamation.AjouteLigne(Reclamation.Num_facture,Magasin.NomMagasin,LibelleProbleme(nProbleme),Reclamation.Date,nomComercial,nomChauffeur,LibelleEtatFacture(nEtat),Reclamation.IDRéclamation)
//MAP:293728fe01e7212b:00000022:16:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_Reclamation,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("num_facture"),WDAPIHF.getFichierSansCasseNiAccent("magasin").getRubriqueSansCasseNiAccent("nommagasin"),fWD_libelleProbleme(vWD_nProbleme),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("date"),vWD_nomComercial,vWD_nomChauffeur,fWD_libelleEtatFacture(vWD_nEtat),WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation")} );

// 				ZR_Reclamation.ATT_IdReclamation = Reclamation.IDRéclamation
//MAP:293728fe01e7212b:00000022:17:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
mWD_ZR_Reclamation.mWD_ATT_IdReclamation.setValeur(WDAPIHF.getFichierSansCasseNiAccent("reclamation").getRubriqueSansCasseNiAccent("idreclamation"));

}

}

// 		HReadNext(Reclamation)
//MAP:293728fe01e7212b:00000022:1c:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("reclamation"));

}

}

// ZR_Reclamation.Affiche()
//MAP:293728fe01e7212b:00000022:21:FEN_Liste_Reclamation_Chauffeur:com.masociete.tracklet.wdgen.GWDFFEN_Liste_Reclamation_Chauffeur:Fin d'initialisation de FEN_Liste_Reclamation_Chauffeur
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
// Création des champs de la fenêtre FEN_Liste_Reclamation_Chauffeur
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Reclamation = new GWDZR_Reclamation();
mWD_IMG_Bell = new GWDIMG_Bell();
mWD_LIB_Badge = new GWDLIB_Badge();
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD_SAI_Recherche = new GWDSAI_Recherche();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Liste_Reclamation_Chauffeur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2969887550692860203l);

super.setChecksum("729405362");

super.setNom("FEN_Liste_Reclamation_Chauffeur");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Liste Réclamation");

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
// Initialisation des champs de FEN_Liste_Reclamation_Chauffeur
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Reclamation.initialiserObjet();
super.ajouter("ZR_Reclamation", mWD_ZR_Reclamation);
mWD_IMG_Bell.initialiserObjet();
super.ajouter("IMG_Bell", mWD_IMG_Bell);
mWD_LIB_Badge.initialiserObjet();
super.ajouter("LIB_Badge", mWD_LIB_Badge);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_SAI_Recherche.initialiserObjet();
super.ajouter("SAI_Recherche", mWD_SAI_Recherche);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);

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
return GWDPSSuivApp.getInstance().mWD_FEN_Liste_Reclamation_Chauffeur;
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
