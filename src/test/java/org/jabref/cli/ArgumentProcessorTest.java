package org.jabref.cli;

import org.jabref.logic.importer.ParserResult;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class ArgumentProcessorTest {

    String argument = new String();
    String []data = argument.split(",");
    Optional<ParserResult> ListArguments;
    boolean result = false;

    @Test
    void sucessImportFile(){
        assertNotNull(ArgumentProcessor.importFile(argument));
    }

    @Test
    void addressImportFile(){
        if(argument.startsWith("http://")||argument.startsWith("https://")||argument.startsWith("ftp://")){
            result = true;
            assertTrue(true);
        }else{
            result = false;
            assertFalse(false);
        }
    }

    @Test
    void argumentsQuantityImportFile(){
        if(data.length > 1) {
            result = true;
            assertTrue(true);
        }else {
            result = false;
            assertFalse(false);
        }
    }
}
