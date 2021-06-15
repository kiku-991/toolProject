package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product{
	//商品ID
	private String productId;
	//店舗ID
	private String storeId;
	//商品名
	private String productName;
	//商品価格
	private String productPrice;
	//商品主要写真
	private String productImg;
	//商品説明
	private String productContents;
	//メーカー
	private String maker;
	//在庫
	private String stock;
	//状態
	private String status;
	//作成時間
	private Date createTime;
}