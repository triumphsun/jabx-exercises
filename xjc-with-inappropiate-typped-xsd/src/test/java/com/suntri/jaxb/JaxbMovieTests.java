package com.suntri.jaxb;

import com.suntri.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;

public class JaxbMovieTests {

    private final String filenameXml = "movie.xml";
    private final String filenameXsd = "movie.xsd";

    @Test
    public void validateWithSchema(){
        try {
            Schema schema = JaxbUtils.getSchema(filenameXsd);
            Unmarshaller unmarshaller = JaxbUtils.getUnmarshaller(Movie.class, schema);

            Movie movie = (Movie) unmarshaller.unmarshal(JaxbUtils.getResourceURL(filenameXml));
            Assertions.assertEquals(3, movie.getCharacters().getCharacter().size());
            Assertions.assertEquals(2, movie.getCharacters().getCharacter().stream().filter(c->c.getGender().equals(Gender.MALE)).count());
            Assertions.assertEquals(181, movie.getRunningMinutes());
        } catch (JAXBException | SAXException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void unmarshallSampleXml(){
        try {
            Unmarshaller unmarshaller = JaxbUtils.getUnmarshaller(Movie.class, null);
            Movie movie = (Movie) unmarshaller.unmarshal(JaxbUtils.getResourceURL(filenameXml));
            Assertions.assertEquals(3, movie.getCharacters().getCharacter().size());
            Assertions.assertEquals(2, movie.getCharacters().getCharacter().stream().filter(c->c.getGender().equals(Gender.MALE)).count());
            Assertions.assertEquals(181, movie.getRunningMinutes());
        } catch (JAXBException e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

}
