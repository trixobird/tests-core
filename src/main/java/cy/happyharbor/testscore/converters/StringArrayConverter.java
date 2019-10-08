package cy.happyharbor.testscore.converters;

import cy.happyharbor.testscore.annotations.StringArrayParam;
import junitparams.converters.Converter;

public class StringArrayConverter implements Converter<StringArrayParam, String[]> {


    public void initialize(StringArrayParam intArrayParam) {
        // Nothing to initialize
    }

    public String[] convert(Object o) {
        final String str = (String) o;
        return str.split(";");
    }
}
