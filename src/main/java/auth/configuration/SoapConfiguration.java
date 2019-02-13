package auth.configuration;

import auth.controller.AuthClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by greensize on 27/10/2017.
 */
@Configuration
public class SoapConfiguration {
    @Value( "${soap.auth.package}" )
    private String soapAuthPackage;

    @Value( "${soap.auth.endpoint}" )
    private String soapAuthEndpoint;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(soapAuthPackage);
        return marshaller;
    }

    @Bean
    public AuthClient authClient(Jaxb2Marshaller marshaller) {
        AuthClient client = new AuthClient();
        client.setDefaultUri(soapAuthEndpoint);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
