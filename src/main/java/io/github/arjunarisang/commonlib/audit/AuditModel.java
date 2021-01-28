package io.github.arjunarisang.commonlib.audit;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class AuditModel {

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;

    public AuditModel() {
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AuditModel)) return false;
        final AuditModel other = (AuditModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        if (this$createdAt == null ? other$createdAt != null : !this$createdAt.equals(other$createdAt)) return false;
        final Object this$createdBy = this.getCreatedBy();
        final Object other$createdBy = other.getCreatedBy();
        if (this$createdBy == null ? other$createdBy != null : !this$createdBy.equals(other$createdBy)) return false;
        final Object this$updatedAt = this.getUpdatedAt();
        final Object other$updatedAt = other.getUpdatedAt();
        if (this$updatedAt == null ? other$updatedAt != null : !this$updatedAt.equals(other$updatedAt)) return false;
        final Object this$updatedBy = this.getUpdatedBy();
        final Object other$updatedBy = other.getUpdatedBy();
        if (this$updatedBy == null ? other$updatedBy != null : !this$updatedBy.equals(other$updatedBy)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuditModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $createdAt = this.getCreatedAt();
        result = result * PRIME + ($createdAt == null ? 43 : $createdAt.hashCode());
        final Object $createdBy = this.getCreatedBy();
        result = result * PRIME + ($createdBy == null ? 43 : $createdBy.hashCode());
        final Object $updatedAt = this.getUpdatedAt();
        result = result * PRIME + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        final Object $updatedBy = this.getUpdatedBy();
        result = result * PRIME + ($updatedBy == null ? 43 : $updatedBy.hashCode());
        return result;
    }

    public String toString() {
        return "AuditModel(createdAt=" + this.getCreatedAt() + ", createdBy=" + this.getCreatedBy() + ", updatedAt=" + this.getUpdatedAt() + ", updatedBy=" + this.getUpdatedBy() + ")";
    }
}
