package customer;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.IOException;

public class createJson {
    static final Logger logger = Logger.getLogger(createJson.class);
    public static void main(String[] args) throws IOException {

        customerData customer= new customerData();
        customer.setFirstName("Nicola");
        customer.setLastName("Durzi");
        customer.setAge(26);
        customer.setAddress(new address("Harav Robinshtein 33","Tel-Aviv",689654));
        customer.setphoneNumber(new phoneNumbers("Mobile","+972-52-8054836"));

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(customer);
        logger.info(json);
    }
}
