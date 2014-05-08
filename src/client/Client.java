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
import javafx.scene.control.Slider;

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
    private static final String server = "http://chioukh-tp-xml-projet.saviolaa.cloudbees.net/rest/cv";

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
     motLabel.setTextFill(Color.web("#0076a3"));
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
     title.setFill(Color.web("#0076a3"));
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

    motLabel.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD,20));
    motLabel.setStyle(" -fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.4) , 6, 0.0 , 0 , 2 );");
     motLabel.setTextFill(Color.web("#0076a3"));
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
    TextField scolariteTextField = new TextField();
    scolariteTextField.setPromptText("Titre");
    grid.add(scolariteTextField, 1, 5);
    grid.setHalignment(scolariteTextField, HPos.RIGHT);
    
    TextField scolariteTextField1 = new TextField();
    scolariteTextField1.setPromptText("Universite");
    grid.add(scolariteTextField1, 1, 6);
    grid.setHalignment(scolariteTextField1, HPos.RIGHT);
    
    TextField scolariteTextField2 = new TextField();
    scolariteTextField2.setPromptText("Pays");
    grid.add(scolariteTextField2, 1, 7);
    grid.setHalignment(scolariteTextField2, HPos.RIGHT);
    
    TextField scolariteTextField3 = new TextField();
    scolariteTextField3.setPromptText("Date début");
    grid.add(scolariteTextField3, 1, 8);
    grid.setHalignment(scolariteTextField3, HPos.RIGHT);
    
    
    TextField scolariteTextField4 = new TextField();
    scolariteTextField4.setPromptText("Date fin");
    grid.add(scolariteTextField4, 1, 9);
    grid.setHalignment(scolariteTextField4, HPos.RIGHT);
    
    
    Label experience = new Label("Experiences : ");
    experience.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(experience, 0, 10);
    grid.setHalignment(experience, HPos.LEFT);
    
    TextField experienceTextField = new TextField();
    experienceTextField.setPromptText("Titre");
    grid.add(experienceTextField, 1, 10);
    grid.setHalignment(experienceTextField, HPos.RIGHT);
    
    TextField experienceTextField1 = new TextField();
    experienceTextField1.setPromptText("Durée");
    grid.add(experienceTextField1, 1, 11);
    grid.setHalignment(experienceTextField1, HPos.RIGHT);
    
    TextField experienceTextField2 = new TextField();
    experienceTextField2.setPromptText("Societé");
    grid.add(experienceTextField2, 1, 12);
    grid.setHalignment(experienceTextField2, HPos.RIGHT);
    
    Label langue = new Label("Langues : ");
    langue.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 13));
    grid.add(langue, 0, 13);
    grid.setHalignment(langue, HPos.LEFT);
    TextField langueTextField = new TextField();
    langueTextField.setPromptText("Nom");
    grid.add(langueTextField, 1, 13);
    grid.setHalignment(langueTextField, HPos.RIGHT);
   
    
    TextField langueTextField1 = new TextField();
    langueTextField1.setPromptText("Niveau");
    //grid.add(langueTextField1, 1, 14);
    //grid.setHalignment(langueTextField1, HPos.RIGHT);
    
    Slider slider = new Slider();
    slider.setMin(0);
    slider.setMax(10);
    slider.setValue(5);
    slider.setShowTickLabels(true);
    slider.setShowTickMarks(true);
    slider.setMajorTickUnit(10);
    slider.setMinorTickCount(5);
    slider.setBlockIncrement(1);
    
    grid.add(slider, 1, 14);
    grid.setHalignment(slider, HPos.RIGHT);
    
    
    Button buttonok = new Button("Envoyer");
    buttonok.setPrefSize(100, 20);
    grid.add(buttonok, 1, 15);
    grid.setHalignment(numTextField, HPos.LEFT);
    
    
    Label note = new Label("Les champs avec * sont obligatoires");
    note.setFont(Font.font("Comfortaa", FontWeight.MEDIUM, 10));
    note.setTextFill(Color.web("#0076a3"));
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
        
        
        Scene scene = new Scene(root, 950, 685);
        
        primaryStage.setTitle("Projet Web Client - Consomation et production CV");
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
