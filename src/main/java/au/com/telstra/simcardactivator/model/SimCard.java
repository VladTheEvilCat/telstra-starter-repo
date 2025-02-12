package au.com.telstra.simcardactivator.model;

import java.util.Objects;

public class SimCard {

    Long id;
    String iccid;
    String customerEmail;
    boolean active;

    public SimCard() {}
    public SimCard(String iccid, String customerEmail, boolean active) {
        this.iccid = iccid;
        this.customerEmail = customerEmail;
        this.active = active;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

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
        return active == simCard.active && Objects.equals(this.id, simCard.id) && Objects.equals(this.iccid, simCard.iccid) && Objects.equals(this.customerEmail, simCard.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.iccid, this.customerEmail, this.active);
    }

    @Override
    public String toString() {
        return "SimCardActivate{" +
                "id=" + this.id +
                "iccid='" + this.iccid + '\'' +
                ", customerEmail='" + this.customerEmail + '\'' +
                ", active=" + this.active +
                '}';
    }
}