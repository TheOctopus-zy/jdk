package copy;

import java.io.ObjectStreamField;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * String复制
 **/
public final class StringCopy implements java.io.Serializable, Comparable<String>, CharSequence {


    private final char value[];

    private int hash;

    private static final long serialVersionUID = -6849794470754667710L;

    public StringCopy() {
        this.value = new char[0];
    }


    private StringCopy(StringCopy original) {
        this.value = original.value;
        this.hash = original.hash;
    }

    public StringCopy(char[] value) {
        this.value = Arrays.copyOf(value, value.length);

    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
