package fundamentos;


import java.util.Date;

public class _7_import {

    public static void main(String[] args) {
        java.lang.String b = "Boa tarde";
        System.out.println(b);

        String s = "Bom dia";
        System.out.println(s);

        /*Dentro do IntelliJ, o import
        é automático quando você seleciona
        exemplo, import do Date, ele aponta
        no início do código como mostrado no
        após o anúncio de pacote*/

        Date d = new Date();
        System.out.println(d);

    }
}
