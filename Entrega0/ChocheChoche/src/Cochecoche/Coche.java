package Cochecoche;

public class Coche {
	
	public int velocidad;
	public int direction;  
	public double X;
	public double Y;

	public Coche() {
		this.velocidad = 10;
		this.direction = 90;
		this.X = 100;
		this.Y = 100;
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void incrementVelocidad() {
		this.velocidad = this.velocidad + 5;
	}
	
	public void desincrementVelocidad() {
		this.velocidad = this.velocidad - 5;
	}
	
	public void incrementAngulo() {
		this.direction = this.direction + 5;
	}
	
	public void desincrementAngulo() {
		this.direction = this.direction - 5;
	}

	public double getPosX() {
		return X;
	}
	public void setPosX(double X) {
		this.X = X;
	}
	public double getPosY() {
		return Y;
	}
	public void setPosY(double Y) {
		this.Y = Y;
	}
	
	public void mueve( double tiempoDeMovimiento ) {
		X = X + velocidad*tiempoDeMovimiento*Math.cos(Math.toRadians(direction));
		Y = Y + velocidad*tiempoDeMovimiento*Math.sin(Math.toRadians(direction));
	}

}
