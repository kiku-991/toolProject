package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order_item")
public class OrderItem{
	//�I�[�_�[�ԍ�
	private String orderId;
	//���iID
	private String productId;
	//�m�莞���i��
	private String productName;
	//�m�莞���i�P��
	private String productPrice;
	//�m�莞����
	private String productQuantity;
}