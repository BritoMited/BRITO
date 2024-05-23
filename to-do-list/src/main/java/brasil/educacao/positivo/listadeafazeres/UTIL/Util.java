package brasil.educacao.positivo.listadeafazeres.UTIL;

import brasil.educacao.positivo.listadeafazeres.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    private static final Logger logger = LogManager.getLogger(Util.class);
    public static int lerOpcoesMenu(Scanner sc){
        logger.info("iniciando o processo de leitura do console");
        try{
            int op = sc.nextInt();
            return op;
        }catch (InputMismatchException e){
            logger.error("Erro ao ler o console, input diferente de Int", e);
            sc.next();
            return 99;
        }
    }

}
