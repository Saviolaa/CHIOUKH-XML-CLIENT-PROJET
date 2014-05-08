/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import java.util.GregorianCalendar;
//import jfxtras.labs.scene.control.CalendarTextField;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author LYES-PC
 */
public class Client extends Application {
    
    public static String background;
    

    public GridPane addGridPaneTop() {
        
         
    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(10);
    gridPane.setVgap(10);
    gridPane.setPadding(new Insets(12, 12, 12, 12));

    Label motLabel = new Label("Bienvenue");

    motLabel.setFont(Font.font("Arial Black", FontWeight.EXTRA_BOLD,32));
    motLabel.setStyle(" -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.4) , 6, 0.0 , 0 , 2 );");
    gridPane.add(motLabel, 1, 0);    
    gridPane.setHalignment(motLabel, HPos.LEFT);
    
    Label motLabel1 = new Label("Donnez le numero du CV à afficher : ");
    motLabel1.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    gridPane.add(motLabel1, 0, 1);
    gridPane.setHalignment(motLabel1, HPos.LEFT);
    TextField numTextField = new TextField();
    numTextField.setPromptText("Exemple : 1,2..");
    gridPane.add(numTextField, 1, 1);
    gridPane.setHalignment(numTextField, HPos.RIGHT);
   
    Button buttonchercher = new Button("Afficher");
    buttonchercher.setPrefSize(100, 20);
    gridPane.add(buttonchercher, 2, 1);
    gridPane.setHalignment(numTextField, HPos.CENTER);
    gridPane.setStyle("-fx-background-color: #D8D8D8;");

    return gridPane;
}
    
