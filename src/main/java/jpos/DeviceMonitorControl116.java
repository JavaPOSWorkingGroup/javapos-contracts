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
// DeviceMonitorControl116
//
// Interface definining all new capabilities, properties and methods
// that are specific to Device Monitor for release 1.16.
//
// Modification history
// ------------------------------------------------------------------
// 2023-Sep-28 JavaPOS Release 1.16                                MC
//
/////////////////////////////////////////////////////////////////////

package jpos;

import jpos.events.*;

public interface DeviceMonitorControl116 extends BaseControl
{
    // Capabilities
    public boolean getCapCompareFirmwareVersion() throws JposException;
    public int     getCapPowerReporting() throws JposException;
    public boolean getCapStatisticsReporting() throws JposException;
    public boolean getCapUpdateFirmware() throws JposException;
    public boolean getCapUpdateStatistics() throws JposException;

    // Properties    
    public boolean getAutoDisable() throws JposException;
    public void    setAutoDisable(boolean newValue) throws JposException;
    public int     getDataCount() throws JposException;
    public boolean getDataEventEnabled() throws JposException;
    public void    setDataEventEnabled(boolean newValue) throws JposException;
    public String  getDeviceData() throws JposException;
    public String  getDeviceList() throws JposException;
    public String  getMonitoringDeviceList() throws JposException;
    public int     getPowerNotify() throws JposException;
    public void    setPowerNotify(int newValue) throws JposException;
    public int     getPowerState() throws JposException;

    // Methods
    public void    clearInput() throws JposException;
    public void    clearInputProperties() throws JposException;
    public void    compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;
    public void    resetStatistics(String statisticsBuffer) throws JposException;
    public void    retrieveStatistics(String[] statisticsBuffer) throws JposException;
    public void    updateFirmware(String firmwareFileName) throws JposException;
    public void    updateStatistics(String statisticsBuffer) throws JposException;
    public void    addMonitoringDevice(String deviceID, int monitoringMode, int boundary, int subBoundary, int intervalTime) throws JposException;
    public void    clearMonitoringDevices() throws JposException;
    public void    deleteMonitoringDevice(String deviceID) throws JposException;
    public void    getDeviceValue(String deviceID, int[] pValue) throws JposException;

    // Event listener methods
    public void    addDataListener(DataListener l);
    public void    removeDataListener(DataListener l);
    public void    addDirectIOListener(DirectIOListener l);
    public void    removeDirectIOListener(DirectIOListener l);
    public void    addErrorListener(ErrorListener l);
    public void    removeErrorListener(ErrorListener l);
    public void    addStatusUpdateListener(StatusUpdateListener l);
    public void    removeStatusUpdateListener(StatusUpdateListener l);
}
