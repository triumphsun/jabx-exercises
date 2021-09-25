package com.suntri.jaxb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BooleanAdapterTests {

    @Test
    public void whenParseNull_thenTrue(){
        Assertions.assertEquals(Boolean.TRUE, BooleanAdapter.parseYN(null));
    }

    @Test
    public void whenParseEmptyString_thenTrue(){
        Assertions.assertEquals(Boolean.TRUE, BooleanAdapter.parseYN(""));
    }

    @Test
    public void whenParseUpperY_thenTrue(){
        Assertions.assertEquals(Boolean.TRUE, BooleanAdapter.parseYN("Y"));
    }

    @Test
    public void whenParseLowerY_thenTrue(){
        Assertions.assertEquals(Boolean.TRUE, BooleanAdapter.parseYN("y"));
    }

    @Test
    public void whenParseUpperN_thenTrue(){
        Assertions.assertEquals(Boolean.FALSE, BooleanAdapter.parseYN("N"));
    }

    @Test
    public void whenParseLowerN_thenTrue(){
        Assertions.assertEquals(Boolean.FALSE, BooleanAdapter.parseYN("n"));
    }

}
