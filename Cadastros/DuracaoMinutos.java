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
			duracaoMinutos = minutosTermino - minutosInicio;
		else {
			duracaoMinutos = 60 - minutosInicio + minutosTermino;
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}
	
}
