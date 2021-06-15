package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "payment_history")
public class PaymentHistory{
	//—š—ğID
	private String historyId;
	//x•¥ID
	private String paymentId;
	//ƒ†[ƒUID
	private String userId;
	//x•¥‘Šz
	private String payTotal;
	//x•¥”—Ê
	private String payQuantity;
	//x•¥•û–@
	private String payMethod;
	//x•¥ŠÔ
	private Date payTime;
}