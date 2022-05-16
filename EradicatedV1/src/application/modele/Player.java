package application.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Player {

	private IntegerProperty x;
	private IntegerProperty y;
	
	public Player(int x,int y) {
		this.x = new SimpleIntegerProperty(x);
		this.y = new SimpleIntegerProperty(y);
	}

	public IntegerProperty getXProperty() {
		return x;
	}
	public IntegerProperty getYProperty() {
		return y;
	}
	public int getX() {
		return x.getValue();
	}
	public int getY() {
		return y.getValue();
	}
	
	public void deplacementDroite() {
		x.set(getX()+5);
	}
	public void deplacementGauche() {
		x.set(getX()-5);
	}
	public void deplacementHaut() {
		y.set(getY()-5);
	}
	public void deplacementBas() {
		y.set(getY()+5);
	}
	
	
}
