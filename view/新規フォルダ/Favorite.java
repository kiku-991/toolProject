package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "favorite")
public class Favorite{
	//���[�UID
	private String userId;
	//���iID
	private String productId;
	//�쐬����
	private Date createdate;
}