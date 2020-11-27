package com.minr;

public class ServicePrice implements ServiceItem{

    float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public void displaySercive() {
        System.out.print(
                "#*************************# \n" +
                "#***Rock n Roll Haircut***# \n" +
                "#*******Service List******# \n" +
                "1. Haircut : IDR 45K \n" +
                "2. Haircut + Hairwash: IDR 55K \n" +
                "3. Hairwash Only : IDR 15K \n" +
                "#*************************# \n" +
                "Choose (1/2/3): ");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch (serviceItem){
            case 1 :
                return 45000;
            case 2 :
                return 55000;
            case 3 :
                return 15000;
            default:
                return 0;
        }
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        String status = statusMember.toLowerCase();
        if(status.equals("yes")) return true;
        return false;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember) return parServicePrice * 0.1f;
        return 0;
    }

    float getTotalPay(float priceService, float discount){
        return priceService - discount;
    }
}
