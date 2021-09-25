package com.suntri.jaxb;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.net.URL;

public class JaxbUtils {

    protected static Unmarshaller getUnmarshaller(Class clazz, Schema schema) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        if(schema!=null){
            unmarshaller.setSchema(schema);
        }
        return unmarshaller;
    }

    protected static Schema getSchema(String filename) throws SAXException {
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(getResourceURL(filename));
        return schema;
    }

    protected static URL getResourceURL(String filename){
        return JaxbUtils.class.getClassLoader().getResource(filename);
    }

}
