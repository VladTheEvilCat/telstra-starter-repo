package au.com.telstra.simcardactivator.dto;

import java.util.Objects;

public class SimCardActivateResp {
    boolean success;
    Long id;

    public SimCardActivateResp() {}
    public SimCardActivateResp(boolean success) {
        this.success = success;
    }
    public SimCardActivateResp(boolean success, Long id) {
        this.success = success;
        this.id = id;
    }

    public boolean getSuccess() { return this.success; }
    public void setSuccess(boolean success) { this.success = success; }

    public Long getId() { return this.id; }
    public void setId(Long id) { this.id = id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimCardActivateResp that = (SimCardActivateResp) o;
        return Objects.equals(this.success, that.success) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.success,this.id);
    }

    @Override
    public String toString() {
        return "SimCardActivateResp{" +
                "success=" + this.success +
                ", id=" + this.id +
                '}';
    }
}