    public VBox addVBox() {
    VBox vbox = new VBox(10);
    vbox.setPadding(new Insets(10));
    vbox.setSpacing(8);

    Text title = new Text("Affichage des CVs");
    title.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 20));
     title.setStyle(" -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.4) , 6, 0.0 , 0 , 2 );");
    
    TextArea cssEditorFld = new TextArea();
        cssEditorFld.setPrefRowCount(400);
        cssEditorFld.setPrefColumnCount(600);
        //cssEditorFld.setWrapText(true);
        cssEditorFld.setPrefWidth(300);
        GridPane.setHalignment(cssEditorFld, HPos.CENTER);        
    vbox.getChildren().addAll(title, cssEditorFld);

    return vbox;
}
   
    public GridPane addGridPane() {
        
        
    GridPane grid = new GridPane();
    //grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(12, 12, 12, 12));

    Label motLabel = new Label("Ajouter un nouveau CV");

    motLabel.setFont(Font.font("Arial Black", FontWeight.EXTRA_BOLD,20));
    motLabel.setStyle(" -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.4) , 6, 0.0 , 0 , 2 );");
    grid.add(motLabel, 0, 0);    
    grid.setHalignment(motLabel, HPos.LEFT);

    Label num = new Label("Numéro* : ");
    num.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(num, 0, 1);
    grid.setHalignment(num, HPos.LEFT);
    TextField numTextField = new TextField();
    numTextField.setPromptText("Exemple : 1,2..");
    grid.add(numTextField, 1, 1);
    grid.setHalignment(numTextField, HPos.RIGHT);
    
    Label nom = new Label("Nom* : ");
    nom.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(nom, 0, 2);
    grid.setHalignment(nom, HPos.LEFT);
    TextField nomTextField = new TextField();
    grid.add(nomTextField, 1, 2);
    grid.setHalignment(nomTextField, HPos.RIGHT);
    
    Label prenom = new Label("Prenom* : ");
    prenom.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(prenom, 0, 3);
    grid.setHalignment(prenom, HPos.LEFT);
    TextField prenomTextField = new TextField();
    grid.add(prenomTextField, 1, 3);
    grid.setHalignment(prenomTextField, HPos.RIGHT);
    
    Label objectif = new Label("Objectif : ");
    objectif.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(objectif, 0, 4);
    grid.setHalignment(prenom, HPos.LEFT);
    TextField objectifTextField = new TextField();
    grid.add(objectifTextField, 1, 4);
    grid.setHalignment(objectifTextField, HPos.RIGHT);
    
    Label scolarite = new Label("Scolarites : ");
    scolarite.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(scolarite, 0, 5);
    grid.setHalignment(scolarite, HPos.LEFT);
    TextField scolariteTextField = new TextField("Titre");
    grid.add(scolariteTextField, 1, 5);
    grid.setHalignment(scolariteTextField, HPos.RIGHT);
    
    TextField scolariteTextField1 = new TextField("Universite");
    grid.add(scolariteTextField1, 1, 6);
    grid.setHalignment(scolariteTextField1, HPos.RIGHT);
    
    TextField scolariteTextField2 = new TextField("Pays");
    grid.add(scolariteTextField2, 1, 7);
    grid.setHalignment(scolariteTextField2, HPos.RIGHT);
    
   // CalendarTextField calTextFielddebut = new CalendarTextField();
  //  calTextFielddebut.setPrefWidth(200);
  //  calTextFielddebut.valueProperty().set(new GregorianCalendar());
  //  grid.add(calTextFielddebut, 1, 8);
 //   grid.setHalignment(calTextFielddebut, HPos.RIGHT);
    
    //CalendarTextField calTextFieldfin = new CalendarTextField();
   // calTextFieldfin.setPrefWidth(200);
   // calTextFieldfin.valueProperty().set(new GregorianCalendar());
   // grid.add(calTextFieldfin, 1, 9);
  //  grid.setHalignment(calTextFieldfin, HPos.RIGHT);
    
    
    Label experience = new Label("Experiences : ");
    experience.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(experience, 0, 10);
    grid.setHalignment(experience, HPos.LEFT);
    
    TextField experienceTextField = new TextField("Titre");
    grid.add(experienceTextField, 1, 10);
    grid.setHalignment(experienceTextField, HPos.RIGHT);
    
    TextField experienceTextField1 = new TextField("Durée");
    grid.add(experienceTextField1, 1, 11);
    grid.setHalignment(experienceTextField1, HPos.RIGHT);
    
    TextField experienceTextField2 = new TextField("Societé");
    grid.add(experienceTextField2, 1, 12);
    grid.setHalignment(experienceTextField2, HPos.RIGHT);
    
    Label langue = new Label("Langues : ");
    langue.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(langue, 0, 13);
    grid.setHalignment(langue, HPos.LEFT);
    TextField langueTextField = new TextField("Nom");
    grid.add(langueTextField, 1, 13);
    grid.setHalignment(langueTextField, HPos.RIGHT);
   
    
    TextField langueTextField1 = new TextField("Niveau");
    grid.add(langueTextField, 1, 14);
    grid.setHalignment(langueTextField, HPos.RIGHT);
    
    
    
    Button buttonok = new Button("Envoyer");
    buttonok.setPrefSize(100, 20);
    grid.add(buttonok, 1, 15);
    grid.setHalignment(numTextField, HPos.LEFT);
    
    
    Label note = new Label("Les champs avec * sont obligatoires");
    note.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 10));
    grid.add(note, 3, 15);
    return grid;
}
    
    
    
    
    
         
    @Override
    public void start(Stage primaryStage) {
        
        background = Client.class.getResource("pw_pattern.png").toExternalForm();
       /* btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        StackPane root = new StackPane();
        root.setStyle("-fx-background-image: url('"+background+"')");  
        
        
        Scene scene = new Scene(root, 950, 650);
        
        primaryStage.setTitle("Projet Web Client - Conssomation et production CV");
        primaryStage.centerOnScreen();
        
      
        BorderPane border = new BorderPane();
        GridPane GridePane = addGridPaneTop();
        border.setTop(GridePane);
        border.setLeft(addVBox());
        //border.setCenter(null);
        border.setCenter(addGridPane());
        
        root.getChildren().add(border);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
