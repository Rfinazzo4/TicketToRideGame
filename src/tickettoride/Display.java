/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.GREY;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Rectangle;



public class Display extends Application {
    Scanner reader;
    int count; //Player index 
   // String input; //

    Display(){
        count=0; //set count to zero
    }
    /*    
    public void displayStart(){
        System.out.println("");
        System.out.println("⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖");
        System.out.println("Welcome to the Ticket 2 Ride Game ");
        System.out.println("⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖");
        //Add details below
        System.out.println("⧱ The Main Objective of the game is to score the highest amount of points");
        System.out.println(" Here is they way you can earn points");
        System.out.println("");
        System.out.println("⟡ Claiming a route between two adjacent cities, points are decided by");
        System.out.println("  the length of the route");
        System.out.println("⟡ Complete the longest continous path");
        System.out.println("");
        System.out.println("------------------");

    }
    //ASKS THE USER IF THEY WOULD LIKE TO QUICKLY REVIEW THE RULES
      void readRules() {
        reader = new Scanner(System.in);
        System.out.println("Would you like to quickly review the rules ? Yes or any other key for no");
        String input = reader.nextLine();
        if (input.equals("Yes") || input.equals("yes") || input.equals("y")){
            System.out.println("--------------------");
             System.out.println("The rules are" );
          
            System.out.println("⟡You can only claim a route with the matching train color" );
            System.out.println("⟡Any returned DestCard or TrainCard will go to the bottom of the deck");
            System.out.println("⟡You must keep your destination card a secret till the end of the game");
            System.out.println("⟡Locomotive card is a wildcard, which could be any color");
            System.out.println("⟡If the locomotive card is a face up, you may only draw one card");
            System.out.println("⟡If your train cars deck, recycle the discarded and shuffle into a new deck");
            System.out.println("⟡Any card used to claim a route is discarded after");
            System.out.println("⟡You may only claim open routes");
            System.out.println("⟡You cannot claim two routes to the same city");
            System.out.println("---------------------");
            System.out.println("Now that you have quickly reviewed some of the game's rules, you are ready to play!");
            System.out.println("");
            System.out.println("");
            System.out.println("Lets get started with the game!");

        
        }
        else{
        }
        
    }
    
   
    public void displayBoard(Space[][] board) {
       for (int i=0;i<5;i++){

           for(int j=0;j<5;j++){
               System.out.print(board[i][j].getMark());
           }
           System.out.println("");

       }
    }
    */
    public void endGame(Player winner){
        System.out.println("The game is over! Thank you all for playing. ");
        System.out.println("-------------------------------");
        //Winenr will be sent, for the purposes of the Skeleton we simply 
        //sent an arbitrary Player
        System.out.println("The Winner is: "+ winner.GetName());
        reader.close();
    
    }

    public Player readPlayer() {
        reader = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.print("Player "+ ++count +" Please enter you name : ");
        String name = reader.nextLine();
        Player P = new Player(name);
        return P;
    }

    boolean morePlayers() {
        reader = new Scanner(System.in);
        System.out.println("Another PLayer? Yes or any other key for no");
        String input = reader.nextLine();
        if (input.equals("Yes") || input.equals("yes")){
            return true;
        }
        else{
            return false;
        }
        
    }

