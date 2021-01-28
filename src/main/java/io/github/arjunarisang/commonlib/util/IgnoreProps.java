package io.github.arjunarisang.commonlib.util;

import org.slf4j.Logger;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IgnoreProps {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(IgnoreProps.class);

    public IgnoreProps() {
        log.error("Error! Trying to create IgnoreProps instances.");
        throw new AssertionError("No instances of IgnoreProps created!");
    }

    public static String[] invoke(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        emptyNames.add("id");
        emptyNames.add("createdDate");
        emptyNames.add("createdBy");
        emptyNames.add("updatedDate");
        emptyNames.add("updatedBy");

        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }

        String[] result = new String[emptyNames.size()];

        return emptyNames.toArray(result);
    }

    public static Object nullify(Object source, String... propsToNullify) {
        final BeanWrapper src = new BeanWrapperImpl(source);

        for (String prop : propsToNullify) {
            src.setPropertyValue(prop, null);
        }

        return src.getWrappedInstance();
    }

    public static String[] addPropsToIgnore(String[] source, String... propsToIgnore) {
        List<String> sourceList = Arrays.asList(source);
        sourceList.addAll(Arrays.asList(propsToIgnore));

        String[] finalIgnored = new String[sourceList.size()];
        sourceList.toArray(finalIgnored);
        return finalIgnored;
    }

}
