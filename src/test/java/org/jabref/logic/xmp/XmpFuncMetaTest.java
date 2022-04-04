package org.jabref.logic.xmp;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XmpFuncMetaTest {

    Random random= new Random();

    @Test
    public void VariavelNull(){
        int opcao = random.nextInt(4);
        XmpFuncMeta teste = new XmpFuncMeta("title","author","Subject","data");
        String result = teste.retiraVariavel(opcao);
        assertEquals(null, result);
    }

}
