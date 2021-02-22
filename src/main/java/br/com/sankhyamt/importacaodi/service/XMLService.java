package br.com.sankhyamt.importacaodi.service;

import br.com.sankhyamt.importacaodi.model.entity.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

/**
 * @version 1.1
 * @since v1.0
 */
public class XMLService {

    /**
     * Gera o arquivo XML em formato de NF-e.
     *
     * @param adicaoDI           Dados da adição da Declaração de Importação.
     * @param declaraoImportacao Dados da Declaração de Importação.
     * @param mercadorias        Dados das mercadorias da Declaração de Importação.
     * @param icms               Dados do ICMS da Declaração de Importação.
     * @param pagamentos         Dados dos pagamentos da Declaração de Importação.
     * @since v1.0
     */
    public static void gerarXML(AdicaoDI adicaoDI, DeclaraoImportacao declaraoImportacao,
                                Mercadoria[] mercadorias, ICMS[] icms, Pagamento[] pagamentos) {

        // Cria o elemento NF-e
        Element nfe = new Element("NFe");

        // Cria o XML
        Document xmlNFEe = new Document(nfe);

        // Cria o elemento <infNFe>
        Element infNFe = new Element("infNFe");
        infNFe.setAttribute("Id", declaraoImportacao.getNumeroDI());

        // Cria o elemento <ide>
        Element ide = new Element("ide");
        ide.setText("");

        Element cUF = new Element("cUF");
        cUF.setText("");

        Element cNF = new Element("cNF");
        cNF.setText("");

        Element natOp = new Element("natOp");
        natOp.setText("");

        Element mod = new Element("mod");
        mod.setText("0");

        Element serie = new Element("serie");
        serie.setText("0");

        Element nNF = new Element("nNF");
        serie.setText(declaraoImportacao.getNumeroDI());

        StringBuilder dataEmi = new StringBuilder();
        dataEmi.append(declaraoImportacao.getDataRegistro().substring(0, 4));
        dataEmi.append("-");
        dataEmi.append(declaraoImportacao.getDataRegistro().substring(4, 6));
        dataEmi.append("-");
        dataEmi.append(declaraoImportacao.getDataRegistro().substring(6, 8));

        Element dhEmi = new Element("dEmi");
        dhEmi.setText(dataEmi.toString());

        StringBuilder dataSE = new StringBuilder();
        dataSE.append(declaraoImportacao.getConhecimentoCargaEmbarqueData().substring(0, 4));
        dataSE.append("-");
        dataSE.append(declaraoImportacao.getConhecimentoCargaEmbarqueData().substring(4, 6));
        dataSE.append("-");
        dataSE.append(declaraoImportacao.getDataRegistro().substring(6, 8));

        Element dhSaiEnt = new Element("dSaiEnt");
        dhSaiEnt.setText(dataSE.toString());

        Element tpNF = new Element("tpNF");
        tpNF.setText("0");

        Element idDest = new Element("idDest");
        idDest.setText("1");

        Element cMunFG = new Element("cMunFG");
        cMunFG.setText("0");

        Element tpImp = new Element("tpImp");
        tpImp.setText("1");

        Element tpEmis = new Element("tipEmis");
        tpEmis.setText("1");

        Element cDV = new Element("cDV");
        cDV.setText("1");

        Element tpAmb = new Element("tpAmb");
        tpAmb.setText("1");

        Element finNFe = new Element("finNFe");
        finNFe.setText("1");

        Element indFinal = new Element("indFinal");
        indFinal.setText("1");

        Element indPres = new Element("indPres");
        indPres.setText("0");

        Element procEmi = new Element("procEmi");
        procEmi.setText("0");

        ide.addContent(cUF);
        ide.addContent(cNF);
        ide.addContent(natOp);
        ide.addContent(mod);
        ide.addContent(serie);
        ide.addContent(nNF);
        ide.addContent(dhEmi);
        ide.addContent(dhSaiEnt);
        ide.addContent(tpNF);
        ide.addContent(idDest);
        ide.addContent(cMunFG);
        ide.addContent(tpImp);
        ide.addContent(tpEmis);
        ide.addContent(cDV);
        ide.addContent(tpAmb);
        ide.addContent(finNFe);
        ide.addContent(indFinal);
        ide.addContent(indPres);
        ide.addContent(procEmi);


        // Cria o elemento <emit>
        Element emit = new Element("emit");

        Element cnpj = new Element("CNPJ");
        cnpj.setText("");

        Element xNome = new Element("xNome");
        xNome.setText(adicaoDI.getFornecedorNome());

        Element xFant = new Element("xFant");
        xFant.setText(adicaoDI.getFornecedorNome());

        Element enderEmit = new Element("enderEmit");

        Element xLgr = new Element("xLgr");
        xLgr.setText(adicaoDI.getFornecedorLogradouro());

        Element nro = new Element("nro");
        nro.setText(adicaoDI.getFornecedorNumero());

        Element xCpl = new Element("xCpl");
        xCpl.setText(adicaoDI.getFornecedorComplemento());

        Element xBairro = new Element("xBairro");
        xBairro.setText(adicaoDI.getFornecedorLogradouro());

        Element cMun = new Element("cMun");
        cMun.setText("");

        Element xMun = new Element("xMun");
        xMun.setText(adicaoDI.getFornecedorCidade());

        Element UF = new Element("UF");
        UF.setText("");

        Element CEP = new Element("CEP");
        CEP.setText("");

        Element cPais = new Element("cPais");
        cPais.setText(adicaoDI.getPaisAquisicaoMercadoriaCodigo());

        Element xPais = new Element("xPais");
        xPais.setText(adicaoDI.getPaisAquisicaoMercadoriaNome());

        Element fone = new Element("fone");
        fone.setText("");

        Element IE = new Element("IE");
        IE.setText("");

        Element CRT = new Element("CRT");
        CRT.setText("");


        // Cria o elemento <dest>
        Element dest = new Element("dest");

        Element dcnpj = new Element("CNPJ");
        dcnpj.setText("");

        Element d_xnome = new Element("xNome");
        d_xnome.setText(adicaoDI.getFornecedorNome());

        Element d_enderdest = new Element("enderDest");

        Element d_xLgr = new Element("xLgr");
        d_xLgr.setText(adicaoDI.getFornecedorLogradouro());

        Element D_nro = new Element("nro");
        D_nro.setText("");

        Element D_xBairro = new Element("xBairro");
        D_xBairro.setText("");

        Element D_cmun = new Element("cMun");
        D_cmun.setText("");

        Element D_xmun = new Element("xMun");
        D_xmun.setText("");

        Element D_UF = new Element("UF");
        D_UF.setText("");

        Element D_cep = new Element("CEP");
        D_cep.setText("");

        Element D_cpais = new Element("cPais");
        D_cpais.setText("");

        Element D_xpais = new Element("xPais");
        D_xpais.setText(adicaoDI.getPaisAquisicaoMercadoriaNome());

        Element D_fone = new Element("fone");
        D_fone.setText("");

        Element D_indiedest = new Element("indIEDest");
        D_indiedest.setText("");

        Element D_ie = new Element("IE");
        D_ie.setText("");

        Element D_email = new Element("email");
        D_email.setText("");

        // Cria o elemento <imposto>
        Element det_imposto = new Element("imposto");

        Element det_imposto_icms = new Element("ICMS");

        Element det_imposto_icms00 = new Element("ICMS00");

        Element det_imposto_orig = new Element("orig");
        det_imposto_orig.setText("");//buscar da origiem do produto do cadastro de produtos

        Element det_imposto_modbc = new Element("modBC");
        det_imposto_modbc.setText("");

        Element det_imposto_vbc = new Element("vBC");
        det_imposto_vbc.setText(adicaoDI.getPisCofinsBaseCalculoAliquotaICMS());

        Element det_imposto_picms = new Element("pICMS");
        det_imposto_picms.setText("");//nao tem xml

        Element det_imposto_ipi = new Element("IPI");

        Element det_imposto_cenq = new Element("cEnq");
        det_imposto_cenq.setText("");//buscar no cadstro de produto iguadramento legal do ipi

        Element det_imposto_ipint = new Element("IPINT");

        Element det_imposto__ipintcst = new Element("CST");
        det_imposto__ipintcst.setText(adicaoDI.getIpiRegimeTributacaoCodigo());

        Element det_imposto_pisaliqcst = new Element("CST");
        det_imposto_pisaliqcst.setText(adicaoDI.getPisCofinsRegimeTributacaoCodigo());

        Element det_imposto_confinsliq_vbc = new Element("vBC");
        det_imposto_confinsliq_vbc.setText(adicaoDI.getPisCofinsBaseCalculoValor());

        Element det_imposto_confinsliq_pconfins = new Element("pCONFINS");
        det_imposto_confinsliq_pconfins.setText("");

        Element det_imposto_confinsliq_vconfins = new Element("vCOFINS");
        det_imposto_confinsliq_vconfins.setText(adicaoDI.getCofinsAliqAdValor());

        Element det_imposto_confins = new Element("COFINS");

        Element det_imposto_confinsliq = new Element("CONFINSAliq");
        Element det_imposto_pis = new Element("PIS");

        Element det_imposto_pisaliq = new Element("PISAliq");

        Element det_imposto_pisaliqvbc = new Element("vBC");
        det_imposto_pisaliqvbc.setText(adicaoDI.getPisPasepAliquotaEspecificaValor());

        Element det_imposto_pisaliqppis = new Element("pPIS");
        det_imposto_pisaliqppis.setText("");
        Element det_imposto_pisaliqvpis = new Element("vPIS");
        det_imposto_pisaliqvpis.setText(adicaoDI.getPisPasepAliquotaAdValorem());

        Element det_total_icms_vicms = new Element("vICMS");


        for (int i = 0; i < 50; i++) {

            try {

                if (!icms[i].getCodigoTipoRecolhimentoIcms().equals("") || icms[i].getValorTotalIcms() != null) {

                    Element det_imposto_cst = new Element("CST");
                    det_imposto_cst.setText(icms[i].getCodigoTipoRecolhimentoIcms());

                    Element det_imposto_vicms = new Element("vICMS");
                    det_imposto_vicms.setText(icms[i].getValorTotalIcms());

                    Element det_imposto_confinsliq_cst = new Element("CST");
                    det_imposto_confinsliq_cst.setText(icms[i].getNumeroSequencialIcms());


                    det_total_icms_vicms.setText(icms[i].getValorTotalIcms());


                    det_imposto_icms00.addContent(det_imposto_cst); //

                    det_imposto_icms00.addContent(det_imposto_vicms);//


                    //CONFINS
                    det_imposto_confinsliq.addContent(det_imposto_confinsliq_cst);//
                }

            } catch (NullPointerException e) {

                break;
            }
        }


        det_imposto_pisaliq.addContent(det_imposto_pisaliqvpis);//
        det_imposto_icms00.addContent(det_imposto_orig);
        det_imposto_icms00.addContent(det_imposto_modbc);
        det_imposto_icms00.addContent(det_imposto_vbc);
        det_imposto_icms00.addContent(det_imposto_picms);
        det_imposto_icms.addContent(det_imposto_icms00);

        //IPI
        det_imposto_ipi.addContent(det_imposto_cenq);
        det_imposto_ipint.addContent(det_imposto__ipintcst);
        det_imposto_ipi.addContent(det_imposto_ipint);

        //Pis
        det_imposto_pisaliq.addContent(det_imposto_pisaliqcst);
        det_imposto_pisaliq.addContent(det_imposto_pisaliqvbc);
        det_imposto_pisaliq.addContent(det_imposto_pisaliqppis);
        det_imposto_pis.addContent(det_imposto_pisaliq);
        det_imposto_confinsliq.addContent(det_imposto_confinsliq_vbc);
        det_imposto_confinsliq.addContent(det_imposto_confinsliq_pconfins);
        det_imposto_confinsliq.addContent(det_imposto_confinsliq_vconfins);

        det_imposto_confins.addContent(det_imposto_confinsliq);

        det_imposto.addContent(det_imposto_icms);
        det_imposto.addContent(det_imposto_ipi);
        det_imposto.addContent(det_imposto_pis);
        det_imposto.addContent(det_imposto_confins);


        infNFe.addContent(ide);
        infNFe.addContent(emit);
        infNFe.addContent(dest);


        Double qtdNegTot = 0.0;

        int j = 0;
        for (Mercadoria e : mercadorias) {

            try {

                if (!e.getDescricaoMercadoria().equals("") || e.getDescricaoMercadoria() != null) {

                    Element det_nitem = new Element("det"); //verificar aspas
                    det_nitem.setAttribute("nIem", String.valueOf(++j));


                    Element det_prod = new Element("prod");
                    Element det_pro_cprod = new Element("cProd");
                    det_pro_cprod.setText("0");

                    Element det_pro_cean = new Element("cEAN");
                    det_pro_cean.setText("");

                    Element det_pro_xprod = new Element("xProd");
                    det_pro_xprod.setText(e.getDescricaoMercadoria());

                    Element det_pro_ncm = new Element("NCM");
                    det_pro_ncm.setText(adicaoDI.getDadosMercadoriaCodigoNcm());

                    Element det_pro_cfop = new Element("CFOP");
                    det_pro_cfop.setText("3101");

                    Element det_pro_ucom = new Element("uCom");
                    det_pro_ucom.setText(e.getUnidadeMedida());

                    Element det_pro_ceantrib = new Element("cEANTrib");
                    det_pro_ceantrib.setText("");

                    Element det_pro_utrib = new Element("uTrib");
                    det_pro_utrib.setText(e.getUnidadeMedida());

                    StringBuffer qtdReverse = new StringBuffer(e.getQuantidade());
                    qtdReverse.reverse();

                    StringBuffer qtd = new StringBuffer("");
                    qtd.append(qtdReverse.substring(0, 5));
                    qtd.append(".");
                    qtd.append(qtdReverse.substring(5));
                    qtd.reverse();

                    qtdNegTot = qtdNegTot + Double.valueOf(qtd.toString());

                    Element det_pro_qtrib = new Element("qTrib");
                    det_pro_qtrib.setText(Double.valueOf(qtd.toString()).toString());

                    Element det_pro_vuntrib = new Element("vUnTrib");
                    det_pro_vuntrib.setText(e.getUnidadeMedida());

                    Element det_pro_indtot = new Element("indTot");
                    det_pro_indtot.setText("");

                    Element det_pro_xped = new Element("xPed");
                    det_pro_xped.setText("");

                    Element det_pro_nitemped = new Element("nItemPed");
                    det_pro_nitemped.setText("");


                    Element det_pro_qcom = new Element("qCom");
                    det_pro_qcom.setText(Double.valueOf(qtd.toString()).toString());

                    StringBuffer vlrReverse = new StringBuffer(e.getVlrUnitario());
                    vlrReverse.reverse();

                    StringBuffer vlrUnit = new StringBuffer("");
                    vlrUnit.append(vlrReverse.substring(0, 7));
                    vlrUnit.append(".");
                    vlrUnit.append(vlrReverse.substring(7));
                    vlrUnit.reverse();

                    Element det_pro_vuncom = new Element("vUnCom");
                    det_pro_vuncom.setText(Double.valueOf(vlrUnit.toString()).toString());

                    Element det_pro_vprod = new Element("vProd");
                    det_pro_vprod.setText(declaraoImportacao.getLocalDescargaTotalReais());

                    Element di = new Element("DI");

                    Element nDI = new Element("nDI");
                    nDI.setText(declaraoImportacao.getNumeroDI());

                    Element dDI = new Element("dDI");
                    dDI.setText(declaraoImportacao.getDataRegistro());

                    Element xLocDesemb = new Element("xLocDesemb");
                    xLocDesemb.setText("RIO DE JANEIRO");

                    Element UFDesemb = new Element("UFDesemb");
                    UFDesemb.setText(declaraoImportacao.getImportadorEnderecoUf());

                    Element dDesemb = new Element("dDesemb");
                    dDesemb.setText("2021-02-12");

                    Element tpViaTransp = new Element("tpViaTransp");
                    tpViaTransp.setText(Integer.valueOf(declaraoImportacao.getViaTransporteCodigo()).toString());

                    Element vAFRMM = new Element("vAFRMM");
                    vAFRMM.setText("0201");

                    Element tpIntermedio = new Element("tpIntermedio");
                    tpIntermedio.setText("1");

                    Element cExportador = new Element("cExportador");
                    cExportador.setText(adicaoDI.getFornecedorNome());

                    Element adi = new Element("adi");

                    Element nAdicao = new Element("nAdicao");
                    nAdicao.setText("1");

                    Element nSeqAdic = new Element("nSeqAdic");
                    nSeqAdic.setText("1");

                    Element cFabricante = new Element("cFabricante");
                    cFabricante.setText(adicaoDI.getFornecedorNome());

                    adi.addContent(nAdicao);
                    adi.addContent(nSeqAdic);
                    adi.addContent(cFabricante);

                    di.addContent(nDI);
                    di.addContent(dDI);
                    di.addContent(xLocDesemb);
                    di.addContent(UFDesemb);
                    di.addContent(dDesemb);
                    di.addContent(tpViaTransp);
                    di.addContent(vAFRMM);
                    di.addContent(tpIntermedio);
                    di.addContent(cExportador);
                    di.addContent(adi);

                    det_prod.addContent(det_pro_cprod);
                    det_prod.addContent(det_pro_cean);
                    det_prod.addContent(det_pro_xprod);
                    det_prod.addContent(det_pro_ncm);
                    det_prod.addContent(det_pro_cfop);
                    det_prod.addContent(det_pro_ucom);
                    det_prod.addContent(det_pro_ceantrib);
                    det_prod.addContent(det_pro_utrib);
                    det_prod.addContent(det_pro_qtrib);
                    det_prod.addContent(det_pro_vuntrib);
                    det_prod.addContent(det_pro_indtot);
                    det_prod.addContent(det_pro_xped);
                    det_prod.addContent(det_pro_nitemped);

                    det_prod.addContent(det_pro_qcom);
                    det_prod.addContent(det_pro_vuncom);
                    det_prod.addContent(di);

                    det_nitem.addContent(det_prod);
                    //det_nitem.addContent(det_imposto);
                    infNFe.addContent(det_nitem);
                }

            } catch (NullPointerException npe) {

                break;
            }

        }


        //Nitem -> total:
        Element det_total = new Element("total");

        Element det_total_icms = new Element("ICMSTot");

        Element det_total_icms_vbc = new Element("vBC");
        det_total_icms_vbc.setText(adicaoDI.getPisCofinsBaseCalculoAliquotaICMS());

        Element det_total_icms_vicmsdeson = new Element("vICMSDeson");
        det_total_icms_vicmsdeson.setText(adicaoDI.getDcrValorDevido());

        Element det_total_icms_vfcp = new Element("vFCP");
        det_total_icms_vfcp.setText("");

        Element det_total_icms_vbcst = new Element("vBCST");
        det_total_icms_vbcst.setText("");

        Element det_total_icms_vst = new Element("vST");
        det_total_icms_vst.setText("");

        Element det_total_icms_vfcpst = new Element("vFCPST");
        det_total_icms_vfcpst.setText("");

        Element det_total_icms_vfcpstret = new Element("vFCPSTRet");
        det_total_icms_vfcpstret.setText("");

        Element det_total_icms_vprod = new Element("vProd");
        det_total_icms_vprod.setText(mercadorias[0].getVlrUnitario());

        Element det_total_icms_vfrete = new Element("vFrete");
        det_total_icms_vfrete.setText("0");

        Element det_total_icms_vseg = new Element("vSeg");
        det_total_icms_vseg.setText("");

        Element det_total_icms_vdesc = new Element("vDesc");
        det_total_icms_vdesc.setText(adicaoDI.getCideValorDevido());

        Element det_total_icms_vipi = new Element("vII");
        det_total_icms_vipi.setText(adicaoDI.getIiBaseCalculo());

        Element det_total_icms_vipidevol = new Element("vIPIDevol");
        det_total_icms_vipidevol.setText(adicaoDI.getIpiAliquotaValorDevido());

        Element det_total_icms_vpis = new Element("vPIS");
        det_total_icms_vpis.setText(adicaoDI.getPisPasepAliquotaAdValorem());

        Element det_total_icms_vcofins = new Element("vCOFINS");
        det_total_icms_vcofins.setText(adicaoDI.getCofinsAliqAdValor());

        Element det_total_icms_voutro = new Element("vOutro");
        det_total_icms_voutro.setText(adicaoDI.getValorMultaARecolher());

        Element det_total_icms_vNF = new Element("vNF");
        det_total_icms_vNF.setText("");

        //-> Inicinado Transp

        Element det_transp = new Element("transp");

        Element det_transp_frete = new Element("modFrete");
        det_transp_frete.setText(declaraoImportacao.getConhecimentoCargaTipoCodigo());

        Element det_transp_transporta = new Element("transporta");

        Element det_transp_transporta_cnpj = new Element("CNPJ");
        det_transp_transporta_cnpj.setText(declaraoImportacao.getImportadorCpfRepresentanteLegal());

        Element det_transp_transporta_xnome = new Element("xNome");
        det_transp_transporta_xnome.setText(declaraoImportacao.getImportadorNome());

        Element det_transp_transporta_ie = new Element("IE");
        det_transp_transporta_ie.setText("");

        Element det_transp_transporta_xender = new Element("xEnder");
        det_transp_transporta_xender.setText(declaraoImportacao.getImportadorEnderecoLogradouro());

        Element det_transp_transporta_xmun = new Element("xmun");
        det_transp_transporta_xmun.setText(declaraoImportacao.getImportadorEnderecoMunicipio());

        Element det_transp_transporta_UF = new Element("UF");
        det_transp_transporta_UF.setText(declaraoImportacao.getImportadorEnderecoUf());

        Element det_transp_veic = new Element("veicTransp");

        Element det_transp_veic_placa = new Element("placa");
        det_transp_veic_placa.setText(declaraoImportacao.getViaTransporteNomeVeiculo());

        Element det_transp_veic_UF = new Element("UF");
        det_transp_veic_UF.setText("");

        Element det_transp_vol = new Element("vol");

        StringBuffer qtdVolReverse = new StringBuffer(adicaoDI.getDadosMercadoriaMedidaEstatisticaQuantidade());
        qtdVolReverse.reverse();

        StringBuffer qtdVol = new StringBuffer("");
        qtdVol.append(qtdVolReverse.substring(6));
        //qtdVol.append(".");
        //qtdVol.append(qtdVolReverse.substring(6));
        qtdVol.reverse();

        Element det_transp_vol_qvol = new Element("qVol");
        det_transp_vol_qvol.setText(Integer.valueOf(qtdVol.toString()).toString());

        StringBuffer pesoReverse = new StringBuffer(adicaoDI.getDadosMercadoriaPesoLiquido());
        pesoReverse.reverse();

        StringBuffer peso = new StringBuffer("");
        peso.append(qtdVolReverse.substring(0, 6));
        peso.append(".");
        peso.append(qtdVolReverse.substring(6));
        peso.reverse();

        Element det_transp_vol_pesol = new Element("pesoL");
        det_transp_vol_pesol.setText(Double.valueOf(peso.toString()).toString());


        Element det_transp_vol_pesob = new Element("pesoB");
        det_transp_vol_pesob.setText("");


        Element nitem_cobr = new Element("cobr");
        Element nitem_cobr_fat = new Element("fat");

        Element nitem_cobr_fat_nfat = new Element("nFat");
        nitem_cobr_fat_nfat.setText("");

        Element nitem_cobr_fat_vorig = new Element("vOrig");
        nitem_cobr_fat_vorig.setText("");

        Element nitem_cobr_fat_vdesc = new Element("vDesc");
        nitem_cobr_fat_vdesc.setText("");

        Element nitem_cobr_fat_vliq = new Element("vLiq");
        nitem_cobr_fat_vliq.setText("");

        Element nitem_cobr_dup = new Element("dup");

        Element nitem_cobr_dup_ndup = new Element("nDup");
        nitem_cobr_dup_ndup.setText("");

        Element nitem_cobr_dup_dvenc = new Element("dVenc");
        nitem_cobr_dup_dvenc.setText("");

        Element nitem_cobr_dup_vdup = new Element("vDup");
        nitem_cobr_dup_vdup.setText("");


        Element pag = new Element("pag");

        Element pag_detpag = new Element("detPag");


        for (int i = 0; i < 50; i++) {

            try {
                if (!pagamentos[i].getAgenciaPagamento().equals("") || pagamentos[i].getAgenciaPagamento() != null) {

                    Element pag_detpag_indPag = new Element("indPag");
                    pag_detpag_indPag.setText(pagamentos[i].getAgenciaPagamento());

                    Element pag_detpag_tpag = new Element("tPag");
                    pag_detpag_tpag.setText(pagamentos[i].getValorJurosEncargos());

                    Element pag_detpag_vpag = new Element("vpag");
                    pag_detpag_vpag.setText(pagamentos[i].getValorReceita());

                    pag_detpag.addContent(pag_detpag_indPag);
                    pag_detpag.addContent(pag_detpag_tpag);
                    pag_detpag.addContent(pag_detpag_vpag);
                }

            } catch (NullPointerException e) {

                break;
            }
        }


        StringBuilder infCompl = new StringBuilder();

        infCompl.append(declaraoImportacao.getInformacaoComplementar());

        for (Mercadoria e : mercadorias) {

            try {

                StringBuffer vlrReverse = new StringBuffer(e.getVlrUnitario());
                vlrReverse.reverse();

                StringBuffer vlrUnit = new StringBuffer("");
                vlrUnit.append(vlrReverse.substring(0, 7));
                vlrUnit.append(",");
                vlrUnit.append(vlrReverse.substring(7));
                vlrUnit.reverse();

                StringBuffer qtdReverse = new StringBuffer(e.getQuantidade());
                qtdReverse.reverse();

                StringBuffer qtd = new StringBuffer("");
                qtd.append(qtdReverse.substring(0, 5));
                qtd.append(",");
                qtd.append(qtdReverse.substring(5));
                qtd.reverse();

                String infProduto = "\nSEQUENCIA: " + e.getNumeroSequenciaItem() +
                        " | QTDNEG: " + qtd.toString() +
                        " | VLRUNIT " + vlrUnit.toString();

                infCompl.append(infProduto);

            } catch (NullPointerException npe) {

                break;
            }

        }

        infCompl.append("\n | QTD TOTAL NEGOCIADA: ".concat(String.valueOf(qtdNegTot)).concat(" |"));

        Element infadic = new Element("infAdic");
        Element infadic_infcpl = new Element("infCpl");
        infadic_infcpl.setText(infCompl.toString());

        Element infresptec = new Element("infRespTec");

        Element infresptec_cnpj = new Element("CNPJ");
        infresptec_cnpj.setText("");

        Element infresptec_xcontato = new Element("xContato");
        infresptec_xcontato.setText("");

        Element infresptec_email = new Element("email");
        infresptec_email.setText("");

        Element infresptec_fone = new Element("fone");
        infresptec_fone.setText("");


        enderEmit.addContent(xLgr);
        enderEmit.addContent(nro);
        enderEmit.addContent(xCpl);
        enderEmit.addContent(xBairro);
        enderEmit.addContent(cMun);
        enderEmit.addContent(xMun);
        enderEmit.addContent(UF);
        enderEmit.addContent(CEP);
        enderEmit.addContent(cPais);
        enderEmit.addContent(xPais);
        enderEmit.addContent(fone);

        emit.addContent(cnpj);
        emit.addContent(xNome);
        emit.addContent(xFant);
        emit.addContent(enderEmit);
        emit.addContent(IE);
        emit.addContent(CRT);

        //matheus Dest
        dest.addContent(dcnpj);
        dest.addContent(d_xnome);

        d_enderdest.addContent(d_xLgr);
        d_enderdest.addContent(D_nro);
        d_enderdest.addContent(D_xBairro);
        d_enderdest.addContent(D_cmun);
        d_enderdest.addContent(D_xmun);
        d_enderdest.addContent(D_UF);
        d_enderdest.addContent(D_cep);
        d_enderdest.addContent(D_cpais);
        d_enderdest.addContent(D_xpais);
        d_enderdest.addContent(D_fone);

        dest.addContent(d_enderdest);
        dest.addContent(D_indiedest);
        dest.addContent(D_ie);
        dest.addContent(D_email);


        //incinando det_prod

        //det imposto icms


        //---> Iniciando Total
        det_total_icms.addContent(det_total_icms_vbc);
        det_total_icms.addContent(det_total_icms_vicms);
        det_total_icms.addContent(det_total_icms_vicmsdeson);
        det_total_icms.addContent(det_total_icms_vfcp);
        det_total_icms.addContent(det_total_icms_vbcst);
        det_total_icms.addContent(det_total_icms_vst);
        det_total_icms.addContent(det_total_icms_vfcpst);
        det_total_icms.addContent(det_total_icms_vfcpstret);
        det_total_icms.addContent(det_total_icms_vprod);
        det_total_icms.addContent(det_total_icms_vfrete);
        det_total_icms.addContent(det_total_icms_vseg);
        det_total_icms.addContent(det_total_icms_vdesc);
        det_total_icms.addContent(det_total_icms_vipi);
        det_total_icms.addContent(det_total_icms_vipidevol);
        det_total_icms.addContent(det_total_icms_vpis);
        det_total_icms.addContent(det_total_icms_vcofins);
        det_total_icms.addContent(det_total_icms_voutro);
        det_total_icms.addContent(det_total_icms_vNF);

        det_total.addContent(det_total_icms);

        //transporta

        det_transp_transporta.addContent(det_transp_transporta_cnpj);
        det_transp_transporta.addContent(det_transp_transporta_xnome);
        det_transp_transporta.addContent(det_transp_transporta_ie);
        det_transp_transporta.addContent(det_transp_transporta_xender);
        det_transp_transporta.addContent(det_transp_transporta_xmun);
        det_transp_transporta.addContent(det_transp_transporta_UF);
        det_transp_frete.addContent(det_transp_transporta);

        det_transp_veic.addContent(det_transp_veic_placa);
        det_transp_veic.addContent(det_transp_veic_UF);

        det_transp_vol.addContent(det_transp_vol_qvol);
        det_transp_vol.addContent(det_transp_vol_pesol);
        det_transp_vol.addContent(det_transp_vol_pesob);


        det_transp.addContent(det_transp_frete);
        det_transp.addContent(det_transp_veic);
        det_transp.addContent(det_transp_vol);


        //iniciando ---> cobr

        nitem_cobr_fat.addContent(nitem_cobr_fat_nfat);
        nitem_cobr_fat.addContent(nitem_cobr_fat_vorig);
        nitem_cobr_fat.addContent(nitem_cobr_fat_vdesc);
        nitem_cobr_fat.addContent(nitem_cobr_fat_vliq);

        nitem_cobr.addContent(nitem_cobr_fat);

        nitem_cobr_dup.addContent(nitem_cobr_dup_ndup);
        nitem_cobr_dup.addContent(nitem_cobr_dup_dvenc);
        nitem_cobr_dup.addContent(nitem_cobr_dup_vdup);

        nitem_cobr.addContent(nitem_cobr_dup);

        //---> incinado Tag Pag

        pag.addContent(pag_detpag);

        //iniciando --> infAdic

        infadic.addContent(infadic_infcpl);

        //--> infRespTec
        infresptec.addContent(infresptec_cnpj);
        infresptec.addContent(infresptec_xcontato);
        infresptec.addContent(infresptec_email);
        infresptec.addContent(infresptec_fone);

        infNFe.addContent(det_total);
        infNFe.addContent(det_transp);
        infNFe.addContent(nitem_cobr);
        infNFe.addContent(pag);
        infNFe.addContent(infadic);
        infNFe.addContent(infresptec);
        nfe.addContent(infNFe);

        XMLOutputter xout = new XMLOutputter();

        try {
            FileWriter arquivoXML = new FileWriter(
                    "C:\\Conversor_DI\\xmlNFe\\DI" + declaraoImportacao.getNumeroDI() + ".xml");

            xout.output(xmlNFEe, arquivoXML);

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
