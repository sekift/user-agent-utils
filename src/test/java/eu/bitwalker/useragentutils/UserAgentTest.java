/**
 * 
 */
package eu.bitwalker.useragentutils;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;

/**
 * @author harald
 *
 */
public class UserAgentTest {

	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#parseUserAgentString(java.lang.String)}.
	 */
	@Test
	public void testParseUserAgentStringQQ() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/5.0 (Linux; U; Android 2.3.5; zh-cn; U8800 Build/HuaweiU8800) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
		//assertEquals(OperatingSystem.WINDOWS_7, userAgent.getOperatingSystem());
		//assertEquals(Browser.TAOBAO2, userAgent.getBrowser());
		System.out.println("浏览器名:" + userAgent.getBrowser().getName());
		System.out.println("浏览器类型:" + userAgent.getBrowser().getBrowserType());
		System.out.println("浏览器家族:" + userAgent.getBrowser().getGroup());
		System.out.println("浏览器生产厂商:" + userAgent.getBrowser().getManufacturer());
		System.out.println("浏览器使用的渲染引擎:" + userAgent.getBrowser().getRenderingEngine());
		System.out.println("浏览器版本:" + userAgent.getBrowserVersion());
		
		System.out.println("xxx");
		System.out.println("操作系统名:" + userAgent.getOperatingSystem().getName());
		System.out.println("操作系统类型:" + userAgent.getOperatingSystem().getDeviceType());
		System.out.println("操作系统家族:" + userAgent.getOperatingSystem().getGroup());
		System.out.println("操作系统生产厂商:" + userAgent.getOperatingSystem().getManufacturer().toString());
	}
	
	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#parseUserAgentString(java.lang.String)}.
	 */
	@Test
	public void testParseUserAgentString() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(OperatingSystem.WINDOWS_XP, userAgent.getOperatingSystem());
		assertEquals(Browser.IE6, userAgent.getBrowser());
	}
	
	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#parseUserAgentString(java.lang.String)} 
	 * that checks for proper handling of a <code>null</code> userAgentString.
	 */
	@Test
	public void testParseUserAgentStringNull() {
		UserAgent userAgent = UserAgent.parseUserAgentString(null);
		assertEquals(OperatingSystem.UNKNOWN, userAgent.getOperatingSystem());
		assertEquals(Browser.UNKNOWN, userAgent.getBrowser());
		assertNull(userAgent.getBrowserVersion());
	}

	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#toString()}.
	 */
	@Test
	public void testToString() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(OperatingSystem.WINDOWS_XP.toString() + "-" + Browser.IE6.toString(), userAgent.toString());
	}

	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#valueOf(int)}.
	 */
	@Test
	public void testValueOf() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		UserAgent retrievedUserAgent = UserAgent.valueOf(userAgent.getId());
		assertEquals(userAgent, retrievedUserAgent);
	}

	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#valueOf(String)}.
	 */
	@Test
	public void testValueOf2() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		UserAgent retrievedUserAgent = UserAgent.valueOf(userAgent.toString());
		assertEquals(userAgent, retrievedUserAgent);
	}
	
}
