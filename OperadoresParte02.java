package flamingo.aprendendo.basico;

public class OperadoresParte02 {

    /*
    * < menor que
    * > maior que
    * <= menor ou igual
    * >= maior ou igual
    * == igual a
    * != diferente de
    * */
    public static void main(String[] args) {
        byte idadeMae = 50;
        byte idadeVó = 60;
        byte idadeTia = 40;
        System.out.println(idadeMae < idadeVó);
        System.out.println(idadeMae > idadeVó);
        System.out.println(idadeMae == idadeTia);
        System.out.println(idadeMae <= idadeTia);
        System.out.println(idadeMae >= idadeTia);
        System.out.println(idadeMae != idadeTia);
    }
}
