package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1112, "Audi TT", 400000));
        carList.add(new Car(282, "BMW X5", 500000));
        carList.add(new Car(1782, "Skoda Kodiaq", 1200000));
        carList.add(new Car(22212, "Mersedes-Benz XLS", 4000000));
        carList.add(new Car(1332, "Toyota Camry", 800000));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count == 0) {
            return carList;
        }

        return  carList.stream().limit(count).collect(Collectors.toList());
    }
}
