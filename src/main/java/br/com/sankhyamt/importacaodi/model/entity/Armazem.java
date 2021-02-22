package br.com.sankhyamt.importacaodi.model.entity;

/**
 * @since v1.0
 * @version 1.0
 */
public class Armazem {

    private String nomeArmazem = "";

    public String getNomeArmazem() {
        return nomeArmazem;
    }

    public void setNomeArmazem(String nomeArmazem) {
        this.nomeArmazem = nomeArmazem;
    }

    @Override
    public String toString() {
        return "Armazem{" +
                "nomeArmazem='" + nomeArmazem + '\'' +
                '}';
    }
}
