package estruturas_de_controle_2;

public class _11_FOR_dentro_de_FOR {
    public static void main(String[] args) {

        //laço dentro de outro
        //quando o primeiro laço lança
        //ele executa o segundo laço (segundo for)
        //após rodar o segundo laço até o fim, ele vai pular
        //para o primeiro laço

        for (int i =0; i <10;i++) {
            for (int j =0;j<10;j++){
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}

//variavel criada dentro do for
//se torna RESTRITA AO FOR
//for (int i =0; i <=10;i++) {
//    System.out.println(i);
//}
//variavel criada FORA do for
//pode ser usada APÓS o for
//int i= 0;
//System.out.println("Saiu do for...");
//System.out.println(i);
