package application.vue;

import application.modele.TileMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

public class MapVue {

	private TilePane mapTilePane;
	private TileMap mapTileMap;
	
	private Image sky = new Image("application/vue/tilset/sky.png");
	private Image grass1 = new Image("application/vue/tilset/grass1.png");
	private Image grass2 = new Image("application/vue/tilset/grass2.png");
	private Image grassfond = new Image("application/vue/tilset/grassfond.png");
	
	public MapVue(TilePane mapTilePane, TileMap mapTileMap) {
		this.mapTilePane = mapTilePane;
		this.mapTileMap = mapTileMap;
		mapTilePane.setPrefColumns(60);
		mapTilePane.setPrefRows(34);
		buildMap();
	}
	
	private void buildMap() {
		for (int j = 0 ; j < mapTileMap.getMap().length ; j++) {
			if (mapTileMap.getMap()[j] == 245)
				mapTilePane.getChildren().add(new ImageView(sky));
			else if (mapTileMap.getMap()[j] == 242)
				mapTilePane.getChildren().add(new ImageView(grass1));
			else if (mapTileMap.getMap()[j] == 243)
				mapTilePane.getChildren().add(new ImageView(grass2));
			else if (mapTileMap.getMap()[j] == 244)
				mapTilePane.getChildren().add(new ImageView(grassfond));
		}
	}
	
	
	
}
