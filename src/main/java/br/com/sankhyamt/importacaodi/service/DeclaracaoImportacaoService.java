package br.com.sankhyamt.importacaodi.service;

import br.com.sankhyamt.importacaodi.model.entity.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.util.*;

/**
 * @version 1.1
 * @since v1.0
 */
public class DeclaracaoImportacaoService {

    /**
     * Carrega o arquivo XML.
     *
     * @return Retorna o elemento Root do XML
     * @throws Exception
     * @since v1.0
     */
    public static Document loadXML(String arquivo) throws Exception {

        Document document = null;

        SAXBuilder builderXML = new SAXBuilder();

        try {

            document = builderXML.build(arquivo);

        } catch (JDOMException | IOException e) {

            throw new Exception("Erro ao carregar XML :".concat(e.getMessage()));
        }


        return document;
    }

    /**
     * Faz a leitura das tags do xml.
     * @since v1.0
     * @param di
     */
    public static void manipulateXML(Document di) {

        Element xml = di.getRootElement();
        Element declaracoes = xml.getChild("declaracaoImportacao");

        try {

            // Interage com os dados da adição
            AdicaoDI adicaoDI = new AdicaoDI();
            Element adicao = declaracoes.getChild("adicao");

            // Percorre o XML e busca dados da DI
            if (adicao.getChildText("antidumpingAliquotaAdValorem") != null) {
                adicaoDI.setAntidumpingAliqAdValor(adicao.getChildText("antidumpingAliquotaAdValorem").trim());
            }
            if (adicao.getChildText("antidumpingAliquotaBaseCalculo") != null) {
                adicaoDI.setAntidumpingAliqBaseCalculo(adicao.getChildText("antidumpingAliquotaBaseCalculo").trim());
            }
            if (adicao.getChildText("antidumpingAliquotaEspecificaQuantidadeUnidade") != null) {
                adicaoDI.setAntidumpingEspecificaQtdUnidade(adicao.getChildText("antidumpingAliquotaEspecificaQuantidadeUnidade").trim());
            }
            if (adicao.getChildText("antidumpingAliquotaEspecificaValor") != null) {
                adicaoDI.setAntidumpingEspecificaValor(adicao.getChildText("antidumpingAliquotaEspecificaValor").trim());
            }
            if (adicao.getChildText("antidumpingAliquotaValorDevido") != null) {
                adicaoDI.setAntidumpingValorDevido(adicao.getChildText("antidumpingAliquotaValorDevido").trim());
            }
            if (adicao.getChildText("antidumpingAliquotaValorRecolher") != null) {
                adicaoDI.setAntidumpingValorRecolher(adicao.getChildText("antidumpingAliquotaValorRecolher").trim());
            }
            if (adicao.getChildText("antidumpingAtoLegalAno") != null) {
                adicaoDI.setAntidumpingAtoLegalAno(adicao.getChildText("antidumpingAtoLegalAno").trim());
            }
            if (adicao.getChildText("antidumpingAtoLegalCodigo") != null) {
                adicaoDI.setAntidumpingAtoLegalCodigo(adicao.getChildText("antidumpingAtoLegalCodigo").trim());
            }
            if (adicao.getChildText("antidumpingAtoLegalEX") != null) {
                adicaoDI.setAntidumpingAtoLegalEX(adicao.getChildText("antidumpingAtoLegalEX").trim());
            }
            if (adicao.getChildText("antidumpingAtoLegalNumero") != null) {
                adicaoDI.setAntidumpingAtoLegalNumero(adicao.getChildText("antidumpingAtoLegalNumero").trim());
            }
            if (adicao.getChildText("antidumpingAtoLegalOrgaoEmissor") != null) {
                adicaoDI.setAntidumpingAtoLegalOrgaoEmissor(adicao.getChildText("antidumpingAtoLegalOrgaoEmissor").trim());
            }
            adicaoDI.setCideValorAliqEspecifica(adicao.getChildText("cideValorAliquotaEspecifica").trim());
            adicaoDI.setCideValorDevido(adicao.getChildText("cideValorDevido").trim());
            adicaoDI.setCideValorRecolher(adicao.getChildText("cideValorRecolher").trim());
            adicaoDI.setCodRelacaoCompradorVendedor(adicao.getChildText("cideValorRecolher").trim());
            adicaoDI.setCodVinculoCompradorVendedor(adicao.getChildText("codigoVinculoCompradorVendedor").trim());
            adicaoDI.setCofinsAliqAdValor(adicao.getChildText("cofinsAliquotaAdValorem").trim());
            adicaoDI.setCofinsAliqEspecificaQtdUnidade(adicao.getChildText("cofinsAliquotaEspecificaQuantidadeUnidade").trim());
            adicaoDI.setCofinsAliqEspecificaValor(adicao.getChildText("cofinsAliquotaEspecificaValor").trim());
            adicaoDI.setCofinsAliqReduzida(adicao.getChildText("cofinsAliquotaReduzida").trim());
            adicaoDI.setCofinsAqliqValorDevido(adicao.getChildText("cofinsAliquotaValorDevido").trim());
            adicaoDI.setCofinsAliqValorRecolher(adicao.getChildText("cofinsAliquotaValorRecolher").trim());
            adicaoDI.setCondicaoVendaIncoterm(adicao.getChildText("condicaoVendaIncoterm").trim());
            adicaoDI.setCondicaoVendaLocal(adicao.getChildText("condicaoVendaLocal").trim());
            adicaoDI.setCondicaoVendaMetodoValoracaoCodigo(adicao.getChildText("condicaoVendaMetodoValoracaoCodigo").trim());
            adicaoDI.setCodicaoVendaMetodoValoracaoNome(adicao.getChildText("condicaoVendaMetodoValoracaoNome").trim());
            adicaoDI.setCondicaoVendaMoedaCodigo(adicao.getChildText("condicaoVendaMoedaCodigo").trim());
            adicaoDI.setCondicaoVendaMoedaNome(adicao.getChildText("condicaoVendaMoedaNome").trim());
            adicaoDI.setCondicaoVendaValorMoeda(adicao.getChildText("condicaoVendaValorMoeda").trim());
            adicaoDI.setCondicaoVendaValorReais(adicao.getChildText("condicaoVendaValorReais").trim());
            adicaoDI.setDadosCambiaisCoberturaCambialCodigo(adicao.getChildText("dadosCambiaisCoberturaCambialCodigo").trim());
            adicaoDI.setDadosCambiaisCoberturaCambialNome(adicao.getChildText("dadosCambiaisCoberturaCambialNome").trim());
            adicaoDI.setDadosCambiaisInstituicaoFinanciadoraCodigo(adicao.getChildText("dadosCambiaisInstituicaoFinanciadoraCodigo").trim());
            adicaoDI.setDadosCambiaisInstituicaoFinanciadoraNome(adicao.getChildText("dadosCambiaisInstituicaoFinanciadoraNome").trim());
            adicaoDI.setDadosCambiaisMotivoSemCoberturaCodigo(adicao.getChildText("dadosCambiaisMotivoSemCoberturaCodigo").trim());
            adicaoDI.setDadosCambiaisMotivoSemCoberturaNome(adicao.getChildText("dadosCambiaisMotivoSemCoberturaNome").trim());
            adicaoDI.setDadosCambiaisValorRealCambio(adicao.getChildText("dadosCambiaisValorRealCambio").trim());
            adicaoDI.setDadosCargaPaisProcedenciaCodigo(adicao.getChildText("dadosCargaPaisProcedenciaCodigo").trim());
            adicaoDI.setDadosCargaUrfEntradaCodigo(adicao.getChildText("dadosCargaUrfEntradaCodigo").trim());
            adicaoDI.setDadosCargaViaTransporteCodigo(adicao.getChildText("dadosCargaViaTransporteCodigo").trim());
            adicaoDI.setDadosMercadoriaAplicacao(adicao.getChildText("dadosMercadoriaAplicacao").trim());
            adicaoDI.setDadosMercadoriaCodigoNaladiNCCA(adicao.getChildText("dadosMercadoriaCodigoNaladiNCCA").trim());
            adicaoDI.setDadosMercadoriaCodigoNaladiSH(adicao.getChildText("dadosMercadoriaCodigoNaladiSH").trim());
            adicaoDI.setDadosMercadoriaCodigoNcm(adicao.getChildText("dadosMercadoriaCodigoNcm").trim());
            adicaoDI.setDadosMercadoriaCondicao(adicao.getChildText("dadosMercadoriaCondicao").trim());
            adicaoDI.setDadosMercadoriaMedidaEstatisticaQuantidade(adicao.getChildText("dadosMercadoriaMedidaEstatisticaQuantidade").trim());
            adicaoDI.setDadosMercadoriaNomeNcm(adicao.getChildText("dadosMercadoriaNomeNcm").trim());
            adicaoDI.setDadosMercadoriaPesoLiquido(adicao.getChildText("dadosMercadoriaPesoLiquido").trim());
            adicaoDI.setDcrCoeficienteReducao(adicao.getChildText("dcrCoeficienteReducao").trim());
            adicaoDI.setDcrIdentificacao(adicao.getChildText("dcrIdentificacao").trim());
            adicaoDI.setDcrValorDevido(adicao.getChildText("dcrValorDevido").trim());
            adicaoDI.setDcrValorDolar(adicao.getChildText("dcrValorDolar").trim());
            adicaoDI.setDcrValorReal(adicao.getChildText("dcrValorReal").trim());
            adicaoDI.setDcrValorRecolher(adicao.getChildText("dcrValorRecolher").trim());
            adicaoDI.setFornecedorCidade(adicao.getChildText("fornecedorCidade").trim());
            adicaoDI.setFornecedorComplemento(adicao.getChildText("fornecedorComplemento").trim());
            adicaoDI.setFornecedorEstado(adicao.getChildText("fornecedorEstado").trim());
            adicaoDI.setFornecedorLogradouro(adicao.getChildText("fornecedorLogradouro").trim());
            adicaoDI.setFornecedorNome(adicao.getChildText("fornecedorNome").trim());
            adicaoDI.setFornecedorNumero(adicao.getChildText("fornecedorNumero").trim());
            adicaoDI.setFreteMoedaNegociadaCodigo(adicao.getChildText("freteMoedaNegociadaCodigo").trim());
            adicaoDI.setFreteValorMoedaNegociada(adicao.getChildText("freteValorMoedaNegociada").trim());
            adicaoDI.setFreteValorReais(adicao.getChildText("freteValorReais").trim());
            adicaoDI.setIiAcordoTarifarioTipoCodigo(adicao.getChildText("iiAcordoTarifarioTipoCodigo").trim());
            adicaoDI.setIiAliquotaAcordo(adicao.getChildText("iiAliquotaAcordo").trim());
            adicaoDI.setIiAliquotaAdValorem(adicao.getChildText("iiAliquotaAdValorem").trim());
            adicaoDI.setIiAliquotaPercentualReducao(adicao.getChildText("iiAliquotaPercentualReducao").trim());
            adicaoDI.setIiAliquotaReduzida(adicao.getChildText("iiAliquotaReduzida").trim());
            adicaoDI.setIiAliquotaValorCalculado(adicao.getChildText("iiAliquotaValorCalculado").trim());
            adicaoDI.setIiAliquotaValorRecolher(adicao.getChildText("iiAliquotaValorDevido").trim());
            adicaoDI.setIiAliquotaValorRecolher(adicao.getChildText("iiAliquotaValorRecolher").trim());
            adicaoDI.setIiAliquotaValorReduzido(adicao.getChildText("iiAliquotaValorReduzido").trim());
            adicaoDI.setIiFundamentoLegalCodigo(adicao.getChildText("iiFundamentoLegalCodigo").trim());
            adicaoDI.setIiMotivoAdmissaoTemporariaCodigo(adicao.getChildText("iiMotivoAdmissaoTemporariaCodigo").trim());
            adicaoDI.setIiRegimeTributacaoCodigo(adicao.getChildText("iiRegimeTributacaoCodigo").trim());
            adicaoDI.setIiRegimeTributacaoNome(adicao.getChildText("iiRegimeTributacaoNome").trim());
            adicaoDI.setIpiAliquotaAdValorem(adicao.getChildText("ipiAliquotaAdValorem").trim());
            adicaoDI.setIpiAliquotaEspecificaCapacidadeRecipciente(adicao.getChildText("ipiAliquotaEspecificaCapacidadeRecipciente").trim());
            adicaoDI.setIpiAliquotaEspecificaQuantidadeUnidadeMedida(adicao.getChildText("ipiAliquotaEspecificaQuantidadeUnidadeMedida").trim());
            adicaoDI.setIpiAliquotaEspecificaTipoRecipienteCodigo(adicao.getChildText("ipiAliquotaEspecificaTipoRecipienteCodigo").trim());
            adicaoDI.setIpiAliquotaEspecificaValorUnidadeMedida(adicao.getChildText("ipiAliquotaEspecificaValorUnidadeMedida").trim());
            adicaoDI.setIpiAliquotaNotaComplementarTIPI(adicao.getChildText("ipiAliquotaNotaComplementarTIPI").trim());
            adicaoDI.setIiAliquotaReduzida(adicao.getChildText("ipiAliquotaReduzida").trim());
            adicaoDI.setIiAliquotaValorDevido(adicao.getChildText("ipiAliquotaValorDevido").trim());
            adicaoDI.setIiAliquotaValorRecolher(adicao.getChildText("ipiAliquotaValorRecolher").trim());
            adicaoDI.setIiRegimeTributacaoCodigo(adicao.getChildText("ipiRegimeTributacaoCodigo").trim());
            adicaoDI.setIiRegimeTributacaoNome(adicao.getChildText("ipiRegimeTributacaoNome").trim());
            adicaoDI.setNumeroAdicao(adicao.getChildText("numeroAdicao").trim());
            adicaoDI.setNumeroDI(adicao.getChildText("numeroDI").trim());
            adicaoDI.setNumeroLI(adicao.getChildText("numeroLI").trim());
            adicaoDI.setPaisAquisicaoMercadoriaCodigo(adicao.getChildText("paisAquisicaoMercadoriaCodigo").trim());
            adicaoDI.setPaisAquisicaoMercadoriaNome(adicao.getChildText("paisAquisicaoMercadoriaNome").trim());
            adicaoDI.setPaisOrigemMercadoriaCodigo(adicao.getChildText("paisOrigemMercadoriaCodigo").trim());
            adicaoDI.setPaisOrigemMercadoriaNome(adicao.getChildText("paisOrigemMercadoriaNome").trim());
            adicaoDI.setPisCofinsBaseCalculoAliquotaICMS(adicao.getChildText("pisCofinsBaseCalculoAliquotaICMS").trim());
            adicaoDI.setPisCofinsBaseCalculoFundamentoLegalCodigo(adicao.getChildText("pisCofinsBaseCalculoFundamentoLegalCodigo").trim());
            if (adicao.getChildText("pisCofinsBaseCalculoFundamentoLegalNome") != null) {
                adicaoDI.setPisCofinsBaseCalculoFundamentoLegalNome(adicao.getChildText("pisCofinsBaseCalculoFundamentoLegalNome").trim());
            }
            adicaoDI.setPisCofinsBaseCalculoPercentualReducao(adicao.getChildText("pisCofinsBaseCalculoPercentualReducao"));
            adicaoDI.setPisCofinsBaseCalculoValor(adicao.getChildText("pisCofinsBaseCalculoValor").trim());
            adicaoDI.setPisCofinsFundamentoLegalReducaoCodigo(adicao.getChildText("pisCofinsFundamentoLegalReducaoCodigo").trim());
            adicaoDI.setPisCofinsRegimeTributacaoCodigo(adicao.getChildText("pisCofinsRegimeTributacaoCodigo").trim());
            adicaoDI.setPisCofinsRegimeTributacaoNome(adicao.getChildText("pisCofinsRegimeTributacaoNome").trim());
            adicaoDI.setPisPasepAliquotaAdValorem(adicao.getChildText("pisPasepAliquotaAdValorem").trim());
            adicaoDI.setPisPasepAliquotaEspecificaQuantidadeUnidade(adicao.getChildText("pisPasepAliquotaEspecificaQuantidadeUnidade").trim());
            adicaoDI.setPisPasepAliquotaEspecificaValor(adicao.getChildText("pisPasepAliquotaEspecificaValor").trim());
            adicaoDI.setPisPasepAliquotaReduzida(adicao.getChildText("pisPasepAliquotaReduzida").trim());
            adicaoDI.setPisPasepAliquotaValorDevido(adicao.getChildText("pisPasepAliquotaValorDevido").trim());
            adicaoDI.setPisPasepAliquotaValorRecolher(adicao.getChildText("pisPasepAliquotaValorRecolher").trim());
            adicaoDI.setRelacaoCompradorVendedor(adicao.getChildText("relacaoCompradorVendedor").trim());
            adicaoDI.setSeguroMoedaNegociadaCodigo(adicao.getChildText("seguroMoedaNegociadaCodigo").trim());
            adicaoDI.setSeguroValorMoedaNegociada(adicao.getChildText("seguroValorMoedaNegociada").trim());
            adicaoDI.setSeguroValorReais(adicao.getChildText("seguroValorReais").trim());
            adicaoDI.setSequencialRetificacao(adicao.getChildText("sequencialRetificacao").trim());
            adicaoDI.setValorMultaARecolher(adicao.getChildText("valorMultaARecolher").trim());
            adicaoDI.setValorMultaARecolherAjustado(adicao.getChildText("valorMultaARecolherAjustado").trim());
            adicaoDI.setValorReaisFreteInternacional(adicao.getChildText("valorReaisFreteInternacional").trim());
            adicaoDI.setValorReaisSeguroInternacional(adicao.getChildText("valorReaisSeguroInternacional").trim());
            adicaoDI.setValorTotalCondicaoVenda(adicao.getChildText("valorTotalCondicaoVenda").trim());
            adicaoDI.setVinculoCompradorVendedor(adicao.getChildText("vinculoCompradorVendedor").trim());

            int i = 0;

            AcrescimoDI[] acrescimosDI = new AcrescimoDI[10];

            if (adicao.getChildren("acrescimo") != null) {
                // Criar o Array com os dados de acréscimo da DI
                acrescimosDI = new AcrescimoDI[10];
                List<Element> acrescimos = adicao.getChildren("acrescimo");

                for (Element e : acrescimos) {

                    if (e.getChildText("codigoAcrescimo") != null) {

                        acrescimosDI[i] = new AcrescimoDI();
                        acrescimosDI[i].setCodigoAcrescimo(e.getChildText("codigoAcrescimo").trim());
                        acrescimosDI[i].setDenominacao(e.getChildText("denominacao").trim());
                        acrescimosDI[i].setDenominacao(e.getChildText("denominacao").trim());
                        acrescimosDI[i].setCodMoedaNegociada(e.getChildText("moedaNegociadaCodigo").trim());
                        acrescimosDI[i].setNomeMoedaNegociada(e.getChildText("moedaNegociadaNome").trim());
                        acrescimosDI[i].setValorMoedaNegociada(e.getChildText("valorMoedaNegociada").trim());
                        acrescimosDI[i].setValorReais(e.getChildText("valorReais").trim());

                        i++;
                    }
                }
            }


            i = 0;

            // Cria o array com os dados de mercadoria da DI
            Mercadoria[] mercadorias = new Mercadoria[99];
            List<Element> mercadoria = adicao.getChildren("mercadoria");

            for (Element e : mercadoria) {

                if (e.getChildText("descricaoMercadoria") != null) {

                    mercadorias[i] = new Mercadoria();
                    mercadorias[i].setDescricaoMercadoria(e.getChildText("descricaoMercadoria").trim());
                    mercadorias[i].setNumeroSequenciaItem(e.getChildText("numeroSequencialItem").trim());
                    mercadorias[i].setQuantidade(e.getChildText("quantidade").trim());
                    mercadorias[i].setUnidadeMedida(e.getChildText("unidadeMedida").trim());
                    mercadorias[i].setVlrUnitario(e.getChildText("valorUnitario").trim());

                    i++;
                }
            }

            i = 0;

            // Interage com os dados do armazem
            Armazem[] armazens = new Armazem[10];
            List<Element> armazem = declaracoes.getChildren("armazem");

            for (Element e : armazem) {

                armazens[i] = new Armazem();
                armazens[i].setNomeArmazem(e.getChildText("nomeArmazem").trim());

                i++;
            }

            i = 0;

            // Interage com os dados da DI.
            DeclaraoImportacao declaracaoImportacao = new DeclaraoImportacao();
            declaracaoImportacao.setArmazenamentoRecintoAduaneiroCodigo(declaracoes.getChildText("armazenamentoRecintoAduaneiroCodigo").trim());
            declaracaoImportacao.setArmazenamentoRecintoAduaneiroNome(declaracoes.getChildText("armazenamentoRecintoAduaneiroNome").trim());
            declaracaoImportacao.setArmazenamentoSetor(declaracoes.getChildText("armazenamentoSetor").trim());
            declaracaoImportacao.setCanalSelecaoParametrizada(declaracoes.getChildText("canalSelecaoParametrizada").trim());
            declaracaoImportacao.setCaracterizacaoOperacaoCodigoTipo(declaracoes.getChildText("caracterizacaoOperacaoCodigoTipo").trim());
            declaracaoImportacao.setCaracterizacaoOperacaoDescricaoTipo(declaracoes.getChildText("caracterizacaoOperacaoDescricaoTipo").trim());
            declaracaoImportacao.setCargaDataChegada(declaracoes.getChildText("cargaDataChegada").trim());
            declaracaoImportacao.setCargaNumeroAgente(declaracoes.getChildText("cargaNumeroAgente").trim());
            declaracaoImportacao.setCargaPaisProcedenciaCodigo(declaracoes.getChildText("cargaPaisProcedenciaCodigo").trim());
            declaracaoImportacao.setCargaPaisProcedenciaNome(declaracoes.getChildText("cargaPaisProcedenciaNome").trim());
            declaracaoImportacao.setCargaPesoBruto(declaracoes.getChildText("cargaPesoBruto").trim());
            declaracaoImportacao.setCargaPesoLiquido(declaracoes.getChildText("cargaPesoLiquido").trim());
            declaracaoImportacao.setCargaUrfEntradaCodigo(declaracoes.getChildText("cargaUrfEntradaCodigo").trim());
            declaracaoImportacao.setCargaUrfEntradaNome(declaracoes.getChildText("cargaUrfEntradaNome").trim());
            declaracaoImportacao.setConhecimentoCargaEmbarqueData(declaracoes.getChildText("conhecimentoCargaEmbarqueData").trim());
            declaracaoImportacao.setConhecimentoCargaEmbarqueLocal(declaracoes.getChildText("conhecimentoCargaEmbarqueLocal").trim());
            declaracaoImportacao.setConhecimentoCargaId(declaracoes.getChildText("conhecimentoCargaId").trim());
            if (declaracoes.getChildText("conhecimentoCargaIdMaster") != null) {
                declaracaoImportacao.setConhecimentoCargaIdMaster(declaracoes.getChildText("conhecimentoCargaIdMaster").trim());
            }
            declaracaoImportacao.setConhecimentoCargaTipoCodigo(declaracoes.getChildText("conhecimentoCargaTipoCodigo").trim());
            declaracaoImportacao.setConhecimentoCargaTipoNome(declaracoes.getChildText("conhecimentoCargaTipoNome").trim());
            declaracaoImportacao.setConhecimentoCargaUtilizacao(declaracoes.getChildText("conhecimentoCargaUtilizacao").trim());
            declaracaoImportacao.setConhecimentoCargaUtilizacaoNome(declaracoes.getChildText("conhecimentoCargaUtilizacaoNome").trim());
            declaracaoImportacao.setDataDesembaraco(declaracoes.getChildText("dataDesembaraco").trim());
            declaracaoImportacao.setDataRegistro(declaracoes.getChildText("dataRegistro").trim());
            declaracaoImportacao.setDocumentoChegadaCargaCodigoTipo(declaracoes.getChildText("documentoChegadaCargaCodigoTipo").trim());
            declaracaoImportacao.setDocumentoChegadaCargaNome(declaracoes.getChildText("documentoChegadaCargaNome").trim());
            declaracaoImportacao.setDocumentoChegadaCargaNome(declaracoes.getChildText("documentoChegadaCargaNumero").trim());
            declaracaoImportacao.setFreteCollect(declaracoes.getChildText("freteCollect").trim());
            declaracaoImportacao.setFreteEmTerritorioNacional(declaracoes.getChildText("freteEmTerritorioNacional").trim());
            declaracaoImportacao.setFreteMoedaNegociadaCodigo(declaracoes.getChildText("freteMoedaNegociadaCodigo").trim());
            declaracaoImportacao.setFreteMoedaNegociadaNome(declaracoes.getChildText("freteMoedaNegociadaNome").trim());
            declaracaoImportacao.setFretePrepaid(declaracoes.getChildText("fretePrepaid").trim());
            declaracaoImportacao.setFreteTotalDolares(declaracoes.getChildText("freteTotalDolares").trim());
            declaracaoImportacao.setFreteTotalMoeda(declaracoes.getChildText("freteTotalMoeda").trim());
            declaracaoImportacao.setFreteTotalReais(declaracoes.getChildText("freteTotalReais").trim());
            declaracaoImportacao.setImportadorCodigoTipo(declaracoes.getChildText("importadorCodigoTipo").trim());
            declaracaoImportacao.setImportadorCpfRepresentanteLegal(declaracoes.getChildText("importadorCpfRepresentanteLegal").trim());
            declaracaoImportacao.setImportadorEnderecoBairro(declaracoes.getChildText("importadorEnderecoBairro").trim());
            declaracaoImportacao.setImportadorEnderecoCep(declaracoes.getChildText("importadorEnderecoCep").trim());
            declaracaoImportacao.setImportadorEnderecoComplemento(declaracoes.getChildText("importadorEnderecoComplemento").trim());
            declaracaoImportacao.setImportadorEnderecoLogradouro(declaracoes.getChildText("importadorEnderecoLogradouro").trim());
            declaracaoImportacao.setImportadorEnderecoMunicipio(declaracoes.getChildText("importadorEnderecoMunicipio").trim());
            declaracaoImportacao.setImportadorEnderecoNumero(declaracoes.getChildText("importadorEnderecoNumero").trim());
            declaracaoImportacao.setImportadorEnderecoUf(declaracoes.getChildText("importadorEnderecoUf").trim());
            declaracaoImportacao.setImportadorNome(declaracoes.getChildText("importadorNome").trim());
            declaracaoImportacao.setImportadorNomeRepresentanteLegal(declaracoes.getChildText("importadorNomeRepresentanteLegal").trim());
            declaracaoImportacao.setImportadorNumero(declaracoes.getChildText("importadorNumero").trim());
            declaracaoImportacao.setImportadorNumeroTelefone(declaracoes.getChildText("importadorNumeroTelefone").trim());
            declaracaoImportacao.setInformacaoComplementar(declaracoes.getChildText("informacaoComplementar").trim());
            declaracaoImportacao.setLocalDescargaTotalDolares(declaracoes.getChildText("localDescargaTotalDolares").trim());
            declaracaoImportacao.setLocalDescargaTotalReais(declaracoes.getChildText("localDescargaTotalReais").trim());
            declaracaoImportacao.setLocalEmbarqueTotalDolares(declaracoes.getChildText("localEmbarqueTotalDolares").trim());
            declaracaoImportacao.setLocalEmbarqueTotalReais(declaracoes.getChildText("localEmbarqueTotalReais").trim());
            declaracaoImportacao.setModalidadeDespachoCodigo(declaracoes.getChildText("modalidadeDespachoCodigo"));
            declaracaoImportacao.setModalidadeDespachoNome(declaracoes.getChildText("modalidadeDespachoNome").trim());
            declaracaoImportacao.setNumeroDI(declaracoes.getChildText("numeroDI").trim());
            declaracaoImportacao.setOperacaoFundap(declaracoes.getChildText("operacaoFundap").trim());
            declaracaoImportacao.setSeguroMoedaNegociadaCodigo(declaracoes.getChildText("seguroMoedaNegociadaCodigo").trim());
            declaracaoImportacao.setSeguroMoedaNegociadaNome(declaracoes.getChildText("seguroMoedaNegociadaNome").trim());
            declaracaoImportacao.setSeguroTotalDolares(declaracoes.getChildText("seguroTotalDolares").trim());
            declaracaoImportacao.setSeguroTotalMoedaNegociada(declaracoes.getChildText("seguroTotalMoedaNegociada").trim());
            declaracaoImportacao.setSeguroTotalReais(declaracoes.getChildText("seguroTotalReais").trim());
            declaracaoImportacao.setSequencialRetificacao(declaracoes.getChildText("sequencialRetificacao").trim());
            declaracaoImportacao.setSituacaoEntregaCarga(declaracoes.getChildText("situacaoEntregaCarga").trim());
            declaracaoImportacao.setTipoDeclaracaoCodigo(declaracoes.getChildText("tipoDeclaracaoCodigo").trim());
            declaracaoImportacao.setTipoDeclaracaoNome(declaracoes.getChildText("tipoDeclaracaoNome").trim());
            declaracaoImportacao.setTotalAdicoes(declaracoes.getChildText("totalAdicoes").trim());
            declaracaoImportacao.setUrfDespachoCodigo(declaracoes.getChildText("urfDespachoCodigo").trim());
            declaracaoImportacao.setUrfDespachoNome(declaracoes.getChildText("urfDespachoNome").trim());
            declaracaoImportacao.setValorTotalMultaARecolherAjustado(declaracoes.getChildText("valorTotalMultaARecolherAjustado").trim());
            declaracaoImportacao.setViaTransporteCodigo(declaracoes.getChildText("viaTransporteCodigo").trim());
            declaracaoImportacao.setViaTransporteMultimodal(declaracoes.getChildText("viaTransporteMultimodal").trim());
            declaracaoImportacao.setViaTransporteNome(declaracoes.getChildText("viaTransporteNome").trim());
            declaracaoImportacao.setViaTransporteNomeTransportador(declaracoes.getChildText("viaTransporteNomeTransportador").trim());
            if (declaracoes.getChildText("viaTransporteNomeVeiculo") != null) {
                declaracaoImportacao.setViaTransporteNomeVeiculo(declaracoes.getChildText("viaTransporteNomeVeiculo").trim());
            }
            declaracaoImportacao.setViaTransportePaisTransportadorCodigo(declaracoes.getChildText("viaTransportePaisTransportadorCodigo").trim());
            if (declaracoes.getChildText("viaTransportePaisTransportadorNome") != null){
                declaracaoImportacao.setViaTransportePaisTransportadorNome(declaracoes.getChildText("viaTransportePaisTransportadorNome").trim());
            }

            // Interage com as intrucoes de despacho
            InstrucaoDespacho[] instrucaoDespachos = new InstrucaoDespacho[50];
            List<Element> instrucoes = declaracoes.getChildren("documentoInstrucaoDespacho");

            for (Element e : instrucoes) {

                instrucaoDespachos[i] = new InstrucaoDespacho();
                instrucaoDespachos[i].setCodigoTipoDocumentoDespacho(e.getChildText("codigoTipoDocumentoDespacho").trim());
                instrucaoDespachos[i].setNomeDocumentoDespacho(e.getChildText("nomeDocumentoDespacho").trim());
                instrucaoDespachos[i].setNumeroDocumentoDespacho(e.getChildText("numeroDocumentoDespacho").trim());

                i++;
            }

            i = 0;

            // Interage com as embalagens
            Embalagem[] embalagens = new Embalagem[20];
            List<Element> embalagemList = declaracoes.getChildren("embalagem");

            for (Element e : embalagemList) {

                embalagens[i] = new Embalagem();
                embalagens[i].setCodigoTipoEmbalagem(e.getChildText("codigoTipoEmbalagem").trim());
                embalagens[i].setNomeEmbalagem(e.getChildText("nomeEmbalagem").trim());
                embalagens[i].setQuantidadeVolume(e.getChildText("quantidadeVolume").trim());

                i++;
            }

            i = 0;

            // Interage com o ICMS
            ICMS[] icms = new ICMS[10];
            List<Element> icmsList = declaracoes.getChildren("icms");

            for (Element e : icmsList) {

                icms[i] = new ICMS();
                icms[i].setAgenciaIcms(e.getChildText("agenciaIcms").trim());
                icms[i].setBancoIcms(e.getChildText("bancoIcms").trim());
                icms[i].setCodigoTipoRecolhimentoIcms(e.getChildText("codigoTipoRecolhimentoIcms").trim());
                icms[i].setCpfResponsavelRegistro(e.getChildText("cpfResponsavelRegistro").trim());
                icms[i].setDataRegistro(e.getChildText("dataRegistro").trim());
                icms[i].setHoraRegistro(e.getChildText("horaRegistro").trim());
                icms[i].setNomeTipoRecolhimentoIcms(e.getChildText("nomeTipoRecolhimentoIcms").trim());
                icms[i].setNumeroSequencialIcms(e.getChildText("numeroSequencialIcms").trim());
                icms[i].setUfIcms(e.getChildText("ufIcms").trim());
                icms[i].setValorTotalIcms(e.getChildText("valorTotalIcms").trim());

                i++;
            }

            i = 0;

            // Interage com os pagamentos da DI
            Pagamento[] pagamentos = new Pagamento[50];
            List<Element> pagamentosList = declaracoes.getChildren("pagamento");

            for (Element e : pagamentosList) {
                pagamentos[i] = new Pagamento();
                pagamentos[i].setAgenciaPagamento(e.getChildText("agenciaPagamento").trim());
                pagamentos[i].setBancoPagamento(e.getChildText("bancoPagamento").trim());
                pagamentos[i].setCodigoReceita(e.getChildText("codigoReceita").trim());
                pagamentos[i].setCodigoTipoPagamento(e.getChildText("codigoTipoPagamento").trim());
                pagamentos[i].setContaPagamento(e.getChildText("contaPagamento").trim());
                pagamentos[i].setDataPagamento(e.getChildText("dataPagamento").trim());
                pagamentos[i].setNomeTipoPagamento(e.getChildText("nomeTipoPagamento").trim());
                pagamentos[i].setNumeroRetificacao(e.getChildText("numeroRetificacao").trim());
                pagamentos[i].setValorJurosEncargos(e.getChildText("valorJurosEncargos").trim());
                pagamentos[i].setValorMulta(e.getChildText("valorMulta").trim());
                pagamentos[i].setValorReceita(e.getChildText("valorReceita").trim());

                i++;
            }

            XMLService.gerarXML(adicaoDI, declaracaoImportacao, mercadorias,
                    icms, pagamentos);

        } catch (NullPointerException e) {

            e.printStackTrace();
        }
    }
}
