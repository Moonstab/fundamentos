package fundamentos;

public class _06_notação_ponto {

    public static void main(String[] args) {

        /*Uso do "." para separar sempre os
        tipos de comandos nas
        sentenças dos códigos*/

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);


        String x = "Axel".toUpperCase();
        System.out.println(x);

        /*O modo que o Ponto pode ser usado
        na mesma linha (antes do ;)
        para alterar alguma variável
        ou adicionar alguma sentença de comando*/

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!");
        System.out.println(y);


        int a = 3;
        System.out.println(a);
    }
}
