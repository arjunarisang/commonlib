package io.github.arjunarisang.commonlib.data.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DefaultFullTextPage<T> implements FullTextPage<T>, Serializable {

    private static final long serialVersionUID = 6009180136294289135L;

    private final List<T> content = new ArrayList<>();

    private final List<Map<String, Map<String, Long>>> facet = new ArrayList<>();

    private final List<String> sortable = new ArrayList<>();

    private final long durationMillis;

    private final long total;

    private final Pageable pageable;

    public DefaultFullTextPage(List<T> content, long total,
                               Pageable pageable) {
        Assert.notNull(content, "Content must not be null!");
        Assert.notNull(pageable, "Pageable must not be null!");

        this.content.addAll(content);
        this.durationMillis = 0L;
        this.pageable = pageable;
        this.total = total;
    }

    public DefaultFullTextPage(List<T> content, List<Map<String, Map<String, Long>>> facet, long total, Pageable pageable) {
        Assert.notNull(content, "Content must not be null!");
        Assert.notNull(facet, "Facet must not be null!");
        Assert.notNull(pageable, "Pageable must not be null!");

        this.content.addAll(content);
        this.durationMillis = 0L;
        this.facet.addAll(facet);
        this.pageable = pageable;
        this.total = total;
    }

    public DefaultFullTextPage(List<T> content, List<Map<String, Map<String, Long>>> facet, long total, long durationMillis, Pageable pageable) {
        Assert.notNull(content, "Content must not be null!");
        Assert.notNull(facet, "Facet must not be null!");
        Assert.notNull(pageable, "Pageable must not be null!");

        this.content.addAll(content);
        this.durationMillis = durationMillis;
        this.pageable = pageable;
        this.facet.addAll(facet);
        this.total = total;
    }

    public DefaultFullTextPage(List<T> content, List<Map<String, Map<String, Long>>> facet, List<String> sortable, long total, long durationMillis, Pageable pageable) {
        Assert.notNull(content, "Content must not be null!");
        Assert.notNull(facet, "Facet must not be null!");
        Assert.notNull(pageable, "Pageable must not be null!");

        this.content.addAll(content);
        this.durationMillis = durationMillis;
        this.pageable = pageable;
        this.facet.addAll(facet);
        this.sortable.addAll(sortable);
        this.total = total;
    }

    @Override
    public List<T> getContent() {
        return Collections.unmodifiableList(content);
    }

    @Override
    public List<Map<String, Map<String, Long>>> getFacet() {
        return Collections.unmodifiableList(facet);
    }

    @Override
    public List<String> getSortable() {
        return sortable;
    }

    @Override
    public long getDurationMillis() {
        return durationMillis;
    }

    @JsonIgnore
    @Override
    public Pageable getPageable() {
        return null;
    }

    @Override
    public int getNumber() {
        return pageable.getPageNumber();
    }

    @Override
    public int getSize() {
        return pageable.getPageSize();
    }

    private boolean hasPrevious() {
        return getNumber() > 0;
    }

    @Override
    public boolean isFirst() {
        return !hasPrevious();
    }

    private boolean hasNext() {
        return getNumber() + 1 < getTotalPages();
    }

    @Override
    public boolean isLast() {
        return !hasNext();
    }

    @Override
    public int getTotalPages() {
        return getSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) getSize());
    }

    @Override
    public long getTotalElements() {
        return total;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DefaultFullTextPage)) return false;
        final DefaultFullTextPage<?> other = (DefaultFullTextPage<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$facet = this.getFacet();
        final Object other$facet = other.getFacet();
        if (this$facet == null ? other$facet != null : !this$facet.equals(other$facet)) return false;
        final Object this$sortable = this.getSortable();
        final Object other$sortable = other.getSortable();
        if (this$sortable == null ? other$sortable != null : !this$sortable.equals(other$sortable)) return false;
        if (this.getDurationMillis() != other.getDurationMillis()) return false;
        if (this.total != other.total) return false;
        final Object this$pageable = this.getPageable();
        final Object other$pageable = other.getPageable();
        if (this$pageable == null ? other$pageable != null : !this$pageable.equals(other$pageable)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DefaultFullTextPage;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $facet = this.getFacet();
        result = result * PRIME + ($facet == null ? 43 : $facet.hashCode());
        final Object $sortable = this.getSortable();
        result = result * PRIME + ($sortable == null ? 43 : $sortable.hashCode());
        final long $durationMillis = this.getDurationMillis();
        result = result * PRIME + (int) ($durationMillis >>> 32 ^ $durationMillis);
        final long $total = this.total;
        result = result * PRIME + (int) ($total >>> 32 ^ $total);
        final Object $pageable = this.getPageable();
        result = result * PRIME + ($pageable == null ? 43 : $pageable.hashCode());
        return result;
    }

    public String toString() {
        return "DefaultFullTextPage(content=" + this.getContent() + ", facet=" + this.getFacet() + ", sortable=" + this.getSortable() + ", durationMillis=" + this.getDurationMillis() + ", total=" + this.total + ", pageable=" + this.getPageable() + ")";
    }
}
