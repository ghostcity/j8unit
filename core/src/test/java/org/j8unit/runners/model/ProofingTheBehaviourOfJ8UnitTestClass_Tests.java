package org.j8unit.runners.model;

import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.model.AbstractClassWithADirectlyInheritedDefaultAndAbstractTestMethod;
import org.junit.runners.model.ClassWithADirectlyInheritedDefaultTestMethod;
import org.junit.runners.model.ClassWithATwiceInheritedDefaultTestMethod;
import org.junit.runners.model.ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation;
import org.junit.runners.model.InterfaceWithADefaultAndAnAbstractTestMethod;
import org.junit.runners.model.InterfaceWithADefaultTestMethod;
import org.junit.runners.model.InterfaceWithADirectlyInheritedDefaultTestMethod;
import org.junit.runners.model.InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation;
import org.junit.runners.model.ProofingTheBehaviourOfJUnit4TestClass_Tests;
import org.junit.runners.model.TestClass;

public class ProofingTheBehaviourOfJ8UnitTestClass_Tests
extends ProofingTheBehaviourOfJUnit4TestClass_Tests {

    @Override
    protected TestClass getTestClass(final Class<?> clazz) {
        return new J8TestClass(clazz);
    }

    @Override
    protected Class<?> getTestClassClass() {
        return J8TestClass.class;
    }

    @BeforeClass
    public static void legend() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("| Behaviour of the J8Unit Test Class Model            |");
        System.out.println("| Legend:                                             |");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("| [✓] Intended Behaviour                              |");
        System.out.println("| [✗] Missing Behaviour                               |");
        System.out.println("| [!] Additional Behaviour (in comparision to JUnit4) |");
        System.out.println("|                                                     |");
        System.out.println("| black ... can detect                                |");
        System.out.println("| red ..... cannot detect                             |");
        System.out.println("+-----------------------------------------------------+");
    }

    @Override
    @Test
    public void proofDetectionFor_InterfaceWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        try {
            super.proofDetectionFor_InterfaceWithDirectlyInheritedDefaultTestMethod();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = InterfaceWithADirectlyInheritedDefaultTestMethod.class;
        final Class<?> declarer = InterfaceWithADefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "!", this.getTestClassClass(), "an interface inheriting a default @Test method", container.getSimpleName(),
                          declarer.getSimpleName());
    }

    @Override
    @Test
    public void proofDetectionFor_ClassWithDirectlyInheritedDefaultTestMethod()
    throws Exception {
        try {
            super.proofDetectionFor_ClassWithDirectlyInheritedDefaultTestMethod();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = ClassWithADirectlyInheritedDefaultTestMethod.class;
        final Class<?> declarer = InterfaceWithADefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "!", this.getTestClassClass(), "a class inheriting a default @Test method", container.getSimpleName(),
                          declarer.getSimpleName());
    }

    @Override
    @Test
    public void proofDetectionFor_AbstractClassWithDirectlyInheritedDefaultAndAbstractTestMethod()
    throws Exception {
        final Class<?> container = AbstractClassWithADirectlyInheritedDefaultAndAbstractTestMethod.class;
        final Class<?> declarer = InterfaceWithADefaultAndAnAbstractTestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "!", this.getTestClassClass(), "an abstract class inheriting a default and an abstract @Test method",
                          container.getSimpleName(), declarer.getSimpleName());
    }

    @Override
    @Test
    public void proofDetectionFor_InterfaceWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        try {
            super.proofDetectionFor_InterfaceWithOverriddenDefaultTestMethodWithoutAnnotation();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = InterfaceWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        final Class<?> declarer = InterfaceWithADefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "!", this.getTestClassClass(), "an interface overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName(), declarer.getSimpleName());
    }

    @Override
    @Test
    public void proofDetectionFor_ClassWithOverriddenDefaultTestMethodWithoutAnnotation()
    throws Exception {
        try {
            super.proofDetectionFor_ClassWithOverriddenDefaultTestMethodWithoutAnnotation();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = ClassWithAnOverriddenDefaultTestMethodWithoutAnnotation.class;
        final Class<?> declarer = InterfaceWithADefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "!", this.getTestClassClass(), "a class overriding a default @Test method, without (!) @Test annotation",
                          container.getSimpleName(), declarer.getSimpleName());
    }

    @Override
    @Test
    public void proofDetectionFor_ClassWithTwiceInheritedDefaultTestMethod()
    throws Exception {
        try {
            super.proofDetectionFor_ClassWithTwiceInheritedDefaultTestMethod();
            fail("Super Test Was Expected To Fail!");
        } catch (final AssertionError expected) {}

        final Class<?> container = ClassWithATwiceInheritedDefaultTestMethod.class;
        final Class<?> declarer = InterfaceWithADefaultTestMethod.class;
        this.proofDetectionWithASingleFinding(container, declarer);
        System.out.format(FINDING2, "!", this.getTestClassClass(), "a class inheriting a default @Test method twice (via super-class and interface)",
                          container.getSimpleName(), declarer.getSimpleName());
    }

}
