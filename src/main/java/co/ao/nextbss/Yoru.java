package co.ao.nextbss;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class Yoru<T> {
    private ObjectMapper mapper;

    public Yoru() {
        mapper = new ObjectMapper();
    }

    public String toJson(Object content) {
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        try {
            return ow.writeValueAsString(content);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public T fromJson(String body, Class<T> clazz) throws IOException {
        return mapper.readValue(body, clazz);
    }
}
