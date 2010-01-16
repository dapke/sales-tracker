package com.jameselsey.salestracker.util;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.PropertyUtils;

public class SalesPropertyUtils
{

    public static void copyProperties(Object object1, Object object2)
    {
        try
        {
            PropertyUtils.copyProperties(object1, object2);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(SalesPropertyUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex)
        {
            Logger.getLogger(SalesPropertyUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex)
        {
            Logger.getLogger(SalesPropertyUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
