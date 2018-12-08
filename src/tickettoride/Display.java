

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;

public class Display extends Application {

    int destCount;  // Which destination is being pressed for the buttons
    // 0 meaning first destination, 1 being the second destination 
    Game game;

    //create color array or list; ????
    public static void main(String[] args) {
        launch(args);
    }

    private Stage stage;

    private Scene transition;

    public Scene getTransition() {
        return transition;
    }

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage; //stage is used for event handler classes
        game = new Game();

//GRIDLINES   
//<editor-fold defaultstate="collapsed" desc="comment">
//Line c1 =new Line(100,0,100,1000);
//Line c2 =new Line(200,0,200,1000);
//Line c3 =new Line(300,0,300,1000);
//Line c4 =new Line(400,0,400,1000);
//Line c5 =new Line(500,0,500,1000);
//Line c6 =new Line(600,0,600,1000);
//Line c7 =new Line(700,0,700,1000);
//Line c8 =new Line(800,0,800,1000);
//Line c9 =new Line(900,0,900,1000);
//Line c10 =new Line(1000,0,1000,1000);
//Line c11 =new Line(1100,0,1100,1000);
//
//
//Line r1 =new Line(0,100,1200,100);
//Line r2 =new Line(0,200,1200,200);
//Line r3 =new Line(0,300,1200,300);
//Line r4 =new Line(0,400,1200,400);
//Line r5 =new Line(0,500,1200,500);
//Line r6 =new Line(0,600,1200,600);
//Line r7 =new Line(0,700,1200,700);
//</editor-fold>
//BUTTONS
//<editor-fold defaultstate="collapsed" desc="comment">
        //Los Angeles
        Button LA = new Button();
        LA.setText("LA"); // sets text of button
        LA.setTranslateX(170); // x coordinate
        LA.setTranslateY(400); // y coordinate 
        LA.setShape(new Circle(4)); // makes button shape into circle
        LA.setMinSize(4, 4); // sets button shape minimum size

        //Seattle
        Button SEA = new Button();
        SEA.setText("SEA");
        SEA.setTranslateX(175);
        SEA.setTranslateY(60);
        SEA.setShape(new Circle(4));
        SEA.setMinSize(4, 4);

        //Vancouver
        Button VAN = new Button();
        VAN.setText("VAN");
        VAN.setTranslateX(165);
        VAN.setTranslateY(5);
        VAN.setShape(new Circle(4));
        VAN.setMinSize(4, 4);

        //Winnipeg
        Button WIN = new Button();
        WIN.setText("WIN");
        WIN.setTranslateX(640);
        WIN.setTranslateY(50);
        WIN.setShape(new Circle(4));
        WIN.setMinSize(4, 4);

        //Salt Lake City
        Button SLC = new Button();
        SLC.setText("SLC");
        SLC.setTranslateX(350);
        SLC.setTranslateY(270);
        SLC.setShape(new Circle(4));
        SLC.setMinSize(4, 4);

        //Portland
        Button POR = new Button();
        POR.setText("POR");
        POR.setTranslateX(145);
        POR.setTranslateY(105);
        POR.setShape(new Circle(4));
        POR.setMinSize(4, 4);

        //Pheonix
        Button PHE = new Button();
        PHE.setText("PHE");
        PHE.setTranslateX(310);
        PHE.setTranslateY(440);
        PHE.setShape(new Circle(4));
        PHE.setMinSize(4, 4);

        //Little Rock
        Button LR = new Button();
        LR.setText("LR");
        LR.setTranslateX(760);
        LR.setTranslateY(440);
        LR.setShape(new Circle(4));
        LR.setMinSize(4, 4);

        //Denver
        Button DEN = new Button();
        DEN.setText("DEN");
        DEN.setTranslateX(470);
        DEN.setTranslateY(325);
        DEN.setShape(new Circle(4));
        DEN.setMinSize(4, 4);

        /*
        //Pittsburg
        Button PIT = new Button();
        PIT.setText("PIT");
        PIT.setTranslateX(930);
        PIT.setTranslateY(270);
        PIT.setShape(new Circle(4));
        PIT.setMinSize(4,4);
         */
        //Oaklahoma
        Button OKC = new Button();
        OKC.setText("OKC");
        OKC.setTranslateX(620);
        OKC.setTranslateY(420);
        OKC.setShape(new Circle(4));
        OKC.setMinSize(4, 4);

        //Duluth
        Button DUL = new Button();
        DUL.setText("DUL");
        DUL.setTranslateX(740);
        DUL.setTranslateY(130);
        DUL.setShape(new Circle(4));
        DUL.setMinSize(4, 4);

        //Helana
        Button HEL = new Button();
        HEL.setText("HEL");
        HEL.setTranslateX(360);
        HEL.setTranslateY(120);
        HEL.setShape(new Circle(4));
        HEL.setMinSize(4, 4);

        //Miami
        Button MIA = new Button();
        MIA.setText("MIA");
        MIA.setTranslateX(1075);
        MIA.setTranslateY(650);
        MIA.setShape(new Circle(4));
        MIA.setMinSize(4, 4);

        //Houston
        Button HOU = new Button();
        HOU.setText("HOU");
        HOU.setTranslateX(700);
        HOU.setTranslateY(570);
        HOU.setShape(new Circle(4));
        HOU.setMinSize(4, 4);

        //Boston
        Button BOS = new Button();
        BOS.setText("BOS");
        BOS.setTranslateX(1190);
        BOS.setTranslateY(190);
        BOS.setShape(new Circle(4));
        BOS.setMinSize(4, 4);

        //Raleigh
        Button RAE = new Button();
        RAE.setText("RAE");
        RAE.setTranslateX(1080);
        RAE.setTranslateY(385);
        RAE.setShape(new Circle(4));
        RAE.setMinSize(4, 4);

        //Ney York
        Button NYC = new Button();
        NYC.setText("NYC");
        NYC.setTranslateX(1140);
        NYC.setTranslateY(230);
        NYC.setShape(new Circle(4));
        NYC.setMinSize(4, 4);

        //Chicago
        Button CHI = new Button();
        CHI.setText("CHI");
        CHI.setTranslateX(840);
        CHI.setTranslateY(250);
        CHI.setShape(new Circle(4));
        CHI.setMinSize(4, 4);

        //Saint Maury
        Button STM = new Button();
        STM.setText("STM");
        STM.setTranslateX(900);
        STM.setTranslateY(120);
        STM.setShape(new Circle(4));
        STM.setMinSize(4, 4);

        //Dallas
        Button DAL = new Button();
        DAL.setText("DAL");
        DAL.setTranslateX(640);
        DAL.setTranslateY(500);
        DAL.setShape(new Circle(4));
        DAL.setMinSize(4, 4);

        //Nashville
        Button NAS = new Button();
        NAS.setText("NAS");
        NAS.setTranslateX(880);
        NAS.setTranslateY(405);
        NAS.setShape(new Circle(4));
        NAS.setMinSize(4, 4);

        //Charleston
        Button CHA = new Button();
        CHA.setText("CHA");
        CHA.setTranslateX(1040);
        CHA.setTranslateY(460);
        CHA.setShape(new Circle(4));
        CHA.setMinSize(4, 4);

        //WDC
        Button DC = new Button();
        DC.setText("DC");
        DC.setTranslateX(1080);
        DC.setTranslateY(310);
        DC.setShape(new Circle(4));
        DC.setMinSize(4, 4);

        //Toronto
        Button TOR = new Button();
        TOR.setText("TOR");
        TOR.setTranslateX(1000);
        TOR.setTranslateY(180);
        TOR.setShape(new Circle(4));
        TOR.setMinSize(4, 4);

        //St luois
        Button STL = new Button();
        STL.setText("STL");
        STL.setTranslateX(790);
        STL.setTranslateY(330);
        STL.setShape(new Circle(4));
        STL.setMinSize(4, 4);

        //Kansis City
        Button KSC = new Button();
        KSC.setText("KSC");
        KSC.setTranslateX(700);
        KSC.setTranslateY(330);
        KSC.setShape(new Circle(4));
        KSC.setMinSize(4, 4);

        //Montreal
        Button MON = new Button();
        MON.setText("MON");
        MON.setTranslateX(1110);
        MON.setTranslateY(110);
        MON.setShape(new Circle(4));
        MON.setMinSize(4, 4);

        //New Orleans
        Button NWO = new Button();
        NWO.setText("NWO");
        NWO.setTranslateX(820);
        NWO.setTranslateY(550);
        NWO.setShape(new Circle(4));
        NWO.setMinSize(4, 4);

        //El Paso
        Button ELP = new Button();
        ELP.setText("ELP");
        ELP.setTranslateX(430);
        ELP.setTranslateY(500);
        ELP.setShape(new Circle(4));
        ELP.setMinSize(4, 4);

        //Santa Fe
        Button STF = new Button();
        STF.setText("STF");
        STF.setTranslateX(450);
        STF.setTranslateY(400);
        STF.setShape(new Circle(4));
        STF.setMinSize(4, 4);

        // Bismarck
        Button BIS = new Button();
        BIS.setText("BIS");
        BIS.setTranslateX(590);
        BIS.setTranslateY(120);
        BIS.setShape(new Circle(4));
        BIS.setMinSize(4, 4);

        //Create the Player option Buttons 
        Button p2 = new Button();
        p2.setTranslateX(0);
        p2.setTranslateY(245);
        p2.setText("Ready To Play!");

        //Create Ready Button
        Button ready = new Button("Ready " + game.getUser().GetName());
        ready.setTranslateX(580);
        ready.setTranslateY(450);
        game.setReady(ready);

        //Create End game button
        Button endGame = new Button("End Game");
        endGame.setTranslateX(1199);
        endGame.setTranslateY(0);
        
        
        Button pauseScreen = new Button("Options");
        pauseScreen.setTranslateX(1199);
        pauseScreen.setTranslateY(0);
        
        Button resumeGame = new Button("Resume Game");
        resumeGame.setTranslateX(50);
        resumeGame.setTranslateY(50);

//</editor-fold>
// ROUTE LENGTH LABEL
//<editor-fold defaultstate="collapsed" desc="comment">
        // Create Labels to display the length of each route.
        // Labels will be the same color as the route and placed next to the route to let
        // the user know how many Train Cards are needed for a specific route
        // length labels for each route on the map
        Label VANtoWINlength = new Label();
        VANtoWINlength.setText("9"); // text
        VANtoWINlength.setTextFill(Color.GREY); // color
        VANtoWINlength.setTranslateX(430); // x coordinate
        VANtoWINlength.setTranslateY(20); // y coordinate 
        VANtoWINlength.setStyle("-fx-font-weight: bold"); // makes text bold
        VANtoWINlength.setStyle("-fx-font: 18 arial;"); // text font and size

        Label SEAtoLAlength = new Label();
        SEAtoLAlength.setText("9");
        SEAtoLAlength.setTextFill(Color.WHITE);
        SEAtoLAlength.setTranslateX(175);
        SEAtoLAlength.setTranslateY(205);
        SEAtoLAlength.setStyle("-fx-font-weight: bold");
        SEAtoLAlength.setStyle("-fx-font: 18 arial;");

        Label SLCtoPORlength = new Label();
        SLCtoPORlength.setText("6");
        SLCtoPORlength.setTextFill(Color.BLUE);
        SLCtoPORlength.setTranslateX(250);
        SLCtoPORlength.setTranslateY(168);
        SLCtoPORlength.setStyle("-fx-font-weight: bold");
        SLCtoPORlength.setStyle("-fx-font: 18 arial;");

        Label PHEtoLRlength = new Label();
        PHEtoLRlength.setText("8");
        PHEtoLRlength.setTextFill(Color.PURPLE);
        PHEtoLRlength.setTranslateX(590);
        PHEtoLRlength.setTranslateY(450);
        PHEtoLRlength.setStyle("-fx-font-weight: bold");
        PHEtoLRlength.setStyle("-fx-font: 18 arial;");

        Label DENtoBISlength = new Label();
        DENtoBISlength.setText("6");
        DENtoBISlength.setTextFill(Color.BLACK);
        DENtoBISlength.setTranslateX(560);
        DENtoBISlength.setTranslateY(230);
        DENtoBISlength.setStyle("-fx-font-weight: bold");
        DENtoBISlength.setStyle("-fx-font: 18 arial;");

