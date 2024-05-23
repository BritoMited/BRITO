package brasil.educacao.positivo.listadeafazeres;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import brasil.educacao.positivo.listadeafazeres.UTIL.Util;
import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("OLA MUNDO CARALHO");
        int op;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("################################");
            System.out.println("#             MENU             #");
            System.out.println("################################");
            System.out.println("0 - SAIR");
            System.out.println("1 -  TO DO LIST");

            op = Util.lerOpcoesMenu(sc);
            exibirView(sc ,op);

        }while(op !=0);
    }

    private static void exibirView(Scanner sc,int op){
        switch (op){
            case 0:
                System.out.println("kkkkkkkkkkk");
                break;
            case 1:
                    ToDoView.iniciar();
                break;
            case 99:
                System.out.println("precisa digitar um numero pora kk");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }


}