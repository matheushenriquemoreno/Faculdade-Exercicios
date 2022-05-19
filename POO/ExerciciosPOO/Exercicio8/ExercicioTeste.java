package Exercicio8;

public class ExercicioTeste {

	public static void main(String[] args) {
		
			Televisao sansung4k = new Televisao(10);
		
			ControleRemoto controle = new ControleRemoto(sansung4k);
				
			controle.aumentaCanal();
			controle.aumentaCanal();
			controle.aumentaCanal();
			
			System.out.println("Canal atual = " + controle.canalAtual());
			
			controle.diminuiCanal();
			
			System.out.println("Canal atual = " + controle.canalAtual());
			
			controle.aumentaVolume();
			controle.aumentaVolume();
			controle.aumentaVolume();
			
			System.out.println("Volume atual = " + controle.volumeAtual());
			controle.diminuiVolume();
			
			System.out.println("Volume atual = " + controle.volumeAtual());
			
			controle.mudaCanalDesejado(8);
			System.out.println("Canal atual apos mudar = " + controle.canalAtual());
			controle.mudaCanalDesejado(11);
			System.out.println("Canal atual apos mudar = " + controle.canalAtual());
			
			System.out.println("dados Televisao: \n"+sansung4k);
	}

}
