package br.com.sankhyamt.importacaodi.model.entity;

/**
 * @since v1.0
 * @version 1.0
 */
public class Embalagem {

    private String codigoTipoEmbalagem;
    private String nomeEmbalagem;
    private String quantidadeVolume;

    public String getCodigoTipoEmbalagem() {
        return codigoTipoEmbalagem;
    }

    public void setCodigoTipoEmbalagem(String codigoTipoEmbalagem) {
        this.codigoTipoEmbalagem = codigoTipoEmbalagem;
    }

    public String getNomeEmbalagem() {
        return nomeEmbalagem;
    }

    public void setNomeEmbalagem(String nomeEmbalagem) {
        this.nomeEmbalagem = nomeEmbalagem;
    }

    public String getQuantidadeVolume() {
        return quantidadeVolume;
    }

    public void setQuantidadeVolume(String quantidadeVolume) {
        this.quantidadeVolume = quantidadeVolume;
    }

    @Override
    public String toString() {
        return "Embalagem{" +
                "codigoTipoEmbalagem='" + codigoTipoEmbalagem + '\'' +
                ", nomeEmbalagem='" + nomeEmbalagem + '\'' +
                ", quantidadeVolume='" + quantidadeVolume + '\'' +
                '}';
    }
}
