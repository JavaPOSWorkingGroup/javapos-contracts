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
// ScaleConst
//
//   Scale constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 98-02-18 JavaPOS Release 1.2                                   BS
//
/////////////////////////////////////////////////////////////////////

package jpos;

public interface ScaleConst
{
    //###################################################################
    //#### Scale Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "WeightUnit" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int SCAL_WU_GRAM         = 1;
    public static final int SCAL_WU_KILOGRAM     = 2;
    public static final int SCAL_WU_OUNCE        = 3;
    public static final int SCAL_WU_POUND        = 4;


    /////////////////////////////////////////////////////////////////////
    // "ResultCodeExtended" Property Constants for Scale
    /////////////////////////////////////////////////////////////////////

    public static final int JPOS_ESCAL_OVERWEIGHT= 1 + JposConst.JPOSERREXT; // ReadWeight
}