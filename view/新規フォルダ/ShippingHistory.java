package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "shipping_history")
public class ShippingHistory{
	//履歴ID
	private String historyId;
	//物流ID
	private String shippingId;
	//商品ID
	private String productId;
	//荷物番号
	private String courierCompany;
	//配達会社
	private String trackingNumber;
	//発送時間
	private Date deliveryTime;
	//届け時間
	private Date receiptTime;
}