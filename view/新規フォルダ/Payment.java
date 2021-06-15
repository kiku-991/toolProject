package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "payment")
public class Payment{
	//x¥ID
	private String paymentId;
	//[UID
	private String userId;
	//x¥z
	private String payTotal;
	//x¥Ê
	private String payQuantity;
	//x¥û@
	private String payMethod;
	//x¥Ô
	private Date payTime;
}