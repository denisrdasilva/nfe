package com.fincatto.nfe310.classes.lote.consulta;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.dfe.classes.DFAmbiente;
import com.fincatto.nfe310.classes.lote.consulta.NFLoteConsulta;

public class NFLoteConsultaTest {

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFLoteConsulta consulta = new NFLoteConsulta();
        consulta.setAmbiente(DFAmbiente.HOMOLOGACAO);
        consulta.setRecibo("ItbDxsHiXUqeCEM");
        consulta.setVersao(new BigDecimal("2.00"));

        final String xmlEsperado = "<consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>ItbDxsHiXUqeCEM</nRec></consReciNFe>";
        Assert.assertEquals(xmlEsperado, consulta.toString());
    }
}