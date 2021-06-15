package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product{
	//¤iID
	private String productId;
	//XÜID
	private String storeId;
	//¤i¼
	private String productName;
	//¤i¿i
	private String productPrice;
	//¤iåvÊ^
	private String productImg;
	//¤ià¾
	private String productContents;
	//[J[
	private String maker;
	//ÝÉ
	private String stock;
	//óÔ
	private String status;
	//ì¬Ô
	private Date createTime;
}