    DestCard displayPlayerDestcards(Player p) {
        reader = new Scanner(System.in);
        System.out.println("Player " + p.GetName());
        System.out.println("Here are the Desination cards you have been delt");
        System.out.println("---------------------------------------------");
        for (int i =0;i<3;i++){
            System.out.print((i+1)+". ");
            System.out.println(p.GetDestCards().get(i).toString());
        }
       
        System.out.println("Do you wish to keep all 3, you may return one. Yes or any other key for no");
        String input = reader.nextLine();
        if (input.equals("Yes") || input.equals("yes")){
            return null;
        }
        //////////////       
        System.out.println("Which card would you like to return? (1, 2, 3)");
        int temp = reader.nextInt();
        DestCard tempdc;
        switch(temp){
            case 1:
                System.out.println("Done.");
                tempdc = p.GetDestCards().get(0);
                p.GetDestCards().remove(0);
                for (int i =0;i<2;i++){
                    System.out.print((i+1)+". ");
                    System.out.println(p.GetDestCards().get(i).toString());
                }
                return tempdc;
            case 2:
                System.out.println("Done.");
                tempdc = p.GetDestCards().get(1);
                p.GetDestCards().remove(1);
                for (int i =0;i<2;i++){
                    System.out.print((i+1)+". ");
                    System.out.println(p.GetDestCards().get(i).toString());
                }
                return tempdc;
            case 3:
                System.out.println("Done.");
                tempdc = p.GetDestCards().get(2);
                p.GetDestCards().remove(2);
                for (int i =0;i<2;i++){
                    System.out.print((i+1)+". ");
                    System.out.println(p.GetDestCards().get(i).toString());
                }
                return tempdc;
            default:
                return null;
        }  
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //<editor-fold defaultstate="collapsed" desc="comment">
        //Los Angeles Button
        Button LA = new Button();
        LA.setText("LA");
        LA.setTranslateX(80);
        LA.setTranslateY(400);

        //Seattle Button
        Button SEA = new Button();
        SEA.setText("SEA");
        SEA.setTranslateX(85);
        SEA.setTranslateY(60);


        //Vancouver Button
        Button VAN = new Button();
        VAN.setText("VAN");
        VAN.setTranslateX(75);
        VAN.setTranslateY(5);

        //Winnipeg Button
        Button WIN = new Button();
        WIN.setText("WIN");
        WIN.setTranslateX(550);
        WIN.setTranslateY(50);

        //Salt Lake City Button
        Button SLC = new Button();
        SLC.setText("SLC");
        SLC.setTranslateX(260);
        SLC.setTranslateY(270);

        //Portland Button
        Button POR = new Button();
        POR.setText("POR");
        POR.setTranslateX(70);
        POR.setTranslateY(105);

        //Pheonix Button
        Button PHE = new Button();
        PHE.setText("PHE");
        PHE.setTranslateX(220);
        PHE.setTranslateY(440);

        //Little Rock Button
        Button LR = new Button();
        LR.setText("LR");
        LR.setTranslateX(670);
        LR.setTranslateY(440);

        //Denver Button
        Button DEN = new Button();
        DEN.setText("DEN");
        DEN.setTranslateX(380);
        DEN.setTranslateY(325);

        //Pittsburg Button
        Button PIT = new Button();
        PIT.setText("PIT");
        PIT.setTranslateX(930);
        PIT.setTranslateY(270);

        //Oaklahoma Button
        Button OKC = new Button();
        OKC.setText("OKC");
        OKC.setTranslateX(530);
        OKC.setTranslateY(420);

        //Duluth Button
        Button DUL = new Button();
        DUL.setText("DUL");
        DUL.setTranslateX(650);
        DUL.setTranslateY(130);

        //Helena Button
        Button HEL = new Button();
        HEL.setText("HEL");
        HEL.setTranslateX(270);
        HEL.setTranslateY(120);

        //Miami Button
        Button MIA = new Button();
        MIA.setText("MIA");
        MIA.setTranslateX(985);
        MIA.setTranslateY(650);

        //Houston Button
        Button HOU = new Button();
        HOU.setText("HOU");
        HOU.setTranslateX(610);
        HOU.setTranslateY(570);

        //Boston Button
        Button BOS = new Button();
        BOS.setText("BOS");
        BOS.setTranslateX(1100);
        BOS.setTranslateY(190);

        //Raleigh Button
        Button RAE = new Button();
        RAE.setText("RAE");
        RAE.setTranslateX(970);
        RAE.setTranslateY(385);

        //Ney York Button
        Button NYC = new Button();
        NYC.setText("NYC");
        NYC.setTranslateX(1060);
        NYC.setTranslateY(240);

        //Chicago Button
        Button CHI = new Button();
        CHI.setText("CHI");
        CHI.setTranslateX(750);
        CHI.setTranslateY(250);

        //Saint Marie Button
        Button STM = new Button();
        STM.setText("STM");
        STM.setTranslateX(810);
        STM.setTranslateY(120);


        //Dallas Button
        Button DAL = new Button();
        DAL.setText("DAL");
        DAL.setTranslateX(550);
        DAL.setTranslateY(500);

        //Nashville Button
        Button NAS = new Button();
        NAS.setText("NAS");
        NAS.setTranslateX(790);
        NAS.setTranslateY(405);

        //Charleston Button
        Button CHA = new Button();
        CHA.setText("CHA");
        CHA.setTranslateX(960);
        CHA.setTranslateY(460);

        //DC Button
        Button DC = new Button();
        DC.setText("DC");
        DC.setTranslateX(990);
        DC.setTranslateY(310);

        //Toronto Button
        Button TOR = new Button();
        TOR.setText("TOR");
        TOR.setTranslateX(910);
        TOR.setTranslateY(180);

        //St Loius Button
        Button STL = new Button();
        STL.setText("STL");
        STL.setTranslateX(700);
        STL.setTranslateY(330);

        //Kansis City Button
        Button KSC = new Button();
        KSC.setText("KSC");
        KSC.setTranslateX(610);
        KSC.setTranslateY(330);

        //Montreal Button
        Button MON = new Button();
        MON.setText("MON");
        MON.setTranslateX(1020);
        MON.setTranslateY(110);

        //New Orleans Button
        Button NWO = new Button();
        NWO.setText("NWO");
        NWO.setTranslateX(730);
        NWO.setTranslateY(550);

        //El Paso Button
        Button ELP = new Button();
        ELP.setText("ELP");
        ELP.setTranslateX(340);
        ELP.setTranslateY(500);

        //Santa Fe Button
        Button STF = new Button();
        STF.setText("STF");
        STF.setTranslateX(360);
        STF.setTranslateY(400);
        //</editor-fold>
        
        
        //<editor-fold defaultstate="collapsed" desc="comment">
        /*
        Line c1 =new Line(100,0,100,1000);
        Line c2 =new Line(200,0,200,1000);
        Line c3 =new Line(300,0,300,1000);
        Line c4 =new Line(400,0,400,1000);
        Line c5 =new Line(500,0,500,1000);
        Line c6 =new Line(600,0,600,1000);
        Line c7 =new Line(700,0,700,1000);
        Line c8 =new Line(800,0,800,1000);
        Line c9 =new Line(900,0,900,1000);
        Line c10 =new Line(1000,0,1000,1000);
        Line c11 =new Line(1100,0,1100,1000);
        
        
        Line r1 =new Line(0,100,1200,100);
        Line r2 =new Line(0,200,1200,200);
        Line r3 =new Line(0,300,1200,300);
        Line r4 =new Line(0,400,1200,400);
        Line r5 =new Line(0,500,1200,500);
        Line r6 =new Line(0,600,1200,600);
        Line r7 =new Line(0,700,1200,700);
        */
//</editor-fold>
        

        //<editor-fold defaultstate="collapsed" desc="comment">
        // lines to create routes
        // each route will have a color as well 
        
        
        // Vancouver ---> Winnipeg & Grey
        Line VANtoWIN = new Line(75, 5, 550, 50);
        VANtoWIN.setStroke(Color.GREY);
        VANtoWIN.setStrokeWidth(3);

        // Seattle ---> LA & Green
        Line SEAtoLA = new Line(85, 60, 80, 400);
        SEAtoLA.setStroke(Color.GREEN);
        SEAtoLA.setStrokeWidth(3);


        // Salt Lake City ---> Portland & Blue
        Line SLCtoPOR = new Line(260, 270, 70, 105);
        SLCtoPOR.setStroke(Color.BLUE);
        SLCtoPOR.setStrokeWidth(3);


        // Pheonix ---> Little Rock & Yellow
        Line PHEtoLR = new Line(220, 440, 670, 440);
        PHEtoLR.setStroke(Color.YELLOW);
        PHEtoLR.setStrokeWidth(3);

        // Denver ---> Pittsburg & Black
        Line DENtoPIT = new Line(380, 325, 930, 270);
        DENtoPIT.setStroke(Color.BLACK);
        DENtoPIT.setStrokeWidth(3);

        // Okalahoma City ---> Duluth & Red
        Line OKCtoDUL = new Line(530, 420, 650, 130);
        OKCtoDUL.setStroke(Color.RED);
        OKCtoDUL.setStrokeWidth(3);

        // Seattle ---> Vancouver & Grey
        Line SEAtoVAN = new Line(85, 60, 75, 5);
        SEAtoVAN.setStroke(Color.GREY);
        SEAtoVAN.setStrokeWidth(3);

        // Seatle ---> Portland & Grey
        Line SEAtoPOR = new Line(85, 60, 70, 105);
        SEAtoPOR.setStroke(Color.GREY);
        SEAtoPOR.setStrokeWidth(3);

        // Helena ---> Los Angeles & Blue
        Line HELtoLA = new Line(270, 120, 80, 400);
        HELtoLA.setStroke(Color.BLUE);
        HELtoLA.setStrokeWidth(3);

        // Miami ---> Houston & Yellow
        Line MIAtoHOU = new Line(985, 650, 610, 570);
        MIAtoHOU.setStroke(Color.YELLOW);
        MIAtoHOU.setStrokeWidth(3);

        // Boston ---> Raleigh & Green
        Line BOStoRAE = new Line(1100, 190, 970, 385);
        BOStoRAE.setStroke(Color.GREEN);
        BOStoRAE.setStrokeWidth(3);


        // New York ---> Chicago & Black
        Line NYCtoCHI = new Line(1060, 240, 750, 250);
        NYCtoCHI.setStroke(Color.BLACK);
        NYCtoCHI.setStrokeWidth(3);

        // Sault St Marie ---> Dallas & Blue
        Line STMtoDAL = new Line(810, 120, 550, 500);
        STMtoDAL.setStroke(Color.BLUE);
        STMtoDAL.setStrokeWidth(3);

        // Dallas ---> Nashville & Grey
        Line DALtoNAS = new Line(550, 500, 790, 405);
        DALtoNAS.setStroke(Color.GREY);
        DALtoNAS.setStrokeWidth(3);

        // Nashville ---> Miami & Grey
        Line NAStoMIA = new Line(790, 405, 985, 650);
        NAStoMIA.setStroke(Color.GREY);
        NAStoMIA.setStrokeWidth(3);

        // Miami ---> Charleston & Blue
        Line MIAtoCHA = new Line(985, 650, 960, 460);
        MIAtoCHA.setStroke(Color.BLUE);
        MIAtoCHA.setStrokeWidth(3);

        // Charleston ---> Washington DC & Yellow
        Line CHAtoDC = new Line(960, 460, 990, 310);
        CHAtoDC.setStroke(Color.YELLOW);
        CHAtoDC.setStrokeWidth(3);

        // Toronto ---> Chicago & Black
        Line TORtoCHI = new Line(910, 180, 750, 250);
        TORtoCHI.setStroke(Color.BLACK);
        TORtoCHI.setStrokeWidth(3);

        // Chicago ---> St. Louis & Red
        Line CHItoSTL = new Line(750, 250, 70, 105);
        CHItoSTL.setStroke(Color.RED);
        CHItoSTL.setStrokeWidth(3);

        // St. Louis ---> Kansis City & Grey
        Line STLtoKSC = new Line(700, 330, 610, 330);
        STLtoKSC.setStroke(Color.GREY);
        STLtoKSC.setStrokeWidth(3);

        // Washington DC ---> Montreal & Green
        Line DCtoMON = new Line(990, 310, 1020, 110);
        DCtoMON.setStroke(Color.GREEN);
        DCtoMON.setStrokeWidth(3);

        // New York ---> Little Rock & Green
        Line NYCtoLR = new Line(1060, 240, 670, 440);
        NYCtoLR.setStroke(Color.GREEN);
        NYCtoLR.setStrokeWidth(3);

        // Little Rock ---> New Orleans & Green
        Line LRtoNWO = new Line(670, 440, 730, 550);
        LRtoNWO.setStroke(Color.GREEN);
        LRtoNWO.setStrokeWidth(3);

        // Houston ---> El Paso & Yellow
        Line HOUtoELP = new Line(610, 570, 340, 500);
        HOUtoELP.setStroke(Color.YELLOW);
        HOUtoELP.setStrokeWidth(3);

        // Nashville ---> Charleston & Black
        Line NAStoCHA = new Line(790, 405, 960, 460);
        NAStoCHA.setStroke(Color.BLACK);
        NAStoCHA.setStrokeWidth(3);

        // Los Angeles ---> Santa Fe & Black
        Line LAtoSTF = new Line(80, 400, 360, 400);
        LAtoSTF.setStroke(Color.BLACK);
        LAtoSTF.setStrokeWidth(3);

        // Santa Fe ---> Helena & Grey
        Line STFtoHEL = new Line(360, 400, 270, 120);
        STFtoHEL.setStroke(Color.GREY);
        STFtoHEL.setStrokeWidth(3);

        // Montreal ---> Boston & Yellow
        Line MONtoBOS = new Line(1020, 110, 1100, 190);
        MONtoBOS.setStroke(Color.YELLOW);
        MONtoBOS.setStrokeWidth(3);
        //</editor-fold>
        
        
        
        LA.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             
            }
        });
        
        
        
        // will display the map and display the player TrainCard & DestCard
        // will ask user if they want to keep their cards or not
        Pane map = new Pane();
        
        Button scene2Cont = new Button("Continue");
        
        scene2Cont.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 1; i <= count; i++) {
                    Label scene3AlertBox = new Label("Hi Player " + i);
                }
            }
        } 
        
        
        );
        
        
        ImageView selectedImage = new ImageView();
        Image newImage = new Image(Display.class.getResourceAsStream("images/usazoom2c.jpg"));
        selectedImage.setFitHeight(720);
        selectedImage.setFitWidth(1200);
        selectedImage.setImage(newImage);
        
        
       
        
        
        Scene scene = new Scene(map,5000,5000);
        
        map.getChildren().addAll(selectedImage,LA,SEA, VAN,  WIN, SLC, POR, 
                PHE, LR, DEN, PIT, OKC, DUL, HEL,MIA,HOU, BOS, RAE, NYC, CHI, 
                STM, DAL, NAS, CHA, DC,TOR,STL,KSC, NWO, ELP, STF, MON, VANtoWIN,
                SEAtoLA, SLCtoPOR, PHEtoLR, DENtoPIT, OKCtoDUL, SEAtoVAN,
                SEAtoPOR, HELtoLA, MIAtoHOU,BOStoRAE, NYCtoCHI, STMtoDAL,
                DALtoNAS, NAStoMIA, MIAtoCHA, CHAtoDC, TORtoCHI, CHItoSTL, STLtoKSC, 
                DCtoMON, NYCtoLR, LRtoNWO, HOUtoELP, NAStoCHA, LAtoSTF, STFtoHEL,
                MONtoBOS); /*c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, r1, 
                r2, r3, r4, r5, r6, r7);*/

        scene.setRoot(map); 
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        // Display d = new Display();
        //Game game = new Game();
       // game.endGame();
        
    }
    
    
}
