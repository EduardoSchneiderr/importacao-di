package br.com.sankhyamt.importacaodi.model.entity;

/**
 * @since v1.0
 * @version 1.0
 */
public class Mercadoria {

    private String descricaoMercadoria = "";
    private String numeroSequenciaItem = "";
    private String quantidade = "";
    private String unidadeMedida = "";
    private String vlrUnitario = "";

    public String getDescricaoMercadoria() {
        return descricaoMercadoria;
    }

    public void setDescricaoMercadoria(String descricaoMercadoria) {
        this.descricaoMercadoria = descricaoMercadoria;
    }

    public String getNumeroSequenciaItem() {
        return numeroSequenciaItem;
    }

    public void setNumeroSequenciaItem(String numeroSequenciaItem) {
        this.numeroSequenciaItem = numeroSequenciaItem;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(String vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    @Override
    public String toString() {
        return "Mercadoria{" +
                "descricaoMercadoria='" + descricaoMercadoria + '\'' +
                ", numeroSequenciaItem='" + numeroSequenciaItem + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", vlrUnitario='" + vlrUnitario + '\'' +
                '}';
    }
}
