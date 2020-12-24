package interFace;

import java.util.Date;

public class SimCard extends Product implements Expirable,Warrantable{
    
	private Date expirDate;
	
	public SimCard(String name, int price, Date expirDate) {
		super(name, price);
		this.expirDate = expirDate;
	}

	@Override
	public int 保固天數() {// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public Date 最後使用期限() {
		
		return this.expirDate;
	}
	   @Override
	    public String desc() {
	        String des = super.desc();
	        
	        return des+"開卡日期="+this.expirDate+",可以使用="+保固天數()+"天";
	    }



}
