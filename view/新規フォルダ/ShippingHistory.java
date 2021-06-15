package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "shipping_history")
public class ShippingHistory{
	//—š—ğID
	private String historyId;
	//•¨—¬ID
	private String shippingId;
	//¤•iID
	private String productId;
	//‰×•¨”Ô†
	private String courierCompany;
	//”z’B‰ïĞ
	private String trackingNumber;
	//”­‘—ŠÔ
	private Date deliveryTime;
	//“Í‚¯ŠÔ
	private Date receiptTime;
}