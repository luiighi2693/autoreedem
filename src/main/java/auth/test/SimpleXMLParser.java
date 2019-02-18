package auth.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;

public class SimpleXMLParser<T> {
    public void parseXml(T t){
        try{
            //creating the JAXB context
            JAXBContext jContext = JAXBContext.newInstance(t.getClass());
            //creating the marshaller object
            Marshaller marshallObj = jContext.createMarshaller();
            //setting the property to show xml format output
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //setting the values in POJO class
            //calling the marshall method
            marshallObj.marshal(t, new FileOutputStream("C:\\tmp\\demo.xml"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
