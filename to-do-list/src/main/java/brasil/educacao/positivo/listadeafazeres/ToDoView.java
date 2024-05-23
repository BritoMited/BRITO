package brasil.educacao.positivo.listadeafazeres;


import brasil.educacao.positivo.listadeafazeres.UTIL.Util;

import java.util.Scanner;

public class ToDoView {
    public static void iniciar() {

        int op;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("################################");
            System.out.println("#             MENU             #");
            System.out.println("################################");
            System.out.println("0 - SAIR");
            System.out.println("1 -  CADASTRAR");
            System.out.println("2 -  ALTERAR");
            System.out.println("3 -  REMOVER");
            System.out.println("4 -  LISTAR");

            op = Util.lerOpcoesMenu(sc);


        }while(op !=0);



    }


    }

