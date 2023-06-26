package grocery.delivery.service.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class PlaceOrderCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;GroceryItem&gt; items;


}
