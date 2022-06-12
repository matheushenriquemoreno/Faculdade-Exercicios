package Exercicio1;

import java.util.ArrayList;

public class CursoEspecializado extends Curso {

	private boolean latoSensu;
	private double adicionalDiploma;
	
	public CursoEspecializado(int codigo, int cargaHoraria, int sala,String nomeCurso, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos, boolean latoSensu) {
		super(codigo, cargaHoraria, sala,nomeCurso, nomeProfessor, valorCurso, alunos);
		this.latoSensu = latoSensu;
	}

	public boolean isLatoSensu() {
		return latoSensu;
	}

	public void setLatoSensu(boolean latoSensu) {
		this.latoSensu = latoSensu;
	}

	public double getAdicionaDiploma() {
		return adicionalDiploma;
	}

	public void setAdicionalDiploma() {
		if(getAlunos().size() <= 10) {
			adicionalDiploma = 25.00;
		}
		else if(getAlunos().size() <= 30) {
			adicionalDiploma = 20.00;
		}
		else {
			adicionalDiploma = 28.00;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " lato Sensu = " + latoSensu;
	}
	
	
}
