/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : SSuivApp
 * Date : 30/11/2025 15:01:38
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.tracklet.wdgen;


import com.masociete.tracklet.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.context.*;
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

 // menu
public GWDFmenu mWD_menu = new GWDFmenu();
 // accesseur de menu
public GWDFmenu getmenu()
{
mWD_menu.checkOuverture();
return mWD_menu;
}

 // login
public GWDFlogin mWD_login = new GWDFlogin();
 // accesseur de login
public GWDFlogin getlogin()
{
mWD_login.checkOuverture();
return mWD_login;
}

 // nouveau utilisateur
public GWDFnouveau_utilisateur mWD_nouveau_utilisateur = new GWDFnouveau_utilisateur();
 // accesseur de nouveau utilisateur
public GWDFnouveau_utilisateur getnouveau_utilisateur()
{
mWD_nouveau_utilisateur.checkOuverture();
return mWD_nouveau_utilisateur;
}

 // magasin
public GWDFmagasin mWD_magasin = new GWDFmagasin();
 // accesseur de magasin
public GWDFmagasin getmagasin()
{
mWD_magasin.checkOuverture();
return mWD_magasin;
}

 // réclamation
public GWDFreclamation mWD_reclamation = new GWDFreclamation();
 // accesseur de réclamation
public GWDFreclamation getreclamation()
{
mWD_reclamation.checkOuverture();
return mWD_reclamation;
}

 // FEN_Menu_Administrateur
public GWDFFEN_Menu_Administrateur mWD_FEN_Menu_Administrateur = new GWDFFEN_Menu_Administrateur();
 // accesseur de FEN_Menu_Administrateur
public GWDFFEN_Menu_Administrateur getFEN_Menu_Administrateur()
{
mWD_FEN_Menu_Administrateur.checkOuverture();
return mWD_FEN_Menu_Administrateur;
}


 // FI_Téléchargement
public GWDFIFI_Telechargement mWD_FI_Telechargement = new GWDFIFI_Telechargement();
 // accesseur de FI_Téléchargement
public GWDFIFI_Telechargement getFI_Telechargement()
{
GWDFIFI_Telechargement fiCtx = (GWDFIFI_Telechargement)WDAppelContexte.getContexte().getFenetreInterne("FI_Téléchargement");
return fiCtx != null ? fiCtx  : mWD_FI_Telechargement;
}

 // Constructeur de la classe GWDPSSuivApp
public GWDPSSuivApp()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
ajouterFenetre("menu", mWD_menu);
ajouterFenetre("login", mWD_login);
ajouterFenetre("nouveau utilisateur", mWD_nouveau_utilisateur);
ajouterFenetre("magasin", mWD_magasin);
ajouterFenetre("réclamation", mWD_reclamation);
ajouterFenetre("FEN_Menu_Administrateur", mWD_FEN_Menu_Administrateur);
ajouterFenetreInterne("FI_Téléchargement");



}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
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
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\RIGHT-ARROW (1).PNG",com.masociete.tracklet.R.drawable.right_arrow__1__28, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.tracklet.R.drawable.aquablue_edt_27_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_COMBO.PNG?E5_3NP_32_6_42_6",com.masociete.tracklet.R.drawable.aquablue_combo_26_np3_32_6_42_6_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ADD-GROUP.PNG",com.masociete.tracklet.R.drawable.add_group_25, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\CLIENT_B_32_5.PNG?E5",com.masociete.tracklet.R.drawable.client_b_32_5_24_selector, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\CHATGPT IMAGE 17 NOV. 2025, 10_52_07.PNG",com.masociete.tracklet.R.drawable.chatgpt_image_17_nov__2025__10_52_07_23, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\PROFILE.PNG",com.masociete.tracklet.R.drawable.profile_22, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\PHONE-CALL.PNG",com.masociete.tracklet.R.drawable.phone_call_21, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\LOCATION (1).PNG",com.masociete.tracklet.R.drawable.location__1__20, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBOOKING2_BTN_STD.PNG?E5_A1A6A1A6A1_3NP_8_8_10_10",com.masociete.tracklet.R.drawable.fbooking2_btn_std_19_np3_8_8_10_10_selector_animh1t0h6t150h1t0h6t150h1t0, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\EXPRESS-DELIVERY.PNG",com.masociete.tracklet.R.drawable.express_delivery_18, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\DISKETTE.PNG",com.masociete.tracklet.R.drawable.diskette_17, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\POWER.PNG",com.masociete.tracklet.R.drawable.power_16, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBOOKING2_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.tracklet.R.drawable.fbooking2_edt_15_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\FBOOKING2_CBOX.PNG?E12_A1A6A1A6A1A6A1A6A1A6A1A6_8O",com.masociete.tracklet.R.drawable.fbooking2_cbox_14_selector_animh1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150, "");
super.ajouterFichierAssocie("C:\\Users\\Wala Bhy\\OneDrive\\Bureau\\Stage PFE\\suivApp\\SSuivApp\\ACCOUNT-RECOVERY (1).PNG",com.masociete.tracklet.R.drawable.account_recovery__1__13, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\USINE_B_32_5.PNG?E5",com.masociete.tracklet.R.drawable.usine_b_32_5_12_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\SETTINGS.PNG",com.masociete.tracklet.R.drawable.settings_11, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\INFO_B_32_5.PNG?E5",com.masociete.tracklet.R.drawable.info_b_32_5_10_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ENTREPRENEUR.PNG",com.masociete.tracklet.R.drawable.entrepreneur_9, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\APPETITE_11331394.PNG",com.masociete.tracklet.R.drawable.appetite_11331394_8, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\ADD-USER.PNG",com.masociete.tracklet.R.drawable.add_user_7, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\49E559BA-1B88-4AED-81D5-446C990E42BD.PNG",com.masociete.tracklet.R.drawable.a9e559ba_1b88_4aed_81d5_446c990e42bd_6, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_PROGBAR_BG.PNG?_3NP_4_4_4_4",com.masociete.tracklet.R.drawable.aquablue_progbar_bg_5_np3_4_4_4_4, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_PROGBAR_ACTIV.PNG?_3NP_4_4_4_4",com.masociete.tracklet.R.drawable.aquablue_progbar_activ_4_np3_4_4_4_4, "");
super.ajouterFichierAssocie("C:\\USERS\\WALA BHY\\ONEDRIVE\\BUREAU\\STAGE PFE\\SUIVAPP\\SSUIVAPP\\GABARITS\\WM\\180 AQUABLUE\\AQUABLUE_BTN_STD.PNG?E5_A1A6A1A6A1_3NP_8_8_10_10",com.masociete.tracklet.R.drawable.aquablue_btn_std_3_np3_8_8_10_10_selector_animh1t0h6t150h1t0h6t150h1t0, "");
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
