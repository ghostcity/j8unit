package org.j8unit;

import java.util.function.Supplier;
import org.junit.internal.ArrayComparisonFailure;

public class Assert
extends org.junit.Assert {

    protected Assert() {
    }

    static public void assertTrue(final Supplier<String> message, final boolean condition) {
        assertTrue(message == null ? null : message.get(), condition);
    }

    static public void assertFalse(final Supplier<String> message, final boolean condition) {
        assertFalse(message == null ? null : message.get(), condition);
    }

    static public void fail(final Supplier<String> message) {
        fail(message == null ? null : message.get());
    }

    static public void assertEquals(final Supplier<String> message, final Object expected, final Object actual) {
        assertEquals(message == null ? null : message.get(), expected, actual);
    }

    static public void assertNotEquals(final Supplier<String> message, final Object unexpected, final Object actual) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual);
    }

    static public void assertNotEquals(final Supplier<String> message, final long unexpected, final long actual) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual);
    }

    static public void assertNotEquals(final Supplier<String> message, final double unexpected, final double actual, final double delta) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual, delta);
    }

    public static void assertArrayEquals(final Supplier<String> message, final Object[] expecteds, final Object[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final boolean[] expecteds, final boolean[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final byte[] expecteds, final byte[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final char[] expecteds, final char[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final short[] expecteds, final short[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final int[] expecteds, final int[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final long[] expecteds, final long[] actuals)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals);
    }

    public static void assertArrayEquals(final Supplier<String> message, final double[] expecteds, final double[] actuals, final double delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals, delta);
    }

    public static void assertArrayEquals(final Supplier<String> message, final float[] expecteds, final float[] actuals, final float delta)
    throws ArrayComparisonFailure {
        assertArrayEquals(message == null ? null : message.get(), expecteds, actuals, delta);
    }

    static public void assertEquals(final Supplier<String> message, final double expected, final double actual, final double delta) {
        assertEquals(message == null ? null : message.get(), expected, actual, delta);
    }

    static public void assertEquals(final Supplier<String> message, final float expected, final float actual, final float delta) {
        assertEquals(message == null ? null : message.get(), expected, actual, delta);
    }

    static public void assertNotEquals(final Supplier<String> message, final float unexpected, final float actual, final float delta) {
        assertNotEquals(message == null ? null : message.get(), unexpected, actual, delta);
    }

    static public void assertEquals(final Supplier<String> message, final long expected, final long actual) {
        assertEquals(message == null ? null : message.get(), expected, actual);
    }

    @Deprecated
    static public void assertEquals(final Supplier<String> message, final double expected, final double actual) {
        assertEquals(message == null ? null : message.get(), expected, actual);
    }

    static public void assertNotNull(final Supplier<String> message, final Object object) {
        assertNotNull(message == null ? null : message.get(), object);
    }

    static public void assertNull(final Supplier<String> message, final Object object) {
        assertNull(message == null ? null : message.get(), object);
    }

    static public void assertSame(final Supplier<String> message, final Object expected, final Object actual) {
        assertSame(message == null ? null : message.get(), expected, actual);
    }

    static public void assertNotSame(final Supplier<String> message, final Object unexpected, final Object actual) {
        assertNotSame(message == null ? null : message.get(), unexpected, actual);
    }

    @Deprecated
    public static void assertEquals(final Supplier<String> message, final Object[] expecteds, final Object[] actuals) {
        assertEquals(message == null ? null : message.get(), expecteds, actuals);
    }

}