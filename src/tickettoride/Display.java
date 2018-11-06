/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;
import java.awt.Font;
import java.util.Scanner;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Rectangle;
import tickettoride.DestCard;
import tickettoride.Display;
import tickettoride.Game;
import tickettoride.Player;
import tickettoride.Space;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;



public class Display extends Application{
    Scanner reader;
    int count; //Player Index
    int destCount;  // Which destination is being pressed for the buttons
                    // 0 meaning first destination, 1 being the second destination 
    Game game;
    
    //create color array or list; ????
    
    public static void main(String[] args) {launch(args);} 
      
    public String displayStart(){
        
        return (" ⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖⬖ "+"\n"+
                " Well Howdy Partner! We got ourselves a Train Ride Coming Your Way! "+"\n"+
                " --------------------------------------------------------------------- "+"\n"+
                " The Main Objective of the game is to score the highest amount of   "+"\n"+
                " points. You can earn points by claiming a route between two        "+"\n"+
                " adjacent cities, points are decide by the length of the route.     "+"\n"+
                " Another way of scoring is complete the longest continuous path\n\n"+
                " --------------------------------------------------------------------- "+"\n"+
                "The rules are as follows:"+"\n"+
                "   ⟡ You can claim any route on the board when you have enough      "+"\n"+
                "      of the same color train car cards to the route color.         "+"\n"+ 
                "   ⟡ If you choose to return a DestCard it will go in the bottom    "+"\n"+
                "      of the deck.                                                  "+"\n"+
                "   ⟡ You must keep your destination card a secret till the end of   "+"\n"+
                "      the game.                                                     "+"\n"+
                "   ⟡ Locomotive card is a wild train card, which can be used as any "+"\n"+
                "      color.                                                        "+"\n"+
                "   ⟡ If the locomotive card is one of the face up options, you have "+"\n"+
                "      a choice of only picking that card up.                        "+"\n"+
                "   ⟡ Any card used to claim a route is discarded after.             "+"\n"+
                "   ⟡ You may only claim open routes.                                "+"\n"+
                "   ⟡ You cannot claim two routes to the same city.                  "+"\n"+
                " --------------------------------------------------------------------- "+"\n"+
                "                             How many players are joining? 2-5                "+"\n"+
                " --------------------------------------------------------------------- "+"\n");
      
    }
    
