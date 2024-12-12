package web.Dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Lada", 2014, "green"));
        cars.add(new Car("Mazda", 2020, "blue"));
        cars.add(new Car("Toyota", 2004, "black"));
        cars.add(new Car("Bmw", 2023, "white"));
    }
    @Override
    public List<Car> getCars(int i) {
        return cars.stream().limit(i).toList();
    }
}
