package io.github.arjunarisang.commonlib.audit;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AuditModel2 {

    @CreatedDate
    private LocalDateTime createdDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedDate;

    @LastModifiedBy
    private String updatedBy;

    public AuditModel2() {
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuditModel2)) return false;
        final AuditModel2 other = (AuditModel2) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate))
            return false;
        final Object this$createdBy = this.getCreatedBy();
        final Object other$createdBy = other.getCreatedBy();
        if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
        final Object this$updatedDate = this.getUpdatedDate();
        final Object other$updatedDate = other.getUpdatedDate();
        if (this$updatedDate == null ? other$updatedDate != null : !this$updatedDate.equals(other$updatedDate))
            return false;
        final Object this$updatedBy = this.getUpdatedBy();
        final Object other$updatedBy = other.getUpdatedBy();
        if (this$updatedBy == null ? other$updatedBy != null : !this$updatedBy.equals(other$updatedBy)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuditModel2;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $createdDate = this.getCreatedDate();
        result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
        final Object $createdBy = this.getCreatedBy();
        result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
        final Object $updatedDate = this.getUpdatedDate();
        result = result * PRIME + ($updatedDate == null ? 43 : $updatedDate.hashCode());
        final Object $updatedBy = this.getUpdatedBy();
        result = result * PRIME + ($updatedBy == null ? 43 : $updatedBy.hashCode());
        return result;
    }

    public String toString() {
        return "AuditModel2(createdDate=" + this.getCreatedDate() + ", createdBy=" + this.getCreatedBy() + ", updatedDate=" + this.getUpdatedDate() + ", updatedBy=" + this.getUpdatedBy() + ")";
    }
}
