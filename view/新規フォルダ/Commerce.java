package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "commerce")
public class Commerce{
	//�I�[�_�[ID
	private String orderId;
	//�x����ID
	private String paymentId;
	//����ID
	private String shippingId;
	//���[�UID
	private String userId;
	//�쐬����
	private Date createdate;
}