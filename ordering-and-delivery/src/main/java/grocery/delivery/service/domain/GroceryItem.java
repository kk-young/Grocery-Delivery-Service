package grocery.delivery.service.domain;

import grocery.delivery.service.OrderingAndDeliveryApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "GroceryItem_table")
@Data
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private Integer quantity;

    private Float price;

    public static GroceryItemRepository repository() {
        GroceryItemRepository groceryItemRepository = OrderingAndDeliveryApplication.applicationContext.getBean(
            GroceryItemRepository.class
        );
        return groceryItemRepository;
    }
}
