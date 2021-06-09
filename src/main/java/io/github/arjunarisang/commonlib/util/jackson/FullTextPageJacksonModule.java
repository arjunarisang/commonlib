package io.github.arjunarisang.commonlib.util.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.arjunarisang.commonlib.data.domain.DefaultFullTextPage;
import io.github.arjunarisang.commonlib.data.domain.FullTextPage;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public class FullTextPageJacksonModule extends Module {
    @Override
    public String getModuleName() {
        return "FullTextPageJacksonModule";
    }

    @Override
    public Version version() {
        return new Version(0, 1, 0, "", null, null);
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(FullTextPage.class, FullTextPageMixIn.class);
    }

    @JsonDeserialize(as = SimpleFullTextPage.class)
    private interface FullTextPageMixIn {

    }

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class SimpleFullTextPage<T> implements FullTextPage<T> {
        private final FullTextPage<T> delegate;

        SimpleFullTextPage(@JsonProperty("content") List<T> content,
                           @JsonProperty("facet") List<Map<String, Map<String, Long>>> facet,
                           @JsonProperty("sortable") List<String> sortable,
                           @JsonProperty("total_elements") long totalElements,
                           @JsonProperty("duration_millis") long durationMillis,
                           @JsonProperty("number") int number,
                           @JsonProperty("size") int size) {
            PageRequest pageRequest = PageRequest.of(number, size);

            delegate = new DefaultFullTextPage<>(content, facet, sortable, totalElements, durationMillis, pageRequest);
        }

        @Override
        public int getTotalPages() {
            return delegate.getTotalPages();
        }

        @Override
        public long getTotalElements() {
            return delegate.getTotalElements();
        }

        @Override
        public long getDurationMillis() {
            return delegate.getDurationMillis();
        }

        @Override
        public int getNumber() {
            return delegate.getNumber();
        }

        @Override
        public int getSize() {
            return delegate.getSize();
        }

        @Override
        public List<T> getContent() {
            return delegate.getContent();
        }

        @Override
        public List<Map<String, Map<String, Long>>> getFacet() {
            return delegate.getFacet();
        }

        @Override
        public List<String> getSortable() {
            return delegate.getSortable();
        }

        @Override
        public boolean isFirst() {
            return delegate.isFirst();
        }

        @Override
        public boolean isLast() {
            return delegate.isLast();
        }

        @JsonIgnore
        @Override
        public Pageable getPageable() {
            return null;
        }
    }

}
