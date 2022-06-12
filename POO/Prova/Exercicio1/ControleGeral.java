package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleGeral {
	
	public static Scanner entrada = new Scanner(System.in);
	public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static ArrayList<Curso> cursos = new ArrayList<Curso>();
	public static ArrayList<CursoEspecializado> cursosEspecializacao = new ArrayList<CursoEspecializado>();
	public static ArrayList<CursoMestrado> cursoMestrado = new ArrayList<CursoMestrado>();
	public static ArrayList<Curso> todosCursos = new ArrayList<Curso>(); 
	
	public static void main(String[] args) {
		populaDadosIniciais();
		opcoes();
	}
	
	public static void opcoes() {
		System.out.println("\nSelecione dentre as opções:");
		System.out.println("Cadastro Curso - 1");
		System.out.println("Cadastro Aluno - 2");
		System.out.println("Escolher qual ArrayLists para mostrar informação - 3");
		System.out.println("Buscar tipo do curso pelo nome - 4");
		System.out.println("Mostrar todos os cursos - 5");
		System.out.println("Mostrar todos os alunos - 6");
		System.out.print("digite opção desejada: ");
		int opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
			cadastroCursos();
			opcoes();
		case 2:
			cadastroAluno();
			opcoes();

		case 3:
			retornaArrayListsPorNome();
			opcoes();

		case 4: 
			retornaTipoCursoPorTitulo();
			opcoes();

		case 5:
			retornaTodosCursos();
			opcoes();
		case 6: 
			System.out.println("Todos alunos");
			printaArrayList(alunos);
			opcoes();
		default:
			System.out.println("Ate mais!");
			break;
		}
	}
	
	public static  void retornaTodosCursos() {
		System.out.println("Todos cursos: ");
		adicionaTodosCursos();
		printaArrayList(todosCursos);
	}
	
	public static void retornaTipoCursoPorTitulo() {
		adicionaTodosCursos();
		limpaBuffer();
		
		System.out.println("Digite o nome do curso: ");
		String nomeCurso = entrada.nextLine();
		
		for(Curso curso : todosCursos) {
			if(curso.getNomeCurso().equalsIgnoreCase(nomeCurso)) {
				System.out.println("Tipo do curso pesquisado = " + curso.getClass().getSimpleName());
			}
		}
		System.out.println("não encontrado");
	}
	
	
	public static void retornaArrayListsPorNome() {
		limpaBuffer();
		
		System.out.println("Deseja Mostrar os dados de quais entidades: \n(Aluno, Curso, CursoEspecializacao, CursoMestrado)");
		String nomeLista = entrada.nextLine();
		
		if(nomeLista.equalsIgnoreCase("aluno")) {
			
			System.out.println("Visao alunos");
			printaArrayList(alunos);
		}
		else if(nomeLista.equalsIgnoreCase("Curso")) {
			
			System.out.println("Visao de Cursos");
			printaArrayList(cursos);
		}
		else if(nomeLista.equalsIgnoreCase("CursoEspecializacao")) {
			
			System.out.println("Visao Cursos de Especializacao");
			printaArrayList(cursosEspecializacao);
		}
		else if (nomeLista.equalsIgnoreCase("CursoMestrado")){
			
			System.out.println("Visao Cursos de Mestrado");
			printaArrayList(cursoMestrado);
		}
		else {
			System.out.println("Nome digitado errado.");
		}
	}
	
	public static void cadastroCursos() {
		limpaBuffer();
		
		System.out.println("Qual tipo de curso deseja cadastrar (Curso, Especializacao, Mestrado) ?");
		String tipoCurso = entrada.nextLine();	
		
		System.out.println("Titulo: ");
		String tituloCurso = entrada.nextLine();
		
		System.out.println("Nome Professor: ");
		String nomeProfessor = entrada.nextLine();
		
		System.out.println("Codigo: ");
		int codigo = entrada.nextInt();
		
		System.out.println("Carga Horaria: ");
		int cargaHoraria = verificaCargaHoraria(entrada.nextInt());
		
		System.out.println("Sala: ");
		int sala = entrada.nextInt();
		
		System.out.println("Valor do curso: ");
		double valorCurso = verificaValorCurso(entrada.nextDouble());
		
		if(tipoCurso.equalsIgnoreCase("Especializacao")) {
			
			limpaBuffer();
			
			System.out.println("possui Lato Sensu?  (sim,não)");
			boolean latoSensu = entrada.nextLine().equalsIgnoreCase("sim") ? true : false;
			
			cursosEspecializacao.add(new CursoEspecializado(codigo, cargaHoraria, sala, tituloCurso, nomeProfessor, valorCurso, alunos, latoSensu));
		}
		else if(tipoCurso.equalsIgnoreCase("Mestrado")){
			
			limpaBuffer();
			
			System.out.println("possui Stricto Sensu?  (sim,não)");
			boolean strictoSensu = entrada.nextLine().equalsIgnoreCase("sim") ? true : false;
			
			cursoMestrado.add(new CursoMestrado(codigo, cargaHoraria, sala, tituloCurso, nomeProfessor, valorCurso, alunos, strictoSensu));
		}
		else {
			cursos.add(new Curso(codigo, cargaHoraria, sala, tituloCurso, nomeProfessor, valorCurso, alunos));
		}
	}
		
	public static void cadastroAluno() {
		limpaBuffer();
		
		String reservista;
		
		System.out.println("Cadastro de Aluno:");
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("CPF: ");
		String CPF = validaCPF(entrada.nextLine());
		
		System.out.println("Endereco: ");
		String endereco = entrada.nextLine();
		
		System.out.println("codigo do aluno:");
		int codigo = entrada.nextInt();
		
		System.out.println("Idade:");
		int idade = entrada.nextInt();
		
		System.out.println("Sexo (F/M):");
		char sexo = entrada.next().charAt(0);
		
		if(sexo == 'M' || sexo == 'm') {
			
		limpaBuffer();
			
		System.out.println("digite o numero da Reservista: ");
		reservista = validaReservista(entrada.nextLine());
		
		alunos.add(new AlunoMasculino(codigo, idade, nome, CPF, endereco, false, new Notas(), reservista));
		}
		else {	
			alunos.add(new Aluno(codigo, idade, nome, CPF, endereco, true, new Notas()));
		}

	}
	
	public static Notas cadastroNotas() {
		System.out.println("Cadastro de notas: ");
		
		System.out.println("Nota 1:");
		double nota1 = validaNota(entrada.nextDouble());
		System.out.println("Nota 2:");
		double nota2 = validaNota(entrada.nextDouble());
		System.out.println("nota 3:");
		double nota3 = validaNota(entrada.nextDouble());
		
		return new Notas(nota1, nota2, nota3);
	}
	
	public static void populaDadosIniciais(){
		
		alunos.add(new AlunoMasculino(1234, 21, "Matheus", "12345678910", "Avenida v3", false, new Notas(), "12345"));
		alunos.add(new Aluno(1235, 21, "Matheus", "12345678910", "Avenida v4", false, new Notas()));
		
		cursos.add(new Curso(10, 2, 15, "Curso POO", "Marcelo", 10.20, alunos));
		cursos.add(new Curso(12, 5, 6, "Curso Algoritimos", "Fernando", 10.20, alunos));
		
		cursosEspecializacao.add(new CursoEspecializado(13, 5, 1, "Curso solid", "Marcelo", 300, alunos, false));
		cursosEspecializacao.add(new CursoEspecializado(14, 20, 23, "Curso Padrão de projetos", "Carlos", 800, alunos, true));
		
		cursoMestrado.add(new CursoMestrado(15, 10, 30, "Desenvolvimento web", "Douglas", 530, alunos, false));
		cursoMestrado.add(new CursoMestrado(16, 20, 2, "DevOps", "Bruno hurbano", 10000000, alunos, true));
		
	}
	
	private static double validaNota(double nota){
		while(nota < 0 || nota > 10) {
			System.out.println("Erro nota Invalida! Digite novamente: ");
			nota = entrada.nextDouble();
		}
		return nota;
	}
	
	private static String validaCPF(String cpf) {
		
		while(cpf.length() < 11 || cpf.length() > 12){
			System.out.println("CPF Invalido digite novamente: ");
			cpf = entrada.nextLine();
		}
		
		return cpf;
	}
	
	private static String validaReservista(String reservista) {
		while(reservista.length() < 5) {
			System.out.println("Reservista deve possuir no mínimo 5 caracteres. \ndigite novamente: ");
			reservista = entrada.nextLine();
		}
	
		return reservista;
	}
	
	private static int verificaCargaHoraria(int cargaHoraria) {
		while(cargaHoraria <= 0) {
			System.out.println("Carga horaria Invalida! \nDigite novamente: ");
			cargaHoraria = entrada.nextInt();
		}
		return cargaHoraria;
	}
	
	private static double verificaValorCurso(double valor) {
		while(valor <= 0.0) {
			System.out.println("Valor curso Invalido! \nDigite novamente: ");
			valor = entrada.nextDouble();
		}
		return valor;
	}
	
	private static <T> void printaArrayList(ArrayList<T> lista){
		for(T entidade : lista) { 
			System.out.println(entidade);
			System.out.println("-------------------------------------");
		}
	}
	
	private static void adicionaTodosCursos() {
		todosCursos.addAll(cursosEspecializacao);
		todosCursos.addAll(cursoMestrado);
		todosCursos.addAll(cursos);
	}
	
	private static void limpaBuffer() {
		entrada.nextLine();
	}	
}