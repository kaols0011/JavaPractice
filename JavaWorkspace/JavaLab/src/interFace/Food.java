package interFace;

import java.util.Date;

public class Food extends Product implements Expirable {


    private Date expireDate;

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        description = description +",到期日："+expireDate;
        return description;
    }



	@Override
	public Date 最後使用期限() {
		// TODO Auto-generated method stub
		return this.expireDate;
	}
}
