package id.go.kemenkeu.bppk.commonlib.util;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.*;

@Slf4j
public class IgnoreProps {

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
        List<String> props = new ArrayList<>(Arrays.asList(propsToNullify));

        for (String prop : props) {
            src.setPropertyValue(prop, null);
        }

        return src.getWrappedInstance();
    }

    public static String[] addPropsToIgnore(String[] source, String... propsToIgnore) {
        List<String> sourceList = Lists.newArrayList(source);
        sourceList.addAll(Arrays.asList(propsToIgnore));

        String[] finalIgnored = new String[sourceList.size()];
        sourceList.toArray(finalIgnored);
        return finalIgnored;
    }

}
