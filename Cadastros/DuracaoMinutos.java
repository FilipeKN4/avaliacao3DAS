package Cadastros;

public class DuracaoMinutos {
	private int minutosTermino;
	private int minutosInicio;
	private int duracaoMinutos;
	
	DuracaoMinutos(int minutosTermino, int minutosInicio, int duracaoMinutos) {
		this.minutosTermino = minutosTermino;
		this.minutosInicio = minutosInicio;
		this.duracaoMinutos = duracaoMinutos;
	}
	
	public int calculaDuracaoMinutos() {
		if (minutosTermino > minutosInicio) 
			getMinutosTerminoMaiorQueInicio();
		else {
			getMinutosInicioMaiorQueTermino();
		}
		
		return duracaoMinutos;
	}
	
	public void getMinutosTerminoMaiorQueInicio() {
		duracaoMinutos = minutosTermino - minutosInicio;
	}
	
	public void getMinutosInicioMaiorQueTermino() {
		duracaoMinutos = 60 - minutosInicio + minutosTermino;
		if (duracaoMinutos == 60) //caso especial
			duracaoMinutos = 0;
	}
}
