package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.joining;
import static org.j8unit.generator.util.OptionalString.ofEmptyable;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link String} stuff.
 * </p>
 */
public enum Strings {
    ;

    /**
     * Capitalizes the first letter of a given {@link String}.
     *
     * @param string
     *            the input string
     * @return input string but with capitalized first letter
     */
    public static final String capFirst(final String string) {
        switch (requireNonNull(string)) {
            case "":
                return string;
            default:
                return string.substring(0, 1).toUpperCase() + string.substring(1);
        }
    }

    public static final String implode(final Stream<? extends CharSequence> data, final String pre, final String post, final String delimiter,
                                       final String before, final String after) {
        requireNonNull(data);
        requireNonNull(delimiter);
        requireNonNull(pre);
        requireNonNull(post);
        requireNonNull(before);
        requireNonNull(after);
        return ofEmptyable(data.map(d -> pre + d + post).collect(joining(delimiter))).surround(before, after).orEmpty();
    }

    public static final String implode(final Iterable<? extends CharSequence> data, final String pre, final String post, final String delimiter,
                                       final String before, final String after) {
        requireNonNull(data);
        requireNonNull(delimiter);
        requireNonNull(pre);
        requireNonNull(post);
        requireNonNull(before);
        requireNonNull(after);
        return implode(StreamSupport.stream(data.spliterator(), false), pre, post, delimiter, before, after);
    }

    public static final String bcsv(final Stream<? extends CharSequence> data) {
        requireNonNull(data);
        return implode(data, EMPTY, EMPTY, COMMA, LC, RC);
    }

    public static final String bcsv(final Iterable<? extends CharSequence> data) {
        requireNonNull(data);
        return bcsv(StreamSupport.stream(data.spliterator(), false));
    }

    public static final String bcsv(final CharSequence... data) {
        requireNonNull(data);
        return bcsv(Arrays.stream(data));
    }

    public static final String csv(final Stream<? extends CharSequence> data) {
        requireNonNull(data);
        return implode(data, EMPTY, EMPTY, COMMA, EMPTY, EMPTY);
    }

    public static final String csv(final Iterable<? extends CharSequence> data) {
        requireNonNull(data);
        return csv(StreamSupport.stream(data.spliterator(), false));
    }

    public static final String csv(final CharSequence... data) {
        requireNonNull(data);
        return csv(Arrays.stream(data));
    }

    public static final String LC = "<";

    public static final String RC = ">";

    public static final String COMMA = ", ";

    public static final String EMPTY = "";

}