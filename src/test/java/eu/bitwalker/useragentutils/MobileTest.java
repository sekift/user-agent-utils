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
public class MobileTest {

	/**
	 * Test method for {@link eu.bitwalker.useragentutils.UserAgent#parseUserAgentString(java.lang.String)}.
	 */
	@Test
	public void testParseMobileString() {
		UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/5.0 (Linux; U; Android 5.1.1; zh-cn; SM-G6000 Build/LMY47X) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 UCBrowser/1.0.0.100 U3/0.8.0 Mobile Safari/534.30 AliApp(TB/6.2.3) WindVane/8.0.0 720X1280 GCanvas/1.4.2.21");
		//assertEquals(OperatingSystem.WINDOWS_7, userAgent.getOperatingSystem());
		//assertEquals(Browser.TAOBAO2, userAgent.getBrowser());
		System.out.println("浏览器名:" + userAgent.getBrowser().getName());
		System.out.println("浏览器类型:" + userAgent.getBrowser().getBrowserType());
		System.out.println("浏览器家族:" + userAgent.getBrowser().getGroup());
		System.out.println("浏览器生产厂商:" + userAgent.getBrowser().getManufacturer());
		System.out.println("浏览器使用的渲染引擎:" + userAgent.getBrowser().getRenderingEngine());
		System.out.println("浏览器版本:" + userAgent.getBrowserVersion());
		System.out.println("操作系统名:" + userAgent.getOperatingSystem().getName());
		System.out.println("操作系统类型:" + userAgent.getOperatingSystem().getDeviceType());
		System.out.println("操作系统家族:" + userAgent.getOperatingSystem().getGroup());
		System.out.println("操作系统生产厂商:" + userAgent.getOperatingSystem().getManufacturer().toString());
		System.out.println("手机型号:" + userAgent.getMobile().getName());
		System.out.println("手机屏幕尺寸:" + userAgent.getMobile().getScreenSize().getName());
		System.out.println("手机屏幕分辨率:" + userAgent.getMobile().getResolution().getName());
		System.out.println("手机识别码:" + userAgent.getMobile().getMobileId());
		System.out.println("手机固件版本:" + userAgent.getMobile().getMobileVersion());
		System.out.println("手机生产厂商:" + userAgent.getMobile().getMobileBrand().getName());
		System.out.println("手机家族:" + userAgent.getMobile().getGroup());

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
