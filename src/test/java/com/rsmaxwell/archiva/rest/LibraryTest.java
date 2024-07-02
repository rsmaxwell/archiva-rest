
package com.rsmaxwell.archiva.rest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Adapter classUnderTest = new Adapter();
        assertTrue(classUnderTest.returnTrue(), "someLibraryMethod should return 'true'");
    }
}
