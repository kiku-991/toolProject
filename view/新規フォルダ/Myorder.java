package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "myorder")
public class Myorder{
	//�I�[�_�[�ԍ�
	private String orderId;
	//�I�[�_�[���
	private String orderStatus;
	//�w�����z
	private String purchasingPrice;
	//�쐬����
	private Date createTime;
	//�X�V����
	private Date modifyTime;
}