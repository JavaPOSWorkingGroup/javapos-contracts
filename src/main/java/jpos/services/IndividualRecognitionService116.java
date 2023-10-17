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
// IndividualRecognitionService116
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Individual Recognition for release 1.16.
//
//   Generated from IndividualRecognitionControl116.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public interface IndividualRecognitionService116 extends BaseService, JposServiceInstance
{
    // Capabilities
    public boolean getCapCompareFirmwareVersion() throws JposException;
    public String getCapIndividualList() throws JposException;
    public int getCapPowerReporting() throws JposException;
    public boolean getCapStatisticsReporting() throws JposException;
    public boolean getCapUpdateFirmware() throws JposException;
    public boolean getCapUpdateStatistics() throws JposException;

    // Properties
    public boolean getAutoDisable() throws JposException;
    public void setAutoDisable(boolean var1) throws JposException;
    public int getDataCount() throws JposException;
    public boolean getDataEventEnabled() throws JposException;
    public void setDataEventEnabled(boolean var1) throws JposException;
    public String getIndividualIDs() throws JposException;
    public String getIndividualRecognitionFilter() throws JposException;
    public void setIndividualRecognitionFilter(String var1) throws JposException;
    public String getIndividualRecognitionInformation() throws JposException;
    public int getPowerNotify() throws JposException;
    public void setPowerNotify(int var1) throws JposException;
    public int getPowerState() throws JposException;

    // Methods
    public void clearInput() throws JposException;
    public void clearInputProperties() throws JposException;
    public void compareFirmwareVersion(String var1, int[] var2) throws JposException;
    public void resetStatistics(String var1) throws JposException;
    public void retrieveStatistics(String[] var1) throws JposException;
    public void updateFirmware(String var1) throws JposException;
    public void updateStatistics(String var1) throws JposException;
}