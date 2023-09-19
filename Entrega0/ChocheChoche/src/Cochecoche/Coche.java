package Cochecoche;

public class Coche {
	
	public int velocidad;
	public int direction;  
	public double X;
	public double Y;

	public Coche() {
		this.velocidad = 0;
		this.direction = 90;
		this.X = 0;
		this.Y = 0;
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
		this.velocidad = this.velocidad + 1;
	}
	
	public void desincrementVelocidad() {
		this.velocidad = this.velocidad - 1;
	}
	
	public void incrementAngulo() {
		this.direction = this.direction + 1;
	}
	
	public void desincrementAngulo() {
		this.direction = this.direction - 1;
	}
	
	void moverCoche() {
        double radianes = Math.toRadians(direction);
        this.X += this.velocidad * Math.cos(radianes);
        this.Y += this.velocidad * Math.sin(radianes);
    }

}
