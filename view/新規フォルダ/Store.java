package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "store")
public class Store{
	//�X��ID
	private String storeId;
	//���[�UID
	private String userId;
	//�X�ܖ�
	private String storeName;
	//�X�ܗX��
	private String storePostcode;
	//�X�ܓs���{��
	private String storeTodoufuken;
	//�X�܎s�撬��
	private String storeShikucyouson;
	//�X�ܒ��ڔԒn
	private String storeCyomebanchi;
	//�X�ܘA��
	private String storePhone;
	//�X�܏��
	private String storeStatus;
}