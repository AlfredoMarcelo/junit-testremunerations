package testremuneraciones;

public class LiquidacionSueldo {
	
	private Colaborador colaborador;
	
	//Constructor
	public LiquidacionSueldo(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	public int calcularMontoNoImponible() {
		return colaborador.getColacion() + colaborador.getMovilizacion(); 
	}
}
