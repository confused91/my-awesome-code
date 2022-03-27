package com.training.designpatterns.builder.example.builders;


import com.training.designpatterns.builder.example.cars.CarType;
import com.training.designpatterns.builder.example.components.Engine;
import com.training.designpatterns.builder.example.components.GPSNavigator;
import com.training.designpatterns.builder.example.components.Transmission;
import com.training.designpatterns.builder.example.components.TripComputer;

/**
 * EN: Builder interface defines all possible ways to configure a product.
 *
 * RU: Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
