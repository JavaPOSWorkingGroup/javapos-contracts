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
// DeviceMonitorConst
//
//   Device Monitor constants for JavaPOS Applications.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//   New device category.
//
/////////////////////////////////////////////////////////////////////


package jpos;

public interface DeviceMonitorConst {
    //###################################################################
    //#### Device Monitor Constants
    //###################################################################

    /////////////////////////////////////////////////////////////////////
    // "addMonitoringDevice" Method, "monitoringMode" Parameter Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DMON_MMODE_UPDATE          = 1;
    public static final int DMON_MMODE_STRADDLED       = 2;
    public static final int DMON_MMODE_HIGH            = 3;
    public static final int DMON_MMODE_LOW             = 4;
    public static final int DMON_MMODE_WITHIN          = 5;
    public static final int DMON_MMODE_OUTSIDE         = 6;
    public static final int DMON_MMODE_POLLING         = 7;

    /////////////////////////////////////////////////////////////////////
    // "StatusUpdateEvent" "Status" Property Constants
    /////////////////////////////////////////////////////////////////////

    public static final int DMON_SUE_START_MONITORING  = 11;
    public static final int DMON_SUE_STOP_MONITORING   = 12;
}
