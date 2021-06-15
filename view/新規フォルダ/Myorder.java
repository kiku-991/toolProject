package ;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "myorder")
public class Myorder{
	//オーダー番号
	private String orderId;
	//オーダー状態
	private String orderStatus;
	//購入金額
	private String purchasingPrice;
	//作成時間
	private Date createTime;
	//更新時間
	private Date modifyTime;
}