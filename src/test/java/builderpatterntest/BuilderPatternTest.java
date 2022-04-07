package builderpatterntest;

import com.training.designpatterns.builder.example.builders.CarBuilder;
import com.training.designpatterns.builder.example.builders.CarManualBuilder;
import com.training.designpatterns.builder.example.cars.Car;
import com.training.designpatterns.builder.example.cars.Manual;
import com.training.designpatterns.builder.example.director.Director;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class BuilderPatternTest {
    Logger logger = LogManager.getLogger(BuilderPatternTest.class);
    Director director;
    CarBuilder builder;
    CarManualBuilder manualBuilder;

    @Before
    public void setup() {
        director = new Director();
        builder = new CarBuilder();
        manualBuilder = new CarManualBuilder();
    }

    @Test
    public void buildSuvCar() {
        director.constructSUV(builder);
        Car car = builder.getResult();
        logger.info("Car built:\n" + car.getCarType());
    }

    @Test
    public void buildSportsCar() {
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        logger.info("Car built:\n" + car.getCarType());
    }

    @Test
    public void buildSuvCarManual() {
        director.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        logger.info("\nCar manual built:\n" + carManual.print());
    }

    @Test
    public void buildSportsCarManual() {
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        logger.info("\nCar manual built:\n" + carManual.print());
    }
}
