package com.suntri.jaxb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenderTests {

    @Test
    public void whenParseNull_thenMale(){
        Assertions.assertEquals(Gender.MALE, Gender.parseMF(null));
    }

    @Test
    public void whenParseEmptyString_thenMale(){
        Assertions.assertEquals(Gender.MALE, Gender.parseMF(""));
    }

    @Test
    public void whenParseUpperM_thenMale(){
        Assertions.assertEquals(Gender.MALE, Gender.parseMF("M"));
    }

    @Test
    public void whenParseLowerM_thenMale(){
        Assertions.assertEquals(Gender.MALE, Gender.parseMF("m"));
    }

    @Test
    public void whenParseUpperF_thenFemale(){
        Assertions.assertEquals(Gender.FEMALE, Gender.parseMF("F"));
    }

    @Test
    public void whenParseLowerF_thenFemale(){
        Assertions.assertEquals(Gender.FEMALE, Gender.parseMF("f"));
    }

    @Test
    public void whenParseStringStartsWithUpperM_thenMale(){
        Assertions.assertEquals(Gender.MALE, Gender.parseMF("Metro"));
    }

    @Test
    public void whenParseStringStartsWithLowerM_themMale(){
        Assertions.assertEquals(Gender.MALE, Gender.parseMF("metro"));
    }

}