    public void endGame(Player winner){
        System.out.println("The game is over! Thank you all for playing. ");
        System.out.println("-------------------------------");
        //Winenr will be sent, for the purposes of the Skeleton we simply 
        //sent an arbitrary Player
        System.out.println("The Winner is: "+ winner.GetName());
        reader.close();
    
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

    public DestCard displayDestcardReturn(Player p) {
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
    
    public void displayPlayerDestcards(Player p) {
        reader = new Scanner(System.in);
        System.out.println("Player " + p.GetName());
        System.out.println("Here are the Desination cards you have been delt");
        System.out.println("---------------------------------------------");
        for (int i =0;i<3;i++){
            System.out.print((i+1)+". ");
            System.out.println(p.GetDestCards().get(i).toString());
        }
    }

    
    public int displayMoveOptions(){
        return 0;
    }

    DestCard displayClaimRoute() {
        System.out.println("This move has not bee designed yet");
        return null;
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        game = new Game();
        count = 0;
        
//GRIDLINES   
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
     
//BUTTONS
//<editor-fold defaultstate="collapsed" desc="comment">
//Los Angeles
Button LA = new Button();
LA.setText("LA");
LA.setTranslateX(80);
LA.setTranslateY(400);


//Seattle
Button SEA = new Button();
SEA.setText("SEA");
SEA.setTranslateX(85);
SEA.setTranslateY(60);


//Vancouver
Button VAN = new Button();
VAN.setText("VAN");
VAN.setTranslateX(75);
VAN.setTranslateY(5);

//Winnipeg
Button WIN = new Button();
WIN.setText("WIN");
WIN.setTranslateX(550);
WIN.setTranslateY(50);

//Salt Lake City
Button SLC = new Button();
SLC.setText("SLC");
SLC.setTranslateX(260);
SLC.setTranslateY(270);

//Portland
Button POR = new Button();
POR.setText("POR");
POR.setTranslateX(70);
POR.setTranslateY(105);

//Pheonix
Button PHE = new Button();
PHE.setText("PHE");
PHE.setTranslateX(220);
PHE.setTranslateY(440);

//Little Rock
Button LR = new Button();
LR.setText("LR");
LR.setTranslateX(670);
LR.setTranslateY(440);

//Denver
Button DEN = new Button();
DEN.setText("DEN");
DEN.setTranslateX(380);
DEN.setTranslateY(325);

//Pittsburg
Button PIT = new Button();
PIT.setText("PIT");
PIT.setTranslateX(930);
PIT.setTranslateY(270);

//Oaklahoma
Button OKC = new Button();
OKC.setText("OKC");
OKC.setTranslateX(530);
OKC.setTranslateY(420);

//Dulith
Button DUL = new Button();
DUL.setText("DUL");
DUL.setTranslateX(650);
DUL.setTranslateY(130);

//Helana
Button HEL = new Button();
HEL.setText("HEL");
HEL.setTranslateX(270);
HEL.setTranslateY(120);

//Miami
Button MIA = new Button();
MIA.setText("MIA");
MIA.setTranslateX(985);
MIA.setTranslateY(650);

//Houston
Button HOU = new Button();
HOU.setText("HOU");
HOU.setTranslateX(610);
HOU.setTranslateY(570);

//Boston
Button BOS = new Button();
BOS.setText("BOS");
BOS.setTranslateX(1100);
BOS.setTranslateY(190);

//Raleigh
Button RAE = new Button();
RAE.setText("RAE");
RAE.setTranslateX(970);
RAE.setTranslateY(385);

//New York
Button NYC = new Button();
NYC.setText("NYC");
NYC.setTranslateX(1060);
NYC.setTranslateY(240);

//Chicago
Button CHI = new Button();
CHI.setText("CHI");
CHI.setTranslateX(750);
CHI.setTranslateY(250);

//Saint Maury
Button STM = new Button();
STM.setText("STM");
STM.setTranslateX(810);
STM.setTranslateY(120);

//Dallas
Button DAL = new Button();
DAL.setText("DAL");
DAL.setTranslateX(550);
DAL.setTranslateY(500);

//Nashville
Button NAS = new Button();
NAS.setText("NAS");
NAS.setTranslateX(790);
NAS.setTranslateY(405);

//Charleston
Button CHA = new Button();
CHA.setText("CHA");
CHA.setTranslateX(960);
CHA.setTranslateY(460);

//WDC
Button DC = new Button();
DC.setText("DC");
DC.setTranslateX(990);
DC.setTranslateY(310);

//Toronto
Button TOR = new Button();
TOR.setText("TOR");
TOR.setTranslateX(910);
TOR.setTranslateY(180);

//St louis
Button STL = new Button();
STL.setText("STL");
STL.setTranslateX(700);
STL.setTranslateY(330);

//Kansis City
Button KSC = new Button();
KSC.setText("KSC");
KSC.setTranslateX(610);
KSC.setTranslateY(330);

//Montreal
Button MON = new Button();
MON.setText("MON");
MON.setTranslateX(1020);
MON.setTranslateY(110);

//New Orleans
Button NWO = new Button();
NWO.setText("NWO");
NWO.setTranslateX(730);
NWO.setTranslateY(550);

//El Paso
Button ELP = new Button();
ELP.setText("ELP");
ELP.setTranslateX(340);
ELP.setTranslateY(500);

//Santa Fe
Button STF = new Button();
STF.setText("STF");
STF.setTranslateX(360);
STF.setTranslateY(400);

//Create the Player option Buttons 
        Button p2 = new Button();
        p2.setTranslateX(0);
        p2.setTranslateY(235);
        p2.setText("2 Players");
        
//        Button p3 = new Button();
//        p3.setTranslateX(-45);
//        p3.setTranslateY(235);
//        p3.setText("3 Players");
//        
//        Button p4 = new Button();
//        p4.setTranslateX(45);
//        p4.setTranslateY(235);
//        p4.setText("4 Players");
//        
//        Button p5 = new Button();
//        p5.setTranslateX(130);
//        p5.setTranslateY(235);
//        p5.setText("5 Players");
        
//</editor-fold>

//ROUTE LINES
//<editor-fold defaultstate="collapsed" desc="comment">

// each route will have a color as well

// Vancouver ---> Winnipeg & Grey
Line VANtoWIN = new Line(75, 5, 75, 5);
VANtoWIN.setStroke(Color.GREY);
VANtoWIN.setStrokeWidth(3);

// Seattle ---> LA & Green
Line SEAtoLA = new Line(85, 60, 80, 400);
SEAtoLA.setFill(Color.GREEN);
SEAtoLA.setStrokeWidth(3);

// Salt Lake City ---> Portland & Blue
Line SLCtoPOR = new Line(260, 270, 70, 105);
SLCtoPOR.setFill(Color.BLUE);
SLCtoPOR.setStrokeWidth(3);


// Pheonix ---> Little Rock & Yellow
Line PHEtoLR = new Line(220, 440, 670, 440);
PHEtoLR.setFill(Color.YELLOW);
PHEtoLR.setStrokeWidth(3);

// Denver ---> Pittsburg & Black
Line DENtoPIT = new Line(380, 325, 930, 270);
DENtoPIT.setFill(Color.BLACK);
DENtoPIT.setStrokeWidth(3);

// Okalahoma City ---> Duluth & Red
Line OKCtoDUL = new Line(530, 420, 650, 130);
OKCtoDUL.setFill(Color.RED);
OKCtoDUL.setStrokeWidth(3);

// Seattle ---> Vancouver & Grey
Line SEAtoVAN = new Line(85, 60, 75, 5);
SEAtoVAN.setFill(Color.GREY);
SEAtoVAN.setStrokeWidth(3);

// Seatle ---> Portland & Grey
Line SEAtoPOR = new Line(85, 60, 70, 105);
SEAtoPOR.setFill(Color.GREY);
SEAtoPOR.setStrokeWidth(3);

// Helena ---> Los Angeles & Blue
Line HELtoLA = new Line(270, 120, 80, 400);
HELtoLA.setFill(Color.BLUE);
HELtoLA.setStrokeWidth(3);

// Miami ---> Houston & Yellow
Line MIAtoHOU = new Line(985, 650, 610, 570);
MIAtoHOU.setFill(Color.YELLOW);
MIAtoHOU.setStrokeWidth(3);

// Boston ---> Raleigh & Green
Line BOStoRAE = new Line(1100, 190, 970, 385);
BOStoRAE.setFill(Color.GREEN);
BOStoRAE.setStrokeWidth(3);


// New York ---> Chicago & Black
Line NYCtoCHI = new Line(1060, 240, 750, 250);
NYCtoCHI.setFill(Color.BLACK);
NYCtoCHI.setStrokeWidth(3);

// Sault St Marie ---> Dallas & Blue
Line SLCtoDAL = new Line(810, 120, 550, 500);
SLCtoDAL.setFill(Color.BLUE);
SLCtoDAL.setStrokeWidth(3);

// Dallas ---> Nashville & Grey
Line DALtoNAS = new Line(550, 500, 790, 405);
DALtoNAS.setFill(Color.GREY);
DALtoNAS.setStrokeWidth(3);

// Nashville ---> Miami & Grey
Line NAStoMIA = new Line(790, 405, 985, 650);
NAStoMIA.setFill(Color.GREY);
NAStoMIA.setStrokeWidth(3);

// Miami ---> Charleston & Blue
Line MIAtoCHA = new Line(985, 650, 960, 460);
MIAtoCHA.setFill(Color.BLUE);
MIAtoCHA.setStrokeWidth(3);

// Charleston ---> Washington DC & Yellow
Line CHAtoDC = new Line(960, 460, 990, 310);
CHAtoDC.setFill(Color.YELLOW);
CHAtoDC.setStrokeWidth(3);

// Toronto ---> Chicago & Black
Line TORtoCHI = new Line(910, 180, 750, 250);
TORtoCHI.setFill(Color.BLACK);
TORtoCHI.setStrokeWidth(3);

// Chicago ---> St. Louis & Red
Line CHItoSTL = new Line(750, 250, 70, 105);
CHItoSTL.setFill(Color.RED);
CHItoSTL.setStrokeWidth(3);

// St. Louis ---> Kansis City & Grey
Line STLtoKSC = new Line(260, 270, 450, 350);
STLtoKSC.setFill(Color.GREY);
STLtoKSC.setStrokeWidth(3);

// Washington DC ---> Montreal & Green
Line DCtoMON = new Line(990, 310, 1020, 110);
DCtoMON.setFill(Color.GREEN);
DCtoMON.setStrokeWidth(3);

// New York ---> Little Rock & Green
Line NYCtoLR = new Line(1060, 240, 670, 440);
NYCtoLR.setFill(Color.GREEN);
NYCtoLR.setStrokeWidth(3);

// Little Rock ---> New Orleans & Green
Line LRtoNWO = new Line(670, 440, 730, 550);
LRtoNWO.setFill(Color.GREEN);
LRtoNWO.setStrokeWidth(3);

// Houston ---> El Paso & Yellow
Line HOUtoELP = new Line(610, 570, 340, 500);
HOUtoELP.setFill(Color.YELLOW);
HOUtoELP.setStrokeWidth(3);

// Nashville ---> Charleston & Black
Line NAStoCHA = new Line(790, 405, 960, 460);
NAStoCHA.setFill(Color.BLACK);
NAStoCHA.setStrokeWidth(3);

// Los Angeles ---> Santa Fe & Black
Line LAtoSTF = new Line(80, 400, 360, 400);
LAtoSTF.setFill(Color.BLACK);
LAtoSTF.setStrokeWidth(3);

// Santa Fe ---> Helena & Grey
Line STFtoHEL = new Line(360, 400, 270, 120);
STFtoHEL.setFill(Color.GREY);
STFtoHEL.setStrokeWidth(3);

// Montreal ---> Boston & Yellow
Line MONtoBOS = new Line(1020, 110, 1100, 190);
MONtoBOS.setFill(Color.YELLOW);
MONtoBOS.setStrokeWidth(3);

//</editor-fold>

        
        //Creating Image View for the Map
        ImageView selectedImage = new ImageView();
        //Load map image
        Image newImage = new Image(Display.class.getResourceAsStream("images/usazoom2c.jpg"));
        //set attributes
        selectedImage.setFitHeight(720);
        selectedImage.setFitWidth(1200);
        selectedImage.setImage(newImage);
        
        //DEFINE SCENE 1
        StackPane root1 = new StackPane();
        Scene scene1 = new Scene(root1, 5000,5000);
        
        Label welcome = new Label(displayStart());
        
        root1.getChildren().addAll(welcome,p2);
        scene1.setRoot(root1);
        
        //Define SCENE 2
        Pane root2 = new Pane();
        Scene scene2 = new Scene(root2, 5000,5000);
        
        Pane cardInfo = new Pane();
        cardInfo.setTranslateX(10);
        cardInfo.setTranslateY(430);
        cardInfo.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,CornerRadii.EMPTY,Insets.EMPTY)));
       
