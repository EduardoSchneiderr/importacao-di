package br.com.sankhyamt.importacaodi.model.entity;

/**
 * @since v1.0
 * @version 1.0
 */
public class InstrucaoDespacho {

    public Integer teste(int a, int b){
        return a + b;
    }

    private String codigoTipoDocumentoDespacho;
    private String nomeDocumentoDespacho;
    private String numeroDocumentoDespacho;

    public String getCodigoTipoDocumentoDespacho() {
        return codigoTipoDocumentoDespacho;
    }

    public void setCodigoTipoDocumentoDespacho(String codigoTipoDocumentoDespacho) {
        this.codigoTipoDocumentoDespacho = codigoTipoDocumentoDespacho;
    }

    public String getNomeDocumentoDespacho() {
        return nomeDocumentoDespacho;
    }

    public void setNomeDocumentoDespacho(String nomeDocumentoDespacho) {
        this.nomeDocumentoDespacho = nomeDocumentoDespacho;
    }

    public String getNumeroDocumentoDespacho() {
        return numeroDocumentoDespacho;
    }

    public void setNumeroDocumentoDespacho(String numeroDocumentoDespacho) {
        this.numeroDocumentoDespacho = numeroDocumentoDespacho;
    }

    @Override
    public String toString() {
        return "InstrucaoDespacho{" +
                "codigoTipoDocumentoDespacho='" + codigoTipoDocumentoDespacho + '\'' +
                ", nomeDocumentoDespacho='" + nomeDocumentoDespacho + '\'' +
                ", numeroDocumentoDespacho='" + numeroDocumentoDespacho + '\'' +
                '}';
    }
}