        Label OKCtoDULlength = new Label();
        OKCtoDULlength.setText("8");
        OKCtoDULlength.setTextFill(Color.RED);
        OKCtoDULlength.setTranslateX(690);
        OKCtoDULlength.setTranslateY(230);
        OKCtoDULlength.setStyle("-fx-font-weight: bold");
        OKCtoDULlength.setStyle("-fx-font: 18 arial;");

        Label SEAtoVANlength = new Label();
        SEAtoVANlength.setText("1");
        SEAtoVANlength.setTextFill(Color.GREY);
        SEAtoVANlength.setTranslateX(170);
        SEAtoVANlength.setTranslateY(37);
        SEAtoVANlength.setStyle("-fx-font-weight: bold");
        SEAtoVANlength.setStyle("-fx-font: 18 arial;");

        Label SEAtoPORlength = new Label();
        SEAtoPORlength.setText("1");
        SEAtoPORlength.setTextFill(Color.GREY);
        SEAtoPORlength.setTranslateX(161);
        SEAtoPORlength.setTranslateY(85);
        SEAtoPORlength.setStyle("-fx-font-weight: bold");
        SEAtoPORlength.setStyle("-fx-font: 18 arial;");

        Label HELtoLAlength = new Label();
        HELtoLAlength.setText("8");
        HELtoLAlength.setTextFill(Color.BLUE);
        HELtoLAlength.setTranslateX(265);
        HELtoLAlength.setTranslateY(300);
        HELtoLAlength.setStyle("-fx-font-weight: bold");
        HELtoLAlength.setStyle("-fx-font: 18 arial;");

        Label MIAtoHOUlength = new Label();
        MIAtoHOUlength.setText("8");
        MIAtoHOUlength.setTextFill(Color.PURPLE);
        MIAtoHOUlength.setTranslateX(890);
        MIAtoHOUlength.setTranslateY(625);
        MIAtoHOUlength.setStyle("-fx-font-weight: bold");
        MIAtoHOUlength.setStyle("-fx-font: 18 arial;");

        Label BOStoRAElength = new Label();
        BOStoRAElength.setText("6");
        BOStoRAElength.setTextFill(Color.WHITE);
        BOStoRAElength.setTranslateX(1160);
        BOStoRAElength.setTranslateY(300);
        BOStoRAElength.setStyle("-fx-font-weight: bold");
        BOStoRAElength.setStyle("-fx-font: 18 arial;");

        Label NYCtoCHIlength = new Label();
        NYCtoCHIlength.setText("5");
        NYCtoCHIlength.setTextFill(Color.BLACK);
        NYCtoCHIlength.setTranslateX(990);
        NYCtoCHIlength.setTranslateY(250);
        NYCtoCHIlength.setStyle("-fx-font-weight: bold");
        NYCtoCHIlength.setStyle("-fx-font: 18 arial;");

        Label STMtoDALlength = new Label();
        STMtoDALlength.setText("9");
        STMtoDALlength.setTextFill(Color.BLUE);
        STMtoDALlength.setTranslateX(840);
        STMtoDALlength.setTranslateY(200);
        STMtoDALlength.setStyle("-fx-font-weight: bold");
        STMtoDALlength.setStyle("-fx-font: 18 arial;");

        Label DALtoNASlength = new Label();
        DALtoNASlength.setText("5");
        DALtoNASlength.setTextFill(Color.GREY);
        DALtoNASlength.setTranslateX(815);
        DALtoNASlength.setTranslateY(450);
        DALtoNASlength.setStyle("-fx-font-weight: bold");
        DALtoNASlength.setStyle("-fx-font: 18 arial;");

        Label NAStoMIAlength = new Label();
        NAStoMIAlength.setText("5");
        NAStoMIAlength.setTextFill(Color.GREY);
        NAStoMIAlength.setTranslateX(970);
        NAStoMIAlength.setTranslateY(525);
        NAStoMIAlength.setStyle("-fx-font-weight: bold");
        NAStoMIAlength.setStyle("-fx-font: 18 arial;");

        Label MIAtoCHAlength = new Label();
        MIAtoCHAlength.setText("4");
        MIAtoCHAlength.setTextFill(Color.BLUE);
        MIAtoCHAlength.setTranslateX(1075);
        MIAtoCHAlength.setTranslateY(525);
        MIAtoCHAlength.setStyle("-fx-font-weight: bold");
        MIAtoCHAlength.setStyle("-fx-font: 18 arial;");

        Label CHAtoDClength = new Label();
        CHAtoDClength.setText("4");
        CHAtoDClength.setTextFill(Color.PURPLE);
        CHAtoDClength.setTranslateX(1050);
        CHAtoDClength.setTranslateY(400);
        CHAtoDClength.setStyle("-fx-font-weight: bold");
        CHAtoDClength.setStyle("-fx-font: 18 arial;");

        Label TORtoCHIlength = new Label();
        TORtoCHIlength.setText("4");
        TORtoCHIlength.setTextFill(Color.BLACK);
        TORtoCHIlength.setTranslateX(915);
        TORtoCHIlength.setTranslateY(210);
        TORtoCHIlength.setStyle("-fx-font-weight: bold");
        TORtoCHIlength.setStyle("-fx-font: 18 arial;");

        Label CHItoSTLlength = new Label();
        CHItoSTLlength.setText("2");
        CHItoSTLlength.setTextFill(Color.RED);
        CHItoSTLlength.setTranslateX(835);
        CHItoSTLlength.setTranslateY(300);
        CHItoSTLlength.setStyle("-fx-font-weight: bold");
        CHItoSTLlength.setStyle("-fx-font: 18 arial;");

        Label STLtoKSClength = new Label();
        STLtoKSClength.setText("2");
        STLtoKSClength.setTextFill(Color.GREY);
        STLtoKSClength.setTranslateX(745);
        STLtoKSClength.setTranslateY(320);
        STLtoKSClength.setStyle("-fx-font-weight: bold");
        STLtoKSClength.setStyle("-fx-font: 18 arial;");

        Label DCtoMONlength = new Label();
        DCtoMONlength.setText("5");
        DCtoMONlength.setTextFill(Color.WHITE);
        DCtoMONlength.setTranslateX(1130);
        DCtoMONlength.setTranslateY(195);
        DCtoMONlength.setStyle("-fx-font-weight: bold");
        DCtoMONlength.setStyle("-fx-font: 18 arial;");

        Label NYCtoLRlength = new Label();
        NYCtoLRlength.setText("9");
        NYCtoLRlength.setTextFill(Color.RED);
        NYCtoLRlength.setTranslateX(960);
        NYCtoLRlength.setTranslateY(310);
        NYCtoLRlength.setStyle("-fx-font-weight: bold");
        NYCtoLRlength.setStyle("-fx-font: 18 arial;");

        Label LRtoNWOlength = new Label();
        LRtoNWOlength.setText("3");
        LRtoNWOlength.setTextFill(Color.WHITE);
        LRtoNWOlength.setTranslateX(805);
        LRtoNWOlength.setTranslateY(490);
        LRtoNWOlength.setStyle("-fx-font-weight: bold");
        LRtoNWOlength.setStyle("-fx-font: 18 arial;");

        Label HOUtoELPlength = new Label();
        HOUtoELPlength.setText("6");
        HOUtoELPlength.setTextFill(Color.RED);
        HOUtoELPlength.setTranslateX(590);
        HOUtoELPlength.setTranslateY(548);
        HOUtoELPlength.setStyle("-fx-font-weight: bold");
        HOUtoELPlength.setStyle("-fx-font: 18 arial;");

        Label NAStoCHAlength = new Label();
        NAStoCHAlength.setText("3");
        NAStoCHAlength.setTextFill(Color.BLACK);
        NAStoCHAlength.setTranslateX(965);
        NAStoCHAlength.setTranslateY(438);
        NAStoCHAlength.setStyle("-fx-font-weight: bold");
        NAStoCHAlength.setStyle("-fx-font: 18 arial;");

        Label LAtoSTFlength = new Label();
        LAtoSTFlength.setText("6");
        LAtoSTFlength.setTextFill(Color.BLACK);
        LAtoSTFlength.setTranslateX(335);
        LAtoSTFlength.setTranslateY(390);
        LAtoSTFlength.setStyle("-fx-font-weight: bold");
        LAtoSTFlength.setStyle("-fx-font: 18 arial;");

        Label MONtoBOSlength = new Label();
        MONtoBOSlength.setText("2");
        MONtoBOSlength.setTextFill(Color.PURPLE);
        MONtoBOSlength.setTranslateX(1173);
        MONtoBOSlength.setTranslateY(152);
        MONtoBOSlength.setStyle("-fx-font-weight: bold");
        MONtoBOSlength.setStyle("-fx-font: 18 arial;");

        Label DENtoSLClength = new Label();
        DENtoSLClength.setText("5");
        DENtoSLClength.setTextFill(Color.RED);
        DENtoSLClength.setTranslateX(445);
        DENtoSLClength.setTranslateY(300);
        DENtoSLClength.setStyle("-fx-font-weight: bold");
        DENtoSLClength.setStyle("-fx-font: 18 arial;");

        Label PHEtoLAlength = new Label();
        PHEtoLAlength.setText("5");
        PHEtoLAlength.setTextFill(Color.BLUE);
        PHEtoLAlength.setTranslateX(260);
        PHEtoLAlength.setTranslateY(435);
        PHEtoLAlength.setStyle("-fx-font-weight: bold");
        PHEtoLAlength.setStyle("-fx-font: 18 arial;");

        Label RAEtoCHAlength = new Label();
        RAEtoCHAlength.setText("3");
        RAEtoCHAlength.setTextFill(Color.RED);
        RAEtoCHAlength.setTranslateX(1090);
        RAEtoCHAlength.setTranslateY(435);
        RAEtoCHAlength.setStyle("-fx-font-weight: bold");
        RAEtoCHAlength.setStyle("-fx-font: 18 arial;");

        Label WINtoDULlength = new Label();
        WINtoDULlength.setText("4");
        WINtoDULlength.setTextFill(Color.WHITE);
        WINtoDULlength.setTranslateX(720);
        WINtoDULlength.setTranslateY(100);
        WINtoDULlength.setStyle("-fx-font-weight: bold");
        WINtoDULlength.setStyle("-fx-font: 18 arial;");

        Label DULtoSTMlength = new Label();
        DULtoSTMlength.setText("4");
        DULtoSTMlength.setTextFill(Color.PURPLE);
        DULtoSTMlength.setTranslateX(855);
        DULtoSTMlength.setTranslateY(110);
        DULtoSTMlength.setStyle("-fx-font-weight: bold");
        DULtoSTMlength.setStyle("-fx-font: 18 arial;");

        Label STMtoMONlength = new Label();
        STMtoMONlength.setText("7");
        STMtoMONlength.setTextFill(Color.RED);
        STMtoMONlength.setTranslateX(1040);
        STMtoMONlength.setTranslateY(105);
        STMtoMONlength.setStyle("-fx-font-weight: bold");
        STMtoMONlength.setStyle("-fx-font: 18 arial;");

        Label TORtoMONlength = new Label();
        TORtoMONlength.setText("3");
        TORtoMONlength.setTextFill(Color.BLACK);
        TORtoMONlength.setTranslateX(1075);
        TORtoMONlength.setTranslateY(155);
        TORtoMONlength.setStyle("-fx-font-weight: bold");
        TORtoMONlength.setStyle("-fx-font: 18 arial;");

        Label KSCtoDENlength = new Label();
        KSCtoDENlength.setText("8");
        KSCtoDENlength.setTextFill(Color.GREY);
        KSCtoDENlength.setTranslateX(595);
        KSCtoDENlength.setTranslateY(325);
        KSCtoDENlength.setStyle("-fx-font-weight: bold");
        KSCtoDENlength.setStyle("-fx-font: 18 arial;");

        Label OKCtoSTFlength = new Label();
        OKCtoSTFlength.setText("4");
        OKCtoSTFlength.setTextFill(Color.RED);
        OKCtoSTFlength.setTranslateX(545);
        OKCtoSTFlength.setTranslateY(405);
        OKCtoSTFlength.setStyle("-fx-font-weight: bold");
        OKCtoSTFlength.setStyle("-fx-font: 18 arial;");

