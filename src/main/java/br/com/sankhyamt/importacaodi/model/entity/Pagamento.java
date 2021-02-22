package br.com.sankhyamt.importacaodi.model.entity;

/**
 * @since v1.0
 * @version 1.0
 */
public class Pagamento {

    private String agenciaPagamento = "";
    private String bancoPagamento = "";
    private String codigoReceita = "";
    private String codigoTipoPagamento = "";
    private String contaPagamento = "";
    private String dataPagamento = "";
    private String nomeTipoPagamento = "";
    private String numeroRetificacao = "";
    private String valorJurosEncargos = "";
    private String valorMulta = "";
    private String valorReceita = "";

    public String getAgenciaPagamento() {
        return agenciaPagamento;
    }

    public void setAgenciaPagamento(String agenciaPagamento) {
        this.agenciaPagamento = agenciaPagamento;
    }

    public String getBancoPagamento() {
        return bancoPagamento;
    }

    public void setBancoPagamento(String bancoPagamento) {
        this.bancoPagamento = bancoPagamento;
    }

    public String getCodigoReceita() {
        return codigoReceita;
    }

    public void setCodigoReceita(String codigoReceita) {
        this.codigoReceita = codigoReceita;
    }

    public String getCodigoTipoPagamento() {
        return codigoTipoPagamento;
    }

    public void setCodigoTipoPagamento(String codigoTipoPagamento) {
        this.codigoTipoPagamento = codigoTipoPagamento;
    }

    public String getContaPagamento() {
        return contaPagamento;
    }

    public void setContaPagamento(String contaPagamento) {
        this.contaPagamento = contaPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getNomeTipoPagamento() {
        return nomeTipoPagamento;
    }

    public void setNomeTipoPagamento(String nomeTipoPagamento) {
        this.nomeTipoPagamento = nomeTipoPagamento;
    }

    public String getNumeroRetificacao() {
        return numeroRetificacao;
    }

    public void setNumeroRetificacao(String numeroRetificacao) {
        this.numeroRetificacao = numeroRetificacao;
    }

    public String getValorJurosEncargos() {
        return valorJurosEncargos;
    }

    public void setValorJurosEncargos(String valorJurosEncargos) {
        this.valorJurosEncargos = valorJurosEncargos;
    }

    public String getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(String valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getValorReceita() {
        return valorReceita;
    }

    public void setValorReceita(String valorReceita) {
        this.valorReceita = valorReceita;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "agenciaPagamento='" + agenciaPagamento + '\'' +
                ", bancoPagamento='" + bancoPagamento + '\'' +
                ", codigoReceita='" + codigoReceita + '\'' +
                ", codigoTipoPagamento='" + codigoTipoPagamento + '\'' +
                ", contaPagamento='" + contaPagamento + '\'' +
                ", dataPagamento='" + dataPagamento + '\'' +
                ", nomeTipoPagamento='" + nomeTipoPagamento + '\'' +
                ", numeroRetificacao='" + numeroRetificacao + '\'' +
                ", valorJurosEncargos='" + valorJurosEncargos + '\'' +
                ", valorMulta='" + valorMulta + '\'' +
                ", valorReceita='" + valorReceita + '\'' +
                '}';
    }
}
