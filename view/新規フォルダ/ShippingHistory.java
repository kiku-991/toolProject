package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "shipping_history")
public class ShippingHistory{
	//����ID
	private String historyId;
	//����ID
	private String shippingId;
	//���iID
	private String productId;
	//�ו��ԍ�
	private String courierCompany;
	//�z�B���
	private String trackingNumber;
	//��������
	private Date deliveryTime;
	//�͂�����
	private Date receiptTime;
}