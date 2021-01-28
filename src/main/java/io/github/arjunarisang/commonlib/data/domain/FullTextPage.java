package io.github.arjunarisang.commonlib.data.domain;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface FullTextPage<T> {

    List<T> getContent();

    List<Map<String, Map<String, Long>>> getFacet();

    List<String> getSortable();

    long getDurationMillis();

    Pageable getPageable();

    boolean isFirst();

    boolean isLast();

    int getTotalPages();

    long getTotalElements();

    int getSize();

    /**
     * Returns the number of the current Page. Is always non-negative.
     *
     * @return the number of the current Page.
     */
    int getNumber();
}
