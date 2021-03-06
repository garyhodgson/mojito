package com.box.l10n.mojito.service.tm.search;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaurambault
 */
public class NativeContainsExpTest {

    @Test
    public void testEscapeAndWrapValue() {

        String value = "% __ %";

        NativeContainsExp nativeContainsExp = new NativeContainsExp("fortest", value);

        String expResult = "%\\% \\_\\_ \\%%";
        System.out.println(expResult);

        String result = nativeContainsExp.escapeAndWrapValue(value);

        assertEquals(expResult, result);

    }

}
