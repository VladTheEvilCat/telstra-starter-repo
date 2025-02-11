package au.com.telstra.simcardactivator.model;

import java.util.Objects;

public class SimCard {
    String iccid;
    String customerEmail;
    boolean active;

    public SimCard() {}
    public SimCard(String iccid, String customerEmail, boolean active) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public String getIccid() { return iccid;}
    public void setIccid(String iccid) { this.iccid = iccid; }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCard simCard = (SimCard) o;
        return active == simCard.active && Objects.equals(iccid, simCard.iccid) && Objects.equals(customerEmail, simCard.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iccid, customerEmail, active);
    }

    @Override
    public String toString() {
        return "SimCardActivate{" +
                "iccid='" + iccid + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", active=" + active +
                '}';
    }
}