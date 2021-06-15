package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "mycart")
public class Mycart{
	//ƒ†[ƒUID
	private String userId;
	//¤•iID
	private String productId;
	//”—Ê
	private String quantity;
	//ó‘Ô
	private String checkstatus;
}