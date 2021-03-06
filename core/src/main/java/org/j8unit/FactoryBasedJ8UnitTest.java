package org.j8unit;

import java.util.concurrent.Callable;
import org.junit.AssumptionViolatedException;

/**
 * <p>
 * In case a subject-under-test (SUT) based J8Unit test uses a SUT factory to produce fresh SUT instances, this
 * interface should be used in preference to {@link J8UnitTest}. In detail, this {@code interface} provides
 * {@linkplain #getSUTFactory() a factory query method} that is used by the {@code default} implementation of
 * {@link #createNewSUT()}.
 * </p>
 *
 * @param <SUT>
 *            the type of the subject-under-test
 * @since 4.12
 */
@FunctionalInterface
public abstract interface FactoryBasedJ8UnitTest<SUT>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Returns a factory to be used when {@linkplain #createNewSUT() creating new subject-under-test instances} (each of
     * type {@code SUT}).
     * </p>
     *
     * @apiNote This method returns a {@link Callable} by intention.
     *
     *          The reason why is: A {@code Callable} is {@linkplain Callable "A task that returns a result [&hellip;]"}
     *          while a {@code Supplier} is {@linkplain java.util.function.Supplier "[&hellip;] a supplier of results
     *          [&hellip;]"}. By this, a {@code Callable} represents a yet-uncomputed value while a {@code Supplier}
     *          represents a yet-unknown value. (That's why a {@link Callable#call()} may throw an {@link Exception} and
     *          {@link java.util.function.Supplier#get()} does not.)
     *
     * @return a SUT factory
     */
    public abstract Callable<SUT> getSUTFactory();

    /**
     * <p>
     * Factory method to create a new subject-under-test (of type {@code SUT}).
     *
     * Due to the {@linkplain #getSUTFactory() SUT factory based} nature of this J8Unit test, this method has been
     * (effectively) implemented with the following {@code default} behaviour:
     * </p>
     *
     * <pre class="brush:java">
     * try {
     *     return this.getSUTFactory().call();
     * } catch (final AssumptionViolatedException violation) {
     *     throw violation;
     * } catch (final Exception any) {
     *     throw new AssertionError("Failed to create new subject-under-test instance!", any);
     * }
     * </pre>
     */
    @Override
    public default SUT createNewSUT()
    throws AssertionError {
        try {
            final Callable<SUT> factory = this.getSUTFactory();
            assert factory != null;
            final SUT sut = factory.call();
            assert sut != null;
            return sut;
        } catch (final AssumptionViolatedException violation) {
            throw violation;
        } catch (final Exception any) {
            throw new AssertionError("Failed to create new subject-under-test instance!", any);
        }
    }

}
