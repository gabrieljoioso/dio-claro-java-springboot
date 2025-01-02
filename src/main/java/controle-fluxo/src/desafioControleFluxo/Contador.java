package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parametro deve ser maior que o primeiro!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;

            //realizar o for para imprimir os números com base na variável contagem
            for(int contador = 0; contador < contagem; contador++){
                System.out.println("Contagem em " + (contador+1));
            }
        }
        else{
            throw new ParametrosInvalidosException();
        }
	}
}