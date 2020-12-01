package estruturas_de_controle_2;

public class _13_SWITCH_01 {
    public static void main(String[] args) {
        String faixa = "preta";

        //faixa de jiu jitsu
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Oss, mestre.");
                break;
            case "marrom":
                System.out.println("6 anos, já tá cascudo.");
                break;
            case "roxa":
                System.out.println("4 anos de surra.");
                break;
            case "azul":
                System.out.println("2 anos lutando, já pode dar mão de vaca.");
                break;
            case "branca":
                System.out.println("Tu é um bosta.");
                break;
            default:
                System.out.println("Não começou a treinar.");
        }
        System.out.println("Fim!");
    }
}