        Label cardData = new Label("----"+game.getPlayers().get(count).GetName()
                + "----\n Train Cards: \n"+game.getPlayers().get(count).formatTrainCards()+
                "\n\nDestCards: \n"+game.getPlayers().get(count).formatDestCards());
        cardInfo.getChildren().add(cardData);
        
        root2.getChildren().addAll(selectedImage,VANtoWIN,
                SEAtoLA, SLCtoPOR, PHEtoLR, DENtoPIT, OKCtoDUL, SEAtoVAN,
                SEAtoPOR, HELtoLA, MIAtoHOU,BOStoRAE, NYCtoCHI, SLCtoDAL,
                DALtoNAS, NAStoMIA, MIAtoCHA, CHAtoDC, TORtoCHI, CHItoSTL, 
                STLtoKSC, DCtoMON, NYCtoLR, LRtoNWO, HOUtoELP, NAStoCHA, 
                LAtoSTF, STFtoHEL,MONtoBOS, LA, SEA, VAN, WIN, SLC, POR,PHE, 
                LR, DEN, PIT, OKC, DUL, HEL,MIA,HOU, BOS, RAE, NYC, CHI, STM, 
                DAL, NAS, CHA, DC, TOR,STL,KSC, NWO, ELP, STF, MON, cardInfo);  
                //, c1, c2, 
                //c3, c4, c5, c6, c7, c8, c9, c10, c11, r1, r2, r3, r4, r5, 
                //r6, r7);
                
