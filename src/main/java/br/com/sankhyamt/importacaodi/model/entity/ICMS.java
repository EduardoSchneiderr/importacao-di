package br.com.sankhyamt.importacaodi.model.entity;

/**
 * @since v1.0
 * @version 1.0
 */
public class ICMS {

    private String agenciaIcms;
    private String bancoIcms;
    private String codigoTipoRecolhimentoIcms;
    private String cpfResponsavelRegistro;
    private String dataRegistro;
    private String horaRegistro;
    private String nomeTipoRecolhimentoIcms;
    private String numeroSequencialIcms;
    private String ufIcms;
    private String valorTotalIcms;

    public String getAgenciaIcms() {
        return agenciaIcms;
    }

    public void setAgenciaIcms(String agenciaIcms) {
        this.agenciaIcms = agenciaIcms;
    }

    public String getBancoIcms() {
        return bancoIcms;
    }

    public void setBancoIcms(String bancoIcms) {
        this.bancoIcms = bancoIcms;
    }

    public String getCodigoTipoRecolhimentoIcms() {
        return codigoTipoRecolhimentoIcms;
    }

    public void setCodigoTipoRecolhimentoIcms(String codigoTipoRecolhimentoIcms) {
        this.codigoTipoRecolhimentoIcms = codigoTipoRecolhimentoIcms;
    }

    public String getCpfResponsavelRegistro() {
        return cpfResponsavelRegistro;
    }

    public void setCpfResponsavelRegistro(String cpfResponsavelRegistro) {
        this.cpfResponsavelRegistro = cpfResponsavelRegistro;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(String horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public String getNomeTipoRecolhimentoIcms() {
        return nomeTipoRecolhimentoIcms;
    }

    public void setNomeTipoRecolhimentoIcms(String nomeTipoRecolhimentoIcms) {
        this.nomeTipoRecolhimentoIcms = nomeTipoRecolhimentoIcms;
    }

    public String getNumeroSequencialIcms() {
        return numeroSequencialIcms;
    }

    public void setNumeroSequencialIcms(String numeroSequencialIcms) {
        this.numeroSequencialIcms = numeroSequencialIcms;
    }

    public String getUfIcms() {
        return ufIcms;
    }

    public void setUfIcms(String ufIcms) {
        this.ufIcms = ufIcms;
    }

    public String getValorTotalIcms() {
        return valorTotalIcms;
    }

    public void setValorTotalIcms(String valorTotalIcms) {
        this.valorTotalIcms = valorTotalIcms;
    }

    @Override
    public String toString() {
        return "ICMS{" +
                "agenciaIcms='" + agenciaIcms + '\'' +
                ", bancoIcms='" + bancoIcms + '\'' +
                ", codigoTipoRecolhimentoIcms='" + codigoTipoRecolhimentoIcms + '\'' +
                ", cpfResponsavelRegistro='" + cpfResponsavelRegistro + '\'' +
                ", dataRegistro='" + dataRegistro + '\'' +
                ", horaRegistro='" + horaRegistro + '\'' +
                ", nomeTipoRecolhimentoIcms='" + nomeTipoRecolhimentoIcms + '\'' +
                ", numeroSequencialIcms='" + numeroSequencialIcms + '\'' +
                ", ufIcms='" + ufIcms + '\'' +
                ", valorTotalIcms='" + valorTotalIcms + '\'' +
                '}';
    }
}
