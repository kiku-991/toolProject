package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product_img")
public class ProductImg{
	//¤iID
	private String productId;
	//»Ì¼Ê^
	private String productImg;
}