        //DEFINE SCENE Transition
        Pane root3 = new Pane();
        Scene transition = new Scene(root3,5000,5000);
        
        
        Button ready = new Button("Ready");
        ready.setTranslateY(0);
        
        root3.getChildren().add(ready);
        
        
        primaryStage.setTitle("Ticker To Ride Game");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
//BUTTONS HANDLERS
//<editor-fold defaultstate="collapsed" desc="comment">

//handler for 2 players
p2.setOnAction(e -> {
    primaryStage.setScene(transition);
    
});

ready.setOnAction(e-> {
            primaryStage.setScene(scene2);
            String temp=MakeMove.MakeMove();
            if (temp.equals("DrawTrain")){
                game.drawTrainCard(game.getPlayers().get(count));
                if (count==0){
                    count++;
                }
                else{
                    count=0;
                }
                refreshCardData(cardData);
                primaryStage.setScene(transition);
            }
            else if(temp.equals("DrawDest")){
                game.drawDestCard(game.getPlayers().get(count));
                if (count==0){
                    count++;
                }
                else{
                    count=0;
                }
                refreshCardData(cardData);
                primaryStage.setScene(transition);
            }
            else if(temp.equals("Claim")){
                // prompt anothr pop up that says pick a route
                // 
            }
    
        });

