package org.wecancodeit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinearInTest {
    @Test
    void test0_0() {
        assertTrue(new LinearIn().linearIn(
                new int[]{},
                new int[]{}));
    }

    void test0_1() {
        assertFalse(new LinearIn().linearIn(
                new int[]{},
                new int[]{1}));
    }

    void test1_0() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1},
                new int[]{}));
    }

    void test0_12() {
        assertFalse(new LinearIn().linearIn(
                new int[]{},
                new int[]{1, 2}));
    }

    void test0_123() {
        assertFalse(new LinearIn().linearIn(
                new int[]{},
                new int[]{1, 2, 3}));
    }

    void test1_1() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1},
                new int[]{1}));
    }

    void test12_12() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1, 2},
                new int[]{1, 2}));
    }

    void test122_12() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1, 2, 2},
                new int[]{1, 2}));
    }

    void test12_122() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1, 2},
                new int[]{1, 2, 2}));
    }

    void test122_122() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1, 2, 2},
                new int[]{1, 2, 2}));
    }


    void test12_13() {
        assertFalse(new LinearIn().linearIn(
                new int[]{1, 2},
                new int[]{1, 3}));
    }

    void test012_13() {
        assertFalse(new LinearIn().linearIn(
                new int[]{0, 1, 2},
                new int[]{1, 3}));
    }

    void test13_012() {
        assertFalse(new LinearIn().linearIn(
                new int[]{1, 3},
                new int[]{0, 1, 2}));
    }

    void test129_13() {
        assertFalse(new LinearIn().linearIn(
                new int[]{1, 2, 9},
                new int[]{1, 3}));
    }

    void test13_019() {
        assertFalse(new LinearIn().linearIn(
                new int[]{1, 3},
                new int[]{0, 1, 9}));
    }

    void test0123456789_1357() {
        assertTrue(new LinearIn().linearIn(
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                new int[]{1, 3, 5, 7}
        ));
    }

    void test0123456789_13579() {
        assertTrue(new LinearIn().linearIn(
                new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                new int[]{1, 3, 5, 7, 9}
        ));
    }

    void test123456789_13579() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                new int[]{1, 3, 5, 7, 9}));
    }

    void test123456789_1357() {
        assertTrue(new LinearIn().linearIn(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                new int[]{1, 3, 5, 7}));
    }
}