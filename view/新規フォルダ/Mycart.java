package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "mycart")
public class Mycart{
	//���[�UID
	private String userId;
	//���iID
	private String productId;
	//����
	private String quantity;
	//���
	private String checkstatus;
}