        Label NWOtoHOUlength = new Label();
        NWOtoHOUlength.setText("2");
        NWOtoHOUlength.setTextFill(Color.BLUE);
        NWOtoHOUlength.setTranslateX(800);
        NWOtoHOUlength.setTranslateY(570);
        NWOtoHOUlength.setStyle("-fx-font-weight: bold");
        NWOtoHOUlength.setStyle("-fx-font: 18 arial;");

        Label PHEtoELPlength = new Label();
        PHEtoELPlength.setText("3");
        PHEtoELPlength.setTextFill(Color.PURPLE);
        PHEtoELPlength.setTranslateX(385);
        PHEtoELPlength.setTranslateY(490);
        PHEtoELPlength.setStyle("-fx-font-weight: bold");
        PHEtoELPlength.setStyle("-fx-font: 18 arial;");

        Label HELtoBISlength = new Label();
        HELtoBISlength.setText("8");
        HELtoBISlength.setTextFill(Color.GREY);
        HELtoBISlength.setTranslateX(505);
        HELtoBISlength.setTranslateY(115);
        HELtoBISlength.setStyle("-fx-font-weight: bold");
        HELtoBISlength.setStyle("-fx-font: 18 arial;");

        Label BIStoWINlength = new Label();
        BIStoWINlength.setText("5");
        BIStoWINlength.setTextFill(Color.WHITE);
        BIStoWINlength.setTranslateX(635);
        BIStoWINlength.setTranslateY(100);
        BIStoWINlength.setStyle("-fx-font-weight: bold");
        BIStoWINlength.setStyle("-fx-font: 18 arial;");
      
      Label ELPtoDALlength = new Label();
        ELPtoDALlength.setText("4");
        ELPtoDALlength.setTextFill(Color.GREY);
        ELPtoDALlength.setTranslateX(543);
        ELPtoDALlength.setTranslateY(490);
        ELPtoDALlength.setStyle("-fx-font-weight: bold");
        ELPtoDALlength.setStyle("-fx-font: 18 arial;");
        //added new line

//</editor-fold>
//ROUTE LINES
//<editor-fold defaultstate="collapsed" desc="comment">
// each route will have a color as well
// Vancouver ---> Winnipeg & Grey
        Line VANtoWIN = new Line(205, 15, 640, 65); // x & y coordinates of each city
        VANtoWIN.setStroke(Color.GREY); // line color
        VANtoWIN.setStrokeWidth(3); // line width

        // Seattle ---> LA & Green
        Line SEAtoLA = new Line(189, 85, 185, 400);
        SEAtoLA.setStroke(Color.WHITE);
        SEAtoLA.setStrokeWidth(3);

        // Salt Lake City ---> Portland & Blue
        Line SLCtoPOR = new Line(355, 275, 175, 129);
        SLCtoPOR.setStroke(Color.BLUE);
        SLCtoPOR.setStrokeWidth(3);

        // Pheonix ---> Little Rock & Yellow
        Line PHEtoLR = new Line(345, 450, 762, 450);
        PHEtoLR.setStroke(Color.PURPLE);
        PHEtoLR.setStrokeWidth(3);

        // Denver ---> Bismarck & Black
        Line DENtoBIS = new Line(505, 330, 605, 148);
        DENtoBIS.setStroke(Color.BLACK);
        DENtoBIS.setStrokeWidth(3);

        // Okalahoma City ---> Duluth & Red
        Line OKCtoDUL = new Line(655, 422, 750, 155);
        OKCtoDUL.setStroke(Color.RED);
        OKCtoDUL.setStrokeWidth(3);

        // Seattle ---> Vancouver & Grey
        Line SEAtoVAN = new Line(185, 60, 185, 30);
        SEAtoVAN.setStroke(Color.GREY);
        SEAtoVAN.setStrokeWidth(3);

        // Seatle ---> Portland & Grey
        Line SEAtoPOR = new Line(180, 80, 175, 105);
        SEAtoPOR.setStroke(Color.GREY);
        SEAtoPOR.setStrokeWidth(3);

        // Helena ---> Los Angeles & Blue
        Line HELtoLA = new Line(370, 145, 190, 400);
        HELtoLA.setStroke(Color.BLUE);
        HELtoLA.setStrokeWidth(3);

        // Miami ---> Houston & Yellow
        Line MIAtoHOU = new Line(1080, 660, 730, 595);
        MIAtoHOU.setStroke(Color.PURPLE);
        MIAtoHOU.setStrokeWidth(3);

        // Boston ---> Raleigh & Green
        Line BOStoRAE = new Line(1210, 215, 1110, 385);
        BOStoRAE.setStroke(Color.WHITE);
        BOStoRAE.setStrokeWidth(3);

        // New York ---> Chicago & Black
        Line NYCtoCHI = new Line(1140, 238, 875, 260);
        NYCtoCHI.setStroke(Color.BLACK);
        NYCtoCHI.setStrokeWidth(3);

        // Sault St Marie ---> Dallas & Blue
        Line STMtoDAL = new Line(915, 145, 660, 500);
        STMtoDAL.setStroke(Color.BLUE);
        STMtoDAL.setStrokeWidth(3);

        // Dallas ---> Nashville & Grey
        Line DALtoNAS = new Line(680, 515, 880, 420);
        DALtoNAS.setStroke(Color.GREY);
        DALtoNAS.setStrokeWidth(3);

        // Nashville ---> Miami & Grey
        Line NAStoMIA = new Line(912, 430, 1085, 655);
        NAStoMIA.setStroke(Color.GREY);
        NAStoMIA.setStrokeWidth(3);

        // Miami ---> Charleston & Blue
        Line MIAtoCHA = new Line(1095, 650, 1060, 485);
        MIAtoCHA.setStroke(Color.BLUE);
        MIAtoCHA.setStrokeWidth(3);

        // Charleston ---> Washington DC & Yellow
        Line CHAtoDC = new Line(1055, 460, 1095, 335);
        CHAtoDC.setStroke(Color.PURPLE);
        CHAtoDC.setStrokeWidth(3);

        // Toronto ---> Chicago & Black
        Line TORtoCHI = new Line(1000, 195, 872, 255);
        TORtoCHI.setStroke(Color.BLACK);
        TORtoCHI.setStrokeWidth(3);

        // Chicago ---> St. Louis & Red
        Line CHItoSTL = new Line(850, 275, 815, 330);
        CHItoSTL.setStroke(Color.RED);
        CHItoSTL.setStrokeWidth(3);

        // St. Louis ---> Kansas City & Grey
        Line STLtoKSC = new Line(790, 340, 737, 340);
        STLtoKSC.setStroke(Color.GREY);
        STLtoKSC.setStrokeWidth(3);

        // Washington DC ---> Montreal & Green
        Line DCtoMON = new Line(1100, 310, 1125, 135);
        DCtoMON.setStroke(Color.WHITE);
        DCtoMON.setStrokeWidth(3);

        // New York ---> Little Rock & Green
        Line NYCtoLR = new Line(1142, 245, 785, 443);
        NYCtoLR.setStroke(Color.RED);
        NYCtoLR.setStrokeWidth(3);

        // Little Rock ---> New Orleans & Green
        Line LRtoNWO = new Line(772, 465, 830, 552);
        LRtoNWO.setStroke(Color.WHITE);
        LRtoNWO.setStrokeWidth(3);

        // Houston ---> El Paso & Yellow
        Line HOUtoELP = new Line(708, 575, 458, 510);
        HOUtoELP.setStroke(Color.RED);
        HOUtoELP.setStrokeWidth(3);

        // Nashville ---> Charleston & Black
        Line NAStoCHA = new Line(918, 415, 1041, 470);
        NAStoCHA.setStroke(Color.BLACK);
        NAStoCHA.setStrokeWidth(3);

        // Los Angeles ---> Santa Fe & Black
        Line LAtoSTF = new Line(197, 410, 450, 410);
        LAtoSTF.setStroke(Color.BLACK);
        LAtoSTF.setStrokeWidth(3);

        /* Got rid of this route as it caused a dead-end 
        // Santa Fe ---> Helena & Grey
        Line STFtoHEL = new Line(370, 400, 290, 144);
        STFtoHEL.setStroke(Color.GREY);
        STFtoHEL.setStrokeWidth(3);
         */
        // Montreal ---> Boston & Yellow
        Line MONtoBOS = new Line(1140, 135, 1195, 195);
        MONtoBOS.setStroke(Color.PURPLE);
        MONtoBOS.setStrokeWidth(3);

        // Denver ---> Salt Lake City & Red
        Line DENtoSLC = new Line(470, 340, 380, 292);
        DENtoSLC.setStroke(Color.RED);
        DENtoSLC.setStrokeWidth(3);

        // Phoenix ---> Los Angeles & Blue
        Line PHEtoLA = new Line(335, 450, 195, 420);
        PHEtoLA.setStroke(Color.BLUE);
        PHEtoLA.setStrokeWidth(3);

        // Raleigh ---> Charleston & Red
        Line RAEtoCHA = new Line(1095, 410, 1070, 475);
        RAEtoCHA.setStroke(Color.RED);
        RAEtoCHA.setStrokeWidth(3);

        // Winnipeg ---> Duluth & Green
        Line WINtoDUL = new Line(670, 70, 740, 140);
        WINtoDUL.setStroke(Color.WHITE);
        WINtoDUL.setStrokeWidth(3);

        // Duluth ---> Salt St. Marie & Red
        Line DULtoSTM = new Line(778, 140, 900, 130);
        DULtoSTM.setStroke(Color.PURPLE);
        DULtoSTM.setStrokeWidth(3);

        // Salt St. Marie ----> Montreal & Red
        Line STMtoMON = new Line(935, 130, 1110, 125);
        STMtoMON.setStroke(Color.RED);
        STMtoMON.setStrokeWidth(3);

        // Toronto ---> Montreal & Black
        Line TORtoMON = new Line(1035, 183, 1115, 129);
        TORtoMON.setStroke(Color.BLACK);
        TORtoMON.setStrokeWidth(3);

        // Kansas City ---> Denver & Grey
        Line KSCtoDEN = new Line(705, 345, 500, 345);
        KSCtoDEN.setStroke(Color.GREY);
        KSCtoDEN.setStrokeWidth(3);

        // Oklahoma City ---> Santa Fe & Red
        Line OKCtoSTF = new Line(625, 435, 480, 420);
        OKCtoSTF.setStroke(Color.RED);
        OKCtoSTF.setStrokeWidth(3);

        // New Orleans ---> Houston & Blue
        Line NWOtoHOU = new Line(825, 565, 740, 580);
        NWOtoHOU.setStroke(Color.BLUE);
        NWOtoHOU.setStrokeWidth(3);

        // Phoenix ---> El Paso & Yellow
        Line PHEtoELP = new Line(335, 465, 435, 510);
        PHEtoELP.setStroke(Color.PURPLE);
        PHEtoELP.setStrokeWidth(3);

        // Helena ---> Bismarck & Grey
        Line HELtoBIS = new Line(395, 135, 590, 135);
        HELtoBIS.setStroke(Color.GREY);
        HELtoBIS.setStrokeWidth(3);

        // Bismarck ---> Winnipeg & Green
        Line BIStoWIN = new Line(615, 130, 650, 75);
        BIStoWIN.setStroke(Color.WHITE);
        BIStoWIN.setStrokeWidth(3);
      
          //El Paso -----> Dallas & Grey
        Line ELPtoDAL = new Line(435,510,680,515);
        ELPtoDAL.setStroke(Color.GREY);
        ELPtoDAL.setStrokeWidth(3);
        

//</editor-fold>
//CREATE IMAGES
        // Set labels for each Train Card. Display them on the card
        Label blackCount = new Label();
        //Creating Image View for the Map
        ImageView selectedImage = new ImageView();
        //Load map image
        Image newImage = new Image(Display.class.getResourceAsStream("images/usazoom2c.jpg"));
        //set attributes
        selectedImage.setFitHeight(720);
        selectedImage.setFitWidth(1200);
        selectedImage.setImage(newImage);
        selectedImage.setTranslateX(90);

