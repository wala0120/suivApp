/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : SSuivApp
 * Date : 10/12/2025 00:34:24
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPSSuivApp extends WDProjet
{
private static GWDPSSuivApp ms_instance = null;
/**
 * Accès au projet: SSuivApp
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPSSuivApp.getInstance()
 */
public static GWDPSSuivApp getInstance()
{
return (GWDPSSuivApp) ms_instance;
}

 // FEN_login
public GWDFFEN_login mWD_FEN_login = new GWDFFEN_login();
 // accesseur de FEN_login
public GWDFFEN_login getFEN_login()
{
mWD_FEN_login.checkOuverture();
return mWD_FEN_login;
}

 // FEN_Magasin
public GWDFFEN_Magasin mWD_FEN_Magasin = new GWDFFEN_Magasin();
 // accesseur de FEN_Magasin
public GWDFFEN_Magasin getFEN_Magasin()
{
mWD_FEN_Magasin.checkOuverture();
return mWD_FEN_Magasin;
}

 // FEN_Ajout_Reclamation
public GWDFFEN_Ajout_Reclamation mWD_FEN_Ajout_Reclamation = new GWDFFEN_Ajout_Reclamation();
 // accesseur de FEN_Ajout_Reclamation
public GWDFFEN_Ajout_Reclamation getFEN_Ajout_Reclamation()
{
mWD_FEN_Ajout_Reclamation.checkOuverture();
return mWD_FEN_Ajout_Reclamation;
}

 // FEN_Menu_Administrateur
public GWDFFEN_Menu_Administrateur mWD_FEN_Menu_Administrateur = new GWDFFEN_Menu_Administrateur();
 // accesseur de FEN_Menu_Administrateur
public GWDFFEN_Menu_Administrateur getFEN_Menu_Administrateur()
{
mWD_FEN_Menu_Administrateur.checkOuverture();
return mWD_FEN_Menu_Administrateur;
}

 // FEN_Ajout_affectation
public GWDFFEN_Ajout_affectation mWD_FEN_Ajout_affectation = new GWDFFEN_Ajout_affectation();
 // accesseur de FEN_Ajout_affectation
public GWDFFEN_Ajout_affectation getFEN_Ajout_affectation()
{
mWD_FEN_Ajout_affectation.checkOuverture();
return mWD_FEN_Ajout_affectation;
}

 // FEN_Liste_Reclamation_Admin
public GWDFFEN_Liste_Reclamation_Admin mWD_FEN_Liste_Reclamation_Admin = new GWDFFEN_Liste_Reclamation_Admin();
 // accesseur de FEN_Liste_Reclamation_Admin
public GWDFFEN_Liste_Reclamation_Admin getFEN_Liste_Reclamation_Admin()
{
mWD_FEN_Liste_Reclamation_Admin.checkOuverture();
return mWD_FEN_Liste_Reclamation_Admin;
}

 // FEN_Menu_Chauffeur
public GWDFFEN_Menu_Chauffeur mWD_FEN_Menu_Chauffeur = new GWDFFEN_Menu_Chauffeur();
 // accesseur de FEN_Menu_Chauffeur
public GWDFFEN_Menu_Chauffeur getFEN_Menu_Chauffeur()
{
mWD_FEN_Menu_Chauffeur.checkOuverture();
return mWD_FEN_Menu_Chauffeur;
}

 // FEN_Liste_Utilisateurs
public GWDFFEN_Liste_Utilisateurs mWD_FEN_Liste_Utilisateurs = new GWDFFEN_Liste_Utilisateurs();
 // accesseur de FEN_Liste_Utilisateurs
public GWDFFEN_Liste_Utilisateurs getFEN_Liste_Utilisateurs()
{
mWD_FEN_Liste_Utilisateurs.checkOuverture();
return mWD_FEN_Liste_Utilisateurs;
}

 // FEN_ Menu_Commercial
public GWDFFEN_Menu_Commercial mWD_FEN_Menu_Commercial = new GWDFFEN_Menu_Commercial();
 // accesseur de FEN_ Menu_Commercial
public GWDFFEN_Menu_Commercial getFEN_Menu_Commercial()
{
mWD_FEN_Menu_Commercial.checkOuverture();
return mWD_FEN_Menu_Commercial;
}

 // FEN_Ajout_utilisateur
public GWDFFEN_Ajout_utilisateur mWD_FEN_Ajout_utilisateur = new GWDFFEN_Ajout_utilisateur();
 // accesseur de FEN_Ajout_utilisateur
public GWDFFEN_Ajout_utilisateur getFEN_Ajout_utilisateur()
{
mWD_FEN_Ajout_utilisateur.checkOuverture();
return mWD_FEN_Ajout_utilisateur;
}

 // FEN_Liste_Reclamation_Commercial
public GWDFFEN_Liste_Reclamation_Commercial mWD_FEN_Liste_Reclamation_Commercial = new GWDFFEN_Liste_Reclamation_Commercial();
 // accesseur de FEN_Liste_Reclamation_Commercial
public GWDFFEN_Liste_Reclamation_Commercial getFEN_Liste_Reclamation_Commercial()
{
mWD_FEN_Liste_Reclamation_Commercial.checkOuverture();
return mWD_FEN_Liste_Reclamation_Commercial;
}

 // FEN_Liste_Reclamation_Chauffeur
public GWDFFEN_Liste_Reclamation_Chauffeur mWD_FEN_Liste_Reclamation_Chauffeur = new GWDFFEN_Liste_Reclamation_Chauffeur();
 // accesseur de FEN_Liste_Reclamation_Chauffeur
public GWDFFEN_Liste_Reclamation_Chauffeur getFEN_Liste_Reclamation_Chauffeur()
{
mWD_FEN_Liste_Reclamation_Chauffeur.checkOuverture();
return mWD_FEN_Liste_Reclamation_Chauffeur;
}

 // FEN_Modifier_Utilisateur
public GWDFFEN_Modifier_Utilisateur mWD_FEN_Modifier_Utilisateur = new GWDFFEN_Modifier_Utilisateur();
 // accesseur de FEN_Modifier_Utilisateur
public GWDFFEN_Modifier_Utilisateur getFEN_Modifier_Utilisateur()
{
mWD_FEN_Modifier_Utilisateur.checkOuverture();
return mWD_FEN_Modifier_Utilisateur;
}

 // FEN_Liste_Magasin
public GWDFFEN_Liste_Magasin mWD_FEN_Liste_Magasin = new GWDFFEN_Liste_Magasin();
 // accesseur de FEN_Liste_Magasin
public GWDFFEN_Liste_Magasin getFEN_Liste_Magasin()
{
mWD_FEN_Liste_Magasin.checkOuverture();
return mWD_FEN_Liste_Magasin;
}


 // Constructeur de la classe GWDPSSuivApp
public GWDPSSuivApp()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
ajouterFenetre("FEN_login", mWD_FEN_login);
ajouterFenetre("FEN_Magasin", mWD_FEN_Magasin);
ajouterFenetre("FEN_Ajout_Reclamation", mWD_FEN_Ajout_Reclamation);
ajouterFenetre("FEN_Menu_Administrateur", mWD_FEN_Menu_Administrateur);
ajouterFenetre("FEN_Ajout_affectation", mWD_FEN_Ajout_affectation);
ajouterFenetre("FEN_Liste_Reclamation_Admin", mWD_FEN_Liste_Reclamation_Admin);
ajouterFenetre("FEN_Menu_Chauffeur", mWD_FEN_Menu_Chauffeur);
ajouterFenetre("FEN_Liste_Utilisateurs", mWD_FEN_Liste_Utilisateurs);
ajouterFenetre("FEN_ Menu_Commercial", mWD_FEN_Menu_Commercial);
ajouterFenetre("FEN_Ajout_utilisateur", mWD_FEN_Ajout_utilisateur);
ajouterFenetre("FEN_Liste_Reclamation_Commercial", mWD_FEN_Liste_Reclamation_Commercial);
ajouterFenetre("FEN_Liste_Reclamation_Chauffeur", mWD_FEN_Liste_Reclamation_Chauffeur);
ajouterFenetre("FEN_Modifier_Utilisateur", mWD_FEN_Modifier_Utilisateur);
ajouterFenetre("FEN_Liste_Magasin", mWD_FEN_Liste_Magasin);

ajouterRequeteWDR( new GWDRREQ_Reclamation() );
ajouterRequeteWDR( new GWDRREQ_NbrReclamation() );


}

