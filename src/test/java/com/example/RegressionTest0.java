package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        java.lang.Class<?> wildcardClass4 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        int int8 = order3.getNumberOfItems();
        java.lang.Class<?> wildcardClass9 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.addItems(100);
        order3.removeItems((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.removeItems(10);
        order3.removeItems((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.addItems(100);
        order3.removeItems((int) (byte) -1);
        order3.addItems((int) (short) 1);
        double double13 = order3.applyDiscount((int) 'a');
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.example.Order order3 = new com.example.Order(1, (int) (short) 0, (-0.0d));
        java.lang.Class<?> wildcardClass4 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Order order3 = new com.example.Order((int) (byte) 0, (int) 'a', (double) (short) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.addItems(100);
        order3.removeItems((int) (byte) -1);
        order3.addItems(0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((int) (byte) 10);
        int int8 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.removeItems((int) '4');
        java.lang.Class<?> wildcardClass6 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.Order order3 = new com.example.Order((int) (byte) 100, (int) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.Order order3 = new com.example.Order((int) 'a', (int) (short) 1, (double) (short) 10);
        order3.addItems((int) 'a');
        int int6 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double6 = order3.calculateTotal();
        java.lang.Class<?> wildcardClass7 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.Order order3 = new com.example.Order(1, (int) (short) 0, (-0.0d));
        order3.addItems((-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.Order order3 = new com.example.Order(1, (int) (short) 0, (-0.0d));
        double double5 = order3.applyDiscount((int) ' ');
        order3.addItems(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        int int6 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.removeItems((int) '4');
        double double6 = order3.calculateTotal();
        java.lang.Class<?> wildcardClass7 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0d) + "'", double6 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.Order order3 = new com.example.Order((int) (byte) -1, (int) (short) -1, (double) 10L);
        order3.addItems((int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.Order order3 = new com.example.Order((int) (byte) 1, (int) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.Order order3 = new com.example.Order((int) (short) 1, (int) (short) 0, (double) (short) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.Order order3 = new com.example.Order((int) 'a', (int) (short) 1, (double) (short) 10);
        order3.addItems((int) 'a');
        order3.addItems(1);
        order3.addItems(1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.Order order3 = new com.example.Order((int) '4', (int) (short) 1, (double) 0.0f);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.Order order3 = new com.example.Order((int) (short) 10, (int) (short) 100, (double) 98);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        double double9 = order3.applyDiscount((int) (byte) -1);
        int int10 = order3.getNumberOfItems();
        java.lang.Class<?> wildcardClass11 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.removeItems((int) '4');
        double double6 = order3.calculateTotal();
        order3.addItems(10);
        java.lang.Class<?> wildcardClass9 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0d) + "'", double6 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        double double9 = order3.applyDiscount((int) (byte) -1);
        int int10 = order3.getNumberOfItems();
        order3.removeItems((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.addItems(100);
        double double8 = order3.calculateTotal();
        double double10 = order3.applyDiscount((int) (byte) 1);
        order3.addItems((int) '4');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Order order3 = new com.example.Order(0, (int) ' ', (double) (short) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.Order order3 = new com.example.Order(1, (int) (short) 0, (-0.0d));
        double double5 = order3.applyDiscount((int) ' ');
        int int6 = order3.getNumberOfItems();
        java.lang.Class<?> wildcardClass7 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.removeItems((int) '4');
        double double6 = order3.calculateTotal();
        order3.addItems(10);
        int int9 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.0d) + "'", double6 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.removeItems(10);
        int int8 = order3.getNumberOfItems();
        double double9 = order3.calculateTotal();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Order order3 = new com.example.Order((int) 'a', (int) (short) 1, (double) (short) 10);
        double double4 = order3.calculateTotal();
        java.lang.Class<?> wildcardClass5 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        int int8 = order3.getNumberOfItems();
        order3.addItems((int) '4');
        order3.addItems((int) '#');
        order3.addItems(1);
        double double16 = order3.applyDiscount(0);
        order3.addItems((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.example.Order order3 = new com.example.Order((int) (short) 1, (int) 'a', (double) (-1));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount(100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.Order order3 = new com.example.Order((int) 'a', (int) (short) 1, (double) (short) 10);
        double double4 = order3.calculateTotal();
        order3.removeItems((int) ' ');
        int int7 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.addItems(100);
        order3.removeItems((int) (byte) -1);
        order3.addItems((int) (short) -1);
        double double12 = order3.calculateTotal();
        double double13 = order3.calculateTotal();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        int int8 = order3.getNumberOfItems();
        double double10 = order3.applyDiscount((int) (byte) -1);
        order3.addItems(98);
        int int13 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        order3.removeItems((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.example.Order order3 = new com.example.Order((int) (byte) 100, (int) (byte) -1, 100.0d);
        double double4 = order3.calculateTotal();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.Order order3 = new com.example.Order(1, (int) (short) 0, (-0.0d));
        double double5 = order3.applyDiscount((int) ' ');
        order3.addItems((int) (byte) 1);
        order3.removeItems((-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.Order order3 = new com.example.Order((int) (byte) -1, (int) (short) 1, 1.0d);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        order3.addItems(100);
        order3.removeItems((int) (byte) -1);
        order3.addItems((int) (short) -1);
        double double13 = order3.applyDiscount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.Order order3 = new com.example.Order(1, (int) (short) 0, (-0.0d));
        double double5 = order3.applyDiscount((int) ' ');
        order3.addItems((int) (byte) 1);
        double double9 = order3.applyDiscount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        order3.removeItems((int) (short) 10);
        double double10 = order3.calculateTotal();
        double double12 = order3.applyDiscount((int) (short) 10);
        order3.removeItems((int) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.example.Order order3 = new com.example.Order(9, (int) (short) -1, (double) 100.0f);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.Order order3 = new com.example.Order((int) (byte) -1, (int) (short) -1, (double) 10L);
        order3.removeItems(98);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) '4');
        double double7 = order3.applyDiscount((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.example.Order order3 = new com.example.Order((int) 'a', (int) (short) 1, (double) (short) 10);
        double double4 = order3.calculateTotal();
        double double6 = order3.applyDiscount(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        order3.removeItems((int) (short) 10);
        double double10 = order3.calculateTotal();
        int int11 = order3.getNumberOfItems();
        java.lang.Class<?> wildcardClass12 = order3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        double double9 = order3.applyDiscount((int) (byte) -1);
        int int10 = order3.getNumberOfItems();
        order3.removeItems(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        order3.removeItems((int) (short) 10);
        double double10 = order3.calculateTotal();
        int int11 = order3.getNumberOfItems();
        double double12 = order3.calculateTotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.example.Order order3 = new com.example.Order(9, 9, 0.0d);
        int int4 = order3.getNumberOfItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.example.Order order3 = new com.example.Order((int) '#', (-1), 0.0d);
        order3.addItems((int) (short) 1);
        double double7 = order3.applyDiscount((-1));
        order3.removeItems((int) (short) 10);
        double double10 = order3.calculateTotal();
        double double11 = order3.calculateTotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.0d) + "'", double7 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.example.Order order3 = new com.example.Order((int) 'a', (int) (short) 1, (double) (short) 10);
        order3.addItems(0);
    }
}

