package org.jabref.logic.xmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XmpFuncMetaTest {

    @Test
    public void VariavelNull(){
        int opcao = 0;
        XmpFuncMeta teste = new XmpFuncMeta("title","author","Subject","data");
        String result = teste.retiraVariavel(opcao);
        assertEquals(null, result);
    }

}
