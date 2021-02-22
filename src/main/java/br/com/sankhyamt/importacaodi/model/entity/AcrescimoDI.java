package br.com.sankhyamt.importacaodi.model.entity;

/**
 * Representa a tag acréscimo.
 *
 * @since v1.0
 * @version 1.0
 */
public class AcrescimoDI {

    private String codigoAcrescimo = "";
    private String denominacao = "";
    private String codMoedaNegociada = "";
    private String nomeMoedaNegociada = "";
    private String valorMoedaNegociada = "";
    private String valorReais = "";

    public String getCodigoAcrescimo() {
        return codigoAcrescimo;
    }

    public void setCodigoAcrescimo(String codigoAcrescimo) {
        this.codigoAcrescimo = codigoAcrescimo;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String getCodMoedaNegociada() {
        return codMoedaNegociada;
    }

    public void setCodMoedaNegociada(String codMoedaNegociada) {
        this.codMoedaNegociada = codMoedaNegociada;
    }

    public String getNomeMoedaNegociada() {
        return nomeMoedaNegociada;
    }

    public void setNomeMoedaNegociada(String nomeMoedaNegociada) {
        this.nomeMoedaNegociada = nomeMoedaNegociada;
    }

    public String getValorMoedaNegociada() {
        return valorMoedaNegociada;
    }

    public void setValorMoedaNegociada(String valorMoedaNegociada) {
        this.valorMoedaNegociada = valorMoedaNegociada;
    }

    public String getValorReais() {
        return valorReais;
    }

    public void setValorReais(String valorReais) {
        this.valorReais = valorReais;
    }

    @Override
    public String toString() {
        return "AcrescimoDI{" +
                "codigoAcrescimo=" + codigoAcrescimo +
                ", denominacao='" + denominacao + '\'' +
                ", codMoedaNegociada=" + codMoedaNegociada +
                ", nomeMoedaNegociada='" + nomeMoedaNegociada + '\'' +
                ", valorReais=" + valorReais +
                '}';
    }
}
