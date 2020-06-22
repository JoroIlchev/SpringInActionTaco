package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, String> {

    List<Order> findAllByZip(String zipCode);
    List<Order> findAllByZipAndPlacedAtBetween(String zipCode, Date startDate, Date endDate);

    Order save(Order order);
}
