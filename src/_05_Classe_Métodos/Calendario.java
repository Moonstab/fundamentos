package _05_Classe_Métodos;

public class Calendario {
    int mes;
    int dia;
    int ano;


    Calendario() {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        //this(); chama o metodo declarado sem ter que
        //declarar os atributos um a um como foi feito acima
        this(1, 1, 1970);
    }

    Calendario(int diaInicial, int mesInicial, int anoInicial) {
        this.dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    public String obterDataFormatada() {//metodo return é o mais recomendado
        return String.format("%d/%d/%d\n", this.dia, mes, ano);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Calendario(dia, mes, ano);
    }

    //segundo exemplo usando a função acima
    //este metodo não irá funcionar em aplicação desktop + UL + mobile
    //funciona apenas em terminal, por isso o método acima é o mais indicado
    void imprimirDataFormatada() {
        System.out.printf(this.obterDataFormatada());
    }
}

