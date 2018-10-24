package Cadastros;

public class DuracaoHoras {
	private int horaTermino;
	private int horaInicio;
	private int duracaoHoras;
	private int minutosInicio;
	private int minutosTermino;
	
	DuracaoHoras(int horaInicio, int horaTermino, int duracaoHoras, int minutosInicio, int minutosTermino) {
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.duracaoHoras = duracaoHoras;
		this.minutosInicio = minutosInicio;
		this.minutosTermino = minutosTermino;
	}
	
	public int calculaDuracaoHoras() {
		CorridaNaoIniciada();
		CorridaIniciada();
		
		return duracaoHoras;
	}
	
	public void getDuracaoMenorQueUmaHora() {
		if (minutosTermino < minutosInicio)  //nao chegou a uma hora
			duracaoHoras = 0;
		else //durou pelo menos uma hora
			duracaoHoras = 1;
	}
	
	
	public void getDuracaoMaiorQueUmaHora() {
		if (horaTermino - horaInicio > 2) //
			duracaoHoras = horaTermino - horaInicio;
		else if (horaTermino - horaInicio == 2 &&   //certamente menos de duas horas  
				 minutosTermino < minutosInicio)    //e mais de uma hora
			duracaoHoras = 1;
		else //duracao de duas horas, certamente
			duracaoHoras = 2;
	}
	
	public void CorridaNaoIniciada() {
		if (horaTermino == horaInicio)
			duracaoHoras = 0;
		else if (horaTermino < horaInicio) 
			duracaoHoras = -1; //para casos em que a hora de termino nao foi registrada
	}
	
	public void CorridaIniciada() {
		if (horaTermino > horaInicio) //varias possibilidades... 
			if (horaTermino == horaInicio + 1) {  
				getDuracaoMenorQueUmaHora();
			} else { //possivelmente ultrapassou duas horas
				getDuracaoMaiorQueUmaHora();	
			}
	}
}
