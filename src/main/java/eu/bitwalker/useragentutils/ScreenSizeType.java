/*
* Copyright (c) 2008-2018, Harald Walker (bitwalker.eu) and contributing developers  
* All rights reserved.
* 
* Redistribution and use in source and binary forms, with or
* without modification, are permitted provided that the
* following conditions are met:
* 
* * Redistributions of source code must retain the above
* copyright notice, this list of conditions and the following
* disclaimer.
* 
* * Redistributions in binary form must reproduce the above
* copyright notice, this list of conditions and the following
* disclaimer in the documentation and/or other materials
* provided with the distribution.
* 
* * Neither the name of bitwalker nor the names of its
* contributors may be used to endorse or promote products
* derived from this software without specific prior written
* permission.
* 
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
* CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
* INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
* MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
* NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
* LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
* HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
* CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
* OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package eu.bitwalker.useragentutils;

/**
 * 屏幕尺寸，主屏大小，单位为英寸
 * @author sekift
 *
 */
public enum ScreenSizeType {
	SCR2_2("2.2"),
	SCR3_0("3.0"),
	SCR3_1("3.1"),
	SCR3_2("3.2"),
	SCR3_7("3.7"),
	SCR3_8("3.8"),
	SCR3_9("3.9"),
	SCR4_0("4.0"),
	SCR4_2("4.2"),
	SCR4_3("4.3"),
	SCR4_4("4.4"),
	SCR4_5("4.5"),
	SCR4_6("4.6"),
	SCR4_7("4.7"),
	SCR4_8("4.8"),
	SCR4_95("4.95"),
	SCR5_0("5.0"),
	SCR5_1("5.1"),
	SCR5_15("5.15"),
	SCR5_2("5.2"),
	SCR5_25("5.25"),
	SCR5_3("5.3"),
	SCR5_4("5.4"),
	SCR5_45("5.45"),
	SCR5_5("5.5"),
	SCR5_6("5.6"),
	SCR5_65("5.65"),
	SCR5_7("5.7"),
	SCR5_8("5.8"),
	SCR5_84("5.84"),
	SCR5_88("5.88"),
	SCR5_9("5.9"),
	SCR5_93("5.93"),
	SCR5_95("5.95"),
	SCR5_96("5.96"),
	SCR5_99("5.99"),
	SCR6_0("6.0"),
	SCR6_01("6.01"),
	SCR6_1("6.1"),
	SCR6_2("6.2"),
	SCR6_22("6.22"),
	SCR6_26("6.26"),
	SCR6_28("6.28"),
	SCR6_3("6.3"),
	SCR6_4("6.4"),
	SCR6_41("6.41"),
	SCR6_42("6.42"),
	SCR6_43("6.43"),
	SCR6_5("6.5"),
	SCR6_59("6.59"),
	SCR6_6("6.6"),
	SCR6_8("6.8"),
	SCR7_0("7.0"),
	SCR7_9("7.9"),
	SCR8_0("8.0"),
	SCR8_4("8.4"),
	SCR9_6("9.6"),
	SCR9_7("9.7"),
	SCR10_1("10.1"),

	/**
	 * Other or unknow type of device.
	 */	
	UNKNOWN("Unknown");
	
	String name;
	
	private ScreenSizeType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
