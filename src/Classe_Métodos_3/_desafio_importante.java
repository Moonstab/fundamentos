package Classe_Métodos_3;
//desafio importante para entender a importancia e
//diferenciacao entre instanciar um objeto para ter
//acesso a uma variavel e como ter acesso a uma
//variavel estática que não é preciso de instanciamento

public class _desafio_importante {
    int a = 3;         // variavel sem STATIC
    static int b = 4; // variavel STATIC

    public static void main(String[] args) {
        //desafio = faça o codigo funcionar imprimindo a variável.
        _desafio_importante p = new _desafio_importante();

        //SOLUÇAO: sempre --> INSTANCIAR <-- um OBJETO
        //_desafio_importante p = new _desafio_importante();
        //sem criar a instancia, vocÊ não pode acessar o que
        // não está dentro do MAIN

        System.out.println(p.a);
        // deve utilizar o OBJETO p após criar a INSTANCIA
        // e ligála a variavel a

        System.out.println(b); //PODE ACESSAR ATRIBUTOS STATICS sem INSTANCIA
    }
}
