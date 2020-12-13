package id.go.kemenkeu.bppk.commonlib.converter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Converter
public class SetIntegerToStringConverter implements AttributeConverter<Set<Integer>, String> {

    @Override
    public String convertToDatabaseColumn(Set<Integer> attribute) {
        if (attribute == null || attribute.isEmpty()) {
            return "";
        }

        Set<String> strings = new HashSet<>();
        for (Integer att : attribute) {
            strings.add(Integer.toString(att));
        }

        return StringUtils.join(strings, "|");
    }

    @Override
    public Set<Integer> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.trim().length() == 0) {
            return new HashSet<>();
        }

        String[] data = dbData.split("\\s*\\|\\s*");
        Set<Integer> intSet = new HashSet<>();
        for (String d : data) {
            intSet.add(Integer.valueOf(d));
        }

        return intSet;
    }
}
