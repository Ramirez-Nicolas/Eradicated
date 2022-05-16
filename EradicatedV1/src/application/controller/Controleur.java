package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.modele.Player;
import application.modele.TileMap;
import application.vue.CharacterVue;
import application.vue.MapVue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

public class Controleur  implements Initializable{

	private MapVue maps;
	private CharacterVue playerVue;
	private Player player;
	
	
	@FXML
	private TilePane mapTilePane;
	@FXML
	private Pane mapPane;
	@FXML
	private BorderPane game;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		maps = new MapVue(mapTilePane, new TileMap());
		player = new Player(300, 300);
		playerVue = new CharacterVue(mapPane,player);
		this.game.setOnKeyPressed(new PlayerMovement(player));
//		PlayerMovement controlMovement = new PlayerMovement(player);
//		mapPane.addEventHandler(KeyEvent.ANY , controlMovement);
//		mapPane.setOnKeyPressed(event -> {
//			System.out.println(event.getCode());	
//			switch(event.getCode()) {
//					
////			case Z : player.deplacementHaut();
////			break;
//					
//					
//			case Q : player.deplacementGauche();
//			break;
//								
//					
////			case S : player.deplacementBas();
////			break;
//					
//					
//			case D : player.deplacementDroite();
//			break;
//				
//			default:		
//			break;
//					
//				}
//		});
		
	}
	

	
	
}
