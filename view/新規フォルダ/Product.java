package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product{
	//���iID
	private String productId;
	//�X��ID
	private String storeId;
	//���i��
	private String productName;
	//���i���i
	private String productPrice;
	//���i��v�ʐ^
	private String productImg;
	//���i����
	private String productContents;
	//���[�J�[
	private String maker;
	//�݌�
	private String stock;
	//���
	private String status;
	//�쐬����
	private Date createTime;
}