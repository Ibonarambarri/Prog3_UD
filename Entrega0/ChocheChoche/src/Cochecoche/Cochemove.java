package Cochecoche;

public class Cochemove extends Coche {
    Cochelavel cocheL = new Cochelavel();

	@Override
	public void setPosX(double X) {
		super.setPosX(X);
		cocheL.setBounds((int)X, (int)X, 100, 100);
	}



	@Override
	public void setPosY(double Y) {
		super.setPosY(Y);
		cocheL.setBounds((int)X, (int)Y, 100, 100);
	}



	@Override
	public void mueve(double tiempoDeMovimiento) {
		super.mueve(tiempoDeMovimiento);
		cocheL.setBounds((int)X, (int)Y, 100, 100);
    }
	public String toString() {
		return super.toString();
	}
    
}
