package io.github.arjunarisang.commonlib.util.response;

public class UserProfileResponse {

    private String status;
    private String message;
    private Integer total;
    private UserProfile data;

    UserProfileResponse(String status, String message, Integer total, UserProfile data) {
        this.status = status;
        this.message = message;
        this.total = total;
        this.data = data;
    }

    public UserProfileResponse() {
    }

    public static UserProfileResponseBuilder builder() {
        return new UserProfileResponseBuilder();
    }

    public String getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getTotal() {
        return this.total;
    }

    public UserProfile getData() {
        return this.data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setData(UserProfile data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserProfileResponse)) return false;
        final UserProfileResponse other = (UserProfileResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$data = this.getData();
        final Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserProfileResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "UserProfileResponse(status=" + this.getStatus() + ", message=" + this.getMessage() + ", total=" + this.getTotal() + ", data=" + this.getData() + ")";
    }

    public static class UserProfileResponseBuilder {
        private String status;
        private String message;
        private Integer total;
        private UserProfile data;

        UserProfileResponseBuilder() {
        }

        public UserProfileResponse.UserProfileResponseBuilder status(String status) {
            this.status = status;
            return this;
        }

        public UserProfileResponse.UserProfileResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public UserProfileResponse.UserProfileResponseBuilder total(Integer total) {
            this.total = total;
            return this;
        }

        public UserProfileResponse.UserProfileResponseBuilder data(UserProfile data) {
            this.data = data;
            return this;
        }

        public UserProfileResponse build() {
            return new UserProfileResponse(status, message, total, data);
        }

        public String toString() {
            return "UserProfileResponse.UserProfileResponseBuilder(status=" + this.status + ", message=" + this.message + ", total=" + this.total + ", data=" + this.data + ")";
        }
    }
}
