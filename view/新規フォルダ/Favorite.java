package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "favorite")
public class Favorite{
	//ƒ†[ƒUID
	private String userId;
	//¤•iID
	private String productId;
	//ì¬ŠÔ
	private Date createdate;
}