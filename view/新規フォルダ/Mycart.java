package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "mycart")
public class Mycart{
	//ユーザID
	private String userId;
	//商品ID
	private String productId;
	//数量
	private String quantity;
	//状態
	private String checkstatus;
}