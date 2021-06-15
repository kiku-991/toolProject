package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "favorite")
public class Favorite{
	//ユーザID
	private String userId;
	//商品ID
	private String productId;
	//作成時間
	private Date createdate;
}