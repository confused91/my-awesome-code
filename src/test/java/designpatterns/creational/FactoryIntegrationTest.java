package designpatterns.creational;

import classtraining.designpatterns.factory.Polygon;
import classtraining.designpatterns.factory.PolygonFactory;
import classtraining.designpatterns.factory.Triangle;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class FactoryIntegrationTest {
    Logger logger= LogManager.getLogger(FactoryIntegrationTest.class);
    @Test
    public void whenUsingFactoryForSquare_thenCorrectObjectReturned() {
        Polygon p;
        PolygonFactory factory = new PolygonFactory();

        //get the shape which has 4 sides
        p = factory.getPolygon(4);
        String result = "The shape with 4 sides is a " + p.getType();
        logger.info(result);
        p = factory.getPolygon(5);
         result = "The shape with 5 sides is a " + p.getType();
        logger.info(result);
        p = factory.getPolygon(3);
        result = "The shape with 3 sides is a " + p.getType();
        logger.info(result);
        p = factory.getPolygon(7);
        result = "The shape with 7 sides is a " + p.getType();
        logger.info(result);
        p = factory.getPolygon(8);
        result = "The shape with 8 sides is a " + p.getType();
        logger.info(result);

    }


}