    LA.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(LA.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(LA.getText());
            destCount=0;
        }
                
        
    });
    SEA.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(SEA.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(SEA.getText());
            destCount=0;
        }
    });
    
    POR.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(POR.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(POR.getText());
            destCount=0;
        }
    });
    
    VAN.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(VAN.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(VAN.getText());
            destCount=0;
        }
    });
    
    WIN.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(WIN.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(WIN.getText());
            destCount=0;
        }
    });
    
    SLC.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(SLC.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(SLC.getText());
            destCount=0;
        }
    });
    
    PHE.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(PHE.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(PHE.getText());
            destCount=0;
        }
    });
    
    LR.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(LR.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(LR.getText());
            destCount=0;
        }
    });
    
    DEN.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(DEN.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(DEN.getText());
            destCount=0;
        }
    });
    
    PIT.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(PIT.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(PIT.getText());
            destCount=0;
        }
    });
    
    OKC.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(OKC.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(OKC.getText());
            destCount=0;
        }
    });
    
    DUL.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(DUL.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(DUL.getText());
            destCount=0;
        }
    });
    
    HEL.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(HEL.getText());
            destCount++;
        }
        else if(destCount ==1){
            game.setDestTwo(HEL.getText());
            destCount=0;
        }
    });
    
    MON.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(MON.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(MON.getText());
            destCount=0;
            }
            
    });
 
     STF.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(STF.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(STF.getText());
            destCount=0;
            }
            
    });
    
     ELP.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(ELP.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(ELP.getText());
            destCount=0;
            }
            
    });
    
     NWO.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(NWO.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(NWO.getText());
            destCount=0;
            }
            
    });
    
     KSC.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(KSC.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(KSC.getText());
            destCount=0;
            }
            
    });
    
     STL.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(STL.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(STL.getText());
            destCount=0;
            }
            
    });
    
     TOR.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(TOR.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(TOR.getText());
            destCount=0;
            }
            
    });
    
     DC.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(DC.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(DC.getText());
            destCount=0;
            }
            
    });
    
     CHA.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(CHA.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(CHA.getText());
            destCount=0;
            }
            
    });
    
     NAS.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(NAS.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(NAS.getText());
            destCount=0;
            }
            
    });
    
     DAL.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(DAL.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(DAL.getText());
            destCount=0;
            }
            
    });
    
     STM.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(STM.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(STM.getText());
            destCount=0;
            }
            
    });
    
     HOU.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(HOU.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(HOU.getText());
            destCount=0;
            }
            
    });
    
     MIA.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(MIA.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(MIA.getText());
            destCount=0;
            }
            
    });
    
     LA.setOnAction(e-> {
        if(destCount ==0){
            game.setDestOne(LA.getText());
            destCount++;
           }
        else if(destCount ==1){
            game.setDestTwo(LA.getText());
            destCount=0;
            }
            
    });
//</editor-fold>
      
}

    private void refreshCardData(Label cardData) {
        cardData.setText("----"+game.getPlayers().get(count).GetName()
                + "----\n Train Cards: \n"+game.getPlayers().get(count).formatTrainCards()+
                "\n\nDestCards: \n"+game.getPlayers().get(count).formatDestCards());
        }
    
}