        //create boarder imaage
        ImageView BoarderImage = new ImageView();
        Image startBoarder = new Image(Display.class.getResourceAsStream("images/rules.jpg"));

        BoarderImage.setFitHeight(677);
        BoarderImage.setFitWidth(900);
        BoarderImage.setImage(startBoarder);

        // Second background image for ready player
        ImageView MakeMovePic = new ImageView();
        Image AreYouReady = new Image(Display.class.getResourceAsStream("images/LoadingCpu.JPG"));
        // changing attributes for the positioning 
        MakeMovePic.setFitHeight(720);
        MakeMovePic.setFitWidth(1100);
        MakeMovePic.setTranslateX(80);
        MakeMovePic.setImage(AreYouReady);

        //Outline for dest cards
        ImageView DestOutline = new ImageView();
        Image Outline = new Image(Display.class.getResourceAsStream("images/Outline.JPG"));
        //Changing Attributes for the positioning
        DestOutline.setFitHeight(150);
        DestOutline.setFitWidth(383);
        DestOutline.setTranslateX(90);
        DestOutline.setTranslateY(569);
        DestOutline.setImage(Outline);

        //ScoreBard
        ImageView scoreBoard = new ImageView();
        Image Score = new Image(Display.class.getResourceAsStream("images/scoreBoard.JPG"));
        //Changing Attributes
        scoreBoard.setFitHeight(280);
        scoreBoard.setFitWidth(180);
        scoreBoard.setTranslateX(1100);
        scoreBoard.setTranslateY(442);
        scoreBoard.setImage(Score);

        //IMAGES FOR TRAIN CARDS
        //<editor-fold defaultstate="collapsed" desc="comment">
        // Display each train card to the left side
        ImageView blackTrain = new ImageView();
        Image black = new Image(Display.class.getResourceAsStream("images/Black Traincard.png"));
        blackTrain.setImage(black);
        blackTrain.setFitWidth(90);
        blackTrain.setFitHeight(120);
        blackTrain.setTranslateY(600);

        ImageView blueTrain = new ImageView();
        Image blue = new Image(Display.class.getResourceAsStream("images/Blue traincard.png"));
        blueTrain.setImage(blue);
        blueTrain.setFitWidth(90);
        blueTrain.setFitHeight(120);
        blueTrain.setTranslateY(480);

        ImageView purpleTrain = new ImageView();
        Image purple = new Image(Display.class.getResourceAsStream("images/Purple Traincard.png"));
        purpleTrain.setImage(purple);
        purpleTrain.setFitWidth(90);
        purpleTrain.setFitHeight(120);
        purpleTrain.setTranslateY(360);

        ImageView redTrain = new ImageView();
        Image red = new Image(Display.class.getResourceAsStream("images/Red Traincard.png"));
        redTrain.setImage(red);
        redTrain.setFitWidth(90);
        redTrain.setFitHeight(120);
        redTrain.setTranslateY(240);

        ImageView whiteTrain = new ImageView();
        Image white = new Image(Display.class.getResourceAsStream("images/white train card.png"));
        whiteTrain.setImage(white);
        whiteTrain.setFitWidth(90);
        whiteTrain.setFitHeight(120);
        whiteTrain.setTranslateY(120);

        ImageView locoTrain = new ImageView();
        Image loco = new Image(Display.class.getResourceAsStream("images/Wildcard locomotive.png"));
        locoTrain.setImage(loco);
        locoTrain.setFitWidth(90);
        locoTrain.setFitHeight(120);
        locoTrain.setTranslateY(0);
        //</editor-fold>

        // Labels for how many of each train card the player has 
        //<editor-fold defaultstate="collapsed" desc="comment">
        // Set labels for each Train Card.
        // Display them on the corner of each card
        Label blackTrainCardcounter = new Label();
        blackTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Black"))); // text
        blackTrainCardcounter.setTextFill(Color.WHITE); // color
        blackTrainCardcounter.setTranslateX(57); // x coordinate
        blackTrainCardcounter.setTranslateY(600); // y coordinate
        blackTrainCardcounter.setStyle("-fx-font-weight: bold"); // makes text bold
        blackTrainCardcounter.setStyle("-fx-font: 30 arial;"); // text font and size
        game.setBlackTrainCardcounter(blackTrainCardcounter);

        Label blueTrainCardcounter = new Label();
        blueTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Blue"))); // text
        blueTrainCardcounter.setTextFill(Color.WHITE); // color
        blueTrainCardcounter.setTranslateX(57); // x coordinate
        blueTrainCardcounter.setTranslateY(480); // y coordinate
        blueTrainCardcounter.setStyle("-fx-font-weight: bold"); // makes text bold
        blueTrainCardcounter.setStyle("-fx-font: 30 arial;"); // text font and size
        game.setBlueTrainCardcounter(blueTrainCardcounter);

        Label purpleTrainCardcounter = new Label();
        purpleTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Purple"))); // text
        purpleTrainCardcounter.setTextFill(Color.WHITE); // color
        purpleTrainCardcounter.setTranslateX(57); // x coordinate
        purpleTrainCardcounter.setTranslateY(360); // y coordinate
        purpleTrainCardcounter.setStyle("-fx-font-weight: bold"); // makes text bold
        purpleTrainCardcounter.setStyle("-fx-font: 30 arial;"); // text font and size
        game.setPurpleTrainCardcounter(purpleTrainCardcounter);

        Label redTrainCardcounter = new Label();
        redTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Red"))); // text
        redTrainCardcounter.setTextFill(Color.WHITE); // color
        redTrainCardcounter.setTranslateX(57); // x coordinate
        redTrainCardcounter.setTranslateY(240); // y coordinate
        redTrainCardcounter.setStyle("-fx-font-weight: bold"); // makes text bold
        redTrainCardcounter.setStyle("-fx-font: 30 arial;"); // text font and size
        game.setRedTrainCardcounter(redTrainCardcounter);

        Label whiteTrainCardcounter = new Label();
        whiteTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("White"))); // text
        whiteTrainCardcounter.setTextFill(Color.BLACK); // color
        whiteTrainCardcounter.setTranslateX(57); // x coordinate
        whiteTrainCardcounter.setTranslateY(120); // y coordinate
        whiteTrainCardcounter.setStyle("-fx-font-weight: bold"); // makes text bold
        whiteTrainCardcounter.setStyle("-fx-font: 30 arial;"); // text font and size
        game.setWhiteTrainCardcounter(whiteTrainCardcounter);

        Label locoTrainCardcounter = new Label();
        locoTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Locomotive"))); // text
        locoTrainCardcounter.setTextFill(Color.WHITE); // color
        locoTrainCardcounter.setTranslateX(57); // x coordinate
        locoTrainCardcounter.setTranslateY(0); // y coordinate
        locoTrainCardcounter.setStyle("-fx-font-weight: bold"); // makes text bold
        locoTrainCardcounter.setStyle("-fx-font: 30 arial;"); // text font and size
        game.setLocoTrainCardcounter(locoTrainCardcounter);

//</editor-fold>
        //DEFINE SCENE 1
        StackPane root1 = new StackPane();
        Scene scene1 = new Scene(root1, 1280, 720);


        root1.getChildren().addAll(BoarderImage, p2);

        scene1.setRoot(root1);

        //Define SCENE 2
        Pane root2 = new Pane();
        Scene scene2 = new Scene(root2, 1280, 720);

        Pane cardInfo = new Pane();
        cardInfo.setTranslateX(140);
        cardInfo.setTranslateY(575);

        Label cardData = new Label("\t\t\t    Dest Cards:\n" + game.getUser().formatDestCards());
        cardData.setStyle("-fx-font-weight: bold"); // makes text bold
        cardData.setStyle("-fx-font: 15 Georgia;"); // text font and size

        cardInfo.getChildren().add(cardData);
        game.setCardData(cardData);
        

        Pane faceUpCards = new Pane();
        faceUpCards.setTranslateX(1120);
        faceUpCards.setTranslateY(580);

        Label faceUpText = new Label(game.formatFaceUpTrainCards());
        faceUpCards.getChildren().add(faceUpText);
        game.setFaceUp(faceUpText);

        faceUpText.setStyle("-fx-font-weight: bold"); // makes text bold
        faceUpText.setStyle("-fx-font: 18 Georgia;"); // text font and size

        Label playerNameDisplay = new Label("Player 1");

        playerNameDisplay.setTranslateX(1150); // x coordinate
        playerNameDisplay.setTranslateY(455); // y coordinate 
        playerNameDisplay.setStyle("-fx-font-weight: bold"); // makes text bold
        playerNameDisplay.setStyle("-fx-font: 20 Georgia;"); // text font and size

        game.setPlayerNameDisplay(playerNameDisplay);

        Label playerScore = new Label(Integer.toString(game.getUser().GetScore()));

        playerScore.setTranslateX(1132); // x coordinate
        playerScore.setTranslateY(505); // y coordinate 
        playerScore.setStyle("-fx-font-weight: bold"); // makes text bold
        playerScore.setStyle("-fx-font: 30 Impact;"); // text font and size

        game.setPlayerScore(playerScore);

        Label playerTrains = new Label(Integer.toString(game.getUser().GetTrainCars()));

        playerTrains.setTranslateX(1232); // x coordinate
        playerTrains.setTranslateY(505); // y coordinate 
        playerTrains.setStyle("-fx-font-weight: bold"); // makes text bold
        playerTrains.setStyle("-fx-font: 30 Impact;"); // text font and size

        game.setPlayerTrains(playerTrains);

        Label AImoveDisplay = new Label("No move yet");
        AImoveDisplay.setTranslateX(455);
        AImoveDisplay.setTranslateY(300);
        AImoveDisplay.setStyle("-fx-font-weight: bold"); // makes text bold
        AImoveDisplay.setStyle("-fx-font: 21 Georgia;"); // text font and size
        AImoveDisplay.setTextFill(Color.web("#ffffff"));

        game.setAImoveDisplay(AImoveDisplay);

        Label AIScore = new Label(Integer.toString(game.getAI().GetScore()));
        AIScore.setStyle("-fx-font-weight: bold"); // makes text bold
        AIScore.setStyle("-fx-font: 30 Impact;"); // text font and size
        AIScore.setTranslateX(743);
        AIScore.setTranslateY(84);
        AIScore.setTextFill(Color.web("#ffffff"));
        game.setAIScore(AIScore);

        Label AITrainCardNum = new Label(Integer.toString(game.getAI().GetTrainCards().size()));

        AITrainCardNum.setStyle("-fx-font-weight: bold"); // makes text bold
        AITrainCardNum.setStyle("-fx-font: 23 Impact;"); // text font and size
        AITrainCardNum.setTranslateX(740);
        AITrainCardNum.setTranslateY(143);
        AITrainCardNum.setTextFill(Color.web("#ffffff"));
        game.setAITrainCardNum(AITrainCardNum);

        Label AIDestCardNum = new Label(Integer.toString(game.getAI().GetDestCards().size()));

        AIDestCardNum.setStyle("-fx-font-weight: bold"); // makes text bold
        AIDestCardNum.setStyle("-fx-font: 23 Impact;"); // text font and size
        AIDestCardNum.setTranslateX(732);
        AIDestCardNum.setTranslateY(189);
        AIDestCardNum.setTextFill(Color.web("#ffffff"));

        game.setAIDestCardNum(AIDestCardNum);

        root2.getChildren().addAll(
                
                // map image and each train card image 
                selectedImage, blackTrain, blueTrain, redTrain,
                purpleTrain, whiteTrain, locoTrain, DestOutline, scoreBoard,
                
                
                // route lines
                VANtoWIN,SEAtoLA, SLCtoPOR, PHEtoLR, DENtoBIS, OKCtoDUL, SEAtoVAN,
                SEAtoPOR, HELtoLA, MIAtoHOU,BOStoRAE, NYCtoCHI, STMtoDAL,
                DALtoNAS, NAStoMIA, MIAtoCHA, CHAtoDC, TORtoCHI, CHItoSTL, 
                STLtoKSC, DCtoMON, NYCtoLR, LRtoNWO, HOUtoELP, NAStoCHA, 
                LAtoSTF, MONtoBOS, DENtoSLC, PHEtoLA, RAEtoCHA, WINtoDUL, DULtoSTM,
                STMtoMON, TORtoMON, KSCtoDEN, OKCtoSTF, NWOtoHOU, PHEtoELP, HELtoBIS,
                BIStoWIN,ELPtoDAL,
                
                // city buttons
                LA, SEA, VAN, WIN, SLC, POR, PHE, LR, DEN, OKC, DUL, HEL, MIA, HOU,
                BOS, RAE, NYC, CHI, STM, DAL, NAS, CHA, DC, TOR, STL, KSC, NWO,
                ELP, STF, MON, BIS,
                
                
                //end Game button
                pauseScreen,
                
                
                
                // route length labels 
                VANtoWINlength, SEAtoLAlength, SLCtoPORlength, PHEtoLRlength,
                OKCtoDULlength, SEAtoVANlength, SEAtoPORlength, HELtoLAlength,
                MIAtoHOUlength, BOStoRAElength, NYCtoCHIlength, STMtoDALlength,
                DALtoNASlength, NAStoMIAlength, MIAtoCHAlength, CHAtoDClength,
                TORtoCHIlength, CHItoSTLlength, STLtoKSClength, DCtoMONlength,
                NYCtoLRlength, LRtoNWOlength, HOUtoELPlength, NAStoCHAlength,
                LAtoSTFlength, MONtoBOSlength, DENtoSLClength, PHEtoLAlength,
                RAEtoCHAlength, WINtoDULlength, DULtoSTMlength, STMtoMONlength,
                TORtoMONlength, KSCtoDENlength, OKCtoSTFlength, NWOtoHOUlength,
                PHEtoELPlength, HELtoBISlength, BIStoWINlength, DENtoBISlength,ELPtoDALlength,
                
                
                //Scene Updates - // # of each train card labels
                cardInfo, faceUpCards, playerScore, playerTrains, playerNameDisplay,
                blackTrainCardcounter, blueTrainCardcounter, purpleTrainCardcounter,
                redTrainCardcounter, whiteTrainCardcounter, locoTrainCardcounter
        );

        //DEFINE SCENE Transition
        Pane root3 = new Pane();
        Scene transition = new Scene(root3, 1280, 720);
        this.transition = transition; // need to use this.transition for the event handler classes

        root3.getChildren().addAll(MakeMovePic, ready, AImoveDisplay, AIScore, AITrainCardNum, AIDestCardNum);

        primaryStage.setTitle("Ticket To Ride Game");
        primaryStage.setScene(scene1);
        primaryStage.show();

