package co.ao.nextbss;

import co.ao.nextbss.model.Coordinates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class YoruUnitTest {
    private String toJsonExpectation = "{\n" +
            "  \"x\" : 10.0,\n" +
            "  \"y\" : 20.0,\n" +
            "  \"z\" : 30.0\n" +
            "}";
    @Test
    public void toJson() {
        Coordinates coordinates = new Coordinates(10, 20, 30);
        Yoru<Coordinates> converter = new Yoru<>();
        Assertions.assertEquals(toJsonExpectation, converter.toJson(coordinates));
    }

    @Test
    public void fromJson() throws IOException {
        Yoru<Coordinates> converter = new Yoru<>();
        Assertions.assertEquals(new Coordinates(10, 20, 30).getX(), converter.fromJson(toJsonExpectation, Coordinates.class).getX());
        Assertions.assertEquals(new Coordinates(10, 20, 30).getY(), converter.fromJson(toJsonExpectation, Coordinates.class).getY());
        Assertions.assertEquals(new Coordinates(10, 20, 30).getZ(), converter.fromJson(toJsonExpectation, Coordinates.class).getZ());
    }

    @Test
    public void fromJsonFailure() throws IOException {
        Yoru<Coordinates> converter = new Yoru<>();
        Assertions.assertNotEquals(new Coordinates(11, 21, 31).getX(), converter.fromJson(toJsonExpectation, Coordinates.class).getX());
        Assertions.assertNotEquals(new Coordinates(11, 21, 31).getY(), converter.fromJson(toJsonExpectation, Coordinates.class).getY());
        Assertions.assertNotEquals(new Coordinates(11, 21, 31).getZ(), converter.fromJson(toJsonExpectation, Coordinates.class).getZ());
    }
}
