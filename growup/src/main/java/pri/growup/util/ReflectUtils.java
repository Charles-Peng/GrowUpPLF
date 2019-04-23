/**
 * All Rights Reserved by Fengsheng Technology.
 * 
 * Created date : 2016-3-3
 */
package pri.growup.util;

import pri.growup.constants.GrowUpConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * The Class ReflectUtil provides get/set field value to an object using reflecting. Only do the set/get operation
 * when the class has a public set/get method.
 *
 * @author vincent 2016-3-3
 */
public class ReflectUtils
{

	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(ReflectUtils.class);

	/**
	 * Set field value.
	 *
	 * @param target            the target
	 * @param fieldName            the field name
	 * @param fieldValue            the field value
	 */
	public static void setFieldValue(final Object target, final String fieldName, final Object fieldValue)
	{
		if (target == null || StringUtils.isEmpty(fieldName) || fieldValue == null)
		{
			return;
		}

		final Class<?> clazz = target.getClass();
		try
		{
			final String methodname = GrowUpConstants.SET + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
			final Method method = clazz.getDeclaredMethod(methodname);

			// Only set the object value when the setting method is accessible.
			if (Modifier.isPublic(method.getModifiers()))
			{
				method.invoke(target, fieldValue);
			}
		}
		catch (final Exception me)
		{
			try
			{
				final Field field = clazz.getDeclaredField(fieldName);
				if (!Modifier.isPublic(field.getModifiers()))
				{
					field.setAccessible(true);
				}
				field.set(target, fieldValue);
			}
			catch (final Exception fe)
			{
				if (logger.isDebugEnabled())
				{
					logger.debug(fe);
				}
			}
		}
	}

	/**
	 * Gets the field value.
	 *
	 * @param <T>
	 *            the generic type
	 * @param target
	 *            the target
	 * @param fieldName
	 *            the field name
	 * @return the field value
	 */
	public static <T> Object getFieldValue(final Object target, final String fieldName)
	{
		if (target == null || StringUtils.isEmpty(fieldName))
		{
			return null;
		}

		Class<?> clazz = target.getClass();
		try
		{
			final String methodname = GrowUpConstants.GET + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
			final Method method = clazz.getDeclaredMethod(methodname);

			// Only return the object value when the setting method is accessible.
			if (!Modifier.isPublic(method.getModifiers()))
			{
				method.setAccessible(true);
			}
			return method.invoke(target);
		}
		catch (final Exception me)
		{
			try
			{
				Field field = null;

				for ( ; clazz != Object.class; clazz = clazz.getSuperclass())
				{
					try
					{
						field = clazz.getDeclaredField(fieldName);
					}
					catch (final Exception e)
					{

					}
				}

				if (!Modifier.isPublic(field.getModifiers()))
				{
					field.setAccessible(true);
				}
				return field.get(target);
			}
			catch (final Exception fe)
			{
				if (logger.isDebugEnabled())
				{
					logger.debug(fe);
				}
			}
		}

		return null;
	}
}
