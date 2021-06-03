package io.github.arjunarisang.commonlib.util.request;

public class SearchKeywordRequest {

    private String keyword;

    public SearchKeywordRequest(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SearchKeywordRequest)) return false;
        final SearchKeywordRequest other = (SearchKeywordRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$keyword = this.getKeyword();
        final Object other$keyword = other.getKeyword();
        if (this$keyword == null ? other$keyword != null : !this$keyword.equals(other$keyword)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SearchKeywordRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $keyword = this.getKeyword();
        result = result * PRIME + ($keyword == null ? 43 : $keyword.hashCode());
        return result;
    }

    public String toString() {
        return "SearchKeywordRequest(keyword=" + this.getKeyword() + ")";
    }
}
