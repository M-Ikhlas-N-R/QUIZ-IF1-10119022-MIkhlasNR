package com.minr;

public interface ServiceItem {
    void displaySercive();
    float getPrice(int serviceItem);
    boolean checkMemberStatus(String statusMember);
    float getSale(boolean isMember, float parServicePrice);
}