// Code de déclaration de SSuivApp
public void trtInitProjet()
{
// CurrentUserID est un entier  // FR
//MAP:0000000000000000:00030000:1:SSuivApp:com.masociete.tracklet.wdgen.GWDPSSuivApp:Initialisation de SSuivApp
// CurrentUserID est un entier  // FR
//MAP:0000000000000000:00030000:1:SSuivApp:com.masociete.tracklet.wdgen.GWDPSSuivApp:Initialisation de SSuivApp
vWD_CurrentUserID = new WDEntier4();

super.ajouterVariableGlobale("CurrentUserID",vWD_CurrentUserID);



// IDReclamationGlobal est un entier
//MAP:0000000000000000:00030000:2:SSuivApp:com.masociete.tracklet.wdgen.GWDPSSuivApp:Initialisation de SSuivApp
vWD_IDReclamationGlobal = new WDEntier4();

super.ajouterVariableGlobale("IDReclamationGlobal",vWD_IDReclamationGlobal);



// IDCommerciale est un entier
//MAP:0000000000000000:00030000:3:SSuivApp:com.masociete.tracklet.wdgen.GWDPSSuivApp:Initialisation de SSuivApp
vWD_IDCommerciale = new WDEntier4();

super.ajouterVariableGlobale("IDCommerciale",vWD_IDCommerciale);



// gnIDUtilisateur est un entier = CurrentUserID
//MAP:0000000000000000:00030000:4:SSuivApp:com.masociete.tracklet.wdgen.GWDPSSuivApp:Initialisation de SSuivApp
vWD_gnIDUtilisateur = new WDEntier4();

vWD_gnIDUtilisateur.setValeur(vWD_CurrentUserID);

super.ajouterVariableGlobale("gnIDUtilisateur",vWD_gnIDUtilisateur);



// gnIDUtilisateurModifier est un entier
//MAP:0000000000000000:00030000:5:SSuivApp:com.masociete.tracklet.wdgen.GWDPSSuivApp:Initialisation de SSuivApp
vWD_gnIDUtilisateurModifier = new WDEntier4();

super.ajouterVariableGlobale("gnIDUtilisateurModifier",vWD_gnIDUtilisateurModifier);



}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_CurrentUserID = WDVarNonAllouee.ref;
static public WDObjet vWD_IDReclamationGlobal = WDVarNonAllouee.ref;
static public WDObjet vWD_IDCommerciale = WDVarNonAllouee.ref;
static public WDObjet vWD_gnIDUtilisateur = WDVarNonAllouee.ref;
static public WDObjet vWD_gnIDUtilisateurModifier = WDVarNonAllouee.ref;
public String getVersionApplication(){ return "0.0.1.0";}
public String getNomSociete(){ return "PC SOFT";}
public String getNomAPK(){ return "    TrackLet";}
public int getIdNomApplication(){return com.masociete.tracklet.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.tracklet";}
public int getIdIconeApplication(){ return com.masociete.tracklet.R.drawable.i_c_o_n_e________2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 568;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "SSuivApp";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "ssuivapp";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\FBOOKING2_CBOX.PNG?E12_A1A6A1A6A1A6A1A6A1A6A1A6_8O",com.masociete.tracklet.R.drawable.fbooking2_cbox_31_selector_animh1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GEAR (1).PNG",com.masociete.tracklet.R.drawable.gear__1__30, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\SETTINGS.PNG",com.masociete.tracklet.R.drawable.settings_29, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\INFO_B_32_5.PNG?E5",com.masociete.tracklet.R.drawable.info_b_32_5_28_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ENTREPRENEUR.PNG",com.masociete.tracklet.R.drawable.entrepreneur_27, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ADD-USER.PNG",com.masociete.tracklet.R.drawable.add_user_26, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\RIGHT.PNG",com.masociete.tracklet.R.drawable.right_25, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\PROFILE.PNG",com.masociete.tracklet.R.drawable.profile_24, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\PHONE-CALL.PNG",com.masociete.tracklet.R.drawable.phone_call_23, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\LOCATION (1).PNG",com.masociete.tracklet.R.drawable.location__1__22, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\FBOOKING2_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.tracklet.R.drawable.fbooking2_edt_21_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\EXPRESS-DELIVERY.PNG",com.masociete.tracklet.R.drawable.express_delivery_20, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\BELL.PNG",com.masociete.tracklet.R.drawable.bell_19, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_BTN_STD.PNG?E5_A1A6A1A6A1_3NP_8_8_10_10",com.masociete.tracklet.R.drawable.aquablue_btn_std_18_np3_8_8_10_10_selector_animh1t0h6t150h1t0h6t150h1t0, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_SELECT.PNG?E5_3NP_4_4_4_4",com.masociete.tracklet.R.drawable.aquablue_select_17_np3_4_4_4_4_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_ROLLOVER.PNG",com.masociete.tracklet.R.drawable.aquablue_rollover_16, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_BREAK_PICT.PNG?E2_4O",com.masociete.tracklet.R.drawable.aquablue_break_pict_15_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_BREAK.PNG",com.masociete.tracklet.R.drawable.aquablue_break_14, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ADD (1).PNG",com.masociete.tracklet.R.drawable.add__1__13, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ADD-GROUP.PNG",com.masociete.tracklet.R.drawable.add_group_12, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.tracklet.R.drawable.aquablue_edt_11_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\LIST.PNG",com.masociete.tracklet.R.drawable.list_10, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\LEFT.PNG",com.masociete.tracklet.R.drawable.left_9, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_COMBO.PNG?E5_3NP_32_6_42_6",com.masociete.tracklet.R.drawable.aquablue_combo_8_np3_32_6_42_6_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\FBOOKING2_BTN_STD.PNG?E5_A1A6A1A6A1_3NP_8_8_10_10",com.masociete.tracklet.R.drawable.fbooking2_btn_std_7_np3_8_8_10_10_selector_animh1t0h6t150h1t0h6t150h1t0, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\DISKETTE.PNG",com.masociete.tracklet.R.drawable.diskette_6, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\PARAMÈTRE_B_32_5.PNG?E5",com.masociete.tracklet.R.drawable.parametre_b_32_5_5_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\APPETITE_11331394.PNG",com.masociete.tracklet.R.drawable.appetite_11331394_4, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\49E559BA-1B88-4AED-81D5-446C990E42BD.PNG",com.masociete.tracklet.R.drawable.a9e559ba_1b88_4aed_81d5_446c990e42bd_3, "");
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPSSuivApp.class;
}
}
}
