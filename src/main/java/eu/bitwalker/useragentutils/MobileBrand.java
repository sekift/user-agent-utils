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
 * Enum contact for the type of moible brand
 * 
 * 手机厂商 - 主安卓 - 66个
 * @author sekift
 *
 */
public enum MobileBrand {
	
	QIHU(1, "360"),
	PHONE8848(2, "8848"),
	HTC(3, "HTC"),
	KINDLE(4, "Kindle"),
	LG(5, "LG"),
	NEXUS(6, "Nexus"),
	NOKIA(7, "诺基亚"),
	OPPO(8, "OPPO"),
	PPTV(9, "PPTV"),
	SUGAR(10, "SUGAR"),
	TCL(11, "TCL"),
	VIVO(12, "vivo"),
	YOTA(13, "Yota"),
	ZUG(14, "ZUG"),
	ZUK(15, "ZUK"),
	ONDA(16, "昂达"),
	AOCOS(17, "奥可视"),
	BIFER(18, "贝尔丰"),
	BBK(19, "步步高"),
	INFINIX(20, "传音"),
	SMARTISAN(21, "锤子"),
	DOOV(22, "朵唯"),
	QUALCOMM(23, "高通"),
	GREE(24, "格力"),
	GOOGLE(25, "谷歌"),
	GOME(26, "国美"),
	HISENSE(27, "海信"),
	BLACKBERRY(28, "黑莓"),
	SKR(29, "黑鲨"),
	ASUS(30, "华硕"),
	HUAWEI(31, "华为"),
	GIONEE(32, "金立"),
	KOOBEE(33, "酷比"),
	COOLPAD(34, "酷派"),
	KOPO(35, "酷珀"),
	RAMOS(36, "蓝魔"),
	LEPHONE(37, "乐丰"),
	LETV(38, "乐视"),
	LENOVO(39, "联想"),
	MEITU(40, "美图"),
	MEIZU(41, "魅族"),
	MOTO(42, "摩托罗拉"),
	NUBIA(43, "努比亚"),
	OUJIA(44, "欧加"),
	OUKI(45, "欧奇"),
	GREENORANGE(46, "青橙"),
	SAMSUNG(47, "三星"),
	SONY(48, "索尼"),
	KTOUCH(49, "天语"),
	VERTU(50, "维图"),
	SHARP(51, "夏普"),
	AMOI(52, "夏新"),
	PIONEER(53, "先锋"),
	LA(54, "小辣椒"),
	MI(55, "小米"),
	VIRTUAL(56, "虚拟机"),
	ONEPLUS(57, "一加"),
	INTKI(58, "英特奇"),
	YLT(59, "永隆通"),
	YUFLY(60, "宇飞来"),
	YEPEN(61, "誉品"),
	SPREADTRUM(62, "展讯"),
	CHANGHONG(63, "长虹"),
	BESTSONNY(64, "至尊宝"),
	CMCC(65, "中国移动"),
	ZTE(66, "中兴"),
	
	/**
	 * Other or unknow type of device.
	 */	
	UNKNOWN(100, "Unknown");
	
	private final short id;
	private final String name;
	
	private MobileBrand(int id, String name) {
		this.id = (byte) id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
