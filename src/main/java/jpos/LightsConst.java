//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// LightsConst
//
//   Lights constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 2008-Jan-14 JavaPOS Release 1.12                                BS
//   New device category.
// 2023-Apr-17 JavaPOS Release 1.16                                MC
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface LightsConst
{
    /////////////////////////////////////////////////////////////////////
    // "CapAlarm" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int LGT_ALARM_NOALARM                    = 0x00000001;
    public static final int LGT_ALARM_SLOW                       = 0x00000010;
    public static final int LGT_ALARM_MEDIUM                     = 0x00000020;
    public static final int LGT_ALARM_FAST                       = 0x00000040;
    public static final int LGT_ALARM_CUSTOM1                    = 0x00010000;
    public static final int LGT_ALARM_CUSTOM2                    = 0x00020000;


    /////////////////////////////////////////////////////////////////////
    // "CapColor" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int LGT_COLOR_PRIMARY                    = 0x00000001;
    public static final int LGT_COLOR_CUSTOM1                    = 0x00010000;
    public static final int LGT_COLOR_CUSTOM2                    = 0x00020000;
    public static final int LGT_COLOR_CUSTOM3                    = 0x00040000;
    public static final int LGT_COLOR_CUSTOM4                    = 0x00080000;
    public static final int LGT_COLOR_CUSTOM5                    = 0x00100000;


    /////////////////////////////////////////////////////////////////////
    // "CapPattern" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int LGT_PATTERN_NOPATTERN                = 0x00000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM1                  = 0x00000001;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM2                  = 0x00000002;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM3                  = 0x00000004;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM4                  = 0x00000008;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM5                  = 0x00000010;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM6                  = 0x00000020;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM7                  = 0x00000040;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM8                  = 0x00000080;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM9                  = 0x00000100;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM10                 = 0x00000200;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM11                 = 0x00000400;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM12                 = 0x00000800;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM13                 = 0x00001000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM14                 = 0x00002000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM15                 = 0x00004000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM16                 = 0x00008000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM17                 = 0x00010000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM18                 = 0x00020000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM19                 = 0x00040000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM20                 = 0x00080000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM21                 = 0x00100000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM22                 = 0x00200000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM23                 = 0x00400000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM24                 = 0x00800000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM25                 = 0x01000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM26                 = 0x02000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM27                 = 0x04000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM28                 = 0x08000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM29                 = 0x10000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM30                 = 0x20000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM31                 = 0x40000000;     // New in 1.16
    public static final int LGT_PATTERN_CUSTOM32                 = 0x80000000;     // New in 1.16
}
