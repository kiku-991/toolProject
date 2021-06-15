package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product_img")
public class ProductImg{
	//è§ïiID
	private String productId;
	//ÇªÇÃëºé ê^
	private String productImg;
}