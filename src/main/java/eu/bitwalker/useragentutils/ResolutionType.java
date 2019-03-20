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
 * 手机屏幕分辨率
 * @author sekift
 *
 */
public enum ResolutionType {
	RES240_320("240x320"),
	RES240_400("240x400"),
	RES320_480("320x480"),
	RES360_640("360x640"),
	RES480_800("480x800"),
	RES480_854("480x854"),
	RES540_960("540x960"),
	RES600_1024("600x1024"),
	RES640_960("640x960"),
	RES720_1080("720x1080"),
	RES720_1280("720x1280"),
	RES720_1440("720x1440"),
	RES720_1520("720x1520"),
	RES768_1024("768x1024"),
	RES768_1280("768x1280"),
	RES800_1280("800x1280"),
	RES1080_1800("1080x1800"),
	RES1080_1920("1080x1920"),
	RES1080_2040("1080x2040"),
	RES1080_2048("1080x2048"),
	RES1080_2160("1080x2160"),
	RES1080_2240("1080x2240"),
	RES1080_2280("1080x2280"),
	RES1080_2316("1080x2316"),
	RES1080_2340("1080x2340"),
	RES1152_1920("1152x1920"),
	RES1200_1920("1200x1920"),
	RES1280_1920("1280x1920"),
	RES1440_2560("1440x2560"),
	RES1440_2960("1440x2960"),
	RES1536_2048("1536x2048"),
	RES1536_2560("1536x2560"),
	RES1600_2560("1600x2560"),
	RES2160_3840("2160x3840"),

	UNKNOWN("Unknown");
	
	String name;
	
	private ResolutionType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
