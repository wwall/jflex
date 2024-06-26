// test: generics2

/*
 * Copyright 2020, Google, LLC.
 * SPDX-License-Identifier: BSD-3-Clause
 */

package de.jflex.testcase.generics;

import com.google.common.collect.ImmutableMap;
import de.jflex.testing.testsuite.golden.AbstractGoldenTest;
import de.jflex.util.scanner.ScannerFactory;
import org.junit.Test;

/**
 * Test for feature request <a href="https://github.com/jflex-de/jflex/issues/75">#75 Support
 * generics for %type and %extends Tests %class</a>.
 *
 * <p>Tests %type, %ctorarg
 *
 * <p>Note: This test was generated from {@code jflex-testsuite-maven-plugin} test cases. The test
 * relies on golden files for testing, expecting the scanner to output logs on the {@code
 * System.out}. Please migrate to proper unit tests, as describe in <a
 * href="https://github.com/jflex-de/jflex/tree/master/javatests/de/jflex/testcase">
 * //javatest/jflex/testcase</a>.
 */
// TODO Migrate this test to proper unit tests.
public class Generics2GoldenTest extends AbstractGoldenTest {

  /** Creates a scanner conforming to the {@code generics2.flex} specification. */
  private final ScannerFactory<Generics2> scannerFactory =
      ScannerFactory.of(reader -> new Generics2(reader, ImmutableMap.of()));

  /** Tests that the scanner was successfully generated and can be instantiated. */
  @Test
  public void canInstantiateScanner() throws Exception {
    scannerFactory.createScannerWithContent("");
  }
}
