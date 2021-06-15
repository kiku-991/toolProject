package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "payment")
public class Payment{
	//�x��ID
	private String paymentId;
	//���[�UID
	private String userId;
	//�x�����z
	private String payTotal;
	//�x������
	private String payQuantity;
	//�x�����@
	private String payMethod;
	//�x������
	private Date payTime;
}