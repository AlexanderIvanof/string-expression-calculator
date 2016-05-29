package com.projects.ti.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link JavaScriptExpressionCalculator}
 *
 * @author Oleksandr Ivanov
 */
public class JavaScriptExpressionCalculatorTest {

    ExpressionCalculator testedObject = new JavaScriptExpressionCalculator();

    @Test
    public void testCalculatorMethod() {
        Assert.assertTrue(testedObject.calculate("2.1+2*4") == 10.1);
    }
}
