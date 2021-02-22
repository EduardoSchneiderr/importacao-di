package br.com.sankhyamt.importacaodi;

import br.com.sankhyamt.importacaodi.service.DeclaracaoImportacaoService;
import org.jdom2.Document;

import java.io.File;
import java.io.IOException;

/**
 * Classe principal da aplicação.
 */
public class Main {

    public static void main(String[] args) throws IOException {


        String dir = "C:\\Conversor_DI\\xmlDI\\";

        File diretorio = new File(dir);

        try {
            String[] arquivos = diretorio.list();

            for (int i = 0; i < arquivos.length; i++) {

                System.out.println("Convertendo arquivo ".concat(arquivos[i]));
                Document document = DeclaracaoImportacaoService.loadXML(dir + arquivos[i]);

                DeclaracaoImportacaoService.manipulateXML(document);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        System.out.println("\nArquivos convertidos com sucesso!");
        System.in.read();
    }
}