//handler for 2 players
        p2.setOnAction(e -> {
            primaryStage.setScene(transition);
        });
       
        resumeGame.setOnAction(e -> { //MR
        //opts.close();
        });

        
        primaryStage.setOnCloseRequest(e-> Platform.exit());
        
        pauseScreen.setOnAction(e -> {  //MR

           
            Player p = game.calcWinner();
            int score1 =game.getUser().GetScore();
            int score2 =game.getAI().GetScore();

            
            if(Options.opts(score1,score2,p)){
                primaryStage.close();
                System.exit(0);
            }
            
            
        });
        ready.setOnAction(e -> {
            if(game.isGameOver()){
                Player winner = game.calcWinner();
                EndGame.endGame(game.getUser().GetScore(),game.getAI().GetScore(), winner);
                System.exit(0);
            }
            primaryStage.setScene(scene2);
            String temp = MakeMove.MakeMove();
            if (temp.equals("DrawTrain")) {
                temp = MakeMove.TrainCard();
                if (temp.equals("one")) {
                    game.drawTrainCard(game.getUser(), 2);
                } else if (temp.equals("two")) {
                    temp = MakeMove.OneFaceUp();
                    if (!game.drawOneFaceUpTrainCard(game.getUser(), temp)) {

                        InvalidMove.NoSuchTrainCard(temp);
                        primaryStage.setScene(transition);
                        return;
                    } else {
                        game.drawTrainCard(game.getUser(), 1);

                    }
                } else if (temp.equals("three")) {
                    temp = MakeMove.OneFaceUp();
                 
                    String temp1 = MakeMove.OneFaceUp();
         
                    if (!game.drawTwoFaceUpTrainCard(game.getUser(), temp, temp1)) {
                        InvalidMove.NoSuchTrainCard(temp);
                        primaryStage.setScene(transition);
                        return;
                    }
                }

                //the value in decision is the decision the AI makes, the code below is to process that decision
                            int decision = game.getAI().CPUMakeMove(game.getUser().GetScore(), game.getFaceUpCards());
                            System.out.println(decision);
                            switch (decision) {
                                // if returned one, AI has chosen to claim a route. 
                                case 1:
                                    // Get Dest Card the AI is using
                                    DestCard desttemp = game.getAI().findBestRoute();
                                    if (desttemp.getRoutecolor().equals("Grey")) {
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                game.getAI().removeTrainCard(t);
                                                break;
                                            }
                                        }
                                    } else {
                                        //Here the train cards with the appropriate color will be taking out
                                        //of their deck
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                if (t.getColor().equals(desttemp.getRoutecolor()) || t.getColor().equals("Locomotive")) {
                                                    game.getAI().removeTrainCard(t);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    game.getAI().subTraincars(desttemp.getLength()); //edit the players train cars
                                    game.getAI().removeDestCard(desttemp); //remove the card
                                    destCount = 0; //reset the destination counter
                                    game.setAImoveDisplayText("CPU has claimed a route!");
                                    break;

                                case 2:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");
                                    break;

                                case 3:
                                    game.drawDestCard(game.getAI());
                                    game.setAImoveDisplayText("CPU has drawn one destination card");
                                    break;

                                case 5:
                                    // 2 face up Locomotive Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 6:
                                    // 2 face up, 1 Locomotive, 1 red
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 7:
                                    // 2 face up, 1 Locomotive, 1 blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 8:
                                    // 2 face up, 1 Locomotive, 1 white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 9:
                                    // 2 face up, 1 Locomotive, 1 black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 10:
                                    // 2 face up, 1 Locomotive, 1 purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 11:
                                    // 2 face up red Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Red", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 12:
                                    // 2 face up card blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Blue", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 13:
                                    // 2 face up card white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "White", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 14:
                                    // 2 2 face up card black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Black", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 15:
                                    // 2 face up card purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Purple", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 16:
                                    // draw one face down
                                    // draw one face up Locomotive
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 17:
                                    // draw one face down
                                    // draw one face up red
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Red");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 18:
                                    // draw one face down
                                    // draw one face up blue
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Blue");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 19:
                                    // draw one face down
                                    // draw one face up white
                                    game.drawOneFaceUpTrainCard(game.getAI(), "White");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 20:
                                    // draw one face down
                                    // draw one face up black
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Black");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 21:
                                    // draw one face down
                                    // draw one face up purple
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Purple");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                default:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");

                            }
                refresh(game.getCardData(), game.getFaceUpCardLabel(), game.getBlackTrainCardcounter(),
                        game.getBlueTrainCardcounter(), game.getWhiteTrainCardcounter(),
                        game.getPurpleTrainCardcounter(), game.getRedTrainCardcounter(),
                        game.getLocoTrainCardcounter(), game.getPlayerNameDisplay(), game.getPlayerScore(),
                        game.getPlayerTrains(), game.getReady(), game.getAIScore(), game.getAImoveDisplay(),
                        game.getAITrainCardNum(), game.getAIDestCardNum());
                primaryStage.setScene(transition);
            } else if (temp.equals("DrawDest")) {
                game.drawDestCard(game.getUser());

                //the value in decision is the decision the AI makes, the code below is to process that decision
                            int decision = game.getAI().CPUMakeMove(game.getUser().GetScore(), game.getFaceUpCards());
                            System.out.println(decision);
                            switch (decision) {
                                // if returned one, AI has chosen to claim a route. 
                                case 1:
                                    // Get Dest Card the AI is using
                                    DestCard desttemp = game.getAI().findBestRoute();
                                    if (desttemp.getRoutecolor().equals("Grey")) {
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                game.getAI().removeTrainCard(t);
                                                break;
                                            }
                                        }
                                    } else {
                                        //Here the train cards with the appropriate color will be taking out
                                        //of their deck
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                if (t.getColor().equals(desttemp.getRoutecolor()) || t.getColor().equals("Locomotive")) {
                                                    game.getAI().removeTrainCard(t);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    game.getAI().subTraincars(desttemp.getLength()); //edit the players train cars
                                    game.getAI().removeDestCard(desttemp); //remove the card
                                    destCount = 0; //reset the destination counter
                                    game.setAImoveDisplayText("CPU has claimed a route!");
                                    break;

                                case 2:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");
                                    break;

                                case 3:
                                    game.drawDestCard(game.getAI());
                                    game.setAImoveDisplayText("CPU has drawn one destination card");
                                    break;

                                case 5:
                                    // 2 face up Locomotive Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 6:
                                    // 2 face up, 1 Locomotive, 1 red
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 7:
                                    // 2 face up, 1 Locomotive, 1 blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 8:
                                    // 2 face up, 1 Locomotive, 1 white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 9:
                                    // 2 face up, 1 Locomotive, 1 black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 10:
                                    // 2 face up, 1 Locomotive, 1 purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 11:
                                    // 2 face up red Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Red", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 12:
                                    // 2 face up card blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Blue", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 13:
                                    // 2 face up card white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "White", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 14:
                                    // 2 2 face up card black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Black", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 15:
                                    // 2 face up card purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Purple", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 16:
                                    // draw one face down
                                    // draw one face up Locomotive
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 17:
                                    // draw one face down
                                    // draw one face up red
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Red");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 18:
                                    // draw one face down
                                    // draw one face up blue
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Blue");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 19:
                                    // draw one face down
                                    // draw one face up white
                                    game.drawOneFaceUpTrainCard(game.getAI(), "White");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 20:
                                    // draw one face down
                                    // draw one face up black
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Black");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 21:
                                    // draw one face down
                                    // draw one face up purple
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Purple");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                default:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");

                            }

                refresh(game.getCardData(), game.getFaceUpCardLabel(), game.getBlackTrainCardcounter(),
                        game.getBlueTrainCardcounter(), game.getWhiteTrainCardcounter(),
                        game.getPurpleTrainCardcounter(), game.getRedTrainCardcounter(),
                        game.getLocoTrainCardcounter(), game.getPlayerNameDisplay(), game.getPlayerScore(),
                        game.getPlayerTrains(), game.getReady(), game.getAIScore(), game.getAImoveDisplay(),
                        game.getAITrainCardNum(), game.getAIDestCardNum());
                primaryStage.setScene(transition);
            } else if (temp.equals("Claim")) {
                //Do nothing, let them choose the locations
            }
        });

        // Four routes to both LA and MON
        LA.setOnAction(new FourRouteButtonHandler(LA, SEA, STF, HEL, PHE));
        MON.setOnAction(new FourRouteButtonHandler(MON, BOS, DC, TOR, STM));

        // Three routes Handlers
        SEA.setOnAction(new ThreeRouteButtonHandler(SEA, LA, POR, VAN));
        HOU.setOnAction(new ThreeRouteButtonHandler(HOU, NWO, ELP, MIA));
        PHE.setOnAction(new ThreeRouteButtonHandler(PHE, LA, LR, ELP));
        DEN.setOnAction(new ThreeRouteButtonHandler(DEN, SLC, BIS, KSC));
        WIN.setOnAction(new ThreeRouteButtonHandler(WIN, VAN, DUL, BIS));
        LR.setOnAction(new ThreeRouteButtonHandler(LR, NWO, PHE, NYC));
        NAS.setOnAction(new ThreeRouteButtonHandler(NAS, DAL, CHA, MIA));
        CHI.setOnAction(new ThreeRouteButtonHandler(CHI, STL, TOR, NYC));
        STM.setOnAction(new ThreeRouteButtonHandler(STM, DUL, DAL, MON));
        MIA.setOnAction(new ThreeRouteButtonHandler(MIA, HOU, CHA, NAS));
        CHA.setOnAction(new ThreeRouteButtonHandler(CHA, MIA, RAE, NAS));
        ELP.setOnAction(new ThreeRouteButtonHandler(ELP, PHE, HOU, DAL));
        DAL.setOnAction(new ThreeRouteButtonHandler(DAL, STM, NAS, ELP));
        DUL.setOnAction(new ThreeRouteButtonHandler(DUL, OKC, WIN, STM));
        BIS.setOnAction(new ThreeRouteButtonHandler(BIS, DEN, HEL, WIN));
        
        // Two routes Handlers
        VAN.setOnAction(new TwoRouteButtonHandler(VAN, SEA, WIN));
        POR.setOnAction(new TwoRouteButtonHandler(POR, SEA, SLC));
        SLC.setOnAction(new TwoRouteButtonHandler(SLC, DEN, POR));
        HEL.setOnAction(new TwoRouteButtonHandler(HEL, LA, BIS));
        STF.setOnAction(new TwoRouteButtonHandler(STF, OKC, LA));
        OKC.setOnAction(new TwoRouteButtonHandler(OKC, STF, DUL));
        KSC.setOnAction(new TwoRouteButtonHandler(KSC, DEN, STL));
        NWO.setOnAction(new TwoRouteButtonHandler(NWO, HOU, LR));
        STL.setOnAction(new TwoRouteButtonHandler(STL, KSC, CHI));
        RAE.setOnAction(new TwoRouteButtonHandler(RAE, CHA, BOS));
        DC.setOnAction(new TwoRouteButtonHandler(DC, CHA, MON));
        NYC.setOnAction(new TwoRouteButtonHandler(NYC, CHI, LR));
        BOS.setOnAction(new TwoRouteButtonHandler(BOS, RAE, MON));
        TOR.setOnAction(new TwoRouteButtonHandler(TOR, MON, CHI));

        // Three routes to SEA, PHE, DEN, BIS, WIN, HOU, DUL, LR, NAS, CHI, STM, MIA, CHA
        // Two routes to POR, VAN, SLC, HEL, ELP, STF, DAL, OKC, KSC, NWO, STL, RAE, 
        //               DC, NYC, BOS, TOR, 
    }

    // class to handle cities that have four routes connected to them
    class FourRouteButtonHandler implements EventHandler<ActionEvent> {

        // temp1 will be the city that has 4 routes connected to it
        // rest of temp buttons are connected cities to the original city
        Button temp1 = new Button();
        Button temp2 = new Button();
        Button temp3 = new Button();
        Button temp4 = new Button();
        Button temp5 = new Button();

        // constructor setting the cities
        FourRouteButtonHandler(Button temp1, Button temp2, Button temp3, Button temp4,
                Button temp5) {
            this.temp1 = temp1;
            this.temp2 = temp2;
            this.temp3 = temp3;
            this.temp4 = temp4;
            this.temp5 = temp5;

        }

        // override the handle method for the event handler
        @Override
        public void handle(ActionEvent event) {
            //check if this is the first destination they click
            if (destCount == 0) {
                game.setDestOne(temp1.getText()); //set the destone in game to the buttons text
                System.out.println(temp1.getText());
                destCount++; //increment the destination coutner for the 2nd destination
            } //check if this is the second desitnation they click
            else if (destCount == 1) {
                game.setDestTwo(temp1.getText()); //set the second destination to the button text
                System.out.println(temp1.getText());

                //1st Condition: If the destination is not a route
                if (!(game.getDestOne().equals(temp2.getText())
                        || //check all nieghboring destinations
                        game.getDestOne().equals(temp3.getText())
                        || game.getDestOne().equals(temp4.getText())
                        || game.getDestOne().equals(temp5.getText()))) {

                    InvalidMove.Route();
                    destCount = 0;
                    stage.setScene(transition);
                    return;
                } else {   //passed 1st condition
                    //loop though the players destination card deck

                    //set counter to determine if alerts should execute
                    int loopcounter = 0;
                    int size = game.getUser().GetDestCards().size();
                    for (DestCard d : game.getUser().GetDestCards()) {
                        loopcounter++;
                        //2nd CONDITION: Test if none of their dest cards match with the route they picked
                        if (!(d.toString().equals(game.getDestOne() + " " + game.getDestTwo()) //<- test the first combination of destinations
                                || d.toString().equals(game.getDestTwo() + " " + game.getDestOne()))) {//<- test the second combination
                            if (loopcounter == size) {
                                InvalidMove.DestCard();
                                destCount = 0;
                                stage.setScene(transition);
                                return;
                            }
                        } else //passed 2nd condition
                        //3rd CONDITION: Testing the length of the route with the amount of Train cards the player has
                        if (!(d.getLength() <= (game.getUser(). //!(length < TrainCard(color)+TrainCard(Locomotive))|| color=grey
                                getAmountTrainCardColor(d.getRoutecolor())
                                + (game.getUser().getAmountTrainCardColor("Locomotive")))
                                || d.getRoutecolor().equals("Grey"))) {

                            InvalidMove.TrainCards();
                            destCount = 0;
                            stage.setScene(transition);
                            return;
                        } else //passed 3rd condition
                        //Grey SUB-CONDITIONS: Making sure they player has enough train cards for the length of the grey route
                        if (d.getRoutecolor().equals("GREY")) {
                            if (d.getLength() > (game.getUser().GetTrainCards().size())) { //route length > all of players train cards

                                InvalidMove.TrainCards();
                                destCount = 0;
                                stage.setScene(transition);
                                return;
                            }
                        } //4th CONDITION: Test if the player does not have enough Train cars
                        else if (!(d.getLength() < game.getUser().GetTrainCars())) {//compare the length of the route with the amount of train cars

                            InvalidMove.TrainCars();
                            destCount = 0;
                            stage.setScene(transition);
                            return;
                        } else {

                            String[] tempStr = new String[d.getLength()]; //create string array to hold the multiple train cards
                            if (d.getRoutecolor().equals("Grey")) {
                                // This logic is so they can choose which
                                // colors train cards for the grey routes

                                //loop through the length of the route
                                for (int i = 0; i < d.getLength(); i++) {
                                    tempStr[i] = MakeMove.chooseTrainCards(i); //store each color in array

                                    if (!game.getUser().hasTrainCard(tempStr[i])) { //player does not have the proper train card

                                        for (int j = 1; j < tempStr.length; j++) { //add the train cards back into deck
                                            game.getUser().AddToTrainDeck(new TrainCard(tempStr[j]));
                                        }
                                        InvalidMove.TrainCars();
                                        destCount = 0;
                                        stage.setScene(transition);
                                        return;
                                    } else { //remove the card from their deck
                                        game.getUser().removeTrainCard(game.getUser().getTrainCard(tempStr[i]));
                                    }
                                }
                            } //If they have Locomotive, then ask if the user would like use them
                            else if (game.getUser().hasTrainCard("Locomotive")) {

                                if (MakeMove.hasLocomotive()) {
                                    //loop through the length of the route
                                    for (int i = 0; i < d.getLength(); i++) {
                                        tempStr[i] = MakeMove.chooseTwoOptionTrainCards(i, "Locomotive", d.getRoutecolor()); //store each color in array

                                        if (!game.getUser().hasTrainCard(tempStr[i])) { //player does not have the proper train card

                                            for (int j = 1; j < tempStr.length; j++) { //add the train cards back into deck
                                                game.getUser().AddToTrainDeck(new TrainCard(tempStr[j]));

                                            }
                                            InvalidMove.TrainCards();

                                            destCount = 0;
                                            stage.setScene(transition);

                                            return;
                                        } else { //remove the card from their deck
                                            game.getUser().removeTrainCard(game.getUser().getTrainCard(tempStr[i]));

                                        }
                                    }
                                } else {
                                    //Here the train cards with the appropriate color will be taking out
                                    //of their deck
                                    for (int i = 0; i < d.getLength(); i++) {
                                        if (!(game.getUser().GetTrainCards().remove(game.getUser().getTrainCard(d.getRoutecolor())))) {
                                            for (int j = 0; j < i; j++) {
                                                game.getUser().AddToTrainDeck(new TrainCard(d.getRoutecolor()));
                                            }
                                            InvalidMove.TrainCards();

                                            destCount = 0;
                                            stage.setScene(transition);

                                            return;
                                        }
                                        game.getUser().DecrementTrainCardDeck();
                                    }
                                }
                            } //
                            else {
                                //Here the train cards with the appropriate color will be taking out
                                //of their deck
                                for (int i = 0; i < d.getLength(); i++) { //loop through the legnth of the route
                                    if (!(game.getUser().GetTrainCards().remove(game.getUser().getTrainCard(d.getRoutecolor())))) {
                                        for (int j = 0; j < i; j++) {
                                            game.getUser().AddToTrainDeck(new TrainCard(d.getRoutecolor()));
                                        }
                                    }
                                    game.getUser().DecrementTrainCardDeck();
                                }
                            }

                            //If and only if we get to this point, is the move offically valid
                            game.getUser().subTraincars(d.getLength()); //edit the players train cars
                            game.getUser().removeDestCard(d); //remove the card

                            //the value in decision is the decision the AI makes, the code below is to process that decision
                            //the value in decision is the decision the AI makes, the code below is to process that decision
                            int decision = game.getAI().CPUMakeMove(game.getUser().GetScore(), game.getFaceUpCards());
                            System.out.println(decision);
                            switch (decision) {
                                // if returned one, AI has chosen to claim a route. 
                                case 1:
                                    // Get Dest Card the AI is using
                                    DestCard desttemp = game.getAI().findBestRoute();
                                    if (desttemp.getRoutecolor().equals("Grey")) {
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                game.getAI().removeTrainCard(t);
                                                break;
                                            }
                                        }
                                    } else {
                                        //Here the train cards with the appropriate color will be taking out
                                        //of their deck
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                if (t.getColor().equals(desttemp.getRoutecolor()) || t.getColor().equals("Locomotive")) {
                                                    game.getAI().removeTrainCard(t);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    game.getAI().subTraincars(desttemp.getLength()); //edit the players train cars
                                    game.getAI().removeDestCard(desttemp); //remove the card
                                    destCount = 0; //reset the destination counter
                                    game.setAImoveDisplayText("CPU has claimed a route!");
                                    break;

                                case 2:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");
                                    break;

                                case 3:
                                    game.drawDestCard(game.getAI());
                                    game.setAImoveDisplayText("CPU has drawn one destination card");
                                    break;

                                case 5:
                                    // 2 face up Locomotive Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 6:
                                    // 2 face up, 1 Locomotive, 1 red
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 7:
                                    // 2 face up, 1 Locomotive, 1 blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 8:
                                    // 2 face up, 1 Locomotive, 1 white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 9:
                                    // 2 face up, 1 Locomotive, 1 black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 10:
                                    // 2 face up, 1 Locomotive, 1 purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 11:
                                    // 2 face up red Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Red", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 12:
                                    // 2 face up card blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Blue", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 13:
                                    // 2 face up card white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "White", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 14:
                                    // 2 2 face up card black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Black", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 15:
                                    // 2 face up card purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Purple", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 16:
                                    // draw one face down
                                    // draw one face up Locomotive
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 17:
                                    // draw one face down
                                    // draw one face up red
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Red");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 18:
                                    // draw one face down
                                    // draw one face up blue
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Blue");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 19:
                                    // draw one face down
                                    // draw one face up white
                                    game.drawOneFaceUpTrainCard(game.getAI(), "White");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 20:
                                    // draw one face down
                                    // draw one face up black
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Black");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 21:
                                    // draw one face down
                                    // draw one face up purple
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Purple");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                default:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");

                            }
                            destCount = 0; //reset the destination counter

                            //refresh the game
                            refresh(game.getCardData(), game.getFaceUpCardLabel(), game.getBlackTrainCardcounter(),
                                    game.getBlueTrainCardcounter(), game.getWhiteTrainCardcounter(),
                                    game.getPurpleTrainCardcounter(), game.getRedTrainCardcounter(),
                                    game.getLocoTrainCardcounter(), game.getPlayerNameDisplay(), game.getPlayerScore(),
                                    game.getPlayerTrains(), game.getReady(), game.getAIScore(), game.getAImoveDisplay(),
                                    game.getAITrainCardNum(), game.getAIDestCardNum());
                            stage.setScene(transition);
                            return;
                        }
                    }
                }
            }
        }
    }

    // class to handle cities that have three routes connected to them
    class ThreeRouteButtonHandler implements EventHandler<ActionEvent> {

        // temp1 will be the city that has 4 routes connected to it
        // rest of temp buttons are connected cities to the original city
        Button temp1 = new Button();
        Button temp2 = new Button();
        Button temp3 = new Button();
        Button temp4 = new Button();

        // constructor setting the cities
        ThreeRouteButtonHandler(Button temp1, Button temp2, Button temp3, Button temp4) {
            this.temp1 = temp1;
            this.temp2 = temp2;
            this.temp3 = temp3;
            this.temp4 = temp4;

        }

        // override the handle method for the event handler
        @Override
        public void handle(ActionEvent event) {
            //check if this is the first destination they click
            if (destCount == 0) {
                game.setDestOne(temp1.getText()); //set the destone in game to the buttons text
                destCount++; //increment the destination coutner for the 2nd destination
            } //check if this is the second desitnation they click
            else if (destCount == 1) {
                game.setDestTwo(temp1.getText()); //set the second destination to the button text

                //1st Condition: If the destination is not a route
                if (!(game.getDestOne().equals(temp2.getText())
                        || //check all nieghboring destinations
                        game.getDestOne().equals(temp3.getText())
                        || game.getDestOne().equals(temp4.getText()))) {

                    InvalidMove.Route();
                    destCount = 0;
                    stage.setScene(transition);
                    return;
                } else {   //passed 1st condition
                    //loop though the players destination card deck

                    //set counter to determine if alerts should execute
                    int loopcounter = 0;
                    int size = game.getUser().GetDestCards().size();
                    for (DestCard d : game.getUser().GetDestCards()) {
                        loopcounter++;
                        //2nd CONDITION: Test if none of their dest cards match with the route they picked
                        if (!(d.toString().equals(game.getDestOne() + " " + game.getDestTwo()) //<- test the first combination of destinations
                                || d.toString().equals(game.getDestTwo() + " " + game.getDestOne()))) {//<- test the second combination
                            if (loopcounter == size) {
                                InvalidMove.DestCard();
                                destCount = 0;
                                stage.setScene(transition);
                                return;
                            }
                        } else //passed 2nd condition
                        //3rd CONDITION: Testing the length of the route with the amount of Train cards the player has
                        if (!(d.getLength() <= (game.getUser(). //!(length < TrainCard(color)+TrainCard(Locomotive))|| color=grey
                                getAmountTrainCardColor(d.getRoutecolor())
                                + (game.getUser().getAmountTrainCardColor("Locomotive")))
                                || d.getRoutecolor().equals("Grey"))) {

                            InvalidMove.TrainCards();
                            destCount = 0;
                            stage.setScene(transition);
                            return;
                        } else //passed 3rd condition
                        //Grey SUB-CONDITIONS: Making sure they player has enough train cards for the length of the grey route
                        if (d.getRoutecolor().equals("GREY")) {
                            if (d.getLength() > (game.getUser().GetTrainCards().size())) { //route length > all of players train cards

                                InvalidMove.TrainCards();
                                destCount = 0;
                                stage.setScene(transition);
                                return;
                            }
                        } //4th CONDITION: Test if the player does not have enough Train cars
                        else if (!(d.getLength() < game.getUser().GetTrainCars())) {//compare the length of the route with the amount of train cars

                            InvalidMove.TrainCars();
                            destCount = 0;
                            stage.setScene(transition);
                            return;
                        } else {

                            String[] tempStr = new String[d.getLength()]; //create string array to hold the multiple train cards

                            if (d.getRoutecolor().equals("Grey")) {
                                // This logic is so they can choose which
                                // colors train cards for the grey routes

                                //loop through the length of the route
                                for (int i = 0; i < d.getLength(); i++) {
                                    tempStr[i] = MakeMove.chooseTrainCards(i); //store each color in array

                                    if (!game.getUser().hasTrainCard(tempStr[i])) { //player does not have the proper train card

                                        for (int j = 1; j < tempStr.length; j++) { //add the train cards back into deck
                                            game.getUser().AddToTrainDeck(new TrainCard(tempStr[j]));
                                        }
                                        InvalidMove.TrainCars();
                                        destCount = 0;
                                        stage.setScene(transition);
                                        return;

                                    } else { //remove the card from their deck
                                        game.getUser().removeTrainCard(game.getUser().getTrainCard(tempStr[i]));
                                    }
                                }
                            } //If they have Locomotive, then ask if the user would like use them
                            else if (game.getUser().hasTrainCard("Locomotive")) {

                                if (MakeMove.hasLocomotive()) {
                                    //loop through the length of the route
                                    for (int i = 0; i < d.getLength(); i++) {
                                        tempStr[i] = MakeMove.chooseTwoOptionTrainCards(i, "Locomotive", d.getRoutecolor()); //store each color in array

                                        if (!game.getUser().hasTrainCard(tempStr[i])) { //player does not have the proper train card

                                            for (int j = 1; j < tempStr.length; j++) { //add the train cards back into deck
                                                game.getUser().AddToTrainDeck(new TrainCard(tempStr[j]));

                                            }
                                            InvalidMove.TrainCards();

                                            destCount = 0;
                                            stage.setScene(transition);

                                            return;

                                        } else { //remove the card from their deck
                                            game.getUser().removeTrainCard(game.getUser().getTrainCard(tempStr[i]));

                                        }
                                    }
                                } else {
                                    //Here the train cards with the appropriate color will be taking out
                                    //of their deck
                                    for (int i = 0; i < d.getLength(); i++) {
                                        if (!(game.getUser().GetTrainCards().remove(game.getUser().getTrainCard(d.getRoutecolor())))) {
                                            for (int j = 0; j < i; j++) {
                                                game.getUser().AddToTrainDeck(new TrainCard(d.getRoutecolor()));
                                            }
                                            InvalidMove.TrainCards();

                                            destCount = 0;
                                            stage.setScene(transition);

                                            return;
                                        }
                                        game.getUser().DecrementTrainCardDeck();
                                    }
                                }
                            } //
                            else {
                                //Here the train cards with the appropriate color will be taking out
                                //of their deck

                                for (int i = 0; i < d.getLength(); i++) { //loop through the legnth of the route
                                    if (!(game.getUser().GetTrainCards().remove(game.getUser().getTrainCard(d.getRoutecolor())))) {
                                        for (int j = 0; j < i; j++) {

                                            game.getUser().AddToTrainDeck(new TrainCard(d.getRoutecolor()));
                                        }
                                    }
                                    game.getUser().DecrementTrainCardDeck();
                                }
                            }

                            //If and only if we get to this point, is the move offically valid
                            game.getUser().subTraincars(d.getLength()); //edit the players train cars
                            game.getUser().removeDestCard(d); //remove the card

                            //the value in decision is the decision the AI makes, the code below is to process that decision
                            int decision = game.getAI().CPUMakeMove(game.getUser().GetScore(), game.getFaceUpCards());
                            System.out.println(decision);
                            switch (decision) {
                                // if returned one, AI has chosen to claim a route. 
                                case 1:
                                    // Get Dest Card the AI is using
                                    DestCard desttemp = game.getAI().findBestRoute();
                                    if (desttemp.getRoutecolor().equals("Grey")) {
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                game.getAI().removeTrainCard(t);
                                                break;
                                            }
                                        }
                                    } else {
                                        //Here the train cards with the appropriate color will be taking out
                                        //of their deck
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                if (t.getColor().equals(desttemp.getRoutecolor()) || t.getColor().equals("Locomotive")) {
                                                    game.getAI().removeTrainCard(t);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    game.getAI().subTraincars(desttemp.getLength()); //edit the players train cars
                                    game.getAI().removeDestCard(desttemp); //remove the card
                                    destCount = 0; //reset the destination counter
                                    game.setAImoveDisplayText("CPU has claimed a route!");
                                    break;

                                case 2:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");
                                    break;

                                case 3:
                                    game.drawDestCard(game.getAI());
                                    game.setAImoveDisplayText("CPU has drawn one destination card");
                                    break;

                                case 5:
                                    // 2 face up Locomotive Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 6:
                                    // 2 face up, 1 Locomotive, 1 red
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 7:
                                    // 2 face up, 1 Locomotive, 1 blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 8:
                                    // 2 face up, 1 Locomotive, 1 white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 9:
                                    // 2 face up, 1 Locomotive, 1 black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 10:
                                    // 2 face up, 1 Locomotive, 1 purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 11:
                                    // 2 face up red Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Red", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 12:
                                    // 2 face up card blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Blue", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 13:
                                    // 2 face up card white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "White", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 14:
                                    // 2 2 face up card black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Black", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 15:
                                    // 2 face up card purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Purple", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 16:
                                    // draw one face down
                                    // draw one face up Locomotive
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 17:
                                    // draw one face down
                                    // draw one face up red
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Red");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 18:
                                    // draw one face down
                                    // draw one face up blue
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Blue");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 19:
                                    // draw one face down
                                    // draw one face up white
                                    game.drawOneFaceUpTrainCard(game.getAI(), "White");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 20:
                                    // draw one face down
                                    // draw one face up black
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Black");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 21:
                                    // draw one face down
                                    // draw one face up purple
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Purple");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                default:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");

                            }
                            destCount = 0; //reset the destination counter

                            //refresh the game
                            refresh(game.getCardData(), game.getFaceUpCardLabel(), game.getBlackTrainCardcounter(),
                                    game.getBlueTrainCardcounter(), game.getWhiteTrainCardcounter(),
                                    game.getPurpleTrainCardcounter(), game.getRedTrainCardcounter(),
                                    game.getLocoTrainCardcounter(), game.getPlayerNameDisplay(), game.getPlayerScore(),
                                    game.getPlayerTrains(), game.getReady(), game.getAIScore(), game.getAImoveDisplay(),
                                    game.getAITrainCardNum(), game.getAIDestCardNum());
                            stage.setScene(transition);
                            return;
                        }
                    }
                }
            }
        }
    }

    // class to handle cities that have two routes connected to them
    class TwoRouteButtonHandler implements EventHandler<ActionEvent> {

        // temp1 will be the city that has 4 routes connected to it
        // rest of temp buttons are connected cities to the original city
        Button temp1 = new Button();
        Button temp2 = new Button();
        Button temp3 = new Button();

        // constructor setting the cities
        TwoRouteButtonHandler(Button temp1, Button temp2, Button temp3) {
            this.temp1 = temp1;
            this.temp2 = temp2;
            this.temp3 = temp3;

        }

        // override the handle method for the event handler
        @Override
        public void handle(ActionEvent event) {
            //check if this is the first destination they click
            if (destCount == 0) {
                game.setDestOne(temp1.getText()); //set the destone in game to the buttons text
                destCount++; //increment the destination coutner for the 2nd destination
            } //check if this is the second desitnation they click
            else if (destCount == 1) {
                game.setDestTwo(temp1.getText()); //set the second destination to the button text

                //1st Condition: If the destination is not a route
                if (!(game.getDestOne().equals(temp2.getText())
                        || //check all nieghboring destinations
                        game.getDestOne().equals(temp3.getText()))) {

                    InvalidMove.Route();
                    destCount = 0;
                    stage.setScene(transition);
                    return;
                } else {   //passed 1st condition
                    //loop though the players destination card deck

                    //set counter to determine if alerts should execute
                    int loopcounter = 0;
                    int size = game.getUser().GetDestCards().size();
                    for (DestCard d : game.getUser().GetDestCards()) {
                        loopcounter++;
                        //2nd CONDITION: Test if none of their dest cards match with the route they picked
                        if (!(d.toString().equals(game.getDestOne() + " " + game.getDestTwo()) //<- test the first combination of destinations
                                || d.toString().equals(game.getDestTwo() + " " + game.getDestOne()))) {//<- test the second combination
                            if (loopcounter == size) {
                                InvalidMove.DestCard();
                                destCount = 0;
                                stage.setScene(transition);
                                return;
                            }
                        } else //passed 2nd condition
                        //3rd CONDITION: Testing the length of the route with the amount of Train cards the player has
                        if (!(d.getLength() <= (game.getUser(). //!(length < TrainCard(color)+TrainCard(Locomotive))|| color=grey
                                getAmountTrainCardColor(d.getRoutecolor())
                                + (game.getUser().getAmountTrainCardColor("Locomotive")))
                                || d.getRoutecolor().equals("Grey"))) {

                            InvalidMove.TrainCards();
                            destCount = 0;
                            stage.setScene(transition);
                            return;
                        } else //passed 3rd condition
                        //Grey SUB-CONDITIONS: Making sure they player has enough train cards for the length of the grey route
                        if (d.getRoutecolor().equals("GREY")) {
                            if (d.getLength() > (game.getUser().GetTrainCards().size())) { //route length > all of players train cards

                                InvalidMove.TrainCards();
                                destCount = 0;
                                stage.setScene(transition);
                                return;
                            }
                        } //4th CONDITION: Test if the player does not have enough Train cars
                        else if (!(d.getLength() < game.getUser().GetTrainCars())) {//compare the length of the route with the amount of train cars

                            InvalidMove.TrainCars();
                            destCount = 0;
                            stage.setScene(transition);
                            return;
                        } else {

                            String[] tempStr = new String[d.getLength()]; //create string array to hold the multiple train cards

                            if (d.getRoutecolor().equals("Grey")) {
                                // This logic is so they can choose which
                                // colors train cards for the grey routes

                                //loop through the length of the route
                                for (int i = 0; i < d.getLength(); i++) {
                                    tempStr[i] = MakeMove.chooseTrainCards(i); //store each color in array

                                    if (!game.getUser().hasTrainCard(tempStr[i])) { //player does not have the proper train card

                                        for (int j = 1; j < tempStr.length; j++) { //add the train cards back into deck
                                            game.getUser().AddToTrainDeck(new TrainCard(tempStr[j]));
                                        }
                                        InvalidMove.TrainCars();
                                        destCount = 0;
                                        stage.setScene(transition);
                                        return;
                                    } else { //remove the card from their deck
                                        game.getUser().removeTrainCard(game.getUser().getTrainCard(tempStr[i]));
                                    }
                                }
                            } //If they have Locomotive, then ask if the user would like use them
                            else if (game.getUser().hasTrainCard("Locomotive")) {

                                if (MakeMove.hasLocomotive()) {
                                    //loop through the length of the route
                                    for (int i = 0; i < d.getLength(); i++) {
                                        tempStr[i] = MakeMove.chooseTwoOptionTrainCards(i, "Locomotive", d.getRoutecolor()); //store each color in array

                                        if (!game.getUser().hasTrainCard(tempStr[i])) { //player does not have the proper train card

                                            for (int j = 1; j < tempStr.length; j++) { //add the train cards back into deck
                                                game.getUser().AddToTrainDeck(new TrainCard(tempStr[j]));

                                            }
                                            InvalidMove.TrainCards();

                                            destCount = 0;
                                            stage.setScene(transition);

                                            return;
                                        } else { //remove the card from their deck
                                            game.getUser().removeTrainCard(game.getUser().getTrainCard(tempStr[i]));

                                        }
                                    }
                                } else {
                                    //Here the train cards with the appropriate color will be taking out
                                    //of their deck
                                    for (int i = 0; i < d.getLength(); i++) {
                                        if (!(game.getUser().GetTrainCards().remove(game.getUser().getTrainCard(d.getRoutecolor())))) {
                                            for (int j = 0; j < i; j++) {
                                                game.getUser().AddToTrainDeck(new TrainCard(d.getRoutecolor()));
                                            }
                                            InvalidMove.TrainCards();

                                            destCount = 0;
                                            stage.setScene(transition);

                                            return;
                                        }
                                        game.getUser().DecrementTrainCardDeck();
                                    }
                                }
                            } //
                            else {
                                //Here the train cards with the appropriate color will be taking out
                                //of their deck
                                for (int i = 0; i < d.getLength(); i++) { //loop through the legnth of the route
                                    if (!(game.getUser().GetTrainCards().remove(game.getUser().getTrainCard(d.getRoutecolor())))) {
                                        for (int j = 0; j < i; j++) {
                                            game.getUser().AddToTrainDeck(new TrainCard(d.getRoutecolor()));
                                        }
                                    }
                                    game.getUser().DecrementTrainCardDeck();
                                }
                            }

                            //If and only if we get to this point, is the move offically valid
                            game.getUser().subTraincars(d.getLength()); //edit the players train cars
                            game.getUser().removeDestCard(d); //remove the card

                            //the value in decision is the decision the AI makes, the code below is to process that decision
                            int decision = game.getAI().CPUMakeMove(game.getUser().GetScore(), game.getFaceUpCards());
                            System.out.println(decision);
                            switch (decision) {
                                // if returned one, AI has chosen to claim a route. 
                                case 1:
                                    // Get Dest Card the AI is using
                                    DestCard desttemp = game.getAI().findBestRoute();
                                    if (desttemp.getRoutecolor().equals("Grey")) {
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                game.getAI().removeTrainCard(t);
                                                break;
                                            }
                                        }
                                    } else {
                                        //Here the train cards with the appropriate color will be taking out
                                        //of their deck
                                        for (int i = 0; i < desttemp.getLength(); i++) {
                                            for (TrainCard t : game.getAI().GetTrainCards()) {
                                                if (t.getColor().equals(desttemp.getRoutecolor()) || t.getColor().equals("Locomotive")) {
                                                    game.getAI().removeTrainCard(t);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    game.getAI().subTraincars(desttemp.getLength()); //edit the players train cars
                                    game.getAI().removeDestCard(desttemp); //remove the card
                                    destCount = 0; //reset the destination counter
                                    game.setAImoveDisplayText("CPU has claimed a route!");
                                    break;

                                case 2:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");
                                    break;

                                case 3:
                                    game.drawDestCard(game.getAI());
                                    game.setAImoveDisplayText("CPU has drawn one destination card");
                                    break;

                                case 5:
                                    // 2 face up Locomotive Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 6:
                                    // 2 face up, 1 Locomotive, 1 red
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 7:
                                    // 2 face up, 1 Locomotive, 1 blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 8:
                                    // 2 face up, 1 Locomotive, 1 white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 9:
                                    // 2 face up, 1 Locomotive, 1 black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 10:
                                    // 2 face up, 1 Locomotive, 1 purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Locomotive", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 11:
                                    // 2 face up red Cards
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Red", "Red");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 12:
                                    // 2 face up card blue
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Blue", "Blue");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 13:
                                    // 2 face up card white
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "White", "White");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 14:
                                    // 2 2 face up card black
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Black", "Black");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 15:
                                    // 2 face up card purple
                                    game.drawTwoFaceUpTrainCard(game.getAI(), "Purple", "Purple");
                                    game.setAImoveDisplayText("CPU has drawn two face up train cards");
                                    break;

                                case 16:
                                    // draw one face down
                                    // draw one face up Locomotive
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Locomotive");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 17:
                                    // draw one face down
                                    // draw one face up red
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Red");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 18:
                                    // draw one face down
                                    // draw one face up blue
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Blue");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 19:
                                    // draw one face down
                                    // draw one face up white
                                    game.drawOneFaceUpTrainCard(game.getAI(), "White");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 20:
                                    // draw one face down
                                    // draw one face up black
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Black");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                case 21:
                                    // draw one face down
                                    // draw one face up purple
                                    game.drawOneFaceUpTrainCard(game.getAI(), "Purple");
                                    game.setAImoveDisplayText("CPU has drawn one face up, and one face down train card");
                                    game.drawTrainCard(game.getAI(), 1);
                                    break;

                                default:
                                    game.drawTrainCard(game.getAI(), 2);
                                    game.setAImoveDisplayText("CPU has drawn two face down train cards");

                            }
                            destCount = 0; //reset the destination counter

                            //refresh the game
                            refresh(game.getCardData(), game.getFaceUpCardLabel(), game.getBlackTrainCardcounter(),
                                    game.getBlueTrainCardcounter(), game.getWhiteTrainCardcounter(),
                                    game.getPurpleTrainCardcounter(), game.getRedTrainCardcounter(),
                                    game.getLocoTrainCardcounter(), game.getPlayerNameDisplay(), game.getPlayerScore(),
                                    game.getPlayerTrains(), game.getReady(), game.getAIScore(), game.getAImoveDisplay(),
                                    game.getAITrainCardNum(), game.getAIDestCardNum());
                            stage.setScene(transition);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void refresh(Label cardData, Label faceUpText, Label blackTrainCardcounter,
            Label blueTrainCardcounter, Label whiteTrainCardcounter,
            Label purpleTrainCardcounter, Label redTrainCardcounter,
            Label locoTrainCardcounter, Label playerNameDisplay, Label playerScore,
            Label playerTrains, Button ready, Label AIScore, Label AImoveDisplay,
            Label AITrainCardNum, Label AIDestCardNum) {

        //refresh the card data
        game.setCardDatatext("\t\t\t    Dest Cards:\n" + game.getUser().formatDestCards());
        refreshCardData(cardData);
        game.setFaceUptext(game.formatFaceUpTrainCards());
        refreshFaceUpText(faceUpText);
        //refresh the amount of train cards a player has
        refreshBlackTrain(blackTrainCardcounter);
        refreshBlueTrain(blueTrainCardcounter);
        refreshWhitetrain(whiteTrainCardcounter);
        refreshPurpleTrain(purpleTrainCardcounter);
        refreshRedTrain(redTrainCardcounter);
        refreshLocoTrain(locoTrainCardcounter);

        //refresh the player box
        refeshPlayerName(playerNameDisplay);
        refeshPlayerScore(playerScore);
        refreshPlayerTrains(playerTrains);

        //refresh the AI Info
        game.setAIScoretext(game.getAI().GetScore());
        refreshAIScore(AIScore);
        refreshAImoveDisplay(AImoveDisplay);
        game.setAITrainCardNumtext(game.getAI().GetTrainCards().size());
        refreshAITrainCardNum(AITrainCardNum);
        game.setAIDestCardNumtext(game.getAI().GetDestCards().size());
        refreshAIDestCardNum(AIDestCardNum);

        //refresh the ready button
        refreshReadyButton(ready);

    }

    public void refreshCardData(Label cardData) {
        cardData = game.getCardData();
    }

    public void refreshReadyButton(Button ready) {
        ready.setText("Ready " + game.getUser().GetName());
    }

    public void refreshFaceUpText(Label faceUpText) {

        faceUpText.setText(game.formatFaceUpTrainCards());
        
    }

    public void refreshBlackTrain(Label blackTrainCardcounter) {
        blackTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Black")));
    }

    public void refreshBlueTrain(Label blueTrainCardcounter) {
        blueTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Blue")));
    }

    public void refreshWhitetrain(Label whiteTrainCardcounter) {
        whiteTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("White")));
    }

    public void refreshPurpleTrain(Label purpleTrainCardcounter) {
        purpleTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Purple")));
    }

    public void refreshRedTrain(Label redTrainCardcounter) {
        redTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Red")));
    }

    public void refreshLocoTrain(Label locoTrainCardcounter) {
        locoTrainCardcounter.setText(Integer.toString(game.getUser().getAmountTrainCardColor("Locomotive")));
    }

    public void refeshPlayerName(Label playerNameDisplay) {
        playerNameDisplay.setText("Player 1");
    }

    public void refeshPlayerScore(Label playerScore) {
        playerScore.setText(Integer.toString(game.getUser().GetScore()));
    }

    public void refreshPlayerTrains(Label playerTrains) {
        playerTrains.setText(Integer.toString(game.getUser().GetTrainCars()));
    }

    private void refreshAIScore(Label AIScore) {
        AIScore = new Label(Integer.toString(game.getAI().GetScore()));
    }

    private void refreshAImoveDisplay(Label AImoveDisplay) {
        AImoveDisplay = game.getAImoveDisplay();
    }

    private void refreshAITrainCardNum(Label AITrainCardNum) {
        AITrainCardNum = new Label(Integer.toString(game.getAI().GetTrainCards().size()));
    }

    private void refreshAIDestCardNum(Label AIDestCardNum) {
        AIDestCardNum = new Label(Integer.toString(game.getAI().GetDestCards().size()));
    }

}
