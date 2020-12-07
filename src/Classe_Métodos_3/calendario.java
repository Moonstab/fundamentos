package Classe_Métodos_3;

public class calendario {
    int mes;
    int dia;
    int ano;

    String obterDataFormatada (){//metodo return é o mais recomendado
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

    calendario() {
        //caso os parametros não sejam especificados, será
        //impresso a data 1/1/1970
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    calendario(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }









    //segundo exemplo usando a função acima
    //este metodo não irá funcionar em aplicação desktop + UL + mobile
    //funciona apenas em terminal, por isso o método acima é o mais indicado
    void imprimirDataFormatada(){
        System.out.printf(obterDataFormatada());
    }
}

