package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.GroupLayout class javax.swing.GroupLayout}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.GroupLayoutTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.GroupLayoutClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.GroupLayout
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GroupLayoutTests<SUT extends javax.swing.GroupLayout>
extends org.j8unit.repository.java.awt.LayoutManager2Tests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.GroupLayout.Alignment class
     * javax.swing.GroupLayout$Alignment}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.GroupLayoutTests.AlignmentTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.GroupLayoutClassTests.AlignmentClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.GroupLayout.Alignment
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AlignmentTests<SUT extends javax.swing.GroupLayout.Alignment>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.GroupLayout.Alignment> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.GroupLayout.Group class javax.swing.GroupLayout$Group}
     * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
     * counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.GroupLayoutTests.GroupTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.GroupLayoutClassTests.GroupClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.GroupLayout.Group
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface GroupTests<SUT extends javax.swing.GroupLayout.Group>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.Group#addComponent(java.awt.Component) public
         * javax.swing.GroupLayout$Group javax.swing.GroupLayout$Group.addComponent(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.Group#addComponent(java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.Group#addComponent(java.awt.Component, int, int, int) public
         * javax.swing.GroupLayout$Group javax.swing.GroupLayout$Group.addComponent(java.awt.Component,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.Group#addComponent(java.awt.Component, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addComponent_Component_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.Group#addGap(int) public javax.swing.GroupLayout$Group
         * javax.swing.GroupLayout$Group.addGap(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.Group#addGap(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addGap_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.Group#addGap(int, int, int) public
         * javax.swing.GroupLayout$Group javax.swing.GroupLayout$Group.addGap(int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.Group#addGap(int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addGap_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.Group#addGroup(javax.swing.GroupLayout.Group) public
         * javax.swing.GroupLayout$Group javax.swing.GroupLayout$Group.addGroup(javax.swing.GroupLayout$Group)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.Group#addGroup(javax.swing.GroupLayout.Group)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addGroup_Group()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.GroupLayout.ParallelGroup class
     * javax.swing.GroupLayout$ParallelGroup}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.javax.swing.GroupLayoutTests.ParallelGroupTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.GroupLayoutClassTests.ParallelGroupClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.GroupLayout.ParallelGroup
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ParallelGroupTests<SUT extends javax.swing.GroupLayout.ParallelGroup>
    extends org.j8unit.repository.javax.swing.GroupLayoutTests.GroupTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component) public
         * javax.swing.GroupLayout$ParallelGroup javax.swing.GroupLayout$ParallelGroup.addComponent(java.awt.Component)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component, javax.swing.GroupLayout.Alignment)
         * public javax.swing.GroupLayout$ParallelGroup
         * javax.swing.GroupLayout$ParallelGroup.addComponent(java.awt.Component,javax.swing.GroupLayout$Alignment)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component,
         *             javax.swing.GroupLayout.Alignment)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addComponent_Component_Alignment()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component, javax.swing.GroupLayout.Alignment, int, int, int)
         * public javax.swing.GroupLayout$ParallelGroup
         * javax.swing.GroupLayout$ParallelGroup.addComponent(java.awt.Component,javax.swing.GroupLayout$Alignment,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component,
         *             javax.swing.GroupLayout.Alignment, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addComponent_Component_Alignment_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component, int, int, int)
         * public javax.swing.GroupLayout$ParallelGroup
         * javax.swing.GroupLayout$ParallelGroup.addComponent(java.awt.Component,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addComponent(java.awt.Component, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addComponent_Component_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.ParallelGroup#addGap(int) public
         * javax.swing.GroupLayout$ParallelGroup javax.swing.GroupLayout$ParallelGroup.addGap(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addGap(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addGap_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.ParallelGroup#addGap(int, int, int) public
         * javax.swing.GroupLayout$ParallelGroup javax.swing.GroupLayout$ParallelGroup.addGap(int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addGap(int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addGap_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.ParallelGroup#addGroup(javax.swing.GroupLayout.Alignment, javax.swing.GroupLayout.Group)
         * public javax.swing.GroupLayout$ParallelGroup
         * javax.swing.GroupLayout$ParallelGroup.addGroup(javax.swing.GroupLayout$Alignment,javax.swing.GroupLayout$Group)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addGroup(javax.swing.GroupLayout.Alignment,
         *             javax.swing.GroupLayout.Group)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addGroup_Alignment_Group()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.ParallelGroup#addGroup(javax.swing.GroupLayout.Group) public
         * javax.swing.GroupLayout$ParallelGroup
         * javax.swing.GroupLayout$ParallelGroup.addGroup(javax.swing.GroupLayout$Group)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.ParallelGroup#addGroup(javax.swing.GroupLayout.Group)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addGroup_Group()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.GroupLayout.SequentialGroup class
     * javax.swing.GroupLayout$SequentialGroup}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.GroupLayoutTests.SequentialGroupTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.GroupLayoutClassTests.SequentialGroupClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.GroupLayout.SequentialGroup
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SequentialGroupTests<SUT extends javax.swing.GroupLayout.SequentialGroup>
    extends org.j8unit.repository.javax.swing.GroupLayoutTests.GroupTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addComponent(boolean, java.awt.Component)
         * public javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addComponent(boolean,java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addComponent(boolean, java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addComponent_boolean_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addComponent(boolean, java.awt.Component, int, int, int)
         * public javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addComponent(boolean,java.awt.Component,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addComponent(boolean, java.awt.Component, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addComponent_boolean_Component_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addComponent(java.awt.Component) public
         * javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addComponent(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addComponent(java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addComponent(java.awt.Component, int, int, int) public
         * javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addComponent(java.awt.Component,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addComponent(java.awt.Component, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addComponent_Component_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addContainerGap() public
         * javax.swing.GroupLayout$SequentialGroup javax.swing.GroupLayout$SequentialGroup.addContainerGap()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addContainerGap()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addContainerGap()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addContainerGap(int, int) public
         * javax.swing.GroupLayout$SequentialGroup javax.swing.GroupLayout$SequentialGroup.addContainerGap(int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addContainerGap(int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addContainerGap_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addGap(int) public
         * javax.swing.GroupLayout$SequentialGroup javax.swing.GroupLayout$SequentialGroup.addGap(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addGap(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addGap_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addGap(int, int, int) public
         * javax.swing.GroupLayout$SequentialGroup javax.swing.GroupLayout$SequentialGroup.addGap(int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addGap(int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addGap_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addGroup(boolean, javax.swing.GroupLayout.Group) public
         * javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addGroup(boolean,javax.swing.GroupLayout$Group)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addGroup(boolean, javax.swing.GroupLayout.Group)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addGroup_boolean_Group()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.GroupLayout.SequentialGroup#addGroup(javax.swing.GroupLayout.Group) public
         * javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addGroup(javax.swing.GroupLayout$Group)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addGroup(javax.swing.GroupLayout.Group)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addGroup_Group()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement)
         * public javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addPreferredGap(javax.swing.LayoutStyle$ComponentPlacement)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.LayoutStyle.
         *             ComponentPlacement)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addPreferredGap_ComponentPlacement()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement, int, int)
         * public javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addPreferredGap(javax.swing.LayoutStyle$ComponentPlacement,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.LayoutStyle.
         *             ComponentPlacement, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addPreferredGap_ComponentPlacement_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.JComponent, javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement)
         * public javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle$ComponentPlacement)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.JComponent,
         *             javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addPreferredGap_JComponent_JComponent_ComponentPlacement()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.JComponent, javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement, int, int)
         * public javax.swing.GroupLayout$SequentialGroup
         * javax.swing.GroupLayout$SequentialGroup.addPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle$ComponentPlacement,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.GroupLayout.SequentialGroup#addPreferredGap(javax.swing.JComponent,
         *             javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_addPreferredGap_JComponent_JComponent_ComponentPlacement_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#addLayoutComponent(java.awt.Component, java.lang.Object) public
     * void javax.swing.GroupLayout.addLayoutComponent(java.awt.Component,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#addLayoutComponent(java.awt.Component, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addLayoutComponent_Component_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#addLayoutComponent(java.lang.String, java.awt.Component) public
     * void javax.swing.GroupLayout.addLayoutComponent(java.lang.String,java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#addLayoutComponent(java.lang.String, java.awt.Component)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addLayoutComponent_String_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#createBaselineGroup(boolean, boolean) public
     * javax.swing.GroupLayout$ParallelGroup javax.swing.GroupLayout.createBaselineGroup(boolean,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#createBaselineGroup(boolean, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createBaselineGroup_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#createParallelGroup() public javax.swing.GroupLayout$ParallelGroup
     * javax.swing.GroupLayout.createParallelGroup()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#createParallelGroup()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createParallelGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#createParallelGroup(javax.swing.GroupLayout.Alignment) public
     * javax.swing.GroupLayout$ParallelGroup
     * javax.swing.GroupLayout.createParallelGroup(javax.swing.GroupLayout$Alignment)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#createParallelGroup(javax.swing.GroupLayout.Alignment)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createParallelGroup_Alignment()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#createParallelGroup(javax.swing.GroupLayout.Alignment, boolean)
     * public javax.swing.GroupLayout$ParallelGroup
     * javax.swing.GroupLayout.createParallelGroup(javax.swing.GroupLayout$Alignment,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#createParallelGroup(javax.swing.GroupLayout.Alignment, boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createParallelGroup_Alignment_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#createSequentialGroup() public
     * javax.swing.GroupLayout$SequentialGroup javax.swing.GroupLayout.createSequentialGroup()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#createSequentialGroup()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSequentialGroup()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#getAutoCreateContainerGaps() public boolean
     * javax.swing.GroupLayout.getAutoCreateContainerGaps()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#getAutoCreateContainerGaps()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoCreateContainerGaps()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#getAutoCreateGaps() public boolean
     * javax.swing.GroupLayout.getAutoCreateGaps()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#getAutoCreateGaps()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoCreateGaps()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#getHonorsVisibility() public boolean
     * javax.swing.GroupLayout.getHonorsVisibility()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#getHonorsVisibility()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getHonorsVisibility()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#getLayoutAlignmentX(java.awt.Container) public float
     * javax.swing.GroupLayout.getLayoutAlignmentX(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#getLayoutAlignmentX(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLayoutAlignmentX_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#getLayoutAlignmentY(java.awt.Container) public float
     * javax.swing.GroupLayout.getLayoutAlignmentY(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#getLayoutAlignmentY(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getLayoutAlignmentY_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#getLayoutStyle() public javax.swing.LayoutStyle
     * javax.swing.GroupLayout.getLayoutStyle()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#getLayoutStyle()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLayoutStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#invalidateLayout(java.awt.Container) public void
     * javax.swing.GroupLayout.invalidateLayout(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#invalidateLayout(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_invalidateLayout_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#layoutContainer(java.awt.Container) public void
     * javax.swing.GroupLayout.layoutContainer(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#layoutContainer(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_layoutContainer_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#linkSize(java.awt.Component...) public void
     * javax.swing.GroupLayout.linkSize(java.awt.Component...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#linkSize(java.awt.Component...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_linkSize_ComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#linkSize(int, java.awt.Component...) public void
     * javax.swing.GroupLayout.linkSize(int,java.awt.Component...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#linkSize(int, java.awt.Component...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_linkSize_int_ComponentArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#maximumLayoutSize(java.awt.Container) public java.awt.Dimension
     * javax.swing.GroupLayout.maximumLayoutSize(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#maximumLayoutSize(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_maximumLayoutSize_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#minimumLayoutSize(java.awt.Container) public java.awt.Dimension
     * javax.swing.GroupLayout.minimumLayoutSize(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#minimumLayoutSize(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_minimumLayoutSize_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#preferredLayoutSize(java.awt.Container) public java.awt.Dimension
     * javax.swing.GroupLayout.preferredLayoutSize(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#preferredLayoutSize(java.awt.Container)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_preferredLayoutSize_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#removeLayoutComponent(java.awt.Component) public void
     * javax.swing.GroupLayout.removeLayoutComponent(java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#removeLayoutComponent(java.awt.Component)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeLayoutComponent_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#replace(java.awt.Component, java.awt.Component) public void
     * javax.swing.GroupLayout.replace(java.awt.Component,java.awt.Component)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#replace(java.awt.Component, java.awt.Component)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_replace_Component_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setAutoCreateContainerGaps(boolean) public void
     * javax.swing.GroupLayout.setAutoCreateContainerGaps(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setAutoCreateContainerGaps(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoCreateContainerGaps_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setAutoCreateGaps(boolean) public void
     * javax.swing.GroupLayout.setAutoCreateGaps(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setAutoCreateGaps(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoCreateGaps_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setHonorsVisibility(boolean) public void
     * javax.swing.GroupLayout.setHonorsVisibility(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setHonorsVisibility(boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setHonorsVisibility_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setHonorsVisibility(java.awt.Component, java.lang.Boolean) public
     * void javax.swing.GroupLayout.setHonorsVisibility(java.awt.Component,java.lang.Boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setHonorsVisibility(java.awt.Component, java.lang.Boolean)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setHonorsVisibility_Component_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setHorizontalGroup(javax.swing.GroupLayout.Group) public void
     * javax.swing.GroupLayout.setHorizontalGroup(javax.swing.GroupLayout$Group)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setHorizontalGroup(javax.swing.GroupLayout.Group)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setHorizontalGroup_Group()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setLayoutStyle(javax.swing.LayoutStyle) public void
     * javax.swing.GroupLayout.setLayoutStyle(javax.swing.LayoutStyle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setLayoutStyle(javax.swing.LayoutStyle)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLayoutStyle_LayoutStyle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#setVerticalGroup(javax.swing.GroupLayout.Group) public void
     * javax.swing.GroupLayout.setVerticalGroup(javax.swing.GroupLayout$Group)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#setVerticalGroup(javax.swing.GroupLayout.Group)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setVerticalGroup_Group()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.GroupLayout#toString() public java.lang.String
     * javax.swing.GroupLayout.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.GroupLayout#toString()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
