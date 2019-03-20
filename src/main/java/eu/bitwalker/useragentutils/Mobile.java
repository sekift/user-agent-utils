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

import java.util.ArrayList;
import java.util.List;

/**
 * 各种手机的识别 共1370种
 * 
 * @author sekiftz
 *
 */

public enum Mobile {
	
	QIKU(	MobileBrand.QIKU, null, 1000, "360", new String[] {"1501_M02 Build/LMY47D","1501-A02 Build/MRA58K",
			"1503-A01 Build/MRA58K","1505-A02 Build/MMB29M","1509_A00 Build/LMY48Z","1603-A02 Build/MRA58K",
			"1605-A01 Build/MMB29M","1605-A01 Build/NMF26F","1607-A01 Build/NMF26F","1701-M01 Build/MRA58K",
			"1707-A01 Build/NMF26X","1711-A01 Build/NMF26F","1713-A01 Build/NMF26X","1801-A01 Build/NMF26X",
			"1503-M02 Build/MRA58K","360N4 Build/MRA58K","1505-A01 Build/MRA58K","1807-A01 Build/OPM1"}, null, null, null),
	    QIKU360_F4(	MobileBrand.QIKU, Mobile.QIKU, 1, "360 F4", new String[] {"1501_M02 Build/LMY47D","1501-A02 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280), 
	    QIKU360_Q5_PLUS(	MobileBrand.QIKU, Mobile.QIKU, 5, "360 Q5 plus", new String[] {"1509_A00 Build/LMY48Z"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920), 
	    QIKU360_F4S(	MobileBrand.QIKU, Mobile.QIKU, 6, "360 F4S", new String[] {"1603-A02 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_N5(	MobileBrand.QIKU, Mobile.QIKU, 7, "360 N5", new String[] {"1605-A01 Build/MMB29M","1605-A01 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_N5S(	MobileBrand.QIKU, Mobile.QIKU, 8, "360 N5S", new String[] {"1607-A01 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_F5(	MobileBrand.QIKU, Mobile.QIKU, 9, "360 F5", new String[] {"1701-M01 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280), 
	    QIKU360_N6(	MobileBrand.QIKU, Mobile.QIKU, 10, "360 N6", new String[] {"1707-A01 Build/NMF26X"}, null, ScreenSizeType.SCR5_93, ResolutionType.RES1080_2160), 
	    QIKU360_VIZZA(	MobileBrand.QIKU, Mobile.QIKU, 11, "360 vizza", new String[] {"1711-A01 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_N6青春版(	MobileBrand.QIKU, Mobile.QIKU, 12, "360 N6青春版", new String[] {"1713-A01 Build/NMF26X"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_N6_PRO(	MobileBrand.QIKU, Mobile.QIKU, 13, "360 N6 Pro", new String[] {"1801-A01 Build/NMF26X"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160), 
	    QIKU360_N4(	MobileBrand.QIKU, Mobile.QIKU, 14, "360 N4", new String[] {"1503-A01 Build/MRA58K", "1503-M02 Build/MRA58K",
	    		"360N4 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_N4S(	MobileBrand.QIKU, Mobile.QIKU, 15, "360 N4S", new String[] {"1505-A01 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920), 
	    QIKU360_N7(	MobileBrand.QIKU, Mobile.QIKU, 16, "360 N7", new String[] {"1807-A01 Build/OPM1"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160), 

	PHONE8848(	MobileBrand.PHONE8848, null, 1000, "8848", new String[] {"8848 M3 Build/1.4.3.924e88.","8848 M3 Build/1.8.0.a6f40f.20170803.user",
			"8848 M4 Build/N2G47H"}, null, null, null),
	    PHONE8848_M3(	MobileBrand.PHONE8848, Mobile.PHONE8848, 1, "8848 M3", new String[] {"8848 M3 Build/1.4.3.924e88.",
	    		"8848 M3 Build/1.8.0.a6f40f.20170803.user"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    PHONE8848_M4(	MobileBrand.PHONE8848, Mobile.PHONE8848, 2, "8848 M4", new String[] {"8848 M4 Build/N2G47H"}, null,ScreenSizeType.SCR5_15, ResolutionType.RES1080_1920),
    
	HTC(MobileBrand.HTC, null , 1000, "HTC", new String[]{"HTC"}, null, null, null),
		HTC_A9W(	MobileBrand.HTC, Mobile.HTC, 1, "HTC A9w", new String[] {"HTC A9w Build/MMB29M","HTC A9w Build/NRD90M"}, null, ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
		HTC_D10W(	MobileBrand.HTC, Mobile.HTC, 2, "HTC D10w", new String[] {"HTC D10w Build/MRA58K"}, null, ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
		HTC_D626D(	MobileBrand.HTC, Mobile.HTC, 3, "HTC D626d", new String[] {"HTC D626d Build/KTU84P"}, null, ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
		HTC_D816T(	MobileBrand.HTC, Mobile.HTC, 4, "HTC D816t", new String[] {"HTC D816t Build/KOT49H"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
		HTC_D820U(	MobileBrand.HTC, Mobile.HTC, 5, "HTC D820u", new String[] {"HTC D820u Build/KTU84P"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
		HTC_D826T(	MobileBrand.HTC, Mobile.HTC, 6, "HTC D826t", new String[] {"HTC D826t Build/LRX22G"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
		HTC_D826W(	MobileBrand.HTC, Mobile.HTC, 7, "HTC D826w", new String[] {"HTC D826w Build/LRX22G"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
		HTC_E9X(	MobileBrand.HTC, Mobile.HTC, 8, "HTC ONE E9x", new String[] {"HTC_E9x Build/LRX22G"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
		HTC_M10U(	MobileBrand.HTC, Mobile.HTC, 9, "HTC M10u", new String[] {"HTC M10u Build/MMB29M","HTC M10u Build/NRD90M"}, null,ScreenSizeType.SCR5_2,ResolutionType.RES1440_2560),
		HTC_M8SD(	MobileBrand.HTC, Mobile.HTC, 10, "HTC M8Sd", new String[] {"HTC M8Sd Build/MMB29M"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
		HTC_M8SI(	MobileBrand.HTC, Mobile.HTC, 11, "HTC M8si", new String[] {"HTC M8si Build/MMB29M"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
		HTC_M8ST(	MobileBrand.HTC, Mobile.HTC, 12, "HTC M8St", new String[] {"HTC M8St Build/MMB29M"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
		HTC_M8T(	MobileBrand.HTC, Mobile.HTC, 13, "HTC M8t", new String[] {"HTC M8t Build/MRA58K"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
		HTC_M8X(	MobileBrand.HTC, Mobile.HTC, 14, "HTC ONE M8x", new String[] {"HTC_M8x Build/MRA58K"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
		HTC_ONE_X(	MobileBrand.HTC, Mobile.HTC, 15, "HTC One X", new String[] {"HTC S720e Build/IMM76D"}, null,ScreenSizeType.SCR4_7,ResolutionType.RES720_1280),
		HTC_U_3W(	MobileBrand.HTC, Mobile.HTC, 16, "HTC U-3w", new String[] {"HTC U-3w Build/NMF26X","HTC U-3w Build/OPR6.170623.013"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
		HTC_X9U(	MobileBrand.HTC, Mobile.HTC, 17, "HTC X9u", new String[] {"HTC X9u Build/MRA58K"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
	    
	KINDLE(MobileBrand.KINDLE, null , 1000, "Kindle Fire", new String[]{"Kindle Fire HDX Build/LMY49J", "KFHDX Build/NJH47F"}, null, null, null),    
	    KINDLE_FIRE_HDX(	MobileBrand.KINDLE, Mobile.KINDLE, 1, "Kindle Fire HDX", new String[] {"Kindle Fire HDX Build/LMY49J"}, null,ScreenSizeType.SCR7_0,ResolutionType.RES1200_1920),
	    KINDLE_FIRE_KFHDX(	MobileBrand.KINDLE, Mobile.KINDLE, 2, "Kindle Fire KFHDX", new String[] {"KFHDX Build/NJH47F"}, null, null, null),
	    
	LG(MobileBrand.LG, null , 1000, "LG", new String[]{"LG-D802 Build/JDQ39B","LG-D802 Build/MOB31K","LG-D858 Build/LRX22G",
			"LG-D859 Build/KVT49L.D85910d","LG-F460 Build/MOB30M","LG-D857 Build/MRA58K","LG-F500K Build/LMY47D",
			"LG-H819 Build/LMY47D","LG-F700S Build/OPR1.170623.032","LG-F700L Build/MMB29M","LG-H860 Build/MMB29M",
			"LG-H860 Build/NRD90wv","LG-H868 Build/LMY48Z","LG-H868 Build/MMB29M","LS670 Build/GRI40","LG-H961N Build/LMY47V",
			"LG-H990 Build/NRD90M"}, null, null, null),    
    LG_G2_D802(	MobileBrand.LG, Mobile.LG, 1, "LG G2 D802", new String[] {"LG-D802 Build/JDQ39B","LG-D802 Build/MOB31K"}, null,ScreenSizeType.SCR5_2,ResolutionType.RES1080_1920),
    LG_G3_D858(	MobileBrand.LG, Mobile.LG, 2, "LG G3 D858", new String[] {"LG-D858 Build/LRX22G"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    LG_G3_D859(	MobileBrand.LG, Mobile.LG, 3, "LG G3 D859", new String[] {"LG-D859 Build/KVT49L.D85910d"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    LG_G3_F460(	MobileBrand.LG, Mobile.LG, 4, "LG G3 F460", new String[] {"LG-F460 Build/MOB30M"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    LG_G3_INT(	MobileBrand.LG, Mobile.LG, 5, "LG G3 国际版", new String[] {"LG-D857 Build/MRA58K"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    LG_G4_F500K(	MobileBrand.LG, Mobile.LG, 6, "LG G4 F500K", new String[] {"LG-F500K Build/LMY47D"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    LG_G4_H819(	MobileBrand.LG, Mobile.LG, 7, "LG G4 H819", new String[] {"LG-H819 Build/LMY47D"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    LG_G5(	MobileBrand.LG, Mobile.LG, 8, "LG G5", new String[] {"LG-F700S Build/OPR1.170623.032"}, null,ScreenSizeType.SCR5_3,ResolutionType.RES1440_2560),
    LG_G5_F700L(	MobileBrand.LG, Mobile.LG, 9, "LG G5 F700L", new String[] {"LG-F700L Build/MMB29M"}, null,ScreenSizeType.SCR5_3,ResolutionType.RES1440_2560),
    LG_G5_H860(	MobileBrand.LG, Mobile.LG, 10, "LG G5 H860", new String[] {"LG-H860 Build/MMB29M","LG-H860 Build/NRD90wv"}, null,ScreenSizeType.SCR5_3,ResolutionType.RES1440_2560),
    LG_G5_H868(	MobileBrand.LG, Mobile.LG, 11, "LG G5 H868", new String[] {"LG-H868 Build/LMY48Z","LG-H868 Build/MMB29M"}, null,ScreenSizeType.SCR5_3,ResolutionType.RES1440_2560),
    LG_OPTIMUS_LS670(	MobileBrand.LG, Mobile.LG, 12, "LG Optimus LS670", new String[] {"LS670 Build/GRI40"}, null,ScreenSizeType.SCR3_2,ResolutionType.RES320_480),
    LG_V10_H961N(	MobileBrand.LG, Mobile.LG, 13, "LG V10 H961N", new String[] {"LG-H961N Build/LMY47V"}, null,ScreenSizeType.SCR5_7,ResolutionType.RES1440_2560),
    LG_V20_H990(	MobileBrand.LG, Mobile.LG, 14, "LG V20 H990", new String[] {"LG-H990 Build/NRD90M"}, null,ScreenSizeType.SCR5_7,ResolutionType.RES1440_2560),
	    
	NEXUS(MobileBrand.NEXUS, null , 1000, "Nexus", new String[]{"Nexus"}, null, null, null),    
    NEXUS_4(	MobileBrand.NEXUS, Mobile.NEXUS, 1, "Nexus 4", new String[] {"Nexus 4 Build/KTU84P"}, null,ScreenSizeType.SCR4_7,ResolutionType.RES768_1280),
    NEXUS_5(	MobileBrand.NEXUS, Mobile.NEXUS, 2, "Nexus 5", new String[] {"Nexus 5 Build/M4B30X", "Nexus 5 Build/MOB30M"}, null,ScreenSizeType.SCR4_95,ResolutionType.RES1080_1920),
    NEXUS_6(	MobileBrand.NEXUS, Mobile.NEXUS, 3, "Nexus 6", new String[] {"Nexus 6 Build/MRA58K","Nexus 6 Build/N6F27E",
    		"Nexus 6 Build/NBD90Z","Nexus 6 Build/NJH47D"}, null,ScreenSizeType.SCR5_96,ResolutionType.RES1440_2560),
    NEXUS_6P(	MobileBrand.NEXUS, Mobile.NEXUS, 4, "Nexus 6P", new String[] {"Nexus 6P Build/N2G47O", "Nexus 6P Build/N4F26I",
    		"Nexus 6P Build/NMF26F"}, null,ScreenSizeType.SCR5_7,ResolutionType.RES1440_2560),
    NEXUS_7(	MobileBrand.NEXUS, Mobile.NEXUS, 5, "Nexus 7", new String[] {"Nexus 7 Build/JRO03D","Nexus 7 Build/JSS15R",
    		"Nexus 7 Build/MOB30J"}, null,ScreenSizeType.SCR7_0,ResolutionType.RES800_1280),
	
    OPPO(MobileBrand.OPPO, null , 1000, "OPPO", new String[]{"OPPO","1107 Build/KTU84P","3007 Build/KTU84P","6607 Build/KTU84P",
    		"PADM00 Build/O11019","A31 Build/KTU84P","OPPO A31 Build/LZY","A311 Build/MOB30D",
    		"A31c Build/KTU84P","A31u Build/KTU84P","PBAM00 Build/OPM1.171019.026","A51 Build/LMY47V",
    		"X9007 Build/JLS36C","X9007 Build/KTU84P","X9077 Build/JLS36C","PAFM00 Build/OPM1.171019.026",
    		"N5117 Build/JLS36C","N1T Build/JDQ39","N5209 Build/KTU84P","N5207 Build/KTU84P",
    		"PACM00 Build/O11019","PACM00 Build/PACM00","PAAM00 Build/OPM1.171019.011","PACT00 Build/O11019","R8207 Build/KTU84P",
    		"R8007 Build/JLS36C","R2017 Build/JLS36C","R6007 Build/JLS36C",
    		"R7Plusm Build/LMY47V","R7005 Build/KVT49L","R7007 Build/JLS36C","R7Plus Build/LRX21M","R7Plust Build/LRX21M",
    		"R7t Build/KTU84P","R7c Build/KTU84P","R8107 Build/KTU84P","R8200 Build/KTU84P",
    		"R8205 Build/KTU84P","R831S Build/JLS36C","R9 Build/MRA58K"},null,null,null),
    OPPO_1107(	MobileBrand.OPPO, Mobile.OPPO, 1, "OPPO 1107", new String[] {"1107 Build/KTU84P"}, null,ScreenSizeType.SCR4_5,ResolutionType.RES480_854),
    OPPO_3007(	MobileBrand.OPPO, Mobile.OPPO, 2, "OPPO 3007", new String[] {"3007 Build/KTU84P"}, null,ScreenSizeType.SCR4_7,ResolutionType.RES720_1280),
    OPPO_6607(	MobileBrand.OPPO, Mobile.OPPO, 3, "OPPO 6607", new String[] {"6607 Build/KTU84P"}, null,ScreenSizeType.SCR5_9,ResolutionType.RES1080_1920),
    OPPO_A3(	MobileBrand.OPPO, Mobile.OPPO, 4, "OPPO A3", new String[] {"PADM00 Build/O11019"}, null,ScreenSizeType.SCR6_2,ResolutionType.RES1080_2280),
    OPPO_A30(	MobileBrand.OPPO, Mobile.OPPO, 5, "OPPO A30", new String[] {"OPPO A30 Build/LMY47V"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
    OPPO_A31(	MobileBrand.OPPO, Mobile.OPPO, 6, "OPPO A31", new String[] {"A31 Build/KTU84P","OPPO A31 Build/LZY"}, null,ScreenSizeType.SCR4_5,ResolutionType.RES480_854),
    OPPO_A311(	MobileBrand.OPPO, Mobile.OPPO, 7, "OPPO A311", new String[] {"A311 Build/MOB30D"}, null,ScreenSizeType.SCR3_0,ResolutionType.RES240_400),
    OPPO_A31C(	MobileBrand.OPPO, Mobile.OPPO, 8, "OPPO A31c", new String[] {"A31c Build/KTU84P"}, null,ScreenSizeType.SCR4_5,ResolutionType.RES480_854),
    OPPO_A31U(	MobileBrand.OPPO, Mobile.OPPO, 9, "OPPO A31u", new String[] {"A31u Build/KTU84P"}, null,ScreenSizeType.SCR4_5,ResolutionType.RES480_854),
    OPPO_A33(	MobileBrand.OPPO, Mobile.OPPO, 10, "OPPO A33", new String[] {"OPPO A33 Build/LMY47V"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES540_960),
    OPPO_A33M(	MobileBrand.OPPO, Mobile.OPPO, 11, "OPPO A33m", new String[] {"OPPO A33m Build/LMY47V"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES540_960),
    OPPO_A33T(	MobileBrand.OPPO, Mobile.OPPO, 12, "OPPO A33t", new String[] {"OPPO A33t Build/LMY47V"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES540_960),
    OPPO_A37M(	MobileBrand.OPPO, Mobile.OPPO, 13, "OPPO A37m", new String[] {"OPPO A37m Build/LMY47I"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_A37T(	MobileBrand.OPPO, Mobile.OPPO, 14, "OPPO A37t", new String[] {"OPPO A37t Build/MRA58K"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_A5(	MobileBrand.OPPO, Mobile.OPPO, 15, "OPPO A5", new String[] {"PBAM00 Build/OPM1.171019.026"}, null,ScreenSizeType.SCR6_2,ResolutionType.RES720_1520),
    OPPO_A51(	MobileBrand.OPPO, Mobile.OPPO, 16, "OPPO A51", new String[] {"A51 Build/LMY47V"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_A53(	MobileBrand.OPPO, Mobile.OPPO, 17, "OPPO A53", new String[] {"OPPO A53 Build/LMY47V"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
    OPPO_A53M(	MobileBrand.OPPO, Mobile.OPPO, 18, "OPPO A53m", new String[] {"OPPO A53m Build/LMY47V"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
    OPPO_A57(	MobileBrand.OPPO, Mobile.OPPO, 19, "OPPO A57", new String[] {"OPPO A57 Build/MMB29M"}, null,ScreenSizeType.SCR5_2,ResolutionType.RES720_1280),
    OPPO_A57T(	MobileBrand.OPPO, Mobile.OPPO, 20, "OPPO A57t", new String[] {"OPPO A57t Build/MMB29M"}, null,ScreenSizeType.SCR5_2,ResolutionType.RES720_1280),
    OPPO_A59(	MobileBrand.OPPO, Mobile.OPPO, 21, "OPPO A59", new String[] {"OPPO A59m Build/LMY47I"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
    OPPO_A59S(	MobileBrand.OPPO, Mobile.OPPO, 22, "OPPO A59s", new String[] {"OPPO A59s Build/LMY47I"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
    OPPO_A59ST(	MobileBrand.OPPO, Mobile.OPPO, 23, "OPPO A59st", new String[] {"OPPO A59st Build/MRA58K"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
    OPPO_A59T(	MobileBrand.OPPO, Mobile.OPPO, 24, "OPPO A59t", new String[] {"OPPO A59t Build/LMY47I"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES720_1280),
    OPPO_A73(	MobileBrand.OPPO, Mobile.OPPO, 25, "OPPO A73", new String[] {"OPPO A73 Build/N6F26Q"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_2160),
    OPPO_A73T(	MobileBrand.OPPO, Mobile.OPPO, 26, "OPPO A73t", new String[] {"OPPO A73t Build/N6F26Q"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_2160),
    OPPO_A77(	MobileBrand.OPPO, Mobile.OPPO, 27, "OPPO A77", new String[] {"OPPO A77 Build/NMF26F"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_A77T(	MobileBrand.OPPO, Mobile.OPPO, 28, "OPPO A77t", new String[] {"OPPO A77t Build/NMF26F"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_A79(	MobileBrand.OPPO, Mobile.OPPO, 29, "OPPO A79", new String[] {"OPPO A79 Build/N6F26Q"}, null,ScreenSizeType.SCR6_01,ResolutionType.RES1080_2160),
    OPPO_A79K(	MobileBrand.OPPO, Mobile.OPPO, 30, "OPPO A79k", new String[] {"OPPO A79k Build/N6F26Q"}, null,ScreenSizeType.SCR6_01,ResolutionType.RES1080_2160),
    OPPO_A79KT(	MobileBrand.OPPO, Mobile.OPPO, 31, "OPPO A79kt", new String[] {"OPPO A79kt Build/N6F26Q"}, null,ScreenSizeType.SCR6_01,ResolutionType.RES1080_2160),
    OPPO_A83(	MobileBrand.OPPO, Mobile.OPPO, 32, "OPPO A83", new String[] {"OPPO A83 Build/N6F26Q"}, null,ScreenSizeType.SCR5_7,ResolutionType.RES720_1440),
    OPPO_A83T(	MobileBrand.OPPO, Mobile.OPPO, 33, "OPPO A83t", new String[] {"OPPO A83t Build/N6F26Q"}, null,ScreenSizeType.SCR5_7,ResolutionType.RES720_1440),
    OPPO_FIND_7(	MobileBrand.OPPO, Mobile.OPPO, 34, "OPPO Find 7", new String[] {"X9007 Build/JLS36C","X9007 Build/KTU84P","X9077 Build/JLS36C"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1440_2560),
    OPPO_FIND_X(	MobileBrand.OPPO, Mobile.OPPO, 35, "OPPO Find X全网通版", new String[] {"PAFM00 Build/OPM1.171019.026"}, null, ScreenSizeType.SCR6_42,ResolutionType.RES1080_2340),
    OPPO_N1_MINI(	MobileBrand.OPPO, Mobile.OPPO, 36, "OPPO N1 Mini", new String[] {"N5117 Build/JLS36C"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_N1T(	MobileBrand.OPPO, Mobile.OPPO, 37, "OPPO N1T", new String[] {"N1T Build/JDQ39"}, null,ScreenSizeType.SCR5_9,ResolutionType.RES1080_1920),
    OPPO_N3(	MobileBrand.OPPO, Mobile.OPPO, 38, "OPPO N3", new String[] {"N5209 Build/KTU84P"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_N3移动4G(	MobileBrand.OPPO, Mobile.OPPO, 39, "OPPO N3移动4G", new String[] {"N5207 Build/KTU84P"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R11(	MobileBrand.OPPO, Mobile.OPPO, 40, "OPPO R11", new String[] {"OPPO R11 Build/NMF26X"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R11_PLUS(	MobileBrand.OPPO, Mobile.OPPO, 41, "OPPO R11 Plus", new String[] {"OPPO R11 Plus Build/LMY47V","OPPO R11 Plus Build/N2G47H",
    		"OPPO R11 Plus Build/NMF26X"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R11_PLUSK(	MobileBrand.OPPO, Mobile.OPPO, 42, "OPPO R11 Plusk", new String[] {"OPPO R11 Plusk Build/NMF26X"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R11_PLUSKT(	MobileBrand.OPPO, Mobile.OPPO, 43, "OPPO R11 Pluskt", new String[] {"OPPO R11 Pluskt Build/NMF26X"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R11PLUS(	MobileBrand.OPPO, Mobile.OPPO, 44, "OPPO R11plus", new String[] {"OPPO R11plus Build/NRD90M"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R11S(	MobileBrand.OPPO, Mobile.OPPO, 45, "OPPO R11s", new String[] {"OPPO R11s Build/NMF26X","OPPO R11s Build/OPPO+R11s"}, null,ScreenSizeType.SCR6_01,ResolutionType.RES1080_2160),
    OPPO_R11S_PLUS(	MobileBrand.OPPO, Mobile.OPPO, 46, "OPPO R11s Plus", new String[] {"OPPO R11s Plus Build/NMF26X"}, null,ScreenSizeType.SCR6_43,ResolutionType.RES1080_2160),
    OPPO_R11S_PLUST(	MobileBrand.OPPO, Mobile.OPPO, 47, "OPPO R11s Plust", new String[] {"OPPO R11s Plust Build/NMF26X"}, null,ScreenSizeType.SCR6_43,ResolutionType.RES1080_2160),
    OPPO_R11ST(	MobileBrand.OPPO, Mobile.OPPO, 48, "OPPO R11st", new String[] {"OPPO R11st Build/NMF26X"}, null,ScreenSizeType.SCR6_43,ResolutionType.RES1080_2160),
    OPPO_R11T(	MobileBrand.OPPO, Mobile.OPPO, 49, "OPPO R11t", new String[] {"OPPO R11t Build/NMF26X"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R15(	MobileBrand.OPPO, Mobile.OPPO, 50, "OPPO R15", new String[] {"PACM00 Build/O11019","PACM00 Build/PACM00"}, null,ScreenSizeType.SCR6_28,ResolutionType.RES1080_2280),
    OPPO_R15_梦镜版(	MobileBrand.OPPO, Mobile.OPPO, 51, "OPPO R15 梦镜版", new String[] {"PAAM00 Build/OPM1.171019.011","PACT00 Build/O11019"}, null,ScreenSizeType.SCR6_28,ResolutionType.RES1080_2280),
    OPPO_R1C(	MobileBrand.OPPO, Mobile.OPPO, 52, "OPPO R1C", new String[] {"R8207 Build/KTU84P"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R1S移动4G(	MobileBrand.OPPO, Mobile.OPPO, 53, "OPPO R1S移动4G", new String[] {"R8007 Build/JLS36C"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R2017(	MobileBrand.OPPO, Mobile.OPPO, 54, "OPPO R2017", new String[] {"R2017 Build/JLS36C"}, null,ScreenSizeType.SCR4_7,ResolutionType.RES540_960),
    OPPO_R6007(	MobileBrand.OPPO, Mobile.OPPO, 55, "OPPO R6007", new String[] {"R6007 Build/JLS36C"}, null,ScreenSizeType.SCR4_7,ResolutionType.RES720_1280),
    OPPO_R7(	MobileBrand.OPPO, Mobile.OPPO, 56, "OPPO R7", new String[] {"OPPO R7 Build/KTU84P","OPPO R7 Build/LMY47I"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R7_PLUS(	MobileBrand.OPPO, Mobile.OPPO, 57, "OPPO R7 Plus", new String[] {"R7Plusm Build/LMY47V"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R7005(	MobileBrand.OPPO, Mobile.OPPO, 58, "OPPO R7005", new String[] {"R7005 Build/KVT49L"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R7007(	MobileBrand.OPPO, Mobile.OPPO, 59, "OPPO R7007", new String[] {"R7007 Build/JLS36C"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R7PLUS(	MobileBrand.OPPO, Mobile.OPPO, 60, "OPPO R7Plus", new String[] {"R7Plus Build/LRX21M"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R7PLUST(	MobileBrand.OPPO, Mobile.OPPO, 61, "OPPO R7Plust", new String[] {"R7Plust Build/LRX21M"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R7S(	MobileBrand.OPPO, Mobile.OPPO, 62, "OPPO R7s", new String[] {"OPPO R7s Build/KTU84P"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R7SM(	MobileBrand.OPPO, Mobile.OPPO, 63, "OPPO R7sm", new String[] {"OPPO R7sm Build/LMY47V"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R7SPLUS(	MobileBrand.OPPO, Mobile.OPPO, 64, "OPPO R7sPlus", new String[] {"OPPO R7sPlus Build/LMY47V"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R7ST(	MobileBrand.OPPO, Mobile.OPPO, 65, "OPPO R7st", new String[] {"OPPO R7st Build/KTU84P"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R7T(	MobileBrand.OPPO, Mobile.OPPO, 66, "OPPO R7t", new String[] {"OPPO R7t Build/KTU84P","R7t Build/KTU84P"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES1080_1920),
    OPPO_R7电信4G(	MobileBrand.OPPO, Mobile.OPPO, 67, "OPPO R7电信4G", new String[] {"R7c Build/KTU84P"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R8107(	MobileBrand.OPPO, Mobile.OPPO, 68, "OPPO R8107", new String[] {"R8107 Build/KTU84P"}, null,ScreenSizeType.SCR5_2,ResolutionType.RES1080_1920),
    OPPO_R8200(	MobileBrand.OPPO, Mobile.OPPO, 69, "OPPO R8200", new String[] {"R8200 Build/KTU84P"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R8205(	MobileBrand.OPPO, Mobile.OPPO, 70, "OPPO R8205", new String[] {"R8205 Build/KTU84P"}, null,ScreenSizeType.SCR5_0,ResolutionType.RES720_1280),
    OPPO_R831S(	MobileBrand.OPPO, Mobile.OPPO, 71, "OPPO R831S", new String[] {"R831S Build/JLS36C"}, null,ScreenSizeType.SCR4_5,ResolutionType.RES480_854),
    OPPO_R9(	MobileBrand.OPPO, Mobile.OPPO, 72, "OPPO R9", new String[] {"OPPO R9tm Build/LMY47I","OPPO R9tm Build/MRA58K","R9 Build/MRA58K"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9_PLUS(	MobileBrand.OPPO, Mobile.OPPO, 73, "OPPO R9 Plus", new String[] {"OPPO R9 Plustm A Build/LMY47V"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R9_PLUSM_A(	MobileBrand.OPPO, Mobile.OPPO, 74, "OPPO R9 Plusm A", new String[] {"OPPO R9 Plusm A Build/LMY47V","OPPO R9 Plusm A Build/MMB29M"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R9KM(	MobileBrand.OPPO, Mobile.OPPO, 75, "OPPO R9km", new String[] {"OPPO R9km Build/LMY47I"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9M(	MobileBrand.OPPO, Mobile.OPPO, 76, "OPPO R9m", new String[] {"OPPO R9m Build/LMY47I","OPPO R9m Build/MRA58K"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9S(	MobileBrand.OPPO, Mobile.OPPO, 77, "OPPO R9s", new String[] {"OPPO R9s Build/MMB29M","OPPO R9s Build/NMF26F"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9S_PLUS(	MobileBrand.OPPO, Mobile.OPPO, 78, "OPPO R9s Plus", new String[] {"OPPO R9s Plus Build/MMB29M"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R9S_PLUST(	MobileBrand.OPPO, Mobile.OPPO, 79, "OPPO R9s Plust", new String[] {"OPPO R9s Plust Build/MMB29M"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1080_1920),
    OPPO_R9SK(	MobileBrand.OPPO, Mobile.OPPO, 80, "OPPO R9sk", new String[] {"OPPO R9sk Build/MMB29M","OPPO R9sk Build/NMF26F"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9SKT(	MobileBrand.OPPO, Mobile.OPPO, 81, "OPPO R9skt", new String[] {"OPPO R9skt Build/MMB29M"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9ST(	MobileBrand.OPPO, Mobile.OPPO, 82, "OPPO R9st", new String[] {"OPPO R9st Build/MMB29M"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
    OPPO_R9T(	MobileBrand.OPPO, Mobile.OPPO, 83, "OPPO R9t", new String[] {"OPPO R9t Build/LMY47I"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
	    
    PPTV(	MobileBrand.PPTV, null, 1000, "PPTV", new String[] {"KING 7S Build/PP6000_230I","PP5600 Build/PP56002D_REL_111I"}, null, null, null),    
	    PPTV_KING_7S(	MobileBrand.PPTV, Mobile.PPTV, 1, "PPTV KING 7S", new String[] {"KING 7S Build/PP6000_230I"}, null,ScreenSizeType.SCR6_0,ResolutionType.RES1440_2560),
	    PPTV_PP5600(	MobileBrand.PPTV, Mobile.PPTV, 2, "PPTV PP5600", new String[] {"PP5600 Build/PP56002D_REL_111I"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
	    
	SUGAR(	MobileBrand.SUGAR, null, 1000, "SUGAR", new String[] {"SUGAR"}, null, null, null),
	    SUGAR_S9(	MobileBrand.SUGAR, Mobile.SUGAR, 1, "SUGAR S9", new String[] {"SUGAR S9 Build/MMB29M"}, null,ScreenSizeType.SCR5_5,ResolutionType.RES1080_1920),
	    
	TCL(	MobileBrand.TCL, null, 1000, "TCL", new String[] {"TCL"}, null,null,null),
	    TCL_580(	MobileBrand.TCL, Mobile.TCL, 1, "TCL 580", new String[] {"TCL 580 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    TCL_750(	MobileBrand.TCL, Mobile.TCL, 2, "TCL 750", new String[] {"TCL 750 Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    TCL_M2M(	MobileBrand.TCL, Mobile.TCL, 3, "TCL M2M", new String[] {"TCL M2M Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    TCL_P588L(	MobileBrand.TCL, Mobile.TCL, 4, "TCL P588L", new String[] {"TCL P588L Build/LRX22G"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    
	VIVO(	MobileBrand.VIVO, null, 1000, "vivo", new String[] {"vivo"}, null, null, null),
    VIVO_1(	MobileBrand.VIVO, Mobile.VIVO, 1, "vivo 1", new String[] {"VIVO Build/KOT49H"}, null,ScreenSizeType.SCR4_5,ResolutionType.RES480_854),
    VIVO_NEX_A(	MobileBrand.VIVO, Mobile.VIVO, 2, "vivo NEX A", new String[] {"vivo NEX A Build/OPM1.171019.019"}, null,ScreenSizeType.SCR6_59,ResolutionType.RES1080_2316),
    VIVO_NEX_S(	MobileBrand.VIVO, Mobile.VIVO, 3, "vivo NEX S", new String[] {"vivo NEX S Build/OPM1.171019.026"}, null,ScreenSizeType.SCR6_59,ResolutionType.RES1080_2316),
    VIVO_V3(	MobileBrand.VIVO, Mobile.VIVO, 4, "vivo V3", new String[] {"vivo V3 Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_V3MAX(	MobileBrand.VIVO, Mobile.VIVO, 5, "vivo V3Max", new String[] {"vivo V3M A Build/LMY47I","vivo V3Max Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_V3MAX_A(	MobileBrand.VIVO, Mobile.VIVO, 6, "vivo V3Max A", new String[] {"vivo V3Max A Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_V3MAX_L(	MobileBrand.VIVO, Mobile.VIVO, 7, "vivo V3Max L", new String[] {"vivo V3Max L Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X20(	MobileBrand.VIVO, Mobile.VIVO, 8, "vivo X20", new String[] {"vivo X20 Build/NJH47F","vivo X20 Build/NMF26X"}, null, ScreenSizeType.SCR6_01, ResolutionType.RES1080_2160),
    VIVO_X20A(	MobileBrand.VIVO, Mobile.VIVO, 9, "vivo X20A", new String[] {"vivo X20A Build/HUAWEIBLA-AL00","vivo X20A Build/NMF26X",
    		"vivo X20A Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_01, ResolutionType.RES1080_2160),
    VIVO_X20PLUS(	MobileBrand.VIVO, Mobile.VIVO, 10, "vivo X20Plus", new String[] {"vivo X20Plus Build/NMF26X"}, null, ScreenSizeType.SCR6_43, ResolutionType.RES1080_2160),
    VIVO_X20PLUS_A(	MobileBrand.VIVO, Mobile.VIVO, 11, "vivo X20Plus A", new String[] {"vivo X20Plus A Build/NMF26X","vivo X20Plus A Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_43, ResolutionType.RES1080_2160),
    VIVO_X20PLUS_UD(	MobileBrand.VIVO, Mobile.VIVO, 12, "vivo X20Plus UD", new String[] {"vivo X20Plus UD Build/NMF26X"}, null, ScreenSizeType.SCR6_43, ResolutionType.RES1080_2160),
    VIVO_X21(	MobileBrand.VIVO, Mobile.VIVO, 13, "vivo X21", new String[] {"vivo X21 Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_28, ResolutionType.RES1080_2280),
    VIVO_X21A(	MobileBrand.VIVO, Mobile.VIVO, 14, "vivo X21A", new String[] {"vivo X21A Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_28, ResolutionType.RES1080_2280),
    VIVO_X21I_A(	MobileBrand.VIVO, Mobile.VIVO, 15, "vivo X21i A", new String[] {"vivo X21i A Build/O11019"}, null, ScreenSizeType.SCR6_28, ResolutionType.RES1080_2280),
    VIVO_X21UD_A(	MobileBrand.VIVO, Mobile.VIVO, 16, "vivo X21UD A", new String[] {"vivo X21UD A Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_28, ResolutionType.RES1080_2280),
    VIVO_X3F(	MobileBrand.VIVO, Mobile.VIVO, 17, "vivo X3F", new String[] {"vivo X3F Build/JLS36C"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X3L(	MobileBrand.VIVO, Mobile.VIVO, 18, "vivo X3L", new String[] {"vivo X3L Build/JLS36C"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X3S_W(	MobileBrand.VIVO, Mobile.VIVO, 19, "vivo X3S W", new String[] {"vivo X3S W Build/JDQ39"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X3V(	MobileBrand.VIVO, Mobile.VIVO, 20, "vivo X3V", new String[] {"vivo X3V Build/KVT49L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X510T(	MobileBrand.VIVO, Mobile.VIVO, 21, "vivo X510t", new String[] {"vivo X510t Build/JDQ39","vivo X510t Build/KTU84P"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X5L(	MobileBrand.VIVO, Mobile.VIVO, 22, "vivo X5L", new String[] {"vivo X5L Build/KOT49H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X5M(	MobileBrand.VIVO, Mobile.VIVO, 23, "vivo X5M", new String[] {"vivo X5M Build/LRX22G"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X5MAX_L(	MobileBrand.VIVO, Mobile.VIVO, 24, "vivo X5Max L", new String[] {"vivo X5Max L Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X5MAX_V(	MobileBrand.VIVO, Mobile.VIVO, 25, "vivo X5Max V", new String[] {"vivo X5Max V Build/KTU84P","vivo X5Max+ Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X5PRO_D(	MobileBrand.VIVO, Mobile.VIVO, 26, "vivo X5Pro D", new String[] {"vivo X5Pro D Build/LRX21M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X5PRO_L(	MobileBrand.VIVO, Mobile.VIVO, 27, "vivo X5Pro L", new String[] {"vivo X5Pro L Build/LRX21M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X5PRO_V(	MobileBrand.VIVO, Mobile.VIVO, 28, "vivo X5Pro V", new String[] {"vivo X5Pro V Build/LRX22G"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X5S_L(	MobileBrand.VIVO, Mobile.VIVO, 28, "vivo X5S L", new String[] {"vivo X5S L Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X5V(	MobileBrand.VIVO, Mobile.VIVO, 29, "vivo X5V", new String[] {"vivo X5V Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_X6(	MobileBrand.VIVO, Mobile.VIVO, 30, "vivo X6", new String[] {"vivo X6A Build/LRX22G"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X6D(	MobileBrand.VIVO, Mobile.VIVO, 31, "vivo X6D", new String[] {"vivo X6D Build/LMY47I"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X6L(	MobileBrand.VIVO, Mobile.VIVO, 32, "vivo X6L", new String[] {"vivo X6L Build/LMY47I"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X6PLUS_A(	MobileBrand.VIVO, Mobile.VIVO, 33, "vivo X6Plus A", new String[] {"vivo X6Plus A Build/LRX22G"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X6PLUS_D(	MobileBrand.VIVO, Mobile.VIVO, 34, "vivo X6Plus D", new String[] {"vivo X6Plus D Build/LMY47I"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X6PLUS_L(	MobileBrand.VIVO, Mobile.VIVO, 35, "vivo X6Plus L", new String[] {"vivo X6Plus L Build/LMY47I"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X6S_A(	MobileBrand.VIVO, Mobile.VIVO, 36, "vivo X6S A", new String[] {"vivo X6S A Build/LMY47V"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X6SPLUS(	MobileBrand.VIVO, Mobile.VIVO, 37, "vivo X6SPlus", new String[] {"vivo X6SPlus Build/LMY47V"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X6SPLUS_A(	MobileBrand.VIVO, Mobile.VIVO, 38, "vivo X6SPlus A", new String[] {"vivo X6SPlus A Build/LMY47V"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X6SPLUS_D(	MobileBrand.VIVO, Mobile.VIVO, 39, "vivo X6SPlus D", new String[] {"vivo X6SPlus D Build/LMY47V"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X7(	MobileBrand.VIVO, Mobile.VIVO, 40, "vivo X7", new String[] {"vivo X7 Build/LMY47V","vivo X7 Build/NMF26F"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X7L(	MobileBrand.VIVO, Mobile.VIVO, 41, "vivo X7L", new String[] {"vivo X7L Build/LMY47V"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_X7PLUS(	MobileBrand.VIVO, Mobile.VIVO, 42, "vivo X7Plus", new String[] {"vivo X7Plus Build/LMY47V","vivo X7Plus Build/NMF26F"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X7PLUS_L(	MobileBrand.VIVO, Mobile.VIVO, 43, "vivo X7Plus L", new String[] {"vivo X7Plus L Build/LMY47V"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    VIVO_X9(	MobileBrand.VIVO, Mobile.VIVO, 44, "vivo X9", new String[] {"vivo X9 Build/MMB29M","vivo X9 Build/N2G47H","vivo X9 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X9I(	MobileBrand.VIVO, Mobile.VIVO, 45, "vivo X9i", new String[] {"vivo X9i Build/MMB29M","vivo X9i Build/N2G47H","vivo X9i Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X9L(	MobileBrand.VIVO, Mobile.VIVO, 46, "vivo X9L", new String[] {"vivo X9L Build/MMB29M","vivo X9L Build/N2G47H","vivo X9L Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_X9PLUS(	MobileBrand.VIVO, Mobile.VIVO, 47, "vivo X9Plus", new String[] {"vivo X9Plus Build/MMB29M","vivo X9Plus Build/N2G47H",
    		"vivo X9Plus Build/NMF26F","vivo X9Plus Build/NMF26X"}, null, ScreenSizeType.SCR5_88, ResolutionType.RES1080_1920),
    VIVO_X9PLUS_L(	MobileBrand.VIVO, Mobile.VIVO, 48, "vivo X9Plus L", new String[] {"vivo X9Plus L Build/MMB29M","vivo X9Plus L Build/N2G47H",
    		"vivo X9Plus L Build/NMF26F"}, null, ScreenSizeType.SCR5_88, ResolutionType.RES1080_1920),
    VIVO_X9S(	MobileBrand.VIVO, Mobile.VIVO, 49, "vivo X9s", new String[] {"vivo X9s Build/N2G47H","vivo X9s Build/NMF26F"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
    VIVO_X9S_L(	MobileBrand.VIVO, Mobile.VIVO, 50, "vivo X9s L", new String[] {"vivo X9s L Build/N2G47H","vivo X9s L Build/NMF26F"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
    VIVO_X9S_PLUS(	MobileBrand.VIVO, Mobile.VIVO, 51, "vivo X9s Plus", new String[] {"vivo X9s Plus Build/N2G47H","vivo X9s Plus Build/NMF26F"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
    VIVO_X9S_PLUS_L(	MobileBrand.VIVO, Mobile.VIVO, 52, "vivo X9s Plus L", new String[] {"vivo X9s Plus L Build/N2G47H","vivo X9s Plus L Build/NMF26F"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
    VIVO_XPLAY3S(	MobileBrand.VIVO, Mobile.VIVO, 53, "vivo Xplay3S", new String[] {"vivo Xplay3S Build/JLS36C","vivo Xplay3S Build/KVT49L"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1440_2560),
    VIVO_XPLAY5A(	MobileBrand.VIVO, Mobile.VIVO, 54, "vivo Xplay5A", new String[] {"vivo Xplay5A Build/LMY47V","vivo Xplay5A Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
    VIVO_XPLAY5S(	MobileBrand.VIVO, Mobile.VIVO, 55, "vivo Xplay5S", new String[] {"vivo Xplay5S Build/MRA58K"}, null, ScreenSizeType.SCR5_4, ResolutionType.RES1440_2560),
    VIVO_XPLAY6(	MobileBrand.VIVO, Mobile.VIVO, 56, "vivo Xplay6", new String[] {"vivo Xplay6 Build/MXB48T","vivo Xplay6 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
    VIVO_XSHOT(	MobileBrand.VIVO, Mobile.VIVO, 57, "vivo Xshot", new String[] {"vivo X710L Build/JLS36C","vivo X710L Build/KVT49L","vivo Xshot Build/KVT49L"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
    VIVO_Y13(	MobileBrand.VIVO, Mobile.VIVO, 58, "vivo Y13", new String[] {"vivo Y13 Build/JDQ39"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
    VIVO_Y13IL(	MobileBrand.VIVO, Mobile.VIVO, 59, "vivo Y13iL", new String[] {"vivo Y13iL Build/KTU84P"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
    VIVO_Y13L(	MobileBrand.VIVO, Mobile.VIVO, 60, "vivo Y13L", new String[] {"vivo Y13L Build/KTU84P"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
    VIVO_Y17T(	MobileBrand.VIVO, Mobile.VIVO, 61, "vivo Y17T", new String[] {"vivo Y17T Build/JDQ39"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
    VIVO_Y17W(	MobileBrand.VIVO, Mobile.VIVO, 62, "vivo Y17W", new String[] {"vivo Y17W Build/JDQ39"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
    VIVO_Y23L(	MobileBrand.VIVO, Mobile.VIVO, 63, "vivo Y23L", new String[] {"vivo Y23L Build/KTU84P"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
    VIVO_Y27(	MobileBrand.VIVO, Mobile.VIVO, 64, "vivo Y27", new String[] {"vivo Y27 Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
    VIVO_Y29L(	MobileBrand.VIVO, Mobile.VIVO, 65, "vivo Y29L", new String[] {"vivo Y29L Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_Y31(	MobileBrand.VIVO, Mobile.VIVO, 66, "vivo Y31", new String[] {"vivo Y31 Build/LRX22G"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES540_960),
    VIVO_Y31A(	MobileBrand.VIVO, Mobile.VIVO, 67, "vivo Y31A", new String[] {"vivo Y31A Build/LMY47V","vivo Y31A Build/LRX22G"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES540_960),
    VIVO_Y33(	MobileBrand.VIVO, Mobile.VIVO, 68, "vivo Y33", new String[] {"vivo Y33 Build/LRX21M"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
    VIVO_Y35(	MobileBrand.VIVO, Mobile.VIVO, 69, "vivo Y35", new String[] {"vivo Y35 Build/LRX21M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_Y35A(	MobileBrand.VIVO, Mobile.VIVO, 70, "vivo Y35A", new String[] {"vivo Y35A Build/LRX22G"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
    VIVO_Y37(	MobileBrand.VIVO, Mobile.VIVO, 71, "vivo Y37", new String[] {"vivo Y37 Build/LRX22G"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_Y37A(	MobileBrand.VIVO, Mobile.VIVO, 72, "vivo Y37A", new String[] {"vivo Y37A Build/LRX22G"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    VIVO_Y51(	MobileBrand.VIVO, Mobile.VIVO, 73, "vivo Y51", new String[] {"vivo Y51 Build/LMY47V","vivo Y51 Build/LRX22G"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
    VIVO_Y51A(	MobileBrand.VIVO, Mobile.VIVO, 74, "vivo Y51A", new String[] {"vivo Y51A Build/LMY47V","vivo Y51A Build/LRX22G"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
    VIVO_Y51E(	MobileBrand.VIVO, Mobile.VIVO, 75, "vivo Y51e", new String[] {"vivo Y51e Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
    VIVO_Y51T_L(	MobileBrand.VIVO, Mobile.VIVO, 76, "vivo Y51t L", new String[] {"vivo Y51t L Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
    VIVO_Y53L(	MobileBrand.VIVO, Mobile.VIVO, 77, "vivo Y53L", new String[] {"vivo Y53L Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
    VIVO_Y55(	MobileBrand.VIVO, Mobile.VIVO, 78, "vivo Y55", new String[] {"vivo Y55 Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
    VIVO_Y55A(	MobileBrand.VIVO, Mobile.VIVO, 79, "vivo Y55A", new String[] {"vivo Y55A Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
    VIVO_Y55L(	MobileBrand.VIVO, Mobile.VIVO, 80, "vivo Y55L", new String[] {"vivo Y55L Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
    VIVO_Y66(	MobileBrand.VIVO, Mobile.VIVO, 81, "vivo Y66", new String[] {"vivo Y66 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Y66I_A(	MobileBrand.VIVO, Mobile.VIVO, 82, "vivo Y66i A", new String[] {"vivo Y66i A Build/N2G47H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Y66L(	MobileBrand.VIVO, Mobile.VIVO, 83, "vivo Y66L", new String[] {"vivo Y66L Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Y67(	MobileBrand.VIVO, Mobile.VIVO, 84, "vivo Y67", new String[] {"vivo Y67 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Y67A(	MobileBrand.VIVO, Mobile.VIVO, 85, "vivo Y67A", new String[] {"vivo Y67A Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Y67L(	MobileBrand.VIVO, Mobile.VIVO, 86, "vivo Y67L", new String[] {"vivo Y67L Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Y71A(	MobileBrand.VIVO, Mobile.VIVO, 87, "vivo Y71A", new String[] {"vivo Y71A Build/OPM1.171019.011"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
    VIVO_Y75(	MobileBrand.VIVO, Mobile.VIVO, 88, "vivo Y75", new String[] {"vivo Y75 Build/N6F26Q"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
    VIVO_Y75A(	MobileBrand.VIVO, Mobile.VIVO, 89, "vivo Y75A", new String[] {"vivo Y75A Build/N6F26Q"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
    VIVO_Y75S(	MobileBrand.VIVO, Mobile.VIVO, 90, "vivo Y75s", new String[] {"vivo Y75s Build/N2G47H"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
    VIVO_Y79(	MobileBrand.VIVO, Mobile.VIVO, 91, "vivo Y79", new String[] {"vivo Y79 Build/N2G47H"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
    VIVO_Y79A(	MobileBrand.VIVO, Mobile.VIVO, 92, "vivo Y79A", new String[] {"vivo Y79A Build/N2G47H"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
    VIVO_Y83(	MobileBrand.VIVO, Mobile.VIVO, 93, "vivo Y83", new String[] {"vivo Y83 Build/O11019"}, null, ScreenSizeType.SCR6_22, ResolutionType.RES720_1520),
    VIVO_Y83A(	MobileBrand.VIVO, Mobile.VIVO, 94, "vivo Y83A", new String[] {"vivo Y83A Build/O11019"}, null, ScreenSizeType.SCR6_22, ResolutionType.RES720_1520),
    VIVO_Y85(	MobileBrand.VIVO, Mobile.VIVO, 95, "vivo Y85", new String[] {"vivo Y85 Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_26, ResolutionType.RES1080_2280),
    VIVO_Y85A(	MobileBrand.VIVO, Mobile.VIVO, 96, "vivo Y85A", new String[] {"vivo Y85A Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_26, ResolutionType.RES1080_2280),
    VIVO_Y928(	MobileBrand.VIVO, Mobile.VIVO, 97, "vivo Y928", new String[] {"vivo Y928 Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES540_960),
    VIVO_Y937(	MobileBrand.VIVO, Mobile.VIVO, 98, "vivo Y937", new String[] {"vivo Y937 Build/LRX22G"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
    VIVO_Z1(	MobileBrand.VIVO, Mobile.VIVO, 100, "vivo Z1", new String[] {"vivo Z1 Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_26, ResolutionType.RES1080_2280),
    
    YOTA(	MobileBrand.YOTA, null, 1000, "Yota", new String[] {"Y3 Build/Y3XSCN06A1000MPX1806223","YD206 Build/KTU84L"}, null,null,null),
        YOTA_3(	MobileBrand.YOTA, Mobile.YOTA, 1, "Yota 3", new String[] {"Y3 Build/Y3XSCN06A1000MPX1806223"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1440_2560),
        YOTA_YD206(	MobileBrand.YOTA, Mobile.YOTA, 2, "Yota YD206", new String[] {"YD206 Build/KTU84L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    
    ZUG(	MobileBrand.MANN, null, 1000, "ZUG 5S", new String[] {"ZUG 5S Build/KVT49L"}, null,null,null),
	    ZUG_5S(	MobileBrand.MANN, Mobile.ZUG, 1, "ZUG 5S", new String[] {"ZUG 5S Build/KVT49L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    
	ZUK(	MobileBrand.ZUK, null, 1000, "ZUK", new String[] {"ZUK Z2131 Build/MMB29M","ZUK Z2131 Build/N2G47H","ZUK Z2131 Build/NRD90M",
			"ZUK Z2131 Build/OPR1.170623.032","ZUK Z2151 Build/MXB48T"}, null,null,null),
	    ZUK_Z2131(	MobileBrand.ZUK, Mobile.ZUK, 1, "ZUK Z2131", new String[] {"ZUK Z2131 Build/MMB29M","ZUK Z2131 Build/N2G47H","ZUK Z2131 Build/NRD90M",
				"ZUK Z2131 Build/OPR1.170623.032"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    ZUK_Z2151(	MobileBrand.ZUK, Mobile.ZUK, 2, "ZUK Z2151", new String[] {"ZUK Z2151 Build/MXB48T"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	ONDA(	MobileBrand.ONDA, null, 1000, "昂达", new String[] {"V820w-DualOS Build/KTU84P"}, null, null, null),
	    昂达_V820W_DUALOS(	MobileBrand.ONDA, Mobile.ONDA, 1, "昂达 V820w-DualOS", new String[] {"V820w-DualOS Build/KTU84P"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES800_1280),
	    
	AOCOS(	MobileBrand.AOCOS, null, 1000, "奥可视", new String[] {"UIT410B-C10 Build/KTU84Q"}, null, null, null),
	    奥可视_锐智T410B(	MobileBrand.AOCOS, Mobile.AOCOS, 1, "奥可视 锐智T410B", new String[] {"UIT410B-C10 Build/KTU84Q"}, null,ScreenSizeType.SCR4_3, null),
	    
	BIFER(	MobileBrand.BIFER, null, 1000, "贝尔丰", new String[] {"BF_T25 Build/LMY47D"}, null, null, null),
	    贝尔丰_BF_T25(	MobileBrand.BIFER, Mobile.BIFER, 1, "贝尔丰 BF_T25", new String[] {"BF_T25 Build/LMY47D"}, null,ScreenSizeType.SCR5_0, ResolutionType.RES480_854),
	    
	BBK(	MobileBrand.BBK, null, 1000, "步步高", new String[] {"H7S Build/KTU84Q","H8S Build/LMY47D"}, null, null, null),
	    步步高_H7S(	MobileBrand.BBK, Mobile.BBK, 1, "步步高 H7S", new String[] {"H7S Build/KTU84Q"}, null,ScreenSizeType.SCR8_0, ResolutionType.RES768_1024),
	    步步高_H8S(	MobileBrand.BBK, Mobile.BBK, 2, "步步高 H8S", new String[] {"H8S Build/LMY47D"}, null,ScreenSizeType.SCR9_7, ResolutionType.RES768_1024),
	    
	INFINIX(	MobileBrand.INFINIX, null, 1000, "传音", new String[] {"Infinix"}, null, null, null),
	    传音_NOTE_4(	MobileBrand.INFINIX, Mobile.INFINIX, 1, "传音 NOTE 4", new String[] {"Infinix X572 Build/NRD90M"}, null,ScreenSizeType.SCR5_7,null),
	    
	SMARTISAN(	MobileBrand.SMARTISAN, null, 1000, "锤子", new String[] {"SM901 Build/MXB48T","SM919 Build/MXB48T",
			"SM701 Build/SANFRANCISCO","SM705 Build/SANFRANCISCO","SM801 Build/LMY47V","SM801 Build/LMY48Z",
			"YQ601 Build/LMY47V","YQ607 Build/LMY47V","OD103 Build/NMF26F","OD105 Build/NMF26F","OC105 Build/N2G47H",
			"OS105 Build/NGI77B","OS105 Build/NMF26X"}, null, null, null),
        锤子_M1_SM901(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 1, "锤子 M1 SM901", new String[] {"SM901 Build/MXB48T"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
        锤子_M1L(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 2, "锤子 M1L", new String[] {"SM919 Build/MXB48T"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
        锤子_T1(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 3, "锤子 T1", new String[] {"SM701 Build/SANFRANCISCO"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
        锤子_T1_SM705(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 4, "锤子 T1 SM705", new String[] {"SM705 Build/SANFRANCISCO"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
    锤子_T2(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 5, "锤子 T2", new String[] {"SM801 Build/LMY47V","SM801 Build/LMY48Z"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
        锤子_坚果(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 6, "锤子 坚果", new String[] {"YQ601 Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
        锤子_坚果_YQ607(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 7, "锤子 坚果 YQ607", new String[] {"YQ607 Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    锤子_坚果PRO(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 8, "锤子 坚果Pro", new String[] {"OD103 Build/NMF26F","OD105 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
    锤子_坚果PRO2(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 10, "锤子 坚果Pro2", new String[] {"OS105 Build/NGI77B","OS105 Build/NMF26X"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
    锤子_坚果PRO_3(	MobileBrand.SMARTISAN, Mobile.SMARTISAN, 9, "锤子 坚果Pro 3", new String[] {"OC105 Build/N2G47H"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    
    DOOV(	MobileBrand.DOOV, null, 1000, "朵唯", new String[] {"DOOV"}, null, null, null),
	    朵唯_A15S(	MobileBrand.DOOV, Mobile.DOOV, 1, "朵唯 A15S", new String[] {"DOOV A15s Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    朵唯_A6(	MobileBrand.DOOV, Mobile.DOOV, 2, "朵唯 A6", new String[] {"DOOV A6 Build/LMY47D"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    朵唯_L1(	MobileBrand.DOOV, Mobile.DOOV, 3, "朵唯 L1", new String[] {"DOOV L1 Build/DOOVL1"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES720_1280),
	    朵唯_L525(	MobileBrand.DOOV, Mobile.DOOV, 4, "朵唯 L525", new String[] {"DOOV L525 Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    朵唯_L9(	MobileBrand.DOOV, Mobile.DOOV, 5, "朵唯 L9", new String[] {"DOOV L9 Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    朵唯_V1(	MobileBrand.DOOV, Mobile.DOOV, 6, "朵唯 V1", new String[] {"DOOV V1 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    
	    QUALCOMM(	MobileBrand.QUALCOMM, null, 1, "高通", new String[] {"msm8916_32 Build/KTU84P"}, null,null,null),
	    高通_骁龙410(	MobileBrand.QUALCOMM, Mobile.QUALCOMM, 1, "高通 骁龙410", new String[] {"msm8916_32 Build/KTU84P"}, null, null, null),
	    
	    GREE(	MobileBrand.GREE, null, 1000, "格力", new String[] {"G0215D Build/MMB29M","G0245D Build/MMB29M"}, null, null, null),
	    格力_G0215D(	MobileBrand.GREE, Mobile.GREE, 1, "格力 G0215D", new String[] {"G0215D Build/MMB29M"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1440_2560),
	    格力_G0245D(	MobileBrand.GREE, Mobile.GREE, 2, "格力 G0245D", new String[] {"G0245D Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    GOOGLE(	MobileBrand.GOOGLE, null, 1000, "谷歌", new String[] {"Pixel"}, null, null, null),
	    谷歌_PIXEL(	MobileBrand.GOOGLE, Mobile.GOOGLE, 1, "谷歌 Pixel", new String[] {"Pixel Build/NDE63H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    谷歌_PIXEL_2(	MobileBrand.GOOGLE, Mobile.GOOGLE, 2, "谷歌 Pixel 2", new String[] {"Pixel 2 Build/OPM2.171019.029"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    谷歌_PIXEL_2_XL(	MobileBrand.GOOGLE, Mobile.GOOGLE, 3, "谷歌 Pixel 2 XL", new String[] {"Pixel 2 XL Build/LMY47I"}, null, ScreenSizeType.SCR5_6, ResolutionType.RES1440_2560),
	    
	    GOME(	MobileBrand.GOME, null, 1000, "国美", new String[] {"GOME 2018X38A Build/O11019","U7 Build/LMY47D"}, null, null, null),
	    国美_C72(	MobileBrand.GOME, Mobile.GOME, 1, "国美 C72", new String[] {"GOME 2018X38A Build/O11019"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
	    国美_U7(	MobileBrand.GOME, Mobile.GOME, 1, "国美 U7", new String[] {"U7 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    
	    HISENSE(	MobileBrand.HISENSE, null, 1000, "海信", new String[] {"Hisense","HS-EG906 Build/IMM76D"}, null, null, null),
	    海信_A2(	MobileBrand.HISENSE, Mobile.HISENSE, 1, "海信 A2", new String[] {"Hisense A2 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    海信_E51_M(	MobileBrand.HISENSE, Mobile.HISENSE, 2, "海信 E51-M", new String[] {"Hisense E51-M Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    海信_E621T(	MobileBrand.HISENSE, Mobile.HISENSE, 3, "海信 E621T", new String[] {"Hisense E621T Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
	    海信_E76(	MobileBrand.HISENSE, Mobile.HISENSE, 4, "海信 E76", new String[] {"Hisense E76 Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    海信_E77(	MobileBrand.HISENSE, Mobile.HISENSE, 5, "海信 E77", new String[] {"Hisense E77 Build/N2G47H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    海信_EG906(	MobileBrand.HISENSE, Mobile.HISENSE, 6, "海信 EG906", new String[] {"HS-EG906 Build/IMM76D"}, null, null, null),
	    海信_F22M(	MobileBrand.HISENSE, Mobile.HISENSE, 7, "海信 F22M", new String[] {"Hisense F22M Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    海信_F30(	MobileBrand.HISENSE, Mobile.HISENSE, 8, "海信 F30", new String[] {"Hisense F30 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    海信_F31(	MobileBrand.HISENSE, Mobile.HISENSE, 9, "海信 F31", new String[] {"Hisense F31 Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    海信_M20_T(	MobileBrand.HISENSE, Mobile.HISENSE, 10, "海信 M20-T", new String[] {"Hisense M20-T Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES480_854),
	    
	    BLACKBERRY(	MobileBrand.BLACKBERRY, null, 1000, "黑莓", new String[] {"3gpp-gba Build/BlackBerry","BBB100-4 Build/NMF26F","STV100-3 Build/MMB29M"}, null,null,null),
	    黑莓_3GPP_GBA(	MobileBrand.BLACKBERRY, Mobile.BLACKBERRY, 1, "黑莓 3gpp-gba", new String[] {"3gpp-gba Build/BlackBerry"}, null, null, null),
	    黑莓_BBB100_4(	MobileBrand.BLACKBERRY, Mobile.BLACKBERRY, 2, "黑莓 BBB100-4", new String[] {"BBB100-4 Build/NMF26F"}, null, null, null),
	    黑莓_PRIV_STV100_3(	MobileBrand.BLACKBERRY, Mobile.BLACKBERRY, 3, "黑莓 Priv STV100-3", new String[] {"STV100-3 Build/MMB29M"}, null, ScreenSizeType.SCR5_4, ResolutionType.RES1440_2560),
	    
	    SKR(	MobileBrand.SKR, null, 1000, "黑鲨", new String[] {"SKR-A0 Build/G66X1805241CN00MPX","SKR-A0 Build/G66X1806210CN00MPX"
	    		,"SKR-A0 Build/G66X1808091CN00MPX"}, null, null, null),
	    黑鲨_SKR_A0(	MobileBrand.SKR, Mobile.SKR, 1, "黑鲨 SKR-A0", new String[] {"SKR-A0 Build/G66X1805241CN00MPX",
	    		"SKR-A0 Build/G66X1806210CN00MPX","SKR-A0 Build/G66X1808091CN00MPX"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    
	    ASUS(	MobileBrand.ASUS, null, 1000, "华硕", new String[] {"ASUS"}, null, null, null),
	    华硕_ASUS_A007(	MobileBrand.ASUS, Mobile.ASUS, 1, "华硕 ASUS_A007", new String[] {"ASUS_A007 Build/MMB29P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华硕_ASUS_X015D(	MobileBrand.ASUS, Mobile.ASUS, 2, "华硕 ASUS_X015D", new String[] {"ASUS_X015D Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华硕_ASUS_X018DC(	MobileBrand.ASUS, Mobile.ASUS, 3, "华硕 ASUS_X018DC", new String[] {"ASUS_X018DC Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
	    华硕_ASUS_Z00ADA(	MobileBrand.ASUS, Mobile.ASUS, 4, "华硕 ASUS_Z00ADA", new String[] {"ASUS_Z00ADA Build/LRX21V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华硕_ASUS_Z00ADB(	MobileBrand.ASUS, Mobile.ASUS, 5, "华硕 ASUS_Z00ADB", new String[] {"ASUS_Z00ADB Build/LRX21V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华硕_ASUS_Z00XSB(	MobileBrand.ASUS, Mobile.ASUS, 6, "华硕 ASUS_Z00XSB", new String[] {"ASUS_Z00XSB Build/LRX21V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    HUAWEI(	MobileBrand.HUAWEI, null, 1000, "华为", new String[] {"HUAWEI","ALE-UL00 Build/HuaweiALE-UL00",
	    		"ALP-TL00 Build/HUAWEIALP-TL00","ANE-AL00 Build/HUAWEIANE-AL00","ANE-TL00 Build/HUAWEIANE-TL00",
	    		"Honor Build/NRD90M","Honor 6 Build/KTU84Q","HONOR H30-L01M Build/HonorH30-L01M",
	    		"IVY-AL00 Build/HUAWEIIVY-AL00","BAH-W09 Build/HUAWEIBAH-W09","ALP-AL00 Build/HUAWEIALP-AL00",
	    		"BLA-AL00 Build/HUAWEIBLA-AL00","BLA-L29 Build/HUAWEIBLA-L29","BLA-TL00 Build/HUAWEIBLA-TL00",
	    		"NXT-TL00 Build/HUAWEINXT-TL00","MHA-AL00 Build/HUAWEIMHA-AL00","LON-AL00 Build/HUAWEILON-AL00",
	    		"LON-L29 Build/HUAWEILON-L29","NEO-AL00 Build/HUAWEINEO-AL00","MHA-L29 Build/HUAWEIMHA-L29",
	    		"MHA-TL00 Build/HUAWEIMHA-TL00","GEM-702L Build/HUAWEIGEM-702L","PIC-TL00 Build/HUAWEIPIC-TL00",
	    		"PIC-AL00 Build/HUAWEIPIC-AL00","BAC-AL00 Build/HUAWEIBAC-AL00","BAC-TL00 Build/HUAWEIBAC-TL00",
	    		"HWI-TL00 Build/HUAWEIHWI-TL00","HWI-AL00 Build/HUAWEIHWI-AL00","PAR-AL00 Build/HUAWEIPAR-AL00",
	    		"INE-AL00 Build/HUAWEIINE-AL00","WAS-TL10 Build/HUAWEIWAS-TL10","WAS-AL00 Build/HUAWEIWAS-AL00",
	    		"VTR-AL00 Build/HUAWEIVTR- AL00","VTR-AL00 Build/HUAWEIVTR-AL00","VKY-TL00 Build/HUAWEIVKY-TL00",
	    		"VKY-AL00 Build/HUAWEIVKY-AL00","VTR-TL00 Build/HUAWEIVTR-TL00","EML-AL00 Build/HUAWEIEML-AL00",
	    		"EML-TL00 Build/HUAWEIEML-TL00","CLT-AL01 Build/HUAWEICLT-AL01","CLT-TL00 Build/HUAWEICLT-TL00",
	    		"CLT-TL01 Build/HUAWEICLT-TL01","CLT-AL00 Build/HUAWEICLT-AL00","P8 Build/KTU84P",
	    		"ALE-TL00 Build/HuaweiALE-TL00","EVA-CL00 Build/HUAWEIEVA-CL00","EVA-AL10 Build/HUAWEIEVA-AL10",
	    		"EVA-DL00 Build/HUAWEIEVA-DL00","EVA-TL00 Build/HUAWEIEVA-TL00","VIE-L29 Build/HUAWEIVIE-L29",
	    		"VIE-AL10 Build/HUAWEIVIE-AL10","EVA-AL00 Build/HUAWEIEVA-AL00","EVA-L19 Build/HUAWEIEVA-L19",
	    		"U8800 Build/HuaweiU8800","DIG-AL00 Build/HUAWEIDIG-AL00","DIG-TL10 Build/HUAWEIDIG-TL10",
	    		"SLA-AL00 Build/HUAWEISLA-AL00","SLA-TL10 Build/HUAWEISLA-TL10","TRT-AL00 Build/HUAWEITRT-AL00",
	    		"TRT-AL00A Build/HUAWEITRT-AL00A","TRT-TL10 Build/HUAWEITRT-TL10","TRT-TL10A Build/HUAWEITRT-TL10A",
	    		"FIG-AL00 Build/HUAWEIFIG-AL00","FIG-TL10 Build/HUAWEIFIG-TL10","FIG-AL10 Build/HUAWEIFIG-AL10",
	    		"LDN-AL00 Build/HUAWEILDN-AL00","LDN-AL20 Build/HUAWEILDN-AL20","FLA-AL10 Build/HUAWEIFLA-AL10",
	    		"FLA-AL20 Build/HUAWEIFLA-AL20","FLA-TL10 Build/HUAWEIFLA-TL10","PLE-703L Build/HuaweiMediaPad",
	    		"RNE-AL00 Build/HUAWEIRNE-AL00","BTV-DL09 Build/HUAWEIBEETHOVEN-DL09","BTV-W09 Build/HUAWEIBEETHOVEN-W09",
	    		"CPN-AL00 Build/HUAWEICPN-AL00","JDN-AL00 Build/HuaweiMediaPad","JDN-W09 Build/HuaweiMediaPad",
	    		"COL-AL10 Build/HUAWEICOL-AL10","COL-TL10 Build/HUAWEICOL-TL10","HONOR H30-L01 Build/HonorH30-L01",
	    		"H30-T10 Build/HuaweiH30-T10","G750-T01 Build/HuaweiG750-T01","SCL-AL00 Build/HonorSCL-AL00",
	    		"SCL-CL00 Build/HonorSCL-CL00","SCL-TL00H Build/HonorSCL-TL00H","SCL-TL00 Build/HonorSCL-TL00",
	    		"H60-L01 Build/HDH60-L01","H60-L02 Build/HDH60-L02","H60-L11 Build/HDH60-L11","PE-TL10 Build/HuaweiPE-TL10",
	    		"PE-TL20 Build/HuaweiPE-TL20","PE-CL00 Build/HuaweiPE-CL00","PE-UL00 Build/HuaweiPE-UL00",
	    		"PE-TL00M Build/HuaweiPE-TL00M","BLN-AL20 Build/HONORBLN-AL20","BLN-TL10 Build/HONORBLN-TL10",
	    		"H60-L12 Build/HDH60-L12","H60-L03 Build/HDH60-L03","PLK-CL00 Build/HONORPLK-CL00",
	    		"PLK-TL00 Build/HONORPLK-TL00","PLK-AL10 Build/HONORPLK-AL10","PLK-TL01H Build/HONORPLK-TL01H",
	    		"PLK-UL00 Build/HONORPLK-UL00","ATH-AL00 Build/HONORATH-AL00","ATH-CL00 Build/HONORATH-CL00",
	    		"ATH-TL00H Build/HONORATH-TL00H","BND-AL10 Build/HONORBND-AL10","BND-AL00 Build/HONORBND-AL00",
	    		"BND-TL10 Build/HONORBND-TL10","FRD-AL00 Build/HUAWEIFRD-AL00","FRD-DL00 Build/HUAWEIFRD-DL00",
	    		"JSN-AL00 Build/HONORJSN-AL00","FRD-AL10 Build/HUAWEIFRD-AL10","PRA-TL10 Build/HONORPRA-TL10",
	    		"PRA-AL00 Build/HONORPRA-AL00","PRA-AL00X Build/HONORPRA-AL00X","STF-AL00 Build/HUAWEISTF-AL00",
	    		"STF-AL10 Build/HUAWEISTF-AL10","LLD-AL20 Build/HONORLLD-AL20","LLD-AL30 Build/HONORLLD-AL30",
	    		"LLD-AL00 Build/HONORLLD-AL00","LLD-AL10 Build/HONORLLD-AL10","NTS-AL00 Build/HUAWEINTS-AL00",
	    		"EDI-AL10 Build/HUAWEIEDISON-AL10","COR-AL00 Build/HUAWEICOR-AL00","COR-AL10 Build/HUAWEICOR-AL10",
	    		"BKL-AL20 Build/HUAWEIBKL-AL20","BKL-TL10 Build/HUAWEIBKL-TL10","BKL-AL00 Build/HUAWEIBKL-AL00",
	    		"KNT-AL10 Build/HUAWEIKNT-AL10","KNT-TL10 Build/HUAWEIKNT-TL10","V8 Build/LMY47D",
	    		"KNT-AL20 Build/HUAWEIKNT-AL20","KNT-UL10 Build/HUAWEIKNT-UL10","DUK-TL30 Build/HUAWEIDUK-TL30",
	    		"DUK-AL20 Build/HUAWEIDUK-AL20","JMM-AL00 Build/HONORJMM-AL00","JMM-AL10 Build/HONORJMM-AL10",
	    		"JMM-TL10 Build/HONORJMM-TL10","GEM-703L Build/HUAWEIGEM-703L","GEM-703LT Build/HUAWEIGEM-703LT",
	    		"C8817D Build/HuaweiC8817D","G621-TL00 Build/HonorG621-TL00","CHM-CL00 Build/CHM-CL00",
	    		"CHM-TL00 Build/HonorCHM-TL00","CHM-TL00H Build/HonorCHM-TL00H","CHM-UL00 Build/HonorCHM-UL00",
	    		"Che2-TL00 Build/HonorChe2-TL00","Che2-TL00M Build/HonorChe2-TL00M","CHE-TL00H Build/HonorCHE-TL00H",
	    		"Che1-CL10 Build/Che1-CL10","Che2-UL00 Build/HonorChe2-UL00","Che1-CL20 Build/Che1-CL20",
	    		"CHE-TL00 Build/HonorCHE-TL00","CUN-AL00 Build/HUAWEICUN-AL00","CUN-TL00 Build/HUAWEICUN-TL00",
	    		"CAM-AL00 Build/HONORCAM-AL00","CAM-TL00 Build/HONORCAM-TL00","CAM-TL10H Build/HONORCAM-TL00H",
	    		"CAM-UL00 Build/HONORCAM-UL00","CAM-TL00H Build/HONORCAM-TL00H","NEM-TL00 Build/HONORNEM-TL00",
	    		"NEM-UL10 Build/HONORNEM-UL10","NEM-AL10 Build/HONORNEM-AL10","NEM-TL00H Build/HONORNEM-TL00H",
	    		"KIW-TL00 Build/HONORKIW-TL00","KIW-UL00 Build/HONORKIW-UL00","KIW-AL10 Build/HONORKIW-AL10",
	    		"KIW-TL00H Build/HONORKIW-TL00H","KIW-CL00 Build/HONORKIW-CL00","MYA-AL10 Build/HONORMYA-AL10",
	    		"DLI-AL10 Build/HONORDLI-AL10","DLI-TL20 Build/HONORDLI-TL20","BLN-AL10 Build/HONORBLN-AL10",
	    		"BLN-AL30 Build/HONORBLN-AL30","BLN-AL40 Build/HONORBLN-AL40","DUA-AL00 Build/HONORDUA-AL00",
	    		"AUM-AL20 Build/HONORAUM-AL20","LND-AL30 Build/HONORLND-AL30","LND-AL40 Build/HONORLND-AL40",
	    		"NCE-AL00 Build/HUAWEINCE-AL00","NCE-AL10 Build/HUAWEINCE-AL10","T1-823L Build/HuaweiMediaPad",
	    		"T1-A23L Build/HuaweiMediaPad","ATU-AL10 Build/HUAWEIATU-AL10"}, null, null, null),
	    华为_ALE_CL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 1, "华为 P8青春版", new String[] {"HUAWEI ALE-CL00 Build/HuaweiALE-CL00","ALE-UL00 Build/HuaweiALE-UL00"},
	    		null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_ALP_TL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 3, "华为 Mate10", new String[] {"ALP-TL00 Build/HUAWEIALP-TL00"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_2160),
	    华为_ANE_AL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 4, "华为 nova 3e", new String[] {"ANE-AL00 Build/HUAWEIANE-AL00","ANE-TL00 Build/HUAWEIANE-TL00"},
	    		null, ScreenSizeType.SCR5_84, ResolutionType.RES1080_2280),
	    华为_ASCEND_G7(	MobileBrand.HUAWEI, Mobile.HUAWEI, 6, "华为 Ascend G7", new String[] {"HUAWEI G7-TL00 Build/HuaweiG7-TL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_ASCEND_P7(	MobileBrand.HUAWEI, Mobile.HUAWEI, 7, "华为 Ascend P7", new String[] {"HUAWEI P7-L09 Build/HuaweiP7-L09"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    华为_C199(	MobileBrand.HUAWEI, Mobile.HUAWEI, 8, "华为 C199", new String[] {"HUAWEI C199 Build/HuaweiC199"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_C199S(	MobileBrand.HUAWEI, Mobile.HUAWEI, 9, "华为 C199s", new String[] {"HUAWEI C199s Build/HuaweiC199s"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_C8815电信版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 10, "华为 C8815电信版", new String[] {"HUAWEI C8815 Build/HuaweiC8815"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
	    华为_C8818(	MobileBrand.HUAWEI, Mobile.HUAWEI, 11, "华为 C8818", new String[] {"HUAWEI C8818 Build/HuaweiC8818"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_CAZ_TL20(	MobileBrand.HUAWEI, Mobile.HUAWEI, 12, "华为 CAZ-TL20", new String[] {"HUAWEI CAZ-TL20 Build/HUAWEICAZ-TL20"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    华为_CRR_CL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 13, "华为 CRR-CL00", new String[] {"HUAWEI CRR-CL00 Build/HUAWEICRR-CL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_CRR_CL20(	MobileBrand.HUAWEI, Mobile.HUAWEI, 14, "华为 CRR-CL20", new String[] {"HUAWEI CRR-CL20 Build/HUAWEICRR-CL20"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_CRR_UL20(	MobileBrand.HUAWEI, Mobile.HUAWEI, 15, "华为 CRR-UL20", new String[] {"HUAWEI CRR-UL20 Build/HUAWEICRR-UL20"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_EH880(	MobileBrand.HUAWEI, Mobile.HUAWEI, 16, "华为 eH880", new String[] {"HUAWEI eH880 Build/HUAWEINXT-XD00"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    华为_G525_U00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 17, "华为 G525-U00", new String[] {"HUAWEI G525-U00 Build/JZO54K"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES540_960),
	    华为_G7_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 18, "华为 G7 Plus", new String[] {"HUAWEI RIO-UL00 Build/HUAWEIRIO-UL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_G7_PLUS_移动4G(	MobileBrand.HUAWEI, Mobile.HUAWEI, 19, "华为 G7 Plus(移动4G)", new String[] {"HUAWEI RIO-TL00 Build/HuaweiRIO-TL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_G750_T00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 20, "华为 G750-T00", new String[] {"HUAWEI G750-T00 Build/HuaweiG750-T00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_G750_T01(	MobileBrand.HUAWEI, Mobile.HUAWEI, 21, "华为 G750-T01", new String[] {"HUAWEI G750-T01 Build/HuaweiG750-T01"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_G9_YOUTH(	MobileBrand.HUAWEI, Mobile.HUAWEI, 22, "华为 G9 Youth", new String[] {"HUAWEI G9 Youth Build/HUAWEIVNS-DL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_G9青春版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 23, "华为 G9青春版", new String[] {"HUAWEI VNS-AL00 Build/HUAWEIVNS-AL00","HUAWEI VNS-TL00 Build/HUAWEIVNS-TL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_GRA_CL10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 24, "华为 GRA-CL10", new String[] {"HUAWEI GRA-CL10 Build/HUAWEIGRA-CL10"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_GRA_UL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 25, "华为 GRA-UL00", new String[] {"HUAWEI GRA-UL00 Build/HUAWEIGRA-UL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_HONOR(	MobileBrand.HUAWEI, Mobile.HUAWEI, 26, "华为 Honor", new String[] {"Honor Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1280_1920),
	    华为_HONOR_6(	MobileBrand.HUAWEI, Mobile.HUAWEI, 27, "华为 Honor 6", new String[] {"Honor 6 Build/KTU84Q"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1280_1920),
	    华为_HONOR_H30_L01M(	MobileBrand.HUAWEI, Mobile.HUAWEI, 28, "华为 荣耀3C", new String[] {"HONOR H30-L01M Build/HonorH30-L01M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_IVY_AL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 29, "华为 IVY-AL00", new String[] {"IVY-AL00 Build/HUAWEIIVY-AL00"}, null,null,null),
	    华为_M2_801W(	MobileBrand.HUAWEI, Mobile.HUAWEI, 30, "华为 M2-801W", new String[] {"HUAWEI M2-801W Build/HUAWEIM2-801W"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES1200_1920),
	    华为_M2_803L(	MobileBrand.HUAWEI, Mobile.HUAWEI, 31, "华为 M2-803L", new String[] {"HUAWEI M2-803L Build/HUAWEIM2-803L"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES1200_1920),
	    华为_M2平板电脑(	MobileBrand.HUAWEI, Mobile.HUAWEI, 32, "华为 M2平板电脑", new String[] {"HUAWEI M2-A01L Build/HUAWEIM2-A01L"}, null, ScreenSizeType.SCR10_1, ResolutionType.RES1200_1920),
	    华为_M3青春版_BAH_W09(	MobileBrand.HUAWEI, Mobile.HUAWEI, 33, "华为 M3青春版 BAH-W09", new String[] {"BAH-W09 Build/HUAWEIBAH-W09"}, null, ScreenSizeType.SCR10_1, ResolutionType.RES1200_1920),
	    华为_MATE_10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 34, "华为 Mate 10", new String[] {"ALP-AL00 Build/HUAWEIALP-AL00"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1440_2560),
	    华为_MATE_10_PRO(	MobileBrand.HUAWEI, Mobile.HUAWEI, 35, "华为 Mate 10 Pro", new String[] {"BLA-AL00 Build/HUAWEIBLA-AL00","BLA-L29 Build/HUAWEIBLA-L29"
	    		,"BLA-TL00 Build/HUAWEIBLA-TL00"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_2160),
	    华为_MATE_7(	MobileBrand.HUAWEI, Mobile.HUAWEI, 36, "华为 Mate 7", new String[] {"HUAWEI MT7-CL00 Build/HuaweiMT7-CL00","HUAWEI MT7-TL00 Build/HuaweiMT7-TL00"
	    		,"HUAWEI MT7-TL10 Build/HuaweiMT7-TL10"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    华为_MATE_8(	MobileBrand.HUAWEI, Mobile.HUAWEI, 37, "华为 Mate 8", new String[] {"HUAWEI NXT-AL10 Build/HUAWEINXT-AL10","HUAWEI NXT-DL00 Build/HUAWEINXT-DL00"
	    		,"HUAWEI NXT-TL00 Build/HUAWEINXT-TL00","NXT-TL00 Build/HUAWEINXT-TL00"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    华为_MATE_8电信4G版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 38, "华为 Mate 8电信4G版", new String[] {"HUAWEI NXT-CL00 Build/HUAWEINXT-CL00"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    华为_MATE_9(	MobileBrand.HUAWEI, Mobile.HUAWEI, 39, "华为 Mate 9", new String[] {"MHA-AL00 Build/HUAWEIMHA-AL00","LON-L29 Build/HUAWEILON-L29"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
	    华为_MATE_9_PRO(	MobileBrand.HUAWEI, Mobile.HUAWEI, 40, "华为 Mate 9 Pro", new String[] {"LON-AL00 Build/HUAWEILON-AL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    华为_MATE_S(	MobileBrand.HUAWEI, Mobile.HUAWEI, 41, "华为 Mate S", new String[] {"HUAWEI CRR-UL00 Build/HUAWEICRR-UL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_MATE10_RS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 42, "华为 Mate10 RS", new String[] {"NEO-AL00 Build/HUAWEINEO-AL00"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_2160),
	    华为_MATE9海外版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 43, "华为 Mate9海外版", new String[] {"MHA-L29 Build/HUAWEIMHA-L29"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
	    华为_MATE9全网通(	MobileBrand.HUAWEI, Mobile.HUAWEI, 44, "华为 Mate9全网通", new String[] {"MHA-TL00 Build/HUAWEIMHA-TL00"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
	    华为_MEDIAPAD_X2(	MobileBrand.HUAWEI, Mobile.HUAWEI, 45, "华为 Mediapad X2", new String[] {"GEM-702L Build/HUAWEIGEM-702L"}, null, ScreenSizeType.SCR7_0, ResolutionType.RES1200_1920),
	    华为_MLA_AL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 46, "华为 麦芒5", new String[] {"HUAWEI MLA-AL00 Build/HUAWEIMLA-AL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_MLA_TL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 47, "华为 G9 Plus", new String[] {"HUAWEI MLA-TL00 Build/HUAWEIMLA-TL00","HUAWEI MLA-TL10 Build/HUAWEIMLA-TL10"
	    		,"HUAWEI MLA-UL00 Build/HUAWEIMLA-UL00"},null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_MT1_U06(	MobileBrand.HUAWEI, Mobile.HUAWEI, 50, "华为 Mate", new String[] {"HUAWEI MT1-U06 Build/HuaweiMT1-U06"}, null, ScreenSizeType.SCR6_1, ResolutionType.RES720_1280),
	    华为_MT2_L01(	MobileBrand.HUAWEI, Mobile.HUAWEI, 51, "华为 Mate2", new String[] {"HUAWEI MT2-L01 Build/HuaweiMT2-L01"}, null, ScreenSizeType.SCR6_1, ResolutionType.RES720_1280),
	    华为_NOVA(	MobileBrand.HUAWEI, Mobile.HUAWEI, 52, "华为 nova", new String[] {"HUAWEI CAZ-AL10 Build/HUAWEICAZ-AL10","HUAWEI CAZ-TL10 Build/HUAWEICAZ-TL10"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    华为_NOVA_2(	MobileBrand.HUAWEI, Mobile.HUAWEI, 53, "华为 nova 2", new String[] {"PIC-TL00 Build/HUAWEIPIC-TL00","PIC-AL00 Build/HUAWEIPIC-AL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    华为_NOVA_2_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 54, "华为 nova 2 Plus", new String[] {"BAC-AL00 Build/HUAWEIBAC-AL00","BAC-TL00 Build/HUAWEIBAC-TL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_NOVA_2S(	MobileBrand.HUAWEI, Mobile.HUAWEI, 55, "华为 nova 2s", new String[] {"HWI-TL00 Build/HUAWEIHWI-TL00","HWI-AL00 Build/HUAWEIHWI-AL00"}, null, ScreenSizeType.SCR5_93, ResolutionType.RES1080_2160),
	    华为_NOVA_3(	MobileBrand.HUAWEI, Mobile.HUAWEI, 56, "华为 nova 3", new String[] {"PAR-AL00 Build/HUAWEIPAR-AL00"}, null, ScreenSizeType.SCR6_3, ResolutionType.RES1080_2340),
	    华为_NOVA3I(	MobileBrand.HUAWEI, Mobile.HUAWEI, 57, "华为 nova 3i", new String[] {"INE-AL00 Build/HUAWEIINE-AL00"}, null, ScreenSizeType.SCR6_3, ResolutionType.RES1080_2340),
	    华为_NOVA青春版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 58, "华为 nova青春版", new String[] {"WAS-TL10 Build/HUAWEIWAS-TL10","WAS-AL00 Build/HUAWEIWAS-AL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_P10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 59, "华为 P10", new String[] {"VTR-AL00 Build/HUAWEIVTR- AL00","VTR-AL00 Build/HUAWEIVTR-AL00"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1080_1920),
	    华为_P10_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 60, "华为 P10 Plus", new String[] {"VKY-TL00 Build/HUAWEIVKY-TL00","VKY-AL00 Build/HUAWEIVKY-AL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    华为_P10移动版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 61, "华为 P10移动版", new String[] {"VTR-TL00 Build/HUAWEIVTR-TL00"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1080_1920),
	    华为_P20(	MobileBrand.HUAWEI, Mobile.HUAWEI, 63, "华为 P20", new String[] {"EML-AL00 Build/HUAWEIEML-AL00","EML-TL00 Build/HUAWEIEML-TL00"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES1080_2240),
	    华为_P20_PRO(	MobileBrand.HUAWEI, Mobile.HUAWEI, 64, "华为 P20 pro", new String[] {"CLT-AL01 Build/HUAWEICLT-AL01","CLT-TL00 Build/HUAWEICLT-TL00"
	    		,"CLT-TL01 Build/HUAWEICLT-TL01","CLT-AL00 Build/HUAWEICLT-AL00"}, null, ScreenSizeType.SCR6_1, ResolutionType.RES1080_2240),
	    华为_P6_C00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 65, "华为 P6-C00", new String[] {"HUAWEI P6-C00 Build/HuaweiP6-C00"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    华为_P7_L00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 66, "华为 P7-L00", new String[] {"HUAWEI P7-L00 Build/HuaweiP7-L00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    华为_P7移动定制版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 67, "华为 P7移动定制版", new String[] {"HUAWEI P7-L07 Build/HuaweiP7-L07"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    华为_P8(	MobileBrand.HUAWEI, Mobile.HUAWEI, 68, "华为 P8", new String[] {"P8 Build/KTU84P","HUAWEI GRA-TL00 Build/HUAWEIGRA-TL00",
	    		"HUAWEI GRA-UL10 Build/HUAWEIGRA-UL10"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_P8MAX(	MobileBrand.HUAWEI, Mobile.HUAWEI, 69, "华为 P8max", new String[] {"HUAWEI P8max Build/HUAWEIDAV-703L"}, null, ScreenSizeType.SCR6_8, ResolutionType.RES1080_1920),
	    华为_P8电信版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 70, "华为 P8电信版", new String[] {"HUAWEI GRA-CL00 Build/HUAWEIGRA-CL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_P8移动4G青春版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 71, "华为 P8移动4G青春版", new String[] {"ALE-TL00 Build/HuaweiALE-TL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_P9(	MobileBrand.HUAWEI, Mobile.HUAWEI, 72, "华为 P9", new String[] {"EVA-CL00 Build/HUAWEIEVA-CL00","EVA-AL10 Build/HUAWEIEVA-AL10"
	    		,"EVA-DL00 Build/HUAWEIEVA-DL00","EVA-TL00 Build/HUAWEIEVA-TL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_P9_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 73, "华为 P9 Plus", new String[] {"VIE-L29 Build/HUAWEIVIE-L29","HUAWEI VIE-AL10 Build/HUAWEIVIE-AL10"
	    		,"VIE-AL10 Build/HUAWEIVIE-AL10"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_P9_全网通(	MobileBrand.HUAWEI, Mobile.HUAWEI, 74, "华为 P9（全网通）", new String[] {"EVA-AL00 Build/HUAWEIEVA-AL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_P9海外版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 75, "华为 P9海外版", new String[] {"EVA-L19 Build/HUAWEIEVA-L19"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_RIO_CL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 76, "华为 RIO-CL00", new String[] {"HUAWEI RIO-CL00 Build/HuaweiRIO-CL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_SC_UL10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 77, "华为 SC-UL10", new String[] {"HUAWEI SC-UL10 Build/HUAWEISC-UL10"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES720_1280),
	    华为_TAG_L22(	MobileBrand.HUAWEI, Mobile.HUAWEI, 78, "华为 TAG-L22", new String[] {"HUAWEI TAG-L22 Build/HUAWEITAG-L22"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_U8800(	MobileBrand.HUAWEI, Mobile.HUAWEI, 79, "华为 U8800", new String[] {"U8800 Build/HuaweiU8800"}, null, ScreenSizeType.SCR3_8, ResolutionType.RES480_800),
	    华为_VNS_DL00(	MobileBrand.HUAWEI, Mobile.HUAWEI, 80, "华为 VNS-DL00", new String[] {"HUAWEI VNS-DL00 Build/HUAWEIVNS-DL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_畅享5(	MobileBrand.HUAWEI, Mobile.HUAWEI, 81, "华为 畅享5", new String[] {"HUAWEI TIT-TL00 Build/HUAWEITIT-TL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享5S(	MobileBrand.HUAWEI, Mobile.HUAWEI, 82, "华为 畅享5S", new String[] {"HUAWEI TAG-AL00 Build/HUAWEITAG-AL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享5S移动4G(	MobileBrand.HUAWEI, Mobile.HUAWEI, 83, "华为 畅享5S移动4G", new String[] {"HUAWEI TAG-TL00 Build/HUAWEITAG-TL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享5全网通版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 84, "华为 畅享5全网通版", new String[] {"HUAWEI TIT-AL00 Build/HUAWEITIT-AL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享6S(	MobileBrand.HUAWEI, Mobile.HUAWEI, 85, "华为 畅享6s", new String[] {"DIG-AL00 Build/HUAWEIDIG-AL00","DIG-TL10 Build/HUAWEIDIG-TL10"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享7(	MobileBrand.HUAWEI, Mobile.HUAWEI, 86, "华为 畅享7", new String[] {"SLA-AL00 Build/HUAWEISLA-AL00","SLA-TL10 Build/HUAWEISLA-TL10"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享7_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 87, "华为 畅享7 Plus", new String[] {"TRT-AL00 Build/HUAWEITRT-AL00","TRT-AL00A Build/HUAWEITRT-AL00A"
	    		,"TRT-TL10 Build/HUAWEITRT-TL10","TRT-TL10A Build/HUAWEITRT-TL10A"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_畅享7S(	MobileBrand.HUAWEI, Mobile.HUAWEI, 88, "华为 畅享7S", new String[] {"FIG-AL00 Build/HUAWEIFIG-AL00","FIG-TL10 Build/HUAWEIFIG-TL10"
	    		,"FIG-AL10 Build/HUAWEIFIG-AL10"}, null, ScreenSizeType.SCR5_65, ResolutionType.RES1080_2160),
	    华为_畅享8(	MobileBrand.HUAWEI, Mobile.HUAWEI, 89, "华为 畅享8", new String[] {"LDN-AL00 Build/HUAWEILDN-AL00","LDN-AL20 Build/HUAWEILDN-AL20"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
	    华为_畅享8_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 90, "华为 畅享8 plus", new String[] {"FLA-AL10 Build/HUAWEIFLA-AL10","FLA-AL20 Build/HUAWEIFLA-AL20"
	    		,"FLA-TL10 Build/HUAWEIFLA-TL10"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
	    华为_揽阅M2青春版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 91, "华为 揽阅M2青春版", new String[] {"PLE-703L Build/HuaweiMediaPad"}, null, ScreenSizeType.SCR7_0, ResolutionType.RES1200_1920),
	    华为_麦芒2(	MobileBrand.HUAWEI, Mobile.HUAWEI, 92, "华为 麦芒2", new String[] {"HUAWEI B199 Build/HuaweiB199"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_麦芒4(	MobileBrand.HUAWEI, Mobile.HUAWEI, 93, "华为 麦芒4", new String[] {"HUAWEI RIO-AL00 Build/HuaweiRIO-AL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_麦芒5(	MobileBrand.HUAWEI, Mobile.HUAWEI, 94, "华为 麦芒5", new String[] {"HUAWEI MLA-AL10 Build/HUAWEIMLA-AL10"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_麦芒6(	MobileBrand.HUAWEI, Mobile.HUAWEI, 95, "华为 麦芒6", new String[] {"RNE-AL00 Build/HUAWEIRNE-AL00"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_2160),
	    华为_平板M3(	MobileBrand.HUAWEI, Mobile.HUAWEI, 96, "华为 平板M3", new String[] {"BTV-DL09 Build/HUAWEIBEETHOVEN-DL09","BTV-W09 Build/HUAWEIBEETHOVEN-W09"}, null, ScreenSizeType.SCR8_4, ResolutionType.RES1600_2560),
	    华为_平板M5(	MobileBrand.HUAWEI, Mobile.HUAWEI, 97, "华为 平板M5", new String[] {"CPN-AL00 Build/HUAWEICPN-AL00"}, null, ScreenSizeType.SCR8_4, ResolutionType.RES1600_2560),
	    华为_平板T2(	MobileBrand.HUAWEI, Mobile.HUAWEI, 98, "华为 平板T2", new String[] {"JDN-AL00 Build/HuaweiMediaPad","JDN-W09 Build/HuaweiMediaPad"}, null, ScreenSizeType.SCR9_6, ResolutionType.RES800_1280),
	    华为_荣耀10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 99, "华为 荣耀10", new String[] {"COL-AL10 Build/HUAWEICOL-AL10","COL-TL10 Build/HUAWEICOL-TL10"}, null, ScreenSizeType.SCR5_84, ResolutionType.RES1080_2280),
	    华为_荣耀3C(	MobileBrand.HUAWEI, Mobile.HUAWEI, 100, "华为 荣耀3C", new String[] {"HONOR H30-L01 Build/HonorH30-L01"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀3C移动3G版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 101, "华为 荣耀3C移动3G版", new String[] {"H30-T10 Build/HuaweiH30-T10"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀3X_畅玩版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 102, "华为 荣耀3X 畅玩版", new String[] {"G750-T01 Build/HuaweiG750-T01"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀4A(	MobileBrand.HUAWEI, Mobile.HUAWEI, 103, "华为 荣耀4A", new String[] {"SCL-AL00 Build/HonorSCL-AL00","SCL-CL00 Build/HonorSCL-CL00"
	    		,"SCL-TL00H Build/HonorSCL-TL00H","SCL-TL00 Build/HonorSCL-TL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀6(	MobileBrand.HUAWEI, Mobile.HUAWEI, 104, "华为 荣耀6", new String[] {"H60-L01 Build/HDH60-L01","H60-L02 Build/HDH60-L02",
	    		"H60-L11 Build/HDH60-L11"}, null, ScreenSizeType.SCR5_84, ResolutionType.RES1080_2280),
	    华为_荣耀6_PLUS(	MobileBrand.HUAWEI, Mobile.HUAWEI, 105, "华为 荣耀6 Plus", new String[] {"PE-TL10 Build/HuaweiPE-TL10","PE-TL20 Build/HuaweiPE-TL20"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀6_PLUS_PE(	MobileBrand.HUAWEI, Mobile.HUAWEI, 106, "华为 荣耀6 Plus PE", new String[] {"PE-CL00 Build/HuaweiPE-CL00","PE-UL00 Build/HuaweiPE-UL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀6_PLUS移动定制版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 107, "华为 荣耀6 Plus移动定制版", new String[] {"PE-TL00M Build/HuaweiPE-TL00M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀6X全网通高配版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 108, "华为 荣耀6X全网通高配版", new String[] {"BLN-AL20 Build/HONORBLN-AL20"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀6X移动版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 109, "华为 荣耀6X移动版", new String[] {"BLN-TL10 Build/HONORBLN-TL10"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀6高配版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 110, "华为 荣耀6高配版", new String[] {"H60-L12 Build/HDH60-L12"}, null, ScreenSizeType.SCR5_84, ResolutionType.RES1080_2280),
	    华为_荣耀6移动版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 111, "华为 荣耀6移动版", new String[] {"H60-L03 Build/HDH60-L03"}, null, ScreenSizeType.SCR5_84, ResolutionType.RES1080_2280),
	    华为_荣耀7(	MobileBrand.HUAWEI, Mobile.HUAWEI, 112, "华为 荣耀7", new String[] {"PLK-CL00 Build/HONORPLK-CL00","PLK-TL00 Build/HONORPLK-TL00"
	    		,"PLK-AL10 Build/HONORPLK-AL10","PLK-TL01H Build/HONORPLK-TL01H","PLK-UL00 Build/HONORPLK-UL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀7I(	MobileBrand.HUAWEI, Mobile.HUAWEI, 113, "华为 荣耀7i", new String[] {"ATH-AL00 Build/HONORATH-AL00","ATH-CL00 Build/HONORATH-CL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀7I_ATH_TL00H(	MobileBrand.HUAWEI, Mobile.HUAWEI, 114, "华为 荣耀7i ATH-TL00H", new String[] {"ATH-TL00H Build/HONORATH-TL00H"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀7X全网通版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 115, "华为 荣耀7X全网通版", new String[] {"BND-AL10 Build/HONORBND-AL10"}, null, ScreenSizeType.SCR5_93, ResolutionType.RES1080_2160),
	    华为_荣耀7X全网通高配版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 116, "华为 荣耀7X全网通高配版", new String[] {"BND-AL00 Build/HONORBND-AL00"}, null, ScreenSizeType.SCR5_93, ResolutionType.RES1080_2160),
	    华为_荣耀7X移动版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 117, "华为 荣耀7X移动版", new String[] {"BND-TL10 Build/HONORBND-TL10"}, null, ScreenSizeType.SCR5_93, ResolutionType.RES1080_2160),
	    华为_荣耀8(	MobileBrand.HUAWEI, Mobile.HUAWEI, 118, "华为 荣耀8", new String[] {"FRD-AL00 Build/HUAWEIFRD-AL00","FRD-DL00 Build/HUAWEIFRD-DL00"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀8X(	MobileBrand.HUAWEI, Mobile.HUAWEI, 119, "华为 荣耀8X", new String[] {"JSN-AL00 Build/HONORJSN-AL00"}, null, ScreenSizeType.SCR6_5, ResolutionType.RES1080_2340),
	    华为_荣耀8高配版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 120, "华为 荣耀8高配版", new String[] {"FRD-AL10 Build/HUAWEIFRD-AL10"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀8青春版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 121, "华为 荣耀8青春版", new String[] {"PRA-TL10 Build/HONORPRA-TL10","PRA-AL00 Build/HONORPRA-AL00"
	    		,"PRA-AL00X Build/HONORPRA-AL00X"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀9(	MobileBrand.HUAWEI, Mobile.HUAWEI, 122, "华为 荣耀9", new String[] {"STF-AL00 Build/HUAWEISTF-AL00","STF-AL10 Build/HUAWEISTF-AL10"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀9I(	MobileBrand.HUAWEI, Mobile.HUAWEI, 123, "华为 荣耀9i", new String[] {"LLD-AL20 Build/HONORLLD-AL20"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
	    华为_荣耀9I尊享版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 124, "华为 荣耀9i尊享版", new String[] {"LLD-AL30 Build/HONORLLD-AL30"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
	    华为_荣耀9青春版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 125, "华为 荣耀9青春版", new String[] {"LLD-AL00 Build/HONORLLD-AL00","LLD-AL10 Build/HONORLLD-AL10"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀MAGIC(	MobileBrand.HUAWEI, Mobile.HUAWEI, 126, "华为 荣耀Magic", new String[] {"NTS-AL00 Build/HUAWEINTS-AL00"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1440_2560),
	    华为_荣耀NOTE8(	MobileBrand.HUAWEI, Mobile.HUAWEI, 127, "华为 荣耀Note8", new String[] {"EDI-AL10 Build/HUAWEIEDISON-AL10"}, null, ScreenSizeType.SCR6_6, ResolutionType.RES1440_2560),
	    华为_荣耀PLAY(	MobileBrand.HUAWEI, Mobile.HUAWEI, 128, "华为 荣耀Play", new String[] {"COR-AL00 Build/HUAWEICOR-AL00","COR-AL10 Build/HUAWEICOR-AL10"}, null, ScreenSizeType.SCR6_3, ResolutionType.RES1080_2340),
	    华为_荣耀V10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 129, "华为 荣耀V10", new String[] {"BKL-AL20 Build/HUAWEIBKL-AL20"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    华为_荣耀V10_BKL_TL10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 130, "华为 荣耀V10 BKL-TL10", new String[] {"BKL-TL10 Build/HUAWEIBKL-TL10"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    华为_荣耀V10_全网通标配版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 131, "华为 荣耀V10 全网通标配版", new String[] {"BKL-AL00 Build/HUAWEIBKL-AL00"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    华为_荣耀V8(	MobileBrand.HUAWEI, Mobile.HUAWEI, 132, "华为 荣耀V8", new String[] {"KNT-AL10 Build/HUAWEIKNT-AL10","KNT-TL10 Build/HUAWEIKNT-TL10"
	    		,"V8 Build/LMY47D","KNT-AL20 Build/HUAWEIKNT-AL20"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    华为_荣耀V8全网通(	MobileBrand.HUAWEI, Mobile.HUAWEI, 133, "华为 荣耀v8全网通", new String[] {"KNT-UL10 Build/HUAWEIKNT-UL10"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    华为_荣耀V9(	MobileBrand.HUAWEI, Mobile.HUAWEI, 134, "华为 荣耀v9", new String[] {"DUK-TL30 Build/HUAWEIDUK-TL30","DUK-AL20 Build/HUAWEIDUK-AL20"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    华为_荣耀V9PLAY(	MobileBrand.HUAWEI, Mobile.HUAWEI, 135, "华为 荣耀v9play", new String[] {"JMM-AL00 Build/HONORJMM-AL00","JMM-AL10 Build/HONORJMM-AL10"
	    		,"JMM-TL10 Build/HONORJMM-TL10"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    华为_荣耀X2(	MobileBrand.HUAWEI, Mobile.HUAWEI, 136, "华为 荣耀X2", new String[] {"GEM-703L Build/HUAWEIGEM-703L","GEM-703LT Build/HUAWEIGEM-703LT"}, null, ScreenSizeType.SCR7_0, ResolutionType.RES1200_1920),
	    华为_荣耀畅玩4(	MobileBrand.HUAWEI, Mobile.HUAWEI, 137, "华为 荣耀畅玩4", new String[] {"C8817D Build/HuaweiC8817D","G621-TL00 Build/HonorG621-TL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4C(	MobileBrand.HUAWEI, Mobile.HUAWEI, 138, "华为 荣耀畅玩4C", new String[] {"CHM-CL00 Build/CHM-CL00","CHM-TL00 Build/HonorCHM-TL00"
	    		,"CHM-TL00H Build/HonorCHM-TL00H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4C标准版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 139, "华为 荣耀畅玩4C标准版", new String[] {"CHM-UL00 Build/HonorCHM-UL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4X(	MobileBrand.HUAWEI, Mobile.HUAWEI, 140, "华为 荣耀畅玩4X", new String[] {"Che2-TL00 Build/HonorChe2-TL00","Che2-TL00M Build/HonorChe2-TL00M",
	    		"CHE-TL00H Build/HonorCHE-TL00H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4X电信版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 141, "华为 荣耀畅玩4X电信版", new String[] {"Che1-CL10 Build/Che1-CL10"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4X联通版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 142, "华为 荣耀畅玩4X联通版", new String[] {"Che2-UL00 Build/HonorChe2-UL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4X全网通(	MobileBrand.HUAWEI, Mobile.HUAWEI, 143, "华为 荣耀畅玩4X全网通", new String[] {"Che1-CL20 Build/Che1-CL20"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩4X移动版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 144, "华为 荣耀畅玩4X移动版", new String[] {"CHE-TL00 Build/HonorCHE-TL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩5(	MobileBrand.HUAWEI, Mobile.HUAWEI, 145, "华为 荣耀畅玩5", new String[] {"CUN-AL00 Build/HUAWEICUN-AL00","CUN-TL00 Build/HUAWEICUN-TL00"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩5A(	MobileBrand.HUAWEI, Mobile.HUAWEI, 146, "华为 荣耀畅玩5A", new String[] {"CAM-AL00 Build/HONORCAM-AL00","CAM-TL00 Build/HONORCAM-TL00"
	    		,"CAM-TL10H Build/HONORCAM-TL00H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩5A双4G版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 147, "华为 荣耀畅玩5A双4G版", new String[] {"CAM-UL00 Build/HONORCAM-UL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩5A移动版(	MobileBrand.HUAWEI, Mobile.HUAWEI, 148, "华为 荣耀畅玩5A移动版", new String[] {"CAM-TL00H Build/HONORCAM-TL00H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    华为_荣耀畅玩5C(	MobileBrand.HUAWEI, Mobile.HUAWEI, 149, "华为 荣耀畅玩5C", new String[] {"NEM-TL00 Build/HONORNEM-TL00","NEM-UL10 Build/HONORNEM-UL10",
	    		"NEM-AL10 Build/HONORNEM-AL10","NEM-TL00H Build/HONORNEM-TL00H"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    华为_荣耀畅玩5X(	MobileBrand.HUAWEI, Mobile.HUAWEI, 150, "华为 荣耀畅玩5X", new String[] {"KIW-TL00 Build/HONORKIW-TL00","KIW-UL00 Build/HONORKIW-UL00"
	    		,"KIW-AL10 Build/HONORKIW-AL10","KIW-TL00H Build/HONORKIW-TL00H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀畅玩5X电信4G(	MobileBrand.HUAWEI, Mobile.HUAWEI, 151, "华为 荣耀畅玩5X电信4G", new String[] {"KIW-CL00 Build/HONORKIW-CL00"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀畅玩6(	MobileBrand.HUAWEI, Mobile.HUAWEI, 152, "华为 荣耀畅玩6", new String[] {"MYA-AL10 Build/HONORMYA-AL10"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩6A(	MobileBrand.HUAWEI, Mobile.HUAWEI, 153, "华为 荣耀畅玩6A", new String[] {"DLI-AL10 Build/HONORDLI-AL10","DLI-TL20 Build/HONORDLI-TL20"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀畅玩6X(	MobileBrand.HUAWEI, Mobile.HUAWEI, 154, "华为 荣耀畅玩6X", new String[] {"BLN-AL10 Build/HONORBLN-AL10","BLN-AL30 Build/HONORBLN-AL30"
	    		,"BLN-AL40 Build/HONORBLN-AL40"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    华为_荣耀畅玩7(	MobileBrand.HUAWEI, Mobile.HUAWEI, 155, "华为 荣耀畅玩7", new String[] {"DUA-AL00 Build/HONORDUA-AL00"}, null, ScreenSizeType.SCR5_45, ResolutionType.RES720_1440),
	    华为_荣耀畅玩7A_AUM_AL20(	MobileBrand.HUAWEI, Mobile.HUAWEI, 156, "华为 荣耀畅玩7A AUM-AL20", new String[] {"AUM-AL20 Build/HONORAUM-AL20"}, null, ScreenSizeType.SCR5_45, ResolutionType.RES720_1440),
	    华为_荣耀畅玩7C(	MobileBrand.HUAWEI, Mobile.HUAWEI, 157, "华为 荣耀畅玩7C", new String[] {"LND-AL30 Build/HONORLND-AL30","LND-AL40 Build/HONORLND-AL40"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES720_1440),
	    华为_荣耀畅享6(	MobileBrand.HUAWEI, Mobile.HUAWEI, 158, "华为 荣耀畅享6", new String[] {"NCE-AL00 Build/HUAWEINCE-AL00","NCE-AL10 Build/HUAWEINCE-AL10"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    华为_荣耀平板T1_823L(	MobileBrand.HUAWEI, Mobile.HUAWEI, 159, "华为 荣耀平板T1-823L", new String[] {"T1-823L Build/HuaweiMediaPad"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES800_1280),
	    华为_荣耀平板T1_A23L(	MobileBrand.HUAWEI, Mobile.HUAWEI, 160, "华为 荣耀平板T1-A23L?", new String[] {"T1-A23L Build/HuaweiMediaPad"}, null, ScreenSizeType.SCR9_6, ResolutionType.RES800_1280),
	    华为_手机畅享8E_ATU_AL10(	MobileBrand.HUAWEI, Mobile.HUAWEI, 161, "华为 手机畅享8e ATU-AL10", new String[] {"ATU-AL10 Build/HUAWEIATU-AL10"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
	    
	    
	    GIONEE(	MobileBrand.GIONEE, null, 1, "金立", new String[] {"GIONEE","F100 Build/LMY47D","F100A Build/LMY47D","F100L Build/MRA58K",
	    		"F100S Build/MRA58K","F103 Build/LRX21M","F105 Build/LMY47D","F106 Build/MRA58K","F303 Build/LRX21M",
	    		"GN3003 Build/LMY47D","GN3003L Build/LMY47D","GN5001S Build/LMY47D","GN5003 Build/MRA58K","GN8001 Build/LMY47D","GN8002 Build/MRA58K",
	    		"GN9005 Build/JLS36C","GN9006 Build/LRX21M","GN9008 Build/945650d962f5","GN9010 Build/LMY47D","GN9012 Build/MRA58K",
	    		"M2017 Build/MMB29M","GN8003 Build/MRA58K","GN8002S Build/MRA58K","M6SPlus Build/MMB29M","GN5005 Build/MRA58K",
	    		"GN3001 Build/LMY47I","GN9007 Build/32fa737013da","GN9007 Build/LMY47D","GN9011 Build/MRA58K","V183 Build/KTU84P",
	    		"W909 Build/LMY47I","GN5001 Build/LMY47D","W900S Build/b590f1600539"}, null, null, null),
	    金立_F100(	MobileBrand.GIONEE, Mobile.GIONEE, 1, "金立 F100", new String[] {"F100 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F100A(	MobileBrand.GIONEE, Mobile.GIONEE, 2, "金立 F100A", new String[] {"F100A Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F100L(	MobileBrand.GIONEE, Mobile.GIONEE, 3, "金立 F100L", new String[] {"F100L Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F100S(	MobileBrand.GIONEE, Mobile.GIONEE, 4, "金立 F100S", new String[] {"F100S Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F103(	MobileBrand.GIONEE, Mobile.GIONEE, 5, "金立 F103", new String[] {"F103 Build/LRX21M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F105(	MobileBrand.GIONEE, Mobile.GIONEE, 6, "金立 F105", new String[] {"F105 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F106(	MobileBrand.GIONEE, Mobile.GIONEE, 7, "金立 F106", new String[] {"F106 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_F303(	MobileBrand.GIONEE, Mobile.GIONEE, 8, "金立 F303", new String[] {"F303 Build/LRX21M"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    金立_GIONEE_M7(	MobileBrand.GIONEE, Mobile.GIONEE, 9, "金立 GIONEE M7", new String[] {"GIONEE M7 Build/N6F26Q"}, null, ScreenSizeType.SCR6_01, ResolutionType.RES1080_2160),
	    金立_GIONEE_M7L(	MobileBrand.GIONEE, Mobile.GIONEE, 10, "金立 GIONEE M7L", new String[] {"GIONEE M7L Build/N6F26Q"}, null, ScreenSizeType.SCR6_01, ResolutionType.RES1080_2160),
	    金立_GIONEE_S10(	MobileBrand.GIONEE, Mobile.GIONEE, 11, "金立 GIONEE S10", new String[] {"GIONEE S10 Build/NRD90M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    金立_GIONEE_S10B(	MobileBrand.GIONEE, Mobile.GIONEE, 12, "金立 GIONEE S10B", new String[] {"GIONEE S10B Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    金立_GIONEE_S10BL(	MobileBrand.GIONEE, Mobile.GIONEE, 13, "金立 GIONEE S10BL", new String[] {"GIONEE S10BL Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    金立_GIONEE_S10CL(	MobileBrand.GIONEE, Mobile.GIONEE, 14, "金立 GIONEE S10CL", new String[] {"GIONEE S10CL Build/NMF26F"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    金立_GIONEE_S10L(	MobileBrand.GIONEE, Mobile.GIONEE, 15, "金立 GIONEE S10L", new String[] {"GIONEE S10L Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    金立_GN3003(	MobileBrand.GIONEE, Mobile.GIONEE, 16, "金立 GN3003", new String[] {"GN3003 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_GN3003L(	MobileBrand.GIONEE, Mobile.GIONEE, 17, "金立 GN3003L", new String[] {"GN3003L Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_GN5001S(	MobileBrand.GIONEE, Mobile.GIONEE, 18, "金立 GN5001S", new String[] {"GN5001S Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_GN5003(	MobileBrand.GIONEE, Mobile.GIONEE, 19, "金立 GN5003", new String[] {"GN5003 Build/MRA58K"}, null, ScreenSizeType.SCR5_3, ResolutionType.RES720_1280),
	    金立_GN8001(	MobileBrand.GIONEE, Mobile.GIONEE, 20, "金立 GN8001", new String[] {"GN8001 Build/LMY47D"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    金立_GN8002(	MobileBrand.GIONEE, Mobile.GIONEE, 21, "金立 GN8002", new String[] {"GN8002 Build/MRA58K"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    金立_GN9005(	MobileBrand.GIONEE, Mobile.GIONEE, 22, "金立 GN9005", new String[] {"GN9005 Build/JLS36C"}, null, ScreenSizeType.SCR4_8, ResolutionType.RES720_1280),
	    金立_GN9006(	MobileBrand.GIONEE, Mobile.GIONEE, 23, "金立 GN9006", new String[] {"GN9006 Build/LRX21M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    金立_GN9008(	MobileBrand.GIONEE, Mobile.GIONEE, 24, "金立 GN9008", new String[] {"GN9008 Build/945650d962f5"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1440_2560),
	    金立_GN9010(	MobileBrand.GIONEE, Mobile.GIONEE, 25, "金立 GN9010", new String[] {"GN9010 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    金立_GN9012(	MobileBrand.GIONEE, Mobile.GIONEE, 26, "金立 GN9012", new String[] {"GN9012 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    金立_M2017(	MobileBrand.GIONEE, Mobile.GIONEE, 27, "金立 M2017", new String[] {"M2017 Build/MMB29M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    金立_M6(	MobileBrand.GIONEE, Mobile.GIONEE, 28, "金立 M6", new String[] {"GN8003 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    金立_M6_PLUS(	MobileBrand.GIONEE, Mobile.GIONEE, 29, "金立 M6 Plus", new String[] {"GN8002S Build/MRA58K"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    金立_M6S_PLUS(	MobileBrand.GIONEE, Mobile.GIONEE, 30, "金立 M6S Plus", new String[] {"M6SPlus Build/MMB29M"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    金立_N5005(	MobileBrand.GIONEE, Mobile.GIONEE, 31, "金立 N5005", new String[] {"GN5005 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_S5_GN3001(	MobileBrand.GIONEE, Mobile.GIONEE, 32, "金立 S5 GN3001", new String[] {"GN3001 Build/LMY47I"}, null, ScreenSizeType.SCR5_3, ResolutionType.RES720_1280),
	    金立_S51_PRO(	MobileBrand.GIONEE, Mobile.GIONEE, 33, "金立 S5.1 Pro", new String[] {"GN9007 Build/32fa737013da","GN9007 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    金立_S8(	MobileBrand.GIONEE, Mobile.GIONEE, 34, "金立 S8", new String[] {"GN9011 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    金立_V183(	MobileBrand.GIONEE, Mobile.GIONEE, 35, "金立 V183", new String[] {"V183 Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES480_854),
	    金立_W909(	MobileBrand.GIONEE, Mobile.GIONEE, 36, "金立 W909", new String[] {"W909 Build/LMY47I"}, null, ScreenSizeType.SCR4_2, ResolutionType.RES720_1280),
	    金立_金钢(	MobileBrand.GIONEE, Mobile.GIONEE, 37, "金立 金钢", new String[] {"GN5001 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    金立_天鉴_W900S(	MobileBrand.GIONEE, Mobile.GIONEE, 37, "金立 天鉴 W900S", new String[] {"W900S Build/b590f1600539"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_800),
	    
	    KOOBEE(	MobileBrand.KOOBEE, null, 1000, "酷比", new String[] {"koobee"}, null, null, null),
	    酷比_M9(	MobileBrand.KOOBEE, Mobile.KOOBEE, 1, "酷比 M9", new String[] {"koobee M9 Build/MRA58K"}, null, ScreenSizeType.SCR5_9, ResolutionType.RES1080_1920),
	    酷比_S11(	MobileBrand.KOOBEE, Mobile.KOOBEE, 2, "酷比 S11", new String[] {"koobee S11 Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    
	    COOLPAD(	MobileBrand.COOLPAD, null, 1000, "酷派", new String[] {"Coolpad 5270 Build/LMY47D","Coolpad 5952 Build/JLS36C",
	    		"Coolpad 7268 Build/JZO54K","Coolpad 7722 Build/LMY47D","Coolpad 8297 Build/JDQ39","Coolpad 8297-T01 Build/KTU84P",
	    		"8298-M02 Build/LMY47D","Coolpad 8675-A Build/KTU84P","Coolpad 8675-FHD Build/KTU84P","8676-A01 Build/LMY47D",
	    		"8681-A01 Build/LMY47D","8681-M02 Build/LMY47D","8692-A00 Build/LMY47V","8692-M02 Build/LMY47V",
	    		"Coolpad 8721 Build/KTU84P","Coolpad 8729 Build/JLS36C","Coolpad 8737 Build/MRA58K","Coolpad 8737A Build/MMB29M",
	    		"Coolpad 9190_T00 Build/JLS36C","Coolpad 9190L Build/JLS36C","Coolpad 9976D Build/KOT49H",
	    		"Coolpad A8-930 Build/LMY47V","C105-6 Build/VCXCNCT5806212191S","C105-8 Build/VDXCNCM5810105230S",
	    		"C106-6 Build/ZOXCNFN5801710251S","C106-6 Build/ZOXCNFN5902606201S","C106-9 Build/ZCXCNCT5801712291S",
	    		"C106-9 Build/ZCXCNCT5902606201S","C107-9 Build/ZFXCNCT5902606201S","C106 Build/ZAXCNFN5902606201S",
	    		"dazen X7 Build/KTU84P","CK3-01 Build/LMY47D","Coolpad Y75 Build/KTU84P","Coolpad 8297W Build/KOT49H",
	    		"Coolpad 8675 Build/KOT49H","Coolpad Y82-520 Build/KTU84P","Coolpad Y803-9 Build/LMY47D",
	    		"Coolpad Y90 Build/KTU84P","VCR-A0 Build/VCRSCN00X1000MPX1706220"}, null, null, null),
	    酷派_5270(	MobileBrand.COOLPAD, Mobile.COOLPAD, 1, "酷派 5270", new String[] {"Coolpad 5270 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES480_854),
	    酷派_5952(	MobileBrand.COOLPAD, Mobile.COOLPAD, 2, "酷派 5952", new String[] {"Coolpad 5952 Build/JLS36C"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_7268(	MobileBrand.COOLPAD, Mobile.COOLPAD, 3, "酷派 7268", new String[] {"Coolpad 7268 Build/JZO54K"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES540_960),
	    酷派_7722(	MobileBrand.COOLPAD, Mobile.COOLPAD, 4, "酷派 7722", new String[] {"Coolpad 7722 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_8297(	MobileBrand.COOLPAD, Mobile.COOLPAD, 5, "酷派 8297", new String[] {"Coolpad 8297 Build/JDQ39"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_8297_T01(	MobileBrand.COOLPAD, Mobile.COOLPAD, 6, "酷派 8297-T01", new String[] {"Coolpad 8297-T01 Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_8298_M02(	MobileBrand.COOLPAD, Mobile.COOLPAD, 7, "酷派 8298-M02", new String[] {"8298-M02 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_8675_A(	MobileBrand.COOLPAD, Mobile.COOLPAD, 8, "酷派 8675-A", new String[] {"Coolpad 8675-A Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_8675_FHD(	MobileBrand.COOLPAD, Mobile.COOLPAD, 9, "酷派 8675-FHD", new String[] {"Coolpad 8675-FHD Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_8676_A01(	MobileBrand.COOLPAD, Mobile.COOLPAD, 10, "酷派 8676-A01", new String[] {"8676-A01 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_8681_A01(	MobileBrand.COOLPAD, Mobile.COOLPAD, 11, "酷派 8681-A01", new String[] {"8681-A01 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_8681_M02(	MobileBrand.COOLPAD, Mobile.COOLPAD, 12, "酷派 8681-M02", new String[] {"8681-M02 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_8692_A00(	MobileBrand.COOLPAD, Mobile.COOLPAD, 13, "酷派 8692-A00", new String[] {"8692-A00 Build/LMY47V"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1440_2560),
	    酷派_8692_M02(	MobileBrand.COOLPAD, Mobile.COOLPAD, 14, "酷派 8692-M02", new String[] {"8692-M02 Build/LMY47V"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    酷派_8721(	MobileBrand.COOLPAD, Mobile.COOLPAD, 15, "酷派 8721", new String[] {"Coolpad 8721 Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_8729(	MobileBrand.COOLPAD, Mobile.COOLPAD, 16, "酷派 8729", new String[] {"Coolpad 8729 Build/JLS36C"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES540_960),
	    酷派_8737(	MobileBrand.COOLPAD, Mobile.COOLPAD, 17, "酷派 8737", new String[] {"Coolpad 8737 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_8737A(	MobileBrand.COOLPAD, Mobile.COOLPAD, 18, "酷派 8737A", new String[] {"Coolpad 8737A Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_9190_T00(	MobileBrand.COOLPAD, Mobile.COOLPAD, 19, "酷派 S6", new String[] {"Coolpad 9190_T00 Build/JLS36C"}, null, ScreenSizeType.SCR5_95, ResolutionType.RES720_1280),
	    酷派_9190L(	MobileBrand.COOLPAD, Mobile.COOLPAD, 20, "酷派 9190L", new String[] {"Coolpad 9190L Build/JLS36C"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES720_1280),
	    酷派_9976D(	MobileBrand.COOLPAD, Mobile.COOLPAD, 21, "酷派 9976D", new String[] {"Coolpad 9976D Build/KOT49H"}, null, ScreenSizeType.SCR7_0, ResolutionType.RES1200_1920),
	    酷派_A8_930(	MobileBrand.COOLPAD, Mobile.COOLPAD, 22, "酷派 A8-930", new String[] {"Coolpad A8-930 Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_C105_6(	MobileBrand.COOLPAD, Mobile.COOLPAD, 23, "酷派 C105-6", new String[] {"C105-6 Build/VCXCNCT5806212191S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_C105_8(	MobileBrand.COOLPAD, Mobile.COOLPAD, 24, "酷派 C105-8", new String[] {"C105-8 Build/VDXCNCM5810105230S"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    酷派_C106_6(	MobileBrand.COOLPAD, Mobile.COOLPAD, 25, "酷派 C106-6", new String[] {"C106-6 Build/ZOXCNFN5801710251S","C106-6 Build/ZOXCNFN5902606201S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_C106_9(	MobileBrand.COOLPAD, Mobile.COOLPAD, 26, "酷派 C106-9", new String[] {"C106-9 Build/ZCXCNCT5801712291S","C106-9 Build/ZCXCNCT5902606201S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_C107_9(	MobileBrand.COOLPAD, Mobile.COOLPAD, 27, "酷派 C107-9", new String[] {"C107-9 Build/ZFXCNCT5902606201S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_COOL1(	MobileBrand.COOLPAD, Mobile.COOLPAD, 28, "酷派 cool1", new String[] {"C106 Build/ZAXCNFN5902606201S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    酷派_DAZEN_X7(	MobileBrand.COOLPAD, Mobile.COOLPAD, 29, "酷派 dazen X7", new String[] {"dazen X7 Build/KTU84P"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    酷派_IVVI(	MobileBrand.COOLPAD, Mobile.COOLPAD, 30, "酷派 ivvi CK3-01", new String[] {"CK3-01 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_Y75(	MobileBrand.COOLPAD, Mobile.COOLPAD, 31, "酷派 Y75", new String[] {"Coolpad Y75 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES540_960),
	    酷派_大神F1(	MobileBrand.COOLPAD, Mobile.COOLPAD, 32, "酷派 大神F1", new String[] {"Coolpad 8297W Build/KOT49H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    酷派_大神F2(	MobileBrand.COOLPAD, Mobile.COOLPAD, 33, "酷派 大神F2", new String[] {"Coolpad 8675 Build/KOT49H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_锋尚2(	MobileBrand.COOLPAD, Mobile.COOLPAD, 34, "酷派 锋尚2", new String[] {"Coolpad Y82-520 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES540_960),
	    酷派_锋尚3(	MobileBrand.COOLPAD, Mobile.COOLPAD, 35, "酷派 锋尚3", new String[] {"Coolpad Y803-9 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_锋尚PRO(	MobileBrand.COOLPAD, Mobile.COOLPAD, 36, "酷派 锋尚PRO", new String[] {"Coolpad Y90 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    酷派_酷玩6(	MobileBrand.COOLPAD, Mobile.COOLPAD, 37, "酷派 酷玩6", new String[] {"VCR-A0 Build/VCRSCN00X1000MPX1706220"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    KOPO(	MobileBrand.KOPO, null, 1000, "酷珀", new String[] {"KOPO K33 Build/LMY47D"}, null, null, null),
	    酷珀_K33(	MobileBrand.KOPO, Mobile.KOPO, 1, "酷珀 K33", new String[] {"KOPO K33 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    
	    RAMOS(	MobileBrand.RAMOS, null, 1000, "蓝魔", new String[] {"MOS3 Build/MRA58K"}, null, null, null),
	    蓝魔_MOS3(	MobileBrand.RAMOS, Mobile.RAMOS, 1, "蓝魔 MOS3", new String[] {"MOS3 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    LEPHONE(	MobileBrand.LEPHONE, null, 1000, "乐丰", new String[] {"lephone"}, null, null, null),
	    乐丰_F1(	MobileBrand.LEPHONE, Mobile.LEPHONE, 1, "乐丰 F1", new String[] {"lephone F1 Build/LMY47D","lephone T7+ Build/079"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    乐丰_W7(	MobileBrand.LEPHONE, Mobile.LEPHONE, 2, "乐丰 W7", new String[] {"lephone W7 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, null),
	    
	    
	  LETV(	MobileBrand.LETV, null, 1000, "乐视", new String[] {"Le X620","Le X820","LEX622","LEX650","LEX6520","LEX720"
			  ,"LEX820","Letv X500","Letv X501","Letv X502","Le X528","Le X621","Le X822","x600 Build/ABXCNOP5902012161S"
	    		,"x600 Build/ABXCNOP5902303111S","x600 Build/ABXCNOP5902605181S","x600 Build/ABXCNOP5902803181S"
	    		,"X800 Build/BBXCNOP5902303131S","X800 Build/BBXCNOP5902605091S","X800+ Build/BEXCNFN5902605111S"
	    		,"Le X520","X900 Build/CBXCNOP5902605091S","X900 Build/CEXCNFN5902803208S","X900+ Build/CEXCNFN5501304131S"
	    		,"X900+ Build/CEXCNFN5902605111S","LEX626"}, null, null, null),
	    乐视_2(	MobileBrand.LETV, Mobile.LETV, 1, "乐视 2", new String[] {"Le X620"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_LE_X820(	MobileBrand.LETV, Mobile.LETV, 2, "乐视 Le X820", new String[] {"Le X820"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    乐视_LEX622(	MobileBrand.LETV, Mobile.LETV, 3, "乐视 S3", new String[] {"LEX622"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_LEX650(	MobileBrand.LETV, Mobile.LETV, 4, "乐视 LEX650", new String[] {"LEX650"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_LEX6520(	MobileBrand.LETV, Mobile.LETV, 5, "乐视 Pro3", new String[] {"LEX6520"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_LEX720(	MobileBrand.LETV, Mobile.LETV, 6, "乐视 Pro3 全网通", new String[] {"LEX720"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_LEX820(	MobileBrand.LETV, Mobile.LETV, 7, "乐视 2", new String[] {"LEX820"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_X500(	MobileBrand.LETV, Mobile.LETV, 8, "乐视 X500", new String[] {"Letv X500"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_X501(	MobileBrand.LETV, Mobile.LETV, 9, "乐视 X501", new String[] {"Letv X501"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_X502(	MobileBrand.LETV, Mobile.LETV, 10, "乐视 X502", new String[] {"Letv X502"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_X528(	MobileBrand.LETV, Mobile.LETV, 11, "乐视 X528", new String[] {"Le X528"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_X621(	MobileBrand.LETV, Mobile.LETV, 12, "乐视 X621", new String[] {"Le X621"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_X822(	MobileBrand.LETV, Mobile.LETV, 13, "乐视 X822", new String[] {"Le X822"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    乐视_乐1(	MobileBrand.LETV, Mobile.LETV, 14, "乐视 乐1", new String[] {"x600 Build/ABXCNOP5902012161S"
	    		,"x600 Build/ABXCNOP5902303111S","x600 Build/ABXCNOP5902605181S","x600 Build/ABXCNOP5902803181S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_乐1_PRO(	MobileBrand.LETV, Mobile.LETV, 15, "乐视 乐1 Pro", new String[] {"X800 Build/BBXCNOP5902303131S",
	    		"X800 Build/BBXCNOP5902605091S","X800+ Build/BEXCNFN5902605111S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    乐视_乐2(	MobileBrand.LETV, Mobile.LETV, 16, "乐视 乐2", new String[] {"Le X520"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_乐MAX(	MobileBrand.LETV, Mobile.LETV, 17, "乐视 乐Max", new String[] {"X900 Build/CBXCNOP5902605091S",
	    		"X900 Build/CEXCNFN5902803208S","X900+ Build/CEXCNFN5501304131S","X900+ Build/CEXCNFN5902605111S"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    乐视_乐S3(	MobileBrand.LETV, Mobile.LETV, 18, "乐视 乐S3", new String[] {"LEX626"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	   
	  LENOVO(	MobileBrand.LENOVO, null, 1000, "联想", new String[] {"Lenovo","ZUK"}, null, null, null),
	    联想_A320T(	MobileBrand.LENOVO, Mobile.LENOVO, 1, "联想 A320t", new String[] {"Lenovo A320t Build/KOT49H"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_800),
	    联想_A330E(	MobileBrand.LENOVO, Mobile.LENOVO, 2, "联想 A330e", new String[] {"Lenovo A330e Build/JLS36C"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_854),
	    联想_A5800_D(	MobileBrand.LENOVO, Mobile.LENOVO, 3, "联想 A5800-D", new String[] {"Lenovo A5800-D Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES480_854),
	    联想_A708T(	MobileBrand.LENOVO, Mobile.LENOVO, 4, "联想 A708t", new String[] {"Lenovo A708t Build/JDQ39"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES540_960),
	    联想_K30_T(	MobileBrand.LENOVO, Mobile.LENOVO, 5, "联想 K30-T", new String[] {"Lenovo K30-T Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    联想_K32C36(	MobileBrand.LENOVO, Mobile.LENOVO, 6, "联想 K32c36", new String[] {"Lenovo K32c36 Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    联想_K50_T3S(	MobileBrand.LENOVO, Mobile.LENOVO, 7, "联想 K50-t3s", new String[] {"Lenovo K50-t3s Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    联想_P2C72(	MobileBrand.LENOVO, Mobile.LENOVO, 8, "联想 P2c72", new String[] {"Lenovo P2c72 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    联想_S810T(	MobileBrand.LENOVO, Mobile.LENOVO, 9, "联想 S810t", new String[] {"Lenovo S810t Build/JLS36C"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    联想_S850(	MobileBrand.LENOVO, Mobile.LENOVO, 10, "联想 S850", new String[] {"Lenovo S850 Build/KOT49H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    联想_X2_TO(	MobileBrand.LENOVO, Mobile.LENOVO, 11, "联想 X2-TO", new String[] {"Lenovo X2-TO Build/KOT49H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    联想_X3C50(	MobileBrand.LENOVO, Mobile.LENOVO, 12, "联想 X3c50", new String[] {"Lenovo X3c50 Build/LMY47V","Lenovo X3c50 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    联想_YT3_850M(	MobileBrand.LENOVO, Mobile.LENOVO, 13, "联想 YOGA Tablet 3", new String[] {"Lenovo YT3-850M Build/LMY47V"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES800_1280),
	    联想_ZUK_Z1(	MobileBrand.LENOVO, Mobile.LENOVO, 14, "联想 ZUK Z1", new String[] {"ZUK Z1 Build/LMY47V","ZUK Z1 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    联想_ZUK_Z2_PRO(	MobileBrand.LENOVO, Mobile.LENOVO, 15, "联想 ZUK Z2 Pro", new String[] {"ZUK Z2121 Build/MMB29M","ZUK Z2121 Build/NRD90M"
	    		,"ZUK Z2121 Build/OPR1.170623.032"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    联想_乐檬K3_NOTE(	MobileBrand.LENOVO, Mobile.LENOVO, 16, "联想 乐檬K3 Note", new String[] {"Lenovo K50-t5 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	  
	  
	    MEITU(	MobileBrand.MEITU, null, 1000, "美图", new String[] {"Meitu","MP1503 Build/MRA58K","MP1512 Build/MRA58K"
	    		,"MP1602 Build/MRA58K","MP1602 Build/NMF26O","MP1603 Build/MRA58K","MP1603 Build/NMF26O"
	    		,"MP1611 Build/MRA58K","MP1611 Build/NMF26O","MP1701 Build/NMF26O","MP1709 Build/NMF26O","Meitu V4 Build/LMY47I"}, null, null, null),
	    美图_M4(	MobileBrand.MEITU, Mobile.MEITU, 1, "美图 M4", new String[] {"Meitu M4 Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    美图_M4S(	MobileBrand.MEITU, Mobile.MEITU, 2, "美图 M4s", new String[] {"Meitu M4s Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    美图_M6(	MobileBrand.MEITU, Mobile.MEITU, 3, "美图 M6", new String[] {"MP1503 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    美图_M6S(	MobileBrand.MEITU, Mobile.MEITU, 4, "美图 M6s", new String[] {"MP1512 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    美图_MP1602(	MobileBrand.MEITU, Mobile.MEITU, 5, "美图 MP1602", new String[] {"MP1602 Build/MRA58K","MP1602 Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    美图_MP1603(	MobileBrand.MEITU, Mobile.MEITU, 6, "美图 MP1603", new String[] {"MP1603 Build/MRA58K","MP1603 Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    美图_MP1611(	MobileBrand.MEITU, Mobile.MEITU, 7, "美图 MP1611", new String[] {"MP1611 Build/MRA58K","MP1611 Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    美图_MP1701(	MobileBrand.MEITU, Mobile.MEITU, 8, "美图 MP1701", new String[] {"MP1701 Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    美图_MP1709(	MobileBrand.MEITU, Mobile.MEITU, 9, "美图 MP1709", new String[] {"MP1709 Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    美图_V4(	MobileBrand.MEITU, Mobile.MEITU, 10, "美图 V4", new String[] {"Meitu V4 Build/LMY47I"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    
	  MEIZU(	MobileBrand.MEIZU, null, 1000, "魅族", new String[] {"15 Plus Build/NRD90M","16th Plus Build/OPM1.171019.026",
			  "A680Q Build/MRA58K","m2 note Build/LMY47D","M3s Build/LMY47I","M3X Build/MMB29U","M3X Build/MMB29wv",
			  "M5 Build/LMY47D","M5 Build/MRA58K","M5 Note Build/MRA58K","M5 Note Build/NRD90M","M5s Build/MRA58K",
			  "M6 Note Build/N2G47H","M9 Build/IML74K","M031 Build/IML74K","M031 Build/JRO03H","M040 Build/JOP40D",
			  "M040 Build/JRO03H","M040 Build/LRX22C","M351 Build/LRX22C","M356 Build/KTU84P","M351 Build/KTU84P",
			  "M355 Build/LRX22C","MZ4 Build/LMY47D","MX4 Build/KOT49H","MX4 Build/LMY47I","MX4 Pro Build/KTU84P",
			  "MX4 Pro Build/LMY48W","MX5 Build/LMY47I","MX5 Build/LRX22C","M685C Build/MRA58K","MX6 Build/MRA58K",
			  "MX6 Build/NMF26O","PRO 5 Build/LMY47D","PRO 5 Build/NRD90M","PRO 6 Build/MRA58K","PRO 6 Build/NMF26O",
			  "PRO 6 Plus Build/MMB29T","PRO 6 Plus Build/NRD90M","PRO 6s Build/MRA58K","PRO 6s Build/NMF26O",
			  "PRO 7 Plus Build/NRD90M","PRO 7-H Build/NRD90M","PRO 7-S Build/NRD90M","M578CA Build/LMY47D",
			  "M578CE Build/LMY47D","M612C Build/MRA58K","M621C Build/MRA58K","M621C Build/NRD90M","M711C Build/NRD90M",
			  "MEIZU E3 Build/NGI77B","M1 E Build/MRA58K","M1 E Build/NRD90M","m1 note Build/LMY47D","M2 E Build/MMB29U",
			  "M2 E Build/MMB29wv","M3 Max Build/MRA58K","M3 Max Build/NRD90M","M6 Build/NRD90M","MEIZU M6 Build/NRD90M",
			  "M57AC Build/LMY47D","M463C Build/KTU84P","m3 note Build/LMY47I","m3 note Build/NRD90M","M571C Build/LMY47D",
			  "M681C Build/LMY47I","Meizu S6 Build/NRD90M","U20 Build/MRA58K","m1 metal Build/LMY47I"}, null, null, null),
	    魅族_15_PLUS(	MobileBrand.MEIZU, Mobile.MEIZU, 1, "魅族 15 Plus", new String[] {"15 Plus Build/NRD90M"}, null, ScreenSizeType.SCR5_95, ResolutionType.RES1440_2560),
	    魅族_16TH_PLUS(	MobileBrand.MEIZU, Mobile.MEIZU, 2, "魅族 16th Plus", new String[] {"16th Plus Build/OPM1.171019.026"}, null, ScreenSizeType.SCR6_5, ResolutionType.RES1080_2160),
	    魅族_A680Q(	MobileBrand.MEIZU, Mobile.MEIZU, 3, "魅族 魅蓝E", new String[] {"A680Q Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_M2_NOTE(	MobileBrand.MEIZU, Mobile.MEIZU, 4, "魅族 m2 note", new String[] {"m2 note Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_M3S(	MobileBrand.MEIZU, Mobile.MEIZU, 5, "魅族 M3s", new String[] {"M3s Build/LMY47I"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    魅族_M3X(	MobileBrand.MEIZU, Mobile.MEIZU, 6, "魅族 魅蓝X", new String[] {"M3X Build/MMB29U","M3X Build/MMB29wv"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_M5(	MobileBrand.MEIZU, Mobile.MEIZU, 7, "魅族 M5", new String[] {"M5 Build/LMY47D","M5 Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    魅族_M5_NOTE(	MobileBrand.MEIZU, Mobile.MEIZU, 8, "魅族 魅蓝M5 Note", new String[] {"M5 Note Build/MRA58K","M5 Note Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_M5S(	MobileBrand.MEIZU, Mobile.MEIZU, 9, "魅族 M5S", new String[] {"M5s Build/MRA58K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    魅族_M6_NOTE(	MobileBrand.MEIZU, Mobile.MEIZU, 10, "魅族 M6 Note", new String[] {"M6 Note Build/N2G47H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    魅族_M9(	MobileBrand.MEIZU, Mobile.MEIZU, 11, "魅族 M9", new String[] {"M9 Build/IML74K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    魅族_MX(	MobileBrand.MEIZU, Mobile.MEIZU, 12, "魅族 MX", new String[] {"M031 Build/IML74K","M031 Build/JRO03H"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES640_960),
	    魅族_MX2(	MobileBrand.MEIZU, Mobile.MEIZU, 13, "魅族 MX2", new String[] {"M040 Build/JOP40D","M040 Build/JRO03H",
	    		"M040 Build/LRX22C"}, null, ScreenSizeType.SCR4_4, ResolutionType.RES800_1280),
	    魅族_MX3(	MobileBrand.MEIZU, Mobile.MEIZU, 14, "魅族 MX3", new String[] {"M351 Build/LRX22C","M356 Build/KTU84P",
	    		"M351 Build/KTU84P"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1080_1800),
	    魅族_MX3移动版(	MobileBrand.MEIZU, Mobile.MEIZU, 15, "魅族 MX3移动版", new String[] {"M355 Build/LRX22C"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1080_1800),
	    魅族_MX4(	MobileBrand.MEIZU, Mobile.MEIZU, 16, "魅族 MX4", new String[] {"MZ4 Build/LMY47D","MX4 Build/KOT49H",
	    		"MX4 Build/LMY47I"}, null, ScreenSizeType.SCR5_4, ResolutionType.RES1152_1920),
	    魅族_MX4_PRO(	MobileBrand.MEIZU, Mobile.MEIZU, 17, "魅族 MX4 Pro", new String[] {"MX4 Pro Build/KTU84P","MX4 Pro Build/LMY48W"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1536_2560),
	    魅族_MX5(	MobileBrand.MEIZU, Mobile.MEIZU, 18, "魅族 MX5", new String[] {"MX5 Build/LMY47I","MX5 Build/LRX22C"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_MX6(	MobileBrand.MEIZU, Mobile.MEIZU, 19, "魅族 MX6", new String[] {"M685C Build/MRA58K","MX6 Build/MRA58K"
	    		,"MX6 Build/NMF26O"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_PRO_5(	MobileBrand.MEIZU, Mobile.MEIZU, 20, "魅族 PRO 5", new String[] {"PRO 5 Build/LMY47D","PRO 5 Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    魅族_PRO_6(	MobileBrand.MEIZU, Mobile.MEIZU, 21, "魅族 PRO 6", new String[] {"PRO 6 Build/MRA58K","PRO 6 Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    魅族_PRO_6_PLUS(	MobileBrand.MEIZU, Mobile.MEIZU, 22, "魅族 PRO 6 Plus", new String[] {"PRO 6 Plus Build/MMB29T"
	    		,"PRO 6 Plus Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    魅族_PRO_6S(	MobileBrand.MEIZU, Mobile.MEIZU, 23, "魅族 PRO 6s", new String[] {"PRO 6s Build/MRA58K","PRO 6s Build/NMF26O"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    魅族_PRO_7_PLUS(	MobileBrand.MEIZU, Mobile.MEIZU, 24, "魅族 PRO 7 Plus", new String[] {"PRO 7 Plus Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    魅族_PRO_7_H(	MobileBrand.MEIZU, Mobile.MEIZU, 25, "魅族 PRO 7-H", new String[] {"PRO 7-H Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    魅族_PRO_7_S(	MobileBrand.MEIZU, Mobile.MEIZU, 26, "魅族 PRO 7-S", new String[] {"PRO 7-S Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    魅族_魅蓝_2(	MobileBrand.MEIZU, Mobile.MEIZU, 27, "魅族 魅蓝 2", new String[] {"M578CA Build/LMY47D","M578CE Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    魅族_魅蓝_5S(	MobileBrand.MEIZU, Mobile.MEIZU, 28, "魅族 魅蓝 5s", new String[] {"M612C Build/MRA58K","M621C Build/MRA58K"
	    		,"M621C Build/NRD90M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    魅族_魅蓝_6(	MobileBrand.MEIZU, Mobile.MEIZU, 29, "魅族 魅蓝 6", new String[] {"M711C Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    魅族_魅蓝_E3(	MobileBrand.MEIZU, Mobile.MEIZU, 30, "魅族 魅蓝 E3", new String[] {"MEIZU E3 Build/NGI77B"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    魅族_魅蓝_M1_E(	MobileBrand.MEIZU, Mobile.MEIZU, 31, "魅族 魅蓝 M1 E", new String[] {"M1 E Build/MRA58K","M1 E Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_M1_NOTE(	MobileBrand.MEIZU, Mobile.MEIZU, 32, "魅族 魅蓝 M1 note", new String[] {"m1 note Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_M2_E(	MobileBrand.MEIZU, Mobile.MEIZU, 33, "魅族 魅蓝 M2 E", new String[] {"M2 E Build/MMB29U","M2 E Build/MMB29wv"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_M3_MAX(	MobileBrand.MEIZU, Mobile.MEIZU, 34, "魅族 魅蓝 M3 Max", new String[] {"M3 Max Build/MRA58K","M3 Max Build/NRD90M"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    魅族_魅蓝_M6(	MobileBrand.MEIZU, Mobile.MEIZU, 35, "魅族 魅蓝 M6", new String[] {"M6 Build/NRD90M","MEIZU M6 Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_METAL电信版(	MobileBrand.MEIZU, Mobile.MEIZU, 36, "魅族 魅蓝 metal电信版", new String[] {"M57AC Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_NOTE(	MobileBrand.MEIZU, Mobile.MEIZU, 37, "魅族 魅蓝 note", new String[] {"M463C Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_NOTE_3(	MobileBrand.MEIZU, Mobile.MEIZU, 38, "魅族 魅蓝 note 3", new String[] {"m3 note Build/LMY47I","m3 note Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_NOTE2(	MobileBrand.MEIZU, Mobile.MEIZU, 39, "魅族 魅蓝 note2", new String[] {"M571C Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_NOTE3(	MobileBrand.MEIZU, Mobile.MEIZU, 40, "魅族 魅蓝 note3", new String[] {"M681C Build/LMY47I"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝_S6(	MobileBrand.MEIZU, Mobile.MEIZU, 41, "魅族 魅蓝 S6", new String[] {"Meizu S6 Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
	    魅族_魅蓝_U20(	MobileBrand.MEIZU, Mobile.MEIZU, 42, "魅族 魅蓝 U20", new String[] {"U20 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    魅族_魅蓝METAL(	MobileBrand.MEIZU, Mobile.MEIZU, 43, "魅族 魅蓝metal", new String[] {"m1 metal Build/LMY47I"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	  MOTO(	MobileBrand.MOTO, null, 1000, "摩托罗拉", new String[] {"ME860 Build/4.5.2A-74_OLH-25","MB200 Build/GRJ22",
			  "XT885 Build/6.7.2_GC-385","XT1635-03 Build/MCN24.104-35.2","XT1635-03 Build/OCN27.82-18",
			  "XT1085 Build/LPES23.32-70-5","XT1085 Build/MOB31K","XT1570 Build/LPH23.145-22","XT1575 Build/MPH24.49-18",
			  "XT1650 Build/NCLS25.86-11-4-6-8","XT1650 Build/NCLS26.118-23-13-6-5","XT1650-05 Build/NCC25.106-15",
			  "XT1650-05 Build/NCC26.118-31-1","XT1650-05 Build/NCCS26.118-31-1-6","XT1662 Build/NRD90M",
			  "XT1789-05 Build/XT1789-05"}, null, null, null),
	    摩托罗拉_ATRIX_4G(	MobileBrand.MOTO, Mobile.MOTO, 1, "摩托罗拉 Atrix 4G", new String[] {"ME860 Build/4.5.2A-74_OLH-25"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES540_960),
	    摩托罗拉_MB200(	MobileBrand.MOTO, Mobile.MOTO, 2, "摩托罗拉 MB200", new String[] {"MB200 Build/GRJ22"}, null, ScreenSizeType.SCR3_1, ResolutionType.RES320_480),
	    摩托罗拉_MOTO_RAZR_V锋芒(	MobileBrand.MOTO, Mobile.MOTO, 3, "摩托罗拉 Moto RAZR V锋芒", new String[] {"XT885 Build/6.7.2_GC-385"}, null, ScreenSizeType.SCR4_3, ResolutionType.RES540_960),
	    摩托罗拉_MOTO_Z_PLAY(	MobileBrand.MOTO, Mobile.MOTO, 4, "摩托罗拉 Moto Z Play", new String[] {"XT1635-03 Build/MCN24.104-35.2"
	    		,"XT1635-03 Build/OCN27.82-18"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    摩托罗拉_XT1085(	MobileBrand.MOTO, Mobile.MOTO, 5, "摩托罗拉 XT1085", new String[] {"XT1085 Build/LPES23.32-70-5","XT1085 Build/MOB31K"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    摩托罗拉_XT1570(	MobileBrand.MOTO, Mobile.MOTO, 6, "摩托罗拉 XT1570", new String[] {"XT1570 Build/LPH23.145-22"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
	    摩托罗拉_XT1575(	MobileBrand.MOTO, Mobile.MOTO, 7, "摩托罗拉 XT1575", new String[] {"XT1575 Build/MPH24.49-18"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
	    摩托罗拉_XT1650(	MobileBrand.MOTO, Mobile.MOTO, 8, "摩托罗拉 XT1650", new String[] {"XT1650 Build/NCLS25.86-11-4-6-8"
	    		,"XT1650 Build/NCLS26.118-23-13-6-5"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    摩托罗拉_XT1650_05(	MobileBrand.MOTO, Mobile.MOTO, 9, "摩托罗拉 XT1650-05", new String[] {"XT1650-05 Build/NCC25.106-15"
	    		,"XT1650-05 Build/NCC26.118-31-1","XT1650-05 Build/NCCS26.118-31-1-6"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    摩托罗拉_XT1662(	MobileBrand.MOTO, Mobile.MOTO, 10, "摩托罗拉 XT1662", new String[] {"XT1662 Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    摩托罗拉_XT1789_05(	MobileBrand.MOTO, Mobile.MOTO, 11, "摩托罗拉 XT1789-05", new String[] {"XT1789-05 Build/XT1789-05"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    
	  NUBIA(	MobileBrand.NUBIA, null, 1000, "努比亚", new String[] {"NX513J Build/LMY47V","NX541J Build/LMY47I",
			  "NX531J Build/MMB29M","NX523J_V1 Build/LMY47V","NX529J Build/LMY47V","NX549J Build/MMB29M",
			  "NX563J Build/NMF26X","NX569H Build/MMB29M","NX569J Build/MMB29M","NX589J Build/NMF26F","NX595J Build/NMF26X",
			  "NX403A Build/JDQ39","NX505J Build/KVT49L","NX507J Build/KVT49L","NX508J Build/LMY47V","NX510J Build/LMY47V",
			  "NX512J Build/LMY47V","NX518J Build/LMY47V","NX511J Build/LMY47V","NX511J Build/LRX22G","NX511J_V3 Build/LMY47V"}, null, null, null),
	    努比亚_MY_PRAGUE(	MobileBrand.NUBIA, Mobile.NUBIA, 1, "努比亚 My Prague", new String[] {"NX513J Build/LMY47V"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    努比亚_N1(	MobileBrand.NUBIA, Mobile.NUBIA, 2, "努比亚 N1", new String[] {"NX541J Build/LMY47I"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    努比亚_Z11(	MobileBrand.NUBIA, Mobile.NUBIA, 3, "努比亚 Z11", new String[] {"NX531J Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    努比亚_Z11_MAX(	MobileBrand.NUBIA, Mobile.NUBIA, 4, "努比亚 Z11 Max", new String[] {"NX523J_V1 Build/LMY47V"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    努比亚_Z11_MINI(	MobileBrand.NUBIA, Mobile.NUBIA, 5, "努比亚 Z11 Mini", new String[] {"NX529J Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    努比亚_Z11MINIS(	MobileBrand.NUBIA, Mobile.NUBIA, 6, "努比亚 Z11miniS", new String[] {"NX549J Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    努比亚_Z17(	MobileBrand.NUBIA, Mobile.NUBIA, 7, "努比亚 Z17", new String[] {"NX563J Build/NMF26X"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    努比亚_Z17_MINI(	MobileBrand.NUBIA, Mobile.NUBIA, 8, "努比亚 Z17 Mini", new String[] {"NX569H Build/MMB29M",
	    		"NX569J Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    努比亚_Z17_MINIS(	MobileBrand.NUBIA, Mobile.NUBIA, 9, "努比亚 Z17 MiniS", new String[] {"NX589J Build/NMF26F"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    努比亚_Z17S(	MobileBrand.NUBIA, Mobile.NUBIA, 10, "努比亚 Z17S", new String[] {"NX595J Build/NMF26X"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_2040),
	    努比亚_Z5S_MINI(	MobileBrand.NUBIA, Mobile.NUBIA, 11, "努比亚 Z5S Mini", new String[] {"NX403A Build/JDQ39"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    努比亚_Z7_MAX(	MobileBrand.NUBIA, Mobile.NUBIA, 12, "努比亚 Z7 Max", new String[] {"NX505J Build/KVT49L"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    努比亚_Z7_MINI(	MobileBrand.NUBIA, Mobile.NUBIA, 13, "努比亚 Z7 Mini", new String[] {"NX507J Build/KVT49L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    努比亚_Z9(	MobileBrand.NUBIA, Mobile.NUBIA, 14, "努比亚 Z9", new String[] {"NX508J Build/LMY47V"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    努比亚_Z9_MAX(	MobileBrand.NUBIA, Mobile.NUBIA, 15, "努比亚 Z9 Max", new String[] {"NX510J Build/LMY47V","NX512J Build/LMY47V"
	    		,"NX518J Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    努比亚_Z9_MINI(	MobileBrand.NUBIA, Mobile.NUBIA, 16, "努比亚 Z9 mini", new String[] {"NX511J Build/LMY47V","NX511J Build/LRX22G"
	    		,"NX511J_V3 Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    
	    NOKIA(	MobileBrand.NOKIA, null, 1000, "诺基亚", new String[] {"TA-1000 Build/NMF26F","TA-1000 Build/NRD90M",
	    		"TA-1000 Build/OPR1.170623.026","TA-1041 Build/NMF26F","TA-1041 Build/OPR1.170623.026",
	    		"TA-1052 Build/NMF26F","TA-1054 Build/OPR1.170623.026","Nokia X6 Build/OPR1.170623.026"}, null, null, null),
	    诺基亚_6(	MobileBrand.NOKIA, Mobile.NOKIA, 1, "诺基亚 6", new String[] {"TA-1000 Build/NMF26F","TA-1000 Build/NRD90M"
	    		,"TA-1000 Build/OPR1.170623.026"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    诺基亚_TA_1041(	MobileBrand.NOKIA, Mobile.NOKIA, 2, "诺基亚 TA-1041", new String[] {"TA-1041 Build/NMF26F"
	    		,"TA-1041 Build/OPR1.170623.026"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    诺基亚_TA_1052(	MobileBrand.NOKIA, Mobile.NOKIA, 3, "诺基亚 8", new String[] {"TA-1052 Build/NMF26F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    诺基亚_TA_1054(	MobileBrand.NOKIA, Mobile.NOKIA, 4, "诺基亚 6 二代", new String[] {"TA-1054 Build/OPR1.170623.026"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    诺基亚_X6(	MobileBrand.NOKIA, Mobile.NOKIA, 5, "诺基亚 X6", new String[] {"Nokia X6 Build/OPR1.170623.026"}, null, ScreenSizeType.SCR3_2, ResolutionType.RES360_640),
	    
	    OUJIA(	MobileBrand.OUJIA, null, 1000, "欧加", new String[] {"OUJIA 2018-S10MAX Build/MRA58K"}, null, null, null),
	    欧加_S10MAX(	MobileBrand.OUJIA, Mobile.OUJIA, 1, "欧加 S10MAX", new String[] {"OUJIA 2018-S10MAX Build/MRA58K"}, null, ScreenSizeType.SCR6_1, ResolutionType.RES720_1280),
	    
	    OUKI(	MobileBrand.OUKI, null, 1, "欧奇", new String[] {"OKA5 Build/JDQ39"}, null, null, null),
	    欧奇_英雄A5(	MobileBrand.OUKI, Mobile.OUKI, 1, "欧奇 英雄A5", new String[] {"OKA5 Build/JDQ39"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
	    
	    GREENORANGE(	MobileBrand.GREENORANGE, null, 1000, "青橙", new String[] {"GO N3S Build/MRA58K"}, null, null, null),
	    青橙_GO_N3S(	MobileBrand.GREENORANGE, Mobile.GREENORANGE, 1, "青橙 GO N3S", new String[] {"GO N3S Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    
	    SAMSUNG(	MobileBrand.SAMSUNG, null, 1000, "三星", new String[] {"SM-A7100 Build/LMY47X","SM-A7100 Build/MMB29M",
	    		"SM-A9000 Build/MMB29M","SM-J5108 Build/LMY47X","CVK350C Build/JDQ39","SM-G9098 Build/JSS15J",
	    		"SM-A3000 Build/LRX22G","SM-A5009 Build/MMB29M","SM-A500H Build/MMB29M","SM-A5100 Build/JLS36I",
	    		"SM-A5100 Build/MMB29M","SM-A5108 Build/MMB29K","SM-A5000 Build/KTU84P","SM-A5000 Build/LRX22G",
	    		"SM-A5000 Build/MMB29M","SM-A7000 Build/KTU84P","SM-A7000 Build/LRX22G","SM-A7009 Build/KTU84P",
	    		"SM-A7009 Build/LRX22G","SM-A700YD Build/KTU84P","SM-A700YD Build/LRX22G","SM-A7108 Build/MMB29K",
	    		"SM-A8000 Build/LMY47X","SM-A8000 Build/MMB29M","SM-A9100 Build/MMB29M","GT-S7278U Build/JZO54K",
	    		"SM-G8508S Build/KTU84P","SM-C5000 Build/MMB29M","SM-C5000 Build/NRD90M","SM-C5010 Build/MMB29M",
	    		"SM-C5010 Build/NRD90M","SM-C7000 Build/MMB29M","SM-C7000 Build/NRD90M","SM-C7010 Build/MMB29M",
	    		"SM-C7010 Build/NRD90M","SM-C7100 Build/NMF26X","SM-C9000 Build/MMB29M","SM-C9000 Build/NMF26X",
	    		"SM-C9000 Build/R16NW","SM-G5108Q Build/KTU84P","SM-G3568V Build/KOT49H","SM-E7009 Build/KTU84P",
	    		"SM-E7000 Build/KTU84P","GT-S5660 Build/GINGERBREAD","SM-G5500 Build/LMY47X","SM-G5510 Build/NMF26X",
	    		"SM-G5308W Build/KTU84P","SM-G5309W Build/KTU84P","SM-J3109 Build/LMY47X","SM-J3110 Build/LMY47X",
	    		"SM-J3119 Build/LMY47X","SM-J5008 Build/LMY47O","SM-J7008 Build/LMY47O","SM-J7108 Build/MMB29K",
	    		"GT-I9158 Build/JDQ39","GT-I9152P Build/JLS36C","GT-N7000 Build/IML74K","SM-N9005 Build/JSS15J",
	    		"SM-N9005 Build/KOT49H","SM-N9005 Build/LRX21V","SM-N9008 Build/JSS15J","SM-N9008 Build/LRX21V",
	    		"SM-N9009 Build/JSS15J","SM-N9009 Build/KOT49H","SM-N9009 Build/LRX21V","SM-N900D Build/JSS15J",
	    		"SM-N9006 Build/KOT49H","SM-N9006 Build/LRX21V","SM-N9008S Build/KOT49H","SM-N9008S Build/LRX21V",
	    		"SM-N9008V Build/KOT49H","SM-N9008V Build/LRX21V","SM-N7508V Build/JLS36C","SM-N7509V Build/JLS36C",
	    		"SM-N900 Build/KOT49H","SM-N9002 Build/JSS15J","SM-N9002 Build/LRX21V","SM-N7506V Build/JLS36C",
	    		"SM-N9100 Build/KTU84P","SM-N9100 Build/LMY47X","SM-N9100 Build/LRX21V","SM-N9100 Build/LRX22C",
	    		"SM-N9100 Build/MMB29M","SM-N9106W Build/MMB29M","SM-N9108V Build/LMY47X","SM-N9108V Build/MMB29M",
	    		"SM-N9109W Build/LMY47X","SM-N9109W Build/MMB29M","SM-N920C Build/NRD90M","SM-N920L Build/MMB29K",
	    		"SM-N9200 Build/MMB29K","SM-N9200 Build/NRD90M","SM-N935F Build/KTU84P","SM-N950N Build/NMF26X",
	    		"SM-N9500 Build/NMF26X","SM-N9500 Build/R16NW","GT-N5100 Build/JZO54K","GT-N5110 Build/JZO54K",
	    		"SM-N9600 Build/M1AJQ","SM-N9150 Build/LRX22C","SHV-E250L Build/KOT49H","SCH-N719 Build/JRO03C",
	    		"SCH-N719 Build/JSS15J","GT-N7100 Build/JSS15J","GT-N7100 Build/JZO54K","GT-N7100 Build/KOT49H",
	    		"GT-N7108 Build/JSS15J","GT-N7108D Build/JDQ39","SM-G5528 Build/NMF26X","SM-G5700 Build/MMB29M",
	    		"SM-G5700 Build/NRD90M","SM-G6000 Build/LMY47X","SM-G6100 Build/MMB29M","SM-G6100 Build/NRD90M",
	    		"GT-I9500 Build/JDQ39","GT-I9500 Build/KOT49H","GT-I9300I Build/JLS36C","SCH-I959 Build/KOT49H",
	    		"SCH-I959 Build/LRX22C","SCH-I959 Build/NJH47F","GT-I9502 Build/LRX22C","GT-I9505 Build/JDQ39",
	    		"GT-I9507V Build/LRX22C","GT-I9508 Build/KOT49H","GT-I9508 Build/LRX22C","GT-I9508V Build/LRX22C",
	    		"SM-G9006V Build/MMB29M","SM-G9008W Build/LRX21T","SM-G9008W Build/MMB29M","SM-G900P Build/LRX21T",
	    		"SM-G9008V Build/LRX21T","SM-G9008V Build/MMB29M","SM-G9009D Build/LRX21T","SM-G9009D Build/MMB29M",
	    		"SM-G9009W Build/LRX21T","SM-G9009W Build/MMB29M","SM-G9006W Build/LRX21T","SM-G9200 Build/LRX22G",
	    		"SM-G9200 Build/MMB29K","SM-G9200 Build/NRD90M","SM-G920K Build/NRD90M","SM-G925P Build/MMB29K",
	    		"SM-G9208 Build/MMB29K","SM-G9208 Build/NRD90M","SM-G9209 Build/MMB29K","SM-G9209 Build/NRD90M",
	    		"SM-G9250 Build/LMY47X","SM-G9250 Build/MMB29K","SM-G9250 Build/NRD90M","SM-G9287 Build/MMB29K",
	    		"SM-G9280 Build/LMY47X","SM-G9280 Build/MMB29K","SM-G9280 Build/NRD90M","SM-G930V Build/NRD90M",
	    		"SM-G935K Build/R16NW","SM-G9508 Build/NRD90M","SM-G9300 Build/MMB29M","SM-G9300 Build/NRD90M",
	    		"SM-G9300 Build/R16NW","SM-G9308 Build/MMB29M","SM-G9308 Build/NRD90M","SM-G9308 Build/R16NW",
	    		"SM-G9350 Build/LMY48Z","SM-G9350 Build/MMB29K","SM-G9350 Build/MMB29M","SM-G9350 Build/NRD90M",
	    		"SM-G9350 Build/R16NW","SM-G9508 Build/R16NW","SM-G950F Build/NRD90M","SM-G950U Build/R16NW",
	    		"SM-G9500 Build/NMF26X","SM-G9500 Build/NRD90M","SM-G9500 Build/R16NW","SM-G8750 Build/R16NW",
	    		"SM-G9550 Build/NRD90M","SM-G9550 Build/R16NW","SM-G9600 Build/R16NW","SM-G9650 Build/R16NW",
	    		"GT-P6200 Build/HTJ85B","SM-T715C Build/LRX22G","SM-T815C Build/MMB29K","SM-P550 Build/LRX22G",
	    		"GT-S7572 Build/JZO54K","RF-V7100 Build/RB3N5C","SM-G7108 Build/JLS36C","SM-G7108V Build/JLS36C",
	    		"SM-G7109 Build/JLS36C","SM-G7200 Build/KTU84P","SAMSUNG-SM-G928A Build/MMB29K","SAMSUNG-SM-N900A Build/tt",
	    		"SAMSUNG SM-N9500 Build/R16NW","SM-W2016 Build/LMY47X","SM-W2017 Build/MMB29M"}, null, null, null),
	    三星_2016版GALAXY_A7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 1, "三星 2016版GALAXY A7", new String[] {"SM-A7100 Build/LMY47X","SM-A7100 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    三星_2016版GALAXY_A9(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 2, "三星 2016版GALAXY A9", new String[] {"SM-A9000 Build/MMB29M"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    三星_2016版GALAXY_J5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 3, "三星 2016版GALAXY J5", new String[] {"SM-J5108 Build/LMY47X"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),
	    三星_CVK350C(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 4, "三星 CVK350C", new String[] {"CVK350C Build/JDQ39"}, null, null, null),
	    三星_G9098(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 5, "三星 G9098", new String[] {"SM-G9098 Build/JSS15J"}, null, ScreenSizeType.SCR3_7, ResolutionType.RES480_800),
	    三星_GALAXY_A3(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 6, "三星 Galaxy A3", new String[] {"SM-A3000 Build/LRX22G"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES540_960),
	    三星_GALAXY_A5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 7, "三星 Galaxy A5", new String[] {"SM-A5009 Build/MMB29M","SM-A500H Build/MMB29M"
	    		,"SM-A5100 Build/JLS36I","SM-A5100 Build/MMB29M","SM-A5108 Build/MMB29K","SM-A5000 Build/KTU84P",
	    		"SM-A5000 Build/LRX22G","SM-A5000 Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    三星_GALAXY_A7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 8, "三星 Galaxy A7", new String[] {"SM-A7000 Build/KTU84P",
	    		"SM-A7000 Build/LRX22G","SM-A7009 Build/KTU84P","SM-A7009 Build/LRX22G","SM-A700YD Build/KTU84P",
	    		"SM-A700YD Build/LRX22G","SM-A7108 Build/MMB29K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    三星_GALAXY_A8(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 9, "三星 GALAXY A8", new String[] {"SM-A8000 Build/LMY47X","SM-A8000 Build/MMB29M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_GALAXY_A9(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 10, "三星 Galaxy A9", new String[] {"SM-A9100 Build/MMB29M"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    三星_GALAXY_ACE_3(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 11, "三星 Galaxy Ace 3", new String[] {"GT-S7278U Build/JZO54K"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_800),
	    三星_GALAXY_ALPHA(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 12, "三星 GALAXY Alpha", new String[] {"SM-G8508S Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    三星_GALAXY_C5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 13, "三星 GALAXY C5", new String[] {"SM-C5000 Build/MMB29M","SM-C5000 Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    三星_GALAXY_C5_PRO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 14, "三星 Galaxy C5 Pro", new String[] {"SM-C5010 Build/MMB29M","SM-C5010 Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    三星_GALAXY_C7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 15, "三星 GALAXY C7", new String[] {"SM-C7000 Build/MMB29M","SM-C7000 Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_GALAXY_C7_PRO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 16, "三星 Galaxy C7 Pro", new String[] {"SM-C7010 Build/MMB29M","SM-C7010 Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_GALAXY_C8(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 17, "三星 Galaxy C8", new String[] {"SM-C7100 Build/NMF26X"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    三星_GALAXY_C9_PRO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 18, "三星 GALAXY C9 Pro", new String[] {"SM-C9000 Build/MMB29M","SM-C9000 Build/NMF26X"
	    		,"SM-C9000 Build/R16NW"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    三星_GALAXY_CORE_MAX(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 19, "三星 GALAXY Core Max", new String[] {"SM-G5108Q Build/KTU84P"}, null, ScreenSizeType.SCR4_8, ResolutionType.RES540_960),
	    三星_GALAXY_CORE_MINI(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 20, "三星 Galaxy Core Mini", new String[] {"SM-G3568V Build/KOT49H"}, null, ScreenSizeType.SCR4_3, ResolutionType.RES480_800),
	    三星_GALAXY_E7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 21, "三星 Galaxy E7", new String[] {"SM-E7009 Build/KTU84P","SM-E7000 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    三星_GALAXY_GIO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 22, "三星 Galaxy Gio", new String[] {"GT-S5660 Build/GINGERBREAD"}, null, ScreenSizeType.SCR3_2, ResolutionType.RES320_480),
	    三星_GALAXY_GRAND_ON(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 23, "三星 Galaxy Grand On", new String[] {"SM-G5500 Build/LMY47X","SM-G5510 Build/NMF26X"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    三星_GALAXY_GRAND_PRIME(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 24, "三星 GALAXY Grand Prime", new String[] {"SM-G5308W Build/KTU84P","SM-G5309W Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
	    三星_GALAXY_J3(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 25, "三星 Galaxy J3", new String[] {"SM-J3109 Build/LMY47X"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    三星_GALAXY_J3_PRO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 26, "三星 Galaxy J3 Pro", new String[] {"SM-J3110 Build/LMY47X"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    三星_GALAXY_J3_PRO电信定制版(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 27, "三星 GALAXY J3 Pro电信定制版", new String[] {"SM-J3119 Build/LMY47X"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    三星_GALAXY_J5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 28, "三星 GALAXY J5", new String[] {"SM-J5008 Build/LMY47O"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    三星_GALAXY_J7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 29, "三星 Galaxy J7", new String[] {"SM-J7008 Build/LMY47O","SM-J7108 Build/MMB29K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    三星_GALAXY_MEGA_5_8(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 30, "三星 GALAXY Mega 5.8", new String[] {"GT-I9158 Build/JDQ39"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES540_960),
	    三星_GALAXY_MEGA_PLUS(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 31, "三星 GALAXY Mega Plus", new String[] {"GT-I9152P Build/JLS36C"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES540_960),
	    三星_GALAXY_NOTE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 32, "三星 Galaxy Note", new String[] {"GT-N7000 Build/IML74K"}, null, ScreenSizeType.SCR5_3, ResolutionType.RES800_1280),
	    三星_GALAXY_NOTE_3(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 33, "三星 Galaxy Note 3", new String[] {"SM-N9005 Build/JSS15J",
	    		"SM-N9005 Build/KOT49H","SM-N9005 Build/LRX21V","SM-N9008 Build/JSS15J","SM-N9008 Build/LRX21V",
	    		"SM-N9009 Build/JSS15J","SM-N9009 Build/KOT49H","SM-N9009 Build/LRX21V","SM-N900D Build/JSS15J",
	    		"SM-N9006 Build/KOT49H","SM-N9006 Build/LRX21V","SM-N9008S Build/KOT49H","SM-N9008S Build/LRX21V",
	    		"SM-N9008V Build/KOT49H","SM-N9008V Build/LRX21V"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_GALAXY_NOTE_3_LITE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 34, "三星 Galaxy Note 3 Lite", new String[] {"SM-N7508V Build/JLS36C"
	    		,"SM-N7509V Build/JLS36C"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_GALAXY_NOTE_3_N9(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 35, "三星 Galaxy Note 3 N9", new String[] {"SM-N900 Build/KOT49H"
	    		,"SM-N9002 Build/JSS15J","SM-N9002 Build/LRX21V"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_GALAXY_NOTE_3_NEO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 36, "三星 Galaxy Note 3 Neo", new String[] {"SM-N7506V Build/JLS36C"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    三星_GALAXY_NOTE_4(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 37, "三星 Galaxy Note 4", new String[] {"SM-N9100 Build/KTU84P",
	    		"SM-N9100 Build/LMY47X","SM-N9100 Build/LRX21V","SM-N9100 Build/LRX22C","SM-N9100 Build/MMB29M","SM-N9106W Build/MMB29M",
	    		"SM-N9108V Build/LMY47X","SM-N9108V Build/MMB29M","SM-N9109W Build/LMY47X","SM-N9109W Build/MMB29M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    三星_GALAXY_NOTE_5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 38, "三星 Galaxy Note 5", new String[] {"SM-N920C Build/NRD90M","SM-N920L Build/MMB29K"
	    		,"SM-N9200 Build/MMB29K","SM-N9200 Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    三星_GALAXY_NOTE_7_EDGE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 39, "三星 GALAXY Note 7 edge", new String[] {"SM-N935F Build/KTU84P"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    三星_GALAXY_NOTE_8(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 40, "三星 Galaxy Note 8", new String[] {"SM-N950N Build/NMF26X",
	    		"SM-N9500 Build/NMF26X","SM-N9500 Build/R16NW"}, null, ScreenSizeType.SCR6_3, ResolutionType.RES1440_2960),
	    三星_GALAXY_NOTE_8_0(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 41, "三星 Galaxy Note 8.0", new String[] {"GT-N5100 Build/JZO54K",
	    		"GT-N5110 Build/JZO54K"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES800_1280),
	    三星_GALAXY_NOTE_9(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 42, "三星 Galaxy Note 9", new String[] {"SM-N9600 Build/M1AJQ"}, null, ScreenSizeType.SCR6_4, ResolutionType.RES1440_2960),
	    三星_GALAXY_NOTE_EDGE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 43, "三星 GALAXY Note Edge", new String[] {"SM-N9150 Build/LRX22C"}, null, ScreenSizeType.SCR5_6, ResolutionType.RES1440_2960),
	    三星_GALAXY_NOTE_II(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 44, "三星 Galaxy Note II", new String[] {"SHV-E250L Build/KOT49H",
	    		"SCH-N719 Build/JRO03C","SCH-N719 Build/JSS15J"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    三星_GALAXY_NOTE2(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 45, "三星 Galaxy Note2", new String[] {"GT-N7100 Build/JSS15J","GT-N7100 Build/JZO54K"
	    		,"GT-N7100 Build/KOT49H","GT-N7108 Build/JSS15J","GT-N7108D Build/JDQ39"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    三星_GALAXY_ON5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 46, "三星 Galaxy On5", new String[] {"SM-G5528 Build/NMF26X",
	    		"SM-G5700 Build/MMB29M","SM-G5700 Build/NRD90M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    三星_GALAXY_ON7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 47, "三星 Galaxy On7", new String[] {"SM-G6000 Build/LMY47X"
	    		,"SM-G6100 Build/MMB29M","SM-G6100 Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    三星_GALAXY_S_IV_(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 48, "三星 Galaxy S IV ", new String[] {"GT-I9500 Build/JDQ39","GT-I9500 Build/KOT49H"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    三星_GALAXY_S3_NEO(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 49, "三星 Galaxy S3 Neo", new String[] {"GT-I9300I Build/JLS36C"}, null, ScreenSizeType.SCR4_8, ResolutionType.RES720_1280),
	    三星_GALAXY_S4(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 50, "三星 Galaxy S4", new String[] {"SCH-I959 Build/KOT49H","SCH-I959 Build/LRX22C",
	    		"SCH-I959 Build/NJH47F","GT-I9502 Build/LRX22C","GT-I9505 Build/JDQ39","GT-I9507V Build/LRX22C","GT-I9508 Build/KOT49H",
	    		"GT-I9508 Build/LRX22C","GT-I9508V Build/LRX22C"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    三星_GALAXY_S5(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 51, "三星 GALAXY S5", new String[] {"SM-G9006V Build/MMB29M","SM-G9008W Build/LRX21T",
	    		"SM-G9008W Build/MMB29M","SM-G900P Build/LRX21T","SM-G9008V Build/LRX21T","SM-G9008V Build/MMB29M","SM-G9009D Build/LRX21T",
	    		"SM-G9009D Build/MMB29M","SM-G9009W Build/LRX21T","SM-G9009W Build/MMB29M","SM-G9006W Build/LRX21T"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1080_1920),
	    三星_GALAXY_S6(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 52, "三星 GALAXY S6", new String[] {"SM-G9200 Build/LRX22G","SM-G9200 Build/MMB29K",
	    		"SM-G9200 Build/NRD90M","SM-G920K Build/NRD90M","SM-G925P Build/MMB29K","SM-G9208 Build/MMB29K","SM-G9208 Build/NRD90M",
	    		"SM-G9209 Build/MMB29K","SM-G9209 Build/NRD90M"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1440_2560),
	    三星_GALAXY_S6_EDGE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 53, "三星 GALAXY S6 Edge", new String[] {"SM-G9250 Build/LMY47X","SM-G9250 Build/MMB29K"
	    		,"SM-G9250 Build/NRD90M"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1440_2560),
	    三星_GALAXY_S6_EDGE_PLUS(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 54, "三星 GALAXY S6 Edge+", new String[] {"SM-G9287 Build/MMB29K","SM-G9280 Build/LMY47X"
	    		,"SM-G9280 Build/MMB29K","SM-G9280 Build/NRD90M"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1440_2560),
	    三星_GALAXY_S7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 55, "三星 GALAXY S7", new String[] {"SM-G930V Build/NRD90M","SM-G935K Build/R16NW",
	    		"SM-G9508 Build/NRD90M","SM-G9300 Build/MMB29M","SM-G9300 Build/NRD90M","SM-G9300 Build/R16NW","SM-G9308 Build/MMB29M",
	    		"SM-G9308 Build/NRD90M","SM-G9308 Build/R16NW"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1440_2560),
	    三星_GALAXY_S7_EDGE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 56, "三星 GALAXY S7 Edge", new String[] {"SM-G9350 Build/LMY48Z"
	    		,"SM-G9350 Build/MMB29K","SM-G9350 Build/MMB29M","SM-G9350 Build/NRD90M","SM-G9350 Build/R16NW"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1440_2560),
	    三星_GALAXY_S8(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 57, "三星 GALAXY S8", new String[] {"SM-G9508 Build/R16NW","SM-G950F Build/NRD90M",
	    		"SM-G950U Build/R16NW","SM-G9500 Build/NMF26X","SM-G9500 Build/NRD90M","SM-G9500 Build/R16NW"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES1440_2560),
	    三星_GALAXY_S8_LITE(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 58, "三星 Galaxy S8 Lite", new String[] {"SM-G8750 Build/R16NW"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES1440_2560),
	    三星_GALAXY_S8_PLUS(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 59, "三星 GALAXY S8+", new String[] {"SM-G9550 Build/NRD90M","SM-G9550 Build/R16NW"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES1440_2560),
	    三星_GALAXY_S9(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 60, "三星 GALAXY S9", new String[] {"SM-G9600 Build/R16NW"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES1440_2560),
	    三星_GALAXY_S9_PLUS(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 61, "三星 Galaxy S9+", new String[] {"SM-G9650 Build/R16NW"}, null, ScreenSizeType.SCR5_8, ResolutionType.RES1440_2560),
	    三星_GALAXY_TAB(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 62, "三星 GALAXY Tab", new String[] {"GT-P6200 Build/HTJ85B"}, null, ScreenSizeType.SCR7_0, ResolutionType.RES600_1024),
	    三星_GALAXY_TAB_S2(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 63, "三星 Galaxy Tab S2", new String[] {"SM-T715C Build/LRX22G"}, null, ScreenSizeType.SCR8_0, ResolutionType.RES1536_2048),
	    三星_GALAXY_TAB_S3(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 64, "三星 Galaxy Tab S3", new String[] {"SM-T815C Build/MMB29K"}, null, ScreenSizeType.SCR9_7, ResolutionType.RES1536_2048),
	    三星_GALAXY_TABA9_7(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 65, "三星 Galaxy TabA9.7", new String[] {"SM-P550 Build/LRX22G"}, null, ScreenSizeType.SCR9_7, ResolutionType.RES768_1024),
	    三星_GALAXY_TREND_DUOS_II(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 66, "三星 Galaxy Trend Duos II", new String[] {"GT-S7572 Build/JZO54K"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_800),
	    三星_RF_V7100(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 67, "三星 RF-V7100", new String[] {"RF-V7100 Build/RB3N5C"}, null, null, null),
	    三星_SM_G7108(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 68, "三星 SM-G7108", new String[] {"SM-G7108 Build/JLS36C"}, null, ScreenSizeType.SCR5_25, ResolutionType.RES720_1280),
	    三星_SM_G7108V(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 69, "三星 SM-G7108V", new String[] {"SM-G7108V Build/JLS36C"}, null, ScreenSizeType.SCR5_25, ResolutionType.RES720_1280),
	    三星_SM_G7109(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 70, "三星 SM-G7109", new String[] {"SM-G7109 Build/JLS36C"}, null, ScreenSizeType.SCR5_25, ResolutionType.RES720_1280),
	    三星_SM_G7200(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 71, "三星 SM-G7200", new String[] {"SM-G7200 Build/KTU84P"}, null, ScreenSizeType.SCR5_25, ResolutionType.RES720_1280),
	    三星_SM_G928A(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 72, "三星 Galaxy S6 Edge Plus", new String[] {"SAMSUNG-SM-G928A Build/MMB29K"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1440_2560),
	    三星_SM_N900A(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 73, "三星 SM-N900A", new String[] {"SAMSUNG-SM-N900A Build/tt"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    三星_SM_N9500(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 74, "三星 Galaxy Note8", new String[] {"SAMSUNG SM-N9500 Build/R16NW"}, null, ScreenSizeType.SCR6_3, ResolutionType.RES1440_2960),
	    三星_SM_W2016(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 75, "三星 SM-W2016", new String[] {"SM-W2016 Build/LMY47X"}, null, ScreenSizeType.SCR3_9, ResolutionType.RES768_1280),
	    三星_SM_W2017(	MobileBrand.SAMSUNG, Mobile.SAMSUNG, 76, "三星 SM-W2017", new String[] {"SM-W2017 Build/MMB29M"}, null, ScreenSizeType.SCR4_2, ResolutionType.RES1080_1920),
	    
	    SONY(	MobileBrand.SONY, null, 1000, "索尼", new String[] {"D6653 Build/23.0.A.2.93","D6653 Build/23.2.A.1.62","D6683 Build/23.1.2.E.0.13",
	    		"E6533 Build/32.3.A.2.33","E6683 Build/32.0.A.6.209","E6683 Build/32.2.A.0.305","E6683 Build/32.3.A.2.33",
	    		"E6683 Build/32.4.A.1.54","E6853 Build/32.2.A.0.253","E6883 Build/32.0.A.6.209","E6883 Build/32.4.A.1.54",
	    		"G8142 Build/47.1.A.12.119","G8142 Build/47.1.A.12.179","G8142 Build/47.1.A.12.235","G8142 Build/47.1.A.12.270",
	    		"G8142 Build/47.1.A.8.49","G8232 Build/41.2.A.0.219","G8232 Build/41.2.A.7.53","G8232 Build/41.3.A.2.99",
	    		"G8441 Build/47.1.A.12.119","LT25c Build/9.0.E.0.287","F5121 Build/34.0.A.1.247","F8332 Build/41.3.A.2.128",
	    		"G8342 Build/47.1.A.2.324","L39h Build/14.4.A.0.108","L50t Build/17.1.E.2.67","E5823 Build/32.2.A.0.305",
	    		"C6602 Build/10.5.1.A.0.283"}, null, null, null),
	    索尼_D6653(	MobileBrand.SONY, Mobile.SONY, 1, "索尼 D6653", new String[] {"D6653 Build/23.0.A.2.93","D6653 Build/23.2.A.1.62"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    索尼_D6683(	MobileBrand.SONY, Mobile.SONY, 2, "索尼 D6683", new String[] {"D6683 Build/23.1.2.E.0.13"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    索尼_E6533(	MobileBrand.SONY, Mobile.SONY, 3, "索尼 E6533", new String[] {"E6533 Build/32.3.A.2.33"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1440_2560),
	    索尼_E6683(	MobileBrand.SONY, Mobile.SONY, 4, "索尼 E6683", new String[] {"E6683 Build/32.0.A.6.209","E6683 Build/32.2.A.0.305"
	    		,"E6683 Build/32.3.A.2.33","E6683 Build/32.4.A.1.54"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    索尼_E6853(	MobileBrand.SONY, Mobile.SONY, 5, "索尼 E6853", new String[] {"E6853 Build/32.2.A.0.253"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES2160_3840),
	    索尼_E6883(	MobileBrand.SONY, Mobile.SONY, 6, "索尼 E6883", new String[] {"E6883 Build/32.0.A.6.209","E6883 Build/32.4.A.1.54"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES2160_3840),
	    索尼_G8142(	MobileBrand.SONY, Mobile.SONY, 7, "索尼 G8142", new String[] {"G8142 Build/47.1.A.12.119","G8142 Build/47.1.A.12.179",
	    		"G8142 Build/47.1.A.12.235","G8142 Build/47.1.A.12.270","G8142 Build/47.1.A.8.49"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES2160_3840),
	    索尼_G8232(	MobileBrand.SONY, Mobile.SONY, 8, "索尼 G8232", new String[] {"G8232 Build/41.2.A.0.219","G8232 Build/41.2.A.7.53"
	    		,"G8232 Build/41.3.A.2.99"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    索尼_G8441(	MobileBrand.SONY, Mobile.SONY, 9, "索尼 Xperia XZ1 Compact", new String[] {"G8441 Build/47.1.A.12.119"}, null, ScreenSizeType.SCR4_6, ResolutionType.RES720_1280),
	    索尼_LT25C(	MobileBrand.SONY, Mobile.SONY, 10, "索尼 LT25c", new String[] {"LT25c Build/9.0.E.0.287"}, null, ScreenSizeType.SCR4_3, ResolutionType.RES720_1280),
	    索尼_XPERIA_X(	MobileBrand.SONY, Mobile.SONY, 11, "索尼 Xperia X", new String[] {"F5121 Build/34.0.A.1.247"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    索尼_XPERIA_XZ(	MobileBrand.SONY, Mobile.SONY, 12, "索尼 Xperia XZ", new String[] {"F8332 Build/41.3.A.2.128"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    索尼_XPERIA_XZ1(	MobileBrand.SONY, Mobile.SONY, 13, "索尼 Xperia XZ1", new String[] {"G8342 Build/47.1.A.2.324"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    索尼_XPERIA_Z1(	MobileBrand.SONY, Mobile.SONY, 14, "索尼 Xperia Z1", new String[] {"L39h Build/14.4.A.0.108"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    索尼_XPERIA_Z2(	MobileBrand.SONY, Mobile.SONY, 15, "索尼 Xperia Z2", new String[] {"L50t Build/17.1.E.2.67"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    索尼_XPERIA_Z5_COMPACT(	MobileBrand.SONY, Mobile.SONY, 16, "索尼 Xperia Z5 Compact", new String[] {"E5823 Build/32.2.A.0.305"}, null, ScreenSizeType.SCR4_6, ResolutionType.RES720_1280),
	    索尼_XPERIAC6602(	MobileBrand.SONY, Mobile.SONY, 17, "索尼 XperiaC6602", new String[] {"C6602 Build/10.5.1.A.0.283"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    
	    KTOUCH(	MobileBrand.KTOUCH, null, 1000, "天语", new String[] {"K-Touch M3s Plus Build/LMY47D","K-Touch X7 Build/LMY47D"}, null, null, null),
	    天语_M3S_PLUS(	MobileBrand.KTOUCH, Mobile.KTOUCH, 1, "天语 M3s Plus", new String[] {"K-Touch M3s Plus Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    天语_X7(	MobileBrand.KTOUCH, Mobile.KTOUCH, 2, "天语 X7", new String[] {"K-Touch X7 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES540_960),
	    
	    VERTU(	MobileBrand.VERTU, null, 1000, "维图", new String[] {"VOTO GT17 Build/LMY47D"}, null, null, null),
	    维图_GT17(	MobileBrand.VERTU, Mobile.VERTU, 1, "维图 GT17", new String[] {"VOTO GT17 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    
	    SHARP(	MobileBrand.SHARP, null, 1000, "夏普", new String[] {"FS8010 Build/NMF26X","FS8010 Build/OPR1.170623.027"
	    		,"SBM302SH Build/S0014"}, null, null, null),
	    夏普_FS8010(	MobileBrand.SHARP, Mobile.SHARP, 1, "夏普 FS8010", new String[] {"FS8010 Build/NMF26X","FS8010 Build/OPR1.170623.027"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_2048),
	    夏普_SBM302SH(	MobileBrand.SHARP, Mobile.SHARP, 2, "夏普 SBM302SH", new String[] {"SBM302SH Build/S0014"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    
	    AMOI(	MobileBrand.AMOI, null, 1, "夏新", new String[] {"AMOI N828 Build/JOP40D"}, null, null, null),
	    夏新_AMOI_N828(	MobileBrand.AMOI, Mobile.AMOI, 1, "夏新 AMOI N828", new String[] {"AMOI N828 Build/JOP40D"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES540_960),
	    
	    PIONEER(	MobileBrand.PIONEER, null, 1000, "先锋", new String[] {"Pioneer M1 Build/M1V107R01"}, null, null, null),
	    先锋_M1(	MobileBrand.PIONEER, Mobile.PIONEER, 1, "先锋 M1", new String[] {"Pioneer M1 Build/M1V107R01"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES720_1280),
	    
	    LA(	MobileBrand.LA, null, 1000, "小辣椒", new String[] {"HLA Note3 Build/LMY47D","LA-S31 Build/MRA58K","LA-S33 Build/MRA58K"
	    		,"JD-PLUS Build/LMY47D"}, null, null, null),
	    小辣椒_HLA_NOTE3(	MobileBrand.LA, Mobile.LA, 1, "小辣椒 HLA Note3", new String[] {"HLA Note3 Build/LMY47D"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小辣椒_S31(	MobileBrand.LA, Mobile.LA, 2, "小辣椒 S31", new String[] {"LA-S31 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    小辣椒_S33(	MobileBrand.LA, Mobile.LA, 3, "小辣椒 S33", new String[] {"LA-S33 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    小辣椒_红辣椒_JD_PLUS(	MobileBrand.LA, Mobile.LA, 4, "小辣椒 红辣椒 JD-PLUS", new String[] {"JD-PLUS Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	   
	    MI(	MobileBrand.MI, null, 1000, "小米", new String[] {"MI 1S Build/JZO54K","MI 2 Build/LRX22G","MI 2A Build/JRO03L",
	    		"MI 2S Build/JRO03L","MI 2S Build/LRX22G","MIX 2S Build/OPR1.170623.032","MIX 2S Build/PKQ1.180729.001",
	    		"MI 2SC Build/JRO03L","MI 2SC Build/LRX22G","MI 3 Build/KTU84P","MI 3C Build/KTU84P","MI 3C Build/MMB29M",
	    		"MI 3W Build/KTU84P","MI 3W Build/MI+3W","MI 3W Build/MMB29M","MI 4LTE Build/KTU84P","MI 4LTE Build/MMB29M",
	    		"MI 4LTE Build/NDE63X","MI 4LTE Build/NMF26X","MI 4C Build/KTU84P","MI 4C Build/MMB29M","Mi-4c Build/LMY47V",
	    		"Mi-4c Build/NRD90M","MI 4S Build/LMY47V","MI 4S Build/NRD90M","MI 4W Build/KTU84P","MI 4W Build/MMB29M",
	    		"MI 5 Build/MONSTER 1.5","MI 5 Build/MRA58K","MI 5 Build/MXB48T","MI 5 Build/NJH47F","MI 5 Build/NRD90M",
	    		"MI 5 Build/NRD90M-wesley_iui-18.01.26","MI 5 Build/OPR1.170623.032","MI 5 Build/XK_Gemini_1.3.6",
	    		"MI 5 Build/XK_Gemiui_1.3.0","MI 5C Build/MRA58K","MI 5C Build/N2G47J","MI 5s Build/MMB29M",
	    		"MI 5s Build/MXB48T","MI 5s Build/NRD90M","MI 5s Plus Build/MXB48T","MI 5s Plus Build/NRD90M",
	    		"MI 5X Build/N2G47H","MI 6 Build/MIUI9","MI 6 Build/NJH47F","MI 6 Build/NMF26X","MI 6 Build/NRD90M",
	    		"MI 6 Build/OPR1.170623.027","MI 6 Build/OPR1-wesley_iui-18.08.02","MI 6 Build/OPR1-wesley_iui-18.08.28",
	    		"MI 6 Build/SkyMi_Sagit_1.7.3","MI-6S Build/MMB29M","MI 6X Build/OPM1.171019.011","MI 6X Build/OPM6.171019.030.H1",
	    		"MI 8 Build/OPM1.171019.011","MI 8 Build/OPM1.171019.026","MI 8 SE Build/MI 8 SE","MI 8 SE Build/OPM1.171019.019",
	    		"MI MAX Build/MMB29M","MI MAX Build/NRD90M","MI MAX 2 Build/NMF26F","MI MAX 2 Build/NMF26F-wesley_iui-18.08.25",
	    		"MI MAX 3 Build/OPM1.171019.019","MI MAX2 Build/NMF26F","MIX Build/MXB48T","MIX Build/NRD90M","MIX Build/OPR1.170623.032",
	    		"Mi MIX 2 Build/NMF26X","MIX 2 Build/NMF26X","MIX 2 Build/NMF26X-wesley_iui-17.10.20","MIX 2 Build/OPR1.170623.027",
	    		"MIX 2 Build/OPR1-wesley_iui-18.08.11","MI NOTE LTE Build/KTU84P","MI NOTE LTE Build/MMB29M","Mi Note 2 Build/MXB48T",
	    		"Mi Note 2 Build/NRD90M","Mi Note 2 Build/OPR1.170623.032","Mi Note 3 Build/NMF26X","Mi Note 3 Build/OPM1.171019.019",
	    		"MI NOTE Pro Build/LMY47V","MI NOTE Pro Build/LRX22G","MI NOTE Pro Build/NRD90M","MI PAD Build/KTU84P",
	    		"MI PAD 2 Build/LMY47I","MI PAD 3 Build/NRD90M","HM 1S Build/KTU84P","HM 1SC Build/JLS36C","HM 1SW Build/JLS36C",
	    		"2013022 Build/HM2013022","2014011 Build/HM2014011","2014501 Build/KOT49H","2014811 Build/KTU84P",
	    		"2014811 Build/LMY47V","2014811 Build/MMB29T","2014812 Build/KTU84P","2014812 Build/LMY47V","2014813 Build/KTU84P",
	    		"2014813 Build/LMY47V","2014821 Build/KTU84P","HM 2A Build/KTU84Q","Redmi 3 Build/LMY47V","Redmi 3S Build/MMB29M",
	    		"Redmi 3X Build/MMB29M","Redmi 4 Build/MMB29M","Redmi 4A Build/MMB29M","Redmi 4X Build/MMB29M","Redmi 4X Build/N2G47H",
	    		"Redmi 5 Build/N2G47H","Redmi 5 Plus Build/N2G47H","Redmi 5A Build/N2G47H","Redmi 6 Build/O11019",
	    		"Redmi 6 Pro Build/OPM1.171019.019","HM NOTE 1LTETD Build/KTU84P","HM NOTE 1LTE Build/KTU84P","HM NOTE 1LTETD Build/KVT49L",
	    		"HM NOTE 1LTEW Build/KTU84P","HM NOTE 1S Build/KTU84P","HM NOTE 1S-MIUI 7.1 Build/KTU84P",
	    		"HM NOTE 1TD Build/KOT49H","HM NOTE 1W Build/JDQ39","Redmi Note 2 Build/LRX22G","Redmi Note 2 Build/M4B30X",
	    		"Redmi Note 3 Build/LMY47V","Redmi Note 3 Build/LRX22G","Redmi Note 3 Build/MMB29M","Redmi Note 3 Build/N2G47O",
	    		"Redmi Note 3 Build/NJH47F","Redmi Note 4 Build/MRA58K","Redmi Note 4 Build/NRD90M","Redmi Note 4 Build/OPM1.171019.018",
	    		"Redmi Note 4 Build/OPM2.171019.029","Redmi Note 4X Build/MMB29M","Redmi Note 4X Build/MRA58K","Redmi Note 4X Build/NRD90M",
	    		"Redmi Note 5 Build/OPM1.171019.011","Redmi Note 5A Build/N2G47H","Redmi Pro Build/MRA58K"}, null, null, null),
	    小米_1S(	MobileBrand.MI, Mobile.MI, 1, "小米 1S", new String[] {"MI 1S Build/JZO54K"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_2(	MobileBrand.MI, Mobile.MI, 2, "小米 2", new String[] {"MI 2 Build/LRX22G"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_800),
	    小米_2A(	MobileBrand.MI, Mobile.MI, 3, "小米 2A", new String[] {"MI 2A Build/JRO03L"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_2S(	MobileBrand.MI, Mobile.MI, 4, "小米 2S", new String[] {"MI 2S Build/JRO03L","MI 2S Build/LRX22G","MIX 2S Build/OPR1.170623.032",
	    		"MIX 2S Build/PKQ1.180729.001"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_2SC(	MobileBrand.MI, Mobile.MI, 5, "小米 2SC", new String[] {"MI 2SC Build/JRO03L","MI 2SC Build/LRX22G"}, null, ScreenSizeType.SCR4_3, ResolutionType.RES720_1280),
	    小米_3(	MobileBrand.MI, Mobile.MI, 1, "小米 3", new String[] {"MI 3 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_3C(	MobileBrand.MI, Mobile.MI, 6, "小米 3C", new String[] {"MI 3C Build/KTU84P","MI 3C Build/MMB29M"}, null, ScreenSizeType.SCR7_9, ResolutionType.RES1536_2048),
	    小米_3联通版(	MobileBrand.MI, Mobile.MI, 7, "小米 3联通版", new String[] {"MI 3W Build/KTU84P","MI 3W Build/MI+3W","MI 3W Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_4(	MobileBrand.MI, Mobile.MI, 8, "小米 4", new String[] {"MI 4LTE Build/KTU84P","MI 4LTE Build/MMB29M","MI 4LTE Build/NDE63X",
	    		"MI 4LTE Build/NMF26X"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    小米_4C(	MobileBrand.MI, Mobile.MI, 9, "小米 4C", new String[] {"MI 4C Build/KTU84P","MI 4C Build/MMB29M","Mi-4c Build/LMY47V",
	    		"Mi-4c Build/NRD90M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    小米_4S(	MobileBrand.MI, Mobile.MI, 10, "小米 4S", new String[] {"MI 4S Build/LMY47V","MI 4S Build/NRD90M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    小米_4联通版(	MobileBrand.MI, Mobile.MI, 11, "小米 4联通版", new String[] {"MI 4W Build/KTU84P","MI 4W Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    小米_5(	MobileBrand.MI, Mobile.MI, 12, "小米 5", new String[] {"MI 5 Build/MONSTER 1.5","MI 5 Build/MRA58K","MI 5 Build/MXB48T",
	    		"MI 5 Build/NJH47F","MI 5 Build/NRD90M","MI 5 Build/NRD90M-wesley_iui-18.01.26","MI 5 Build/OPR1.170623.032",
	    		"MI 5 Build/XK_Gemini_1.3.6","MI 5 Build/XK_Gemiui_1.3.0"}, null, ScreenSizeType.SCR4_0, ResolutionType.RES480_800),
	    小米_5C(	MobileBrand.MI, Mobile.MI, 13, "小米 5C", new String[] {"MI 5C Build/MRA58K","MI 5C Build/N2G47J"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    小米_5S(	MobileBrand.MI, Mobile.MI, 14, "小米 5s", new String[] {"MI 5s Build/MMB29M","MI 5s Build/MXB48T","MI 5s Build/NRD90M"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_5S_PLUS(	MobileBrand.MI, Mobile.MI, 15, "小米 5s Plus", new String[] {"MI 5s Plus Build/MXB48T","MI 5s Plus Build/NRD90M"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES1080_1920),
	    小米_5X(	MobileBrand.MI, Mobile.MI, 16, "小米 5X", new String[] {"MI 5X Build/N2G47H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_6(	MobileBrand.MI, Mobile.MI, 17, "小米 6", new String[] {"MI 6 Build/MIUI9","MI 6 Build/NJH47F","MI 6 Build/NMF26X",
	    		"MI 6 Build/NRD90M","MI 6 Build/OPR1.170623.027","MI 6 Build/OPR1-wesley_iui-18.08.02","MI 6 Build/OPR1-wesley_iui-18.08.28",
	    		"MI 6 Build/SkyMi_Sagit_1.7.3"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
	    小米_6S(	MobileBrand.MI, Mobile.MI, 18, "小米 6S", new String[] {"MI-6S Build/MMB29M"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    小米_6X(	MobileBrand.MI, Mobile.MI, 19, "小米 6X", new String[] {"MI 6X Build/OPM1.171019.011","MI 6X Build/OPM6.171019.030.H1"}, null, ScreenSizeType.SCR5_1, ResolutionType.RES1080_1920),
	    小米_8(	MobileBrand.MI, Mobile.MI, 20, "小米 8", new String[] {"MI 8 Build/OPM1.171019.011","MI 8 Build/OPM1.171019.026"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
	    小米_8_SE(	MobileBrand.MI, Mobile.MI, 21, "小米 8 SE", new String[] {"MI 8 SE Build/MI 8 SE","MI 8 SE Build/OPM1.171019.019"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_MAX(	MobileBrand.MI, Mobile.MI, 22, "小米 MAX", new String[] {"MI MAX Build/MMB29M","MI MAX Build/NRD90M"}, null, ScreenSizeType.SCR6_4, ResolutionType.RES1080_1920),
	    小米_MAX_2(	MobileBrand.MI, Mobile.MI, 23, "小米 MAX 2", new String[] {"MI MAX 2 Build/NMF26F","MI MAX 2 Build/NMF26F-wesley_iui-18.08.25"}, null, ScreenSizeType.SCR6_4, ResolutionType.RES1080_1920),
	    小米_MAX_3(	MobileBrand.MI, Mobile.MI, 24, "小米 MAX 3", new String[] {"MI MAX 3 Build/OPM1.171019.019"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    小米_MAX2(	MobileBrand.MI, Mobile.MI, 25, "小米 MAX2", new String[] {"MI MAX2 Build/NMF26F"}, null, ScreenSizeType.SCR6_4, ResolutionType.RES1080_1920),
	    小米_MIX(	MobileBrand.MI, Mobile.MI, 26, "小米 MIX", new String[] {"MIX Build/MXB48T","MIX Build/NRD90M","MIX Build/OPR1.170623.032"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES1080_1920),
	    小米_MIX_2(	MobileBrand.MI, Mobile.MI, 27, "小米 MIX 2", new String[] {"Mi MIX 2 Build/NMF26X","MIX 2 Build/NMF26X",
	    		"MIX 2 Build/NMF26X-wesley_iui-17.10.20","MIX 2 Build/OPR1.170623.027","MIX 2 Build/OPR1-wesley_iui-18.08.11"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_NOTE(	MobileBrand.MI, Mobile.MI, 28, "小米 Note", new String[] {"MI NOTE LTE Build/KTU84P","MI NOTE LTE Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_NOTE_2(	MobileBrand.MI, Mobile.MI, 29, "小米 Note 2", new String[] {"Mi Note 2 Build/MXB48T","Mi Note 2 Build/NRD90M"
	    		,"Mi Note 2 Build/OPR1.170623.032"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_NOTE_3(	MobileBrand.MI, Mobile.MI, 30, "小米 Note 3", new String[] {"Mi Note 3 Build/NMF26X","Mi Note 3 Build/OPM1.171019.019"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_NOTE_PRO(	MobileBrand.MI, Mobile.MI, 31, "小米 NOTE Pro", new String[] {"MI NOTE Pro Build/LMY47V","MI NOTE Pro Build/LRX22G"
	    		,"MI NOTE Pro Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_PAD(	MobileBrand.MI, Mobile.MI, 32, "小米 PAD", new String[] {"MI PAD Build/KTU84P"}, null, ScreenSizeType.SCR7_9, ResolutionType.RES1536_2048),
	    小米_PAD_2(	MobileBrand.MI, Mobile.MI, 33, "小米 PAD 2", new String[] {"MI PAD 2 Build/LMY47I"}, null, ScreenSizeType.SCR7_9, ResolutionType.RES1536_2048),
	    小米_PAD_3(	MobileBrand.MI, Mobile.MI, 34, "小米 PAD 3", new String[] {"MI PAD 3 Build/NRD90M"}, null, ScreenSizeType.SCR7_9, ResolutionType.RES1536_2048),
	    小米_红米_1S(	MobileBrand.MI, Mobile.MI, 35, "小米 红米 1S", new String[] {"HM 1S Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    小米_红米_1SC(	MobileBrand.MI, Mobile.MI, 36, "小米 红米 1SC", new String[] {"HM 1SC Build/JLS36C"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_1SW(	MobileBrand.MI, Mobile.MI, 37, "小米 红米 1SW", new String[] {"HM 1SW Build/JLS36C"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2013022(	MobileBrand.MI, Mobile.MI, 38, "小米 红米 1", new String[] {"2013022 Build/HM2013022"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2014011(	MobileBrand.MI, Mobile.MI, 39, "小米 红米 1", new String[] {"2014011 Build/HM2014011"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2014501(	MobileBrand.MI, Mobile.MI, 40, "小米 红米 1", new String[] {"2014501 Build/KOT49H"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2014811(	MobileBrand.MI, Mobile.MI, 41, "小米 红米 2", new String[] {"2014811 Build/KTU84P","2014811 Build/LMY47V"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2014812(	MobileBrand.MI, Mobile.MI, 42, "小米 红米 2", new String[] {"2014812 Build/KTU84P","2014812 Build/LMY47V"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2014813(	MobileBrand.MI, Mobile.MI, 43, "小米 红米 2", new String[] {"2014813 Build/KTU84P","2014813 Build/LMY47V"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2014821(	MobileBrand.MI, Mobile.MI, 44, "小米 红米 2", new String[] {"2014821 Build/KTU84P"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_2A(	MobileBrand.MI, Mobile.MI, 45, "小米 红米 2A", new String[] {"HM 2A Build/KTU84Q"}, null, ScreenSizeType.SCR4_7, ResolutionType.RES720_1280),
	    小米_红米_3(	MobileBrand.MI, Mobile.MI, 46, "小米 红米 3", new String[] {"Redmi 3 Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    小米_红米_3S(	MobileBrand.MI, Mobile.MI, 47, "小米 红米 3S", new String[] {"Redmi 3S Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    小米_红米_3X(	MobileBrand.MI, Mobile.MI, 48, "小米 红米 3X", new String[] {"Redmi 3X Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    小米_红米_4(	MobileBrand.MI, Mobile.MI, 49, "小米 红米 4", new String[] {"Redmi 4 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_4A(	MobileBrand.MI, Mobile.MI, 50, "小米 红米 4A", new String[] {"Redmi 4A Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_4X(	MobileBrand.MI, Mobile.MI, 51, "小米 红米 4X", new String[] {"Redmi 4X Build/MMB29M","Redmi 4X Build/N2G47H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_5(	MobileBrand.MI, Mobile.MI, 52, "小米 红米 5", new String[] {"Redmi 5 Build/N2G47H"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
	    小米_红米_5_PLUS(	MobileBrand.MI, Mobile.MI, 53, "小米 红米 5 Plus", new String[] {"Redmi 5 Plus Build/N2G47H"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
	    小米_红米_5A(	MobileBrand.MI, Mobile.MI, 54, "小米 红米 5A", new String[] {"Redmi 5A Build/N2G47H"}, null, ScreenSizeType.SCR5_7, ResolutionType.RES720_1440),
	    小米_红米_6(	MobileBrand.MI, Mobile.MI, 55, "小米 红米 6", new String[] {"Redmi 6 Build/O11019"}, null, ScreenSizeType.SCR5_45, ResolutionType.RES720_1440),
	    小米_红米_6_PRO(	MobileBrand.MI, Mobile.MI, 56, "小米 红米 6 Pro", new String[] {"Redmi 6 Pro Build/OPM1.171019.019"}, null, ScreenSizeType.SCR5_84, ResolutionType.RES1080_2280),
	    小米_红米_NOTE(	MobileBrand.MI, Mobile.MI, 57, "小米 红米 Note", new String[] {"HM NOTE 1LTETD Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1(	MobileBrand.MI, Mobile.MI, 58, "小米 红米 Note 1", new String[] {"HM NOTE 1LTE Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1LTETD(	MobileBrand.MI, Mobile.MI, 59, "小米 红米 NOTE 1LTETD", new String[] {"HM NOTE 1LTETD Build/KVT49L"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1LTEW(	MobileBrand.MI, Mobile.MI, 60, "小米 红米 NOTE 1LTEW", new String[] {"HM NOTE 1LTEW Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1S(	MobileBrand.MI, Mobile.MI, 61, "小米 红米 NOTE 1S", new String[] {"HM NOTE 1S Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1S_MIUI_7_1(	MobileBrand.MI, Mobile.MI, 62, "小米 红米 NOTE 1S-MIUI 7.1", new String[] {"HM NOTE 1S-MIUI 7.1 Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1TD(	MobileBrand.MI, Mobile.MI, 63, "小米 红米 NOTE 1TD", new String[] {"HM NOTE 1TD Build/KOT49H"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_1W(	MobileBrand.MI, Mobile.MI, 64, "小米 红米 NOTE 1W", new String[] {"HM NOTE 1W Build/JDQ39"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_2(	MobileBrand.MI, Mobile.MI, 65, "小米 红米 Note 2", new String[] {"Redmi Note 2 Build/LRX22G","Redmi Note 2 Build/M4B30X"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_红米_NOTE_3(	MobileBrand.MI, Mobile.MI, 66, "小米 红米 Note 3", new String[] {"Redmi Note 3 Build/LMY47V","Redmi Note 3 Build/LRX22G",
	    		"Redmi Note 3 Build/MMB29M","Redmi Note 3 Build/N2G47O","Redmi Note 3 Build/NJH47F"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_红米_NOTE_4(	MobileBrand.MI, Mobile.MI, 67, "小米 红米 Note 4", new String[] {"Redmi Note 4 Build/MRA58K","Redmi Note 4 Build/NRD90M"
	    		,"Redmi Note 4 Build/OPM1.171019.018","Redmi Note 4 Build/OPM2.171019.029"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    小米_红米_NOTE_4X(	MobileBrand.MI, Mobile.MI, 68, "小米 红米 Note 4X", new String[] {"Redmi Note 4X Build/MMB29M","Redmi Note 4X Build/MRA58K"
	    		,"Redmi Note 4X Build/NRD90M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    小米_红米_NOTE_5(	MobileBrand.MI, Mobile.MI, 69, "小米 红米 Note 5", new String[] {"Redmi Note 5 Build/OPM1.171019.011"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    小米_红米_NOTE_5A(	MobileBrand.MI, Mobile.MI, 70, "小米 红米 Note 5A", new String[] {"Redmi Note 5A Build/N2G47H"}, null, ScreenSizeType.SCR5_99, ResolutionType.RES1080_2160),
	    小米_红米_PRO(	MobileBrand.MI, Mobile.MI, 71, "小米 红米 Pro", new String[] {"Redmi Pro Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    VIRTUAL(	MobileBrand.VIRTUAL, null, 1000, "虚拟机", new String[] {"iToolsVM Build/KTU84P"}, null, null, null),
	    虚拟机_ITOOLS(	MobileBrand.VIRTUAL, Mobile.VIRTUAL, 1, "虚拟机 iTools", new String[] {"iToolsVM Build/KTU84P"}, null, null, null),
	    
	    ONEPLUS(	MobileBrand.ONEPLUS, null, 1000, "一加", new String[] {"ONEPLUS","A0001 Build/JLS36C","A0001 Build/KTU84P","A0001 Build/KTU84Q",
	    		"A0001 Build/LMY47V","A1001 Build/JLS36I","ONE A2001 Build/LMY47V","ONE A2001 Build/MMB29M"}, null, null, null),
	    一加_3T_A3003(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 1, "一加 3T A3003", new String[] {"ONEPLUS A3003 Build/NMF26F"}, null, null, null),
	    一加_3T_A3010(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 2, "一加 3T A3010", new String[] {"ONEPLUS A3010"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    一加_5T_A5010(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 3, "一加 5T A5010", new String[] {"ONEPLUS A5010"}, null, ScreenSizeType.SCR6_01, ResolutionType.RES1080_2160),
	    一加_6T_A6000(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 4, "一加 6T A6000", new String[] {"ONEPLUS A6000 Build/OPM1.171019.011"}, null, ScreenSizeType.SCR6_41, ResolutionType.RES1080_2340),
	    一加_A0001(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 5, "一加 A0001", new String[] {"A0001 Build/JLS36C","A0001 Build/KTU84P","A0001 Build/KTU84Q",
	    		"A0001 Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    一加_A1001(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 6, "一加 A1001", new String[] {"A1001 Build/JLS36I"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    一加_E1000(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 7, "一加 E1000", new String[] {"ONE E1000 Build/MMB29M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    一加_E1001(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 8, "一加 E1001", new String[] {"ONE E1001 Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    一加_手机2代低配版(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 9, "一加 手机2代低配版", new String[] {"ONE A2001 Build/LMY47V","ONE A2001 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    一加_手机3(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 10, "一加 手机3", new String[] {"ONEPLUS A3000"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    一加_手机5(	MobileBrand.ONEPLUS, Mobile.ONEPLUS, 11, "一加 手机5", new String[] {"ONEPLUS A5000"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    INTKI(	MobileBrand.INTKI, null, 1000, "英特奇", new String[] {"Intki"}, null, null, null),
	    英特奇_E78(	MobileBrand.INTKI, Mobile.INTKI, 1, "英特奇 E78", new String[] {"Intki-E78 Build/JDQ39"}, null, null, null),
	    
	    YLT(	MobileBrand.YLT, null, 1, "永隆通", new String[] {"YLT X6-R9S Build/MRA58K"}, null, null, null),
	    永隆通_X6_R9S(	MobileBrand.YLT, Mobile.YLT, 1, "永隆通 X6-R9S", new String[] {"YLT X6-R9S Build/MRA58K"}, null, ScreenSizeType.SCR5_25, ResolutionType.RES1080_1920),
	   
	    YUFLY(	MobileBrand.YUFLY, null, 1000, "宇飞来", new String[] {"YU FLY F9 Build/NMF26F"}, null, null, null),
	    宇飞来_F9(	MobileBrand.YUFLY, Mobile.YUFLY, 1, "宇飞来 F9", new String[] {"YU FLY F9 Build/NMF26F"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1440_2560),
	    
	    YEPEN(	MobileBrand.YEPEN, null, 1000, "誉品", new String[] {"YEPEN"}, null, null, null),
	    誉品_G1(	MobileBrand.YEPEN, Mobile.YEPEN, 1, "誉品 G1", new String[] {"YEPEN Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
	    誉品_G2(	MobileBrand.YEPEN, Mobile.YEPEN, 2, "誉品 G2", new String[] {"YEPEN G2 Build/JLS36C"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
	    
	    SPREADTRUM(	MobileBrand.SPREADTRUM, null, 1000, "展讯", new String[] {"6825C Build/KOT49H"}, null, null, null),
	    展讯_6825C(	MobileBrand.SPREADTRUM, Mobile.SPREADTRUM, 1, "展讯 6825C", new String[] {"6825C Build/KOT49H"}, null, null, null),
	    
	    CHANGHONG(	MobileBrand.CHANGHONG, null, 1000, "长虹", new String[] {"H2 Build/KTU84P","P01 Build/LMY47D"}, null, null, null),
	    长虹_H2(	MobileBrand.CHANGHONG, Mobile.CHANGHONG, 1, "长虹 H2", new String[] {"H2 Build/KTU84P"}, null, ScreenSizeType.SCR4_5, ResolutionType.RES480_854),
	    长虹_P01(	MobileBrand.CHANGHONG, Mobile.CHANGHONG, 1, "长虹 P01", new String[] {"P01 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    
	    BESTSONNY(	MobileBrand.BESTSONNY, null, 1000, "至尊宝", new String[] {"Best sonny"}, null, null, null),
	    至尊宝_BEST_SONNY_LT918(	MobileBrand.BESTSONNY, Mobile.BESTSONNY, 1, "至尊宝 Best sonny LT918", new String[] {"Best sonny LT918 Build/NRD90M"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    
	    CMCC(	MobileBrand.CMCC, null, 1000, "中国移动", new String[] {"M623C Build/LMY47V","M631 Build/LMY47V","M636 Build/LMY47V","M823 Build/LRX22G"
	    		,"M836 Build/MMB29M"}, null, null, null),
	    中国移动_A1(	MobileBrand.CMCC, Mobile.CMCC, 1, "中国移动 A1", new String[] {"M623C Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中国移动_A1S(	MobileBrand.CMCC, Mobile.CMCC, 2, "中国移动 A1s", new String[] {"M631 Build/LMY47V"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中国移动_A2(	MobileBrand.CMCC, Mobile.CMCC, 3, "中国移动 A2", new String[] {"M636 Build/LMY47V"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    中国移动_N1(	MobileBrand.CMCC, Mobile.CMCC, 4, "中国移动 N1", new String[] {"M823 Build/LRX22G"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    中国移动_N2(	MobileBrand.CMCC, Mobile.CMCC, 5, "中国移动 N2", new String[] {"M836 Build/MMB29M"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    
	    ZTE(	MobileBrand.ZTE, null, 1000, "中兴", new String[] {"ZTE","N9180 Build/KVT49L","N958St Build/KTU84P",
	    		"X9180 Build/KVT49L"}, null, null, null),
	    中兴_A2017(	MobileBrand.ZTE, Mobile.ZTE, 1, "中兴 A2017", new String[] {"ZTE A2017 Build/MMB29M","ZTE A2017 Build/NMF26V",
	    		"ZTE A2017 Build/OPR1.170623.032"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    中兴_A2018(	MobileBrand.ZTE, Mobile.ZTE, 2, "中兴 A2018", new String[] {"ZTE A2018 Build/MXB48T"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1440_2560),
	    中兴_AXON_MINI(	MobileBrand.ZTE, Mobile.ZTE, 3, "中兴 AXON Mini", new String[] {"ZTE B2015 Build/MMB29M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    中兴_AXON天机(	MobileBrand.ZTE, Mobile.ZTE, 4, "中兴 AXON天机", new String[] {"ZTE A2015 Build/LRX22G",
	    		"ZTE A2015 Build/MMB29M","ZTE A2015 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    中兴_BA510(	MobileBrand.ZTE, Mobile.ZTE, 5, "中兴 BA510", new String[] {"ZTE BA510 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BA520(	MobileBrand.ZTE, Mobile.ZTE, 6, "中兴 BA520", new String[] {"ZTE BA520 Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BA601(	MobileBrand.ZTE, Mobile.ZTE, 7, "中兴 BA601", new String[] {"ZTE BA601 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BA610C(	MobileBrand.ZTE, Mobile.ZTE, 8, "中兴 BA610C", new String[] {"ZTE BA610C Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BA611T(	MobileBrand.ZTE, Mobile.ZTE, 9, "中兴 BA611T", new String[] {"ZTE BA611T Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BA910(	MobileBrand.ZTE, Mobile.ZTE, 10, "中兴 BA910", new String[] {"ZTE BA910 Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BLADE_A2_PLUS(	MobileBrand.ZTE, Mobile.ZTE, 11, "中兴 Blade A2 Plus", new String[] {"ZTE BV0730 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    中兴_BV0710(	MobileBrand.ZTE, Mobile.ZTE, 12, "中兴 BV0710", new String[] {"ZTE BV0710 Build/MRA58K"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES1080_1920),
	    中兴_BV0720T(	MobileBrand.ZTE, Mobile.ZTE, 13, "中兴 BV0720T", new String[] {"ZTE BV0720T Build/MRA58K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_BV0800(	MobileBrand.ZTE, Mobile.ZTE, 14, "中兴 BV0800", new String[] {"ZTE BV0800 Build/NRD90M"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES1080_1920),
	    中兴_C2016(	MobileBrand.ZTE, Mobile.ZTE, 15, "中兴 C2016", new String[] {"ZTE C2016 Build/MRA58K"}, null, ScreenSizeType.SCR6_0, ResolutionType.RES1080_1920),
	    中兴_C880U(	MobileBrand.ZTE, Mobile.ZTE, 16, "中兴 C880U", new String[] {"ZTE C880U Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_G718C(	MobileBrand.ZTE, Mobile.ZTE, 17, "中兴 G718C", new String[] {"ZTE G718C Build/KVT49L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_N919(	MobileBrand.ZTE, Mobile.ZTE, 18, "中兴 N919", new String[] {"ZTE N919 Build/JZO54K"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES540_960),
	    中兴_Q301C电信版(	MobileBrand.ZTE, Mobile.ZTE, 19, "中兴 Q301C电信版", new String[] {"ZTE Q301C Build/JLS36C"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES480_854),
	    中兴_Q802C(	MobileBrand.ZTE, Mobile.ZTE, 20, "中兴 Q802C", new String[] {"ZTE Q802C Build/KTU84P"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_Q806T(	MobileBrand.ZTE, Mobile.ZTE, 21, "中兴 Q806T", new String[] {"ZTE Q806T Build/LMY47D"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_S2002(	MobileBrand.ZTE, Mobile.ZTE, 22, "中兴 S2002", new String[] {"ZTE S2002 Build/KVT49L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES1080_1920),
	    中兴_STAR(	MobileBrand.ZTE, Mobile.ZTE, 23, "中兴 STAR", new String[] {"ZTE STAR Build/KVT49L"}, null, ScreenSizeType.SCR3_8, ResolutionType.RES480_800),
	    中兴_V5(	MobileBrand.ZTE, Mobile.ZTE, 24, "中兴 V5", new String[] {"N9180 Build/KVT49L"}, null, ScreenSizeType.SCR5_0, ResolutionType.RES720_1280),
	    中兴_V5_MAX(	MobileBrand.ZTE, Mobile.ZTE, 25, "中兴 V5 MAX", new String[] {"N958St Build/KTU84P"}, null, ScreenSizeType.SCR5_5, ResolutionType.RES720_1280),
	    中兴_X9180(	MobileBrand.ZTE, Mobile.ZTE, 26, "中兴 X9180", new String[] {"X9180 Build/KVT49L"}, null, ScreenSizeType.SCR5_2, ResolutionType.RES720_1280),

	UNKNOWN(	MobileBrand.UNKNOWN, null, 1000, "Unknown", new String[0], null, null, null);

	/*
	 * An id for each browser version which is unique per manufacturer. 
	 */
	private final short id;
	private final String name;
	private final String[] aliases;
	private final String[] excludeList; // don't match when these values are in the agent-string
	
	private final MobileBrand mobileBrand;
	
	private final Mobile parent;
	private List<Mobile> children;
	
	private static List<Mobile> topLevelBrowsers;

	private String mobileId = "UNKNOWN"; // 手机识别码
	
	private final ScreenSizeType screenSize; // 屏幕尺寸
	private final ResolutionType resolution; //屏幕分辨率
	
	private Mobile(MobileBrand mobileBrand, Mobile parent, int versionId, String name, String[] aliases, String[] exclude
			, ScreenSizeType screenSize, ResolutionType resolution) {
		this.id =  (short) ( ( mobileBrand.getId() << 8) + (byte) versionId);
        this.mobileBrand = mobileBrand;
		this.name = name;
		this.parent = parent;
		this.children = new ArrayList<Mobile>();
		this.aliases = Utils.toLowerCase(aliases);
		this.excludeList = Utils.toLowerCase(exclude);
		this.screenSize = screenSize;
		this.resolution = resolution;
		if (this.parent == null)
			addTopLevelBrowser(this);
		else
			this.parent.children.add(this);
	}

  // create collection of top level browsers during initialization
	private static void addTopLevelBrowser(Mobile mobile) {
		if(topLevelBrowsers == null)
			topLevelBrowsers = new ArrayList<Mobile>();
		topLevelBrowsers.add(mobile);
	}

	public short getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getMobileId() {
		return mobileId;
	}
	
	public ScreenSizeType getScreenSize() {
		return screenSize;
	}
	
	public ResolutionType getResolution() {
		return resolution;
	}

	/**
	 * @return the mobileBrand
	 */
	public MobileBrand getMobileBrand() {
		return mobileBrand;
	}

	/**
	 * @return top level browser family
	 */
	public Mobile getGroup() {
		if (this.parent != null) {
			return parent.getGroup();
		}
		return this;
	}

    /*
     * Checks if the given user-agent string matches to the browser.
     * Only checks for one specific browser.
     */
    public boolean isInUserAgentString(String agentString)
    {
        if (agentString == null)
            return false;

        String agentStringLowerCase = agentString.toLowerCase();
        return isInUserAgentLowercaseString(agentStringLowerCase);
    }

    private boolean isInUserAgentLowercaseString(String agentStringLowerCase) {
        return Utils.contains(agentStringLowerCase, aliases);
    }

    private Mobile checkUserAgentLowercase(String agentLowercaseString) {
        if (this.isInUserAgentLowercaseString(agentLowercaseString)) {
            
        	for (String aliase : aliases) {
            	if(agentLowercaseString.contains(aliase)){
            		this.mobileId = aliase;
            		break;
            	}
            }
            
            if (this.children.size() > 0) {
                for (Mobile childMobile : this.children) {
                    Mobile match = childMobile.checkUserAgentLowercase(agentLowercaseString);
                    if (match != null) {
                        return match;
                    }
                }
            }

            // if children didn't match we continue checking the current to prevent false positives
            if (!Utils.contains(agentLowercaseString, excludeList)) {
                return this;
            }
            
        }
        return null;
    }

	/**
	 * Iterates over all Browsers to compare the browser signature with
	 * the user agent string. If no match can be found Browser.UNKNOWN will
	 * be returned.
	 * Starts with the top level browsers and only if one of those matches
	 * checks children browsers.
	 * Steps out of loop as soon as there is a match.
	 * @param agentString User-agent sting as provided in the request.
	 * @return Browser enum
	 */
	public static Mobile parseUserAgentString(String agentString)
	{
		return parseUserAgentString(agentString, topLevelBrowsers);
	}

    public static Mobile parseUserAgentLowercaseString(String agentString)
    {
        if (agentString == null) {
            return Mobile.UNKNOWN;
        }
        return parseUserAgentLowercaseString(agentString, topLevelBrowsers);
    }

    /**
     * Iterates over the given Browsers (incl. children) to compare the browser
     * signature with the user agent string.
     * If no match can be found Browser.UNKNOWN will be returned.
     * Steps out of loop as soon as there is a match.
     * Be aware that if the order of the provided Browsers is incorrect or if the set is too limited it can lead to false matches!
     * @param agentString User-agent sting as provided in the request.
     * @param browsers List of browsers.
     * @return Browser enum
     */
    public static Mobile parseUserAgentString(String agentString, List<Mobile> mobiles)
    {
        if (agentString != null) {
            String agentLowercaseString = agentString.toLowerCase();
            return parseUserAgentLowercaseString(agentLowercaseString, mobiles);
        }
        return Mobile.UNKNOWN;
    }

    private static Mobile parseUserAgentLowercaseString(String agentLowercaseString, List<Mobile> mobiles) {
        for (Mobile mobile : mobiles) {
            Mobile match = mobile.checkUserAgentLowercase(agentLowercaseString);
            if (match != null) {
                return match; // either current operatingSystem or a child object
            }
        }
        return Mobile.UNKNOWN;
    }

	/**
	 * Returns the enum constant of this type with the specified id.
	 * Throws IllegalArgumentException if the value does not exist.
	 * @param id Id of the browser
	 * @return Browser enum
	 */
	public static Mobile valueOf(short id)
	{
		for (Mobile mobile : Mobile.values())
		{
			if (mobile.getId() == id)
				return mobile;
		}

		// same behavior as standard valueOf(string) method
		throw new IllegalArgumentException(
	            "No enum const for id " + id);
	}



}
