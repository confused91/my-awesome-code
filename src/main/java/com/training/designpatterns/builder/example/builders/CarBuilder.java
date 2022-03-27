package com.training.designpatterns.builder.example.builders;

import com.training.designpatterns.builder.example.cars.Car;
import com.training.designpatterns.builder.example.cars.CarType;
import com.training.designpatterns.builder.example.components.Engine;
import com.training.designpatterns.builder.example.components.GPSNavigator;
import com.training.designpatterns.builder.example.components.Transmission;
import com.training.designpatterns.builder.example.components.TripComputer;


/**
 * EN: Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
